// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:36(10)
package org.fudgemsg.proto.tests.types;
public class ATypes_Optional implements java.io.Serializable, ATypesBase {
  private static final long serialVersionUID = 8969883795783305852l;
  private final boolean[] __Boolean;
  public static final String _BOOLEAN_KEY = "_Boolean";
  private final byte[] __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final double[] __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final float[] __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final boolean[] __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final int[] __Int;
  public static final String _INT_KEY = "_Int";
  private final long[] __Long;
  public static final String _LONG_KEY = "_Long";
  private final short[] __Short;
  public static final String _SHORT_KEY = "_Short";
  private final String[] __String;
  public static final String _STRING_KEY = "_String";
  private final org.fudgemsg.proto.tests.types.SubMessage[] __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private final org.fudgemsg.proto.tests.types.CustomEnum[] __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private final org.fudgemsg.FudgeFieldContainer[] __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final javax.time.calendar.DateProvider[] __Date;
  public static final String _DATE_KEY = "_Date";
  private final javax.time.calendar.DateTimeProvider[] __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private final javax.time.calendar.TimeProvider[] __Time;
  public static final String _TIME_KEY = "_Time";
  public static class Builder {
    private boolean[] __Boolean;
    private byte[] __Byte;
    private double[] __Double;
    private float[] __Float;
    private boolean[] __Indicator;
    private int[] __Int;
    private long[] __Long;
    private short[] __Short;
    private String[] __String;
    private org.fudgemsg.proto.tests.types.SubMessage[] __SubMessage;
    private org.fudgemsg.proto.tests.types.CustomEnum[] __CustomEnum;
    private org.fudgemsg.FudgeFieldContainer[] __Message;
    private javax.time.calendar.DateProvider[] __Date;
    private javax.time.calendar.DateTimeProvider[] __DateTime;
    private javax.time.calendar.TimeProvider[] __Time;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (_BOOLEAN_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<Boolean> fudge2 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              fudge2.add (fudge1.getFieldValue (Boolean.class, fudge3));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Boolean[]' is not boolean", e);
            }
          }
          final boolean[] fudge4 = new boolean[fudge2.size ()];
          int fudge5 = 0;
          for (boolean fudge6 : fudge2) {
            fudge4[fudge5++] = fudge6;
          }
          _Boolean (fudge4);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Boolean' is not boolean[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_BYTE_KEY);
      if (fudgeField != null)  {
        try {
          _Byte (fudgeMsg.getFieldValue (byte[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Byte' is not byte[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          _Double (fudgeMsg.getFieldValue (double[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Double' is not double[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
      if (fudgeField != null)  {
        try {
          _Float (fudgeMsg.getFieldValue (float[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Float' is not float[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<Boolean> fudge2 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            fudge2.add (fudge3.getValue () != null);
          }
          final boolean[] fudge4 = new boolean[fudge2.size ()];
          int fudge5 = 0;
          for (boolean fudge6 : fudge2) {
            fudge4[fudge5++] = fudge6;
          }
          _Indicator (fudge4);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Indicator' is not indicator[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_INT_KEY);
      if (fudgeField != null)  {
        try {
          _Int (fudgeMsg.getFieldValue (int[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Int' is not integer[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_LONG_KEY);
      if (fudgeField != null)  {
        try {
          _Long (fudgeMsg.getFieldValue (long[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Long' is not long[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_SHORT_KEY);
      if (fudgeField != null)  {
        try {
          _Short (fudgeMsg.getFieldValue (short[].class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Short' is not short[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_STRING_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<String> fudge2 = new java.util.ArrayList<String> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              fudge2.add ((fudge3.getValue () != null) ? fudge3.getValue ().toString () : null);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_String[]' is not string", e);
            }
          }
          _String (fudge2.toArray (new String[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_String' is not string[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_SUBMESSAGE_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge2 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              final org.fudgemsg.proto.tests.types.SubMessage fudge4;
              fudge4 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3));
              fudge2.add (fudge4);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_SubMessage[]' is not SubMessage message", e);
            }
          }
          _SubMessage (fudge2.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_SubMessage' is not SubMessage message[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_CUSTOMENUM_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge2 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              final org.fudgemsg.proto.tests.types.CustomEnum fudge4;
              fudge4 = fudge1.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge3);
              fudge2.add (fudge4);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_CustomEnum[]' is not CustomEnum enum", e);
            }
          }
          _CustomEnum (fudge2.toArray (new org.fudgemsg.proto.tests.types.CustomEnum[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_CustomEnum' is not CustomEnum enum[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge2 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              final org.fudgemsg.FudgeFieldContainer fudge4;
              fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
              fudge2.add (fudge4);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Message[]' is not anonymous/unknown message", e);
            }
          }
          _Message (fudge2.toArray (new org.fudgemsg.FudgeFieldContainer[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Message' is not anonymous/unknown message[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DATE_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<javax.time.calendar.DateProvider> fudge2 = new java.util.ArrayList<javax.time.calendar.DateProvider> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              fudge2.add (fudge1.getFieldValue (javax.time.calendar.DateProvider.class, fudge3));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Date[]' is not date", e);
            }
          }
          _Date (fudge2.toArray (new javax.time.calendar.DateProvider[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Date' is not date[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DATETIME_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<javax.time.calendar.DateTimeProvider> fudge2 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              fudge2.add (fudge1.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge3));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_DateTime[]' is not datetime", e);
            }
          }
          _DateTime (fudge2.toArray (new javax.time.calendar.DateTimeProvider[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_DateTime' is not datetime[]", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_TIME_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<javax.time.calendar.TimeProvider> fudge2 = new java.util.ArrayList<javax.time.calendar.TimeProvider> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              fudge2.add (fudge1.getFieldValue (javax.time.calendar.TimeProvider.class, fudge3));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Time[]' is not time", e);
            }
          }
          _Time (fudge2.toArray (new javax.time.calendar.TimeProvider[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ATypes_Optional - field '_Time' is not time[]", e);
        }
      }
    }
    public Builder _Boolean (boolean[] _Boolean) {
      if (_Boolean == null) __Boolean = null;
      else {
        __Boolean = java.util.Arrays.copyOf (_Boolean, _Boolean.length);
      }
      return this;
    }
    public Builder _Byte (byte[] _Byte) {
      if (_Byte == null) __Byte = null;
      else {
        __Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
      }
      return this;
    }
    public Builder _Double (double[] _Double) {
      if (_Double == null) __Double = null;
      else {
        __Double = java.util.Arrays.copyOf (_Double, _Double.length);
      }
      return this;
    }
    public Builder _Float (float[] _Float) {
      if (_Float == null) __Float = null;
      else {
        __Float = java.util.Arrays.copyOf (_Float, _Float.length);
      }
      return this;
    }
    public Builder _Indicator (boolean[] _Indicator) {
      if (_Indicator == null) __Indicator = null;
      else {
        __Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
      }
      return this;
    }
    public Builder _Int (int[] _Int) {
      if (_Int == null) __Int = null;
      else {
        __Int = java.util.Arrays.copyOf (_Int, _Int.length);
      }
      return this;
    }
    public Builder _Long (long[] _Long) {
      if (_Long == null) __Long = null;
      else {
        __Long = java.util.Arrays.copyOf (_Long, _Long.length);
      }
      return this;
    }
    public Builder _Short (short[] _Short) {
      if (_Short == null) __Short = null;
      else {
        __Short = java.util.Arrays.copyOf (_Short, _Short.length);
      }
      return this;
    }
    public Builder _String (String[] _String) {
      if (_String == null) __String = null;
      else {
        __String = java.util.Arrays.copyOf (_String, _String.length);
      }
      return this;
    }
    public Builder _SubMessage (org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage) {
      if (_SubMessage == null) __SubMessage = null;
      else {
        _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
        for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
          if (_SubMessage[fudge0] != null) {
          }
        }
        __SubMessage = _SubMessage;
      }
      return this;
    }
    public Builder _CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum) {
      if (_CustomEnum == null) __CustomEnum = null;
      else {
        __CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
      }
      return this;
    }
    public Builder _Message (org.fudgemsg.FudgeFieldContainer[] _Message) {
      if (_Message == null) __Message = null;
      else {
        __Message = java.util.Arrays.copyOf (_Message, _Message.length);
      }
      return this;
    }
    public Builder _Date (javax.time.calendar.DateProvider[] _Date) {
      if (_Date == null) __Date = null;
      else {
        __Date = java.util.Arrays.copyOf (_Date, _Date.length);
      }
      return this;
    }
    public Builder _DateTime (javax.time.calendar.DateTimeProvider[] _DateTime) {
      if (_DateTime == null) __DateTime = null;
      else {
        __DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
      }
      return this;
    }
    public Builder _Time (javax.time.calendar.TimeProvider[] _Time) {
      if (_Time == null) __Time = null;
      else {
        __Time = java.util.Arrays.copyOf (_Time, _Time.length);
      }
      return this;
    }
    public ATypes_Optional build () {
      return new ATypes_Optional (this);
    }
  }
  protected ATypes_Optional (final Builder builder) {
    if (builder.__Boolean == null) __Boolean = null;
    else {
      __Boolean = java.util.Arrays.copyOf (builder.__Boolean, builder.__Boolean.length);
    }
    if (builder.__Byte == null) __Byte = null;
    else {
      __Byte = java.util.Arrays.copyOf (builder.__Byte, builder.__Byte.length);
    }
    if (builder.__Double == null) __Double = null;
    else {
      __Double = java.util.Arrays.copyOf (builder.__Double, builder.__Double.length);
    }
    if (builder.__Float == null) __Float = null;
    else {
      __Float = java.util.Arrays.copyOf (builder.__Float, builder.__Float.length);
    }
    if (builder.__Indicator == null) __Indicator = null;
    else {
      __Indicator = java.util.Arrays.copyOf (builder.__Indicator, builder.__Indicator.length);
    }
    if (builder.__Int == null) __Int = null;
    else {
      __Int = java.util.Arrays.copyOf (builder.__Int, builder.__Int.length);
    }
    if (builder.__Long == null) __Long = null;
    else {
      __Long = java.util.Arrays.copyOf (builder.__Long, builder.__Long.length);
    }
    if (builder.__Short == null) __Short = null;
    else {
      __Short = java.util.Arrays.copyOf (builder.__Short, builder.__Short.length);
    }
    if (builder.__String == null) __String = null;
    else {
      __String = java.util.Arrays.copyOf (builder.__String, builder.__String.length);
    }
    if (builder.__SubMessage == null) __SubMessage = null;
    else {
      final org.fudgemsg.proto.tests.types.SubMessage[] fudge0 = java.util.Arrays.copyOf (builder.__SubMessage, builder.__SubMessage.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        if (fudge0[fudge1] != null) {
        }
      }
      __SubMessage = fudge0;
    }
    if (builder.__CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = java.util.Arrays.copyOf (builder.__CustomEnum, builder.__CustomEnum.length);
    }
    if (builder.__Message == null) __Message = null;
    else {
      __Message = java.util.Arrays.copyOf (builder.__Message, builder.__Message.length);
    }
    if (builder.__Date == null) __Date = null;
    else {
      __Date = java.util.Arrays.copyOf (builder.__Date, builder.__Date.length);
    }
    if (builder.__DateTime == null) __DateTime = null;
    else {
      __DateTime = java.util.Arrays.copyOf (builder.__DateTime, builder.__DateTime.length);
    }
    if (builder.__Time == null) __Time = null;
    else {
      __Time = java.util.Arrays.copyOf (builder.__Time, builder.__Time.length);
    }
  }
  public ATypes_Optional (boolean[] _Boolean, byte[] _Byte, double[] _Double, float[] _Float, boolean[] _Indicator, int[] _Int, long[] _Long, short[] _Short, String[] _String, org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum, org.fudgemsg.FudgeFieldContainer[] _Message, javax.time.calendar.DateProvider[] _Date, javax.time.calendar.DateTimeProvider[] _DateTime, javax.time.calendar.TimeProvider[] _Time) {
    if (_Boolean == null) __Boolean = null;
    else {
      __Boolean = java.util.Arrays.copyOf (_Boolean, _Boolean.length);
    }
    if (_Byte == null) __Byte = null;
    else {
      __Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
    }
    if (_Double == null) __Double = null;
    else {
      __Double = java.util.Arrays.copyOf (_Double, _Double.length);
    }
    if (_Float == null) __Float = null;
    else {
      __Float = java.util.Arrays.copyOf (_Float, _Float.length);
    }
    if (_Indicator == null) __Indicator = null;
    else {
      __Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
    }
    if (_Int == null) __Int = null;
    else {
      __Int = java.util.Arrays.copyOf (_Int, _Int.length);
    }
    if (_Long == null) __Long = null;
    else {
      __Long = java.util.Arrays.copyOf (_Long, _Long.length);
    }
    if (_Short == null) __Short = null;
    else {
      __Short = java.util.Arrays.copyOf (_Short, _Short.length);
    }
    if (_String == null) __String = null;
    else {
      __String = java.util.Arrays.copyOf (_String, _String.length);
    }
    if (_SubMessage == null) __SubMessage = null;
    else {
      _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
      for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
        if (_SubMessage[fudge0] != null) {
        }
      }
      __SubMessage = _SubMessage;
    }
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
    }
    if (_Message == null) __Message = null;
    else {
      __Message = java.util.Arrays.copyOf (_Message, _Message.length);
    }
    if (_Date == null) __Date = null;
    else {
      __Date = java.util.Arrays.copyOf (_Date, _Date.length);
    }
    if (_DateTime == null) __DateTime = null;
    else {
      __DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
    }
    if (_Time == null) __Time = null;
    else {
      __Time = java.util.Arrays.copyOf (_Time, _Time.length);
    }
  }
  protected ATypes_Optional (final ATypes_Optional source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Boolean == null) __Boolean = null;
    else {
      __Boolean = java.util.Arrays.copyOf (source.__Boolean, source.__Boolean.length);
    }
    if (source.__Byte == null) __Byte = null;
    else {
      __Byte = java.util.Arrays.copyOf (source.__Byte, source.__Byte.length);
    }
    if (source.__Double == null) __Double = null;
    else {
      __Double = java.util.Arrays.copyOf (source.__Double, source.__Double.length);
    }
    if (source.__Float == null) __Float = null;
    else {
      __Float = java.util.Arrays.copyOf (source.__Float, source.__Float.length);
    }
    if (source.__Indicator == null) __Indicator = null;
    else {
      __Indicator = java.util.Arrays.copyOf (source.__Indicator, source.__Indicator.length);
    }
    if (source.__Int == null) __Int = null;
    else {
      __Int = java.util.Arrays.copyOf (source.__Int, source.__Int.length);
    }
    if (source.__Long == null) __Long = null;
    else {
      __Long = java.util.Arrays.copyOf (source.__Long, source.__Long.length);
    }
    if (source.__Short == null) __Short = null;
    else {
      __Short = java.util.Arrays.copyOf (source.__Short, source.__Short.length);
    }
    if (source.__String == null) __String = null;
    else {
      __String = java.util.Arrays.copyOf (source.__String, source.__String.length);
    }
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      final org.fudgemsg.proto.tests.types.SubMessage[] fudge0 = java.util.Arrays.copyOf (source.__SubMessage, source.__SubMessage.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        if (fudge0[fudge1] != null) {
        }
      }
      __SubMessage = fudge0;
    }
    if (source.__CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = java.util.Arrays.copyOf (source.__CustomEnum, source.__CustomEnum.length);
    }
    if (source.__Message == null) __Message = null;
    else {
      __Message = java.util.Arrays.copyOf (source.__Message, source.__Message.length);
    }
    if (source.__Date == null) __Date = null;
    else {
      __Date = java.util.Arrays.copyOf (source.__Date, source.__Date.length);
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      __DateTime = java.util.Arrays.copyOf (source.__DateTime, source.__DateTime.length);
    }
    if (source.__Time == null) __Time = null;
    else {
      __Time = java.util.Arrays.copyOf (source.__Time, source.__Time.length);
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (__Boolean != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (boolean fudge2 : __Boolean) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_BOOLEAN_KEY, null, fudge1);
    }
    if (__Byte != null)  {
      msg.add (_BYTE_KEY, null, __Byte);
    }
    if (__Double != null)  {
      msg.add (_DOUBLE_KEY, null, __Double);
    }
    if (__Float != null)  {
      msg.add (_FLOAT_KEY, null, __Float);
    }
    if (__Indicator != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (boolean fudge2 : __Indicator) {
        if (fudge2) fudge1.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
      }
      msg.add (_INDICATOR_KEY, null, fudge1);
    }
    if (__Int != null)  {
      msg.add (_INT_KEY, null, __Int);
    }
    if (__Long != null)  {
      msg.add (_LONG_KEY, null, __Long);
    }
    if (__Short != null)  {
      msg.add (_SHORT_KEY, null, __Short);
    }
    if (__String != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (String fudge2 : __String) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_STRING_KEY, null, fudge1);
    }
    if (__SubMessage != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.proto.tests.types.SubMessage fudge2 : __SubMessage) {
        if (fudge2 != null)  {
          final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
          Class<?> fudge4 = fudge2.getClass ();
          while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge4)) {
            fudge3.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge4.getName ());
            fudge4 = fudge4.getSuperclass ();
          }
          fudge2.toFudgeMsg (fudgeContext, fudge3);
          fudge1.add (null, null, fudge3);
        }
        else {
          fudge1.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
        }
      }
      msg.add (_SUBMESSAGE_KEY, null, fudge1);
    }
    if (__CustomEnum != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.proto.tests.types.CustomEnum fudge2 : __CustomEnum) {
        fudge1.add (null, null, fudge2.name ());
      }
      msg.add (_CUSTOMENUM_KEY, null, fudge1);
    }
    if (__Message != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.FudgeFieldContainer fudge2 : __Message) {
        fudge1.add (null, null, fudgeContext.newMessage (fudge2));
      }
      msg.add (_MESSAGE_KEY, null, fudge1);
    }
    if (__Date != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.DateProvider fudge2 : __Date) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_DATE_KEY, null, fudge1);
    }
    if (__DateTime != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.DateTimeProvider fudge2 : __DateTime) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_DATETIME_KEY, null, fudge1);
    }
    if (__Time != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.TimeProvider fudge2 : __Time) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_TIME_KEY, null, fudge1);
    }
  }
  public static ATypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.ATypes_Optional".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.ATypes_Optional)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public boolean[] get_Boolean () {
    return __Boolean;
  }
  public byte[] get_Byte () {
    return __Byte;
  }
  public double[] get_Double () {
    return __Double;
  }
  public float[] get_Float () {
    return __Float;
  }
  public boolean[] get_Indicator () {
    return __Indicator;
  }
  public int[] get_Int () {
    return __Int;
  }
  public long[] get_Long () {
    return __Long;
  }
  public short[] get_Short () {
    return __Short;
  }
  public String[] get_String () {
    return __String;
  }
  public org.fudgemsg.proto.tests.types.SubMessage[] get_SubMessage () {
    return __SubMessage;
  }
  public org.fudgemsg.proto.tests.types.CustomEnum[] get_CustomEnum () {
    return __CustomEnum;
  }
  public org.fudgemsg.FudgeFieldContainer[] get_Message () {
    return __Message;
  }
  public javax.time.calendar.DateProvider[] get_Date () {
    return __Date;
  }
  public javax.time.calendar.DateTimeProvider[] get_DateTime () {
    return __DateTime;
  }
  public javax.time.calendar.TimeProvider[] get_Time () {
    return __Time;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof ATypes_Optional)) return false;
    ATypes_Optional msg = (ATypes_Optional)o;
    if (!java.util.Arrays.equals (__Boolean, msg.__Boolean)) return false;
    if (!java.util.Arrays.equals (__Byte, msg.__Byte)) return false;
    if (!java.util.Arrays.equals (__Double, msg.__Double)) return false;
    if (!java.util.Arrays.equals (__Float, msg.__Float)) return false;
    if (!java.util.Arrays.equals (__Indicator, msg.__Indicator)) return false;
    if (!java.util.Arrays.equals (__Int, msg.__Int)) return false;
    if (!java.util.Arrays.equals (__Long, msg.__Long)) return false;
    if (!java.util.Arrays.equals (__Short, msg.__Short)) return false;
    if (!java.util.Arrays.deepEquals (__String, msg.__String)) return false;
    if (!java.util.Arrays.deepEquals (__SubMessage, msg.__SubMessage)) return false;
    if (!java.util.Arrays.deepEquals (__CustomEnum, msg.__CustomEnum)) return false;
    if (!java.util.Arrays.deepEquals (__Message, msg.__Message)) return false;
    if (!java.util.Arrays.deepEquals (__Date, msg.__Date)) return false;
    if (!java.util.Arrays.deepEquals (__DateTime, msg.__DateTime)) return false;
    if (!java.util.Arrays.deepEquals (__Time, msg.__Time)) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (__Boolean != null)hc += java.util.Arrays.hashCode (__Boolean);
    hc *= 31;
    if (__Byte != null)hc += java.util.Arrays.hashCode (__Byte);
    hc *= 31;
    if (__Double != null)hc += java.util.Arrays.hashCode (__Double);
    hc *= 31;
    if (__Float != null)hc += java.util.Arrays.hashCode (__Float);
    hc *= 31;
    if (__Indicator != null)hc += java.util.Arrays.hashCode (__Indicator);
    hc *= 31;
    if (__Int != null)hc += java.util.Arrays.hashCode (__Int);
    hc *= 31;
    if (__Long != null)hc += java.util.Arrays.hashCode (__Long);
    hc *= 31;
    if (__Short != null)hc += java.util.Arrays.hashCode (__Short);
    hc *= 31;
    if (__String != null)hc += java.util.Arrays.deepHashCode (__String);
    hc *= 31;
    if (__SubMessage != null)hc += java.util.Arrays.deepHashCode (__SubMessage);
    hc *= 31;
    if (__CustomEnum != null)hc += java.util.Arrays.deepHashCode (__CustomEnum);
    hc *= 31;
    if (__Message != null)hc += java.util.Arrays.deepHashCode (__Message);
    hc *= 31;
    if (__Date != null)hc += java.util.Arrays.deepHashCode (__Date);
    hc *= 31;
    if (__DateTime != null)hc += java.util.Arrays.deepHashCode (__DateTime);
    hc *= 31;
    if (__Time != null)hc += java.util.Arrays.deepHashCode (__Time);
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
