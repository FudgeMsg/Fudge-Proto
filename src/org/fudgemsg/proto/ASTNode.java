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

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete implementation of an AST node that can be used by the intermediate phases between parsing and code generation.
 * 
 * @author Andrew
 */
/* package */ class ASTNode implements AST {
  
  private final int _label;
  
  private final String _value;
  
  private final List<AST> _children;
  
  private final CodePosition _codePosition;
  
  /* package */ ASTNode (final int label, final String value, final List<AST> children, final CodePosition codePosition) {
    if (codePosition == null) throw new IllegalArgumentException ("codePosition cannot be null");
    _label = label;
    _value = value;
    _children = children;
    _codePosition = codePosition;
  }
  
  /* package */ ASTNode (final AST original, final int newLabel) {
    this (newLabel, original.getNodeValue (), original.getChildNodes (), original.getCodePosition ());
  }
  
  /* package */ ASTNode (final AST original, final String newValue) {
    this (original.getNodeLabel (), newValue, original.getChildNodes (), original.getCodePosition ());
  }
  
  /* package */ ASTNode (final AST original, final List<AST> newChildren) {
    this (original.getNodeLabel (), original.getNodeValue (), newChildren, original.getCodePosition ());
  }
  
  @Override
  public int getNodeLabel () {
    return _label;
  }
  
  @Override
  public String getNodeValue () {
    return _value;
  }
  
  @Override
  public List<AST> getChildNodes () {
    return (_children != null) ? new ArrayList<AST> (_children) : null;
  }
  
  @Override
  public CodePosition getCodePosition () {
    return _codePosition;
  }
  
}