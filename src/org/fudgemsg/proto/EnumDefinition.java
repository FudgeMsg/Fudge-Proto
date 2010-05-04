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

import java.util.Map;

/**
 * Semantic representation of an enumeration type defined within a message.
 * 
 * @author Andrew
 */
public class EnumDefinition extends StringValuePairDefinition<LiteralValue> {
  
  public static enum Type {
    DEFAULT,
    INTEGER_ENCODED,
    STRING_ENCODED;
  }
  
  private Type _type;
  
  /* package */ EnumDefinition (final String identifier, final CodePosition codePosition, final MessageDefinition outerMessage, final boolean compilationTarget) {
    super (identifier, codePosition, outerMessage, compilationTarget);
  }
  
  public Type getType () {
    if (_type == null) throw new IllegalStateException ("determineType hasn't been called");
    return _type;
  }
  
  private void addElementWithError (final Compiler.Context context, final String key, final LiteralValue value) {
    Map.Entry<String,LiteralValue> previous = findElementByValue (value);
    if (previous != null) {
      context.error (value.getCodePosition (), "Cannot assign auto-value " + value + " to " + key);
      context.warning (previous.getValue ().getCodePosition (), "Value " + value + " already assigned to " + previous.getKey ());
      return;
    }
    addElement (key, value);
  }
  
  /**
   * Evaluate the declared members and determine the type of enumeration.
   */
  /* package */ void determineType (final Compiler.Context context) {
    boolean nullPresent = false;
    boolean intPresent = false;
    boolean stringPresent = false;
    for (Map.Entry<String,LiteralValue> element : getElements ()) {
      if (element.getValue () instanceof LiteralValue.NullValue) {
        nullPresent = true;
      } else if (element.getValue () instanceof LiteralValue.IntegerValue) {
        intPresent = true;
      } else {
        if (!(element.getValue () instanceof LiteralValue.StringValue)) {
          addElement (element.getKey (), element.getValue ().assignmentTo (context, FieldType.STRING_TYPE));
        }
        stringPresent = true;
      }
    }
    if (stringPresent || intPresent) {
      if (nullPresent) {
        int nextAutoValue = 0;
        for (Map.Entry<String,LiteralValue> element : getElements ()) {
          if (element.getValue () instanceof LiteralValue.NullValue) {
            LiteralValue.NullValue value = (LiteralValue.NullValue)element.getValue ();
            // pick the next autonumber
            if (stringPresent) {
              addElementWithError (context, element.getKey (), value.inferString (Integer.toString (nextAutoValue++)));
            } else {
              addElementWithError (context, element.getKey (), value.inferInteger (nextAutoValue++));
            }
          } else if (element.getValue () instanceof LiteralValue.IntegerValue) {
            int v = ((LiteralValue.IntegerValue)element.getValue ()).getNumber ().intValue ();
            if (v >= nextAutoValue) nextAutoValue = v + 1;
            if (stringPresent) {
              // convert to string
              addElementWithError (context, element.getKey (), element.getValue ().assignmentTo (context, FieldType.STRING_TYPE));
            }
          }
        }
      }
      if (stringPresent) {
        // string encoding
        _type = Type.STRING_ENCODED;
      } else {
        // int encoding
        _type = Type.INTEGER_ENCODED;
      }
    } else {
      // default encoding
      _type = Type.DEFAULT;
    }
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