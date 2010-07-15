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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.fudgemsg.FudgeTypeDictionary;
import org.fudgemsg.proto.Compiler.Context;
import org.fudgemsg.proto.antlr.ProtoLexer;

/**
 * Representation of a literal value, e.g. a default value for a field.
 * 
 * @author Andrew
 */
public abstract class LiteralValue {
  
  private final CodePosition _codePosition;
  
  public static abstract class NumericValue extends LiteralValue {
    
    private NumericValue (final CodePosition codePosition) {
      super (codePosition);
    }
    
    public abstract Number getNumber ();
    
    protected IntegerValue longCastRange (final Compiler.Context context, final long min, final long max) {
      long value = getNumber ().longValue ();
      if (value < min) {
        context.warning (getCodePosition (), "cast of default value (" + value + ") beyond min value " + min);
        value = min;
      }
      if (value > max) {
        context.warning (getCodePosition (), "cast of default value (" + value + ") beyond max value " + max);
        value = max;
      }
      return new IntegerValue (getCodePosition (), value);
    }
    
    protected FloatValue floatCast (final Compiler.Context context) {
      return new FloatValue (getCodePosition (), getNumber ().floatValue ());
    }
    
    protected DoubleValue doubleCast (final Compiler.Context context) {
      return new DoubleValue (getCodePosition (), getNumber ().doubleValue ());
    }

    @Override
    public LiteralValue assignmentTo (final Compiler.Context context, final FieldType fieldType) {
      if (fieldType instanceof FieldType.EnumType) {
        context.error (getCodePosition (), "invalid default value for type '" + fieldType + "'");
        return null;
      }
      switch (fieldType.getFudgeFieldType ()) {
      case FudgeTypeDictionary.BOOLEAN_TYPE_ID : return new IntegerValue (getCodePosition (), (getNumber ().doubleValue () != 0) ? 1 : 0);
      case FudgeTypeDictionary.BYTE_TYPE_ID : return longCastRange (context, Byte.MIN_VALUE, Byte.MAX_VALUE);
      case FudgeTypeDictionary.SHORT_TYPE_ID : return longCastRange (context, Short.MIN_VALUE, Short.MAX_VALUE);
      case FudgeTypeDictionary.INT_TYPE_ID : return longCastRange (context, Integer.MIN_VALUE, Integer.MAX_VALUE);
      case FudgeTypeDictionary.LONG_TYPE_ID : return longCastRange (context, Long.MIN_VALUE, Long.MAX_VALUE);
      case FudgeTypeDictionary.FLOAT_TYPE_ID : return floatCast (context);
      case FudgeTypeDictionary.DOUBLE_TYPE_ID : return doubleCast (context);
      case FudgeTypeDictionary.STRING_TYPE_ID : return new StringValue (getCodePosition (), getNumber ().toString ());
      default :
        context.error (getCodePosition (), "invalid default value for type '" + fieldType + "'");
        return null;
      }
    }
    
    @Override
    protected Object getInternalValue () {
      return getNumber ();
    }
    
  }
  
  public static class IntegerValue extends NumericValue {
    
    private final long _value;
    
    private IntegerValue (final CodePosition codePosition, final long value) {
      super (codePosition);
      _value = value;
    }      

    private IntegerValue (final AST node) {
      super (node.getCodePosition ());
      final String value = node.getNodeValue ();
      if (value.charAt (0) == '+') {
        // Our grammar allows a leading + but the Java decoder doesn't
        _value = Long.decode (value.substring (1));
      } else {
        _value = Long.decode (value);
      }
    }
    
    @Override
    protected IntegerValue longCastRange (final Compiler.Context context, final long min, final long max) {
      if ((_value >= min) && (_value <= max)) return this;
      return super.longCastRange (context, min, max);
    }
    
    @Override
    public Number getNumber () {
      return _value;
    }
    
    public long get () {
      return _value;
    }
    
  }
  
  public static class DoubleValue extends NumericValue {
    
    private final double _value;
    
    private DoubleValue (final CodePosition codePosition, final double value) {
      super (codePosition);
      _value = value;
    }
    
    @Override
    protected IntegerValue longCastRange (final Compiler.Context context, final long min, final long max) {
      context.warning (getCodePosition (), "floating point type being cast to integral type");
      return super.longCastRange (context, min, max);
    }
    
    @Override
    protected FloatValue floatCast (final Compiler.Context context) {
      final String asFloat = Float.toString ((float)_value);
      final String asDouble = Double.toString (_value);
      if (!asFloat.equals (asDouble)) context.warning (getCodePosition (), "double precision value (" + asDouble + ") being cast to single precision type");
      return super.floatCast (context);
    }

    private DoubleValue (final AST node) {
      super (node.getCodePosition ());
      _value = Double.parseDouble (node.getNodeValue ());
    }
    
    @Override
    public Number getNumber () {
      return _value;
    }
    
    public double get () {
      return _value;
    }
    
  }
  
  public static class FloatValue extends NumericValue {
    
    private final float _value;
    
    private FloatValue (final CodePosition codePosition, final float value) {
      super (codePosition);
      _value = value;
    }
    
    @Override
    protected FloatValue floatCast (final Compiler.Context context) {
      return this;
    }
    
    @Override
    public Number getNumber () {
      return _value;
    }
    
    public float get () {
      return _value;
    }
    
  }
  
  public static class StringValue extends LiteralValue {
    
    private final String _value;
    
    private StringValue (final CodePosition codePosition, final String value) {
      super (codePosition);
      _value = value;
    }
    
    private StringValue (final AST node) {
      super (node.getCodePosition ());
      final char[] c = node.getNodeValue ().toCharArray ();
      final StringBuilder sb = new StringBuilder ();
      for (int i = 1; i < c.length - 1; i++) {
        if (c[i] == '\\') {
          i++;
          if (Character.isDigit (c[i])) {
            // try to parse an octal
            int v = Character.getNumericValue (c[i]);
            while (Character.isDigit (c[i + 1])) {
              i++;
              v = v * 8 + Character.getNumericValue (c[i]);
            }
            sb.append ((char)v);
          } else {
            // detect the special characters, otherwise treat as two characters
            switch (c[i]) {
            case 'a' : sb.append ((char)007); break;
            case 'b' : sb.append ('\b'); break;
            case 't' : sb.append ('\t'); break;
            case 'f' : sb.append ('\f'); break;
            case 'n' : sb.append ('\n'); break;
            case 'r' : sb.append ('\r'); break;
            case 'u' :
              // unicode uXXXX sequence
              sb.append (Integer.parseInt (new String (c, i, 4), 16));
              i += 4;
              break;
            case 'v' : sb.append ((char)013); break;
            case '\'' : sb.append ('\''); break;
            case '\\' : sb.append ('\\'); break;
            case '\"' : sb.append ('\"'); break;
            default :
              sb.append ('\\').append (c[i]);
              break;
            }
          }
        } else {
          sb.append (c[i]);
        }
      }
      _value = sb.toString ();
    }
    
    public String get () {
      return _value;
    }
    
    @Override
    public LiteralValue assignmentTo (final Compiler.Context context, final FieldType fieldType) {
      if (fieldType.getFudgeFieldType () != FudgeTypeDictionary.STRING_TYPE_ID) {
        context.error (getCodePosition (), "invalid default value for type '" + fieldType + "'");
        return null;
      }
      return this;
    }
    
    @Override
    protected Object getInternalValue () {
      return get ();
    }
    
  }
  
  public static class EnumValue extends LiteralValue {
    
    private final EnumDefinition _enumDefinition;
    
    private final String _value;
    
    private EnumValue (final AST node) {
      super (node.getCodePosition ());
      _enumDefinition = null;
      _value = node.getNodeValue ();
    }
    
    private EnumValue (final EnumValue orig, final EnumDefinition enumDefinition) {
      super (orig.getCodePosition ());
      _enumDefinition = enumDefinition;
      _value = orig._value;
    }
    
    public EnumDefinition getEnumDefinition () {
      return _enumDefinition;
    }
    
    public String get () {
      return _value;
    }
    
    public EnumValue resolveDefinition (final EnumDefinition enumDefinition) {
      if (enumDefinition != null) throw new IllegalStateException ("enumDefinition can't be null");
      return new EnumValue (this, enumDefinition);
    }
    
    @Override
    public LiteralValue assignmentTo (final Compiler.Context context, final FieldType fieldType) {
      if (fieldType instanceof FieldType.EnumType) {
        final EnumDefinition enumDefinition = ((FieldType.EnumType)fieldType).getEnumDefinition ();
        if (enumDefinition.findElementByName (_value) == null) {
          context.error (getCodePosition (), "'" + _value + "' is not a member of enum '" + enumDefinition.getName () + "'");
          return null;
        }
        return new EnumValue (this, enumDefinition);
      } else {
        context.error (getCodePosition (), "invalid default value for type '" + fieldType + "'");
        return null;
      }
    }
    
    @Override
    protected Object getInternalValue () {
      return get ();
    }
    
  }
  
  public static class MessageValue extends LiteralValue {

    private final List<LiteralValue> _parameters;
    private final MessageDefinition _message;

    private MessageValue(final AST node) {
      super(node.getCodePosition());
      List<AST> children = node.getChildNodes();
      if (children != null) {
        _parameters = new ArrayList<LiteralValue>(children.size());
        for (AST child : children) {
          _parameters.add(LiteralValue.parse(child));
        }
      } else {
        _parameters = Collections.emptyList();
      }
      _message = null;
    }
    
    private MessageValue(final CodePosition codePosition, final List<LiteralValue> parameters,
        final MessageDefinition message) {
      super(codePosition);
      _parameters = parameters;
      _message = message;
    }

    public MessageDefinition getMessageDefinition() {
      return _message;
    }

    public List<LiteralValue> getParameters() {
      return _parameters;
    }

    private int assignParameters(final Context context, final MessageDefinition message,
        final List<LiteralValue> target, final boolean allFields, int i) {
      if (message.getExtends() != null) {
        i = assignParameters(context, message.getExtends(), target, allFields, i);
        if (i < 0) {
          return -1;
        }
      }
      for (FieldDefinition field : message.getFieldDefinitions()) {
        if (allFields || field.isRequired()) {
          final LiteralValue literal = _parameters.get(i++).assignmentTo(context, field.getType());
          if (literal != null) {
            target.add(literal);
          } else {
            return -1;
          }
        }
      }
      return i;
    }

    @Override
    public LiteralValue assignmentTo(Context context, FieldType fieldType) {
      if (!(fieldType instanceof FieldType.MessageType)) {
        context.error(getCodePosition(), "invalid default value for type '" + fieldType + "'");
        return null;
      }
      final MessageDefinition message = ((FieldType.MessageType) fieldType).getMessageDefinition();
      if (message.isExternal()) {
        // External message - can't coerce or validate the types
        return new MessageValue(getCodePosition(), _parameters, message);
      }
      int allFields = 0, requiredFields = 0;
      MessageDefinition msg = message;
      do {
        for (FieldDefinition field : msg.getFieldDefinitions ()) {
          allFields ++;
          if (field.isRequired ()) requiredFields ++;
        }
        msg = msg.getExtends ();
      } while (msg != null);
      final List<LiteralValue> parameters = new ArrayList<LiteralValue>(_parameters.size());
      if (_parameters.size () == allFields) {
        if (assignParameters(context, message, parameters, true, 0) < 0) {
          return null;
        }
      } else if (_parameters.size () == requiredFields) {
        if (assignParameters(context, message, parameters, false, 0) < 0) {
          return null;
        }
      } else {
        if (allFields != requiredFields) {
          context.error (getCodePosition (), "invalid number of parameters - expected " + requiredFields + " required values or " + allFields + " values for " + message.getName ());
        } else {
          context.error (getCodePosition (), "invalid number of parameters - expected " + allFields + " required values for " + message.getName ());
        }
        context.warning(message.getCodePosition (), "location of constructor definition");
        return null;
      }
      return new MessageValue(getCodePosition(), parameters, message);
    }

    @Override
    protected Object getInternalValue() {
      return _parameters;
    }

    @Override
    public String toString() {
      return _message.getIdentifier() + _parameters.toString();
    }

  }
  
  public static class NullValue extends LiteralValue {
    
    private static final Object s_internal = new Object () {
      @Override
      public String toString () {
        return "<null>";
      }
    };
    
    private NullValue (final CodePosition codePosition) {
      super (codePosition);
    }

    @Override
    public LiteralValue assignmentTo(Context context, FieldType fieldType) {
      return this;
    }
    
    @Override
    protected Object getInternalValue () {
      return s_internal;
    }
    
    public IntegerValue inferInteger (final int value) {
      return new IntegerValue (getCodePosition (), value);
    }
    
    public StringValue inferString (final String value) {
      return new StringValue (getCodePosition (), value);
    }
    
  }
  
  private LiteralValue (final CodePosition codePosition) {
    _codePosition = codePosition;
  }
  
  public static LiteralValue parse (final AST node) {
    switch (node.getNodeLabel ()) {
    case ProtoLexer.INTEGER :
      return new IntegerValue (node);
    case ProtoLexer.FLOAT :
      return new DoubleValue (node);
    case ProtoLexer.STRING :
      return new StringValue (node);
    case ProtoLexer.IDENTIFIER :
      return new EnumValue (node);
    case ProtoLexer.MESSAGE :
      return new MessageValue (node);
    default :
      throw new IllegalStateException ("invalid literal node type '" + node.getNodeLabel () + "'"); 
    }
  }
  
  public static LiteralValue nullValue (final CodePosition codePosition) {
    return new NullValue (codePosition);
  }
  
  /**
   * Returns this object (or a replacement) that can be assigned to the requested field type. Returns NULL
   * if the assignment is not valid and generates compiler warnings/errors.
   */
  public abstract LiteralValue assignmentTo (final Compiler.Context context, final FieldType fieldType);
  
  public CodePosition getCodePosition () {
    return _codePosition;
  }
  
  @Override
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (o == this) return true;
    if (o.getClass () == getClass ()) return true;
    return getInternalValue ().equals (((LiteralValue)o).getInternalValue ());
  }
  
  @Override
  public int hashCode () {
    return getInternalValue ().hashCode ();
  }
  
  protected abstract Object getInternalValue ();
  
  @Override
  public String toString () {
    return getInternalValue ().toString ();
  }
 
}