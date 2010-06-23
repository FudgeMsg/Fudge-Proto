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

package org.fudgemsg.proto.c;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.fudgemsg.proto.CodeGeneratorUtil;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.FieldType;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.proto.ClassCode;
import org.fudgemsg.proto.proto.DocumentedClassCode;

/**
 * Base support for header and implementation file logics for C. This is factored here so that the C++ engine
 * can use it as well.
 * 
 * @author Andrew
 */
public abstract class CStyleClassCode extends DocumentedClassCode {
  
  private final String _headerExtension;
  
  private final String _implementationExtension;
  
  protected CStyleClassCode (final ClassCode delegate, final String headerExtension, final String implementationExtension) {
    super (delegate);
    _headerExtension = headerExtension;
    _implementationExtension = implementationExtension;
  }
  
  protected String getIdentifier (final Definition definition) {
    return definition.getIdentifier ().replace ('.', '_');
  }
  
  protected String sourceFileName (final Definition definition, final String extension) {
    return getIdentifier (definition) + extension;
  }
  
  protected File sourceFile (final Compiler.Context context, final Definition definition, final File targetPath, final String extension) throws IOException {
    if (!CodeGeneratorUtil.checkDirectory (context, targetPath)) return null;
    return new File (targetPath, sourceFileName (definition, extension));
  }
  
  @Override
  public File getHeaderFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    return sourceFile (context, definition, targetPath, _headerExtension);
  }
  
  @Override
  public File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    return sourceFile (context, definition, targetPath, _implementationExtension);
  }
  
  @Override
  public void writeHeaderFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    super.writeHeaderFileHeader (context, targetFile, writer);
    final String headerName = targetFile.getName ().replace ('.', '_').toUpperCase ();
    writer.write ("#ifndef __INC_");
    writer.write (headerName);
    writer.newLine ();
    writer.write ("#define __INC_");
    writer.write (headerName);
    writer.newLine ();
  }
  
  @Override
  public void writeHeaderFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    final String headerName = targetFile.getName ().replace ('.', '_').toUpperCase ();
    writer.write ("#endif /* ifndef __INC_");
    writer.write (headerName);
    writer.write (" */");
    writer.newLine ();
  }
  
  private void importMessageDefinition (final Set<Definition> imports, final Definition message, final IndentWriter writer) throws IOException {
    if (imports != null) {
      if (imports.contains (message)) return;
      imports.add (message);
    }
    writer.write ("#include \"");
    writer.write (sourceFileName (message, _headerExtension));
    writer.write ('\"');
    writer.newLine ();
  }
  
  private void importTypeDefinition (final FieldType type, final Set<Definition> imports, final IndentWriter writer) throws IOException {
    if (type instanceof FieldType.MessageType) {
      importMessageDefinition (imports, ((FieldType.MessageType)type).getMessageDefinition (), writer);
    } else if (type instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType)type).getEnumDefinition ();
      final MessageDefinition outerMessage = enumDefinition.getOuterMessage ();
      importMessageDefinition (imports, (outerMessage != null) ? outerMessage : enumDefinition, writer);
    } else if (type instanceof FieldType.ArrayType) {
      importTypeDefinition (((FieldType.ArrayType)type).getBaseType (), imports, writer);
    }
  }
  
  private void importMessageDefinitions (final MessageDefinition message, final IndentWriter writer) throws IOException {
    final Set<Definition> imports = new HashSet<Definition> ();
    imports.add (MessageDefinition.ANONYMOUS);
    imports.add (message);
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      final FieldType type = field.getType ();
      importTypeDefinition (type, imports, writer);
    }
    if (message.getExtends () != null) {
      importMessageDefinition (imports, message.getExtends (), writer);
    }
  }
  
  @Override
  public void beginClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    importMessageDefinitions (message, writer);
  }
  
  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration (context, message, writer);
    importMessageDefinition (null, message, writer);
  }

  @Override
  public void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    super.writeEnumImplementationDeclaration (context, enumDefinition, writer);
    final MessageDefinition outerMessage = enumDefinition.getOuterMessage ();
    importMessageDefinition (null, (outerMessage != null) ? outerMessage : enumDefinition, writer);
  }
  
}