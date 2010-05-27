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

import org.fudgemsg.FudgeTypeDictionary;
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
    writer.write ("typedef struct _" + getIdentifier (message) + " " + getIdentifier (message));
    endStmt (writer);
    writer.write ("struct _" + getIdentifier (message));
    beginBlock (writer); // struct
    if (message.getExtends () != null) {
      writer.write (getIdentifier (message) + " fudgeParentMessage");
      endStmt (writer);
    }
    // TODO: ancestor messages as members
  }
  
  @Override
  public void endClassHeaderDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    endBlock (writer); // struct
    endStmt (writer);
    // TODO: methods to construct etc
    if (message.getNamespace () != null) {
      writer.write ("#ifdef FUDGE_NO_NAMESPACE");
      writer.newLine ();
      writer.write ("#define " + message.getName () + " " + getIdentifier (message));
      writer.newLine ();
      for (FieldDefinition field : message.getFieldDefinitions ()) {
        writer.write ("#define " + message.getName () + "_" + field.getName ());
        if (field.getOrdinal () != null) {
          writer.write ("_Ordinal " + field.getOrdinal ());
        } else {
          writer.write ("_Key \"" + field.getName () + "\"");
        }
        writer.newLine ();
      }
      writer.write ("#else /* ifndef FUDGE_NO_NAMESPACE */");
      writer.newLine ();
    }
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writer.write ("#define " + getIdentifier (message) + "_" + field.getName ());
      if (field.getOrdinal () != null) {
        writer.write ("_Ordinal " + field.getOrdinal ());
      } else {
        writer.write ("_Key \"" + field.getName () + "\"");
      }
      writer.newLine ();
    }
    if (message.getNamespace () != null) {
      writer.write ("#endif /* ifndef FUDGE_NO_NAMESPACE else */");
      writer.newLine ();
    }
  }
  
  @Override
  public void writeClassHeaderAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    writer.write (typeString (field.getType ()) + " " + field.getName ());
    endStmt (writer);
  }
  
  @Override
  public void writeClassHeaderConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    // Nothing required
  }
  
  @Override
  public void writeClassHeaderAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    // Nothing required
  }
  
  private String getEnumValueIdentifier (final EnumDefinition enumDefinition, final String value) {
    // This is so that we can go to fully qualified enum values if needed
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
    writer.write ("typedef enum _" + getIdentifier (enumDefinition) + " " + getIdentifier (enumDefinition));
    endStmt (writer);
    writer.write ("enum _" + getIdentifier (enumDefinition));
    beginBlock (writer);
    boolean first = true;
    for (Map.Entry<String,LiteralValue> entry : enumDefinition.getElements ()) {
      if (first) {
        first = false;
      } else {
        writer.write (",");
        writer.newLine ();
      }
      writer.write (getEnumValueIdentifier (enumDefinition, entry.getKey ()));
      if (enumDefinition.getType () == Type.INTEGER_ENCODED) {
        writer.write (" = " + ((IntegerValue)entry.getValue ()).get ());
      }
    }
    endBlock (writer);
    endStmt (writer);
    if (enumDefinition.getType () == Type.INTEGER_ENCODED) {
      writer.write ("#define " + getIdentifier (enumDefinition) + "_toFudgeEncoding(_v_) ((int)(_v_))");
      writer.newLine ();
      writer.write ("#define " + getIdentifier (enumDefinition) + "_fromFudgeEncoding(_v_) ((" + getIdentifier (enumDefinition) + ")(_v_))");
      writer.newLine ();
    } else {
      writer.write ("const char *" + getIdentifier (enumDefinition) + "_toFudgeEncoding (" + getIdentifier (enumDefinition) + " value)");
      endStmt (writer);
      writer.write (getIdentifier (enumDefinition) + " " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (const char *value)");
      endStmt (writer);
    }
    if (enumDefinition.getNamespace () != null) {
      writer.write ("#ifdef FUDGE_NO_NAMESPACE");
      writer.newLine ();
      writer.write ("#define " + enumDefinition.getName () + " " + getIdentifier (enumDefinition));
      writer.newLine ();
      writer.write ("#define " + enumDefinition.getName () + "_toFudgeEncoding " + getIdentifier (enumDefinition) + "_toFudgeEncoding");
      writer.newLine ();
      writer.write ("#define " + enumDefinition.getName () + "_fromFudgeEncoding " + getIdentifier (enumDefinition) + "_fromFudgeEncoding");
      writer.newLine ();
      writer.write ("#endif /* ifndef FUDGE_NO_NAMESPACE */");
      writer.newLine ();
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
    writer.write ("const char *" + getIdentifier (enumDefinition) + "_toFudgeEncoding (" + getIdentifier (enumDefinition) + " value)");
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
    writer.write (getIdentifier (enumDefinition) + " " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (const char *value)");
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

  private String messageType (final MessageDefinition message) {
    if (message == MessageDefinition.ANONYMOUS) {
      return "FudgeMsg";
    } else {
      return message.getIdentifier () + '*';
    }
  }

  private String typeString (final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType)type;
      final StringBuilder sb = new StringBuilder ();
      sb.append (typeString (array.getBaseType ()));
      sb.append ('*');
      return sb.toString ();
    } else if (type instanceof FieldType.EnumType) {
      return getIdentifier (((FieldType.EnumType)type).getEnumDefinition ());
    } else if (type instanceof FieldType.MessageType) {
      return messageType (((FieldType.MessageType)type).getMessageDefinition ());
    } else {
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID :
        // We'll handle indicators as a boolean - was it in the message or not
        return "int";
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
        return "fudge_bool";
      case FudgeTypeDictionary.BYTE_TYPE_ID :
        return "fudge_byte";
      case FudgeTypeDictionary.SHORT_TYPE_ID :
        return "fudge_i16";
      case FudgeTypeDictionary.INT_TYPE_ID :
        return "fudge_i32";
      case FudgeTypeDictionary.LONG_TYPE_ID :
        return "fudge_i64";
      case FudgeTypeDictionary.FLOAT_TYPE_ID :
        return "fudge_f32";
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        return "fudge_f64";
      case FudgeTypeDictionary.STRING_TYPE_ID :
        return "fudge_byte*";
      case FudgeTypeDictionary.DATE_TYPE_ID :
        // TODO: date?
        return "fudge_byte*";
      case FudgeTypeDictionary.DATETIME_TYPE_ID :
        // TODO: datetime?
        return "fudge_byte*";
      case FudgeTypeDictionary.TIME_TYPE_ID :
        // TODO: time?
        return "fudge_byte*";
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    }
  }
  
}