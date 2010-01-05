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

package org.fudgemsg.proto.antlr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.fudgemsg.proto.AST;
import org.fudgemsg.proto.CodePosition;

/**
 * Custom tree implementation that includes the local AST interface.
 */
/* package */ class ProtoTree extends CommonTree implements AST {
  
  private CodePosition _codePosition = null;
  
  public ProtoTree () {
    super ();
  }
  
  public ProtoTree (final CommonTree tree) {
    super (tree);
  }
  
  public ProtoTree (final Token token) {
    super (token);
  }
  
  @Override
  public Tree dupNode () {
    return new ProtoTree (this);
  }
  
  @Override
  public int getNodeLabel () {
    return getType ();
  }
  
  @Override
  public String getNodeValue () {
    return toString ();
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public List<AST> getChildNodes () {
    final List children = getChildren ();
    if (children == null) return null;
    final List<AST> retval = new ArrayList<AST> (children.size ());
    final Iterator i = children.iterator ();
    while (i.hasNext ()) {
      retval.add ((AST)i.next ());
    }
    return retval;
  }
  
  @SuppressWarnings("unchecked")
  @Override
  public CodePosition getCodePosition () {
    if (_codePosition == null) {
      CodePosition cp = null;
      if ((token != null) && (token instanceof ProtoToken)) {
        cp = ((ProtoToken)token).getCodePosition ();
      }
      if (cp == null) {
        final List children = getChildren ();
        if (children != null) {
          final Iterator i = children.iterator ();
          while (i.hasNext ()) {
            cp = ((ProtoTree)i.next ()).getCodePosition ();
            if (cp != null) break;
          }
        }
      }
      if (cp != null) {
        _codePosition = cp;
      } else {
        _codePosition = CodePosition.UNKNOWN;
      }
    }
    return _codePosition;
  }
  
}