/* Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.fudgemsg.proto;

import java.util.List;
import java.io.IOException;

import org.fudgemsg.proto.antlr.ProtoLexer;

/**
 * Implementation of the fixup phase of compilation. This will walk an AST, expanding any references to fully qualified names
 * and requesting any external files be loaded and compiled if needed.
 * 
 * @author Andrew
 */
/* package */ class FixupExternalReferences implements ASTWalker {
  
  /* package */ static final FixupExternalReferences INSTANCE = new FixupExternalReferences ();
  
  private FixupExternalReferences () {
  }
  
  private String resolveIdentifier (final Compiler.Context context, final String[] scope, final int scopeIgnore, final String id, final AST node) {
    // Try from closest scope outwards. Note that this eventually covers the case of us being given a fully qualified identifier to start with
    // Check for something already in memory
    for (int i = scope.length - scopeIgnore; i >= 0; i--) {
      final StringBuilder sb = new StringBuilder ();
      for (int j = 0; j < i; j++) {
        sb.append (scope[j]);
        sb.append ('.');
      }
      sb.append (id);
      final String fullID = sb.toString ();
      if (context.getDefinition (fullID) != null) return fullID;
    }
    // Now check for stuff on disk (always ignoring top scope - the original source code)
    for (int i = scope.length - 1; i >= 0; i--) {
      final StringBuilder sb = new StringBuilder ();
      for (int j = 0; j < i; j++) {
        sb.append (scope[j]);
        sb.append ('.');
      }
      sb.append (id);
      final String fullID = sb.toString ();
      final CodePosition codePosition = node.getCodePosition ();
      try {
        final Source src = codePosition.getSource ().findSource (fullID);
        if (src != null) {
          context.addSource (src);
          return fullID;
        }
      } catch (IOException e) {
        context.warning (codePosition, "I/O error - " + e.getMessage ());
      }
    }
    // we haven't found anything, so we'll leave what we've got in place to error later when we come to use it
    return id;
  }
    
  private AST walkFieldNode (final Compiler.Context context, final AST node, final String[] scope) {
    final List<AST> children = node.getChildNodes ();
    final AST type = children.get (0);
    AST newType;
    switch (type.getNodeLabel ()) {
    case ProtoLexer.ARRAY :
      newType = walkFieldNode (context, type, scope);
      break;
    case ProtoLexer.IDENTIFIER :
      final String newIdentifier = resolveIdentifier (context, scope, 0, type.getNodeValue (), node);
      if (!newIdentifier.equals (type.getNodeValue ())) {
        newType = new ASTNode (type, newIdentifier);
      } else {
        newType = type;
      }
      break;
    default :
      return node;
    }
    if (newType != type) {
      children.set (0, newType);
      return new ASTNode (node, children);
    } else {
      return node;
    }
  }
  
  private AST walkTaxonomyImportNode (final Compiler.Context context, final AST node, final String[] scope) {
    final List<AST> children = node.getChildNodes ();
    final AST identifier = children.get (0);
    final String newIdentifier = resolveIdentifier (context, scope, 1, identifier.getNodeValue (), node);
    if (!newIdentifier.equals (identifier.getNodeValue ())) {
      children.set (0, new ASTNode (identifier, newIdentifier));
      return new ASTNode (node, children);
    } else {
      return node;
    }
  }
  
  private AST walkExtendsUsesNode (final Compiler.Context context, final AST node, final String[] scope) {
    final List<AST> children = node.getChildNodes ();
    boolean changed = false;
    for (int i = 0; i < children.size (); i++) {
      AST identifier = children.get (i);
      final String newIdentifier = resolveIdentifier (context, scope, 1, identifier.getNodeValue (), identifier);
      if (!newIdentifier.equals (identifier.getNodeValue ())) {
        children.set (i, new ASTNode (identifier, newIdentifier));
        changed = true;
      }
    }
    if (changed) {
      return new ASTNode (node, children);
    } else {
      return node;
    }
  }
  
  private AST walkMessageNode (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String[] scope = children.get (0).getNodeValue ().split ("\\.");
    boolean changed = false;
    for (int i = 1; i < children.size (); i++) {
      final AST element = children.get (i);
      AST newElement;
      switch (element.getNodeLabel ()) {
      case ProtoLexer.ENUM :
        // ignore enums
        continue;
      case ProtoLexer.EXTENDS :
        newElement = walkExtendsUsesNode (context, element, scope);
        break;
      case ProtoLexer.FIELD :
        newElement = walkFieldNode (context, element, scope);
        break;
      case ProtoLexer.MESSAGE :
        newElement = walkMessageNode (context, element);
        break;
      case ProtoLexer.USES :
        newElement = walkExtendsUsesNode (context, element, scope);
        break;
      default :
        throw new IllegalStateException ("invalid message element '" + node.getNodeLabel () + "'");
      }
      if (newElement != element) {
        children.set (i, newElement);
        changed = true;
      }
    }
    return changed ? new ASTNode (node, children) : node;
  }
  
  private AST walkTaxonomyNode (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String[] scope = children.get (0).getNodeValue ().split ("\\.");
    boolean changed = false;
    for (int i = 1; i < children.size (); i++) {
      final AST element = children.get (i);
      AST newElement;
      switch (element.getNodeLabel ()) {
      case ProtoLexer.IDENTIFIER :
        // ignore
        continue;
      case ProtoLexer.IMPORT :
        newElement = walkTaxonomyImportNode (context, element, scope);
        break;
      default :
        throw new IllegalStateException ("invalid taxonomy element '" + node.getNodeLabel () + "'");
      }
      if (newElement != element) {
        children.set (i, newElement);
        changed = true;
      }
    }
    return changed ? new ASTNode (node, children) : node;
  }
  
  @Override
  public void walkAstNode (final Compiler.Context context, final AST node) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.ENUM :
      // no action required for enums
      context.addFixedRoot (node);
      break;
    case ProtoLexer.MESSAGE :
      context.addFixedRoot (walkMessageNode (context, node));
      break;
    case ProtoLexer.TAXONOMY :
      context.addFixedRoot (walkTaxonomyNode (context, node));
      break;
    default :
      throw new IllegalStateException ("invalid root type '" + node.getNodeLabel () + "'"); 
    }
  }
  
}