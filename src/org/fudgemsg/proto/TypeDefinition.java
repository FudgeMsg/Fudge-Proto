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

public class TypeDefinition extends Definition {

  private boolean _external;

  private FieldType _underlyingType;

  /* package */TypeDefinition(final String identifier, final CodePosition codePosition, final boolean compilationTarget) {
    super(identifier, codePosition, null, compilationTarget);
  }

  public boolean isExternal() {
    return _external;
  }

  /* package */void setExternal() {
    _external = true;
  }

  public FieldType getUnderlyingType() {
    return _underlyingType;
  }

  /* package */void setUnderlyingType(final FieldType underlyingType) {
    _underlyingType = underlyingType;
  }

  /**
   * Returns a suitable type if this surrogate type is used as a field. 
   */
  public FieldType getFieldType() {
    return new FieldType.UserType(this);
  }

}
