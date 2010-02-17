// Automatically created - do not modify
// Created from types.proto:325(10)
package org.fudgemsg.proto.tests.types;
public class MutableATypes_Required implements java.io.Serializable, ATypesBase {
  private static final long serialVersionUID = 1837855735721260087l;
  private boolean[] __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private byte[] __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private double[] __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private float[] __Float;
  public static final String _FLOAT_KEY = "_Float";
  private boolean[] __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private int[] __Int;
  public static final String _INT_KEY = "_Int";
  private long[] __Long;
  public static final String _LONG_KEY = "_Long";
  private short[] __Short;
  public static final String _SHORT_KEY = "_Short";
  private String[] __String;
  public static final String _STRING_KEY = "_String";
  private org.fudgemsg.proto.tests.types.SubMessage[] __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private org.fudgemsg.proto.tests.types.CustomEnum[] __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private org.fudgemsg.FudgeFieldContainer[] __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private org.fudgemsg.types.FudgeDate[] __Date;
  public static final String _DATE_KEY = "_Date";
  private java.util.Date[] __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private org.fudgemsg.types.FudgeTime[] __Time;
  public static final String _TIME_KEY = "_Time";
  public MutableATypes_Required (boolean[] _Bool, byte[] _Byte, double[] _Double, float[] _Float, boolean[] _Indicator, int[] _Int, long[] _Long, short[] _Short, String[] _String, org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum, org.fudgemsg.FudgeFieldContainer[] _Message, org.fudgemsg.types.FudgeDate[] _Date, java.util.Date[] _DateTime, org.fudgemsg.types.FudgeTime[] _Time) {
    if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
    else {
      __Bool = java.util.Arrays.copyOf (_Bool, _Bool.length);
    }
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      __Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
    }
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      __Double = java.util.Arrays.copyOf (_Double, _Double.length);
    }
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      __Float = java.util.Arrays.copyOf (_Float, _Float.length);
    }
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      __Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
    }
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      __Int = java.util.Arrays.copyOf (_Int, _Int.length);
    }
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      __Long = java.util.Arrays.copyOf (_Long, _Long.length);
    }
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      __Short = java.util.Arrays.copyOf (_Short, _Short.length);
    }
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      __String = java.util.Arrays.copyOf (_String, _String.length);
    }
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
      for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
      }
      __SubMessage = _SubMessage;
    }
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      __CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
    }
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      __Message = java.util.Arrays.copyOf (_Message, _Message.length);
    }
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      __Date = java.util.Arrays.copyOf (_Date, _Date.length);
    }
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      __DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
    }
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      __Time = java.util.Arrays.copyOf (_Time, _Time.length);
    }
  }
  protected MutableATypes_Required (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (_BOOL_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Bool' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<Boolean> fudge2 = new java.util.ArrayList<Boolean> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (Boolean.class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Bool[]' is not boolean", e);
        }
      }
      final boolean[] fudge4 = new boolean[fudge2.size ()];
      int fudge5 = 0;
      for (boolean fudge6 : fudge2) {
        fudge4[fudge5++] = fudge6;
      }
      __Bool = fudge4;
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Bool' is not boolean[]", e);
    }
    fudgeField = fudgeMsg.getByName (_BYTE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Byte' is not present");
    try {
      __Byte = fudgeMsg.getFieldValue (byte[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Byte' is not byte[]", e);
    }
    fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Double' is not present");
    try {
      __Double = fudgeMsg.getFieldValue (double[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Double' is not double[]", e);
    }
    fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Float' is not present");
    try {
      __Float = fudgeMsg.getFieldValue (float[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Float' is not float[]", e);
    }
    fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Indicator' is not present");
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
      __Indicator = fudge4;
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Indicator' is not indicator[]", e);
    }
    fudgeField = fudgeMsg.getByName (_INT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Int' is not present");
    try {
      __Int = fudgeMsg.getFieldValue (int[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Int' is not integer[]", e);
    }
    fudgeField = fudgeMsg.getByName (_LONG_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Long' is not present");
    try {
      __Long = fudgeMsg.getFieldValue (long[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Long' is not long[]", e);
    }
    fudgeField = fudgeMsg.getByName (_SHORT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Short' is not present");
    try {
      __Short = fudgeMsg.getFieldValue (short[].class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Short' is not short[]", e);
    }
    fudgeField = fudgeMsg.getByName (_STRING_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_String' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<String> fudge2 = new java.util.ArrayList<String> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge3.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_String[]' is not string", e);
        }
      }
      __String = fudge2.toArray (new String[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_String' is not string[]", e);
    }
    fudgeField = fudgeMsg.getByName (_SUBMESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_SubMessage' is not present");
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
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_SubMessage[]' is not SubMessage message", e);
        }
      }
      __SubMessage = fudge2.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_SubMessage' is not SubMessage message[]", e);
    }
    fudgeField = fudgeMsg.getByName (_CUSTOMENUM_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_CustomEnum' is not present");
    try {
      final int[] fudge1 = fudgeMsg.getFieldValue (int[].class, fudgeField);
      __CustomEnum = new org.fudgemsg.proto.tests.types.CustomEnum[fudge1.length];
      for (int fudge2 = 0; fudge2 < fudge1.length; fudge2++) {
        __CustomEnum[fudge2] = org.fudgemsg.proto.tests.types.CustomEnum.fromFudgeEncoding (fudge1[fudge2]);
      }
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_CustomEnum' is not CustomEnum enum[]", e);
    }
    fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Message' is not present");
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
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Message[]' is not anonymous/unknown message", e);
        }
      }
      __Message = fudge2.toArray (new org.fudgemsg.FudgeFieldContainer[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Message' is not anonymous/unknown message[]", e);
    }
    fudgeField = fudgeMsg.getByName (_DATE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Date' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<org.fudgemsg.types.FudgeDate> fudge2 = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (org.fudgemsg.types.FudgeDate.class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Date[]' is not date", e);
        }
      }
      __Date = fudge2.toArray (new org.fudgemsg.types.FudgeDate[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Date' is not date[]", e);
    }
    fudgeField = fudgeMsg.getByName (_DATETIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_DateTime' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<java.util.Date> fudge2 = new java.util.ArrayList<java.util.Date> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (java.util.Date.class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_DateTime[]' is not datetime", e);
        }
      }
      __DateTime = fudge2.toArray (new java.util.Date[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_DateTime' is not datetime[]", e);
    }
    fudgeField = fudgeMsg.getByName (_TIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Time' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<org.fudgemsg.types.FudgeTime> fudge2 = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (org.fudgemsg.types.FudgeTime.class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Time[]' is not time", e);
        }
      }
      __Time = fudge2.toArray (new org.fudgemsg.types.FudgeTime[fudge2.size ()]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableATypes_Required - field '_Time' is not time[]", e);
    }
  }
  public MutableATypes_Required (final MutableATypes_Required source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Bool == null) __Bool = null;
    else {
      __Bool = java.util.Arrays.copyOf (source.__Bool, source.__Bool.length);
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
    if (__Bool != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (boolean fudge2 : __Bool) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_BOOL_KEY, null, fudge1);
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
        fudge1.add (null, null, fudge2.toFudgeMsg (fudgeContext));
      }
      msg.add (_SUBMESSAGE_KEY, null, fudge1);
    }
    if (__CustomEnum != null)  {
      final int[] fudge1 = new int[__CustomEnum.length];
      for (int fudge2 = 0; fudge2 < fudge1.length; fudge2++) {
        fudge1[fudge2] = __CustomEnum[fudge2].getFudgeEncoding ();
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
      for (org.fudgemsg.types.FudgeDate fudge2 : __Date) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_DATE_KEY, null, fudge1);
    }
    if (__DateTime != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (java.util.Date fudge2 : __DateTime) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_DATETIME_KEY, null, fudge1);
    }
    if (__Time != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.types.FudgeTime fudge2 : __Time) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_TIME_KEY, null, fudge1);
    }
  }
  public static MutableATypes_Required fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new MutableATypes_Required (fudgeMsg);
  }
  public boolean[] get_Bool () {
    return __Bool;
  }
  public void set_Bool (boolean[] _Bool) {
    if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
    else {
      __Bool = java.util.Arrays.copyOf (_Bool, _Bool.length);
    }
  }
  public byte[] get_Byte () {
    return __Byte;
  }
  public void set_Byte (byte[] _Byte) {
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      __Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
    }
  }
  public double[] get_Double () {
    return __Double;
  }
  public void set_Double (double[] _Double) {
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      __Double = java.util.Arrays.copyOf (_Double, _Double.length);
    }
  }
  public float[] get_Float () {
    return __Float;
  }
  public void set_Float (float[] _Float) {
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      __Float = java.util.Arrays.copyOf (_Float, _Float.length);
    }
  }
  public boolean[] get_Indicator () {
    return __Indicator;
  }
  public void set_Indicator (boolean[] _Indicator) {
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      __Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
    }
  }
  public int[] get_Int () {
    return __Int;
  }
  public void set_Int (int[] _Int) {
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      __Int = java.util.Arrays.copyOf (_Int, _Int.length);
    }
  }
  public long[] get_Long () {
    return __Long;
  }
  public void set_Long (long[] _Long) {
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      __Long = java.util.Arrays.copyOf (_Long, _Long.length);
    }
  }
  public short[] get_Short () {
    return __Short;
  }
  public void set_Short (short[] _Short) {
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      __Short = java.util.Arrays.copyOf (_Short, _Short.length);
    }
  }
  public String[] get_String () {
    return __String;
  }
  public void set_String (String[] _String) {
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      __String = java.util.Arrays.copyOf (_String, _String.length);
    }
  }
  public org.fudgemsg.proto.tests.types.SubMessage[] get_SubMessage () {
    return __SubMessage;
  }
  public void set_SubMessage (org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage) {
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
      for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
      }
      __SubMessage = _SubMessage;
    }
  }
  public org.fudgemsg.proto.tests.types.CustomEnum[] get_CustomEnum () {
    return __CustomEnum;
  }
  public void set_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum) {
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      __CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
    }
  }
  public org.fudgemsg.FudgeFieldContainer[] get_Message () {
    return __Message;
  }
  public void set_Message (org.fudgemsg.FudgeFieldContainer[] _Message) {
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      __Message = java.util.Arrays.copyOf (_Message, _Message.length);
    }
  }
  public org.fudgemsg.types.FudgeDate[] get_Date () {
    return __Date;
  }
  public void set_Date (org.fudgemsg.types.FudgeDate[] _Date) {
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      __Date = java.util.Arrays.copyOf (_Date, _Date.length);
    }
  }
  public java.util.Date[] get_DateTime () {
    return __DateTime;
  }
  public void set_DateTime (java.util.Date[] _DateTime) {
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      __DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
    }
  }
  public org.fudgemsg.types.FudgeTime[] get_Time () {
    return __Time;
  }
  public void set_Time (org.fudgemsg.types.FudgeTime[] _Time) {
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      __Time = java.util.Arrays.copyOf (_Time, _Time.length);
    }
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof MutableATypes_Required)) return false;
    MutableATypes_Required msg = (MutableATypes_Required)o;
    if (!java.util.Arrays.equals (__Bool, msg.__Bool)) return false;
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
    if (__Bool != null)hc += java.util.Arrays.hashCode (__Bool);
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
