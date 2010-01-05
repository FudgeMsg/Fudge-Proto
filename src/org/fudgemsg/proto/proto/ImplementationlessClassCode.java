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

import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;
import org.fudgemsg.proto.Definition;

/**
 * Partial implementation of a ClassCode with no-ops on all "implementation" functions.
 * 
 * @author Andrew
 */
public abstract class ImplementationlessClassCode extends ClassCodeAdapter {
  
  protected ImplementationlessClassCode (final ClassCode delegate) {
    super (delegate);
  }
  
  @Override
  public final void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void endClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeClassImplementationAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeClassImplementationAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    // deliberate no-op
    return null;
  }
  
  @Override
  public final void writeImplementationFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }
  
  @Override
  public final void writeImplementationFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    // deliberate no-op
  }

}