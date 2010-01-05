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
 * Semantic representation of a field within a message.
 * 
 * @author Andrew
 */
public class FieldDefinition extends Definition {
  
  private Integer _ordinal = null; // ordinal is optional - if we have a taxonomy we'll work with just ordinals where possible, otherwise we'll work with names or both if available
  
  private final FieldType _type;
  
  private LiteralValue _defaultValue = null;
  
  private boolean _flagRequired = false;
  
  private boolean _flagRepeated = false;
  
  /* package */ FieldDefinition (final String identifier, final CodePosition codePosition, final MessageDefinition outerMessage, final FieldType type) {
    super (identifier, codePosition, outerMessage);
    _ordinal = null;
    _type = type;
  }
  
  public Integer getOrdinal () {
    return _ordinal;
  }
  
  public void setOrdinal (final Integer ordinal) {
    _ordinal = ordinal;
  }
  
  public FieldType getType () {
    return _type;
  }
  
  public boolean isRequired () {
    return _flagRequired;
  }
  
  public void setRequired (final boolean required) {
    _flagRequired = required;
  }
  
  public boolean isRepeated () {
    return _flagRepeated;
  }
  
  public void setRepeated (final boolean repeated) {
    _flagRepeated = repeated;
  }
  
  public LiteralValue getDefaultValue () {
    return _defaultValue;
  }
  
  public void setDefaultValue (final LiteralValue defaultValue) {
    _defaultValue = defaultValue;
  }
  
  public MessageDefinition getOuterMessage () {
    return (MessageDefinition) getOuterDefinition ();
  }
  
}