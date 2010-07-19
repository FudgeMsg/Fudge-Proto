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
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;
import org.fudgemsg.proto.TypeDefinition;

public interface ClassCode {
  
  public void beginClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void endClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderEquality (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderHash (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassHeaderString (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeEnumHeaderDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException;
  
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException;
  
  public void writeTypedefHeaderDeclaration(final Compiler.Context context, final TypeDefinition typeDefinition,
      final IndentWriter writer) throws IOException;

  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void endClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationEquality (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationHash (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeClassImplementationString (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException;
  
  public void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException;

  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException;

  public void writeTypedefImplementationDeclaration(final Compiler.Context context,
      final TypeDefinition typeDefinition, final IndentWriter writer) throws IOException;

  public File getHeaderFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException;
  
  public File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException;
  
  public void writeHeaderFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException;
  
  public void writeHeaderFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException;
  
  public void writeImplementationFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException;
  
  public void writeImplementationFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException;
  
  public BlockCode getBlockCode ();
  
}