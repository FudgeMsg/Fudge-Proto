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

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

/**
 * Semantic representation of a message.
 * 
 * @author Andrew
 */
public abstract class MessageDefinition extends Definition {
  
  public static final MessageDefinition NULL = new NullMessageDefinition ();
  
  private static class NullMessageDefinition extends MessageDefinition {
    
    private NullMessageDefinition () {
      super (null, null, null);
    }
    
    @Override
    /* package */ FieldDefinition createFieldDefinition (final String identifier, final CodePosition codePosition, final FieldType type) {
      throw new IllegalStateException ("cannot create a field outside of a message context");
    }
    
    @Override
    /* package */ EnumDefinition createEnumDefinition (final String identifier, final CodePosition codePosition) {
      return new EnumDefinition (identifier, codePosition, null);
    }
    
    @Override
    /* package */ MessageDefinition createMessageDefinition (final String identifier, final CodePosition codePosition) {
      return new MessageDefinitionImpl (identifier, codePosition, null);
    }
    
    @Override
    public Iterator<FieldDefinition> getFieldDefinitions () {
      return null;
    }
    
    @Override
    public Iterator<EnumDefinition> getEnumDefinitions () {
      return null;
    }
    
    @Override
    public Iterator<MessageDefinition> getMessageDefinitions () {
      return null;
    }
    
  }
  
  private static class MessageDefinitionImpl extends MessageDefinition {
    
    private final List<MessageDefinition> _innerMessages = new LinkedList<MessageDefinition>();
    
    private final List<FieldDefinition> _innerFields = new LinkedList<FieldDefinition>();
    
    private final List<EnumDefinition> _innerEnums = new LinkedList<EnumDefinition>();
    
    private MessageDefinitionImpl (final String identifier, final CodePosition codePosition, final MessageDefinition outerMessage) {
      super (identifier, codePosition, outerMessage);
    }

    @Override
    /* package */ FieldDefinition createFieldDefinition (final String identifier, final CodePosition codePosition, final FieldType type) {
      final FieldDefinition fieldDefinition = new FieldDefinition (identifier, codePosition, this, type);
      _innerFields.add (fieldDefinition);
      return fieldDefinition;
    }
    
    @Override
    /* package */ EnumDefinition createEnumDefinition (final String identifier, final CodePosition codePosition) {
      final EnumDefinition enumDefinition = new EnumDefinition (identifier, codePosition, this);
      _innerEnums.add (enumDefinition);
      return enumDefinition;
    }
    
    @Override
    /* package */ MessageDefinition createMessageDefinition (final String identifier, final CodePosition codePosition) {
      final MessageDefinition messageDefinition = new MessageDefinitionImpl (identifier, codePosition, this);
      _innerMessages.add (messageDefinition);
      return messageDefinition;
    }
    
    @Override
    public Iterator<FieldDefinition> getFieldDefinitions () {
      return _innerFields.iterator ();
    }
    
    @Override
    public Iterator<EnumDefinition> getEnumDefinitions () {
      return _innerEnums.iterator ();
    }
    
    @Override
    public Iterator<MessageDefinition> getMessageDefinitions () {
      return _innerMessages.iterator ();
    }
    
  }
  
  private MessageDefinition (final String identifier, final CodePosition codePosition, final MessageDefinition outerMessage) {
    super (identifier, codePosition, outerMessage);
  }
  
  /**
   * Returns a suitable type if this message type is used as a field (i.e. sub-message). 
   */
  public FieldType getFieldType () {
    return new FieldType.MessageType (this);
  }
  
  public MessageDefinition getOuterMessage () {
    return (MessageDefinition) getOuterDefinition ();
  }
  
  /* package */ abstract FieldDefinition createFieldDefinition (final String identifier, final CodePosition codePosition, final FieldType type);
  
  /* package */ abstract EnumDefinition createEnumDefinition (final String identifier, final CodePosition codePosition);
  
  /* package */ abstract MessageDefinition createMessageDefinition (final String identifier, final CodePosition codePosition);
  
  public abstract Iterator<FieldDefinition> getFieldDefinitions ();
  
  public FieldDefinition getFieldDefinition (final String identifier) {
    final Iterator<FieldDefinition> i = getFieldDefinitions ();
    while (i.hasNext ()) {
      final FieldDefinition field = i.next ();
      if (identifier.equals (field.getIdentifier ())) return field;
    }
    return null;
  }
  
  public FieldDefinition getFieldDefinition (final Integer ordinal) {
    final Iterator<FieldDefinition> i = getFieldDefinitions ();
    while (i.hasNext ()) {
      final FieldDefinition field = i.next ();
      if (ordinal.equals (field.getOrdinal ())) return field;
    }
    return null;
  }
  
  public abstract Iterator<EnumDefinition> getEnumDefinitions ();
  
  public abstract Iterator<MessageDefinition> getMessageDefinitions ();
  
  @Override
  public String toString () {
    final StringBuilder sb = new StringBuilder (getIdentifier ()).append (" = {");
    final Iterator<MessageDefinition> messages = getMessageDefinitions ();
    if (messages != null) {
      sb.append (" messages = { ");
      while (messages.hasNext ()) {
        sb.append (messages.next ().toString ()).append (", ");
      }
      sb.append ('}');
    }
    final Iterator<FieldDefinition> fields = getFieldDefinitions ();
    if (fields != null) {
      sb.append (" fields = { ");
      while (fields.hasNext ()) {
        sb.append (fields.next ().toString()).append (", ");
      }
      sb.append ('}');
    }
    final Iterator<EnumDefinition> enums = getEnumDefinitions ();
    if (enums != null) {
      sb.append (" enums = { ");
      while (enums.hasNext ()) {
        sb.append (enums.next ().toString ()).append (", ");
      }
      sb.append ('}');
    }
    sb.append ("}");
    return sb.toString ();
  }
  
}