/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
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
/* package */class CClassCode extends CStyleClassCode {

  /* package */static final CClassCode INSTANCE = new CClassCode();

  private CClassCode() {
    super(blockCodeDelegate(new CBlockCode(literalCodeDelegate(CLiteralCode.INSTANCE))), ".h", ".c");
  }

  @Override
  public void writeHeaderFileHeader(final Compiler.Context context, final File targetFile, final IndentWriter writer)
      throws IOException {
    super.writeHeaderFileHeader(context, targetFile, writer);
    writer.write("#include <fudge/status.h>");
    writer.newLine();
    writer.write("#ifdef __cplusplus");
    writer.newLine();
    writer.write("extern \"C\" {");
    writer.newLine();
    writer.write("#endif /* ifdef __cplusplus */");
    writer.newLine();
  }

  @Override
  public void writeHeaderFileFooter(final Compiler.Context context, final File targetFile, final IndentWriter writer)
      throws IOException {
    writer.write("#ifdef __cplusplus");
    writer.newLine();
    writer.write("}");
    writer.newLine();
    writer.write("#endif /* ifdef __cplusplus */");
    writer.newLine();
    super.writeHeaderFileFooter(context, targetFile, writer);
  }

  @Override
  public void beginClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    super.beginClassHeaderDeclaration(context, message, writer);
    writer.write("typedef struct _" + getIdentifier(message) + " " + getIdentifier(message));
    endStmt(writer);
    writer.write("struct _" + getIdentifier(message));
    beginBlock(writer); // struct
    if (message.getExtends() != null) {
      writer.write("struct _" + getIdentifier(message.getExtends()) + " fudgeParent");
    } else {
      writer.write("const char *fudgeClass");
    }
    endStmt(writer);
  }

  @Override
  public void endClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    endBlock(writer); // struct
    endStmt(writer);
    // Message field accessor/mutators
    for (FieldDefinition field : message.getFieldDefinitions()) {
      writer.write("FudgeStatus " + getIdentifier(message) + "_get" + camelCaseFieldName(field) + " (FudgeMsg msg, ");
      if (field.isRepeated()) {
        writer.write(typeString(field.getType()) + "** value, int *count");
      } else {
        writer.write(typeString(field.getType()) + "* value");
      }
      writer.write(")");
      endStmt(writer);
      if (field.isMutable()) {
        writer.write("FudgeStatus " + getIdentifier(message) + "_set" + camelCaseFieldName(field) + " (FudgeMsg msg, ");
        if (field.isRepeated()) {
          writer.write(typeString(field.getType()) + "* value, int count");
        } else {
          writer.write(typeString(field.getType()) + " value");
        }
        writer.write(")");
        endStmt(writer);
      }
    }
    // Short name defines
    if (message.getNamespace() != null) {
      writer.write("#ifdef FUDGE_NO_NAMESPACE");
      writer.newLine();
      writer.write("#define " + message.getName() + " " + getIdentifier(message));
      writer.newLine();
      writer.write("#define " + message.getName() + "_Class \"" + message.getIdentifier() + "\"");
      writer.newLine();
      for (FieldDefinition field : message.getFieldDefinitions()) {
        writer.write("#define " + message.getName() + "_" + field.getName());
        if (field.getOrdinal() != null) {
          writer.write("_Ordinal " + field.getOrdinal());
        } else {
          writer.write("_Key \"" + field.getName() + "\"");
        }
        writer.newLine();
        writer.write("#define " + message.getName() + "_get" + camelCaseFieldName(field) + " "
            + getIdentifier(message) + "_get" + camelCaseFieldName(field));
        writer.newLine();
        if (field.isMutable()) {
          writer.write("#define " + message.getName() + "_set" + camelCaseFieldName(field) + " "
              + getIdentifier(message) + "_set" + camelCaseFieldName(field));
          writer.newLine();
        }
      }
      writer.write("#else /* ifndef FUDGE_NO_NAMESPACE */");
      writer.newLine();
    }
    writer.write("#define " + getIdentifier(message) + "_Class \"" + message.getIdentifier() + "\"");
    writer.newLine();
    for (FieldDefinition field : message.getFieldDefinitions()) {
      writer.write("#define " + getIdentifier(message) + "_" + field.getName());
      if (field.getOrdinal() != null) {
        writer.write("_Ordinal " + field.getOrdinal());
      } else {
        writer.write("_Key \"" + field.getName() + "\"");
      }
      writer.newLine();
    }
    if (message.getNamespace() != null) {
      writer.write("#endif /* ifndef FUDGE_NO_NAMESPACE else */");
      writer.newLine();
    }
  }

  @Override
  public void writeClassHeaderAttribute(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    if (field.isRepeated()) {
      writer.write("int fudgeCount" + camelCaseFieldName(field));
      endStmt(writer);
      writer.write(typeString(field.getType()) + "* " + privateFieldName(field));
    } else {
      writer.write(typeString(field.getType()) + " " + privateFieldName(field));
    }
    endStmt(writer);
  }

  @Override
  public void writeClassHeaderConstructor(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    // Nothing required
  }

  @Override
  public void writeClassHeaderAccessor(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    // Nothing required
  }

  private String getEnumValueIdentifier(final EnumDefinition enumDefinition, final String value) {
    // This is so that we can go to fully qualified enum values if needed
    return value;
  }

  private String getEnumValueLiteral(final Compiler.Context context, final String name, LiteralValue value) {
    if (value instanceof LiteralValue.NullValue) {
      value = ((LiteralValue.NullValue) value).inferString(name);
    } else {
      value = value.assignmentTo(context, FieldType.STRING_TYPE);
    }
    return getLiteral(value);
  }

  @Override
  public void writeEnumHeaderDeclaration(final Compiler.Context context, final EnumDefinition enumDefinition,
      final IndentWriter writer) throws IOException {
    super.writeEnumHeaderDeclaration(context, enumDefinition, writer);
    writer.write("typedef enum _" + getIdentifier(enumDefinition) + " " + getIdentifier(enumDefinition));
    endStmt(writer);
    writer.write("enum _" + getIdentifier(enumDefinition));
    beginBlock(writer);
    boolean first = true;
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      if (first) {
        first = false;
      } else {
        writer.write(",");
        writer.newLine();
      }
      writer.write(getEnumValueIdentifier(enumDefinition, entry.getKey()));
      if (enumDefinition.getType() == Type.INTEGER_ENCODED) {
        writer.write(" = " + ((IntegerValue) entry.getValue()).get());
      }
    }
    endBlock(writer);
    endStmt(writer);
    if (enumDefinition.getType() == Type.INTEGER_ENCODED) {
      writer.write("#define " + getIdentifier(enumDefinition) + "_toFudgeEncoding(_v_) ((int)(_v_))");
      writer.newLine();
      writer.write("#define " + getIdentifier(enumDefinition) + "_fromFudgeEncoding(_v_) (("
          + getIdentifier(enumDefinition) + ")(_v_))");
      writer.newLine();
    } else {
      writer.write("const char *" + getIdentifier(enumDefinition) + "_toFudgeEncoding ("
          + getIdentifier(enumDefinition) + " value)");
      endStmt(writer);
      writer.write(getIdentifier(enumDefinition) + " " + getIdentifier(enumDefinition)
          + "_fromFudgeEncoding (const char *value)");
      endStmt(writer);
    }
    if (enumDefinition.getNamespace() != null) {
      writer.write("#ifdef FUDGE_NO_NAMESPACE");
      writer.newLine();
      writer.write("#define " + enumDefinition.getName() + " " + getIdentifier(enumDefinition));
      writer.newLine();
      writer.write("#define " + enumDefinition.getName() + "_toFudgeEncoding " + getIdentifier(enumDefinition)
          + "_toFudgeEncoding");
      writer.newLine();
      writer.write("#define " + enumDefinition.getName() + "_fromFudgeEncoding " + getIdentifier(enumDefinition)
          + "_fromFudgeEncoding");
      writer.newLine();
      writer.write("#endif /* ifndef FUDGE_NO_NAMESPACE */");
      writer.newLine();
    }
  }

  @Override
  public void writeTaxonomyHeaderDeclaration(final Compiler.Context context,
      final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    comment(writer, "TODO taxonomy header declaration");
  }

  @Override
  public void beginClassImplementationDeclaration(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration(context, message, writer);
    comment(writer, "TODO begin class implementation declaration");
  }

  @Override
  public void endClassImplementationDeclaration(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    comment(writer, "TODO end class implementation declaration");
  }

  @Override
  public void writeClassImplementationAttribute(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    // Nothing required
  }

  @Override
  public void writeClassImplementationAccessor(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    // Accessor
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_get" + camelCaseFieldName(field)
        + " (FudgeMsg msg, ");
    if (field.isRepeated()) {
      writer.write(typeString(field.getType()) + "** value, int *count");
    } else {
      writer.write(typeString(field.getType()) + "* value");
    }
    writer.write(")");
    beginBlock(writer); // method
    writer.write("FudgeField field");
    endStmt(writer);
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("if (!msg || !value");
    if (field.isRepeated())
      writer.write(" || !count");
    writer.write(") return FUDGE_NULL_POINTER");
    endStmt(writer);
    if (field.getType().getFudgeFieldType() != FudgeTypeDictionary.INDICATOR_TYPE_ID) {
      writer.write("if ((status = ");
    } else {
      if (field.isRepeated()) {
        writer.write("*value = (int*)malloc (sizeof (int))");
        endStmt(writer);
        writer.write("if (!*value) return FUDGE_OUT_OF_MEMORY");
        endStmt(writer);
        writer.write("*");
      }
      writer.write("*value = (");
    }
    writer.write("FudgeMsg_getFieldBy");
    if (field.getOrdinal() != null) {
      writer.write("Ordinal (&field, msg, " + getIdentifier(field.getOuterMessage()) + "_" + field.getName()
          + "_Ordinal");
    } else {
      writer.write("Name (&field, msg, " + getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Key, "
          + field.getName().length());
    }
    writer.write(")");
    if (field.getType().getFudgeFieldType() != FudgeTypeDictionary.INDICATOR_TYPE_ID) {
      writer.write(") != FUDGE_OK)");
      if (field.getDefaultValue() != null) {
        beginBlock(writer);
        if (field.isRepeated()) {
          writer.write("*value = (" + typeString(field.getType()) + "*)malloc (sizeof (" + typeString(field.getType())
              + "))");
          endStmt(writer);
          writer.write("if (!*value) return FUDGE_OUT_OF_MEMORY");
          endStmt(writer);
          writer.write("*");
        }
        writer.write("*value = " + getLiteral(field.getDefaultValue()));
        endStmt(writer);
        writer.write("return FUDGE_OK");
        endStmt(writer);
        endBlock(writer);
      } else {
        writer.write(" return status");
        endStmt(writer);
      }
    } else {
      writer.write(" == FUDGE_OK)");
      endStmt(writer);
    }
    if (field.getType() instanceof FieldType.MessageType) {
      comment(writer, "TODO message type");
    } else if (field.getType() instanceof FieldType.ArrayType) {
      comment(writer, "TODO array type");
    } else if (field.getType() instanceof FieldType.EnumType) {
      comment(writer, "TODO enum type");
    } else {
      switch (field.getType().getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // No code needed
          break;
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsBoolean (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.BYTE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsByte (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI16 (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.INT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI32 (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.LONG_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI64 (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF32 (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF64 (&field, value)) != FUDGE_OK) return status");
          endStmt(writer);
          break;
        case FudgeTypeDictionary.STRING_TYPE_ID:
          comment(writer, "TODO string type");
          break;
        case FudgeTypeDictionary.DATE_TYPE_ID:
          comment(writer, "TODO date type");
          break;
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          comment(writer, "TODO datetime type");
          break;
        case FudgeTypeDictionary.TIME_TYPE_ID:
          comment(writer, "TODO time type");
          break;
        default:
          throw new IllegalStateException("type '" + field.getType() + "' is not an expected type (fudge field type "
              + field.getType().getFudgeFieldType() + ")");
      }
    }
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // method
    if (field.isMutable()) {
      // Mutator
      writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_set" + camelCaseFieldName(field)
          + " (FudgeMsg msg, ");
      if (field.isRepeated()) {
        writer.write(typeString(field.getType()) + "* value, int count");
      } else {
        writer.write(typeString(field.getType()) + " value");
      }
      writer.write(")");
      beginBlock(writer); // method
      if (field.getOrdinal() != null) {
        writer.write("fudge_i16 ordinal = " + getIdentifier(field.getOuterMessage()) + "_" + field.getName()
            + "_Ordinal");
        endStmt(writer);
      }
      writer.write("if (!msg");
      if (field.isRepeated())
        writer.write(" || !value");
      writer.write(") return FUDGE_NULL_POINTER");
      endStmt(writer);
      // TODO: clear any previously set fields
      final String value;
      if (field.isRepeated()) {
        writer.write("while (count-- > 0)");
        beginBlock(writer); // while
        value = "*value";
      } else {
        value = "value";
      }
      String type = null;
      if (field.getType() instanceof FieldType.MessageType) {
        comment(writer, "TODO message type");
      } else if (field.getType() instanceof FieldType.ArrayType) {
        comment(writer, "TODO array type");
      } else if (field.getType() instanceof FieldType.EnumType) {
        comment(writer, "TODO enum type");
      } else {
        switch (field.getType().getFudgeFieldType()) {
          case FudgeTypeDictionary.INDICATOR_TYPE_ID:
            type = "Indicator";
            break;
          case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
            type = "Bool";
            break;
          case FudgeTypeDictionary.BYTE_TYPE_ID:
            type = "Byte";
            break;
          case FudgeTypeDictionary.SHORT_TYPE_ID:
            type = "I16";
            break;
          case FudgeTypeDictionary.INT_TYPE_ID:
            type = "I32";
            break;
          case FudgeTypeDictionary.LONG_TYPE_ID:
            type = "I64";
            break;
          case FudgeTypeDictionary.FLOAT_TYPE_ID:
            type = "F32";
            break;
          case FudgeTypeDictionary.DOUBLE_TYPE_ID:
            type = "F64";
            break;
          case FudgeTypeDictionary.STRING_TYPE_ID:
            type = "String";
            break;
          case FudgeTypeDictionary.DATE_TYPE_ID:
            comment(writer, "TODO date type");
            break;
          case FudgeTypeDictionary.DATETIME_TYPE_ID:
            comment(writer, "TODO datetime type");
            break;
          case FudgeTypeDictionary.TIME_TYPE_ID:
            comment(writer, "TODO time type");
            break;
          default:
            throw new IllegalStateException("type '" + field.getType() + "' is not an expected type (fudge field type "
                + field.getType().getFudgeFieldType() + ")");
        }
      }
      if (type != null) {
        writer.write("FudgeMsg_addField" + type + " (msg, ");
        if (field.getOrdinal() == null) {
          writer.write(getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Key, "
              + field.getName().length() + ", 0");
        } else {
          writer.write("0, 0, &ordinal");
        }
        if (field.getType() instanceof FieldType.MessageType) {
          // TODO: message type
        } else if (field.getType() instanceof FieldType.ArrayType) {
          // TODO: array type
        } else if (field.getType() instanceof FieldType.EnumType) {
          // TODO: enum type
        } else {
          switch (field.getType().getFudgeFieldType()) {
            case FudgeTypeDictionary.INDICATOR_TYPE_ID:
              // no parameters
              break;
            case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
            case FudgeTypeDictionary.BYTE_TYPE_ID:
            case FudgeTypeDictionary.SHORT_TYPE_ID:
            case FudgeTypeDictionary.INT_TYPE_ID:
            case FudgeTypeDictionary.LONG_TYPE_ID:
            case FudgeTypeDictionary.FLOAT_TYPE_ID:
            case FudgeTypeDictionary.DOUBLE_TYPE_ID:
              writer.write(", " + value);
              break;
            case FudgeTypeDictionary.STRING_TYPE_ID:
              // TODO: string type
              break;
            case FudgeTypeDictionary.DATE_TYPE_ID:
              // TODO: date type
              break;
            case FudgeTypeDictionary.DATETIME_TYPE_ID:
              // TODO: datetime type
              break;
            case FudgeTypeDictionary.TIME_TYPE_ID:
              // TODO: time type
              break;
            default:
              throw new IllegalStateException("type '" + field.getType()
                  + "' is not an expected type (fudge field type " + field.getType().getFudgeFieldType() + ")");
          }
        }
        writer.write(")");
        endStmt(writer);
      }
      if (field.isRepeated()) {
        writer.write("value++");
        endStmt(writer);
        endBlock(writer); // while
      }
      writer.write("return FUDGE_OK");
      endStmt(writer);
      endBlock(writer); // method
    }
  }

  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    comment(writer, "TODO class implementation constructor");
  }

  @Override
  public void writeEnumImplementationDeclaration(final Compiler.Context context, final EnumDefinition enumDefinition,
      final IndentWriter writer) throws IOException {
    super.writeEnumImplementationDeclaration(context, enumDefinition, writer);
    if (enumDefinition.getType() == Type.INTEGER_ENCODED)
      return; // no conversion functions (macros)
    writer.write("#include <string.h>");
    writer.newLine();
    writer.write("const char *" + getIdentifier(enumDefinition) + "_toFudgeEncoding (" + getIdentifier(enumDefinition)
        + " value)");
    beginBlock(writer); // toFudgeEncoding
    writer.write("switch (value)");
    beginBlock(writer); // switch
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      writer.write("case " + getEnumValueIdentifier(enumDefinition, entry.getKey()) + " : return "
          + getEnumValueLiteral(context, entry.getKey(), entry.getValue()));
      endStmt(writer);
    }
    writer.write("default : return \"\"");
    endStmt(writer);
    endBlock(writer); // switch
    endBlock(writer); // toFudgeEncoding
    writer.write(getIdentifier(enumDefinition) + " " + getIdentifier(enumDefinition)
        + "_fromFudgeEncoding (const char *value)");
    beginBlock(writer); // fromFudgeEncoding
    writer.write("if (!value) return (" + getIdentifier(enumDefinition) + ")-1");
    endStmt(writer);
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      writer.write("if (!strcmp (value, " + getEnumValueLiteral(context, entry.getKey(), entry.getValue())
          + ")) return " + getEnumValueIdentifier(enumDefinition, entry.getKey()));
      endStmt(writer);
    }
    writer.write("return (" + getIdentifier(enumDefinition) + ")-1");
    endStmt(writer);
    endBlock(writer); // fromFudgeEncoding
  }

  @Override
  public void writeTaxonomyImplementationDeclaration(final Compiler.Context context,
      final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    comment(writer, "TODO taxonomy implementation declaration");
  }

  private String messageType(final MessageDefinition message) {
    if (message == MessageDefinition.ANONYMOUS) {
      return "FudgeMsg";
    } else {
      return "struct _" + getIdentifier(message) + '*';
    }
  }

  private String typeString(final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType) type;
      final StringBuilder sb = new StringBuilder();
      sb.append(typeString(array.getBaseType()));
      sb.append('*');
      return sb.toString();
    } else if (type instanceof FieldType.EnumType) {
      return "enum _" + getIdentifier(((FieldType.EnumType) type).getEnumDefinition());
    } else if (type instanceof FieldType.MessageType) {
      return messageType(((FieldType.MessageType) type).getMessageDefinition());
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // We'll handle indicators as a boolean - was it in the message or not
          return "int";
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
          return "fudge_bool";
        case FudgeTypeDictionary.BYTE_TYPE_ID:
          return "fudge_byte";
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          return "fudge_i16";
        case FudgeTypeDictionary.INT_TYPE_ID:
          return "fudge_i32";
        case FudgeTypeDictionary.LONG_TYPE_ID:
          return "fudge_i64";
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          return "fudge_f32";
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          return "fudge_f64";
        case FudgeTypeDictionary.STRING_TYPE_ID:
          return "fudge_byte*";
        case FudgeTypeDictionary.DATE_TYPE_ID:
          // TODO: date?
          return "fudge_byte*";
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          // TODO: datetime?
          return "fudge_byte*";
        case FudgeTypeDictionary.TIME_TYPE_ID:
          // TODO: time?
          return "fudge_byte*";
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

}
