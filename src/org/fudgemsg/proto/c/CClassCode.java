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
import java.util.Map;

import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.FieldType;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;
import org.fudgemsg.proto.EnumDefinition.Type;
import org.fudgemsg.proto.LiteralValue.IntegerValue;

/**
 * Code generator for the C Fudge implementation
 * 
 * @author Andrew
 */
/* package */ class CClassCode extends CStyleClassCode {
  
  /* package */ static final CClassCode INSTANCE = new CClassCode ();
  
  private CClassCode () {
    super (blockCodeDelegate (new CBlockCode (literalCodeDelegate (CLiteralCode.INSTANCE))), ".h", ".c");
  }
  
  @Override
  public void writeHeaderFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    super.writeHeaderFileHeader (context, targetFile, writer);
    writer.write ("#ifdef __cplusplus");
    writer.newLine ();
    writer.write ("extern \"C\" {");
    writer.newLine ();
    writer.write ("#endif /* ifdef __cplusplus */");
    writer.newLine ();
  }
  
  @Override
  public void writeHeaderFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    writer.write ("#ifdef __cplusplus");
    writer.newLine ();
    writer.write ("}");
    writer.newLine ();
    writer.write ("#endif /* ifdef __cplusplus */");
    writer.newLine ();
    super.writeHeaderFileFooter (context, targetFile, writer);
  }
  
  @Override
  public void beginClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassHeaderDeclaration (context, message, writer);
    comment (writer, "TODO begin class header declaration");
  }
  
  @Override
  public void endClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "TODO end class header declaration");
  }
  
  @Override
  public void writeClassHeaderAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class header attribute");
  }
  
  @Override
  public void writeClassHeaderAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class header accessor");
  }
  
  @Override
  public void writeClassHeaderConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "TODO class header constructor");
  }
  
  private String getEnumValueIdentifier (final EnumDefinition enumDefinition, final String value) {
    return value;
  }
  
  private String getEnumValueLiteral (final Compiler.Context context, final String name, LiteralValue value) {
    if (value instanceof LiteralValue.NullValue) {
      value = ((LiteralValue.NullValue)value).inferString (name);
    } else {
      value = value.assignmentTo (context, FieldType.STRING_TYPE);
    }
    return getLiteral (value);
  }
  
  @Override
  public void writeEnumHeaderDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    super.writeEnumHeaderDeclaration (context, enumDefinition, writer);
    writer.write ("typedef int " + getIdentifier (enumDefinition));
    endStmt (writer);
    int n = 0;
    for (Map.Entry<String,LiteralValue> entry : enumDefinition.getElements ()) {
      if (enumDefinition.getType () == Type.INTEGER_ENCODED) {
        n = (int)((IntegerValue)entry.getValue ()).get ();
      } else {
        n++;
      }
      writer.write ("#define " + getEnumValueIdentifier (enumDefinition, entry.getKey ()) + " " + n);
      writer.newLine ();
    }
    if (enumDefinition.getType () == Type.INTEGER_ENCODED) {
      writer.write ("#define " + getIdentifier (enumDefinition) + "_toFudgeEncoding(_v_) (_v_)");
      writer.newLine ();
      writer.write ("#define " + getIdentifier (enumDefinition) + "_fromFudgeEncoding(_v_) (_v_)");
      writer.newLine ();
    } else {
      writer.write ("const char *" + getIdentifier (enumDefinition) + "_toFudgeEncoding (int value)");
      endStmt (writer);
      writer.write ("int " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (const char *value)");
      endStmt (writer);
    }
  }

  @Override
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    comment (writer, "TODO taxonomy header declaration");
  }

  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration (context, message, writer);
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
    super.writeEnumImplementationDeclaration (context, enumDefinition, writer);
    if (enumDefinition.getType () == Type.INTEGER_ENCODED) return; // no conversion functions (macros)
    writer.write ("const char *" + getIdentifier (enumDefinition) + "_toFudgeEncoding (int value)");
    beginBlock (writer); // toFudgeEncoding
    writer.write ("switch (value)");
    beginBlock (writer); // switch
    for (Map.Entry<String,LiteralValue> entry : enumDefinition.getElements ()) {
      writer.write ("case " + getEnumValueIdentifier (enumDefinition, entry.getKey ()) + " : return " + getEnumValueLiteral (context, entry.getKey (), entry.getValue ()));
      endStmt (writer);
    }
    writer.write ("default : return \"\"");
    endStmt (writer);
    endBlock (writer); // switch
    endBlock (writer); // toFudgeEncoding
    writer.write ("int " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (const char *value)");
    beginBlock (writer); // fromFudgeEncoding
    writer.write ("if (!value) return -1");
    endStmt (writer);
    for (Map.Entry<String,LiteralValue> entry : enumDefinition.getElements ()) {
      writer.write ("if (!strcmp (value, " + getEnumValueLiteral (context, entry.getKey (), entry.getValue ()) + ")) return " + getEnumValueIdentifier (enumDefinition, entry.getKey ()));
      endStmt (writer);
    }
    writer.write ("return -1");
    endStmt (writer);
    endBlock (writer); // fromFudgeEncoding
  }

  @Override
  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    comment (writer, "TODO taxonomy implementation declaration");
  }

}