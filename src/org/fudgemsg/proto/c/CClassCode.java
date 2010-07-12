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
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.fudgemsg.FudgeTypeDictionary;
import org.fudgemsg.UTF8;
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
    writer.write("#include <fudge/message.h>");
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
  public void writeImplementationFileHeader(final Compiler.Context context, final File targetFile,
      final IndentWriter writer) throws IOException {
    super.writeImplementationFileHeader(context, targetFile, writer);
    writer.write("#define FUDGE_INTERNAL 1");
    writer.newLine();
    writer.write("#include <malloc.h>");
    writer.newLine();
    writer.write("#include <string.h>");
    writer.newLine();
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
      writer.write("int fudgeStructSize");
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
        writer.write(typeString(field.getType(), false) + "** value, int *repeatCount");
      } else {
        writer.write(typeString(field.getType(), false) + "* value");
      }
      writer.write(")");
      endStmt(writer);
      writer.write("FudgeStatus " + getIdentifier(message) + "_set" + camelCaseFieldName(field) + " (FudgeMsg msg, ");
      if (field.isRepeated()) {
        writer.write(typeString(field.getType(), false) + "* value, int repeatCount");
      } else {
        writer.write(typeString(field.getType(), true) + " value");
      }
      writer.write(")");
      endStmt(writer);
      if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
        writer.write("FudgeStatus " + getIdentifier(message) + "_getFudgeMsg" + camelCaseFieldName(field)
            + " (FudgeMsg msg, FudgeMsg *subMsg)");
        endStmt(writer);
        writer.write("FudgeStatus " + getIdentifier(message) + "_setFudgeMsg" + camelCaseFieldName(field)
            + " (FudgeMsg msg, FudgeMsg subMsg)");
        endStmt(writer);
      }
    }
    // Message struct operators
    writer.write("void " + getIdentifier(message) + "_free (struct _" + getIdentifier(message) + " *ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsg (FudgeMsg msg, struct _"
        + getIdentifier(message) + " **ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_toFudgeMsg (struct _" + getIdentifier(message)
        + " *ptr, FudgeMsg *msg)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_addClass (FudgeMsg msg)");
    endStmt(writer);
    writer.write("fudge_bool " + getIdentifier(message) + "_isClass (FudgeMsg msg)");
    endStmt(writer);
    writer.write("#ifdef FUDGE_INTERNAL");
    writer.newLine();
    writer.write("void " + getIdentifier(message) + "_freeImpl (struct _" + getIdentifier(message) + " *ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsgImpl (FudgeMsg msg, struct _"
        + getIdentifier(message) + " *ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_toFudgeMsgImpl (struct _" + getIdentifier(message)
        + " *ptr, FudgeMsg msg)");
    endStmt(writer);
    writer.write("#endif /* ifdef FUDGE_INTERNAL */");
    writer.newLine();
    // Short name defines
    if (message.getNamespace() != null) {
      writer.write("#ifdef FUDGE_NO_NAMESPACE");
      writer.newLine();
      writer.write("#define " + message.getName() + " " + getIdentifier(message));
      writer.newLine();
      writer.write("#define " + message.getName() + "_Class TEXT(\"" + message.getIdentifier() + "\")");
      writer.newLine();
      for (FieldDefinition field : message.getFieldDefinitions()) {
        writer.write("#define " + message.getName() + "_" + field.getName());
        if (field.getOrdinal() != null) {
          writer.write("_Ordinal " + field.getOrdinal());
        } else {
          writer.write("_Key TEXT(\"" + field.getName() + "\")");
        }
        writer.newLine();
        writer.write("#define " + message.getName() + "_get" + camelCaseFieldName(field) + " " + getIdentifier(message)
            + "_get" + camelCaseFieldName(field));
        writer.newLine();
        writer.write("#define " + message.getName() + "_set" + camelCaseFieldName(field) + " " + getIdentifier(message)
            + "_set" + camelCaseFieldName(field));
        writer.newLine();
        if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
          writer.write("#define " + message.getName() + "_getFudgeMsg" + camelCaseFieldName(field) + " "
              + getIdentifier(message) + "_getFudgeMsg" + camelCaseFieldName(field));
          writer.newLine();
          writer.write("#define " + message.getName() + "_setFudgeMsg" + camelCaseFieldName(field) + " "
              + getIdentifier(message) + "_setFudgeMsg" + camelCaseFieldName(field));
          writer.newLine();
        }
      }
      writer.write("#define " + message.getName() + "_free " + getIdentifier(message) + "_free");
      writer.newLine();
      writer.write("#define " + message.getName() + "_fromFudgeMsg " + getIdentifier(message) + "_fromFudgeMsg");
      writer.newLine();
      writer.write("#define " + message.getName() + "_toFudgeMsg " + getIdentifier(message) + "_toFudgeMsg");
      writer.newLine();
      writer.write("#define " + message.getName() + "_addClass " + getIdentifier(message) + "_addClass");
      writer.newLine();
      writer.write("#define " + message.getName() + "_isClass " + getIdentifier(message) + "_isClass");
      writer.newLine();
      writer.write("#else /* ifndef FUDGE_NO_NAMESPACE */");
      writer.newLine();
    }
    writer.write("#define " + getIdentifier(message) + "_Class TEXT(\"" + message.getIdentifier() + "\")");
    writer.newLine();
    for (FieldDefinition field : message.getFieldDefinitions()) {
      writer.write("#define " + getIdentifier(message) + "_" + field.getName());
      if (field.getOrdinal() != null) {
        writer.write("_Ordinal " + field.getOrdinal());
      } else {
        writer.write("_Key TEXT(\"" + field.getName() + "\")");
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
      writer.write(typeString(field.getType(), false) + "* " + privateFieldName(field));
    } else {
      writer.write(typeString(field.getType(), true));
      if (!field.isRequired() && !isPointerType(field.getType()))
        writer.write("*");
      writer.write(" " + privateFieldName(field));
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
      writer.write("FudgeString " + getIdentifier(enumDefinition) + "_toFudgeEncoding ("
          + getIdentifier(enumDefinition) + " value)");
      endStmt(writer);
      writer.write(getIdentifier(enumDefinition) + " " + getIdentifier(enumDefinition)
          + "_fromFudgeEncoding (FudgeString value)");
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
    // nothing required
  }

  @Override
  public void endClassImplementationDeclaration(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    // nothing required
  }

  @Override
  public void writeClassImplementationAttribute(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    // Nothing required
  }

  private void unwindStmts(final IndentWriter writer, final Stack<String> unwind) throws IOException {
    for (String stmt : unwind) {
      writer.write(stmt);
      endStmt(writer);
    }
  }

  private void returnAndUnwindStmt(final IndentWriter writer, final Stack<String> unwind, final String returnValue)
      throws IOException {
    if (!unwind.isEmpty()) {
      beginBlock(writer);
      unwindStmts(writer, unwind);
    }
    writer.write("return " + returnValue);
    endStmt(writer);
    if (!unwind.isEmpty())
      endBlock(writer);
  }

  private void fieldValueToString(final IndentWriter writer, final String source, final String target,
      final Stack<String> unwind, final boolean allowNull, final String varLength) throws IOException {
    if (allowNull) {
      // If we're allowing nulls, we're in an array and the memory is already zero'd out
      writer.write("if (" + source + ".type != FUDGE_TYPE_INDICATOR)");
      beginBlock(writer);
    }
    writer.write("if (" + source + ".type != FUDGE_TYPE_STRING)");
    returnAndUnwindStmt(writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
    writer.write(target + " = (TCHAR*)malloc (((" + varLength + " = FudgeString_getLength (" + source
        + ".data.string)) + 1) * sizeof (TCHAR))");
    endStmt(writer);
    writer.write("if (!" + target + ")");
    returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
    writer.write("FudgeString_copyTo (" + target + ", " + varLength + " * sizeof (TCHAR), " + source + ".data.string)");
    endStmt(writer);
    writer.write("(" + target + ")[" + varLength + "] = 0");
    endStmt(writer);
    if (allowNull) {
      endBlock(writer);
    }
  }

  private void decodeArrayValue(final IndentWriter writer, final String source, final String target,
      final String fudgeType, final String cType, final Stack<String> unwind) throws IOException {
    writer.write("if (((" + source + ".type != " + fudgeType + ") && (status = FUDGE_INVALID_TYPE_COERCION)) || (!(*"
        + target + " = (" + cType + "*)malloc (" + source + ".numbytes + sizeof (" + cType
        + "))) && (status = FUDGE_OUT_OF_MEMORY)))");
    returnAndUnwindStmt(writer, unwind, "status");
    writer.write("memcpy (*" + target + ", " + source + ".data.bytes, " + source + ".numbytes)");
    endStmt(writer);
    writer.write("(*" + target + ")[" + source + ".numbytes / sizeof (" + cType + ")] = 0");
    endStmt(writer);
  }

  private void decodeFieldValue(final IndentWriter writer, final FieldType type, final String source,
      final String target, final Stack<String> unwind, final boolean allowNull) throws IOException {
    if (type instanceof FieldType.MessageType) {
      writer.write("if (((" + source
          + ".type != FUDGE_TYPE_FUDGE_MSG) && (status = FUDGE_INVALID_TYPE_COERCION)) || ((status = ");
      if (type instanceof FieldType.AnonMessageType) {
        writer.write("FudgeMsg_retain (*" + target + " = " + source + ".data.message");
      } else {
        writer.write(getIdentifier(((FieldType.MessageType) type).getMessageDefinition()) + "_fromFudgeMsg (" + source
            + ".data.message, " + target);
      }
      writer.write(")) != FUDGE_OK))");
      returnAndUnwindStmt(writer, unwind, "status");
    } else if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType arrayType = (FieldType.ArrayType) type;
      switch (arrayType.getFudgeFieldType()) {
        case FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_4", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_8", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_16", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_20", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_32", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_64", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_128", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_256", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_BYTE_ARRAY_512", "fudge_byte", unwind);
          break;
        case FudgeTypeDictionary.INT_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_INT_ARRAY", "fudge_i32", unwind);
          break;
        case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_LONG_ARRAY", "fudge_i64", unwind);
          break;
        case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_SHORT_ARRAY", "fudge_i16", unwind);
          break;
        case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_FLOAT_ARRAY", "fudge_f32", unwind);
          break;
        case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID:
          decodeArrayValue(writer, source, target, "FUDGE_TYPE_DOUBLE_ARRAY", "fudge_f64", unwind);
          break;
        case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID:
          final String cType = typeString(arrayType.getBaseType(), false);
          final String varI = "i" + unwind.size();
          final String varN = "n" + unwind.size();
          final String varFields = "fields" + unwind.size();
          writer.write("int " + varI + ", " + varN);
          endStmt(writer);
          writer.write("if (" + source + ".type != FUDGE_TYPE_FUDGE_MSG)");
          returnAndUnwindStmt(writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
          writer.write(varN + " = FudgeMsg_numFields (" + source + ".data.message)");
          endStmt(writer);
          writer.write("if (" + varN + " > 0)");
          beginBlock(writer); // if
          writer.write("FudgeField *" + varFields);
          endStmt(writer);
          writer.write("if ((" + varFields + " = (FudgeField*)malloc (sizeof (FudgeField) * " + varN + ")) == 0)");
          returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
          unwind.push("free (" + varFields + ")");
          writer.write("if (FudgeMsg_getFields (" + varFields + ", " + varN + ", " + source + ".data.message) <= 0)");
          returnAndUnwindStmt(writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
          writer.write("if ((*" + target + " = (" + cType + "*)malloc (sizeof (" + cType + ") * (" + varN
              + " + 1))) == 0)");
          returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
          writer.write("memset (*" + target + ", 0, sizeof (" + cType + ") * (" + varN + " + 1))");
          endStmt(writer);
          if (unwind.size() == 1) {
            final StringBuilder sb = new StringBuilder();
            if (isPointerType(arrayType.getBaseType())) {
              sb.append("do ");
              sb.append(getFreeFieldValueStmt(arrayType.getBaseType(), "*(*" + target + " + " + varI + ")", false, 0));
              if (sb.charAt(sb.length() - 1) != '}') {
                sb.append(';');
              }
              sb.append(" while (--" + varI + " >= 0); ");
            }
            sb.append("free (*" + target + ")");
            unwind.push(sb.toString());
          }
          writer.write("for (" + varI + " = 0; " + varI + " < " + varN + "; " + varI + "++)");
          beginBlock(writer); // for
          decodeFieldValue(writer, arrayType.getBaseType(), varFields + "[" + varI + "]", "(*" + target + " + " + varI
              + ")", unwind, true);
          endBlock(writer); // for
          if (unwind.size() == 2) {
            unwind.pop(); // memory allocation release
          }
          writer.write(unwind.pop());
          endStmt(writer);
          endBlock(writer); // if
          writer.write("else");
          beginBlock(writer); // else
          writer.write("if ((*" + target + " = (" + cType + "*)malloc (sizeof (" + cType + "))) == 0)");
          returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
          writer.write("memset (*" + target + ", 0, sizeof (" + cType + "))");
          endStmt(writer);
          endBlock(writer); // else
          break;
        default:
          throw new IllegalStateException("Type " + arrayType + " is not expected type");
      }
    } else if (type instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType) type).getEnumDefinition();
      if (enumDefinition.getType() == EnumDefinition.Type.INTEGER_ENCODED) {
        final String varI = "i" + unwind.size();
        writer.write("int " + varI);
        endStmt(writer);
        writer.write("if ((status = FudgeMsg_getFieldAsI32 (&" + source + ", &" + varI + ")) != FUDGE_OK)");
        returnAndUnwindStmt(writer, unwind, "status");
        writer.write("*" + target + " = " + getIdentifier(enumDefinition) + "_fromFudgeEncoding (" + varI + ")");
        endStmt(writer);
      } else {
        writer.write("if (" + source + ".type == FUDGE_TYPE_STRING) *" + target + " = " + getIdentifier(enumDefinition)
            + "_fromFudgeEncoding (" + source + ".data.string)");
        endStmt(writer);
        if (allowNull) {
          writer.write("if (" + source + ".type == FUDGE_TYPE_INDICATOR) *" + target + " = 0");
          endStmt(writer);
        }
        writer.write("else ");
        returnAndUnwindStmt(writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
      }
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // No code needed
          break;
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsBoolean (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.BYTE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsByte (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI16 (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.INT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI32 (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.LONG_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI64 (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF32 (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF64 (&" + source + ", " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          break;
        case FudgeTypeDictionary.STRING_TYPE_ID:
          final String varLen = "len" + unwind.size();
          writer.write("int " + varLen);
          endStmt(writer);
          fieldValueToString(writer, source, "*" + target, unwind, allowNull, varLen);
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
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

  private void writeIfFieldMatches(final IndentWriter writer, final FieldDefinition field, final String fieldRef)
      throws IOException {
    if (field.getOrdinal() != null) {
      writer.write("if ((" + fieldRef + ".flags & FUDGE_FIELD_HAS_ORDINAL) && (" + fieldRef + ".ordinal == "
          + getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Ordinal))");
    } else {
      writer.write("if (0 /* TODO: test field name */)");
    }
  }

  private void writeAccessor(final IndentWriter writer, final FieldDefinition field) throws IOException {
    // Accessor
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_get" + camelCaseFieldName(field)
        + " (FudgeMsg msg, ");
    if (field.isRepeated()) {
      writer.write(typeString(field.getType(), false) + "** value, int *repeatCount");
    } else {
      writer.write(typeString(field.getType(), false) + "* value");
    }
    writer.write(")");
    beginBlock(writer); // method
    if (field.isRepeated()) {
      writer.write("int numFields");
    } else {
      writer.write("FudgeField field");
    }
    endStmt(writer);
    writer.write("FudgeStatus status");
    endStmt(writer);
    if (field.getOrdinal() == null) {
      writer.write("FudgeString fieldName");
      endStmt(writer);
    }
    writer.write("if (!msg || !value");
    if (field.isRepeated())
      writer.write(" || !repeatCount");
    writer.write(") return FUDGE_NULL_POINTER");
    endStmt(writer);
    final Stack<String> unwind = new Stack<String>();
    if (field.getOrdinal() == null) {
      writer.write("if ((status = FudgeString_createFrom (&fieldName, " + getIdentifier(field.getOuterMessage()) + "_"
          + field.getName() + "_Key, " + field.getName().length() + " * sizeof (TCHAR))) != FUDGE_OK) return status");
      endStmt(writer);
      unwind.push("FudgeString_release (fieldName)");
    }
    if (field.isRepeated()) {
      writer.write("if ((numFields = FudgeMsg_numFields (msg)) > 0)");
      beginBlock(writer); // if total > 0
      writer.write("FudgeField *fields = (FudgeField*)malloc (sizeof (FudgeField) * numFields)");
      endStmt(writer);
      writer.write("int i, j");
      endStmt(writer);
      writer.write("if (!fields)");
      returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
      unwind.push("free (fields)");
      writer.write("if (FudgeMsg_getFields (fields, numFields, msg) <= 0)");
      returnAndUnwindStmt(writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
      writer.write("j = 0");
      endStmt(writer);
      writer.write("for (i = 0; i < numFields; i++)");
      beginBlock(writer); // for
      writeIfFieldMatches(writer, field, "fields[i]");
      writer.write("j++");
      endStmt(writer);
      endBlock(writer); // for
      writer.write("if (j > 0)");
      beginBlock(writer); // if count > 0
      writer.write("if (!(*value = (" + typeString(field.getType(), false) + "*)malloc (sizeof ("
          + typeString(field.getType(), false) + ") * j)))");
      returnAndUnwindStmt(writer, unwind, "FUDGE_OUT_OF_MEMORY");
      writer.write("memset (*value, 0, sizeof (" + typeString(field.getType(), false) + ") * j)");
      endStmt(writer);
      writer.write("j = 0");
      endStmt(writer);
      final StringBuilder sb = new StringBuilder();
      if (isPointerType(field.getType())) {
        sb.append("do ");
        sb.append(getFreeFieldValueStmt(field.getType(), "*(*value + j)", false, 0));
        if (sb.charAt(sb.length() - 1) != '}') {
          sb.append(';');
        }
        sb.append(" while (--j >= 0); ");
      }
      sb.append("free (*value)");
      unwind.push(sb.toString());
      writer.write("for (i = 0; i < numFields; i++)");
      beginBlock(writer); // for
      writeIfFieldMatches(writer, field, "fields[i]");
      beginBlock(writer); // if
      decodeFieldValue(writer, field.getType(), "fields[i]", "(*value + j)", unwind, false);
      writer.write("j++");
      endStmt(writer);
      endBlock(writer); // if
      assert (unwind.size() <= 3); // it should be 2 or 3
      endBlock(writer); // for
      writer.write("*repeatCount = j");
      endStmt(writer);
      unwind.pop(); // free (*value)
      unwind.pop(); // free (fields)
      writer.write("free (fields)");
      endStmt(writer);
      writer.write("return FUDGE_OK");
      endStmt(writer);
      endBlock(writer); // if count > 0
      writer.write("free (fields)");
      endStmt(writer);
      endBlock(writer); // if total > 0
      if (field.getDefaultValue() != null) {
        comment(writer, "TODO: load default value");
      } else {
        writer.write("*repeatCount = 0");
        endStmt(writer);
        writer.write("*value = 0");
        endStmt(writer);
      }
    } else {
      if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.INDICATOR_TYPE_ID) {
        writer.write("*value = (");
      } else {
        writer.write("if ((status = ");
      }
      writer.write("FudgeMsg_getFieldBy");
      if (field.getOrdinal() != null) {
        writer.write("Ordinal (&field, msg, " + getIdentifier(field.getOuterMessage()) + "_" + field.getName()
            + "_Ordinal");
      } else {
        writer.write("Name (&field, msg, fieldName");
      }
      writer.write(")");
      if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.INDICATOR_TYPE_ID) {
        writer.write(" == FUDGE_OK)");
        endStmt(writer);
      } else {
        writer.write(") == FUDGE_OK)");
        beginBlock(writer); // if
        decodeFieldValue(writer, field.getType(), "field", "value", unwind, false);
        assert (unwind.size() <= 1);
        endBlock(writer); // if
        writer.write("else ");
        if (field.getDefaultValue() != null) {
          writer.write("*value = " + getLiteral(field.getDefaultValue()));
          endStmt(writer);
        } else {
          returnAndUnwindStmt(writer, unwind, "status");
        }
      }
    }
    unwindStmts(writer, unwind);
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // method
    unwind.clear();
  }

  private void writeSubMessageAccessor(final IndentWriter writer, final FieldDefinition field) throws IOException {
    final Stack<String> unwind = new Stack<String>();
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_getFudgeMsg" + camelCaseFieldName(field)
        + " (FudgeMsg msg, FudgeMsg *subMsg)");
    beginBlock(writer); // method
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("FudgeField field");
    endStmt(writer);
    if (field.getOrdinal() == null) {
      writer.write("FudgeString fieldName");
      endStmt(writer);
    }
    writer.write("if (!msg || !subMsg) return FUDGE_NULL_POINTER");
    endStmt(writer);
    if (field.getOrdinal() == null) {
      writer.write("if ((status = FudgeString_createFrom (&fieldName, " + getIdentifier(field.getOuterMessage()) + "_"
          + field.getName() + "_Key, " + field.getName().length() + " * sizeof (TCHAR))) != FUDGE_OK) return status");
      endStmt(writer);
      unwind.push("FudgeString_release (fieldName)");
    }
    writer.write("if (((status = FudgeMsg_getFieldBy");
    if (field.getOrdinal() == null) {
      writer.write("Name (&field, msg, fieldName");
    } else {
      writer.write("Ordinal (&field, msg, " + getIdentifier(field.getOuterMessage()) + "_" + field.getName()
          + "_Ordinal");
    }
    writer
        .write(")) != FUDGE_OK) || ((field.type != FUDGE_TYPE_FUDGE_MSG) && (status = FUDGE_INVALID_TYPE_COERCION)))");
    returnAndUnwindStmt(writer, unwind, "status");
    unwindStmts(writer, unwind);
    writer.write("return FudgeMsg_retain (*subMsg = field.data.message)");
    endStmt(writer);
    endBlock(writer); // method
    unwind.clear();
  }

  private String safeIndex(final String value, final String index) {
    if (value.charAt(0) == '*') {
      return "(" + value + ")[" + index + "]";
    } else {
      return value + "[" + index + "]";
    }
  }

  // TODO: note the array logic is nicely flawed, relying on nulls or zeros to terminate them which is not good in the general case

  private String withArrayLength(final IndentWriter writer, final String array, final int arrayDepth)
      throws IOException {
    writer.write("n" + arrayDepth + " = 0");
    endStmt(writer);
    writer.write("while (" + safeIndex(array, "n" + arrayDepth) + ") n" + arrayDepth + "++");
    endStmt(writer);
    return array + ", n" + arrayDepth;
  }

  private String isNullCheck (final String value, final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return value; // pointer
    } else if (type instanceof FieldType.EnumType) {
      return value; // enum scalar
    } else if (type instanceof FieldType.MessageType) {
      return value; // pointer
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
        case FudgeTypeDictionary.BYTE_TYPE_ID:
        case FudgeTypeDictionary.SHORT_TYPE_ID:
        case FudgeTypeDictionary.INT_TYPE_ID:
        case FudgeTypeDictionary.LONG_TYPE_ID:
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          return value; // scalar
        case FudgeTypeDictionary.STRING_TYPE_ID:
          return value; // pointer
        case FudgeTypeDictionary.DATE_TYPE_ID:
          return value + ".year"; // no year 0; -1 = 1BC, 1 = 1AD
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          return value + ".date.year"; // no year 0; -1 = 1BC, 1 = 1AD
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return value + ".precision"; // precision 0 not valid on a time alone
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

  private void encodeFieldValue(final IndentWriter writer, final String msg, final String nameOrdinal, String value,
      final FieldType fieldType, final Stack<String> unwind, final int arrayDepth) throws IOException {
    String type = null;
    int mark = unwind.size();
    if (fieldType instanceof FieldType.AnonMessageType) {
      type = "Msg";
    } else if (fieldType instanceof FieldType.MessageType) {
      writer.write("if ((status = " + getIdentifier(((FieldType.MessageType) fieldType).getMessageDefinition())
          + "_toFudgeMsg (" + value + ", &subMsg)) != FUDGE_OK)");
      returnAndUnwindStmt(writer, unwind, "status");
      unwind.push("FudgeMsg_release (subMsg)");
      type = "Msg";
      value = "subMsg";
    } else if (fieldType instanceof FieldType.ArrayType) {
      switch (fieldType.getFudgeFieldType()) {
        case FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID:
          type = "4ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID:
          type = "8ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID:
          type = "16ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID:
          type = "20ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID:
          type = "32ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID:
          type = "64ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID:
          type = "128ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID:
          type = "256ByteArray";
          break;
        case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID:
          type = "512ByteArray";
          break;
        case FudgeTypeDictionary.INT_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "I32Array";
          break;
        case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "I64Array";
          break;
        case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "I16Array";
          break;
        case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "F32Array";
          break;
        case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID:
          value = withArrayLength(writer, value, arrayDepth);
          type = "F64Array";
          break;
        case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID:
          writer.write("if ((status = FudgeMsg_create (&arrMsg" + arrayDepth + ")) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          unwind.push("FudgeMsg_release (arrMsg" + arrayDepth + ")");
          writer.write("for (n" + arrayDepth + " = 0; "
              + isNullCheck(safeIndex(value, "n" + arrayDepth), ((FieldType.ArrayType) fieldType).getBaseType())
              + "; n" + arrayDepth
              + "++)");
          beginBlock(writer); // for
          encodeFieldValue(writer, "arrMsg" + arrayDepth, "0, 0", safeIndex(value, "n" + arrayDepth),
              ((FieldType.ArrayType) fieldType).getBaseType(), unwind, arrayDepth + 1);
          endBlock(writer); // for
          type = "Msg";
          value = "arrMsg" + arrayDepth;
          break;
        default:
          throw new IllegalStateException("Type " + fieldType + " is not expected type");
      }
    } else if (fieldType instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType) fieldType).getEnumDefinition();
      value = getIdentifier(enumDefinition) + "_toFudgeEncoding (" + value + ")";
      if (enumDefinition.getType() == EnumDefinition.Type.INTEGER_ENCODED) {
        type = "I32";
      } else {
        type = "String";
      }
    } else {
      switch (fieldType.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          writer.write("if (value) ");
          type = "Indicator";
          value = null;
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
          writer.write("if ((status = FudgeString_createFrom (&str, " + value + ", FUDGE_STRING_LENGTH (" + value
              + ") * sizeof (TCHAR))) != FUDGE_OK)");
          returnAndUnwindStmt(writer, unwind, "status");
          unwind.push("FudgeString_release (str)");
          type = "String";
          value = "str";
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
          throw new IllegalStateException("type '" + fieldType + "' is not an expected type (fudge field type "
              + fieldType.getFudgeFieldType() + ")");
      }
    }
    if (type != null) {
      writer.write("status = FudgeMsg_addField" + type + " (" + msg + ", " + nameOrdinal);
      if (value != null) {
        writer.write(", " + value);
      }
      writer.write(")");
      endStmt(writer);
    }
    while (unwind.size() > mark) {
      writer.write(unwind.pop());
      endStmt(writer);
    }
    if (type != null) {
      writer.write("if (status != FUDGE_OK)");
      returnAndUnwindStmt(writer, unwind, "status");
    }
  }

  private void writeLocalMutatorVariables(final IndentWriter writer, final FieldType type, final int count)
      throws IOException {
    if (type instanceof FieldType.ArrayType) {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID:
          // No additional variables needed
          break;
        case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID:
          writer.write("FudgeMsg arrMsg" + count);
          endStmt(writer);
          writer.write("int n" + count);
          endStmt(writer);
          writeLocalMutatorVariables(writer, ((FieldType.ArrayType) type).getBaseType(), count + 1);
          break;
        default:
          writer.write("int n" + count);
          endStmt(writer);
          break;
      }
    } else if (type instanceof FieldType.MessageType) {
      if (!(type instanceof FieldType.AnonMessageType)) {
        writer.write("FudgeMsg subMsg");
        endStmt(writer);
      }
    } else if (!(type instanceof FieldType.EnumType)
        && (type.getFudgeFieldType() == FudgeTypeDictionary.STRING_TYPE_ID)) {
      writer.write("FudgeString str");
      endStmt(writer);
    }
  }

  private void writeMutator(final IndentWriter writer, final FieldDefinition field) throws IOException {
    final Stack<String> unwind = new Stack<String>();
    final FieldType type = field.getType();
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_set" + camelCaseFieldName(field)
        + " (FudgeMsg msg, ");
    if (field.isRepeated()) {
      writer.write(typeString(type, false) + "* value, int repeatCount");
    } else {
      writer.write(typeString(type, true) + " value");
    }
    writer.write(")");
    beginBlock(writer); // method
    if (field.getOrdinal() != null) {
      writer
          .write("fudge_i16 ordinal = " + getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Ordinal");
    } else {
      writer.write("FudgeString fieldName");
    }
    endStmt(writer);
    writer.write("FudgeStatus status");
    endStmt(writer);
    writeLocalMutatorVariables(writer, type, 0);
    writer.write("if (!msg");
    if (field.isRepeated()) {
      writer.write(" || ((repeatCount > 0) && !value)");
      if (field.isRequired()) {
        writer.write(" || (repeatCount == 0)");
      }
    } else {
      if (field.isRequired() && isPointerType(type)) {
        writer.write(" || !value");
      }
    }
    writer.write(") return FUDGE_NULL_POINTER");
    endStmt(writer);
    // TODO: clear any previously set fields
    if (!field.isRequired()) {
      if (field.isRepeated()) {
        writer.write("if (repeatCount == 0) return FUDGE_OK");
        endStmt(writer);
      } else {
        if (isPointerType(type)) {
          writer.write("if (!value) return FUDGE_OK");
          endStmt(writer);
        }
      }
    }
    if (field.getOrdinal() == null) {
      writer.write("if ((status = FudgeString_createFrom (&fieldName, " + getIdentifier(field.getOuterMessage()) + "_"
          + field.getName() + "_Key, " + field.getName().length() + " * sizeof (TCHAR))) != FUDGE_OK) return status");
      endStmt(writer);
      unwind.push("FudgeString_release (fieldName)");
    }
    String value;
    if (field.isRepeated()) {
      writer.write("while (repeatCount-- > 0)");
      beginBlock(writer); // while
      value = "*value";
    } else {
      value = "value";
    }
    encodeFieldValue(writer, "msg", field.getOrdinal() != null ? "0, &ordinal" : "fieldName, 0", value, type, unwind, 0);
    if (field.isRepeated()) {
      writer.write("value++");
      endStmt(writer);
      endBlock(writer); // while
    }
    unwindStmts(writer, unwind);
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // method
    unwind.clear();
  }

  private void writeSubMessageMutator(final IndentWriter writer, final FieldDefinition field) throws IOException {
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_setFudgeMsg" + camelCaseFieldName(field)
        + " (FudgeMsg msg, FudgeMsg subMsg)");
    beginBlock(writer); // method
    if (field.getOrdinal() != null) {
      writer.write("fudge_i16 ordinal = " + field.getOrdinal());
    } else {
      writer.write("FudgeString fieldName");
    }
    endStmt(writer);
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("if (!msg || !subMsg) return FUDGE_NULL_POINTER");
    endStmt(writer);
    if (field.getOrdinal() == null) {
      writer.write("if ((status = FudgeString_createFrom (&fieldName, " + getIdentifier(field.getOuterMessage()) + "_"
          + field.getName() + "_Key, " + field.getName().length() + " * sizeof (TCHAR))) != FUDGE_OK) return status");
      endStmt(writer);
    }
    writer.write("status = FudgeMsg_addFieldMsg (msg, ");
    if (field.getOrdinal() == null) {
      writer.write("fieldName, 0");
    } else {
      writer.write("0, &ordinal");
    }
    writer.write(", subMsg)");
    endStmt(writer);
    if (field.getOrdinal() == null) {
      writer.write("FudgeString_release (fieldName)");
      endStmt(writer);
    }
    writer.write("return status");
    endStmt(writer);
    endBlock(writer); // method
  }

  @Override
  public void writeClassImplementationAccessor(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    writeAccessor(writer, field);
    if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
      writeSubMessageAccessor(writer, field);
    }
    writeMutator(writer, field);
    if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
      writeSubMessageMutator(writer, field);
    }
  }

  private boolean isPointerType(final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return true;
    } else if (type instanceof FieldType.EnumType) {
      return false;
    } else if (type instanceof FieldType.MessageType) {
      return true;
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
        case FudgeTypeDictionary.BYTE_TYPE_ID:
        case FudgeTypeDictionary.SHORT_TYPE_ID:
        case FudgeTypeDictionary.INT_TYPE_ID:
        case FudgeTypeDictionary.LONG_TYPE_ID:
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
        case FudgeTypeDictionary.DATE_TYPE_ID:
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return false;
        case FudgeTypeDictionary.STRING_TYPE_ID:
          return true;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

  private String getFreeFieldValueStmt(final FieldType type, final String value, final boolean constantStringPointer,
      final int depthCount) {
    final StringBuilder sb = new StringBuilder();
    sb.append("if (").append(value).append(") ");
    if (type instanceof FieldType.ArrayType) {
      final FieldType elementType = ((FieldType.ArrayType) type).getBaseType();
      if (isPointerType(elementType)) {
        final String varF = "f" + depthCount;
        final String valueElement = safeIndex(value, varF);
        sb.append("{ int ").append(varF).append("; for (").append(varF).append(" = 0; ").append(
            isNullCheck(valueElement, elementType)).append("; ").append(varF).append("++) ").append(
            getFreeFieldValueStmt(elementType, valueElement, constantStringPointer, depthCount + 1)).append("; ");
      }
      sb.append("free (").append(value).append(")");
      if (isPointerType(elementType)) {
        sb.append("; }");
      }
    } else if (type instanceof FieldType.AnonMessageType) {
      sb.append("FudgeMsg_release (").append(value).append(")");
    } else if (type instanceof FieldType.MessageType) {
      sb.append(getIdentifier(((FieldType.MessageType) type).getMessageDefinition())).append("_free (").append(value)
          .append(")");
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.STRING_TYPE_ID:
          sb.append("free (");
          if (constantStringPointer) {
            sb.append("(TCHAR*)");
          }
          sb.append(value).append(")");
          break;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
    return sb.toString();
  }

  private void writeMessageFree(final IndentWriter writer, final MessageDefinition message) throws IOException {
    // Public free function
    writer.write("void " + getIdentifier(message) + "_free (struct _" + getIdentifier(message) + " *ptr)");
    beginBlock(writer); // free
    writer.write("if (!ptr) return");
    endStmt(writer);
    writer.write(getIdentifier(message) + "_freeImpl (ptr)");
    endStmt(writer);
    writer.write("free (ptr)");
    endStmt(writer);
    endBlock(writer); // free
    // Private free function
    writer.write("void " + getIdentifier(message) + "_freeImpl (struct _" + getIdentifier(message) + " *ptr)");
    beginBlock(writer); // free
    if (message.getExtends() != null) {
      writer.write(getIdentifier(message.getExtends()) + "_freeImpl (&ptr->fudgeParent)");
      endStmt(writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.isRepeated()) {
        writer.write("if (ptr->fudgeCount" + camelCaseFieldName(field) + ")");
        beginBlock(writer); // if
        if (isPointerType(field.getType())) {
          writer.write("int i");
          endStmt(writer);
          writer.write("for (i = 0; i < ptr->fudgeCount" + camelCaseFieldName(field) + "; i++)");
          beginBlock(writer); // for
          writer.write(getFreeFieldValueStmt(field.getType(), "ptr->" + privateFieldName(field) + "[i]", false, 0));
          endStmt(writer);
          endBlock(writer); // for
        }
        writer.write("free (ptr->" + privateFieldName(field) + ")");
        endStmt(writer);
        endBlock(writer); // if
      } else if (isPointerType(field.getType())) {
        writer.write(getFreeFieldValueStmt(field.getType(), "ptr->" + privateFieldName(field), true, 0));
        endStmt(writer);
      } else if (!field.isRequired()) {
        writer.write("if (ptr->" + privateFieldName(field) + ") free (ptr->" + privateFieldName(field) + ")");
        endStmt(writer);
      }
    }
    endBlock(writer); // free
  }

  private void writeMessageFromFudgeMsg(final IndentWriter writer, final MessageDefinition message) throws IOException {
    // Public fromFudgeMsg function
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsg (FudgeMsg msg, struct _"
        + getIdentifier(message) + " **ptr)");
    beginBlock(writer); // fromFudgeMsg
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("if (!msg || !ptr) return FUDGE_NULL_POINTER");
    endStmt(writer);
    writer.write("*ptr = (struct _" + getIdentifier(message) + "*)malloc (sizeof (struct _" + getIdentifier(message)
        + "))");
    endStmt(writer);
    writer.write("if (!*ptr) return FUDGE_OUT_OF_MEMORY");
    endStmt(writer);
    writer.write("memset (*ptr, 0, sizeof (struct _" + getIdentifier(message) + "))");
    endStmt(writer);
    writer.write("(*ptr)->");
    MessageDefinition parent = message.getExtends();
    while (parent != null) {
      writer.write("fudgeParent.");
      parent = parent.getExtends();
    }
    writer.write("fudgeStructSize = sizeof (struct _" + getIdentifier(message) + ")");
    endStmt(writer);
    writer.write("if ((status = " + getIdentifier(message) + "_fromFudgeMsgImpl (msg, *ptr)) != FUDGE_OK)");
    beginBlock(writer); // if
    writer.write(getIdentifier(message) + "_free (*ptr)");
    endStmt(writer);
    writer.write("*ptr = 0");
    endStmt(writer);
    endBlock(writer); // if
    writer.write("return status");
    endStmt(writer);
    endBlock(writer); // fromFudgeMsg
    // Private fromFudgeMsg function
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsgImpl (FudgeMsg msg, struct _"
        + getIdentifier(message) + " *ptr)");
    beginBlock(writer); // fromFudgeMsgImpl
    boolean needsStatus = (message.getExtends() != null);
    final Map<FieldType, String> typesDeclared = new HashMap<FieldType, String>();
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.isRequired()) {
        needsStatus = true;
      } else {
        if (!field.isRepeated() && !isPointerType(field.getType())) {
          if (!typesDeclared.containsKey(field.getType())) {
            final String name = "val" + typesDeclared.size();
            typesDeclared.put(field.getType(), name);
            writer.write(typeString(field.getType(), false) + " " + name);
            endStmt(writer);
            needsStatus = true;
          }
        }
      }
    }
    if (needsStatus) {
      writer.write("FudgeStatus status");
      endStmt(writer);
    }
    if (message.getExtends() != null) {
      writer.write("if ((status = " + getIdentifier(message.getExtends())
          + "_fromFudgeMsgImpl (msg, &ptr->fudgeParent)) != FUDGE_OK) return status");
      endStmt(writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.isRepeated() || field.isRequired() || isPointerType(field.getType())) {
        if (field.isRequired()) {
          writer.write("if ((status = ");
        }
        writer.write(getIdentifier(message) + "_get" + camelCaseFieldName(field) + " (msg, ");
        if (!field.isRepeated() && !(field.getType() instanceof FieldType.EnumType)
            && (field.getType().getFudgeFieldType() == FudgeTypeDictionary.STRING_TYPE_ID)) {
          writer.write("(TCHAR**)");
        }
        writer.write("&ptr->" + privateFieldName(field));
        if (field.isRepeated()) {
          writer.write(", &ptr->fudgeCount" + camelCaseFieldName(field));
        }
        writer.write(")");
        if (field.isRequired()) {
          writer.write(") != FUDGE_OK) return status");
        }
        endStmt(writer);
      } else {
        final String tmp = typesDeclared.get(field.getType());
        writer.write("if ((status = " + getIdentifier(message) + "_get" + camelCaseFieldName(field) + " (msg, &" + tmp
            + ")) == FUDGE_OK)");
        beginBlock(writer);
        writer.write("if (!(ptr->" + privateFieldName(field) + " = (" + typeString(field.getType(), false)
            + "*)malloc (sizeof (" + typeString(field.getType(), false) + ")))) return FUDGE_OUT_OF_MEMORY");
        endStmt(writer);
        writer.write("*ptr->" + privateFieldName(field) + " = " + tmp);
        endStmt(writer);
        endBlock(writer);
      }
    }
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // fromFudgeMsgImpl
  }

  private void writeMessageIsClass(final IndentWriter writer, final MessageDefinition message) throws IOException {
    // public isClass function - tests if the message contains this class name
    writer.write("fudge_bool " + getIdentifier(message) + "_isClass (FudgeMsg msg)");
    beginBlock(writer); // isClass
    writer.write("FudgeString className");
    endStmt(writer);
    writer.write("FudgeField *fields");
    endStmt(writer);
    writer.write("int i, n");
    endStmt(writer);
    writer.write("fudge_bool result = FUDGE_FALSE");
    endStmt(writer);
    writer
        .write("if (((n = FudgeMsg_numFields (msg)) > 0) && ((fields = (FudgeField*)malloc (sizeof (FudgeField) * n)) != NULL))");
    beginBlock(writer); // malloc-if
    writer.write("if (FudgeString_createFrom (&className, " + getIdentifier(message) + "_Class, "
        + message.getIdentifier().length() + " * sizeof (TCHAR)) == FUDGE_OK)");
    beginBlock(writer); // createFrom-if
    writer.write("if (FudgeMsg_getFields (fields, n, msg) > 0)");
    beginBlock(writer); // getFields-if
    writer.write("for (i = 0; i < n; i++)");
    beginBlock(writer); // for
    writer
        .write("if ((fields[i].flags & FUDGE_FIELD_HAS_ORDINAL) && (fields[i].ordinal == 0) && (fields[i].type == FUDGE_TYPE_STRING) && !FudgeString_compare (className, fields[i].data.string))");
    beginBlock(writer); // if
    writer.write("result = FUDGE_TRUE");
    endStmt(writer);
    writer.write("break");
    endStmt(writer);
    endBlock(writer); // if
    endBlock(writer); // for
    endBlock(writer); // getFields-if
    writer.write("FudgeString_release (className)");
    endStmt(writer);
    endBlock(writer); // createFrom-if
    writer.write("free (fields)");
    endStmt(writer);
    endBlock(writer); // malloc-if
    writer.write("return result");
    endStmt(writer);
    endBlock(writer); // isClass
  }

  private void writeMessageToFudgeMsg(final IndentWriter writer, final MessageDefinition message) throws IOException {
    // Public toFudgeMsg function
    writer.write("FudgeStatus " + getIdentifier(message) + "_toFudgeMsg (struct _" + getIdentifier(message)
        + " *ptr, FudgeMsg *msg)");
    beginBlock(writer); // toFudgeMsg
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("if (!ptr || !msg) return FUDGE_NULL_POINTER");
    endStmt(writer);
    writer.write("if ((status = FudgeMsg_create (msg)) != FUDGE_OK) return status");
    endStmt(writer);
    writer.write("if ((status = " + getIdentifier(message)
        + "_toFudgeMsgImpl (ptr, *msg)) != FUDGE_OK) FudgeMsg_release (*msg)");
    endStmt(writer);
    writer.write("return status");
    endStmt(writer);
    endBlock(writer); // toFudgeMsg
    // Private toFudgeMsg function
    writer.write("FudgeStatus " + getIdentifier(message) + "_toFudgeMsgImpl (struct _" + getIdentifier(message)
        + " *ptr, FudgeMsg msg)");
    beginBlock(writer); // toFudgeMsg
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("if ((status = " + getIdentifier(message) + "_addClass (msg)) != FUDGE_OK) return status");
    endStmt(writer);
    if (message.getExtends() != null) {
      writer.write("if ((status = " + getIdentifier(message.getExtends())
          + "_toFudgeMsgImpl (&ptr->fudgeParent, msg)) != FUDGE_OK) return status");
      endStmt(writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      writer.write("if (");
      if (!field.isRequired()) {
        writer.write("ptr->" + privateFieldName(field) + " && ");
      }
      writer.write("(status = " + getIdentifier(message) + "_set" + camelCaseFieldName(field) + " (msg, ");
      if (!field.isRepeated() && !field.isRequired() && !isPointerType(field.getType()))
        writer.write("*");
      writer.write("ptr->" + privateFieldName(field));
      if (field.isRepeated()) {
        writer.write(", ptr->fudgeCount" + camelCaseFieldName(field));
      }
      writer.write(")) != FUDGE_OK) return status");
      endStmt(writer);
    }
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // toFudgeMsg
  }

  private void writeMessageAddClass(final IndentWriter writer, final MessageDefinition message) throws IOException {
    writer.write("FudgeStatus " + getIdentifier(message) + "_addClass (FudgeMsg msg)");
    beginBlock(writer); // addClass
    writer.write("FudgeStatus status");
    endStmt(writer);
    writer.write("fudge_i16 ordinal = 0");
    endStmt(writer);
    writer.write("FudgeString className");
    endStmt(writer);
    writer.write("if ((status = FudgeString_createFrom (&className, " + getIdentifier(message) + "_Class, "
        + message.getIdentifier().length() + " * sizeof (TCHAR))) != FUDGE_OK) return status");
    endStmt(writer);
    writer.write("status = FudgeMsg_addFieldString (msg, 0, &ordinal, className)");
    endStmt(writer);
    writer.write("FudgeString_release (className)");
    endStmt(writer);
    writer.write("return status");
    endStmt(writer);
    endBlock(writer); // addClass
  }

  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    writeMessageFree(writer, message);
    writeMessageFromFudgeMsg(writer, message);
    writeMessageIsClass(writer, message);
    writeMessageToFudgeMsg(writer, message);
    writeMessageAddClass(writer, message);
  }

  @Override
  public void writeEnumImplementationDeclaration(final Compiler.Context context, final EnumDefinition enumDefinition,
      final IndentWriter writer) throws IOException {
    super.writeEnumImplementationDeclaration(context, enumDefinition, writer);
    if (enumDefinition.getType() == Type.INTEGER_ENCODED)
      return; // no conversion functions (macros)
    // String constants
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      LiteralValue value = entry.getValue();
      if (value instanceof LiteralValue.NullValue) {
        value = ((LiteralValue.NullValue) value).inferString(entry.getKey());
      } else {
        value = value.assignmentTo(context, FieldType.STRING_TYPE);
      }
      final byte[] utf8 = UTF8.encode(((LiteralValue.StringValue) value).get());
      writer.write("static FudgeStringStatic _" + getIdentifier(enumDefinition) + "_" + entry.getKey() + " = { 0, \"");
      for (int i = 0; i < utf8.length; i++) {
        if (utf8[i] < 0) {
          writer.write("\\" + Integer.toOctalString(256 + utf8[i]));
        } else if (utf8[i] < 8) {
          writer.write("\\00" + Integer.toOctalString(256 + utf8[i]));
        } else if (utf8[i] < 32) {
          writer.write("\\0" + Integer.toOctalString(256 + utf8[i]));
        } else {
          writer.write((char) utf8[i]);
        }
      }
      writer.write("\", " + utf8.length + " }");
      endStmt(writer);
    }
    writer.write("FudgeString " + getIdentifier(enumDefinition) + "_toFudgeEncoding (" + getIdentifier(enumDefinition)
        + " value)");
    beginBlock(writer); // toFudgeEncoding
    writer.write("switch (value)");
    beginBlock(writer); // switch
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      writer.write("case " + getEnumValueIdentifier(enumDefinition, entry.getKey())
          + " : return FudgeString_fromStatic (&_" + getIdentifier(enumDefinition) + "_" + entry.getKey() + ")");
      endStmt(writer);
    }
    writer.write("default : return 0");
    endStmt(writer);
    endBlock(writer); // switch
    endBlock(writer); // toFudgeEncoding
    writer.write(getIdentifier(enumDefinition) + " " + getIdentifier(enumDefinition)
        + "_fromFudgeEncoding (FudgeString value)");
    beginBlock(writer); // fromFudgeEncoding
    writer.write("if (!value) return (" + getIdentifier(enumDefinition) + ")-1");
    endStmt(writer);
    for (Map.Entry<String, LiteralValue> entry : enumDefinition.getElements()) {
      writer.write("if (!FudgeString_compare (FudgeString_fromStatic (&_" + getIdentifier(enumDefinition) + "_"
          + entry.getKey() + "), value)) return " + getEnumValueIdentifier(enumDefinition, entry.getKey()));
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

  private String typeString(final FieldType type, final boolean stringConstantPointer) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType) type;
      final StringBuilder sb = new StringBuilder();
      sb.append(typeString(array.getBaseType(), false));
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
          return (stringConstantPointer ? "const " : "") + "TCHAR*";
        case FudgeTypeDictionary.DATE_TYPE_ID:
          return "FudgeDate";
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          return "FudgeDateTime";
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return "FudgeTime";
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

}
