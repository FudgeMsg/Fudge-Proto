/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
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

import java.util.Iterator;

/**
 * Abstract interface for definition checking phases of compilation. Refer to the Compiler class for a description of the available phases.
 * 
 * @author Andrew
 */
/* package */ class CheckDefinitions implements DefinitionChecker {
  
  /* package */ static final CheckDefinitions INSTANCE = new CheckDefinitions ();
  
  private CheckDefinitions () {
  }

  @Override
  public void checkDefinition (final Compiler.Context context, final Definition definition) {
    if (definition instanceof EnumDefinition) {
      checkEnumDefinition (context, (EnumDefinition)definition);
    } else if (definition instanceof FieldDefinition) {
      checkFieldDefinition (context, (FieldDefinition)definition);
    } else if (definition instanceof MessageDefinition) {
      checkMessageDefinition (context, (MessageDefinition)definition);
    }
  }

  private void checkEnumDefinition (final Compiler.Context context, final EnumDefinition enumDefinition) {
    // TODO 2009-12-29 Andrew -- is there anything outstanding to check at this point ?
  }
  
  private void checkFieldDefinition (final Compiler.Context context, final FieldDefinition fieldDefinition) {
    if (!checkDefaultFieldValue (context, fieldDefinition)) return;
  }
  
  private boolean checkDefaultFieldValue (final Compiler.Context context, final FieldDefinition fieldDefinition) {
    LiteralValue literal = fieldDefinition.getDefaultValue ();
    if (literal == null) return true; // no default
    // Check the default value is compatible with the type of the field, re-casting if necessary
    literal = literal.assignmentTo (context, fieldDefinition.getType ());
    fieldDefinition.setDefaultValue (literal);
    if (literal == null) return false; // errored at the conversion stage
    // TODO 2009-12-29 Andrew -- apply any field constraints to default values at compile time
    return true;
  }
  
  private void checkMessageDefinition (final Compiler.Context context, final MessageDefinition messageDefinition) {
    final Iterator<EnumDefinition> iE = messageDefinition.getEnumDefinitions ();
    while (iE.hasNext ()) {
      checkEnumDefinition (context, iE.next ());
    }
    final Iterator<FieldDefinition> iF = messageDefinition.getFieldDefinitions ();
    while (iF.hasNext ()) {
      checkFieldDefinition (context, iF.next ());
    }
  }
  
}