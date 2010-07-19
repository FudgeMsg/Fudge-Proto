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

import java.io.IOException;
import java.util.List;

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
  
  private String resolveIdentifier(final Compiler.Context context, final String[] scope, final int scopeIgnore,
      final String id, final CodePosition codePosition) {
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

  private AST walkTypeNode(final Compiler.Context context, final AST type, final String[] scope) {
    switch (type.getNodeLabel()) {
      case ProtoLexer.ARRAY: {
        final List<AST> children = type.getChildNodes();
        final AST element = children.get(0);
        final AST newType = walkTypeNode(context, element, scope);
        if (element != newType) {
          children.set(0, newType);
          return new ASTNode(type, children);
        } else {
          return type;
        }
      }
      case ProtoLexer.IDENTIFIER:
        final String newIdentifier = resolveIdentifier(context, scope, 0, type.getNodeValue(), type.getCodePosition());
        if (!newIdentifier.equals(type.getNodeValue())) {
          return new ASTNode(type, newIdentifier);
        }
        return type;
      default:
        return type;
    }
  }
    
  private AST walkFieldNode (final Compiler.Context context, final AST node, final String[] scope) {
    final List<AST> children = node.getChildNodes ();
    final AST type = children.get (0);
    final AST newType = walkTypeNode(context, type, scope);
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
    final String newIdentifier = resolveIdentifier(context, scope, 1, identifier.getNodeValue(), node.getCodePosition());
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
      final String newIdentifier = resolveIdentifier(context, scope, 1, identifier.getNodeValue(), identifier
          .getCodePosition());
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
  
  private AST walkTypedefNode(final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String[] scope = children.get (0).getNodeValue ().split ("\\.");
    final AST primaryType = children.get(1);
    final AST newPrimaryType = walkTypeNode(context, primaryType, scope);
    if (newPrimaryType != primaryType) {
      children.set(1, newPrimaryType);
      return new ASTNode(node, children);
    } else {
      return node;
    }
  }

  private AST walkExternNode(final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes();
    final AST element = children.get(0);
    AST newElement;
    switch (element.getNodeLabel()) {
      case ProtoLexer.TYPEDEF:
        newElement = walkTypedefNode(context, element);
        break;
      default:
        throw new IllegalStateException("Invalid extern element '" + element.getNodeLabel() + "'");
    }
    if (newElement != element) {
      children.set(0, newElement);
      return new ASTNode(node, children);
    } else {
      return node;
    }
  }

  @Override
  public void walkAstNode (final Compiler.Context context, final AST node) {
    switch (node.getNodeLabel ()) {
      case ProtoLexer.ENUM:
        // no action required for enums
        context.addFixedRoot(node);
        break;
      case ProtoLexer.MESSAGE:
        context.addFixedRoot(walkMessageNode(context, node));
        break;
      case ProtoLexer.TAXONOMY:
        context.addFixedRoot(walkTaxonomyNode(context, node));
        break;
      case ProtoLexer.EXTERN:
        context.addFixedRoot(walkExternNode(context, node));
        break;
      case ProtoLexer.TYPEDEF:
        context.addFixedRoot(walkTypedefNode(context, node));
        break;
      default:
        throw new IllegalStateException("invalid root type '" + node.getNodeLabel() + "'");
    }
  }
  
}