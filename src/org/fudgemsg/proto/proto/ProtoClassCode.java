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

package org.fudgemsg.proto.proto;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.fudgemsg.FudgeTypeDictionary;
import org.fudgemsg.proto.c.CBlockCode;
import org.fudgemsg.proto.c.CLiteralCode;
import org.fudgemsg.proto.CodeGeneratorUtil;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.FieldType;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;
import org.fudgemsg.proto.Definition;

/**
 * Code generator for internal use, creating files in the format read by the
 * compiler. This may be used during testing/development of semantic compilation phases,
 * but is more useful for documenting any automatically assigned taxonomy entries.
 * 
 * @author Andrew
 */
class ProtoClassCode extends ImplementationlessClassCode {

  /* package */static final ProtoClassCode INSTANCE = new ProtoClassCode();
  
  private ProtoClassCode() {
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (CLiteralCode.INSTANCE)))));
  }
  
  private void beginDeclaration (final IndentWriter writer, final Definition definition, final String type) throws IOException {
    if (definition.getOuterDefinition () == null) {
      final String ns = definition.getNamespace ();
      if (ns != null) {
        writer.write ("namespace ");
        writer.write (ns);
        beginBlock (writer); // namespace
      }
    }
    writer.write (type);
    writer.write (' ');
    writer.write (definition.getName ());
    beginBlock (writer); // declaration
  }
  
  private void endDeclaration (final IndentWriter writer, final Definition definition) throws IOException {
    endBlock (writer); // declaration
    if (definition.getOuterDefinition () == null) {
      if (definition.getNamespace () != null) endBlock (writer); // namespace
    }
  }

  @Override
  public void beginClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    beginDeclaration (writer, message, "message");
  }

  @Override
  public void endClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    endDeclaration (writer, message);
  }

  @Override
  public void writeClassHeaderAttribute(final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    writer.write(field.isRequired() ? "required " : "optional ");
    if (field.isRepeated()) writer.write("repeated ");
    writer.write(typeString(field.getType()));
    writer.write(' ');
    writer.write(field.getName());
    final Integer ordinal = field.getOrdinal();
    if (ordinal != null) {
      writer.write(" = ");
      writer.write(ordinal.toString());
    }
    final LiteralValue defaultValue = field.getDefaultValue();
    if (defaultValue != null) {
      writer.write(" [default = ");
      writer.write (getLiteral (defaultValue));
      writer.write("]");
    }
    endStmt (writer);
  }

  @Override
  public void writeClassHeaderAccessor(final Compiler.Context context,
      final FieldDefinition field, final IndentWriter writer)
      throws IOException {
    // deliberate no-op
  }

  @Override
  public void writeClassHeaderConstructor(
      final Compiler.Context context, final MessageDefinition message,
      final IndentWriter writer) throws IOException {
    // deliberate no-op
  }

  @Override
  public File getHeaderFile(final Compiler.Context context,
      final Definition definition, final File targetPath)
      throws IOException {
    File implementation = CodeGeneratorUtil.applyNamespace(context, targetPath,
        definition.getIdentifierArray());
    if (implementation == null)
      return null;
    return new File(implementation, definition.getName() + ".proto");
  }

  private String typeString(final FieldType type) {
    if (type instanceof FieldType.ArrayType) {
      final FieldType.ArrayType array = (FieldType.ArrayType) type;
      final StringBuilder sb = new StringBuilder();
      sb.append(typeString(array.getBaseType()));
      if (array.isFixedLength()) {
        sb.append('[');
        sb.append(array.getFixedLength());
        sb.append(']');
      } else {
        sb.append("[]");
      }
      return sb.toString();
    } else if (type instanceof FieldType.EnumType) {
      // For an enum we can always use the name as it will have been declared in
      // the nearest scope
      return ((FieldType.EnumType) type).getEnumDefinition().getName();
    } else if (type instanceof FieldType.MessageType) {
      // For a message, we'll just use the fully qualified name - it's easier than tracking the scope accurately
      return ((FieldType.MessageType) type).getMessageDefinition().getIdentifier ();
    } else {
      switch (type.getFudgeFieldType()) {
      case FudgeTypeDictionary.INDICATOR_TYPE_ID:
        return "indicator";
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID:
        return "bool";
      case FudgeTypeDictionary.BYTE_TYPE_ID:
        return "byte";
      case FudgeTypeDictionary.SHORT_TYPE_ID:
        return "short";
      case FudgeTypeDictionary.INT_TYPE_ID:
        return "int";
      case FudgeTypeDictionary.LONG_TYPE_ID:
        return "long";
      case FudgeTypeDictionary.FLOAT_TYPE_ID:
        return "float";
      case FudgeTypeDictionary.DOUBLE_TYPE_ID:
        return "double";
      case FudgeTypeDictionary.STRING_TYPE_ID:
        return "string";
      case FudgeTypeDictionary.DATE_TYPE_ID :
        return "date";
      case FudgeTypeDictionary.DATETIME_TYPE_ID :
        return "datetime";
      case FudgeTypeDictionary.TIME_TYPE_ID :
        return "time";
      default:
        throw new IllegalStateException("type '" + type
            + "' is not an expected type (fudge field type "
            + type.getFudgeFieldType() + ")");
      }
    }
  }
  
  @Override
  public void writeEnumHeaderDeclaration (final Compiler.Context context, final EnumDefinition enumDefinition, final IndentWriter writer) throws IOException {
    writer.write("enum ");
    writer.write(enumDefinition.getName());
    beginBlock (writer);
    final Iterator<Map.Entry<String, Integer>> elements = enumDefinition.getElements();
    while (elements.hasNext()) {
      final Map.Entry<String, Integer> element = elements.next();
      writer.write(element.getKey());
      writer.write(" = ");
      writer.write(element.getValue().toString());
      endStmt (writer);
    }
    endBlock (writer);
  }
  
  @Override
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter writer) throws IOException {
    super.writeTaxonomyHeaderDeclaration (context, taxonomy, writer);
    beginDeclaration (writer, taxonomy, "taxonomy");
    final Iterator<Map.Entry<String,Integer>> elements = taxonomy.getElements ();
    while (elements.hasNext ()) {
      final Map.Entry<String,Integer> element = elements.next ();
      writer.write (element.getKey ());
      writer.write (" = ");
      writer.write (element.getValue ().toString ());
      endStmt (writer);
    }
    endDeclaration (writer, taxonomy);
  }

}
