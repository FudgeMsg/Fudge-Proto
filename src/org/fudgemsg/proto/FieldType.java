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

import org.fudgemsg.FudgeTypeDictionary;

/**
 * Internal representation of a field type.
 * 
 * @author Andrew
 */
public abstract class FieldType {
  
  /**
   * A field type that has native array support from Fudge.
   */
  private static class FudgeArrayable extends FieldType {
    
    private final int _fudgeFieldType;
    private final ArrayType _arrayOf;
    
    private FudgeArrayable (final String description, final int fudgeFieldType, final int fudgeArrayFieldType) {
      super (description);
      _fudgeFieldType = fudgeFieldType;
      _arrayOf = new SimpleArrayType (fudgeArrayFieldType, this, null);
    }
    
    public ArrayType arrayOf (final Integer length) {
      if (length != null) {
        return new SimpleArrayType (_arrayOf.getFudgeFieldType (), this, length);
      } else {
        return _arrayOf;
      }
    }

    @Override
    public int getFudgeFieldType() {
      return _fudgeFieldType;
    }
    
  }
  
  /**
   * The special case of the byte array with fixed width encodings.
   */
  private static class FudgeByteType extends FieldType {
    
    private final ArrayType ARRAY_VARIABLE = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARRAY_TYPE_ID, this, null);
    private final ArrayType ARRAY_LENGTH_4 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_4_TYPE_ID, this, 4);
    private final ArrayType ARRAY_LENGTH_8 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_8_TYPE_ID, this, 8);
    private final ArrayType ARRAY_LENGTH_16 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_16_TYPE_ID, this, 16);
    private final ArrayType ARRAY_LENGTH_20 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_20_TYPE_ID, this, 20);
    private final ArrayType ARRAY_LENGTH_32 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_32_TYPE_ID, this, 32);
    private final ArrayType ARRAY_LENGTH_64 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_64_TYPE_ID, this, 64);
    private final ArrayType ARRAY_LENGTH_128 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_128_TYPE_ID, this, 128);
    private final ArrayType ARRAY_LENGTH_256 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_256_TYPE_ID, this, 256);
    private final ArrayType ARRAY_LENGTH_512 = new SimpleArrayType (FudgeTypeDictionary.BYTE_ARR_512_TYPE_ID, this, 512);
    
    private FudgeByteType () {
      super ("byte");
    }
    
    public ArrayType arrayOf (final Integer length) {
      if (length == null) {
        return ARRAY_VARIABLE;
      }
      switch (length) {
      case 4 : return ARRAY_LENGTH_4;
      case 8 : return ARRAY_LENGTH_8;
      case 16 : return ARRAY_LENGTH_16;
      case 20 : return ARRAY_LENGTH_20;
      case 32 : return ARRAY_LENGTH_32;
      case 64 : return ARRAY_LENGTH_64;
      case 128 : return ARRAY_LENGTH_128;
      case 256 : return ARRAY_LENGTH_256;
      case 512 : return ARRAY_LENGTH_512;
      default : return new SimpleArrayType (FudgeTypeDictionary.BYTE_TYPE_ID, this, length);
      }
    }

    @Override
    public int getFudgeFieldType() {
      return FudgeTypeDictionary.BYTE_TYPE_ID;
    }
    
  }
  
  /**
   * A field type that does not have native array support from Fudge but we can synthesise with a submessage
   */
  private static abstract class NonFudgeArrayable extends FieldType {
    
    private ArrayType _arrayOf = null;
    
    private NonFudgeArrayable (final String description) {
      super (description);
    }
    
    public ArrayType arrayOf (final Integer length) {
      if (length == null) {
        if (_arrayOf == null) {
          synchronized (this) {
            if (_arrayOf == null) {
              _arrayOf = new SimpleArrayType (FudgeTypeDictionary.FUDGE_MSG_TYPE_ID, this, null);
            }
          }
        }
        return _arrayOf;
      } else {
        return new SimpleArrayType (FudgeTypeDictionary.FUDGE_MSG_TYPE_ID, this, length);
      }
    }

  }
  
  /**
   * Implementation of NonFudgeArrayable
   */
  private static class SimpleNonFudgeArrayable extends NonFudgeArrayable {

    private final int _fudgeFieldType;
    
    private SimpleNonFudgeArrayable (final String description, final int fudgeFieldType) {
      super (description);
      _fudgeFieldType = fudgeFieldType;
    }
    
    @Override
    public int getFudgeFieldType () {
      return _fudgeFieldType;
    }
    
  }
  
  /**
   * An array field type.
   */
  public static abstract class ArrayType extends NonFudgeArrayable {
    
    private final Integer _length; // or null if an arbitrary length
    
    private final FieldType _baseType;
    
    private ArrayType (final FieldType baseType, final Integer length) {
      super (createDescription (baseType.toString (), length));
      if (length != null) {
        if (length < 0) throw new IllegalArgumentException ("length cannot be negative");
      }
      _baseType = baseType;
      _length = length;
    }
    
    public boolean isFixedLength () {
      return _length != null;
    }
    
    public int getFixedLength () {
      if (_length == null) throw new IllegalStateException ("not a fixed length array type");
      return _length;
    }
    
    /**
     * Returns true if one of the base types is of fixed length. 
     */
    public boolean isDeepFixedLength () {
      if (!(_baseType instanceof ArrayType)) return false;
      final FieldType.ArrayType baseArray = (FieldType.ArrayType)_baseType;
      return baseArray.isFixedLength () || baseArray.isDeepFixedLength ();
    }
    
    public FieldType getBaseType () {
      return _baseType;
    }
    
    private static String createDescription (String baseType, Integer length) {
      final StringBuilder sb = new StringBuilder (baseType);
      sb.append ('[');
      if (length != null) sb.append ((int)length);
      sb.append (']');
      return sb.toString ();
    }
    
    @Override
    public boolean equals (final Object o) {
      if (o == null) return false;
      if (!(o instanceof ArrayType)) return false;
      final ArrayType a = (ArrayType)o;
      if (_length == null) {
        if (a._length != null) return false;
      } else {
        if (a._length == null) return false;
        if (getFixedLength () != a.getFixedLength ()) return false;
      }
      return _baseType.equals (a._baseType);
    }
    
  }
  
  /**
   * A simple implementation of the array type.
   */
  private static class SimpleArrayType extends ArrayType {
    
    private final int _fudgeFieldType;
    
    private SimpleArrayType (final int fudgeFieldType, final FieldType baseType, final Integer length) {
      super (baseType, length);
      _fudgeFieldType = fudgeFieldType;
    }
    
    @Override
    public int getFudgeFieldType () {
      return _fudgeFieldType;
    }
    
  }
  
  /**
   * A sub-message type. 
   */
  public static class MessageType extends NonFudgeArrayable {
    
    private final MessageDefinition _messageDefinition;
    
    /* package */ MessageType (final MessageDefinition messageDefinition) {
      super (messageDefinition.getName () + " message");
      _messageDefinition = messageDefinition;
    }
    
    public MessageDefinition getMessageDefinition () {
      return _messageDefinition;
    }
    
    @Override
    public String toString () {
      return _messageDefinition.getName () + " message";
    }
    
    @Override
    public boolean equals (final Object o) {
      if (o == null) return false;
      if (!(o instanceof MessageType)) return false;
      return _messageDefinition.equals (((MessageType)o)._messageDefinition);
    }

    @Override
    public int getFudgeFieldType() {
      return FudgeTypeDictionary.FUDGE_MSG_TYPE_ID;
    }
    
  }
  
  /**
   * The anonymous sub-message type
   */
  public static class AnonMessageType extends MessageType {
    
    /* package */ static final AnonMessageType INSTANCE = new AnonMessageType ();
    
    private AnonMessageType () {
      super (MessageDefinition.ANONYMOUS);
    }
    
    @Override
    public String toString () {
      return "anonymous/unknown message";
    }
    
    @Override
    public boolean equals (final Object o) {
      return false;
    }
    
  }
  
  /**
   * A custom enum type.
   */
  public static class EnumType extends FieldType {
    
    private final EnumDefinition _enumDefinition;
    
    /* package */ EnumType (final EnumDefinition enumDefinition) {
      super (enumDefinition.getName () + " enum");
      _enumDefinition = enumDefinition;
    }
    
    public EnumDefinition getEnumDefinition () {
      return _enumDefinition;
    }
    
    public int getFudgeFieldType () {
      if (_enumDefinition.getType () == EnumDefinition.Type.INTEGER_ENCODED) {
        return FudgeTypeDictionary.INT_TYPE_ID;
      } else {
        return FudgeTypeDictionary.STRING_TYPE_ID;
      }
    }
    
    @Override
    public boolean equals (final Object o) {
      if (o == null) return false;
      if (!(o instanceof EnumType)) return false;
      return _enumDefinition.equals (((EnumType)o)._enumDefinition);
    }

    @Override
    public ArrayType arrayOf(final Integer length) {
      return new ArrayType (this, length) {
        @Override
        public int getFudgeFieldType() {
          if (_enumDefinition.getType () == EnumDefinition.Type.INTEGER_ENCODED) {
            return FudgeTypeDictionary.INT_ARRAY_TYPE_ID;
          } else {
            return FudgeTypeDictionary.FUDGE_MSG_TYPE_ID;
          }
        }
      };      
    }
    
  }
  
  private final String _description;
  
  private FieldType (final String description) {
    _description = description;
  }
  
  /**
   * Returns a type representing an arbitrary length array of this type.
   */
  public ArrayType arrayOf () {
    return arrayOf (null);
  }
  
  /**
   * Returns a type representing a fixed length array of this type.
   */
  public abstract ArrayType arrayOf (final Integer length);
  
  public abstract int getFudgeFieldType ();
  
  @Override
  public String toString () {
    return _description;
  }
  
  // The basic Fudge types
  
  public static final FieldType INDICATOR_TYPE = new SimpleNonFudgeArrayable ("indicator", FudgeTypeDictionary.INDICATOR_TYPE_ID);
  public static final FieldType BOOLEAN_TYPE = new SimpleNonFudgeArrayable ("boolean", FudgeTypeDictionary.BOOLEAN_TYPE_ID);
  public static final FieldType BYTE_TYPE = new FudgeByteType ();
  public static final FieldType SHORT_TYPE = new FudgeArrayable ("short", FudgeTypeDictionary.SHORT_TYPE_ID, FudgeTypeDictionary.SHORT_ARRAY_TYPE_ID);
  public static final FieldType INT_TYPE = new FudgeArrayable ("integer", FudgeTypeDictionary.INT_TYPE_ID, FudgeTypeDictionary.INT_ARRAY_TYPE_ID);
  public static final FieldType LONG_TYPE = new FudgeArrayable ("long", FudgeTypeDictionary.LONG_TYPE_ID, FudgeTypeDictionary.LONG_ARRAY_TYPE_ID);
  public static final FieldType FLOAT_TYPE = new FudgeArrayable ("float", FudgeTypeDictionary.FLOAT_TYPE_ID, FudgeTypeDictionary.FLOAT_ARRAY_TYPE_ID);
  public static final FieldType DOUBLE_TYPE = new FudgeArrayable ("double", FudgeTypeDictionary.DOUBLE_TYPE_ID, FudgeTypeDictionary.DOUBLE_ARRAY_TYPE_ID);
  public static final FieldType STRING_TYPE = new SimpleNonFudgeArrayable ("string", FudgeTypeDictionary.STRING_TYPE_ID);
  public static final FieldType DATE_TYPE = new SimpleNonFudgeArrayable ("date", FudgeTypeDictionary.DATE_TYPE_ID);
  public static final FieldType DATETIME_TYPE = new SimpleNonFudgeArrayable ("datetime", FudgeTypeDictionary.DATETIME_TYPE_ID);
  public static final FieldType TIME_TYPE = new SimpleNonFudgeArrayable ("time", FudgeTypeDictionary.TIME_TYPE_ID);
  
}