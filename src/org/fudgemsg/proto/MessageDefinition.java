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

import java.util.List;
import java.util.Collection;
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
    public Collection<FieldDefinition> getFieldDefinitions () {
      return null;
    }
    
    @Override
    public Collection<EnumDefinition> getEnumDefinitions () {
      return null;
    }
    
    @Override
    public Collection<MessageDefinition> getMessageDefinitions () {
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
    public Collection<FieldDefinition> getFieldDefinitions () {
      return _innerFields;
    }
    
    @Override
    public Collection<EnumDefinition> getEnumDefinitions () {
      return _innerEnums;
    }
    
    @Override
    public Collection<MessageDefinition> getMessageDefinitions () {
      return _innerMessages;
    }
    
  }
  
  private MessageDefinition _baseMessage;
  
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
  
  public abstract Collection<FieldDefinition> getFieldDefinitions ();
  
  public FieldDefinition getFieldDefinition (final String identifier) {
    for (FieldDefinition field : getFieldDefinitions ()) {
      if (identifier.equals (field.getIdentifier ())) return field;
    }
    return null;
  }
  
  public FieldDefinition getFieldDefinition (final Integer ordinal) {
    for (FieldDefinition field : getFieldDefinitions ()) {
      if (ordinal.equals (field.getOrdinal ())) return field;
    }
    return null;
  }
  
  public abstract Collection<EnumDefinition> getEnumDefinitions ();
  
  public abstract Collection<MessageDefinition> getMessageDefinitions ();
  
  @Override
  public String toString () {
    final StringBuilder sb = new StringBuilder (getIdentifier ()).append (" = {");
    if (getMessageDefinitions () != null) {
      sb.append (" messages = { ");
      for (MessageDefinition message : getMessageDefinitions ()) {
        sb.append (message.toString ()).append (", ");
      }
      sb.append ('}');
    }
    if (getFieldDefinitions () != null) {
      sb.append (" fields = { ");
      for (FieldDefinition field : getFieldDefinitions ()) {
        sb.append (field.toString()).append (", ");
      }
      sb.append ('}');
    }
    if (getEnumDefinitions () != null) {
      sb.append (" enums = { ");
      for (EnumDefinition enumdef : getEnumDefinitions ()) {
        sb.append (enumdef.toString ()).append (", ");
      }
      sb.append ('}');
    }
    sb.append ("}");
    return sb.toString ();
  }
  
  public boolean extendsFrom (final MessageDefinition message) {
    if (_baseMessage == null) return false;
    if (message.equals (_baseMessage)) return true;
    return _baseMessage.extendsFrom (message);
  }
  
  public MessageDefinition getExtends () {
    return _baseMessage;
  }
  
  public void setExtends (final MessageDefinition message) {
    _baseMessage = message;
  }
  
}