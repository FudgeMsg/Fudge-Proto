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
import java.util.List;
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
  public void writeImplementationFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    super.writeImplementationFileHeader (context, targetFile, writer);
    writer.write ("#define FUDGE_INTERNAL");
    writer.newLine ();
    writer.write ("#include <fudge/message.h>");
    writer.newLine ();
    writer.write ("#include <malloc.h>");
    writer.newLine ();
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
        writer.write(typeString(field.getType()) + "** value, int *count");
      } else {
        writer.write(typeString(field.getType()) + "* value");
      }
      writer.write(")");
      endStmt(writer);
      writer.write("FudgeStatus " + getIdentifier(message) + "_set" + camelCaseFieldName(field) + " (FudgeMsg msg, ");
      if (field.isRepeated()) {
        writer.write(typeString(field.getType()) + "* value, int count");
      } else {
        writer.write(typeString(field.getType()) + " value");
      }
      writer.write(")");
      endStmt(writer);
      if (field.getType ().getFudgeFieldType () == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
        writer.write ("FudgeStatus " + getIdentifier (message) + "_getFudgeMsg" + camelCaseFieldName (field) + " (FudgeMsg msg, FudgeMsg *subMsg)");
        endStmt (writer);
        writer.write ("FudgeStatus " + getIdentifier (message) + "_setFudgeMsg" + camelCaseFieldName (field) + " (FudgeMsg msg, FudgeMsg subMsg)");
        endStmt (writer);
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
    writer.write ("#ifdef FUDGE_INTERNAL");
    writer.newLine ();
    writer.write("void " + getIdentifier(message) + "_freeImpl (struct _" + getIdentifier(message) + " *ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsgImpl (FudgeMsg msg, struct _"
        + getIdentifier(message) + " *ptr)");
    endStmt(writer);
    writer.write("FudgeStatus " + getIdentifier(message) + "_toFudgeMsgImpl (struct _" + getIdentifier(message)
        + " *ptr, FudgeMsg msg)");
    endStmt(writer);
    writer.write ("#endif /* ifdef FUDGE_INTERNAL */");
    writer.newLine ();
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
        writer.write("#define " + message.getName() + "_get" + camelCaseFieldName(field) + " " + getIdentifier(message) + "_get" + camelCaseFieldName(field));
        writer.newLine();
        writer.write("#define " + message.getName() + "_set" + camelCaseFieldName(field) + " " + getIdentifier(message) + "_set" + camelCaseFieldName(field));
        writer.newLine();
        if (field.getType ().getFudgeFieldType() == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
          writer.write ("#define " + message.getName () + "_getFudgeMsg" + camelCaseFieldName (field) + " " + getIdentifier (message) + "_getFudgeMsg" + camelCaseFieldName (field));
          writer.newLine ();
          writer.write ("#define " + message.getName () + "_setFudgeMsg" + camelCaseFieldName (field) + " " + getIdentifier (message) + "_setFudgeMsg" + camelCaseFieldName (field));
          writer.newLine ();
        }
      }
      writer.write("#define " + message.getName() + "_free " + getIdentifier(message) + "_free");
      writer.newLine();
      writer.write("#define " + message.getName() + "_fromFudgeMsg " + getIdentifier(message) + "_fromFudgeMsg");
      writer.newLine();
      writer.write("#define " + message.getName() + "_toFudgeMsg " + getIdentifier(message) + "_toFudgeMsg");
      writer.newLine();
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
  
  private void returnAndUnwindStmt (final IndentWriter writer, final List<String> unwind, final String returnValue) throws IOException {
    beginBlock (writer);
    if ((unwind != null) && !unwind.isEmpty ()) {
      for (String stmt : unwind) {
        writer.write (stmt);
        endStmt (writer);
      }
    }
    writer.write ("return " + returnValue);
    endStmt (writer);
    endBlock (writer);
  }
  
  private void fieldValueToString (final IndentWriter writer, final String target, final List<String> unwind) throws IOException {
    writer.write ("if (field.type != FUDGE_TYPE_STRING)");
    returnAndUnwindStmt (writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
    // TODO: proper UTF-8 decoding needs to be done
    writer.write (target + " = (char*)malloc (field.numbytes + 1)");
    endStmt (writer);
    writer.write ("if (!" + target + ")");
    returnAndUnwindStmt (writer, unwind, "FUDGE_OUT_OF_MEMORY");
    writer.write ("memcpy (" + target + ", field.data.bytes, field.numbytes)");
    endStmt (writer);
    writer.write (target + "[field.numbytes] = 0");
    endStmt (writer);
  }

  private void decodeFieldValue(final IndentWriter writer, final FieldType type, final String target, final List<String> unwind) throws IOException {
    if (type instanceof FieldType.MessageType) {
      writer.write("if (field.type != FUDGE_TYPE_FUDGE_MSG)");
      returnAndUnwindStmt (writer, unwind, "FUDGE_INVALID_TYPE_COERCION");
      writer.write("if ((status = " + getIdentifier(((FieldType.MessageType) type).getMessageDefinition()) + "_fromFudgeMsg (field.data.message, " + target + ")) != FUDGE_OK)");
      returnAndUnwindStmt (writer, unwind, "status");
    } else if (type instanceof FieldType.ArrayType) {
      comment(writer, "TODO array type");
    } else if (type instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType)type).getEnumDefinition ();
      if (enumDefinition.getType() == EnumDefinition.Type.INTEGER_ENCODED) {
        writer.write ("int i");
        endStmt (writer);
        writer.write ("if ((status = FudgeMsg_getFieldAsI32 (&field, &i)) != FUDGE_OK)");
        returnAndUnwindStmt (writer, unwind, "status");
        writer.write ("*" + target + " = " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (i)");
        endStmt (writer);
      } else {
        writer.write ("char *str");
        endStmt (writer);
        fieldValueToString (writer, "str", unwind);
        writer.write ("*" + target + " = " + getIdentifier (enumDefinition) + "_fromFudgeEncoding (str)");
        endStmt (writer);
        writer.write ("free (str)");
        endStmt (writer);
      }
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // No code needed
          break;
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsBoolean (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.BYTE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsByte (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI16 (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.INT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI32 (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.LONG_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsI64 (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF32 (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          writer.write("if ((status = FudgeMsg_getFieldAsF64 (&field, " + target + ")) != FUDGE_OK)");
          returnAndUnwindStmt (writer, unwind, "status");
          break;
        case FudgeTypeDictionary.STRING_TYPE_ID:
          fieldValueToString (writer, "*" + target, unwind);
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
    if (field.isRepeated()) {
      comment(writer, "TODO: count number of times field " + field.getName() + " occurs");
      comment(writer, "TODO: handle the zero case - default value if available, error if required");
      comment(writer, "TODO: allocate memory block");
      // TODO: build an unwind statement that will deallocate the memory block (or just call _free and don't bother with the unwind?)
      comment(writer, "TODO: decode each field to memory block");
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
        writer.write("Name (&field, msg, (fudge_byte*)" + getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Key, "
            + field.getName().length());
      }
      writer.write(")");
      if (field.getType().getFudgeFieldType() == FudgeTypeDictionary.INDICATOR_TYPE_ID) {
        writer.write(" == FUDGE_OK)");
        endStmt(writer);
      } else {
        writer.write(") == FUDGE_OK)");
        beginBlock(writer); // if
        decodeFieldValue(writer, field.getType (), "value", null);
        endBlock(writer); // if
        writer.write("else ");
        if (field.getDefaultValue() != null) {
          writer.write("*value = " + getLiteral(field.getDefaultValue()));
        } else {
          writer.write("return status");
        }
        endStmt(writer);
      }
    }
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // method
    // Sub-message accessor
    if (field.getType ().getFudgeFieldType () == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
      writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_getFudgeMsg" + camelCaseFieldName(field) + " (FudgeMsg msg, FudgeMsg *subMsg)");
      beginBlock (writer); // method
      writer.write ("FudgeStatus status");
      endStmt (writer);
      writer.write ("FudgeField field");
      endStmt (writer);
      writer.write ("if (!msg || !subMsg) return FUDGE_NULL_POINTER");
      endStmt (writer);
      writer.write ("if ((status = FudgeMsg_getFieldBy");
      if (field.getOrdinal () == null) {
        writer.write ("Name (&field, msg, (fudge_byte*)" + getIdentifier (field.getOuterMessage ()) + "_" + field.getName () + "_Key, " + field.getName ().length ());
      } else {
        writer.write ("Ordinal (&field, msg, " + getIdentifier (field.getOuterMessage ()) + "_" + field.getName () + "_Ordinal");
      }
      writer.write (")) != FUDGE_OK) return status");
      endStmt (writer);
      writer.write ("if (field.type != FUDGE_TYPE_FUDGE_MSG) return FUDGE_INVALID_TYPE_COERCION");
      endStmt (writer);
      writer.write ("return FudgeMsg_retain (*subMsg = field.data.message)");
      endStmt (writer);
      endBlock (writer); // method
    }
    // Mutator
    writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_set" + camelCaseFieldName(field) + " (FudgeMsg msg, ");
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
    writer.write("FudgeStatus status");
    endStmt(writer);
    if (field.getType() instanceof FieldType.MessageType) {
      writer.write("FudgeMsg subMsg");
      endStmt(writer);
    } else if (field.getType () instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType)field.getType ()).getEnumDefinition ();
      if (enumDefinition.getType () == EnumDefinition.Type.INTEGER_ENCODED) {
        writer.write ("int i");
      } else {
        writer.write ("const char *str");
      }
      endStmt (writer);
    }
    writer.write("if (!msg");
    if (field.isRepeated ()) {
      writer.write (" || ((count > 0) && !value)");
      if (field.isRequired ()) {
        writer.write (" || (count == 0)");
      }
    } else {
      if (field.isRequired () && isPointerType (field.getType ())) {
        writer.write(" || !value");
      }
    }
    writer.write(") return FUDGE_NULL_POINTER");
    endStmt(writer);
    // TODO: clear any previously set fields
    if (!field.isRequired ()) {
      if (field.isRepeated ()) {
        writer.write ("if (count == 0) return FUDGE_OK");
        endStmt (writer);
      } else {
        if (isPointerType (field.getType ())) {
          writer.write ("if (!value) return FUDGE_OK");
          endStmt (writer);
        }
      }
    }
    String value;
    if (field.isRepeated()) {
      writer.write("while (count-- > 0)");
      beginBlock(writer); // while
      value = "*value";
    } else {
      value = "value";
    }
    String type = null;
    if (field.getType() instanceof FieldType.MessageType) {
      writer.write("if ((status = " + getIdentifier(((FieldType.MessageType) field.getType()).getMessageDefinition())
          + "_toFudgeMsg (" + value + ", &subMsg)) != FUDGE_OK) return status");
      endStmt(writer);
      type = "Msg";
      value = "subMsg";
    } else if (field.getType() instanceof FieldType.ArrayType) {
      comment(writer, "TODO array type");
    } else if (field.getType() instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType)field.getType ()).getEnumDefinition ();
      if (enumDefinition.getType () == EnumDefinition.Type.INTEGER_ENCODED) {
        writer.write ("i = " + getIdentifier (enumDefinition) + "_toFudgeEncoding (" + value + ")");
        endStmt (writer);
        type = "I32";
        value = "i";
      } else {
        // TODO: proper UTF-8 handling
        writer.write ("str = " + getIdentifier (enumDefinition) + "_toFudgeEncoding (" + value + ")");
        endStmt (writer);
        type = "String";
        value = "(fudge_byte*)str, strlen (str)";
      }
    } else {
      switch (field.getType().getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
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
          // TODO: proper UTF-8 handling
          type = "String";
          value = "(fudge_byte*)" + value + ", strlen (" + value + ")";
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
      writer.write("if ((status = FudgeMsg_addField" + type + " (msg, ");
      if (field.getOrdinal() == null) {
        writer.write("(fudge_byte*)" + getIdentifier(field.getOuterMessage()) + "_" + field.getName() + "_Key, "
            + field.getName().length() + ", 0");
      } else {
        writer.write("0, 0, &ordinal");
      }
      if (value != null) {
        writer.write(", " + value);
      }
      writer.write(")) != FUDGE_OK) return status");
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
    // Sub-message mutator
    if (field.getType ().getFudgeFieldType () == FudgeTypeDictionary.FUDGE_MSG_TYPE_ID) {
      writer.write("FudgeStatus " + getIdentifier(field.getOuterMessage()) + "_setFudgeMsg" + camelCaseFieldName(field) + " (FudgeMsg msg, FudgeMsg subMsg)");
      beginBlock (writer); // method
      if (field.getOrdinal () != null) {
        writer.write ("fudge_i16 ordinal = " + field.getOrdinal ());
        endStmt (writer);
      }
      writer.write ("if (!msg || !subMsg) return FUDGE_NULL_POINTER");
      endStmt (writer);
      writer.write ("return FudgeMsg_addFieldMsg (msg, ");
      if (field.getOrdinal () == null) {
        writer.write ("(fudge_byte*)" + getIdentifier (field.getOuterMessage ()) + "_" + field.getName () + "_Key, " + field.getName ().length () + ", 0"); 
      } else {
        writer.write ("0, 0, &ordinal");
      }
      writer.write (", subMsg)");
      endStmt(writer);
      endBlock (writer); // method
    }
  }
    
  private boolean isPointerType (final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return true;
    } else if (type instanceof FieldType.EnumType) {
      return false;
    } else if (type instanceof FieldType.MessageType) {
      return true;
    } else {
      switch (type.getFudgeFieldType ()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
        case FudgeTypeDictionary.BYTE_TYPE_ID:
        case FudgeTypeDictionary.SHORT_TYPE_ID:
        case FudgeTypeDictionary.INT_TYPE_ID:
        case FudgeTypeDictionary.LONG_TYPE_ID:
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          return false;
        case FudgeTypeDictionary.STRING_TYPE_ID:
        case FudgeTypeDictionary.DATE_TYPE_ID:
          // TODO: date?
          return true;
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          // TODO: datetime?
          return true;
        case FudgeTypeDictionary.TIME_TYPE_ID:
          // TODO: time?
          return true;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }
  
  private void freeFieldValue (final IndentWriter writer, final FieldType type, final String value) throws IOException {
    writer.write ("if (" + value + ")");
    beginBlock (writer); // if
    if (type instanceof FieldType.ArrayType) {
      comment (writer, "TODO: free memory for " + value);
    } else if (type instanceof FieldType.EnumType) {
      // No action
    } else if (type instanceof FieldType.MessageType) {
      writer.write (getIdentifier (((FieldType.MessageType)type).getMessageDefinition()) + "_free (" + value + ")");
      endStmt (writer);
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.STRING_TYPE_ID:
          writer.write ("free (" + value + ")");
          endStmt (writer);
          break;
        case FudgeTypeDictionary.DATE_TYPE_ID:
          comment (writer, "TODO: free date type " + value);
          break;
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          comment (writer, "TODO: free datetime type " + value);
          break;
        case FudgeTypeDictionary.TIME_TYPE_ID:
          comment (writer, "TODO: free time type " + value);
          break;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
    endBlock (writer); // if
  }
  
  private void writeMessageFree (final IndentWriter writer, final MessageDefinition message) throws IOException {
    // Public free function
    writer.write("void " + getIdentifier(message) + "_free (struct _" + getIdentifier(message) + " *ptr)");
    beginBlock(writer); // free
    writer.write("if (!ptr) return");
    endStmt(writer);
    writer.write (getIdentifier (message) + "_freeImpl (ptr)");
    endStmt (writer);
    writer.write("free (ptr)");
    endStmt(writer);
    endBlock(writer); // free
    // Private free function
    writer.write("void " + getIdentifier(message) + "_freeImpl (struct _" + getIdentifier(message) + " *ptr)");
    beginBlock(writer); // free
    if (message.getExtends () != null) {
      writer.write (getIdentifier (message.getExtends ()) + "_freeImpl (&ptr->fudgeParent)");
      endStmt (writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      if (field.isRepeated ()) {
        writer.write ("if (ptr->fudgeCount" + camelCaseFieldName (field) + ")");
        beginBlock (writer); // if
        if (isPointerType (field.getType ())) {
          writer.write ("int i");
          endStmt (writer);
          writer.write ("for (i = 0; i < ptr->fudgeCount" + camelCaseFieldName (field) + "; i++)");
          beginBlock (writer); // for
          freeFieldValue (writer, field.getType (), "ptr->" + privateFieldName (field) + "[i]");
          endBlock (writer); // for
        }
        writer.write ("free (ptr->" + privateFieldName (field) + ")");
        endStmt (writer);
        endBlock (writer); // if
      } else {
        if (isPointerType (field.getType ())) {
          freeFieldValue (writer, field.getType (), "ptr->" + privateFieldName (field));
        }
      }
    }
    endBlock(writer); // free
  }
  
  private void writeMessageFromFudgeMsg (final IndentWriter writer, final MessageDefinition message) throws IOException {
    // Public fromFudgeMsg function
    writer.write("FudgeStatus " + getIdentifier(message) + "_fromFudgeMsg (FudgeMsg msg, struct _"
        + getIdentifier(message) + " **ptr)");
    beginBlock(writer); // fromFudgeMsg
    writer.write ("FudgeStatus status");
    endStmt (writer);
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
    MessageDefinition parent = message.getExtends ();
    while (parent != null) {
      writer.write ("fudgeParent.");
      parent = parent.getExtends ();
    }
    writer.write ("fudgeStructSize = sizeof (struct _" + getIdentifier (message) + ")");
    endStmt (writer);
    writer.write ("if ((status = " + getIdentifier (message) + "_fromFudgeMsgImpl (msg, *ptr)) != FUDGE_OK)");
    beginBlock (writer); // if
    writer.write (getIdentifier (message) + "_free (*ptr)");
    endStmt (writer);
    writer.write ("*ptr = 0");
    endStmt (writer);
    endBlock (writer); // if
    writer.write ("return status");
    endStmt (writer);
    endBlock (writer); // fromFudgeMsg
    // Private fromFudgeMsg function
    writer.write ("FudgeStatus " + getIdentifier (message) + "_fromFudgeMsgImpl (FudgeMsg msg, struct _" + getIdentifier (message) + " *ptr)");
    beginBlock (writer); // fromFudgeMsgImpl
    writer.write ("FudgeStatus status");
    endStmt (writer);
    if (message.getExtends () != null) {
      writer.write ("if ((status = " + getIdentifier (message.getExtends ()) + "_fromFudgeMsgImpl (msg, &ptr->fudgeParent)) != FUDGE_OK) return status");
      endStmt (writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      if (field.isRequired ()) {
        writer.write ("if ((status = ");
      }
      writer.write (getIdentifier (message) + "_get" + camelCaseFieldName (field) + " (msg, &ptr->" + privateFieldName (field));
      if (field.isRepeated ()) {
        writer.write (", &ptr->fudgeCount" + camelCaseFieldName (field));
      }
      writer.write (")");
      if (field.isRequired ()) {
        writer.write (") != FUDGE_OK) return status");
      }
      endStmt (writer);
    }
    writer.write("return FUDGE_OK");
    endStmt(writer);
    endBlock(writer); // fromFudgeMsgImpl
  }
  
  private void writeMessageToFudgeMsg (final IndentWriter writer, final MessageDefinition message) throws IOException {
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
    writer.write ("if ((status = " + getIdentifier (message) + "_toFudgeMsgImpl (ptr, *msg)) != FUDGE_OK) FudgeMsg_release (*msg)");
    endStmt (writer);
    writer.write ("return status");
    endStmt(writer);
    endBlock(writer); // toFudgeMsg
    // Private toFudgeMsg function
    writer.write ("FudgeStatus " + getIdentifier (message) + "_toFudgeMsgImpl (struct _" + getIdentifier (message) + " *ptr, FudgeMsg msg)");
    beginBlock (writer); // toFudgeMsg
    writer.write ("FudgeStatus status");
    endStmt (writer);
    writer.write ("fudge_i16 ordinal = 0");
    endStmt (writer);
    // TODO: proper UTF-8 on the class name
    writer.write ("if ((status = FudgeMsg_addFieldString (msg, 0, 0, &ordinal, (fudge_byte*)" + getIdentifier (message) + "_Class, " + message.getIdentifier ().length () + ")) != FUDGE_OK) return status");
    endStmt (writer);
    if (message.getExtends () != null) {
      writer.write ("if ((status = " + getIdentifier (message.getExtends ()) + "_toFudgeMsgImpl (&ptr->fudgeParent, msg)) != FUDGE_OK) return status");
      endStmt (writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writer.write ("if ((status = " + getIdentifier (message) + "_set" + camelCaseFieldName (field) + " (msg, ptr->" + privateFieldName (field));
      if (field.isRepeated ()) {
        writer.write (", ptr->fudgeCount" + camelCaseFieldName (field));
      } 
      writer.write (")) != FUDGE_OK) return status");
      endStmt (writer);
    }
    writer.write ("return FUDGE_OK");
    endStmt (writer);
    endBlock (writer); // toFudgeMsg
  }

  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    writeMessageFree (writer, message);
    writeMessageFromFudgeMsg (writer, message);
    writeMessageToFudgeMsg (writer, message);
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
          return "char*";
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
