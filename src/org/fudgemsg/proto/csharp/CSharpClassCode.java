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
 * Code generator for the C# Fudge implementation. NOT FINISHED.
 * 
 * @author Andrew
 */
/* package */ class CSharpClassCode extends HeaderlessClassCode {
  
  /* package */ static final CSharpClassCode INSTANCE = new CSharpClassCode ();
  
  private static final String NAMESPACE_FUDGE = "Fudge";
  private static final String NAMESPACE_TAXON = "Fudge.Taxon";
  
  private static final String CLASS_MAPFUDGETAXONOMY = NAMESPACE_TAXON + ".MapFudgeTaxonomy";
  private static final String CLASS_FUDGEMSG = NAMESPACE_FUDGE + ".FudgeMsg";
  private static final String CLASS_FUDGECONTEXT = NAMESPACE_FUDGE + ".FudgeContext";
  
  private CSharpClassCode () {
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (CSharpLiteralCode.INSTANCE)))));
  }
  
  @Override
  public File getImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath, definition.getIdentifierArray());
    if (implementation == null) return null;
    return new File(implementation, definition.getName() + ".cs");
  }
  
  private void beginDefinition (final IndentWriter writer, final String languageElement, final Definition definition, final String extendsClass) throws IOException {
    if (definition.getOuterDefinition () == null) {
      final String namespace = definition.getNamespace ();
      if (namespace != null) {
        writer.write ("namespace " + namespace);
        beginBlock (writer); // namespace
      }
    }
    writer.write ("public " + languageElement + " " + definition.getName ());
    if (extendsClass != null) {
      writer.write (" : " + extendsClass);
    }
    beginBlock (writer); // class
    // TODO 2010-01-08 Andrew -- binding support
  }
  
  private void endDefinition (final IndentWriter writer, final Definition definition) throws IOException {
    endBlock (writer); // class
    if (definition.getOuterDefinition () == null) {
      if (definition.getNamespace () != null) endBlock (writer); // namespace 
    }
  }
  
  private void writeEquals (final IndentWriter writer, final MessageDefinition message) throws IOException {
    writer.write ("public bool Equals (" + message.getName () + " obj)");
    beginBlock (writer);
    writer.write ("if (obj == null) return false");
    endStmt (writer);
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      FieldType type = field.getType ();
      String left = privateFieldName (field);
      String right = "obj." + privateFieldName (field);
      if (isObject (type) || field.isRepeated ()) {
        int lvCount = 0;
        writer.write ("if (" + left + " != null)");
        beginBlock (writer); // if
        writer.write ("if (" + right + " == null) return false"); // L is not null, R is null
        endStmt (writer);
        if (field.isRepeated ()) {
          // iterate through the repeated fields
          final String lv = "i" + (lvCount++);
          writer.write ("if (" + left + ".Count != " + right + ".Count) return false"); // sizes differ
          endStmt (writer);
          writer.write ("for (int " + lv + " = 0; " + lv + " < " + right + ".Length; " + lv + "++) ");
          left = left + "[" + lv  +"]";
          right = right + "[" + lv + "]";
          beginBlock (writer);
        }
        while (type instanceof FieldType.ArrayType) {
          // iterate through the array elements
          final String lv = "i" + (lvCount++);
          writer.write ("if (" + left + ".Length != " + right + ".Length) return false"); // sizes differ
          endStmt (writer);
          type = ((FieldType.ArrayType)type).getBaseType ();
          writer.write ("for (int " + lv + " = 0; " + lv + " < " + left + ".Length; " + lv + "++) ");
          left = left + "[" + lv  +"]";
          right = right + "[" + lv + "]";
          beginBlock (writer);
        }
        if (isObject (type)) {
          writer.write ("if (!" + left + ".Equals (" + right + ")) return false");
        } else {
          writer.write ("if (" + left + " != " + right + ") return false");
        }
        endStmt (writer);
        // unwind the scopes from the iterations above
        while (lvCount > 0) {
          endBlock (writer);
          lvCount--;
        }
        endBlock (writer); // if
        writer.write ("else if (" + right + " != null) return false"); // a is null, b is not null
        // a and b both null is an ok condition - equality holds
      } else {
        writer.write ("if (" + left + " != " + right + ") return false");
      }
      endStmt (writer);
    }
    writer.write ("return true");
    endStmt (writer);
    endBlock (writer); // method
    writer.write ("public bool Equals (Object obj)");
    beginBlock (writer);
    writer.write ("return (obj is " + message.getName () + ") ? Equals ((" + message.getName () + ")obj) : false");
    endStmt (writer);
    endBlock (writer); // method
  }
  
  private boolean isObject (final FieldType type) {
    return ((type instanceof FieldType.ArrayType) || (type instanceof FieldType.MessageType));
  }
  
  private String typeString (final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType)type;
      return typeString (array.getBaseType ()) + "[]";
    } else if (type instanceof FieldType.EnumType) {
      return ((FieldType.EnumType)type).getEnumDefinition ().getIdentifier ();
    } else if (type instanceof FieldType.MessageType) {
      return ((FieldType.MessageType)type).getMessageDefinition ().getIdentifier ();
    } else if (type instanceof FieldType.UserType) {
      return ((FieldType.UserType) type).getTypeDefinition().getIdentifier();
    } else {
      switch (type.getFudgeFieldType ()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID :
        return "bool";
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
        return "bool";
      case FudgeTypeDictionary.BYTE_TYPE_ID :
        return "sbyte";
      case FudgeTypeDictionary.SHORT_TYPE_ID :
        return "short";
      case FudgeTypeDictionary.INT_TYPE_ID :
        return "int";
      case FudgeTypeDictionary.LONG_TYPE_ID :
        return "long";
      case FudgeTypeDictionary.FLOAT_TYPE_ID :
        return "float";
      case FudgeTypeDictionary.DOUBLE_TYPE_ID :
        return "double";
      case FudgeTypeDictionary.STRING_TYPE_ID :
        return "String";
      case FudgeTypeDictionary.DATE_TYPE_ID :
        return "FudgeDate";
      case FudgeTypeDictionary.DATETIME_TYPE_ID :
        return "DateTime";
      case FudgeTypeDictionary.TIME_TYPE_ID :
        return "FudgeTime";
      default :
        throw new IllegalStateException ("type '" + type + "' is not an expected type (fudge field type " + type.getFudgeFieldType () + ")");
      }
    }
  }
  
  private String realTypeString (final FieldDefinition field, final boolean concrete) {
    final String type = typeString (field.getType ());
    if (field.isRepeated ()) {
      // TODO 2010-01-11 Andrew -- a list of the field
      return (concrete ? "concrete-" : "") + "list-of " + type; 
    } else {
      return type;
    }
  }
  
  private void writeGetHashCode (final IndentWriter writer, final MessageDefinition message) throws IOException {
    writer.write ("public int GetHashCode ()");
    beginBlock (writer);
    writer.write ("int hc = 1");
    endStmt (writer);
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      FieldType type = field.getType ();
      String name = privateFieldName (field);
      int lvCount = 0;
      writer.write ("hc *= 31");
      endStmt (writer);
      if (field.isRepeated ()) {
        // iterate through repeated fields
        final String lv = "i" + (lvCount++);
        writer.write ("if (" + name + " != null) for (int " + lv + " = 0; lv < " + name + ".Length; " + lv + "++)");
        beginBlock (writer);
        writer.write ("hc *= 31");
        endStmt (writer);
        name = name + "[" + lv + "]";
      }
      while (type instanceof FieldType.ArrayType) {
        // iterate through the array elements
        final String lv = "i" + (lvCount++);
        writer.write ("if (" + name + " != null) for (int " + lv + " = 0; lv < " + name + ".Length; " + lv + "++)");
        beginBlock (writer);
        writer.write ("hc *= 31");
        endStmt (writer);
        type = ((FieldType.ArrayType)type).getBaseType ();
        name = name + "[" + lv + "]";
      }
      if (isObject (type)) {
        writer.write ("if (" + name + " != null) hc += " + name + ".GetHashCode ()");
      } else {
        switch (type.getFudgeFieldType ()) {
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID :
        case FudgeTypeDictionary.INDICATOR_TYPE_ID :
          writer.write ("if (" + name + ") hc++");
          break;
        default :
          writer.write ("hc += " + name);
          break;
        }
      }
      endStmt (writer);
      // unwind the scopes from iterations above
      while (lvCount > 0) {
        endBlock (writer);
        lvCount--;
      }
    }
    writer.write ("return hc");
    endStmt (writer);
    endBlock (writer);
  }
  
  @Override
  public void beginClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration (context, message, writer);
    final MessageDefinition ext = message.getExtends ();
    beginDefinition (writer, "class", message, (ext != null) ? ext.getIdentifier () : null);
  }
  
  @Override
  public void endClassImplementationDeclaration (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    writeEquals (writer, message);
    writeGetHashCode (writer, message);
    endDefinition (writer, message);
  }
  
  @Override
  public void writeClassImplementationAttribute (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    writer.write ("private ");
    if (!field.isMutable ()) writer.write ("readonly ");
    writer.write (typeString (field.getType ()) + " " + privateFieldName (field));
    endStmt (writer);
  }
  
  private void writeDefensiveAssignment (final IndentWriter writer, final FieldType type, final String target, final String source, int lvCount) throws IOException {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType)type;
      final FieldType baseType = array.getBaseType ();
      writer.write (source + " = shallow-copy-of-array (" + source + ")"); // TODO
      endStmt (writer);
      if (isObject (baseType)) {
        final String lv = "fudge" + (lvCount++);
        writer.write ("for (int " + lv + " = 0; " + lv + " < " + source + ".Length; " + lv + "++)");
        beginBlock (writer); // for
        writeDefensiveAssignment (writer, baseType, source + "[" + lv + "]", source + "[" + lv + "]", lvCount + 1);
        endBlock (writer); // for
      }
      // TODO 2010-01-11 Andrew -- raise an error if size of array is wrong
      writer.write (target + " = " + source);
      endStmt (writer);
    } else if (type instanceof FieldType.MessageType) {
      writer.write (target + " = " + source + ".Clone ()");
      endStmt (writer);
    } else {
      writer.write (target + " = " + source);
      endStmt (writer);
    }
  }
  
  private void writeMutatorAssignment (final IndentWriter writer, final FieldDefinition field, String value) throws IOException {
    if (field.isRepeated ()) {
      writer.write ("if (" + value + " == null) ");
      if (field.isRequired ()) {
        writer.write ("throw new ArgumentNullException (\"Repeated field list for required field cannot be null\", \"" + value + "\")");
      } else {
        writer.write (privateFieldName (field) + " = null");
      }
      endStmt (writer);
      writer.write ("else");
      beginBlock (writer); // elseif
      writer.write (value + " = shallow-copy-of-list (" + value + ")"); // TODO
      endStmt (writer);
      if (field.isRequired ()) {
        writer.write ("if (" + value + ".Count == 0) throw new ArgumentException (\"Repeated field list for required field cannot be empty\", \"" + value + "\")");
        endStmt (writer);
      }
      writer.write ("for (int fudge0 = 0; fudge0 < " + value + ".Count; fudge0++)");
      beginBlock (writer); // for
      writer.write ("if (" + value + "[fudge0] == null) throw new ArgumentNullException (\"Repeated field list element cannot be null\", \"" + value + "\")");
      endStmt (writer);
      if (isObject (field.getType ())) {
        writeDefensiveAssignment (writer, field.getType (), value + "[fudge0]", value + "[fudge0]", 1);
      }
      endBlock (writer); // for
      writer.write (privateFieldName (field) + " = " + value);
      endStmt (writer);
    } else {
      if (isObject (field.getType ()) && field.isRequired ()) {
        writer.write ("if (" + value + " == null) throw new ArgumentNullException (\"Required field cannot be null\", \"" + value + "\")");
        endStmt (writer);
      }
      writeDefensiveAssignment (writer, field.getType (), privateFieldName (field), value, 0);
    }
  }
  
  @Override
  public void writeClassImplementationAccessor (final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    writer.write ("public " + typeString (field.getType ()) + " " + camelCaseFieldName (field));
    beginBlock (writer);
    writer.write ("get");
    beginBlock (writer); // get
    writer.write ("return " + privateFieldName (field));
    endStmt (writer);
    endBlock (writer); // get
    if (field.isMutable ()) {
      writer.write ("set");
      beginBlock (writer); // set
      writeMutatorAssignment (writer, field, "value");
      endBlock (writer); // set
    }
    // TODO 2010-01-11 Andrew -- deal with repeated fields properly (get => get (0), get (n), add, count) 
    endBlock (writer);
  }
  
  private void writeToFudgeMsg (final IndentWriter writer, final MessageDefinition message) throws IOException {
    writer.write ("public " + CLASS_FUDGEMSG + " toFudgeMsg (" + CLASS_FUDGECONTEXT + " context)");
    beginBlock (writer);
    writer.write (CLASS_FUDGEMSG + " fudgeMsg = context.newMessage ()");
    endStmt (writer);
    // TODO 2010-01-11 Andrew -- add fields to the fudge message
    writer.write ("return fudgeMsg");
    endStmt (writer);
    endBlock (writer);
  }
  
  private void writeFromFudgeMsg (final IndentWriter writer, final MessageDefinition message, final boolean useBuilder) throws IOException {
    writer.write ("public static " + message.getName () + " fromFudgeMsg (" + CLASS_FUDGEMSG + " msg)");
    beginBlock (writer);
    // TODO 2010-01-11 Andrew -- decode the message fields and invoke the correct construction paradigm
    endBlock (writer);
  }

  /**
   * We must use a builder if there are immutable fields that:
   *   a) are optional; or
   *   b) have a default value
   * 
   * I.e. we omit the builder if it would just have a construct and no mutator methods
   */  
  private boolean useBuilderPattern (final MessageDefinition message) {
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      if (!field.isMutable ()) {
        if (!field.isRequired ()) return true; // optional fields - must use a Builder 
        if (field.getDefaultValue () != null) return true; // required field with default value - must use a Builder
      }
    }
    return false; // don't need a Builder
  }

  /**
   * Writes out the constructor for either Builder or the main message if the builder pattern is not being used.
   */
  private void writePublicConstructor (final IndentWriter writer, final boolean builder, final MessageDefinition message) throws IOException {
    final List<FieldDefinition> defaultValues = new LinkedList<FieldDefinition> ();
    final List<FieldDefinition> required = new LinkedList<FieldDefinition> ();
    writer.write ("public " + (builder ? "Builder" : message.getName ()) + " (");
    boolean first = true;
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      if (field.getDefaultValue () != null) {
        defaultValues.add (field);
      } else if (field.isRequired ()) {
        required.add (field);
        if (first) {
          first = false;
        } else {
          writer.write (", ");
        }
        writer.write (realTypeString (field, false) + " " + localFieldName (field));
      }
    }
    writer.write (')');
    beginBlock (writer); // constructor
    for (FieldDefinition field : required) {
      writeMutatorAssignment (writer, field, localFieldName (field));
    }
    for (FieldDefinition field : defaultValues) {
      if (builder) {
        writer.write (localFieldName (field) + " (" + getLiteral (field.getDefaultValue ()) + ")");
      } else {
        writer.write (camelCaseFieldName (field) + ".set (" + getLiteral (field.getDefaultValue ()) + ")");
      }
      endStmt (writer);
    }
    endBlock (writer); // constructor
  }
  
  private void writeBuilderClass (final IndentWriter writer, final MessageDefinition message) throws IOException {
    // TODO 2010-01-11 Andrew -- implement this
  }
  
  private void writePrivateConstructor (final IndentWriter writer, final MessageDefinition message) throws IOException {
    // TODO 2010-01-11 Andrew -- implement this
  }
  
  @Override
  public void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    final boolean useBuilder = useBuilderPattern (message);
    if (useBuilder) {
      writeBuilderClass (writer, message);
      writePrivateConstructor (writer, message);
    } else {
      writePublicConstructor (writer, false, message);
    }
    writeToFudgeMsg (writer, message);
    writeFromFudgeMsg (writer, message, useBuilder);
  }
  
  @Override
  public void writeEnumImplementationDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    super.writeEnumImplementationDeclaration (context, enumDefinition, writer);
    final String superType;
    switch (enumDefinition.getType ()) {
    case DEFAULT : superType = null; break;
    case INTEGER_ENCODED : superType = "int"; break;
    case STRING_ENCODED : superType = "string"; break;
    default : throw new IllegalStateException ("Unexpected value for enum type '" + enumDefinition.getType () + "'");
    }
    beginDefinition (writer, "enum", enumDefinition, superType);
    boolean first = true;
    for (Map.Entry<String,LiteralValue> element : enumDefinition.getElements ()) {
      if (first) {
        first = false;
      } else {
        writer.write (",");
        writer.newLine ();
      }
      writer.write (element.getKey ());
      if (superType != null) writer.write (" = " + getLiteral (element.getValue ()));
    }
    endStmt (writer);
    endDefinition (writer, enumDefinition);
  }
  
  @Override
  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomyDefinition, final IndentWriter writer) throws IOException {
    super.writeTaxonomyImplementationDeclaration (context, taxonomyDefinition, writer);
    beginDefinition (writer, "class", taxonomyDefinition, CLASS_MAPFUDGETAXONOMY);
    writer.write ("private static readonly " + taxonomyDefinition.getName () + " instance = new " + taxonomyDefinition.getName () + "()");
    endStmt (writer);
    writer.write ("public static " + taxonomyDefinition.getName () + " Instance");
    beginBlock (writer); // Instance
    writer.write ("get");
    beginBlock (writer); // get
    writer.write ("return instance");
    endStmt (writer);
    endBlock (writer); // get
    endBlock (writer); // Instance
    final StringBuilder sbOrdinals = new StringBuilder ();
    final StringBuilder sbStrings = new StringBuilder ();
    for (Map.Entry<String,Integer> element : taxonomyDefinition.getElements ()) {
      final String name = element.getKey ();
      writer.write ("public constant string STR_" + name + " = \"" + name + "\"");
      endStmt (writer); // STR_ decl
      if (sbStrings.length () > 0) sbStrings.append (", ");
      sbStrings.append ("STR_").append (name);
      writer.write ("public constant short VAL_" + name + " = " + element.getValue ().toString ());
      endStmt (writer); // VAL_ decl
      if (sbOrdinals.length () > 0) sbOrdinals.append (", ");
      sbOrdinals.append ("VAL_").append (name);
    }
    writer.write ("private " + taxonomyDefinition.getName () + " () : base (new int[] { " + sbOrdinals.toString () + " }, new string[] { " + sbStrings.toString () + " })");
    beginBlock (writer); // constructor
    // no op
    endBlock (writer); // constructor
    endDefinition (writer, taxonomyDefinition);
  }
  
}