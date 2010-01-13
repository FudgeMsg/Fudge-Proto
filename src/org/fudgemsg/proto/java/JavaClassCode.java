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
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.Binding;
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
  
  // TODO 2010-01-07 Andrew -- we don't need the JavaWriter class; temporary local variable names can be tracked using the call stack, and the other methods can be brought back in here
  
  /* package */ static final JavaClassCode INSTANCE = new JavaClassCode ();
  
  private static final String CLASS_COLLECTIONS = java.util.Collections.class.getName ();
  private static final String CLASS_FUDGEMSG = org.fudgemsg.FudgeMsg.class.getName ();
  private static final String CLASS_FUDGEFIELDCONTAINER = org.fudgemsg.FudgeFieldContainer.class.getName ();
  private static final String CLASS_MUTABLEFUDGEFIELDCONTAINER = org.fudgemsg.MutableFudgeFieldContainer.class.getName ();
  private static final String CLASS_MAPFUDGETAXONOMY = org.fudgemsg.taxon.MapFudgeTaxonomy.class.getName ();
  private static final String CLASS_ARRAYLIST = java.util.ArrayList.class.getName ();
  private static final String CLASS_FUDGECONTEXT = org.fudgemsg.FudgeContext.class.getName ();
  private static final String CLASS_FUDGETAXONOMY = org.fudgemsg.taxon.FudgeTaxonomy.class.getName ();
  private static final String CLASS_LIST = java.util.List.class.getName ();
  private static final String CLASS_ARRAYS = java.util.Arrays.class.getName ();
  private static final String CLASS_FUDGEFIELD = org.fudgemsg.FudgeField.class.getName ();
  private static final String CLASS_INDICATOR = org.fudgemsg.types.IndicatorType.class.getName ();
  
  private static final String VALUE_INDICATOR = CLASS_INDICATOR + ".INSTANCE";

  private JavaClassCode () {
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (JavaLiteralCode.INSTANCE)))));
  }
  
  private String getBinding (final Definition definition, final String key) {
    final Binding.Data data = definition.getLanguageBinding ("Java").getData (key);
    return (data != null) ? data.getValue () : null;
  }
  
  private JavaWriter beginClass (JavaWriter writer, final Definition definition, final String extendsClass, String interfaceClass) throws IOException {
    if (definition.getOuterDefinition () == null) {
      final String namespace = definition.getNamespace ();
      if (namespace != null) {
        writer.packageDef (namespace);
        endStmt (writer);
      }
    }
    // TODO 2010-01-13 Andrew -- need to support the Javadoc-style annotations in the proto files and write out javadoc for Java classes 
    final String extraImplements = getBinding (definition, "implements");
    if (extraImplements != null) {
      if (interfaceClass == null) {
        interfaceClass = extraImplements;
      } else {
        interfaceClass = interfaceClass + ", " + extraImplements;
      }
    }
    writer.classDef (definition.getOuterDefinition () != null, definition.getName (), extendsClass, interfaceClass);
    writer = beginBlock (writer); // class definition
    final String bodyCode = getBinding (definition, "body");
    if (bodyCode != null) {
      writer.getWriter ().write (bodyCode);
      writer.getWriter ().newLine ();
    }
    return writer;
  }

  @Override
  public void beginClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message, IndentWriter iWriter) throws IOException {
    super.beginClassImplementationDeclaration (context, message, iWriter);
    final MessageDefinition ext = message.getExtends ();
    beginClass (new JavaWriter (iWriter), message, (ext != null) ? ext.getIdentifier () : null, "Cloneable");
  }

  @Override
  public void endClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message, IndentWriter iWriter) throws IOException {
    final JavaWriter writer = new JavaWriter (iWriter);
    writeEquals (writer, message);
    writeHashCode (writer, message);
    writeClone (writer, message);
    endBlock (iWriter); // class definition
  }

  @Override
  public File getImplementationFile(final Compiler.Context context, Definition definition, File targetPath) throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath, definition.getIdentifierArray());
    if (implementation == null) return null;
    return new File(implementation, definition.getName() + ".java");
  }
  
  private String fieldMethodName (final FieldDefinition field, final String prefix, final String suffix) {
    final StringBuilder sb = new StringBuilder ();
    if (prefix != null) {
      sb.append (prefix).append (camelCaseFieldName (field));
    } else {
      sb.append (localFieldName (field));
    }
    if (suffix != null) sb.append (suffix);
    return sb.toString ();
  }
  
  @Override
  public void writeClassImplementationAccessor(final Compiler.Context context, final FieldDefinition field, final IndentWriter iWriter) throws IOException {
    JavaWriter writer = new JavaWriter (iWriter);
    final String attribute = privateFieldName (field);
    writer.method (false, getJavaType (field.getType (), field.isRepeated ()), fieldMethodName (field, "get", null), null);
    writer = beginBlock (writer); // accessor
    if (field.isRepeated ()) {
      // repeated fields, return the first
      writer.returnInvoke (fieldMethodName (field, "get", null), "0", null);
    } else {
      // non-repeated fields, return attribute directly
      writer.returnVariable (attribute);
    }
    endStmt (writer); // return
    writer = endBlock (writer); // accessor
    if (field.isRepeated ()) {
      writer.method (false, "int", fieldMethodName (field, "get", "Count"), null);
      writer = beginBlock (writer); // getXCount
      writer.returnIfNull (attribute, attribute + ".size ()", "0");
      endStmt (writer); // return
      writer = endBlock (writer); // getXCount
      writer.method (false, getJavaType (field.getType (), true), fieldMethodName (field, "get", null), "final int n");
      writer = beginBlock (writer); // getX(n)
      writer.ifNull (attribute);
      writer = beginBlock (writer); // if
      writer.returnNullIfZero ("n");
      endStmt (writer);
      writer.throwIndexOutOfBoundsException ("n");
      endStmt (writer);
      writer = endBlock (writer); // if
      writer.returnInvoke (attribute + ".get", "n", null);
      endStmt (writer);
      writer = endBlock (writer); // getX(n)
      writer.method (false,  getRealFieldType (field), fieldMethodName (field, "get", "List"), null);
      writer = beginBlock (writer); // getXList
      writer.returnInvoke (CLASS_COLLECTIONS + ".unmodifiableList", attribute, null);
      endStmt (writer);
      writer = endBlock (writer);
    }
    if (field.isMutable ()) {
      writeMutatorMethod (writer, false, field);
    }
  }
  
  private String getListType (final FieldType type, final boolean concrete) {
    final StringBuilder sb = new StringBuilder ();
    if (concrete) {
      sb.append (CLASS_ARRAYLIST);
    } else {
      sb.append (CLASS_LIST);
    }
    sb.append ('<').append (getJavaType (type, true)).append ('>');
    return sb.toString ();
  }
  
  private String getRealFieldType (final FieldDefinition field) {
    if (field.isRepeated ()) {
      return getListType (field.getType (), false);
    } else {
      return getJavaType (field.getType (), false);
    }
  }
  
  @Override
  public void writeClassImplementationAttribute(final Compiler.Context context, final FieldDefinition field, final IndentWriter iWriter) throws IOException {
    final JavaWriter writer = new JavaWriter (iWriter);
    writer.attribute (!field.isMutable (), getRealFieldType (field), privateFieldName (field));
    endStmt (writer); // attribute decl
  }
  
  private void writeBuilderClassFields (final JavaWriter writer, MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      writer.attribute (field.isRequired () && (field.getDefaultValue () == null), getRealFieldType (field), privateFieldName (field));
      endStmt (writer); // builder field decl
    }
  }
  
  private void getSuperConstructorParams (final MessageDefinition message, final StringBuilder typeList, final StringBuilder invokeList) {
    if (message.getExtends () != null) getSuperConstructorParams (message.getExtends (), typeList, invokeList);
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (field.isRequired ()) {
        if (typeList.length () != 0) typeList.append (", ");
        typeList.append (getRealFieldType (field)).append (' ').append (localFieldName (field));
        if (invokeList.length () != 0) invokeList.append (", ");
        invokeList.append (localFieldName (field));
      }
    }
  }
  
  /**
   * Writes out the constructor for either Builder or the main message if the builder pattern is not being used.
   */
  private void writePublicConstructor (JavaWriter writer, final boolean builder, final MessageDefinition message) throws IOException {
    final List<FieldDefinition> defaultValues = new LinkedList<FieldDefinition> ();
    final List<FieldDefinition> required = new LinkedList<FieldDefinition> ();
    final StringBuilder sbParams = new StringBuilder ();
    final String superInvoke;
    if (message.getExtends () != null) {
      final StringBuilder sb = new StringBuilder ();
      getSuperConstructorParams (message.getExtends (), sbParams, sb);
      superInvoke = sb.toString ();
    } else {
      superInvoke = null;
    }
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (field.getDefaultValue () != null) {
        defaultValues.add (field);
      } else if (field.isRequired ()) {
        required.add (field);
        if (sbParams.length () > 0) sbParams.append (", ");
        sbParams.append (getRealFieldType (field)).append (' ').append (localFieldName (field));
      }
    }
    writer.constructor ("public", builder ? "Builder" : message.getName (), sbParams.toString ());
    writer = beginBlock (writer); // constructor
    if (superInvoke != null) {
      writer.invoke ("super", superInvoke);
      endStmt (writer);
    }
    for (FieldDefinition field : required) {
      writeMutatorAssignment (writer, field);
    }
    for (FieldDefinition field : defaultValues) {
      writer.invoke (builder ? localFieldName (field) : "set" + camelCaseFieldName (field), getLiteral (field.getDefaultValue ()));
      endStmt (writer);
    }
    writer = endBlock (writer); // constructor
  }
  
  private void writeCheckArrayLength (JavaWriter writer, final String variable, final String displayVariable, final FieldType.ArrayType array) throws IOException {
    if (array.isFixedLength ()) {
      writer.ifSizeNot (variable, "length", array.getFixedLength ());
      writer.throwWrongSizedArrayException (displayVariable, array.getFixedLength ());
      endStmt (writer);
    }
    if (array.isDeepFixedLength ()) {
      final FieldType.ArrayType baseType = (FieldType.ArrayType)array.getBaseType ();
      final String localVariable = writer.forEach (getJavaType (baseType, false), variable);
      writer = beginBlock (writer);
      writeCheckArrayLength (writer, localVariable, displayVariable + "[]", baseType);
      writer = endBlock (writer);
    }
  }
  
  private void writeDefensiveCopy (JavaWriter writer, final String variable, final FieldType type) throws IOException {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType arrayType = (FieldType.ArrayType)type;
      // TODO 2010-01-07 Andrew -- should take defensive copy of array types
      writeCheckArrayLength (writer, variable, variable, arrayType);
    } else if (type instanceof FieldType.MessageType) {
      writer.assignment (variable, variable + ".clone ()");
      endStmt (writer);
    }
  }
  
  private void writeMutatorAssignment (JavaWriter writer, final FieldDefinition field) throws IOException {
    final String pfn = privateFieldName (field);
    final String lfn = localFieldName (field);
    if (field.isRepeated ()) {
      writer.ifNull (lfn);
      if (field.isRequired ()) {
        writer.throwNullParameterException (lfn);
      } else {
        writer.assignment (pfn, "null");
      }
      endStmt (writer); // null assignment or exception
      writer.otherwise ();
      writer = beginBlock (writer); // else
      writer.assignmentConstruct (lfn, getListType (field.getType (), true), lfn); // take defensive copy
      endStmt (writer);
      // TODO 2010-01-07 Andrew -- this should be a deeper copy for repeated submessages and arrays
      if (field.isRequired ()) {
        writer.ifEmptyList (lfn);
        writer.throwEmptyListException (lfn);
        endStmt (writer);
      }
      // TODO 2010-01-07 Andrew -- should check that none of the list elements are null
      // TODO 2010-01-08 Andrew -- should check that arrays are the correct length if sizes are specified
      
      // TODO 2010-01-13 Andrew -- the C# codegen has a far better approach to this 
      
      writer.assignment (pfn, lfn);
      endStmt (writer); // assignment
      writer = endBlock (writer); // else
    } else {
      if (field.isRequired () && isObject (field.getType ())) {
        writer.ifNull (lfn);
        writer.throwNullParameterException (lfn);
        endStmt (writer);
      }
      writeDefensiveCopy (writer, lfn, field.getType ());
      writer.assignment (pfn, lfn);
      endStmt (writer); // assignment
    }
  }
  
  private void writeMutatorMethod (JavaWriter writer, final boolean builderReturn, final FieldDefinition field) throws IOException {
    // standard method (or singleton list on repeated fields)
    final String lfn = localFieldName (field);
    writer.method (false, builderReturn ? "Builder" : "void", fieldMethodName (field, builderReturn ? null : "set", null), getJavaType (field.getType (), field.isRepeated ()) + " " + lfn); 
    writer = beginBlock (writer); // method
    final String pfn = privateFieldName (field);
    if (field.isRepeated ()) {
      writer.ifNull (lfn);
      if (field.isRequired ()) {
        writer.throwNullParameterException (lfn);
      } else {
        writer.assignment (pfn, "null");
      }
      endStmt (writer); // null assignment or exception
      writer.otherwise ();
      writer = beginBlock (writer); // else
      writer.assignmentConstruct (pfn, getListType (field.getType (), true), "1");
      endStmt (writer); // reset list
      writer.invoke (fieldMethodName (field, "add", null), lfn);
      endStmt (writer); // invoke add
      writer = endBlock (writer);
    } else {
      writeMutatorAssignment (writer, field);
    }
    if (builderReturn) {
      writer.returnThis ();
      endStmt (writer); // return this
    }
    endBlock (writer); // method
    if (field.isRepeated ()) {
      // standard method to assign a whole list on repeated fields
      writer.method (false, builderReturn ? "Builder" : "void", fieldMethodName (field, builderReturn ? null : "set", null), getRealFieldType (field) + " " + lfn);
      writer = beginBlock (writer); // method
      writeMutatorAssignment (writer, field);
      if (builderReturn) {
        writer.returnThis ();
        endStmt (writer); // return this
      }
      writer = endBlock (writer); // method
      // standard method to append an item to a repeated field list
      writer.method (false, builderReturn ? "Builder" : "void", fieldMethodName (field, "add", null), getJavaType (field.getType (), true) + " " + lfn);
      writer = beginBlock (writer); // method
      writer.ifNull (lfn);
      writer.throwNullParameterException (lfn);
      endStmt (writer); // check for null
      writer.ifNull (pfn);
      writer.assignmentConstruct (pfn, getListType (field.getType (), true), null);
      endStmt (writer); // assign empty list if none already
      writeDefensiveCopy (writer, lfn, field.getType ());
      writer.invoke (pfn, "add", lfn);
      endStmt (writer); // append
      if (builderReturn) {
        writer.returnThis ();
        endStmt (writer); // return this
      }
      writer = endBlock (writer); // method
    }
  }
  
  private void writeBuilderClassMethods (JavaWriter writer, final MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (!field.isRequired () || (field.getDefaultValue () != null)) {
        writeMutatorMethod (writer, true, field);
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
    final MessageDefinition ext = message.getExtends ();
    writer.classDef (true, "Builder", (ext != null) ? ext.getIdentifier () + ".Builder" : null, null);
    writer = beginBlock (writer); // builder class
    writeBuilderClassFields (writer, message);
    writePublicConstructor (writer, true, message);
    writeBuilderClassMethods (writer, message);
    writeBuilderClassBuildMethod (writer, message);
    writer = endBlock (writer); // builder class
  }
  
  private void writeProtectedConstructor (JavaWriter writer, final MessageDefinition message) throws IOException {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    writer.constructor ("protected", message.getName (), "final Builder builder");
    writer = beginBlock (writer); // constructor
    if (message.getExtends () != null) {
      writer.invoke ("super", "builder");
      endStmt (writer);
    }
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      writer.assignment ("this." + privateFieldName (field), "builder." + privateFieldName (field));
      endStmt (writer); // assignment
    }
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
    // special value substitutions for some types
    switch (type.getFudgeFieldType ()) {
    case FudgeTypeDictionary.INT_ARRAY_TYPE_ID :
      if (((FieldType.ArrayType)type).getBaseType () instanceof FieldType.EnumType) {
        final String temp1 = writer.localVariable ("int[]", true, "new int[" + value + ".length]");
        endStmt (writer);
        final String temp2 = writer.forEachIndex (temp1, "length");
        writer = beginBlock (writer);
        writer.assignment (temp1 + "[" + temp2 + "]", value + "[" + temp2 + "].getFudgeEncoding ()");
        endStmt (writer);
        writer = endBlock (writer);
        value = temp1;
      }
      break;
    case FudgeTypeDictionary.INDICATOR_TYPE_ID :
      writer.ifBool (value); // indicators are present if the bool we are using is set
      value = VALUE_INDICATOR;
      break;
    case FudgeTypeDictionary.INT_TYPE_ID :
      if (type instanceof FieldType.EnumType) {
        value = value + ".getFudgeEncoding ()";
      }
      break;
    case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID :
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
    }
    writer.invoke (msg, "add", name + ", " + ordinal + ", " + value);
    endStmt (writer);
  }
  
  private void writeToFudgeMsg (JavaWriter writer, final MessageDefinition message) throws IOException {
    writer.method (false, CLASS_FUDGEMSG, "toFudgeMsg", "final " + CLASS_FUDGECONTEXT + " context");
    writer = beginBlock (writer); // toFudgeMsg
    writer.ifNull ("context");
    writer.throwNullParameterException ("context");
    endStmt (writer);
    writer.namedLocalVariable (CLASS_FUDGEMSG, "msg", "context.newMessage ()");
    endStmt (writer);
    writer.invoke ("toFudgeMsg", "context, msg");
    endStmt (writer);
    writer.returnVariable ("msg");
    endStmt (writer);
    writer = endBlock (writer); // toFudgeMsg
    writer.method (false, "void", "toFudgeMsg", "final " + CLASS_FUDGECONTEXT + " context, final " + CLASS_MUTABLEFUDGEFIELDCONTAINER + " msg");
    writer = beginBlock (writer); // toFudgeMsg
    if (message.getExtends () != null) {
      writer.invoke ("super", "toFudgeMsg", "context, msg");
      endStmt (writer);
    }
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
  
  private String writeDecodeSimpleFudgeField (final JavaWriter writer, final String displayType, final String javaType, final MessageDefinition message, final String fieldData, final String fieldRef, final String assignTo, final String appendTo) throws IOException {
    writer.anonGetValue (fieldData);
    endStmt (writer);
    writer.anonIfNotInstanceOf (javaType);
    writer.throwInvalidFudgeFieldException (message, fieldRef, displayType, null);
    endStmt (writer);
    if (appendTo != null) {
      return "(" + javaType + ")fudge0";
    } else {
      writer.anonAssignment (assignTo, javaType);
      endStmt (writer);
      return assignTo;
    }
  }
  
  private void writeDecodeFudgeField (JavaWriter writer, final FieldType type, final MessageDefinition message, final String fieldData, final String fieldRef, String assignTo, final String appendTo) throws IOException {
    // TODO 2010-01-04 Andrew -- should we support intrinsic conversion from shorter to longer types, e.g. short[] to int[]? like we do for the single values
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType arrayType = (FieldType.ArrayType)type;
      final FieldType baseType = arrayType.getBaseType ();
      boolean checkLength = arrayType.isFixedLength ();
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
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfInstanceOf ("byte[]");
        writer.anonAssignment (assignTo, "byte[]");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "byte[]", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, "short[]", "short[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.INT_ARRAY_TYPE_ID : {
        if (baseType instanceof FieldType.EnumType) {
          final EnumDefinition enumDefinition = ((FieldType.EnumType)baseType).getEnumDefinition ();
          writer.anonGetValue (fieldData);
          endStmt (writer);
          writer.anonIfNotInstanceOf ("int[]");
          writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), null);
          endStmt (writer);
          if (appendTo != null) {
            assignTo = writer.localVariable (getJavaType (type, false), true);
            endStmt (writer);
          }
          writer.guard ();
          writer = beginBlock (writer); // try
          final String intArray = writer.localVariable ("int[]", true, "(int[])fudge0");
          endStmt (writer);
          writer.assignment (assignTo, "new " + enumDefinition.getIdentifier () + "[" + intArray + ".length]");
          endStmt (writer);
          final String index = writer.forEachIndex (intArray, "length");
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
          assignTo = writeDecodeSimpleFudgeField (writer, "int[]", "int[]", message, fieldData, fieldRef, assignTo, appendTo);
        }
        break;
      }
      case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, "long[]", "long[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, "float[]", "float[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID :
        assignTo = writeDecodeSimpleFudgeField (writer, "double[]", "double[]", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID :
        // arbitrary array
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfNotInstanceOf (CLASS_FUDGEMSG);
        writer.throwInvalidFudgeFieldException (message, fieldRef, "sub message (array)", null);
        endStmt (writer);
        final String subMessage = writer.localVariable (CLASS_FUDGEFIELDCONTAINER, true, "(" + CLASS_FUDGEFIELDCONTAINER + ")fudge0");
        endStmt (writer);
        if (appendTo != null) {
          // TODO 2010-01-06 Andrew -- we could call getNumFields on the subMessage and allocate a proper array once, but might that be slower if we have a FudgeMsg implementation that makes data available as soon as its received & decoded - i.e. a big array submessage would have to be decoded in its entirety to get the length
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
          if (checkLength) {
            writer.ifSizeNot (assignTo, "size ()", arrayType.getFixedLength ());
            writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), null);
            endStmt (writer);
            checkLength = false;
          }
          assignTo = toArray (writer, assignTo, (FieldType.ArrayType)type);
        }
        break;
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
      // check the array lengths if the spec required a specific length
      if (checkLength) {
        writer.ifSizeNot (assignTo, "length", arrayType.getFixedLength ());
        writer.throwInvalidFudgeFieldException (message, fieldRef, type.toString (), null);
        endStmt (writer);
      }
    } else if (type instanceof FieldType.MessageType) {
      final MessageDefinition msg = ((FieldType.MessageType)type).getMessageDefinition ();
      if (appendTo != null) {
        assignTo = writer.localVariable (msg.getIdentifier (), true);
        endStmt (writer);
      }
      writer.anonGetValue (fieldData);
      endStmt (writer);
      writer.anonIfNotInstanceOf (CLASS_FUDGEFIELDCONTAINER);
      writer.throwInvalidFudgeFieldException (message, fieldRef, msg.getName (), null);
      endStmt (writer);
      writer.guard ();
      writer = beginBlock (writer); // try
      writer.assignment (assignTo, msg.getIdentifier () + ".fromFudgeMsg ((" + CLASS_FUDGEFIELDCONTAINER + ")fudge0)");
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
      writer.anonGetValue (fieldData);
      endStmt (writer);
      writer.anonIfInstanceOf ("Integer");
      writer.anonAssignment (intValue, "Integer");
      endStmt (writer);
      writer.anonElseIfInstanceOf ("Short");
      writer.anonAssignment (intValue, "Short");
      endStmt (writer);
      writer.anonElseIfInstanceOf ("Byte");
      writer.anonAssignment (intValue, "Byte");
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
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfNotInstanceOf (CLASS_INDICATOR);
        writer.throwInvalidFudgeFieldException (message, fieldRef, "indicator", null);
        endStmt (writer);
        // using a boolean internally, so just set to true to indicate this is in the message
        if (appendTo != null) {
          assignTo = "true";
        } else {
          writer.assignment (assignTo, "true");
          endStmt (writer);
        }
        break;
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, "boolean", "Boolean", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.BYTE_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, "byte", "Byte", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.SHORT_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("short", true);
          endStmt (writer);
        }
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfInstanceOf ("Short");
        writer.anonAssignment (assignTo, "Short");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Byte");
        writer.anonAssignment (assignTo, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "short", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.INT_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("int", true);
          endStmt (writer);
        }
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfInstanceOf ("Integer");
        writer.anonAssignment (assignTo, "Integer");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Short");
        writer.anonAssignment (assignTo, "Short");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Byte");
        writer.anonAssignment (assignTo, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "int", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.LONG_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("long", true);
          endStmt (writer);
        }
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfInstanceOf ("Long");
        writer.anonAssignment (assignTo, "Long");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Integer");
        writer.anonAssignment (assignTo, "Integer");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Short");
        writer.anonAssignment (assignTo, "Short");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Byte");
        writer.anonAssignment (assignTo, "Byte");
        endStmt (writer);
        writer.elseThrowInvalidFudgeFieldException (message, fieldRef, "long", null);
        endStmt (writer);
        break;
      case FudgeTypeDictionary.FLOAT_TYPE_ID : {
        assignTo = writeDecodeSimpleFudgeField (writer, "float", "Float", message, fieldData, fieldRef, assignTo, appendTo);
        break;
      }
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        if (appendTo != null) {
          assignTo = writer.localVariable ("double", true);
          endStmt (writer);
        }
        writer.anonGetValue (fieldData);
        endStmt (writer);
        writer.anonIfInstanceOf ("Double");
        writer.anonAssignment (assignTo, "Double");
        endStmt (writer);
        writer.anonElseIfInstanceOf ("Float");
        writer.anonAssignment (assignTo, "Float");
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
    writer.assignmentConstruct (localName, getListType (field.getType (), true), "fudgeFields.size ()");
    endStmt (writer); // list construction
    final String fieldData = writer.forEach (CLASS_FUDGEFIELD, "fudgeFields");
    beginBlock (writer.getWriter ()); // iteration
    writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), fieldData, field.getName (), null, localName + ".add");
    endBlock (writer.getWriter ()); // iteration
  }
  
  private void writeGetFudgeFields (JavaWriter writer, final List<FieldDefinition> fields, boolean localAssign, boolean builder) throws IOException {
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
      writer.assignment (field.isRepeated () ? "fudgeFields" : "fudgeField", sbGetField.toString ());
      endStmt (writer); // field(s) assignment
      if (localAssign) {
        if (field.isRepeated ()) {
          writer.ifZero ("fudgeFields.size ()");
        } else {
          writer.ifNull ("fudgeField");
        }
        writer.throwInvalidFudgeFieldException (field.getOuterMessage (), field.getName (), "present", null);
        endStmt (writer); // if & throw
        writer.namedLocalVariable (getRealFieldType (field), localFieldName (field), null);
        endStmt (writer); // local field declaration
        if (field.isRepeated ()) {
          writeDecodeFudgeFieldsToList (writer, field, localFieldName (field));
        } else {
          writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), "fudgeField", field.getName (), localFieldName (field), null);
        }
      } else {
        if (field.isRepeated ()) {
          writer.ifGtZero ("fudgeFields.size ()");
          writer = beginBlock (writer); // if guard
          final String tempList = writer.localVariable (getListType (field.getType (), false), true);
          endStmt (writer); // temp variable
          writeDecodeFudgeFieldsToList (writer, field, tempList);
          if (builder) {
            writer.invoke ("fudgeBuilder", localFieldName (field), tempList);
          } else {
            writer.invoke ("fudgeObject", "set" + camelCaseFieldName (field), tempList);
          }
          endStmt (writer); // add to builder or object
        } else {
          writer.ifNotNull ("fudgeField");
          writer = beginBlock (writer); // if guard
          writeDecodeFudgeField (writer, field.getType (), field.getOuterMessage (), "fudgeField", field.getName (), null, builder ? "fudgeBuilder." + localFieldName (field) : "fudgeObject.set" + camelCaseFieldName (field));
        }
        writer = endBlock (writer); // if guard
      }
    }
  }
  
  private static final int F_REPEATED = 1;
  private static final int F_NONREPEATED = 2;
  
  private int getFudgeMsgFieldsAll (final MessageDefinition message, final List<FieldDefinition> required, final List<FieldDefinition> optional, final StringBuilder sbBuilderParams) {
    int flags = 0;
    if (message.getExtends () != null) {
      flags |= getFudgeMsgFieldsAll (message.getExtends (), required, optional, sbBuilderParams);
    }
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
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
        flags |= F_REPEATED;
      } else {
        flags |= F_NONREPEATED;
      }
    }
    return flags;
  }
  
  private void writeFromFudgeMsg (JavaWriter writer, final MessageDefinition message, final boolean useBuilder) throws IOException {
    //final Set<ConversionFunction> conversionFunctions = EnumSet.noneOf (ConversionFunction.class);
    final List<FieldDefinition> required = new LinkedList<FieldDefinition> ();
    final List<FieldDefinition> optional = new LinkedList<FieldDefinition> ();
    final StringBuilder sbBuilderParams = new StringBuilder ();
    int flags = getFudgeMsgFieldsAll (message, required, optional, sbBuilderParams);
    writer.method (true, message.getName (), "fromFudgeMsg", "final " + CLASS_FUDGEFIELDCONTAINER + " fudgeMsg");
    writer = beginBlock (writer); // fromFudgeMsg
    if ((flags & F_REPEATED) != 0) {
      writer.namedLocalVariable (CLASS_LIST + "<" + CLASS_FUDGEFIELD + ">", "fudgeFields", null);
      endStmt (writer); // fields declaration
    }
    if ((flags & F_NONREPEATED) != 0) {
      writer.namedLocalVariable (CLASS_FUDGEFIELD, "fudgeField", null);
      endStmt (writer); // field declaration
    }
    writeGetFudgeFields (writer, required, true, false);
    if (useBuilder) {
      writer.namedLocalVariable ("Builder", "fudgeBuilder", "new Builder (" + sbBuilderParams.toString () + ")");
      endStmt (writer); // objBuilder creation
      writeGetFudgeFields (writer, optional, false, true);
      writer.returnInvoke ("fudgeBuilder.build", null, null);
    } else {
      writer.namedLocalVariable (message.getName (), "fudgeObject", "new " + message.getName () + "(" + sbBuilderParams.toString () + ")");
      endStmt (writer); // obj creation
      writeGetFudgeFields (writer, optional, false, false);
      writer.returnVariable ("fudgeObject");
    }
    endStmt (writer); // create and return object
    endBlock (writer); // fromFudgeMsg
  }
  
  private void writeEquals (JavaWriter writer, final MessageDefinition message) throws IOException {
    writer.method (false, "boolean", "equals", "final Object o");
    writer = beginBlock (writer);
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    writer.ifNull ("o");
    writer.returnFalse ();
    endStmt (writer);
    writer.ifNotInstanceOf ("o", message.getName ());
    writer.returnFalse ();
    endStmt (writer);
    writer.namedLocalVariable (message.getName (), "msg", "(" + message.getName () + ")o");
    endStmt (writer);
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      final String a = privateFieldName (field);
      final String b = "msg." + a;
      final FieldType type = field.getType ();
      if (type instanceof FieldType.ArrayType) {
        if (field.isRepeated ()) {
          writer.ifNotNull (a);
          writer.ifNotNull (b);
          writer = beginBlock (writer);
          writer.ifBool (a + ".size () != " + b + ".size ()");
          writer.returnFalse (); // lists are different lengths
          endStmt (writer);
          final String i = writer.forEachIndex (a, "size ()");
          writer = beginBlock (writer); // for
          writer.ifNotBool (CLASS_ARRAYS + "." + (isObjectArray ((FieldType.ArrayType)type) ? "deepEquals" : "equals") + " (" + a + ".get (" + i + "), " + b + ".get (" + i + "))");
          writer.returnFalse ();
          endStmt (writer);
          writer = endBlock (writer); // for
          writer = endBlock (writer); // if
          writer.elseReturnFalse (); // a is not null, but b is null
          endStmt (writer);
          writer.elseIfNotNull (b);
          writer.returnFalse (); // a is null, b is not null
        } else {
          writer.ifNotBool (CLASS_ARRAYS + "." + (isObjectArray ((FieldType.ArrayType)type) ? "deepEquals" : "equals") + " (" + a + ", " + b + ")");
          writer.returnFalse ();
        }
      } else {
        if (isObject (type) || field.isRepeated ()) {
          writer.ifNotNull (a);
          writer.ifNotNull (b);
          writer = beginBlock (writer);
          writer.ifNotBool (a + ".equals (" + b + ")");
          writer.returnFalse (); // a is not equal to b
          endStmt (writer);
          writer = endBlock (writer);
          writer.elseReturnFalse (); // a is not null, but b is null
          endStmt (writer);
          writer.elseIfNotNull (b);
          writer.returnFalse (); // a is null, b is not null
        } else {
          writer.ifBool (a + " != " + b);
          writer.returnFalse ();
        }
      }
      endStmt (writer);
    }
    writer.returnTrue ();
    endStmt (writer);
    writer = endBlock (writer);
  }
  
  private void writeHashCode (JavaWriter writer, final MessageDefinition message) throws IOException {
    writer.method (false, "int", "hashCode", null);
    writer = beginBlock (writer);
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    writer.namedLocalVariable ("int", "hc", null);
    endStmt (writer);
    writer.assignment ("hc", "1");
    endStmt (writer);
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      final String name = privateFieldName (field);
      final FieldType type = field.getType ();
      if (type instanceof FieldType.ArrayType) {
        writer.assignment ("hc", "hc * 31");
        endStmt (writer);
        writer.ifNotNull (name);
        if (field.isRepeated ()) {
          final String repeated = writer.forEach (getJavaType (type, true), name);
          writer = beginBlock (writer);
          writer.assignment ("hc", "hc * 31");
          endStmt (writer);
          writer.assignment ("hc", "hc + " + CLASS_ARRAYS + "." + (isObjectArray ((FieldType.ArrayType)type) ? "deepHashCode" : "hashCode") + " (" + repeated + ")");
          endStmt (writer);
          writer = endBlock (writer);
        } else {
          writer.assignment ("hc", "hc + " + CLASS_ARRAYS + "." + (isObjectArray ((FieldType.ArrayType)type) ? "deepHashCode" : "hashCode") + " (" + name + ")");
          endStmt (writer);
        }
      } else {
        writer.assignment ("hc", "hc * 31");
        endStmt (writer);
        if (isObject (type) || field.isRepeated ()) {
          writer.ifNotNull (name);
          writer.assignment ("hc", "hc + " + name + ".hashCode ()");
        } else {
          switch (type.getFudgeFieldType ()) {
          case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
          case FudgeTypeDictionary.INDICATOR_TYPE_ID :
            writer.ifBool (name);
            writer.assignment ("hc", "hc + 1");
            break;
          default :
            writer.assignment ("hc", "hc + (int)" + name);
            break;
          }
        }
        endStmt (writer);
      }
    }
    writer.returnVariable ("hc");
    endStmt (writer);
    writer = endBlock (writer);
  }
  
  private void writeClone (JavaWriter writer, final MessageDefinition message) throws IOException {
    writer.method (false, message.getName (), "clone", null);
    writer = beginBlock (writer); // method
    if (message.getExtends () == null) {
      writer.guard ();
      writer = beginBlock (writer); // try
    }
    writer.returnInvoke ("super.clone", null, message.getName ());
    endStmt (writer);
    if (message.getExtends () == null) {
      writer = endBlock (writer); // try
      writer.catchCloneNotSupportedException ();
      writer = beginBlock (writer); // catch
      writer.throwAssertionError ("Cloning is definately supported");
      endStmt (writer);
      writer = endBlock (writer); // catch
    }
    writer = endBlock (writer); // method
  }

  /**
   * We must use a builder if there are immutable fields that:
   *   a) are optional; or
   *   b) have a default value
   * 
   * I.e. we omit the builder if it would just have a construct and no mutator methods
   */  
  private boolean useBuilderPattern (final MessageDefinition message) {
    final Iterator<FieldDefinition> fields = message.getFieldDefinitions ();
    while (fields.hasNext ()) {
      final FieldDefinition field = fields.next ();
      if (!field.isMutable ()) {
        if (!field.isRequired ()) return true; // optional fields - must use a Builder 
        if (field.getDefaultValue () != null) return true; // required field with default value - must use a Builder
      }
    }
    return false; // don't need a Builder
  }
  
  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, final MessageDefinition message, final IndentWriter iWriter) throws IOException {
    final JavaWriter writer = new JavaWriter (iWriter);
    final boolean useBuilder = useBuilderPattern (message);
    if (useBuilder) {
      writeBuilderClass (writer, message);
      writeProtectedConstructor (writer, message);
    } else {
      writePublicConstructor (writer, false, message);
    }
    writeToFudgeMsg (writer, message);
    writeFromFudgeMsg (writer, message, useBuilder);
  }

  @Override
  public void writeEnumImplementationDeclaration(final Compiler.Context context, EnumDefinition enumDefinition, IndentWriter iWriter) throws IOException {
    super.writeEnumImplementationDeclaration (context, enumDefinition, iWriter);
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
    writer.constructor ("private", enumDefinition.getName (), "final int fudgeEncoding");
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
    JavaWriter writer = beginClass (new JavaWriter (iWriter), taxonomy, CLASS_MAPFUDGETAXONOMY, null);
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
    writer.constructor ("private", taxonomy.getName (), null);
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