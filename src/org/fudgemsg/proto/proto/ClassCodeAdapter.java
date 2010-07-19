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

public abstract class ClassCodeAdapter extends BlockCodeAdapter implements ClassCode {
  
  private final ClassCode _delegate;
  
  public static ClassCode blockCodeDelegate (final BlockCode blockCode) {
    return new ClassCodeAdapter (blockCode) {
      @Override
      public BlockCode getBlockCode () {
        return blockCode;
      }
    };
  }
  
  private ClassCodeAdapter (final BlockCode blockCode) {
    super (blockCode);
    _delegate = null;
  }
  
  protected ClassCodeAdapter (final ClassCode delegate) {
    super (delegate.getBlockCode ());
    _delegate = delegate;
  }

  @Override
  public void beginClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.beginClassHeaderDeclaration (context, message, writer);
  }
  
  @Override
  public void endClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.endClassHeaderDeclaration (context, message, writer);
  }
  
  @Override
  public void writeClassHeaderAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderAttribute (context, field, writer);
  }
  
  @Override
  public void writeClassHeaderAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderAccessor (context, field, writer);
  }
  
  @Override
  public void writeClassHeaderConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderConstructor (context, message, writer);
  }
  
  @Override
  public void writeClassHeaderEquality (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderEquality (context, message, writer);
  }
  
  @Override
  public void writeClassHeaderHash (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderHash (context, message, writer);
  }
  
  @Override
  public void writeClassHeaderString (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassHeaderString (context, message, writer);
  }
  
  @Override
  public void writeEnumHeaderDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    _delegate.writeEnumHeaderDeclaration (context, enumDefinition, writer);
  }
  
  @Override
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    _delegate.writeTaxonomyHeaderDeclaration (context, taxonomyDefinition, writer);
  }
  
  @Override
  public void writeTypedefHeaderDeclaration(final Compiler.Context context, final TypeDefinition typeDefinition,
      final IndentWriter writer) throws IOException {
    _delegate.writeTypedefHeaderDeclaration(context, typeDefinition, writer);
  }

  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.beginClassImplementationDeclaration (context, message, writer);
  }
  
  @Override
  public void endClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.endClassImplementationDeclaration (context, message, writer);
  }
  
  @Override
  public void writeClassImplementationAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationAttribute (context, field, writer);
  }
  
  @Override
  public void writeClassImplementationAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationAccessor (context, field, writer);
  }
  
  @Override
  public void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationConstructor (context, message, writer);
  }
  
  @Override
  public void writeClassImplementationEquality (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationEquality (context, message, writer);
  }
  
  @Override
  public void writeClassImplementationHash (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationHash (context, message, writer);
  }
  
  @Override
  public void writeClassImplementationString (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    _delegate.writeClassImplementationString (context, message, writer);
  }
  
  @Override
  public void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    _delegate.writeEnumImplementationDeclaration (context, enumDefinition, writer);
  }
  
  @Override
  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    _delegate.writeTaxonomyImplementationDeclaration (context, taxonomyDefinition, writer);
  }

  @Override
  public void writeTypedefImplementationDeclaration(final Compiler.Context context,
      final TypeDefinition typeDefinition, final IndentWriter writer) throws IOException {
    _delegate.writeTypedefImplementationDeclaration(context, typeDefinition, writer);
  }

  @Override
  public File getHeaderFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    return _delegate.getHeaderFile (context, definition, targetPath);
  }
  
  @Override
  public File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    return _delegate.getImplementationFile (context, definition, targetPath);
  }
  
  @Override
  public void writeHeaderFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    _delegate.writeHeaderFileHeader (context, targetFile, writer);
  }
  
  @Override
  public void writeHeaderFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    _delegate.writeHeaderFileFooter (context, targetFile, writer);
  }
  
  @Override
  public void writeImplementationFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    _delegate.writeImplementationFileHeader (context, targetFile, writer);
  }
  
  @Override
  public void writeImplementationFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    _delegate.writeImplementationFileFooter (context, targetFile, writer);
  }
  
  @Override
  public BlockCode getBlockCode () {
    return _delegate.getBlockCode ();
  }
  
}