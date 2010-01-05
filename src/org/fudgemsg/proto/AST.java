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

/**
 * Representation of an abstract syntax tree for processing the parsed data. This is defined as an interface here
 * so that it can be tagged onto a tree implementation that might be supplied by a parser generator.
 * 
 * @author Andrew
 */
public interface AST {
  
  /**
   * Returns the label or tag for this AST node.
   */
  public int getNodeLabel ();
  
  /**
   * Returns the textual value of this AST node.
   */
  public String getNodeValue ();
  
  /**
   * Returns a list of child nodes, or null if there are no child nodes. The value returned is a shallow copy
   * which can be manipulated by the caller.
   */
  public List<AST> getChildNodes ();
  
  /**
   * Returns the position of the node in the original source(s).
   */
  public CodePosition getCodePosition ();
  
}