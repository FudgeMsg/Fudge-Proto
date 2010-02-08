/* Copyright 2009 by OpenGamma Inc and other contributors.
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

package org.fudgemsg.proto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fudgemsg.proto.antlr.ProtoLexer;

/**
 * A compilation phase which walks the AST to build a semantic representation of the application layer messages.
 * This representation can then be used for consistency checks and finally code generation.
 * 
 * @author Andrew
 */
/* package */ class BuildSemanticRepresentation implements ASTWalker {
  
  /* package */ static final BuildSemanticRepresentation INSTANCE = new BuildSemanticRepresentation ();
  
  private static class TaxonomyDefinitionBuilder {
    
    private static class Element {
      
      private final Integer _ordinal;
      
      private final int _autoOrdinal;
      
      private final CodePosition _importCodePosition;
      
      private final CodePosition _codePosition;
      
      private Element (final Integer ordinal, final int autoOrdinal, final CodePosition importCodePosition, final CodePosition codePosition) {
        _ordinal = ordinal;
        _autoOrdinal = autoOrdinal;
        _importCodePosition = importCodePosition;
        _codePosition = codePosition;
      }
      
    }
    
    private final Compiler.Context _context;
    
    private CodePosition _importCodePosition = null;
    
    private final Map<String,Element> _fieldsByName = new HashMap<String,Element> ();
    
    private final Map<Integer,String> _fieldsByOrdinal = new HashMap<Integer,String> ();
    
    private int _nextAutoOrdinal = 0;
    
    private TaxonomyDefinitionBuilder (final Compiler.Context context) {
      _context = context;
    }
    
    private void addField (final CodePosition codePosition, final String name, final Integer ordinal) {
      final Element existing = _fieldsByName.get (name);
      // check the name
      if (existing != null) {
        if (_importCodePosition == null) {
          if (existing._importCodePosition == null) {
            // two explicit declarations in the taxonomy - error
            _context.error (codePosition, "taxonomy element '" + name + "' is already defined");
            _context.warning (existing._codePosition, "this is the previous definition");
            return;
          } else {
            // we've already encountered an imported field with this name - warn unless we're specifying an ordinal
            if (ordinal == null) {
              _context.warning (codePosition, "taxonomy element '" + name + "' is already defined");
              _context.warning (existing._codePosition, "this is the previous definition");
              _context.warning (existing._importCodePosition, "imported from here");
            }
          }
        } else {
          if (existing._importCodePosition == null) {
            // we've previously encountered an explicit declaration while processing an import - warn unless it specified an ordinal
            if (existing._ordinal == null) {
              _context.warning (existing._codePosition, "taxonomy element '" + name + "' is already defined");
              _context.warning (codePosition, "this is the previous definition");
              _context.warning (_importCodePosition, "imported from here");
            }
          }
        }
        if (ordinal != null) {
          if (existing._ordinal != null) {
            if (!ordinal.equals (existing._ordinal)) {
              // we've previously encountered a declaration with explicit ordinal that is different
              if (_importCodePosition == null) {
                _context.error (codePosition, "taxonomy element '" + name + "' already defined with ordinal '" + existing._ordinal);
              } else {
                _context.error (_importCodePosition, "conflicting ordinals for taxonomy element '" + name + "'");
                _context.warning (codePosition, "found this definition");
              }
              _context.warning (existing._codePosition, "this is the previous definition");
              if (existing._importCodePosition != null) {
                _context.warning (existing._importCodePosition, "imported from here");
              }
            }
            // we've either errored or we've got something identical to one we've already seen
            return;
          }
        } else {
          // we've already got his name, and there is no ordinal check to do so stop
          return;
        }
      }
      // check the ordinal
      if (ordinal != null) {
        final String existingOrdinal = _fieldsByOrdinal.get (ordinal);
        if (existingOrdinal != null) {
          // the ordinal is in use, but not for this name or we'd have found it above so error
          final Element existingOrdinalElement = _fieldsByName.get (existingOrdinal);
          if (_importCodePosition == null) {
            _context.error (codePosition, "taxonomy ordinal '" + ordinal + "' already in use for '" + existingOrdinal + "'");
          } else {
            _context.error (_importCodePosition, "conflicting names for taxonomy ordinal '" + ordinal + "'");
            _context.warning (codePosition, "found this definition");
          }
          _context.warning (existingOrdinalElement._codePosition, "this is the previous definition");
          if (existingOrdinalElement._importCodePosition != null) {
            _context.warning (existingOrdinalElement._importCodePosition, "imported from here");
          }
          return;
        }
        if (ordinal >= _nextAutoOrdinal) _nextAutoOrdinal = ordinal + 1;
      }
      // all checks passed - store the name and ordinal
      _fieldsByName.put (name, new Element (ordinal, (ordinal == null) ? _nextAutoOrdinal++ : 0, _importCodePosition, codePosition));
      if (ordinal != null) {
        _fieldsByOrdinal.put (ordinal, name);
      }
    }
    
    private void setImportCodePosition (final CodePosition importCodePosition) {
      _importCodePosition = importCodePosition;
    }
    
    private void setNextAutoOrdinal (final int nextAutoOrdinal) {
      _nextAutoOrdinal = nextAutoOrdinal;
    }
    
    private int getNextAutoOrdinal () {
      return _nextAutoOrdinal;
    }
    
    private void fillTaxonomy (final TaxonomyDefinition taxonomyDefinition) {
      outer: for (Map.Entry<String,Element> entry : _fieldsByName.entrySet ()) {
        final Element element = entry.getValue ();
        if (element._ordinal != null) {
          // add with the explicit ordinal
          taxonomyDefinition.addElement (entry.getKey (), element._ordinal);
        } else {
          // add with the automatic ordinal (or next one that's available)
          // this code is *very* inefficient
          int i = element._autoOrdinal;
          while (i < Short.MAX_VALUE) {
            if (!_fieldsByOrdinal.containsKey (i)) {
              taxonomyDefinition.addElement (entry.getKey (), i);
              continue outer;
            } else {
              i++;
            }
          }
          // if we get here there isn't a 16 bit field value available
          if (element._importCodePosition != null) {
            _context.error (element._importCodePosition, "cannot assign ordinal for '" + entry.getKey () + "'");
            _context.warning (element._codePosition, "this is the definition");
          } else {
            _context.error (element._codePosition, "cannot assign ordinal for '" + entry.getKey () + "'");
          }
        }
      }
    }
    
  }
  
  private BuildSemanticRepresentation () {
  }
  
  private void walkEnumNode (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String identifier = children.get (0).getNodeValue ();
    final EnumDefinition definition = (EnumDefinition)context.getDefinition (identifier);
    for (int i = 1; i < children.size (); i++) {
      final String name = children.get (i).getNodeValue ();
      if (definition.findElementByName (name) != null) {
        context.error (node.getCodePosition (), "enum element '" + name + "' is already defined in '" + identifier + "'");
        continue;
      }
      final List<AST> element = children.get (i).getChildNodes ();
      if ((element != null) && (element.size () == 1)) {
        final int index = Integer.decode (element.get (0).getNodeValue ());
        if (definition.findElementByIndex (index) != null) {
          context.error (node.getCodePosition (), "enum index '" + index + "' has already been used in '" + identifier + "'");
          continue;
        }
        definition.addElement (name, index);
      } else {
        definition.addElement (name);
      }
    }
  }
  
  private FieldType walkArrayFieldType (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    FieldType type = walkFieldType (context, children.get (0));
    for (int i = 1; i < children.size (); i++) {
      final AST dim = children.get (i);
      switch (dim.getNodeLabel ()) {
      case ProtoLexer.DIM_FIXED :
        type = type.arrayOf (Integer.decode (dim.getChildNodes ().get (0).getNodeValue ()));
        break;
      case ProtoLexer.DIM_VARIANT :
        type = type.arrayOf ();
        break;
      default :
        throw new IllegalStateException ("invalid dimension node '" + dim.getNodeLabel () + "'");
      }
    }
    return type;
  }
  
  private FieldType walkIdentifierFieldType (final Compiler.Context context, final AST node) {
    final Definition definition = context.getDefinition (node.getNodeValue ());
    if (definition == null) {
      context.error (node.getCodePosition (), "unknown type '" + node.getNodeValue () + "'");
      return FieldType.INDICATOR_TYPE;
    } else if (definition instanceof MessageDefinition) {
      return ((MessageDefinition)definition).getFieldType ();
    } else if (definition instanceof EnumDefinition) {
      return ((EnumDefinition)definition).getFieldType ();
    } else {
      context.error (node.getCodePosition (), "cannot use '" + definition.getIdentifier () + "' as a field type");
      return FieldType.INDICATOR_TYPE;
    }
  }
  
  private FieldType walkFieldType (final Compiler.Context context, final AST node) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.ARRAY :
      return walkArrayFieldType (context, node);
    case ProtoLexer.IDENTIFIER :
      return walkIdentifierFieldType (context, node);
    case ProtoLexer.MESSAGE :
      return FieldType.AnonMessageType.INSTANCE;
    case ProtoLexer.T_BOOL :
      return FieldType.BOOLEAN_TYPE;
    case ProtoLexer.T_BYTE :
      return FieldType.BYTE_TYPE;
    case ProtoLexer.T_DATE :
      return FieldType.DATE_TYPE;
    case ProtoLexer.T_DATETIME :
      return FieldType.DATETIME_TYPE;
    case ProtoLexer.T_SHORT :
      return FieldType.SHORT_TYPE;
    case ProtoLexer.T_INT :
      return FieldType.INT_TYPE;
    case ProtoLexer.T_LONG :
      return FieldType.LONG_TYPE;
    case ProtoLexer.T_FLOAT :
      return FieldType.FLOAT_TYPE;
    case ProtoLexer.T_DOUBLE :
      return FieldType.DOUBLE_TYPE;
    case ProtoLexer.T_INDICATOR :
      return FieldType.INDICATOR_TYPE;
    case ProtoLexer.T_STRING :
      return FieldType.STRING_TYPE;
    case ProtoLexer.T_TIME :
      return FieldType.TIME_TYPE;
    default :
      throw new IllegalStateException ("invalid type node '" + node.getNodeLabel () + "'"); 
    }
  }
  
  private void fieldSetDefaultValue (final Compiler.Context context, final FieldDefinition fieldDefinition, final AST node) {
    if (fieldDefinition.getDefaultValue () != null) {
      context.error (node.getCodePosition (), "default value already set on '" + fieldDefinition.getIdentifier () + "'");
      return;
    }
    // No type checking of the literal is done at this stage as it might be an enum that we haven't walked yet 
    fieldDefinition.setDefaultValue (LiteralValue.parse (node));
  }
  
  private void fieldSetOrdinal (final Compiler.Context context, final FieldDefinition fieldDefinition, final AST node) {
    if (fieldDefinition.getOrdinal () != null) {
      context.error (node.getCodePosition (), "ordinal index already set on '" + fieldDefinition.getIdentifier () + "'");
      return;
    }
    final int ordinal = Integer.decode (node.getNodeValue ());
    final MessageDefinition messageDefinition = fieldDefinition.getOuterMessage ();
    final FieldDefinition prev = messageDefinition.getFieldDefinition (ordinal); 
    if (prev != null) {
      context.error (node.getCodePosition (), "ordinal index '" + ordinal + "' already used within '" + messageDefinition.getIdentifier () + "'");
      context.warning (prev.getCodePosition (), "this was the previous declaration of index '" + ordinal + "'");
      return;
    }
    fieldDefinition.setOrdinal (ordinal);
  }
  
  private void walkFieldNode (final Compiler.Context context, final MessageDefinition messageDefinition, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final FieldType type = walkFieldType (context, children.get (0));
    if (type == null) return;
    final String identifier = children.get (1).getNodeValue ();
    FieldDefinition field = messageDefinition.getFieldDefinition (identifier); 
    if (field != null) {
      context.error (node.getCodePosition (), "field name '" + identifier + "' already in use within '" + messageDefinition.getIdentifier () + "'");
      context.warning (field.getCodePosition (), "this was the previous declaration of '" + identifier + "'");
      return;
    }
    field = messageDefinition.createFieldDefinition (identifier, node.getCodePosition (), type);
    for (int i = 2; i < children.size (); i++) {
      final AST element = children.get (i);
      switch (element.getNodeLabel ()) {
      case ProtoLexer.DEFAULT :
        fieldSetDefaultValue (context, field, element.getChildNodes ().get (0));
        break;
      case ProtoLexer.MUTABLE :
        field.setMutable (true);
        break;
      case ProtoLexer.ORDINAL :
        fieldSetOrdinal (context, field, element.getChildNodes ().get (0));
        break;
      case ProtoLexer.REPEATED :
        field.setRepeated (true);
        break;
      case ProtoLexer.REQUIRED :
        field.setRequired (true);
        break;
      default :
        throw new IllegalStateException ("invalid field modifier '" + element.getNodeLabel () + "'");
      }
    }
  }
  
  private void walkExtendsNode (final Compiler.Context context, final MessageDefinition message, final AST node) {
    final List<AST> children = node.getChildNodes ();
    for (int i = 0; i < children.size (); i++) {
      final AST child = children.get (i);
      final Definition definition = context.getDefinition (child.getNodeValue ());
      if (definition == null) {
        context.error (child.getCodePosition (), "unknown message '" + child.getNodeValue () + "'");
        continue;
      }
      if (!(definition instanceof MessageDefinition)) {
        context.error (child.getCodePosition (), "cannot use '" + definition.getIdentifier () + "' as a base message type");
        continue;
      }
      final MessageDefinition baseMessage = (MessageDefinition)definition;
      if (baseMessage.equals (message)) {
        context.error (child.getCodePosition (), "message cannot use itself as a base");
        continue;
      }
      if (baseMessage.extendsFrom (message)) {
        context.error (child.getCodePosition (), "message '" + baseMessage.getIdentifier () + "' extends from '" + message.getIdentifier () + "' so can't be used as a base"); 
        continue;
      }
      if (message.extendsFrom (baseMessage)) {
        context.warning (child.getCodePosition (), "message '" + baseMessage.getIdentifier () + "' is already a base of '" + message.getIdentifier () + "'");
        continue;
      }
      if (message.getExtends () != null) {
        context.error (child.getCodePosition (), "the extends clause doesn't support multiple inheritance at the moment so '" + baseMessage.getIdentifier () + "' has been ignored");
        continue;
      }
      message.setExtends (baseMessage);
    }
  }
  
  private void walkUsesNode (final Compiler.Context context, final MessageDefinition message, final AST node) {
    final Definition definition = context.getDefinition (node.getNodeValue ());
    if (definition == null) {
      context.error (node.getCodePosition (), "unknown taxonomy '" + node.getNodeValue () + "'");
      return;
    } else if (!(definition instanceof TaxonomyDefinition)) {
      context.error (node.getCodePosition (), "cannot use '" + definition.getIdentifier () + "' as a taxonomy");
      return;
    }
    context.warning (node.getCodePosition (), "the uses clause isn't supported at the moment and is being ignored");
    // TODO 2010-01-12 Andrew -- implement the taxonomy verify warnings
  }
  
  private void walkMessageNode (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String identifier = children.get (0).getNodeValue ();
    final MessageDefinition definition = (MessageDefinition)context.getDefinition (identifier);
    for (int i = 1; i < children.size (); i++) {
      final AST element = children.get (i);
      switch (element.getNodeLabel ()) {
      case ProtoLexer.ENUM:
        walkEnumNode (context, element);
        break;
      case ProtoLexer.EXTENDS :
        walkExtendsNode (context, definition, element);
        break;
      case ProtoLexer.FIELD:
        walkFieldNode (context, definition, element);
        break;
      case ProtoLexer.MESSAGE:
        walkMessageNode (context, element);
        break;
      case ProtoLexer.USES :
        walkUsesNode (context, definition, element);
        break;
      default:
        throw new IllegalStateException("invalid element type '" + element.getNodeLabel() + "'");
      }
    }
  }
  
  private void walkTaxonomyElementNode (final TaxonomyDefinitionBuilder builder, final AST node) {
    final String name = node.getNodeValue ();
    final List<AST> element = node.getChildNodes ();
    if ((element != null) && (element.size () > 0)) {
      builder.addField (node.getCodePosition (), name, Integer.decode (element.get (0).getNodeValue ()));
    } else {
      builder.addField (node.getCodePosition (), name, null);
    }
  }
  
  private void taxonomyImportMessageFields (final TaxonomyDefinitionBuilder builder, final MessageDefinition messageDefinition) {
    for (FieldDefinition field : messageDefinition.getFieldDefinitions ()) {
      builder.addField (field.getCodePosition (), field.getName (), field.getOrdinal ());
    }
  }
  
  private void taxonomyImportMessageSubmessages (final TaxonomyDefinitionBuilder builder, final MessageDefinition messageDefinition) {
    for (MessageDefinition message : messageDefinition.getMessageDefinitions ()) {
      taxonomyImportMessage (builder, message);
    }
  }
  
  private void taxonomyImportMessage (final TaxonomyDefinitionBuilder builder, final MessageDefinition messageDefinition) {
    int nextAutoOrdinal = builder.getNextAutoOrdinal ();
    taxonomyImportMessageFields (builder, messageDefinition);
    taxonomyImportMessageSubmessages (builder, messageDefinition);
    builder.setNextAutoOrdinal (nextAutoOrdinal);
  }
  
  private void walkTaxonomyImportNode (final Compiler.Context context, final TaxonomyDefinitionBuilder builder, final AST node) {
    final String importMessage = node.getChildNodes ().get (0).getNodeValue ();
    final Definition def = context.getDefinition (importMessage);
    if (def == null) {
      context.error (node.getCodePosition (), "unrecognised identifier '" + importMessage + "'");
    } else if (def instanceof MessageDefinition) {
      builder.setImportCodePosition (node.getCodePosition ());
      taxonomyImportMessage (builder, (MessageDefinition)def);
      builder.setImportCodePosition (null);
    } else {
      context.error (node.getCodePosition (), "'" + importMessage + "' is not a message");
    }
  }
  
  private void walkTaxonomyNode (final Compiler.Context context, final AST node) {
    final List<AST> children = node.getChildNodes ();
    final String identifier = children.get (0).getNodeValue ();
    final TaxonomyDefinitionBuilder builder = new TaxonomyDefinitionBuilder (context);
    for (int i = 1; i < children.size (); i++) {
      final AST element = children.get (i);
      switch (element.getNodeLabel ()) {
      case ProtoLexer.IDENTIFIER :
        walkTaxonomyElementNode (builder, element);
        break;
      case ProtoLexer.IMPORT :
        walkTaxonomyImportNode (context, builder, element);
        break;
      default :
        throw new IllegalStateException ("invalid taxonomy element '" + element.getNodeLabel () + "'");
      }
    }
    final TaxonomyDefinition definition = (TaxonomyDefinition)context.getDefinition (identifier);
    builder.fillTaxonomy (definition);
  }
  
  @Override
  public void walkAstNode (final Compiler.Context context, final AST node) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.ENUM :
      walkEnumNode (context, node);
      break;
    case ProtoLexer.MESSAGE :
      walkMessageNode (context, node);
      break;
    case ProtoLexer.TAXONOMY :
      walkTaxonomyNode (context, node);
      break;
    default :
      throw new IllegalStateException ("invalid root type '" + node.getNodeLabel () + "'"); 
    }
  }
  
}