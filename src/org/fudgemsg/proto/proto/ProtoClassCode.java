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
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.fudgemsg.FudgeTypeDictionary;
import org.fudgemsg.proto.Binding;
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
    super (new DocumentedClassCode (blockCodeDelegate (new CBlockCode (literalCodeDelegate (ProtoLiteralCode.INSTANCE)))));
  }
  
  private void beginNSDeclaration (final IndentWriter writer, final Definition definition) throws IOException {
    if (definition.getOuterDefinition () == null) {
      final String ns = definition.getNamespace ();
      if (ns != null) {
        writer.write ("namespace " + ns);
        beginBlock (writer); // namespace
      }
    }
  }
  
  private void endNSDeclaration (final IndentWriter writer, final Definition definition) throws IOException {
    if (definition.getOuterDefinition () == null) {
      if (definition.getNamespace () != null) endBlock (writer); // namespace
    }
  }
  
  private void writeExternalReference (final IndentWriter writer, final Definition definition, Set<Definition> processed) throws IOException {
    if (!processed.contains (definition)) {
      processed.add (definition);
      if (definition instanceof MessageDefinition) {
        writer.write ("extern message " + definition.getIdentifier ());
      } else if (definition instanceof EnumDefinition) {
        writer.write ("extern enum " + definition.getIdentifier ());
      } else if (definition instanceof TaxonomyDefinition) {
        writer.write ("extern taxonomy " + definition.getIdentifier ());
      } else {
        throw new IllegalStateException ("invalid external reference " + definition);
      }
      endStmt (writer);
    }
  }
  
  private void writeExternalReferences (final IndentWriter writer, final MessageDefinition message, Set<Definition> processed) throws IOException {
    if (message.getExtends () != null) {
      if (!message.getExtends ().isCompilationTarget ()) {
        writeExternalReference (writer, message.getExtends (), processed);
      }
    }
    for (MessageDefinition subMessage : message.getMessageDefinitions ()) {
      writeExternalReferences (writer, subMessage, processed);
    }
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      final FieldType type = field.getType ();
      final Definition definition;
      if (type instanceof FieldType.MessageType) {
        definition = ((FieldType.MessageType)type).getMessageDefinition ();
        if (definition == MessageDefinition.ANONYMOUS) continue;
      } else if (type instanceof FieldType.EnumType) {
        definition = ((FieldType.EnumType)type).getEnumDefinition ();
      } else {
        continue;
      }
      if (!definition.isCompilationTarget ()) {
        writeExternalReference (writer, definition, processed);
      }
    }
  }

  @Override
  public void beginClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    if (message.getOuterDefinition () == null) {
      final Set<Definition> processed = new HashSet<Definition> ();
      writeExternalReferences (writer, message, processed);
    }
    beginNSDeclaration (writer, message);
    if (message.isAbstract()) {
      writer.write("abstract ");
    }
    writer.write ("message " + message.getName ());
    if (message.getExtends () != null) {
      writer.write (" extends " + message.getExtends ().getIdentifier ());
    }
    beginBlock (writer); // declaration
  }

  @Override
  public void endClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    writeBinding (writer, message);
    endBlock (writer); // declaration
    endNSDeclaration (writer, message);
  }

  @Override
  public void writeClassHeaderAttribute(final Compiler.Context context, final FieldDefinition field, final IndentWriter writer) throws IOException {
    writer.write(field.isRequired() ? "required " : "optional ");
    if (field.isRepeated()) writer.write("repeated ");
    writer.write (field.isMutable () ? "mutable " : "readonly ");
    writer.write (typeString(field.getType ()) + " " + field.getName ());
    final Integer ordinal = field.getOrdinal();
    if (ordinal != null) {
      writer.write (" = " + ordinal.toString ());
    }
    final LiteralValue defaultValue = field.getDefaultValue();
    if (defaultValue != null) {
      writer.write (" [default = " + getLiteral (defaultValue) + "]");
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
      return ((FieldType.EnumType) type).getEnumDefinition().getIdentifier ();
    } else if (type instanceof FieldType.MessageType) {
      final MessageDefinition messageDefinition = ((FieldType.MessageType) type).getMessageDefinition();
      if (messageDefinition == MessageDefinition.ANONYMOUS) {
        return "message";
      } else {
        return messageDefinition.getIdentifier ();
      }
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
    beginNSDeclaration (writer, enumDefinition);
    writer.write ("enum " + enumDefinition.getName ());
    beginBlock (writer); // enum decl
    for (Map.Entry<String, LiteralValue> element : enumDefinition.getElements ()) {
      writer.write (element.getKey ());
      if (!(element.getValue () instanceof LiteralValue.NullValue)) {
        writer.write (" = " + getLiteral (element.getValue ()));
      }
      endStmt (writer);
    }
    writeBinding (writer, enumDefinition);
    endBlock (writer); // enum decl
    endNSDeclaration (writer, enumDefinition);
  }
  
  @Override
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter writer) throws IOException {
    super.writeTaxonomyHeaderDeclaration (context, taxonomy, writer);
    beginNSDeclaration (writer, taxonomy);
    writer.write ("taxonomy " + taxonomy.getName ());
    beginBlock (writer); // taxonomy
    for (Map.Entry<String,Integer> element : taxonomy.getElements ()) {
      writer.write (element.getKey () + " = " + element.getValue ().toString ());
      endStmt (writer);
    }
    writeBinding (writer, taxonomy);
    endBlock (writer); // taxonomy
    endNSDeclaration (writer, taxonomy);
  }
  
  private void writeBinding (final IndentWriter writer, final Definition definition) throws IOException {
    for (final Map.Entry<String,Binding> entry : definition.getAllLanguageBindings ().entrySet ()) {
      writer.write ("binding \"" + entry.getKey () + "\"");
      beginBlock (writer);
      for (final Map.Entry<String,Binding.Data> binding : entry.getValue ().getAllData ().entrySet ()) {
        writer.write (binding.getKey () + " \"");
        final String str = binding.getValue ().getValue ();
        for (int i = 0; i < str.length (); i++) {
          final char c = str.charAt (i);
          switch (c) {
          case '\n' : writer.write ("\\n"); break;
          case '\r' : writer.write ("\\r"); break;
          case '\\' : writer.write ("\\"); break;
          case '\"' : writer.write ("\""); break;
          case '\'' : writer.write ("\'"); break;
          default : writer.write (c); break;
          }
        }
        writer.write ("\"");
        endStmt (writer);
      }
      endBlock (writer);
    }
  }

}
