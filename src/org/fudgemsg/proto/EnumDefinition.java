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
 * Semantic representation of an enumeration type defined within a message.
 * 
 * @author Andrew
 */
public class EnumDefinition extends StringIntPairDefinition {
  
  private int _nextAutoValue = 0;
  
  /* package */ EnumDefinition (final String identifier, final CodePosition codePosition, final MessageDefinition outerMessage) {
    super (identifier, codePosition, outerMessage);
  }
  
  @Override
  /* package */ void addElement (final String name, final int value) {
    if (value >= _nextAutoValue) _nextAutoValue = value + 1;
    super.addElement (name, value);
  }
  
  /* package */ void addElement (final String name) {
    addElement (name, _nextAutoValue);
  }
  
  /**
   * Returns a suitable type if this enum type is used as a field. 
   */
  public FieldType getFieldType () {
    return new FieldType.EnumType (this);
  }

  public MessageDefinition getOuterMessage () {
    return (MessageDefinition) getOuterDefinition ();
  }
  
}