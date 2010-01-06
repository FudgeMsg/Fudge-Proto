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

package org.fudgemsg.proto.proto;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.EnumDefinition;

/**
 * Modification of the ClassCodeGenerator to process messages "inline" within their parents.
 * 
 * @author Andrew
 */
public class InnerClassCodeGenerator extends ClassCodeGenerator {
  
  public InnerClassCodeGenerator (final ClassCode delegate) {
    super (delegate);
  }
  
  /**
   * Skips the enum declaration stage - these are handled after the ClassHeaderDeclaration instead.
   */
  @Override
  protected void writeEnumHeaderDeclarations (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  /**
   * Skips the enum declaration stage - these are handled after the ClassImplementationDeclaration instead.
   */
  @Override
  protected void writeEnumImplementationDeclarations (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }

  /**
   * Writes out any inline class headers and enums after the main declaration.
   */
  @Override
  public void beginClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassHeaderDeclaration (context, message, writer);
    super.writeEnumHeaderDeclarations (context, message, writer);
    final Iterator<MessageDefinition> messages = message.getMessageDefinitions ();
    while (messages.hasNext ()) {
      writeClassHeader (context, messages.next (), writer);
    }
  }
  
  /**
   * Writes out any inline class headers and enums after the main declaration.
   */
  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration (context, message, writer);
    super.writeEnumImplementationDeclarations (context, message, writer);
    final Iterator<MessageDefinition> messages = message.getMessageDefinitions ();
    while (messages.hasNext ()) {
      writeClassImplementation (context, messages.next (), writer);
    }
  }  
  
  @Override
  public void generateCode (final Compiler.Context context, final MessageDefinition message, final File targetPath) {
    // Any sub-message types are handled as part of the containing message
    if (message.getOuterMessage () != null) return;
    // Now use the superclass behaviour
    super.generateCode (context, message, targetPath);
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final EnumDefinition enumDefinition, final File targetPath) {
    // Any sub-message types are handled as part of the containing message
    if (enumDefinition.getOuterMessage () != null) return;
    // Now use the superclass behaviour
    super.generateCode (context, enumDefinition, targetPath);
  }
  
}