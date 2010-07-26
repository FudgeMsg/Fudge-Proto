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
import java.util.ArrayList;
import java.util.HashMap;
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
import org.fudgemsg.proto.TypeDefinition;
import org.fudgemsg.proto.java.JavaCodeGenerator.ProtoBinding;
import org.fudgemsg.proto.proto.DocumentedClassCode;
import org.fudgemsg.proto.proto.HeaderlessClassCode;

/**
 * Code generator for the Java Fudge implementation
 * 
 * @author Andrew
 */
/* package */class JavaClassCode extends HeaderlessClassCode {

  // TODO 2010-01-07 Andrew -- we don't need the JavaWriter class; temporary local variable names can be tracked using the call stack, and the other methods can be brought back in here

  /* package */static final JavaClassCode INSTANCE = new JavaClassCode();

  // The constants below are for safety and convenience in Java world, but the approach isn't portable to other codegens written in Java.

  private static final String CLASS_COLLECTIONS = java.util.Collections.class.getName();
  private static final String CLASS_COLLECTION = java.util.Collection.class.getName();
  private static final String CLASS_FUDGEFIELDCONTAINER = org.fudgemsg.FudgeFieldContainer.class.getName();
  private static final String CLASS_MUTABLEFUDGEFIELDCONTAINER = org.fudgemsg.MutableFudgeFieldContainer.class
      .getName();
  private static final String CLASS_MAPFUDGETAXONOMY = org.fudgemsg.taxon.MapFudgeTaxonomy.class.getName();
  private static final String CLASS_ARRAYLIST = java.util.ArrayList.class.getName();
  private static final String CLASS_FUDGEMESSAGEFACTORY = org.fudgemsg.FudgeMessageFactory.class.getName();
  private static final String CLASS_FUDGEDESERIALISATIONCONTEXT = org.fudgemsg.mapping.FudgeDeserializationContext.class
      .getName();
  private static final String CLASS_FUDGESERIALISATIONCONTEXT = org.fudgemsg.mapping.FudgeSerializationContext.class
      .getName();
  private static final String CLASS_FUDGETAXONOMY = org.fudgemsg.taxon.FudgeTaxonomy.class.getName();
  private static final String CLASS_LIST = java.util.List.class.getName();
  private static final String CLASS_ARRAYS = java.util.Arrays.class.getName();
  private static final String CLASS_LISTITERATOR = java.util.ListIterator.class.getName();
  private static final String CLASS_FUDGEFIELD = org.fudgemsg.FudgeField.class.getName();
  private static final String CLASS_INDICATOR = org.fudgemsg.types.IndicatorType.class.getName();
  private static final String CLASS_TOSTRINGBUILDER = org.apache.commons.lang.builder.ToStringBuilder.class.getName();
  private static final String CLASS_TOSTRINGSTYLE = org.apache.commons.lang.builder.ToStringStyle.class.getName();
  private static final String CLASS_SERIALIZABLE = java.io.Serializable.class.getName();
  private static final String CLASS_DATETIMEPROVIDER = "javax.time.calendar.DateTimeProvider";
  private static final String CLASS_DATEPROVIDER = "javax.time.calendar.DateProvider";
  private static final String CLASS_TIMEPROVIDER = "javax.time.calendar.TimeProvider";
  private static final String CLASS_FUDGESTRINGTYPE = org.fudgemsg.types.StringFieldType.class.getName();

  private static final String VALUE_INDICATOR = CLASS_INDICATOR + ".INSTANCE";

  private JavaClassCode() {
    super(new DocumentedClassCode(blockCodeDelegate(new JavaBlockCode(literalCodeDelegate(JavaLiteralCode.INSTANCE)))));
  }

  private String messageDelegateName(final MessageDefinition message) {
    final String delegate = ProtoBinding.DELEGATE.get(message);
    return (delegate != null) ? delegate : message.getName();
  }

  private JavaWriter beginClass(JavaWriter writer, final Definition definition, final String extendsClass,
      String interfaceClass) throws IOException {
    if (definition.getOuterDefinition() == null) {
      final String namespace = definition.getNamespace();
      if (namespace != null) {
        writer.packageDef(namespace);
        endStmt(writer);
      }
    }
    final String imports = ProtoBinding.IMPORTS.get(definition);
    if (imports != null) {
      for (String library : imports.split(",\\s*")) {
        writer.importLib(library.trim());
        endStmt(writer);
      }
    }
    // TODO 2010-01-13 Andrew -- need to support the Javadoc-style annotations in the proto files and write out javadoc for Java classes 
    final String extraImplements = ProtoBinding.IMPLEMENTS.get(definition);
    if (extraImplements != null) {
      if (interfaceClass == null) {
        interfaceClass = extraImplements;
      } else {
        interfaceClass = interfaceClass + ", " + extraImplements;
      }
    }
    writer.classDef((definition instanceof MessageDefinition) && ((MessageDefinition) definition).isAbstract(),
        definition.getOuterDefinition() != null, definition.getName(), extendsClass, interfaceClass);
    writer = beginBlock(writer); // class definition
    final String bodyCode = ProtoBinding.BODY.get(definition);
    if (bodyCode != null) {
      writer.getWriter().write(bodyCode);
      writer.getWriter().newLine();
    }
    return writer;
  }

  @Override
  public void beginClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message,
      IndentWriter writer) throws IOException {
    super.beginClassImplementationDeclaration(context, message, writer);
    final MessageDefinition ext = message.getExtends();
    beginClass(new JavaWriter(writer), message, (ext != null) ? ext.getIdentifier() : null, CLASS_SERIALIZABLE);
    long serialVersionUID = 1;
    for (FieldDefinition field : message.getFieldDefinitions()) {
      serialVersionUID *= 31;
      serialVersionUID += field.getName().hashCode();
      serialVersionUID *= 31;
      serialVersionUID += realTypeString(field, true).hashCode();
    }
    writer.write("private static final long serialVersionUID = " + serialVersionUID + "l");
    endStmt(writer);
  }

  @Override
  public void endClassImplementationDeclaration(final Compiler.Context context, MessageDefinition message,
      IndentWriter writer) throws IOException {
    endBlock(writer); // class definition
  }

  @Override
  public File getImplementationFile(final Compiler.Context context, Definition definition, File targetPath)
      throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath, definition.getIdentifierArray());
    if (implementation == null)
      return null;
    return new File(implementation, definition.getName() + ".java");
  }

  private String fieldMethodName(final FieldDefinition field, final String prefix) {
    final StringBuilder sb = new StringBuilder();
    if (prefix != null) {
      sb.append(prefix).append(camelCaseFieldName(field));
    } else {
      sb.append(localFieldName(field));
    }
    return sb.toString();
  }

  @Override
  public void writeClassImplementationAccessor(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    JavaWriter jWriter = new JavaWriter(writer);
    final String attribute = privateFieldName(field);
    jWriter.method("public", realTypeString(field, false), fieldMethodName(field, "get"), null);
    jWriter = beginBlock(jWriter); // accessor
    if (field.isRepeated()) {
      // repeated fields, return an immutable list
      if (!field.isRequired()) {
        writer.write("if (" + attribute + " != null)");
        beginBlock(writer);
      }
      writer.write("return " + CLASS_COLLECTIONS + ".unmodifiableList (" + attribute + ")");
      if (!field.isRequired()) {
        endStmt(writer);
        endBlock(writer);
        writer.write("else return null");
      }
    } else {
      // non-repeated fields, return attribute directly
      jWriter.returnVariable(attribute);
    }
    endStmt(jWriter); // return
    jWriter = endBlock(jWriter); // accessor
    if (field.isMutable()) {
      writeMutatorMethod(writer, false, field);
    }
  }

  private String genericTypeString(final String javaClass, final FieldType type, final boolean concrete) {
    final StringBuilder sb = new StringBuilder(javaClass);
    sb.append('<');
    if (!concrete)
      sb.append("? extends ");
    sb.append(typeString(type, true)).append('>');
    return sb.toString();
  }

  private String listTypeString(final FieldType type, final boolean concrete) {
    return genericTypeString(concrete ? CLASS_ARRAYLIST : CLASS_LIST, type, true);
  }

  private String realTypeString(final FieldDefinition field, final boolean generic) {
    if (field.isRepeated()) {
      return generic ? genericTypeString(CLASS_COLLECTION, field.getType(), false) : listTypeString(field.getType(),
          false);
    } else {
      return typeString(field.getType(), !field.isRequired());
    }
  }

  private String fieldKey(final FieldDefinition field) {
    return fieldConstant(field) + "_KEY";
  }

  private String fieldOrdinal(final FieldDefinition field) {
    return fieldConstant(field) + "_ORDINAL";
  }

  private String fieldConstant(final FieldDefinition field) {
    final StringBuilder sb = new StringBuilder();
    final String name = field.getName();
    boolean lowercase = false;
    for (int i = 0; i < name.length(); i++) {
      final char c = name.charAt(i);
      if (Character.isUpperCase(c)) {
        if (lowercase) {
          sb.append('_');
          lowercase = false;
        }
        sb.append(c);
      } else if (c == '_') {
        sb.append(c);
        lowercase = false;
      } else {
        sb.append(Character.toUpperCase(c));
        lowercase = true;
      }
    }
    return sb.toString();
  }

  @Override
  public void writeClassImplementationAttribute(final Compiler.Context context, final FieldDefinition field,
      final IndentWriter writer) throws IOException {
    writer.write("private ");
    if (!field.isMutable()) {
      writer.write("final ");
    }
    writer.write(realTypeString(field, false) + " " + privateFieldName(field));
    endStmt(writer); // attribute decl
    if (field.getOrdinal() != null) {
      writer.write("public static final int " + fieldOrdinal(field) + " = " + field.getOrdinal());
    } else {
      writer.write("public static final String " + fieldKey(field) + " = \"" + field.getName() + "\"");
    }
    endStmt(writer); // public field name/ordinal
    // TODO 2010-01-26 Andrew -- if the message references a specific taxonomy, we should use references to the string place holders there instead of local ones
  }

  private void writeDefaultValues(final Compiler.Context context, final IndentWriter writer,
      final MessageDefinition message) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getDefaultValue() != null) {
        writer.write("public static final " + realTypeString(field, false) + " " + fieldConstant(field) + " = "
            + getLiteral(field.getDefaultValue().assignmentTo(context, field.getType())));
        endStmt(writer);
      }
    }
  }

  private void writeBuilderClassFields(JavaWriter writer, MessageDefinition message) throws IOException {
    final MessageDefinition superMessage = message.getExtends();
    if (superMessage != null) {
      if (!useBuilderPattern(superMessage)) {
        if (!superMessage.isExternal()) {
          final List<FieldDefinition> superFields = getAllFields(false, superMessage, null, null);
          if (superFields != null) {
            for (FieldDefinition field : superFields) {
              writer.attribute(false, realTypeString(field, false), privateFieldName(field));
              endStmt(writer);
            }
          }
        }
        if (message.hasExternalMessageReferences()) {
          writer.attribute(false, CLASS_FUDGEDESERIALISATIONCONTEXT, "_fudgeContext");
          endStmt(writer);
          writer.method("protected", CLASS_FUDGEDESERIALISATIONCONTEXT, "getFudgeContext", null);
          writer = beginBlock(writer);
          writer.returnVariable("_fudgeContext");
          endStmt(writer);
          writer = endBlock(writer);
        }
        writer.attribute(false, CLASS_FUDGEFIELDCONTAINER, "_fudgeRoot");
        endStmt(writer);
        writer.method("protected", CLASS_FUDGEFIELDCONTAINER, "getFudgeRoot", null);
        writer = beginBlock(writer);
        writer.returnVariable("_fudgeRoot");
        endStmt(writer);
        writer = endBlock(writer);
      }
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() == null) {
        writer.attribute(false, realTypeString(field, false), privateFieldName(field));
        endStmt(writer); // builder field decl
      }
    }
  }

  private Map<String, FieldDefinition> getOverrideMap(final MessageDefinition message,
      Map<String, FieldDefinition> overrides) {
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        if (overrides == null) {
          overrides = new HashMap<String, FieldDefinition>();
        }
        if (!overrides.containsKey(field.getName())) {
          overrides.put(field.getName(), field);
        }
      }
    }
    return overrides;
  }

  private List<FieldDefinition> getAllFields(final boolean includeOptional, final MessageDefinition message,
      List<FieldDefinition> params, Map<String, FieldDefinition> overrides) {
    if (message == null) {
      return params;
    }
    overrides = getOverrideMap(message, overrides);
    params = getAllFields(includeOptional, message.getExtends(), params, overrides);
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        continue;
      }
      if (overrides != null) {
        final FieldDefinition override = overrides.get(field.getName());
        if (override != null) {
          field = override;
        }
      }
      if (includeOptional || (field.isRequired() && (field.getDefaultValue() == null))) {
        if (params == null) {
          params = new LinkedList<FieldDefinition>();
        }
        params.add(field);
      }
    }
    return params;
  }

  private String fieldsToList(final List<FieldDefinition> fields, final boolean includeType) {
    final StringBuilder sb = new StringBuilder();
    for (FieldDefinition field : fields) {
      if (sb.length() != 0)
        sb.append(", ");
      if (includeType)
        sb.append(realTypeString(field, true)).append(' ');
      sb.append(localFieldName(field));
    }
    return sb.toString();
  }

  /**
   * Writes out the constructor for either Builder or the main message
   */
  private void writePublicConstructor(final Compiler.Context context, final IndentWriter writer, final boolean builder,
      final MessageDefinition message)
      throws IOException {
    final MessageDefinition superMessage = message.getExtends();
    final Map<String,FieldDefinition> overrideMap = getOverrideMap (message, null);
    final List<FieldDefinition> superFields = getAllFields(false, superMessage, null, overrideMap);
    final List<FieldDefinition> requiredFields = new LinkedList<FieldDefinition>();
    final List<FieldDefinition> defaultFields = new LinkedList<FieldDefinition>();
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getDefaultValue() != null) {
        defaultFields.add(field);
      } else if (field.isRequired()) {
        requiredFields.add(field);
      }
    }
    writer.write(((builder || (ProtoBinding.DELEGATE.get(message) == null)) ? "public " : "protected ")
        + (builder ? "Builder" : message.getName()) + " (");
    if (superFields != null) {
      writer.write(fieldsToList(superFields, true));
      if (requiredFields.size() > 0)
        writer.write(", ");
    }
    writer.write(fieldsToList(requiredFields, true));
    writer.write(')');
    beginBlock(writer); // constructor
    if (superMessage != null) {
      if (builder && !useBuilderPattern(superMessage)) {
        if (superFields != null) {
          for (FieldDefinition field : superFields) {
            writer.write(privateFieldName(field) + " = " + localFieldName(field));
            endStmt(writer);
          }
        }
      } else {
        // we have a superclass constructor
        final List<FieldDefinition> realSuperFields = getAllFields(false, superMessage, null, null);
        if (realSuperFields != null) {
          writer.write("super (");
          boolean first = true;
          for (FieldDefinition field : realSuperFields) {
            if (first) {
              first = false;
            } else {
              writer.write(", ");
            }
            if ((superFields != null) && superFields.contains(field)) {
              writer.write(localFieldName(field));
            } else {
              final FieldDefinition override = overrideMap.get(field.getName());
              if (override.getDefaultValue() != null) {
                writer.write(fieldConstant(override));
                defaultFields.remove(override);
              } else if (override.isRequired()) {
                writer.write(localFieldName(override));
              }
            }
          }
          writer.write(")");
          endStmt(writer);
        }
      }
    }
    for (FieldDefinition field : requiredFields) {
      if (builder) {
        writer.write(fieldMethodName(field, null) + " (" + localFieldName(field) + ")");
        endStmt(writer);
      } else {
        writeMutatorAssignment(writer, field, localFieldName(field), false, true);
      }
    }
    for (FieldDefinition field : defaultFields) {
      writer.write(fieldMethodName(field, builder ? null : "set") + " (" + fieldConstant(field) + ")");
      endStmt(writer);
    }
    endBlock(writer); // constructor
  }

  private List<FieldDefinition> noOverrides (final List<FieldDefinition> list) {
    List<FieldDefinition> substitute = null;
    for (FieldDefinition field : list) {
      if (field.getOverride () != null) {
        if (substitute == null) {
          substitute = new ArrayList<FieldDefinition> (list.size ());
          for (FieldDefinition field2 : list) {
            if (field2.getOverride() == null) {
              substitute.add(field2);
            }
          }
          return substitute;
        }
      }
    }
    return list;
  }

  /**
   * Writes out a constructor which accepts all fields (if not already catered for in the non-builder approach).
   */
  private void writeFullPublicConstructor(final IndentWriter writer, final boolean builder,
      final MessageDefinition message) throws IOException {
    final List<FieldDefinition> thisFields = noOverrides(message.getFieldDefinitions());
    final List<FieldDefinition> superFields = getAllFields(true, message.getExtends(), null, null);
    if (!builder) {
      int totalParamCount = thisFields.size();
      if (superFields != null)
        totalParamCount += superFields.size();
      final List<FieldDefinition> requiredFields = getAllFields(false, message, null, null);
      int requiredParamCount = 0;
      if (requiredFields != null)
        requiredParamCount += requiredFields.size();
      if (requiredParamCount == totalParamCount)
        return;
    }
    writer.write("public " + message.getName() + " (");
    if (superFields != null) {
      writer.write(fieldsToList(superFields, true));
      if (thisFields.size() > 0)
        writer.write(", ");
    }
    writer.write(fieldsToList(thisFields, true));
    writer.write(')');
    beginBlock(writer); // constructor
    if (superFields != null) {
      writer.write("super (" + fieldsToList(superFields, false) + ")");
      endStmt(writer);
    }
    for (FieldDefinition field : thisFields) {
      writeMutatorAssignment(writer, field, localFieldName(field), false, true);
    }
    endBlock(writer); // constructor
  }

  private void writeCheckArrayLength(final IndentWriter writer, final String variable, final String displayVariable,
      final FieldType.ArrayType array, final int lvCount) throws IOException {
    if (array.isFixedLength()) {
      writer.write("if (" + variable + ".length != " + array.getFixedLength()
          + ") throw new IllegalArgumentException (\"'" + displayVariable + "' is not the expected length ("
          + array.getFixedLength() + ")\")");
      endStmt(writer);
    }
    if (array.isDeepFixedLength()) {
      final String lv = "fudge" + lvCount;
      writer.write("for (" + typeString(array.getBaseType(), false) + " " + lv + " : " + variable + ")");
      beginBlock(writer);
      writeCheckArrayLength(writer, lv, displayVariable + "[]", (FieldType.ArrayType) array.getBaseType(), lvCount + 1);
      endBlock(writer);
    }
  }

  private String writeDefensiveCopy(final IndentWriter writer, final FieldType type, String source,
      boolean sourceIsFinal, final String displayName, int lvCount, boolean includeChecks) throws IOException {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType) type;
      final FieldType baseType = array.getBaseType();
      final String copyExpr = CLASS_ARRAYS + ".copyOf (" + source + ", " + source + ".length)";
      if ((!includeChecks || !(array.isFixedLength() || array.isDeepFixedLength())) && !isBigObject(baseType)) {
        // shallow copy will suffice
        return copyExpr;
      }
      if (sourceIsFinal) {
        source = "fudge" + (lvCount++);
        writer.write("final " + typeString(type, false) + " ");
      }
      writer.write(source + " = " + copyExpr);
      endStmt(writer);
      if (isBigObject(baseType)) {
        final String lv = "fudge" + lvCount;
        writer.write("for (int " + lv + " = 0; " + lv + " < " + source + ".length; " + lv + "++)");
        beginBlock(writer); // for
        final String sourceElement = source + "[" + lv + "]";
        writer.write("if (" + sourceElement + " != null)");
        beginBlock(writer); // if
        final String newSourceElement = writeDefensiveCopy(writer, baseType, sourceElement, false, displayName + "[]",
            lvCount + 1, includeChecks);
        if (!sourceElement.equals(newSourceElement)) {
          // TODO: if this has happened then our whole loop will be empty, so we should detect the conditions which cause this immediately after the "isBigObject" check
          writer.write(sourceElement + " = " + newSourceElement);
          endStmt(writer);
        }
        endBlock(writer); // if
        endBlock(writer); // for
      }
      if (includeChecks) {
        writeCheckArrayLength(writer, source, displayName, array, lvCount);
      }
      return source;
    } else if (type instanceof FieldType.MessageType) {
      final MessageDefinition m = ((FieldType.MessageType) type).getMessageDefinition();
      if (m.isExternal() || (m == MessageDefinition.ANONYMOUS)) {
        // external message - all bets are off
        return source;
      } else {
        // copy constructor if we have anything mutable, or inherit from something that is external (which we assume to have a copy constructor)
        if (useCopyConstructor(m)) {
          return "(" + m.getIdentifier() + ")" + source + ".clone ()";
        } else {
          return source;
        }
      }
    } else if (type instanceof FieldType.UserType) {
      // User type - all bets are off
      return source;
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.DATE_TYPE_ID:
          return source + ".toLocalDate ()";
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          return source + ".toLocalDateTime ()";
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return source + ".toLocalTime ()";
        default:
          return source;
      }
    }
  }

  private boolean useCopyConstructor(final MessageDefinition message) {
    if (message.isExternal())
      return true;
    if (message.getExtends() != null) {
      if (useCopyConstructor(message.getExtends()))
        return true;
    }
    for (final FieldDefinition field : message.getFieldDefinitions()) {
      if (field.isMutable())
        return true;
    }
    return false;
  }

  private void writeMutatorAssignment(final IndentWriter writer, final FieldDefinition field, final String value,
      final boolean valueIsFinal, final boolean includeChecks) throws IOException {
    final FieldType type = field.getType();
    if (field.isRepeated()) {
      writer.write("if (" + value + " == null) ");
      if (includeChecks && field.isRequired()) {
        writer.write("throw new NullPointerException (\"'" + value + "' cannot be null\")");
      } else {
        writer.write(privateFieldName(field) + " = null");
      }
      endStmt(writer);
      writer.write("else");
      beginBlock(writer); // else
      if (includeChecks || isBigObject(type)) {
        writer.write("final " + listTypeString(type, false) + " fudge0 = new " + listTypeString(type, true) + " ("
            + value + ")");
        endStmt(writer);
        if (includeChecks && field.isRequired()) {
          writer.write("if (" + value + ".size () == 0) throw new IllegalArgumentException (\"'" + value
              + "' cannot be an empty list\")");
          endStmt(writer);
        }
        final String typeName = typeString(type, true);
        writer.write("for (" + CLASS_LISTITERATOR + "<" + typeName
            + "> fudge1 = fudge0.listIterator (); fudge1.hasNext (); )");
        beginBlock(writer); // for
        writer.write(typeName + " fudge2 = fudge1.next ()");
        endStmt(writer);
        if (includeChecks) {
          writer.write("if (fudge2 == null) throw new NullPointerException (\"List element of '" + value
              + "' cannot be null\")");
          endStmt(writer);
        }
        if (isBigObject(type)) {
          writer.write("fudge1.set ("
              + writeDefensiveCopy(writer, type, "fudge2", false, value + "[]", 3, includeChecks) + ")");
          endStmt(writer);
        }
        endBlock(writer); // for
        writer.write(privateFieldName(field) + " = fudge0");
        endStmt(writer);
      } else {
        writer.write(privateFieldName(field) + " = new " + listTypeString(type, true) + " (" + value + ")");
        endStmt(writer);
      }
      endBlock(writer); // else
    } else {
      if (isBigObject(field.getType())) {
        writer.write("if (" + value + " == null) ");
        if (includeChecks && field.isRequired()) {
          writer.write("throw new NullPointerException (\"'" + value + "' cannot be null\")");
        } else {
          writer.write(privateFieldName(field) + " = null");
        }
        endStmt(writer);
        writer.write("else");
        beginBlock(writer);
        writer.write(privateFieldName(field) + " = "
            + writeDefensiveCopy(writer, field.getType(), value, valueIsFinal, value, 0, includeChecks));
        endStmt(writer);
        endBlock(writer);
      } else {
        if (includeChecks && field.isRequired() && isObject(field.getType())) {
          writer.write("if (" + value + " == null) throw new NullPointerException (\"" + value + "' cannot be null\")");
          endStmt(writer);
        }
        writer.write(privateFieldName(field) + " = " + value);
        endStmt(writer);
      }
    }
  }

  private void writeMutatorMethod(final IndentWriter writer, final boolean builderReturn, final FieldDefinition field)
      throws IOException {
    // standard method (or singleton list on repeated fields)
    final String lfn = localFieldName(field);
    final String pfn = privateFieldName(field);
    final String returnType = "public " + (builderReturn ? "Builder" : "void") + " ";
    writer.write(returnType + fieldMethodName(field, builderReturn ? null : "set") + " ("
        + typeString(field.getType(), field.isRepeated() || !field.isRequired()) + " " + lfn + ")");
    beginBlock(writer); // method
    if (field.isRepeated()) {
      writer.write("if (" + lfn + " == null) ");
      if (field.isRequired()) {
        writer.write("throw new NullPointerException (\"'" + lfn + "' cannot be null\")");
      } else {
        writer.write(pfn + " = null");
      }
      endStmt(writer); // null assignment or exception
      writer.write("else");
      beginBlock(writer); // else
      writer.write(pfn + " = new " + listTypeString(field.getType(), true) + " (1)");
      endStmt(writer); // reset list
      writer.write(fieldMethodName(field, "add") + " (" + lfn + ")");
      endStmt(writer); // invoke add
      endBlock(writer);
    } else {
      writeMutatorAssignment(writer, field, lfn, false, true);
    }
    if (builderReturn) {
      writer.write("return this");
      endStmt(writer); // return this
    }
    endBlock(writer); // method
    if (field.isRepeated()) {
      // standard method to assign a whole list on repeated fields
      writer.write(returnType + fieldMethodName(field, builderReturn ? null : "set") + " ("
          + genericTypeString(CLASS_COLLECTION, field.getType(), false) + " " + lfn + ")");
      beginBlock(writer); // method
      writeMutatorAssignment(writer, field, lfn, false, true);
      if (builderReturn) {
        writer.write("return this");
        endStmt(writer); // return this
      }
      endBlock(writer); // method
      // standard method to append an item to a repeated field list
      writer.write(returnType + fieldMethodName(field, "add") + " (" + typeString(field.getType(), true) + " " + lfn
          + ")");
      beginBlock(writer); // method
      writer.write("if (" + lfn + " == null) throw new NullPointerException (\"'" + lfn + "' cannot be null\")");
      endStmt(writer); // check for null
      writer.write("if (" + pfn + " == null) " + pfn + " = new " + listTypeString(field.getType(), true) + " ()");
      endStmt(writer); // assign empty list if none already
      writer.write(pfn + ".add (" + writeDefensiveCopy(writer, field.getType(), lfn, false, lfn, 0, true) + ")");
      endStmt(writer); // append
      if (builderReturn) {
        writer.write("return this");
        endStmt(writer); // return this
      }
      endBlock(writer); // method
    }
  }

  private void writeBuilderClassMethods(final IndentWriter writer, final MessageDefinition message) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() == null) {
        writeMutatorMethod(writer, true, field);
      }
    }
  }

  private void writeBuilderClassBuildMethod(final IndentWriter writer, MessageDefinition message) throws IOException {
    writer.write("public " + message.getName() + " build ()");
    beginBlock(writer);
    writer.write("return ");
    MessageDefinition superMessage = message.getExtends();
    while (superMessage != null) {
      if (!useBuilderPattern(superMessage)) {
        writer.write("(getFudgeRoot () != null) ? new " + messageDelegateName(message) + " (");
        if (superMessage.hasExternalMessageReferences()) {
          writer.write("getFudgeContext (), ");
        }
        writer.write("getFudgeRoot (), this) : ");
        break;
      }
      superMessage = superMessage.getExtends();
    }
    writer.write("new " + messageDelegateName(message) + " (this)");
    endStmt(writer);
    endBlock(writer);
  }

  private void writeBuilderClass(final Compiler.Context context, final IndentWriter writer, MessageDefinition message)
      throws IOException {
    final MessageDefinition ext = message.getExtends();
    JavaWriter jWriter = new JavaWriter(writer);
    jWriter.classDef(false, true, "Builder", ((ext != null) && useBuilderPattern(ext)) ? ext.getIdentifier()
        + ".Builder" : null, null);
    jWriter = beginBlock(jWriter); // builder class
    writeBuilderClassFields(jWriter, message);
    writePublicConstructor(context, writer, true, message);
    writeProtectedFudgeMsgConstructor(writer, true, message);
    writeBuilderClassMethods(writer, message);
    if (!message.isAbstract()) {
      writeBuilderClassBuildMethod(writer, message);
    }
    endBlock(writer); // builder class
  }

  private void writeProtectedBuilderConstructor(final IndentWriter writer, final MessageDefinition message)
      throws IOException {
    writer.write("protected " + message.getName() + " (final Builder builder)");
    beginBlock(writer); // constructor
    final MessageDefinition superMessage = message.getExtends();
    if (superMessage != null) {
      if (superMessage.isExternal()) {
        // use a no-arg constructor
        writer.write("super ()");
        endStmt(writer);
      } else if (useBuilderPattern(superMessage)) {
        writer.write("super (builder)");
        endStmt(writer);
      } else {
        // Use the partial constructor
        final List<FieldDefinition> superFields = getAllFields(false, message.getExtends(), null, null);
        writer.write("super (");
        if (superFields != null) {
          boolean first = true;
          for (FieldDefinition field : superFields) {
            if (first) {
              first = false;
            } else {
              writer.write(", ");
            }
            writer.write("builder." + privateFieldName(field));
          }
        }
        writer.write(")");
        endStmt(writer);
      }
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() == null) {
        writeMutatorAssignment(writer, field, "builder." + privateFieldName(field), true, false);
      }
    }
    endBlock(writer); // constructor
    MessageDefinition msg = superMessage;
    while (msg != null) {
      if (!useBuilderPattern(msg)) {
        writer.write("protected " + message.getName() + " (final ");
        if (msg.hasExternalMessageReferences()) {
          writer.write(CLASS_FUDGEDESERIALISATIONCONTEXT + " fudgeContext, final ");
        }
        writer.write(CLASS_FUDGEFIELDCONTAINER + " fudgeMsg, final Builder builder)");
        beginBlock(writer); // constructor
        writer.write("super (");
        if (msg.hasExternalMessageReferences()) {
          writer.write("fudgeContext, ");
        }
        writer.write("fudgeMsg");
        if (msg != superMessage) {
          writer.write(", builder");
        }
        writer.write(")");
        endStmt(writer);
        for (FieldDefinition field : message.getFieldDefinitions()) {
          writeMutatorAssignment(writer, field, "builder." + privateFieldName(field), true, false);
        }
        endBlock(writer); // constructor
        break;
      }
      msg = msg.getExtends();
    }
  }

  private JavaWriter beginBlock(final JavaWriter writer) throws IOException {
    beginBlock(writer.getWriter());
    return new JavaWriter(writer);
  }

  private JavaWriter endBlock(final JavaWriter writer) throws IOException {
    final JavaWriter parent = writer.getParent();
    endBlock(parent.getWriter());
    return parent;
  }

  private void endStmt(final JavaWriter writer) throws IOException {
    endStmt(writer.getWriter());
  }

  private void writeAddToFudgeMsg(JavaWriter writer, final String msg, final String name, final String ordinal,
      String value, final FieldType type) throws IOException {
    // special value substitutions for some types
    switch (type.getFudgeFieldType()) {
      case FudgeTypeDictionary.INT_ARRAY_TYPE_ID:
        if (((FieldType.ArrayType) type).getBaseType() instanceof FieldType.EnumType) {
          final String temp1 = writer.localVariable("int[]", true, "new int[" + value + ".length]");
          endStmt(writer);
          final String temp2 = writer.forEachIndex(temp1, "length");
          writer = beginBlock(writer);
          writer.assignment(temp1 + "[" + temp2 + "]", value + "[" + temp2 + "].getFudgeEncoding ()");
          endStmt(writer);
          writer = endBlock(writer);
          value = temp1;
        }
        break;
      case FudgeTypeDictionary.INDICATOR_TYPE_ID:
        writer.ifBool(value); // indicators are present if the bool we are using is set
        value = VALUE_INDICATOR;
        break;
      case FudgeTypeDictionary.INT_TYPE_ID:
        if (type instanceof FieldType.EnumType) {
          value = value + ".getFudgeEncoding ()";
        }
        break;
      case FudgeTypeDictionary.STRING_TYPE_ID:
        if (type instanceof FieldType.EnumType) {
          value = value + ".name ()";
        }
        break;
      case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID:
        if (type instanceof FieldType.ArrayType) {
          final String temp1 = writer.localVariable(CLASS_MUTABLEFUDGEFIELDCONTAINER, true,
              "fudgeContext.newMessage ()");
          endStmt(writer);
          final FieldType baseType = ((FieldType.ArrayType) type).getBaseType();
          final String temp2 = writer.forEach(typeString(baseType, false), value);
          writer = beginBlock(writer); // foreach
          if (isBigObject(baseType)) {
            writer.ifNotNull(temp2);
            writer = beginBlock(writer); // if
          }
          writeAddToFudgeMsg(writer, temp1, "null", "null", temp2, baseType);
          if (isBigObject(baseType)) {
            writer = endBlock(writer); // if
            writer.getWriter().write("else");
            writer = beginBlock(writer); // else
            writer.invoke(temp1, "add", "null, null, " + VALUE_INDICATOR);
            endStmt(writer);
            writer = endBlock(writer); // else
          }
          writer = endBlock(writer); // foreach
          value = temp1;
        } else if (type instanceof FieldType.MessageType) {
          if (type instanceof FieldType.AnonMessageType) {
            value = "fudgeContext.newMessage (" + value + ")";
          } else {
            final MessageDefinition messageDefinition = ((FieldType.MessageType) type).getMessageDefinition();
            if (messageDefinition.isExternal()) {
              writer.invoke("fudgeContext", "objectToFudgeMsg", msg + ", " + name + ", " + ordinal + ", " + value);
              endStmt(writer);
              return;
            } else {
              final String temp1 = writer.localVariable(CLASS_MUTABLEFUDGEFIELDCONTAINER, true,
                  "fudgeContext.newMessage ()");
              endStmt(writer);
              final String temp2 = writer.localVariable("Class<?>", false, value + ".getClass ()");
              endStmt(writer);
              writer.whileBool("!" + messageDefinition.getIdentifier() + ".class.equals (" + temp2 + ")");
              writer = beginBlock(writer); // while
              writer.invoke(temp1, "add", "null, 0, " + CLASS_FUDGESTRINGTYPE + ".INSTANCE, " + temp2 + ".getName ()");
              endStmt(writer);
              writer.assignment(temp2, temp2 + ".getSuperclass ()");
              endStmt(writer);
              writer = endBlock(writer); // while
              writer.invoke(value, "toFudgeMsg", "fudgeContext, " + temp1);
              endStmt(writer);
              value = temp1;
            }
          }
        } else if (type instanceof FieldType.UserType) {
          writer.invoke("fudgeContext", "objectToFudgeMsg", msg + ", " + name + ", " + ordinal + ", " + value);
          endStmt(writer);
          return;
        } else {
          throw new IllegalStateException("type '" + type + "' is not an expected submessage type");
        }
        break;
    }
    writer.invoke(msg, "add", name + ", " + ordinal + ", " + value);
    endStmt(writer);
  }

  private void writeToFudgeMsg(JavaWriter writer, final MessageDefinition message) throws IOException {
    final String contextClass = message.hasExternalMessageReferences() ? CLASS_FUDGESERIALISATIONCONTEXT
        : CLASS_FUDGEMESSAGEFACTORY;
    if (message.isAbstract()) {
      if (message.getExtends() == null) {
        writer.method("public abstract", CLASS_FUDGEFIELDCONTAINER, "toFudgeMsg", "final " + contextClass
            + " fudgeContext");
        endStmt(writer);
      }
    } else {
      writer.method("public", CLASS_FUDGEFIELDCONTAINER, "toFudgeMsg", "final " + contextClass + " fudgeContext");
      writer = beginBlock(writer); // toFudgeMsg
      writer.ifNull("fudgeContext");
      writer.throwNullParameterException("fudgeContext");
      endStmt(writer);
      writer.namedLocalVariable(CLASS_MUTABLEFUDGEFIELDCONTAINER, "msg", "fudgeContext.newMessage ()");
      endStmt(writer);
      writer.invoke("toFudgeMsg", "fudgeContext, msg");
      endStmt(writer);
      writer.returnVariable("msg");
      endStmt(writer);
      writer = endBlock(writer); // toFudgeMsg
    }
    writer.method("public", "void", "toFudgeMsg", "final " + contextClass + " fudgeContext, final "
        + CLASS_MUTABLEFUDGEFIELDCONTAINER + " msg");
    writer = beginBlock(writer); // toFudgeMsg
    if (message.getExtends() != null) {
      writer.invoke("super", "toFudgeMsg", "fudgeContext, msg");
      endStmt(writer);
    }
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        continue;
      }
      final FieldType type = field.getType();
      String value = privateFieldName(field);
      if (field.isRepeated()) {
        //TODO don't need null check on required fields!
        writer.ifNotNull(value);
        writer = beginBlock(writer); // if not null
        value = writer.forEach(typeString(type, true), value);
        writer = beginBlock(writer); // foreach
      } else {
        if (isObject(type) || !field.isRequired()) {
          //TODO don't need null check on required fields!
          writer.ifNotNull(value);
          writer = beginBlock(writer); // if not null
        }
      }
      if (field.getOrdinal() != null) {
        writeAddToFudgeMsg(writer, "msg", "null", fieldOrdinal(field), value, type);
      } else {
        writeAddToFudgeMsg(writer, "msg", fieldKey(field), "null", value, type);
      }
      if (field.isRepeated()) {
        writer = endBlock(writer); // foreach
        writer = endBlock(writer); // if not null
      } else {
        if (isObject(type) || !field.isRequired()) {
          writer = endBlock(writer); // if not null
        }
      }
    }
    writer = endBlock(writer); // toFudgeMsg
  }

  /**
   * Returns true if the type is an array of Java objects rather than a Java primitive types. I.e. will generic collection methods work
   */
  private boolean isObjectArray(final FieldType.ArrayType type) {
    final FieldType base = type.getBaseType();
    return isObject(base);
  }

  /**
   * Returns true if the type is not a Java primitive.
   */
  private boolean isObject(final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return true;
    } else if (type instanceof FieldType.EnumType) {
      return true;
    } else if (type instanceof FieldType.MessageType) {
      return true;
    } else if (type instanceof FieldType.UserType) {
      return isObject(((FieldType.UserType) type).getTypeDefinition().getUnderlyingType());
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
          return false;
        case FudgeTypeDictionary.STRING_TYPE_ID:
        case FudgeTypeDictionary.DATE_TYPE_ID:
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return true;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

  /**
   * Returns true if the type is not a primitive or immutable simple object.
   */
  private boolean isBigObject(final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      return true;
    } else if (type instanceof FieldType.EnumType) {
      return false;
    } else if (type instanceof FieldType.MessageType) {
      // assume anonymous message type is immutable which is not very sensible
      return !(type instanceof FieldType.AnonMessageType);
    } else if (type instanceof FieldType.UserType) {
      return isBigObject(((FieldType.UserType) type).getTypeDefinition().getUnderlyingType());
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
        case FudgeTypeDictionary.STRING_TYPE_ID:
          return false;
        case FudgeTypeDictionary.DATE_TYPE_ID:
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return true;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

  private String toArray(JavaWriter writer, final String source, final FieldType.ArrayType type) throws IOException {
    final StringBuilder sbNewArray = new StringBuilder("new ");
    int dims = 0;
    FieldType base = type.getBaseType();
    while (base instanceof FieldType.ArrayType) {
      base = ((FieldType.ArrayType) base).getBaseType();
      dims++;
    }
    sbNewArray.append(typeString(base, false)).append('[').append(source).append(".size ()]");
    for (int i = 0; i < dims; i++) {
      sbNewArray.append("[]");
    }
    if (isObjectArray(type)) {
      return source + ".toArray (" + sbNewArray + ")";
    } else {
      final String newArray = writer.localVariable(typeString(type, false), true, sbNewArray.toString());
      endStmt(writer);
      final String index = writer.localVariable("int", false, "0");
      endStmt(writer);
      final String element = writer.forEach(typeString(type.getBaseType(), false), source);
      writer = beginBlock(writer);
      writer.assignment(newArray + "[" + index + "++]", element);
      endStmt(writer);
      writer = endBlock(writer);
      return newArray;
    }
  }

  private String fudgeFieldValueExpression(final String fieldContainer, final String javaType, final String fieldData) {
    return fieldContainer + ".getFieldValue (" + javaType + ".class, " + fieldData + ")";
  }

  private String writeDecodeSimpleFudgeField(final JavaWriter writer, final String displayType, final String javaType,
      final String fieldData, final String fieldRef, final String fieldContainer, final String assignTo,
      final String appendTo, final String ffveSuffix) throws IOException {
    final StringBuilder sb = new StringBuilder(fudgeFieldValueExpression(fieldContainer, javaType, fieldData));
    if (ffveSuffix != null) {
      sb.append('.').append(ffveSuffix);
    }
    if (appendTo != null) {
      return sb.toString();
    } else {
      writer.assignment(assignTo, sb.toString());
      endStmt(writer);
      return assignTo;
    }
  }

  private void writeDecodeFudgeField(JavaWriter writer, final FieldType type, final MessageDefinition message,
      final String fieldData, final String fieldRef, final String fieldContainer, String assignTo,
      final String appendTo, final boolean allowNull) throws IOException {
    if (type.getFudgeFieldType() != FudgeTypeDictionary.INDICATOR_TYPE_ID) {
      writer.guard();
      writer = beginBlock(writer); // try
    }
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType arrayType = (FieldType.ArrayType) type;
      final FieldType baseType = arrayType.getBaseType();
      boolean checkLength = arrayType.isFixedLength();
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID:
        case FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "byte[]", "byte[]", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "short[]", "short[]", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.INT_ARRAY_TYPE_ID: {
          if (baseType instanceof FieldType.EnumType) {
            final EnumDefinition enumDefinition = ((FieldType.EnumType) baseType).getEnumDefinition();
            if (appendTo != null) {
              assignTo = writer.localVariable(typeString(type, false), true);
              endStmt(writer);
            }
            final String intArray = writer.localVariable("int[]", true, fudgeFieldValueExpression(fieldContainer,
                "int[]", fieldData));
            endStmt(writer);
            writer.assignment(assignTo, "new " + enumDefinition.getIdentifier() + "[" + intArray + ".length]");
            endStmt(writer);
            final String index = writer.forEachIndex(intArray, "length");
            writer = beginBlock(writer); // for
            writer.assignment(assignTo + "[" + index + "]", enumDefinition.getIdentifier() + ".fromFudgeEncoding ("
                + intArray + "[" + index + "])");
            endStmt(writer);
            writer = endBlock(writer); // for
          } else {
            assignTo = writeDecodeSimpleFudgeField(writer, "int[]", "int[]", fieldData, fieldRef, fieldContainer,
                assignTo, appendTo, null);
          }
          break;
        }
        case FudgeTypeDictionary.LONG_ARRAY_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "long[]", "long[]", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "float[]", "float[]", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "double[]", "double[]", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.FUDGE_MSG_TYPE_ID:
          // arbitrary array
          final String subMessage = writer.localVariable(CLASS_FUDGEFIELDCONTAINER, true, fudgeFieldValueExpression(
              fieldContainer, CLASS_FUDGEFIELDCONTAINER, fieldData));
          endStmt(writer);
          // TODO 2010-01-06 Andrew -- we could call getNumFields on the subMessage and allocate a proper array once, but might that be slower if we have a FudgeMsg implementation that makes data available as soon as its received & decoded - i.e. a big array submessage would have to be decoded in its entirety to get the length
          final String slaveList = writer.localVariable(listTypeString(baseType, false), true, "new "
              + listTypeString(baseType, true) + " ()");
          endStmt(writer);
          final String msgElement = writer.forEach(CLASS_FUDGEFIELD, subMessage);
          writer = beginBlock(writer); // iteration
          writeDecodeFudgeField(writer, baseType, message, msgElement, fieldRef + "[]", subMessage, null, slaveList
              + ".add", true);
          writer = endBlock(writer); // iteration
          if (appendTo != null) {
            if (checkLength) {
              writer.ifSizeNot(slaveList, "size ()", arrayType.getFixedLength());
              writer.throwInvalidFudgeFieldException(message, fieldRef, type.toString(), null);
              endStmt(writer);
              checkLength = false;
            }
            assignTo = toArray(writer, slaveList, (FieldType.ArrayType) type);
          } else {
            writer.assignment(assignTo, toArray(writer, slaveList, (FieldType.ArrayType) type));
            endStmt(writer);
          }
          break;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
      // check the array lengths if the spec required a specific length
      if (checkLength) {
        writer.ifSizeNot(assignTo, "length", arrayType.getFixedLength());
        writer.throwInvalidFudgeFieldException(message, fieldRef, type.toString(), null);
        endStmt(writer);
      }
    } else if (type instanceof FieldType.MessageType) {
      final MessageDefinition msg = ((FieldType.MessageType) type).getMessageDefinition();
      if (appendTo != null) {
        assignTo = writer.localVariable(messageType(msg), true);
        endStmt(writer);
      }
      final String value = fudgeFieldValueExpression(fieldContainer, CLASS_FUDGEFIELDCONTAINER, fieldData);
      if (msg == MessageDefinition.ANONYMOUS) {
        writer.assignment(assignTo, value);
        endStmt(writer);
      } else {
        if (msg.isExternal()) {
          writer.assignment(assignTo, "fudgeContext.fieldValueToObject (" + messageType(msg) + ".class, " + fieldData
              + ")");
        } else if (msg.hasExternalMessageReferences()) {
          writer.assignment(assignTo, messageType(msg) + ".fromFudgeMsg (fudgeContext, " + value + ")");
        } else {
          writer.assignment(assignTo, messageType(msg) + ".fromFudgeMsg (" + value + ")");
        }
        endStmt(writer);
      }
    } else if (type instanceof FieldType.EnumType) {
      final EnumDefinition enumDefinition = ((FieldType.EnumType) type).getEnumDefinition();
      final String value;
      if (enumDefinition.getType() == EnumDefinition.Type.INTEGER_ENCODED) {
        value = enumDefinition.getIdentifier() + ".fromFudgeEncoding ("
            + fudgeFieldValueExpression(fieldContainer, "Integer", fieldData) + ")";
      } else {
        value = fudgeFieldValueExpression (fieldContainer, enumDefinition.getIdentifier(), fieldData);
      }
      if (appendTo != null) {
        assignTo = value;
      } else {
        writer.assignment (assignTo, value);
        endStmt (writer);
      }
    } else if ((type instanceof FieldType.UserType) && ((FieldType.UserType) type).getTypeDefinition().isExternal()) {
      final TypeDefinition typedef = ((FieldType.UserType) type).getTypeDefinition();
      final String value;
      if (typedef.getUnderlyingType() instanceof FieldType.MessageType) {
        value = "fudgeContext.fieldValueToObject (" + typedef.getIdentifier() + ".class, " + fieldData + ")";
      } else {
        value = fudgeFieldValueExpression(fieldContainer, typedef.getIdentifier(), fieldData);
      }
      if (appendTo != null) {
        assignTo = value;
      } else {
        writer.assignment(assignTo, value);
        endStmt(writer);
      }
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // using a boolean internally, so just set to true to indicate this is in the message
          String v = fieldData + ".getValue () != null";
          if (appendTo != null) {
            assignTo = v;
          } else {
            writer.assignment(assignTo, v);
            endStmt(writer);
          }
          break;
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID: {
          assignTo = writeDecodeSimpleFudgeField(writer, "boolean", "Boolean", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        }
        case FudgeTypeDictionary.BYTE_TYPE_ID: {
          assignTo = writeDecodeSimpleFudgeField(writer, "byte", "Byte", fieldData, fieldRef, fieldContainer, assignTo,
              appendTo, null);
          break;
        }
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "short", "Short", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.INT_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "int", "Integer", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.LONG_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "long", "Long", fieldData, fieldRef, fieldContainer, assignTo,
              appendTo, null);
          break;
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "float", "Float", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, "double", "Double", fieldData, fieldRef, fieldContainer,
              assignTo, appendTo, null);
          break;
        case FudgeTypeDictionary.STRING_TYPE_ID: {
          final String value = fieldData + ".getValue ()";
          final String valueString;
          if (allowNull) {
            valueString = "(" + value + " != null) ? " + value + ".toString () : null";
          } else {
            valueString = value + ".toString ()";
          }
          if (appendTo != null) {
            assignTo = valueString;
          } else {
            writer.assignment(assignTo, valueString);
            endStmt(writer);
          }
          break;
        }
        case FudgeTypeDictionary.DATE_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, CLASS_DATEPROVIDER, CLASS_DATEPROVIDER, fieldData, fieldRef,
              fieldContainer, assignTo, appendTo, "toLocalDate ()");
          break;
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, CLASS_DATETIMEPROVIDER, CLASS_DATETIMEPROVIDER, fieldData,
              fieldRef, fieldContainer, assignTo, appendTo, "toLocalDateTime ()");
          break;
        case FudgeTypeDictionary.TIME_TYPE_ID:
          assignTo = writeDecodeSimpleFudgeField(writer, CLASS_TIMEPROVIDER, CLASS_TIMEPROVIDER, fieldData, fieldRef,
              fieldContainer, assignTo, appendTo, "toLocalTime ()");
          break;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
    if (appendTo != null) {
      writer.invoke(appendTo, assignTo);
      endStmt(writer);
    }
    if (type.getFudgeFieldType() != FudgeTypeDictionary.INDICATOR_TYPE_ID) {
      writer = endBlock(writer); // try
      writer.catchIllegalArgumentException();
      writer = beginBlock(writer); // catch
      writer.throwInvalidFudgeFieldException(message, fieldRef, type.toString(), "e");
      endStmt(writer);
      writer = endBlock(writer); // catch
    }
  }

  private void writeDecodeFudgeFieldsToList(JavaWriter writer, final FieldDefinition field, final String localName)
      throws IOException {
    writer.assignmentConstruct(localName, listTypeString(field.getType(), true), "fudgeFields.size ()");
    endStmt(writer); // list construction
    final String fieldData = writer.forEach(CLASS_FUDGEFIELD, "fudgeFields");
    beginBlock(writer.getWriter()); // iteration
    writeDecodeFudgeField(writer, field.getType(), field.getOuterMessage(), fieldData, field.getName(), "fudgeMsg",
        null, localName + ".add", false);
    endBlock(writer.getWriter()); // iteration
  }

  private void writeDecodeFudgeFields(final IndentWriter writer, final List<FieldDefinition> fields,
      final boolean builder) throws IOException {
    JavaWriter jWriter = new JavaWriter(writer);
    for (FieldDefinition field : fields) {
      final StringBuilder sbGetField = new StringBuilder("fudgeMsg.get");
      if (field.isRepeated())
        sbGetField.append("All");
      sbGetField.append("By");
      final Integer ordinal = field.getOrdinal();
      if (ordinal != null) {
        sbGetField.append("Ordinal (").append(fieldOrdinal(field)).append(')');
      } else {
        sbGetField.append("Name (").append(fieldKey(field)).append(")");
      }
      jWriter.assignment(field.isRepeated() ? "fudgeFields" : "fudgeField", sbGetField.toString());
      endStmt(jWriter); // field(s) assignment
      if (field.isRequired()) {
        if (field.isRepeated()) {
          jWriter.ifZero("fudgeFields.size ()");
        } else {
          jWriter.ifNull("fudgeField");
        }
        jWriter.throwInvalidFudgeFieldException(field.getOuterMessage(), field.getName(), "present", null);
        endStmt(jWriter); // if & throw
        if (field.isRepeated()) {
          writeDecodeFudgeFieldsToList(jWriter, field, privateFieldName(field));
        } else {
          writeDecodeFudgeField(jWriter, field.getType(), field.getOuterMessage(), "fudgeField", field.getName(),
              "fudgeMsg", privateFieldName(field), null, false);
        }
      } else {
        final String method = fieldMethodName(field, builder ? null : "set");
        if (field.isRepeated()) {
          jWriter.ifGtZero("fudgeFields.size ()");
          jWriter = beginBlock(jWriter); // if guard
          final String tempList = jWriter.localVariable(listTypeString(field.getType(), false), true);
          endStmt(jWriter); // temp variable
          writeDecodeFudgeFieldsToList(jWriter, field, tempList);
          writer.write(method + " (" + tempList + ")");
          endStmt(writer); // add to builder or object
        } else {
          jWriter.ifNotNull("fudgeField");
          jWriter = beginBlock(jWriter); // if guard
          writeDecodeFudgeField(jWriter, field.getType(), field.getOuterMessage(), "fudgeField", field.getName(),
              "fudgeMsg", null, method, true);
        }
        jWriter = endBlock(jWriter); // if guard
      }
    }
  }

  private void writeProtectedFudgeMsgConstructor(final IndentWriter writer, final boolean builder,
      final MessageDefinition message) throws IOException {
    final MessageDefinition superMessage = message.getExtends();
    writer.write("protected " + (builder ? "Builder" : message.getName()) + " (");
    if (message.hasExternalMessageReferences()) {
      writer.write("final " + CLASS_FUDGEDESERIALISATIONCONTEXT + " fudgeContext, ");
    }
    writer.write("final " + CLASS_FUDGEFIELDCONTAINER + " fudgeMsg)");
    beginBlock(writer); // constructor
    if (superMessage != null) {
      if (builder && !useBuilderPattern(superMessage)) {
        // we don't have a super constructor, so store the original message
        writer.write("_fudgeRoot = fudgeMsg");
        if (message.hasExternalMessageReferences()) {
          endStmt(writer);
          writer.write("_fudgeContext = fudgeContext");
        }
      } else {
        if (superMessage.hasExternalMessageReferences()) {
          writer.write("super (fudgeContext, fudgeMsg)");
        } else {
          writer.write("super (fudgeMsg)");
        }
      }
      endStmt(writer);
    }
    final List<FieldDefinition> required = new LinkedList<FieldDefinition>();
    final List<FieldDefinition> optional = new LinkedList<FieldDefinition>();
    boolean fieldDeclared = false, fieldsDeclared = false;
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        continue;
      }
      if (field.isRequired()) {
        required.add(field);
      } else {
        optional.add(field);
      }
      if (field.isRepeated()) {
        if (!fieldsDeclared) {
          writer.write(CLASS_LIST + "<" + CLASS_FUDGEFIELD + ">" + " fudgeFields");
          endStmt(writer);
          fieldsDeclared = true;
        }
      } else {
        if (!fieldDeclared) {
          writer.write(CLASS_FUDGEFIELD + " fudgeField");
          endStmt(writer);
          fieldDeclared = true;
        }
      }
    }
    // required fields must be written first so that all final attribs are set before methods called for the optional ones
    writeDecodeFudgeFields(writer, required, builder);
    writeDecodeFudgeFields(writer, optional, builder);
    endBlock(writer); // constructor
  }

  private void writeProtectedCopyConstructor(final Compiler.Context context, final IndentWriter writer,
      final MessageDefinition message)
      throws IOException {
    writer.write("protected " + message.getName() + " (final " + message.getName() + " source)");
    beginBlock(writer); // constructor
    if (message.getExtends() != null) {
      writer.write("super (source)");
      endStmt(writer);
    }
    final List<FieldDefinition> required = new LinkedList<FieldDefinition>();
    final List<FieldDefinition> optional = new LinkedList<FieldDefinition>();
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getDefaultValue() != null) {
        optional.add(field);
      } else if (field.getOverride() == null) {
        required.add(field);
      }
    }
    boolean nullCheck = false;
    if (required.size() > 0) {
      writer.write("if (source == null) throw new NullPointerException (\"'source' must not be null\")");
      nullCheck = true;
      endStmt(writer);
      for (FieldDefinition field : required) {
        writeMutatorAssignment(writer, field, "source." + privateFieldName(field), true, false);
      }
    }
    if (optional.size() > 0) {
      if (!nullCheck) {
        writer.write("if (source != null)");
        beginBlock(writer);
      }
      for (FieldDefinition field : optional) {
        if (field.getOverride() == null) {
          writeMutatorAssignment(writer, field, "source." + privateFieldName(field), true, false);
        }
      }
      if (!nullCheck) {
        endBlock(writer); // if 
        writer.write("else");
        beginBlock(writer); // if-else
        for (FieldDefinition field : optional) {
          if (field.getDefaultValue() != null) {
            if (field.getOverride() != null) {
              writer.write(fieldMethodName(field, "set") + " (" + fieldConstant(field) + ")");
              endStmt(writer);
            } else {
              writeMutatorAssignment(writer, field, fieldConstant(field), true, false);
            }
          }
        }
        endBlock(writer); // if-else
      }
    }
    endBlock(writer); // constructor
    if (!message.isAbstract() && useCopyConstructor(message)) {
      writer.write("public " + message.getName() + " clone ()");
      beginBlock(writer); // clone
      writer.write("return new " + message.getName() + " (this)");
      endStmt(writer);
      endBlock(writer); // clone
    }
  }

  private void writeFromFudgeMsg(final Compiler.Context context, final IndentWriter writer,
      final MessageDefinition message, final boolean useBuilder) throws IOException {
    final String params, paramTypes;
    if (message.hasExternalMessageReferences()) {
      writer.write("public static " + message.getName() + " fromFudgeMsg (final " + CLASS_FUDGEDESERIALISATIONCONTEXT
          + " fudgeContext, final " + CLASS_FUDGEFIELDCONTAINER + " fudgeMsg)");
      params = "fudgeContext, fudgeMsg";
      paramTypes = CLASS_FUDGEDESERIALISATIONCONTEXT + ".class, " + CLASS_FUDGEFIELDCONTAINER + ".class";
      MessageDefinition superMessage = message.getExtends();
      while (superMessage != null) {
        if (!superMessage.hasExternalMessageReferences()) {
          // superclass might not have a FudgeDeserializationContext available when constructing
          context.warning(message.getCodePosition(), "[PRO-18] external definitions might prevent polymorphic use as "
              + superMessage.getIdentifier());
          break;
        } else {
          superMessage = superMessage.getExtends();
        }
      }
    } else {
      writer.write("public static " + message.getName() + " fromFudgeMsg (final " + CLASS_FUDGEFIELDCONTAINER
          + " fudgeMsg)");
      params = "fudgeMsg";
      paramTypes = CLASS_FUDGEFIELDCONTAINER + ".class";
    }
    beginBlock(writer); // fromFudgeMsg
    writer.write("final " + CLASS_LIST + "<" + CLASS_FUDGEFIELD + "> types = fudgeMsg.getAllByOrdinal (0)");
    endStmt(writer);
    writer.write("for (" + CLASS_FUDGEFIELD + " field : types)");
    beginBlock(writer); // for
    writer.write("final String className = (String)field.getValue ()");
    endStmt(writer);
    writer.write("if (\"" + message.getIdentifier() + "\".equals (className)) break");
    endStmt(writer);
    writer.write("try");
    beginBlock(writer); // try
    writer.write("return (" + message.getIdentifier()
        + ")Class.forName (className).getDeclaredMethod (\"fromFudgeMsg\", " + paramTypes + ").invoke (null, " + params
        + ")");
    // TODO 2010-02-17 Andrew -- if the sub-message has external references but we don't then it won't have the correct signature (i.e. we won't have a serialization context); hence the PRO-18 warning above
    endStmt(writer);
    endBlock(writer); // try
    writer.write("catch (Throwable t)");
    beginBlock(writer);
    comment(writer, "no-action");
    endBlock(writer);
    endBlock(writer); // for
    if (message.isAbstract()) {
      writer.write("throw new UnsupportedOperationException (\"" + message.getName() + " is an abstract message\")");
    } else {
      writer.write("return new ");
      if (useBuilder) {
        writer.write("Builder (" + params + ").build ()");
      } else {
        writer.write(messageDelegateName(message) + " (" + params + ")");
      }
    }
    endStmt(writer);
    endBlock(writer); // fromFudgeMsg
  }

  @Override
  public void writeClassImplementationEquality(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    writer.write("public boolean equals (final Object o)");
    beginBlock(writer);
    writer.write("if (o == this) return true");
    endStmt(writer);
    writer.write("if (!(o instanceof " + message.getName() + ")) return false");
    endStmt(writer);
    writer.write(message.getName() + " msg = (" + message.getName() + ")o");
    endStmt(writer);
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        continue;
      }
      final String a = privateFieldName(field);
      final String b = "msg." + a;
      final FieldType type = field.getType();
      if (type instanceof FieldType.ArrayType) {
        if (field.isRepeated()) {
          writer.write("if (" + a + " != null)");
          beginBlock(writer); // if !a
          writer.write("if (" + b + " != null)");
          beginBlock(writer); // if !b
          writer.write("if (" + a + ".size () != " + b + ".size ()) return false");
          endStmt(writer);
          writer.write("for (int i = 0; i < " + a + ".size (); i++)");
          beginBlock(writer); // for
          writer.write("if (!" + CLASS_ARRAYS + "."
              + (isObjectArray((FieldType.ArrayType) type) ? "deepEquals" : "equals") + " (" + a + ".get (i), " + b
              + ".get (i))) return false");
          endStmt(writer);
          endBlock(writer); // for
          endBlock(writer); // if !b
          writer.write("else return false");
          endStmt(writer);
          endBlock(writer); // if !a
          writer.write("else if (" + b + " != null) return false");
        } else {
          writer.write("if (!" + CLASS_ARRAYS + "."
              + (isObjectArray((FieldType.ArrayType) type) ? "deepEquals" : "equals") + " (" + a + ", " + b
              + ")) return false");
        }
      } else {
        if (isObject(type) || field.isRepeated() || !field.isRequired()) {
          writer.write("if (" + a + " != null)");
          beginBlock(writer); // if !a
          writer.write("if (" + b + " != null)");
          beginBlock(writer); // if !b
          writer.write("if (!" + a + ".equals (" + b + ")) return false");
          endStmt(writer);
          endBlock(writer); // if !b
          writer.write("else return false");
          endStmt(writer);
          endBlock(writer); // if !a
          writer.write("else if (" + b + " != null) return false");
        } else {
          writer.write("if (" + a + " != " + b + ") return false");
        }
      }
      endStmt(writer);
    }
    if (message.getExtends() != null) {
      writer.write("return super.equals (msg)");
    } else {
      writer.write("return true");
    }
    endStmt(writer);
    endBlock(writer);
  }

  @Override
  public void writeClassImplementationHash(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    writer.write("public int hashCode ()");
    beginBlock(writer);
    writer.write("int hc = " + ((message.getExtends() != null) ? "super.hashCode ()" : "1"));
    endStmt(writer);
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (field.getOverride() != null) {
        continue;
      }
      final String name = privateFieldName(field);
      final FieldType type = field.getType();
      if (type instanceof FieldType.ArrayType) {
        writer.write("hc *= 31");
        endStmt(writer);
        writer.write("if (" + name + " != null)");
        if (field.isRepeated()) {
          writer.write(" for (" + typeString(type, true) + " elem : " + name + ")");
          writer.write(" hc = (hc * 31) + " + CLASS_ARRAYS + "."
              + (isObjectArray((FieldType.ArrayType) type) ? "deepHashCode" : "hashCode") + " (elem)");
        } else {
          writer.write("hc += " + CLASS_ARRAYS + "."
              + (isObjectArray((FieldType.ArrayType) type) ? "deepHashCode" : "hashCode") + " (" + name + ")");
        }
      } else {
        if (isObject(type) || field.isRepeated() || !field.isRequired()) {
          writer.write("hc *= 31");
          endStmt(writer);
          writer.write("if (" + name + " != null) hc += " + name + ".hashCode ()");
        } else {
          switch (type.getFudgeFieldType()) {
            case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
            case FudgeTypeDictionary.INDICATOR_TYPE_ID:
              writer.write("hc *= 31");
              endStmt(writer);
              writer.write("if (" + name + ") hc++");
              break;
            default:
              writer.write("hc = (hc * 31) + (int)" + name);
              break;
          }
        }
      }
      endStmt(writer);
    }
    writer.write("return hc");
    endStmt(writer);
    endBlock(writer);
  }

  @Override
  public void writeClassImplementationString(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    writer.write("public String toString ()");
    beginBlock(writer);
    writer.write("return " + CLASS_TOSTRINGBUILDER + ".reflectionToString(this, " + CLASS_TOSTRINGSTYLE
        + ".SHORT_PREFIX_STYLE)");
    endStmt(writer);
    endBlock(writer);
  }

  /**
   * We must use a builder if:
   *   a) there are optional immutable fields; or
   *   b) there are immutable fields which have a default value; or
   *   c) the parent message(s) use a builder.
   * 
   * I.e. we omit the builder if it would just have a construct and no mutator methods
   */
  private boolean useBuilderPattern(final MessageDefinition message) {
    for (FieldDefinition field : message.getFieldDefinitions()) {
      if (!field.isMutable()) {
        if (!field.isRequired())
          return true; // optional fields - must use a Builder 
        if (field.getDefaultValue() != null)
          return true; // required field with default value - must use a Builder
      }
    }
    if (message.getExtends() != null) {
      // use a builder if the parent does
      return useBuilderPattern(message.getExtends());
    } else {
      // we don't need a builder 
      return false;
    }
  }

  @Override
  public void writeClassImplementationConstructor(final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    final JavaWriter jWriter = new JavaWriter(writer);
    final boolean useBuilder = useBuilderPattern(message);
    writeDefaultValues(context, writer, message);
    if (useBuilder) {
      writeBuilderClass(context, writer, message);
      writeProtectedBuilderConstructor(writer, message);
    } else {
      writePublicConstructor(context, writer, false, message);
      writeProtectedFudgeMsgConstructor(writer, false, message);
    }
    writeFullPublicConstructor(writer, useBuilder, message);
    writeProtectedCopyConstructor(context, writer, message);
    writeToFudgeMsg(jWriter, message);
    writeFromFudgeMsg(context, writer, message, useBuilder);
  }

  @Override
  public void writeEnumImplementationDeclaration(final Compiler.Context context, EnumDefinition enumDefinition,
      IndentWriter writer) throws IOException {
    super.writeEnumImplementationDeclaration(context, enumDefinition, writer);
    if (enumDefinition.getOuterDefinition() == null) {
      final String namespace = enumDefinition.getNamespace();
      if (namespace != null) {
        writer.write("package " + namespace);
        endStmt(writer);
      }
    }
    writer.write("public enum " + enumDefinition.getName());
    beginBlock(writer); // enum
    boolean first = true;
    for (Map.Entry<String, LiteralValue> element : enumDefinition.getElements()) {
      if (first) {
        first = false;
      } else {
        writer.write(",");
        writer.newLine();
      }
      writer.write(element.getKey());
      if (enumDefinition.getType() != EnumDefinition.Type.DEFAULT) {
        writer.write(" (" + getLiteral(element.getValue()) + ")");
      }
    }
    endStmt(writer); // set of values
    switch (enumDefinition.getType()) {
      case INTEGER_ENCODED:
        writer.write("private final int _fudgeEncoding");
        endStmt(writer);
        writer.write("private " + enumDefinition.getName() + " (final int fudgeEncoding)");
        beginBlock(writer); // constructor
        writer.write("_fudgeEncoding = fudgeEncoding");
        endStmt(writer);
        endBlock(writer); // constructor
        writer.write("public int getFudgeEncoding ()");
        beginBlock(writer); // getFudgeEncoding
        writer.write("return _fudgeEncoding");
        endStmt(writer);
        endBlock(writer); // getFudgeEncoding
        writer.write("public static " + enumDefinition.getName() + " fromFudgeEncoding (final int fudgeEncoding)");
        beginBlock(writer); // fromFudgeEncoding
        writer.write("switch (fudgeEncoding)");
        beginBlock(writer); // switch
        for (Map.Entry<String, LiteralValue> element : enumDefinition.getElements()) {
          writer.write("case " + getLiteral(element.getValue()) + " : return " + element.getKey());
          endStmt(writer);
        }
        writer.write("default : throw new IllegalArgumentException (\"field is not a " + enumDefinition.getName()
            + " - invalid value '\" + fudgeEncoding + \"'\")");
        endStmt(writer);
        endBlock(writer); // switch
        endBlock(writer); // fromFudgeEncoding
        break;
      case STRING_ENCODED:
        writer.write("private final String _fudgeEncoding");
        endStmt(writer);
        writer.write("private " + enumDefinition.getName() + " (final String fudgeEncoding)");
        beginBlock(writer); // constructor
        writer.write("_fudgeEncoding = fudgeEncoding");
        endStmt(writer);
        endBlock(writer); // constructor
        writer.write("public String getFudgeEncoding ()");
        beginBlock(writer); // getFudgeEncoding
        writer.write("return _fudgeEncoding");
        endStmt(writer);
        endBlock(writer); // getFudgeEncoding
        writer.write("public static " + enumDefinition.getName() + " fromFudgeEncoding (final String fudgeEncoding)");
        beginBlock(writer); // fromFudgeEncoding
        for (Map.Entry<String, LiteralValue> element : enumDefinition.getElements()) {
          writer.write("if (fudgeEncoding.equals (" + getLiteral(element.getValue()) + ")) return " + element.getKey());
          endStmt(writer);
        }
        writer.write("throw new IllegalArgumentException (\"field is not a " + enumDefinition.getName()
            + " - invalid value '\" + fudgeEncoding + \"'\")");
        endStmt(writer);
        endBlock(writer); // fromFudgeEncoding
        break;
    }
    final String bodyCode = ProtoBinding.BODY.get(enumDefinition);
    if (bodyCode != null) {
      writer.write(bodyCode);
      writer.newLine();
    }
    endBlock(writer); // enum
  }

  @Override
  public void writeTaxonomyImplementationDeclaration(final Compiler.Context context, final TaxonomyDefinition taxonomy,
      final IndentWriter iWriter) throws IOException {
    super.writeTaxonomyImplementationDeclaration(context, taxonomy, iWriter);
    JavaWriter writer = beginClass(new JavaWriter(iWriter), taxonomy, CLASS_MAPFUDGETAXONOMY, null);
    writer.publicStaticFinal(CLASS_FUDGETAXONOMY, "INSTANCE", "new " + taxonomy.getName() + " ()");
    endStmt(writer); // instance
    final StringBuilder sbOrdinals = new StringBuilder();
    final StringBuilder sbStrings = new StringBuilder();
    for (Map.Entry<String, Integer> element : taxonomy.getElements()) {
      final String name = element.getKey();
      writer.publicStaticFinal("String", "STR_" + name, "\"" + name + "\"");
      endStmt(writer); // STR_ decl
      if (sbStrings.length() > 0)
        sbStrings.append(", ");
      sbStrings.append("STR_").append(name);
      writer.publicStaticFinal("short", "VAL_" + name, element.getValue().toString());
      endStmt(writer); // VAL_ decl
      if (sbOrdinals.length() > 0)
        sbOrdinals.append(", ");
      sbOrdinals.append("VAL_").append(name);
    }
    writer.constructor("private", taxonomy.getName(), null);
    writer = beginBlock(writer); // constructor
    writer
        .invoke("super", "new int[] { " + sbOrdinals.toString() + " }, new String[] { " + sbStrings.toString() + " }");
    endStmt(writer); // super
    endBlock(writer); // constructor
    endBlock(writer); // class
  }

  private String messageType(final MessageDefinition message) {
    if (message == MessageDefinition.ANONYMOUS) {
      return CLASS_FUDGEFIELDCONTAINER;
    } else {
      return message.getIdentifier();
    }
  }

  private String typeString(final FieldType type, final boolean asObject) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType) type;
      final StringBuilder sb = new StringBuilder();
      sb.append(typeString(array.getBaseType(), false));
      sb.append("[]");
      return sb.toString();
    } else if (type instanceof FieldType.EnumType) {
      return ((FieldType.EnumType) type).getEnumDefinition().getIdentifier();
    } else if (type instanceof FieldType.MessageType) {
      return messageType(((FieldType.MessageType) type).getMessageDefinition());
    } else if (type instanceof FieldType.UserType) {
      final TypeDefinition typeDefinition = ((FieldType.UserType) type).getTypeDefinition();
      if (typeDefinition.isExternal()) {
        return typeDefinition.getIdentifier();
      } else {
        return typeString(typeDefinition.getUnderlyingType(), asObject);
      }
    } else {
      switch (type.getFudgeFieldType()) {
        case FudgeTypeDictionary.INDICATOR_TYPE_ID:
          // We'll handle indicators as a boolean - was it in the Fudge message or not
          return asObject ? "Boolean" : "boolean";
        case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
          return asObject ? "Boolean" : "boolean";
        case FudgeTypeDictionary.BYTE_TYPE_ID:
          return asObject ? "Byte" : "byte";
        case FudgeTypeDictionary.SHORT_TYPE_ID:
          return asObject ? "Short" : "short";
        case FudgeTypeDictionary.INT_TYPE_ID:
          return asObject ? "Integer" : "int";
        case FudgeTypeDictionary.LONG_TYPE_ID:
          return asObject ? "Long" : "long";
        case FudgeTypeDictionary.FLOAT_TYPE_ID:
          return asObject ? "Float" : "float";
        case FudgeTypeDictionary.DOUBLE_TYPE_ID:
          return asObject ? "Double" : "double";
        case FudgeTypeDictionary.STRING_TYPE_ID:
          return "String";
        case FudgeTypeDictionary.DATE_TYPE_ID:
          return CLASS_DATEPROVIDER;
        case FudgeTypeDictionary.DATETIME_TYPE_ID:
          return CLASS_DATETIMEPROVIDER;
        case FudgeTypeDictionary.TIME_TYPE_ID:
          return CLASS_TIMEPROVIDER;
        default:
          throw new IllegalStateException("type '" + type + "' is not an expected type (fudge field type "
              + type.getFudgeFieldType() + ")");
      }
    }
  }

}
