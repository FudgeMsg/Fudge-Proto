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

package org.fudgemsg.proto.csharp;

import java.io.File;
import java.io.IOException;

import org.fudgemsg.proto.CodeGeneratorUtil;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.c.CBlockCode;
import org.fudgemsg.proto.c.CLiteralCode;
import org.fudgemsg.proto.proto.DocumentedClassCode;
import org.fudgemsg.proto.proto.HeaderlessClassCode;

/**
 * Code generator for the C# Fudge implementation
 * 
 * @author Andrew
 */
/* package */ class CSharpClassCode extends HeaderlessClassCode {
  
  /* package */ static final CSharpClassCode INSTANCE = new CSharpClassCode ();
  
  private CSharpClassCode () {
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (CLiteralCode.INSTANCE)))));
  }
  
  @Override
  public File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath, definition.getIdentifierArray());
    if (implementation == null) return null;
    return new File(implementation, definition.getName() + ".cs");
  }
  
  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "TODO begin class implementation declaration");
  }
  
  @Override
  public void endClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "TODO end class implementation declaration");
  }
  
  @Override
  public void writeClassImplementationAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class implementation attribute");
  }
  
  @Override
  public void writeClassImplementationAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class implementation accessor");
  }
  
  @Override
  public void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class implementation constructor");
  }
  
  @Override
  public void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    comment (writer, "TODO enum implementation declaration");
  }

}