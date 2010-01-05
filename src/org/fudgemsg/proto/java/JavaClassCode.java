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

package org.fudgemsg.proto.java;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.fudgemsg.FudgeTypeDictionary;
import org.fudgemsg.proto.CodeGeneratorUtil;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.FieldType;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;
import org.fudgemsg.proto.c.CBlockCode;
import org.fudgemsg.proto.proto.DocumentedClassCode;
import org.fudgemsg.proto.proto.HeaderlessClassCode;

/**
 * Code generator for the Java Fudge implementation
 * 
 * @author Andrew
 */
/* package */ class JavaClassCode extends HeaderlessClassCode {
  
  /* package */ static final JavaClassCode INSTANCE = new JavaClassCode ();
  
  private static final String CLASS_FUDGEMSG = org.fudgemsg.FudgeMsg.class.getName ();
  private static final String CLASS_MAPFUDGETAXONOMY = org.fudgemsg.taxon.MapFudgeTaxonomy.class.getName ();
  private static final String CLASS_ARRAYLIST = java.util.ArrayList.class.getName ();
  private static final String CLASS_FUDGECONTEXT = org.fudgemsg.FudgeContext.class.getName ();
  private static final String CLASS_FUDGETAXONOMY = org.fudgemsg.taxon.FudgeTaxonomy.class.getName ();
  private static final String CLASS_LIST = java.util.List.class.getName ();
  private static final String CLASS_FUDGEFIELD = org.fudgemsg.FudgeField.class.getName ();
  private static final String CLASS_BYTEARRAYFIELDTYPE = org.fudgemsg.types.ByteArrayFieldType.class.getName ();
  
  private static final String TYPE_INDICATOR = org.fudgemsg.types.IndicatorFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_BOOLEAN = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".BOOLEAN_TYPE";
  private static final String TYPE_BYTE = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".BYTE_TYPE";
  private static final String TYPE_SHORT = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".SHORT_TYPE";
  private static final String TYPE_INT = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".INT_TYPE";
  private static final String TYPE_LONG = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".LONG_TYPE";
  private static final String TYPE_FLOAT = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".FLOAT_TYPE";
  private static final String TYPE_DOUBLE = org.fudgemsg.types.PrimitiveFieldTypes.class.getName () + ".DOUBLE_TYPE";
  private static final String TYPE_STRING = org.fudgemsg.types.StringFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_SUBMESSAGE = org.fudgemsg.types.FudgeMsgFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_DOUBLEARRAY = org.fudgemsg.types.DoubleArrayFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_FLOATARRAY = org.fudgemsg.types.FloatArrayFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_INTARRAY = org.fudgemsg.types.IntArrayFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_LONGARRAY = org.fudgemsg.types.LongArrayFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_SHORTARRAY = org.fudgemsg.types.ShortArrayFieldType.class.getName () + ".INSTANCE";
  private static final String TYPE_BYTEARRAY = CLASS_BYTEARRAYFIELDTYPE + ".VARIABLE_SIZED_INSTANCE";
  private static final String TYPE_BYTEARRAY4 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_4_INSTANCE";
  private static final String TYPE_BYTEARRAY8 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_8_INSTANCE";
  private static final String TYPE_BYTEARRAY16 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_16_INSTANCE";
  private static final String TYPE_BYTEARRAY20 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_20_INSTANCE";
  private static final String TYPE_BYTEARRAY32 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_32_INSTANCE";
  private static final String TYPE_BYTEARRAY64 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_64_INSTANCE";
  private static final String TYPE_BYTEARRAY128 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_128_INSTANCE";
  private static final String TYPE_BYTEARRAY256 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_256_INSTANCE";
  private static final String TYPE_BYTEARRAY512 = CLASS_BYTEARRAYFIELDTYPE + ".LENGTH_512_INSTANCE";

  private static final String VALUE_INDICATOR = org.fudgemsg.types.IndicatorType.class.getName () + ".INSTANCE";

  private JavaClassCode () {
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (JavaLiteralCode.INSTANCE)))));
  }
  
  private JavaWriter beginClass (JavaWriter writer, final Definition definition) throws IOException {
    if (definition.getOuterDefinition () == null) {
      final String namespace = definition.getNamespace ();
      if (namespace != null) {
        writer.packageDef (namespace);
        endStmt (writer);
      }
    }
    writer.classDef (definition.getOuterDefinition () != null, definition.getName (), (definition instanceof TaxonomyDefinition) ? CLASS_MAPFUDGETAXONOMY : null);
    return beginBlock (writer); // class definition
  }

  @Override
  public void beginClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message, IndentWriter iWriter) throws IOException {
    super.beginClassImplementationDeclaration (context, message, iWriter);
    beginClass (new JavaWriter (iWriter), message);
  }

  @Override
  public void endClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message, IndentWriter writer) throws IOException {
    endBlock (writer); // class definition
  }

  @Override
  public File getImplementationFile(final Compiler.Context context, Definition definition, File targetPath) throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath, definition.getIdentifierArray());
    if (implementation == null) return null;
    return new File(implementation, definition.getName() + ".java");
  }
  
  private String accessorName (final FieldDefinition field, final String suffix) {
    final StringBuilder sb = new StringBuilder ("get");
    sb.append (camelCaseFieldName (field));
    if (suffix != null) sb.append (suffix);
    return sb.toString ();
  }
  
  @Override
  public void writeClassImplementationAccessor(final Compiler.Context context, final FieldDefinition field, final IndentWriter iWriter) throws IOException {
    JavaWriter writer = new JavaWriter (iWriter);
    final String attribute = privateFieldName (field);
    writer.method (false, getJavaType (field.getType (), false), accessorName (field, null), null);
    writer = beginBlock (writer); // accessor
    if (field.isRepeated ()) {
      // repeated fields, return the first
      writer.returnInvoke (accessorName (field, null), "0");
    } else {
      // non-repeated fields, return attribute directly
      writer.returnVariable (attribute);
    }
    endStmt (writer); // return
    writer = endBlock (writer); // accessor
    if (field.isRepeated ()) {
      writer.method (false, "int", accessorName (field, "Count"), null);
      writer = beginBlock (writer); // getXCount
      writer.returnIfNull (attribute, attribute + ".size ()", "0");
      endStmt (writer); // return
      writer = endBlock (writer); // getXCount
      writer.method (false, getJavaType (field.getType (), true), accessorName (field, null), "final int n");
      writer = beginBlock (writer); // getX(n)
      writer.ifNull (attribute);
      writer = beginBlock (writer); // if
      writer.returnNullIfZero ("n");
      endStmt (writer);
      writer.throwIndexOutOfBoundsException ("n");
      endStmt (writer);
      writer = endBlock (writer); // if
      writer.returnInvoke (attribute + ".get", "n");
      endStmt (writer);
      writer = endBlock (writer); // getX(n)
    }
  }
  
  private String getListType (final FieldType type, final boolean concrete) throws IOException {
    final StringBuilder sb = new StringBuilder ();
    if (concrete) {
      sb.append (CLASS_ARRAYLIST);
    } else {
      sb.append (CLASS_LIST);
    }
    sb.append ('<').append (getJavaType (type, true)).append ('>');
    return sb.toString ();
  }
  
  private String getRealFieldType (final FieldDefinition field) throws IOException {
    if (field.isRepeated ()) {
      return getListType (field.getType (), false);
    } else {
      return getJavaType (field.getType (), false);
    }
  }
  
  @Override
  public void writeClassImplementationAttribute(final Compiler.Context context, final FieldDefinition field, final IndentWriter iWriter) throws IOException {
    final JavaWriter writer = new JavaWriter (iWriter);
    writer.attribute (true, getRealFieldType (field), privateFieldName (field));
    endStmt (writer); // attribute decl
  }
  
  private void writeBuilderClassFields (final JavaWriter writer, MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      final LiteralValue defaultValue = field.getDefaultValue ();
      writer.attribute (field.isRequired () && (defaultValue == null), getRealFieldType (field), privateFieldName (field));
      if ((defaultValue != null) && !field.isRepeated ()) {
        writer.getWriter ().write (" = ");
        writeLiteral (writer.getWriter (), defaultValue);
      }
      endStmt (writer); // builder field decl
    }
  }
  
  private void writeBuilderClassConstructor (JavaWriter writer, final MessageDefinition message) throws IOException {
    final List<FieldDefinition> required = new LinkedList<FieldDefinition> ();
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    final StringBuilder sbParams = new StringBuilder ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (field.isRequired () && (field.getDefaultValue () == null)) {
        required.add (field);
        if (sbParams.length () > 0) sbParams.append (", ");
        sbParams.append ("final ").append (getRealFieldType (field)).append (' ').append (localFieldName (field));
      }
    }
    writer.constructor (true, "Builder", sbParams.toString ());
    writer = beginBlock (writer); // builder constructor
    for (FieldDefinition field : required) {
      writer.assignment (privateFieldName (field), localFieldName (field));
      endStmt (writer); // assignment
    }
    writer = endBlock (writer); // builder constructor
  }
  
  private void writeBuilderClassMethods (JavaWriter writer, final MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (!field.isRequired () || (field.getDefaultValue () != null)) {
        // standard method (or singleton list on repeated fields)
        writer.method (false, "Builder", localFieldName (field), "final " + getJavaType (field.getType (), false) + " " + localFieldName (field)); 
        writer = beginBlock (writer); // method
        if (field.isRepeated ()) {
          writer.assignment (privateFieldName (field), "new " + getListType (field.getType (), true) + " (1)");
          endStmt (writer);
          writer.invoke (privateFieldName (field), "add", localFieldName (field));
        } else {
          writer.assignment (privateFieldName (field), localFieldName (field));
        }
        endStmt (writer); // invoke or assignment
        writer.returnThis ();
        endStmt (writer); // return this
        endBlock (writer); // method
        if (field.isRepeated ()) {
          // standard method to assign a whole list on repeated fields
          writer.method (false, "Builder", localFieldName (field), "final " + getRealFieldType (field) + " " + localFieldName (field));
          writer = beginBlock (writer); // method
          writer.assignment (privateFieldName (field), localFieldName (field));
          endStmt (writer); // assignment
          writer.returnThis ();
          endStmt (writer); // return this
          writer = endBlock (writer); // method
          // standard method to append an item to a repeated field list
          writer.method (false, "Builder", "add" + camelCaseFieldName (field), "final " + getJavaType (field.getType (), false) + " " + localFieldName (field));
          writer = beginBlock (writer); // method
          writer.invoke (privateFieldName (field), "add", localFieldName (field));
          endStmt (writer); // append
          writer.returnThis ();
          endStmt (writer); // return this
          writer = endBlock (writer); // method
        }
      }
    }
  }
  
  private void writeBuilderClassBuildMethod (JavaWriter writer, MessageDefinition message) throws IOException {
    writer.method (false, message.getName (), "build", null);
    writer = beginBlock (writer);
    writer.returnConstruct (message.getName (), "this");
    endStmt (writer);
    writer = endBlock (writer);
  }
  
  private void writeBuilderClass (JavaWriter writer, MessageDefinition message) throws IOException {
    writer.classDef (true, "Builder", null);
    writer = beginBlock (writer); // builder class
    writeBuilderClassFields (writer, message);
    writeBuilderClassConstructor (writer, message);
    writeBuilderClassMethods (writer, message);
    writeBuilderClassBuildMethod (writer, message);
    writer = endBlock (writer); // builder class
  }
  
  private void writePrivateConstructor (JavaWriter writer, final MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    writer.constructor (false, message.getName (), "final Builder builder");
    writer = beginBlock (writer); // constructor
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      writer.assignment ("this." + privateFieldName (field), "builder." + privateFieldName (field));
      // TODO 2010-01-04 -- Andrew -- should we do the defensive copies at this point, e.g. cloning arrays & duplicating lists
      endStmt (writer); // assignment
    }
    // TODO 2009-12-30 Andrew -- apply any field constraints/invariants at this point 
    writer = endBlock (writer); // constructor
  }
  
  private JavaWriter beginBlock (final JavaWriter writer) throws IOException {
    beginBlock (writer.getWriter ());
    return new JavaWriter (writer);
  }
  
  private JavaWriter endBlock (final JavaWriter writer) throws IOException {
    final JavaWriter parent = writer.getParent ();
    endBlock (parent.getWriter ());
    return parent;
  }
  
  private void endStmt (final JavaWriter writer) throws IOException {
    endStmt (writer.getWriter ());
  }
  
  private void writeAddToFudgeMsg (JavaWriter writer, final String msg, final String name, final String ordinal, String value, final FieldType type) throws IOException {
    final String fudgeType;
    switch (type.getFudgeFieldType ()) {
    case FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY;
      if (!((FieldType.ArrayType)type).isFixedLength ()) {
        // arbitrary length - might be one of the optimal ones
        value = CLASS_BYTEARRAYFIELDTYPE + ".getBestMatch (" + value + ")";
      }
      break;
    case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY4;
      break;
    case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY8;
      break;
    case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY16;
      break;
    case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY20;
      break;
    case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY32;
      break;
    case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY64;
      break;
    case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY128;
      break;
    case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY256;
      break;
    case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID :
      fudgeType = TYPE_BYTEARRAY512;
      break;
    case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID :
      fudgeType = TYPE_SHORTARRAY;
      break;
    case FudgeTypeDictionary.INT_ARRAY_TYPE_ID :
      fudgeType = TYPE_INTARRAY;
      if (((FieldType.ArrayType)type).getBaseType () instanceof FieldType.EnumType) {
        final String temp1 = writer.localVariable ("int[]", true, "new int[" + value + ".length]");
        endStmt (writer);
        final String temp2 = writer.forEachIndex (temp1);
        writer = beginBlock (writer);
        writer.assignment (temp1 + "[" + temp2 + "]", value + "[" + temp2 + "].getFudgeEncoding ()");
        endStmt (writer);
        writer = endBlock (writer);
        value = temp1;
      }
      break;
    case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID :
      fudgeType = TYPE_LONGARRAY;
      break;
    case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID :
      fudgeType = TYPE_FLOATARRAY;
      break;
    case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID :
      fudgeType = TYPE_DOUBLEARRAY;
      break;
    case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
      fudgeType = TYPE_BOOLEAN;
      break;
    case FudgeTypeDictionary.INDICATOR_TYPE_ID :
      fudgeType = TYPE_INDICATOR;
      writer.ifBool (value); // indicators are present if the bool we are using is set
      value = VALUE_INDICATOR;
      break;
    case FudgeTypeDictionary.BYTE_TYPE_ID :
      fudgeType = TYPE_BYTE;
      break;
    case FudgeTypeDictionary.SHORT_TYPE_ID :
      fudgeType = TYPE_SHORT;
      break;
    case FudgeTypeDictionary.INT_TYPE_ID :
      fudgeType = TYPE_INT;
      if (type instanceof FieldType.EnumType) {
        value = value + ".getFudgeEncoding ()";
      }
      break;
    case FudgeTypeDictionary.LONG_TYPE_ID :
      fudgeType = TYPE_LONG;
      break;
    case FudgeTypeDictionary.FLOAT_TYPE_ID :
      fudgeType = TYPE_FLOAT;
      break;
    case FudgeTypeDictionary.DOUBLE_TYPE_ID :
      fudgeType = TYPE_DOUBLE;
      break;
    case FudgeTypeDictionary.STRING_TYPE_ID :
      fudgeType = TYPE_STRING;
      break;
    case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID :
      fudgeType = TYPE_SUBMESSAGE;
      if (type instanceof FieldType.ArrayType) {
        final String temp1 = writer.localVariable (CLASS_FUDGEMSG, true, "new " + CLASS_FUDGEMSG + " (context)");
        endStmt (writer);
        final FieldType baseType = ((FieldType.ArrayType)type).getBaseType ();
        final String temp2 = writer.forEach (getJavaType (baseType, false), value);
        writer = beginBlock (writer);
        writeAddToFudgeMsg (writer, temp1, "null", "null", temp2, baseType);
        writer = endBlock (writer);
        value = temp1;
      } else if (type instanceof FieldType.MessageType) {
        value = value + ".toFudgeMsg (context)";
      } else {
        throw new IllegalStateException ("type '" + type + "' is not an expected submessage type");
      }
      break;
    default :
      throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
    }
    writer.invoke (msg, "add", name + ", " + ordinal + ", " + fudgeType + ", " + value);
    endStmt (writer);
  }
  
  private void writeToFudgeMsg (JavaWriter writer, final MessageDefinition message) throws IOException {
    writer.method (false, CLASS_FUDGEMSG, "toFudgeMsg", "final " + CLASS_FUDGECONTEXT + " context");
    writer = beginBlock (writer); // toFudgeMsg
    writer.namedLocalVariable (CLASS_FUDGEMSG, "msg", "new " + CLASS_FUDGEMSG + " (context)");
    endStmt (writer);
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      final FieldType type = field.getType ();
      String value = privateFieldName (field);
      if (field.isRepeated ()) {
        writer.ifNotNull (value);
        writer = beginBlock (writer); // if not null
        value = writer.forEach (getJavaType (type, true), value);
        writer = beginBlock (writer); // foreach
      } else {
        if (isObject (type)) {
          writer.ifNotNull (value);
          writer = beginBlock (writer); // if not null
        }
      }
      writeAddToFudgeMsg (writer, "msg", (field.getName () != null) ? "\"" + field.getName () + "\"" : "null", (field.getOrdinal () != null) ? field.getOrdinal ().toString () : "null", value, type);
      if (field.isRepeated ()) {
        writer = endBlock (writer); // foreach
        writer = endBlock (writer); // if not null
      } else {
        if (isObject (type)) {
          writer = endBlock (writer); // if not null
        }
      }
    }
    writer.returnVariable ("msg");
    endStmt (writer);
    writer = endBlock (writer); // toFudgeMsg
  }
  
  /**
   * Returns true if the type is an array of Java objects rather than a Java primitive types. I.e. will generic collection methods work
   */
  private boolean isObjectArray (final FieldType.ArrayType type) {
    final FieldType base = type.getBaseType ();
    return isObject (base);
  }
  
  /**
   * Returns true if the type is not a Java primitive.
   */
  private boolean isObject (final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return true;
    } else if (type instanceof FieldType.EnumType) {
      return true;
    } else if (type instanceof FieldType.MessageType) {
      return true;
    } else {
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID :
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
      case FudgeTypeDictionary.BYTE_TYPE_ID :
      case FudgeTypeDictionary.SHORT_TYPE_ID :
      case FudgeTypeDictionary.INT_TYPE_ID :
      case FudgeTypeDictionary.LONG_TYPE_ID :
      case FudgeTypeDictionary.FLOAT_TYPE_ID :
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        return false;
      case FudgeTypeDictionary.STRING_TYPE_ID :
        return true;
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    }
  }
  
  private String toArray (JavaWriter writer, final String source, final FieldType.ArrayType type) throws IOException {
    final StringBuilder sbNewArray = new StringBuilder ("new ");
    int dims = 0;
    FieldType base = type.getBaseType ();
    while (base instanceof FieldType.ArrayType) {
      base = ((FieldType.ArrayType)base).getBaseType ();
      dims++;
    }
    sbNewArray.append (getJavaType (base, false)).append ('[').append (source).append (".size ()]");
    for (int i = 0; i < dims; i++) {
      sbNewArray.append ("[]");
    }
    if (isObjectArray (type)) {
      return source + ".toArray (" + sbNewArray + ")";
    } else {
      final String newArray = writer.localVariable (getJavaType (type, false), true, sbNewArray.toString ());
      endStmt (writer);
      final String index = writer.localVariable ("int", false, "0");
      endStmt (writer);
      final String element = writer.forEach (getJavaType (type.getBaseType (), false), source);
      writer = beginBlock (writer);
      writer.assignment (newArray + "[" + index + "++]", element);
      endStmt (writer);
      writer = endBlock (writer);
      return newArray;
    }
  }
  
  private String writeDecodeSimpleFudgeField (final JavaWriter writer, final String fudgeType, final String displayType, final String javaType, final MessageDefinition message, final String fieldData, final String fieldRef, final String assignTo, final String appendTo) throws IOException {
    writer.ifNotFieldTypeMatch (fudgeType, fieldData);
    writer.throwInvalidFudgeFieldException (message, fieldRef, displayType, null);
    endStmt (writer);
    if (appendTo != null) {
      return "(" + javaType + ")" + fieldData + ".getValue ()";
    } else {
      writer.assignmentGetValueCast (assignTo, fieldData, javaType);
      endStmt (writer);
      return assignTo;
    }
  }
  
  private void writeDecodeFudgeField (JavaWriter writer, final FieldType type, final MessageDefinition message, final String fieldData, final String fieldRef, String assignTo, final String appendTo) throws IOException {
    // TODO 2010-01-04 Andrew -- should we support intrinsic conversion from shorter to longer types, e.g. short[] to int[]? like we do for the single values
    if (type instanceof FieldType.ArrayType) {
      final FieldType baseType = ((FieldType.ArrayType)type).getBaseType ();
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID :
      case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("byte[]", true);
          endStmt (writer);
        }
        writer.ifInstanceOf (fieldData, CLASS_BYTEARRAYFIELDTYPE);
        writer.assignmentGetValueCast (assignTo, fieldData, "byte[]");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "byte[]", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_SHORTARRAY, "short[]", "short[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.INT_ARRAY_TYPE_ID : {
        if (baseType instanceof FieldType.EnumType) {
          final EnumDefinition enumDefinition = ((FieldType.EnumType)baseType).getEnumDefinition ();
          writer.ifNotFieldTypeMatch (TYPE_INTARRAY, fieldData);
          writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), null);
          endStmt (writer);
          if (appendTo != null) {
            assignTo = writer.localVariable (getJavaType (type, false), true);
            endStmt (writer);
          }
          writer.guard ();
          writer = beginBlock (writer); // try
          final String intArray = writer.localVariable ("int[]", true, "(int[])" + fieldData + ".getValue ()");
          endStmt (writer);
          writer.assignment (assignTo, "new " + enumDefinition.getIdentifier () + "[" + intArray + ".length]");
          endStmt (writer);
          final String index = writer.forEachIndex (intArray);
          writer = beginBlock (writer); // for
          writer.assignment (assignTo + "[" + index + "]", enumDefinition.getIdentifier () + ".fromFudgeEncoding (" + intArray + "[" + index + "])");
          endStmt (writer);
          writer = endBlock (writer); // for
          writer = endBlock (writer); // try
          writer.catchIllegalArgumentException ();
          writer = beginBlock (writer); // catch
          writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), "e");
          endStmt (writer);
          writer = endBlock (writer); // catch
        } else {
          assignTo = writeDecodeSimpleFudgeField (writer, TYPE_INTARRAY, "int[]", "int[]", message, fieldData, fieldRef, assignTo, appendTo);
        }
        break;
      }
      case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_LONGARRAY, "long[]", "long[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_FLOATARRAY, "float[]", "float[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_DOUBLEARRAY, "double[]", "double[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID :
        writer.ifNotFieldTypeMatch (TYPE_SUBMESSAGE, fieldData);
        writer.throwInvalidFudgeFieldException (message, fieldRef, "sub message (array)", null);
        endStmt (writer);
        final String subMessage = writer.localVariable (CLASS_FUDGEMSG, true, "(" + CLASS_FUDGEMSG + ")" + fieldData + ".getValue ()");
        endStmt (writer);
        if (appendTo != null) {
          assignTo = writer.localVariable (getListType (baseType, false), true, "new " + getListType (baseType, true) + " ()");
          endStmt (writer);
        }
        writer.getWriter ().write ("try");
        writer = beginBlock (writer); // try
        final String msgElement = writer.forEach (CLASS_FUDGEFIELD, subMessage);
        writer = beginBlock (writer); // iteration
        writeDecodeFudgeField (writer, baseType, message, msgElement, fieldRef + "[]", null, assignTo + ".add");
        writer = endBlock (writer); // iteration
        writer = endBlock (writer); // try
        writer.getWriter ().write ("catch (IllegalArgumentException e)");
        writer = beginBlock (writer); // catch
        writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), "e");
        endStmt (writer);
        writer = endBlock (writer); // catch
        if (appendTo != null) {
          assignTo = toArray (writer, assignTo, (FieldType.ArrayType)type);
        }
        break;
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    } else if (type instanceof FieldType.MessageType) {
      final MessageDefinition msg = ((FieldType.MessageType)type).getMessageDefinition ();
      if (appendTo != null) {
        assignTo = writer.localVariable (msg.getIdentifier (), true);
        endStmt (writer);
      }
      writer.ifNotFieldTypeMatch (TYPE_SUBMESSAGE, fieldData);
      writer.throwInvalidFudgeFieldException (message, fieldRef, msg.getName (), null);
      endStmt (writer);
      writer.guard ();
      writer = beginBlock (writer); // try
      writer.assignment (assignTo, msg.getIdentifier () + ".fromFudgeMsg ((" + CLASS_FUDGEMSG + ")" + fieldData + ".getValue ())");
      endStmt (writer);
      writer = endBlock (writer); // try
      writer.catchIllegalArgumentException ();
      writer = beginBlock (writer); // catch
      writer.throwInvalidFudgeFieldException (message, fieldRef, msg.getName (), "e");
      endStmt (writer);
      writer = endBlock (writer); // catch
    } else if (type instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType)type).getEnumDefinition ();
      final String intValue = writer.localVariable ("int", true);
      endStmt (writer);
      if (appendTo != null) {
        assignTo = writer.localVariable (enumDefinition.getIdentifier (), true);
        endStmt (writer);
      }
      writer.ifFieldTypeMatch (TYPE_INT, fieldData);
      writer.assignmentGetValueCast (intValue, fieldData, "Integer");
      endStmt (writer);
      writer.elseIfFieldTypeMatch (TYPE_SHORT, fieldData);
      writer.assignmentGetValueCast (intValue, fieldData, "Short");
      endStmt (writer);
      writer.elseIfFieldTypeMatch (TYPE_BYTE, fieldData);
      writer.assignmentGetValueCast (intValue, fieldData, "Byte");
      endStmt (writer);
      writer.elseThrowInvalidFudgeFieldException (message, fieldRef, enumDefinition.getName (), null);
      endStmt (writer);
      writer.guard ();
      writer = beginBlock (writer); // try
      writer.assignment (assignTo, enumDefinition.getIdentifier () + ".fromFudgeEncoding (" + intValue + ")");
      endStmt (writer);
      writer = endBlock (writer); // try
      writer.catchIllegalArgumentException ();
      writer = beginBlock (writer); // catch
      writer.throwInvalidFudgeFieldException (message, fieldRef, enumDefinition.getName (), "e");
      endStmt (writer);
      writer = endBlock (writer); // catch
    } else {
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID :
        // using a boolean internally, so just set to true to indicate this is in the message
        if (appendTo != null) {
          assignTo = "true";
        } else {
          writer.assignment (assignTo, "true");
          endStmt (writer);
        }
        break;
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_BOOLEAN, "boolean", "Boolean", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.BYTE_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_BYTE, "byte", "Byte", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.SHORT_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("short", true);
          endStmt (writer);
        }
        writer.ifFieldTypeMatch (TYPE_SHORT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Short");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_BYTE, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "short", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.INT_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("int", true);
          endStmt (writer);
        }
        writer.ifFieldTypeMatch (TYPE_INT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Integer");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_SHORT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Short");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_BYTE, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "int", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.LONG_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("long", true);
          endStmt (writer);
        }
        writer.ifFieldTypeMatch (TYPE_LONG, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Long");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_INT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Integer");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_SHORT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Short");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_BYTE, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "long", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.FLOAT_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, TYPE_FLOAT, "float", "Float", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("double", true);
          endStmt (writer);
        }
        writer.ifFieldTypeMatch (TYPE_DOUBLE, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Double");
        endStmt (writer);
        writer.elseIfFieldTypeMatch (TYPE_FLOAT, fieldData);
        writer.assignmentGetValueCast (assignTo, fieldData, "Float");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "double", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.STRING_TYPE_ID : {
        final String value = fieldData + ".getValue ().toString ()";
        if (appendTo != null) {
          assignTo = value;
        } else {
          writer.assignment (assignTo, value);
          endStmt (writer);
        }
        break;
      }
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    }
    if (appendTo != null) {
      writer.invoke (appendTo, assignTo);
      endStmt (writer);
    }
  }
  
  private void writeDecodeFudgeFieldsToList (JavaWriter writer, final FieldDefinition field, final String localName) throws IOException {
    writer.assignment (localName, "new " + getListType (field.getType (), true) + " (fields.size ())");
    endStmt (writer); // list construction
    final String fieldData = writer.forEach (CLASS_FUDGEFIELD, "fields");
    beginBlock (writer.getWriter ()); // iteration
    writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), fieldData, field.getName (), null, localName + ".add");
    endBlock (writer.getWriter ()); // iteration
  }
  
  private void writeGetFudgeFields (JavaWriter writer, final List<FieldDefinition> fields, boolean localAssign) throws IOException {
    for (FieldDefinition field : fields) {
      final StringBuilder sbGetField = new StringBuilder ("fudgeMsg.get");
      if (field.isRepeated ()) sbGetField.append ("All");
      sbGetField.append ("By");
      final Integer ordinal = field.getOrdinal ();
      if (ordinal != null) {
        sbGetField.append ("Ordinal (").append (ordinal.toString ()).append (')');
      } else {
        sbGetField.append ("Name (\"").append (field.getName ()).append ("\")");
      }
      writer.assignment (field.isRepeated () ? "fields" : "field", sbGetField.toString ());
      endStmt (writer); // field(s) assignment
      if (localAssign) {
        if (field.isRepeated ()) {
          writer.ifZero ("fields.size ()");
        } else {
          writer.ifNull ("field");
        }
        writer.throwInvalidFudgeFieldException (field.getOuterMessage (), field.getName (), "present", null);
        endStmt (writer); // if & throw
        writer.namedLocalVariable (getRealFieldType (field), localFieldName (field), null);
        endStmt (writer); // local field declaration
        if (field.isRepeated ()) {
          writeDecodeFudgeFieldsToList (writer, field, localFieldName (field));
        } else {
          writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), "field", field.getName (), localFieldName (field), null);
        }
      } else {
        if (field.isRepeated ()) {
          writer.ifGtZero ("fields.size ()");
          writer = beginBlock (writer); // if guard
          final String tempList = writer.localVariable (getListType (field.getType (), false), true);
          endStmt (writer); // temp variable
          writeDecodeFudgeFieldsToList (writer, field, tempList);
          writer.invoke ("msgBuilder", localFieldName (field), tempList);
          endStmt (writer); // add to builder
        } else {
          writer.ifNotNull ("field");
          writer = beginBlock (writer); // if guard
          writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), "field", field.getName (), null, "msgBuilder." + localFieldName (field));
        }
        writer = endBlock (writer); // if guard
      }
    }
  }
  
  private void writeFromFudgeMsg (JavaWriter writer, final MessageDefinition message) throws IOException {
    //final Set<ConversionFunction> conversionFunctions = EnumSet.noneOf (ConversionFunction.class);
    final List<FieldDefinition> required = new LinkedList<FieldDefinition> ();
    final List<FieldDefinition> optional = new LinkedList<FieldDefinition> ();
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    boolean hasRepeatedFields = false;
    boolean hasNonRepeatedFields = false;
    final StringBuilder sbBuilderParams = new StringBuilder ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (field.isRequired () && (field.getDefaultValue () == null)) {
        required.add (field);
        if (sbBuilderParams.length () > 0) sbBuilderParams.append (", ");
        sbBuilderParams.append (localFieldName (field));
      } else {
        optional.add (field);
      }
      if (field.isRepeated ()) {
        hasRepeatedFields = true;
      } else {
        hasNonRepeatedFields = true;
      }
    }
    writer.method (true, message.getName (), "fromFudgeMsg", "final " + CLASS_FUDGEMSG + " fudgeMsg");
    writer = beginBlock (writer); // fromFudgeMsg
    if (hasRepeatedFields) {
      writer.namedLocalVariable (CLASS_LIST + "<" + CLASS_FUDGEFIELD + ">", "fields", null);
      endStmt (writer); // fields declaration
    }
    if (hasNonRepeatedFields) {
      writer.namedLocalVariable (CLASS_FUDGEFIELD, "field", null);
      endStmt (writer); // field declaration
    }
    writeGetFudgeFields (writer, required, true);
    writer.namedLocalVariable ("Builder", "msgBuilder", "new Builder (" + sbBuilderParams.toString () + ")");
    endStmt (writer); // msgBuilder creation
    writeGetFudgeFields (writer, optional, false);
    writer.returnInvoke ("msgBuilder.build", null);
    endStmt (writer); // create and return object
    endBlock (writer); // fromFudgeMsg
  }

  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, MessageDefinition message, final IndentWriter iWriter) throws IOException {
    final JavaWriter writer = new JavaWriter (iWriter);
    writeBuilderClass (writer, message);
    writePrivateConstructor (writer, message);
    writeToFudgeMsg (writer, message);
    writeFromFudgeMsg (writer, message);
  }

  @Override
  public void writeEnumImplementationDeclaration(final Compiler.Context context, EnumDefinition enumDefinition, IndentWriter iWriter) throws IOException {
    JavaWriter writer = new JavaWriter (iWriter);
    if (enumDefinition.getOuterDefinition () == null) {
      final String namespace = enumDefinition.getNamespace ();
      if (namespace != null) {
        writer.packageDef (namespace);
        endStmt (writer);
      }
    }
    writer.enumDef (enumDefinition.getName ());
    writer = beginBlock (writer); // enum
    Iterator<Map.Entry<String,Integer>> elements = enumDefinition.getElements ();
    boolean first = true;
    while (elements.hasNext ()) {
      final Map.Entry<String,Integer> element = elements.next ();
      if (first) {
        first = false;
      } else {
        writer.enumElementSeparator ();
      }
      writer.enumElement (element.getKey (), element.getValue ().toString ());
    }
    endStmt (writer); // initial enumset
    writer.attribute (true, "int", "_fudgeEncoding");
    endStmt (writer); // ordinal def
    writer.constructor (false, enumDefinition.getName (), "final int fudgeEncoding");
    writer = beginBlock (writer); // constructor
    writer.assignment ("_fudgeEncoding", "fudgeEncoding");
    endStmt (writer); // assignment
    writer = endBlock (writer); // constructor
    writer.method (false, "int", "getFudgeEncoding", null);
    writer = beginBlock (writer); // getFudgeEncoding
    writer.returnVariable ("_fudgeEncoding");
    endStmt (writer); // return
    writer = endBlock (writer); // getFudgeEncoding
    writer.method (true, enumDefinition.getName (), "fromFudgeEncoding", "final int fudgeEncoding");
    writer = beginBlock (writer); // fromFudgeEncoding
    writer.select ("fudgeEncoding");
    beginBlock (writer); // switch
    elements = enumDefinition.getElements ();
    while (elements.hasNext ()) {
      final Map.Entry<String,Integer> element = elements.next ();
      writer.selectCaseReturn (element.getValue ().toString (), element.getKey ());
      endStmt (writer);
    }
    writer.defaultThrowInvalidFudgeEnumException (enumDefinition, "fudgeEncoding");
    endStmt (writer); // default
    endBlock (writer); // switch
    endBlock (writer); // fromFudgeEncoding
    endBlock (writer); // enum
  }
  
  @Override
  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter iWriter) throws IOException {
    super.writeTaxonomyImplementationDeclaration (context, taxonomy, iWriter);
    JavaWriter writer = beginClass (new JavaWriter (iWriter), taxonomy);
    writer.publicStaticFinal (CLASS_FUDGETAXONOMY, "INSTANCE", "new " + taxonomy.getName () + " ()");
    endStmt (writer); // instance
    final StringBuilder sbOrdinals = new StringBuilder ();
    final StringBuilder sbStrings = new StringBuilder ();
    final Iterator<Map.Entry<String,Integer>> elements = taxonomy.getElements ();
    while (elements.hasNext ()) {
      final Map.Entry<String,Integer> element = elements.next ();
      final String name = element.getKey ();
      writer.publicStaticFinal ("String", "STR_" + name, "\"" + name + "\"");
      endStmt (writer); // STR_ decl
      if (sbStrings.length () > 0) sbStrings.append (", ");
      sbStrings.append ("STR_").append (name);
      writer.publicStaticFinal ("short", "VAL_" + name, element.getValue ().toString ());
      endStmt (writer); // VAL_ decl
      if (sbOrdinals.length () > 0) sbOrdinals.append (", ");
      sbOrdinals.append ("VAL_").append (name);
    }
    writer.constructor (false, taxonomy.getName (), null);
    writer = beginBlock (writer); // constructor
    writer.invoke ("super", "new int[] { " + sbOrdinals.toString () + " }, new String[] { " + sbStrings.toString () + " }");
    endStmt (writer); // super
    endBlock (writer); // constructor
    endBlock (writer); // class
  }

  private String getJavaType (final FieldType type, final boolean asObject) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType)type;
      final StringBuilder sb = new StringBuilder ();
      sb.append (getJavaType (array.getBaseType (), false));
      sb.append ("[]");
      return sb.toString ();
    } else if (type instanceof FieldType.EnumType) {
      return ((FieldType.EnumType)type).getEnumDefinition ().getIdentifier ();
    } else if (type instanceof FieldType.MessageType) {
      return ((FieldType.MessageType)type).getMessageDefinition ().getIdentifier ();
    } else {
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID :
        // We'll handle indicators as a boolean - was it in the Fudge message or not
        return asObject ? "Boolean" : "boolean";
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
        return asObject ? "Boolean" : "boolean";
      case FudgeTypeDictionary.BYTE_TYPE_ID :
        return asObject ? "Byte" : "byte";
      case FudgeTypeDictionary.SHORT_TYPE_ID :
        return asObject ? "Short" : "short";
      case FudgeTypeDictionary.INT_TYPE_ID :
        return asObject ? "Integer" : "int";
      case FudgeTypeDictionary.LONG_TYPE_ID :
        return asObject ? "Long" : "long";
      case FudgeTypeDictionary.FLOAT_TYPE_ID :
        return asObject ? "Float" : "float";
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        return asObject ? "Double" : "double";
      case FudgeTypeDictionary.STRING_TYPE_ID :
        return "String";
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    }
  }
  
}