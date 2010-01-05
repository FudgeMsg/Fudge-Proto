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

/**
 * Represents an original source code position that can be associated with AST nodes or semantic representations for more meaningful error messages when errors are detected during compilation.
 * 
 * @author Andrew
 */
public class CodePosition {
  
  public static final CodePosition UNKNOWN = new CodePosition ();
  
  private final Source _source;
  private final int _line;
  private final int _column;
  private final CodePosition _included;
  
  private CodePosition () {
    _source = null;
    _line = 0;
    _column = 0;
    _included = null;
  }
  
  public CodePosition (final Source source) {
    this (source, 0);
  }
  
  public CodePosition (final Source source, final int line) {
    this (source, line, 0);
  }
  
  public CodePosition (final Source source, final int line, final int column) {
    this (source, line, column, null);
  }
  
  public CodePosition (final Source source, final int line, final int column, final CodePosition included) {
    _source = source;
    _line = line;
    _column = column;
    _included = included;
  }
  
  public Source getSource () {
    return _source;
  }
  
  public String getFile () {
    return (_source != null) ? _source.toString () : null;
  }
  
  public int getLine () {
    return _line;
  }
  
  public int getColumn () {
    return _column;
  }
  
  public boolean isIncluded () {
    return _included != null;
  }
  
  public CodePosition getIncludedFrom () {
    return _included;
  }
  
  public String toString () {
    if (_source != null) {
      StringBuilder sb = new StringBuilder ();
      sb.append (getFile ());
      if (_line > 0) {
        sb.append (':');
        sb.append (_line);
        if (_column > 0) {
          sb.append ('(');
          sb.append (_column);
          sb.append (')');
        }
      }
      return sb.toString ();
    } else {
      return "";
    }
  }
  
}