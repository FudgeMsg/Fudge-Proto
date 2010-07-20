// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:112(10)
package org.fudgemsg.proto.tests.types;
public class STypes_Required implements java.io.Serializable, TypesBase_Required {
  private static final long serialVersionUID = -8800485479603340994l;
  private final boolean __Boolean;
  public static final String _BOOLEAN_KEY = "_Boolean";
  private final byte __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final double __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final float __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final boolean __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final int __Int;
  public static final String _INT_KEY = "_Int";
  private final long __Long;
  public static final String _LONG_KEY = "_Long";
  private final short __Short;
  public static final String _SHORT_KEY = "_Short";
  private final String __String;
  public static final String _STRING_KEY = "_String";
  private final org.fudgemsg.proto.tests.types.SubMessage __SubMessage;
  public static final String _SUB_MESSAGE_KEY = "_SubMessage";
  private final org.fudgemsg.proto.tests.types.CustomEnum __CustomEnum;
  public static final String _CUSTOM_ENUM_KEY = "_CustomEnum";
  private final org.fudgemsg.FudgeFieldContainer __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final javax.time.calendar.DateProvider __Date;
  public static final String _DATE_KEY = "_Date";
  private final javax.time.calendar.DateTimeProvider __DateTime;
  public static final String _DATE_TIME_KEY = "_DateTime";
  private final javax.time.calendar.TimeProvider __Time;
  public static final String _TIME_KEY = "_Time";
  public STypes_Required (boolean _Boolean, byte _Byte, double _Double, float _Float, boolean _Indicator, int _Int, long _Long, short _Short, String _String, org.fudgemsg.proto.tests.types.SubMessage _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum, org.fudgemsg.FudgeFieldContainer _Message, javax.time.calendar.DateProvider _Date, javax.time.calendar.DateTimeProvider _DateTime, javax.time.calendar.TimeProvider _Time) {
    __Boolean = _Boolean;
    __Byte = _Byte;
    __Double = _Double;
    __Float = _Float;
    __Indicator = _Indicator;
    __Int = _Int;
    __Long = _Long;
    __Short = _Short;
    if (_String == null) throw new NullPointerException ("_String' cannot be null");
    __String = _String;
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      __SubMessage = _SubMessage;
    }
    if (_CustomEnum == null) throw new NullPointerException ("_CustomEnum' cannot be null");
    __CustomEnum = _CustomEnum;
    if (_Message == null) throw new NullPointerException ("_Message' cannot be null");
    __Message = _Message;
    if (_Date == null) throw new NullPointerException ("_Date' cannot be null");
    __Date = _Date;
    if (_DateTime == null) throw new NullPointerException ("_DateTime' cannot be null");
    __DateTime = _DateTime;
    if (_Time == null) throw new NullPointerException ("_Time' cannot be null");
    __Time = _Time;
  }
  protected STypes_Required (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (_BOOLEAN_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Boolean' is not present");
    try {
      __Boolean = fudgeMsg.getFieldValue (Boolean.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Boolean' is not boolean", e);
    }
    fudgeField = fudgeMsg.getByName (_BYTE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Byte' is not present");
    try {
      __Byte = fudgeMsg.getFieldValue (Byte.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Byte' is not byte", e);
    }
    fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Double' is not present");
    try {
      __Double = fudgeMsg.getFieldValue (Double.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Double' is not double", e);
    }
    fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Float' is not present");
    try {
      __Float = fudgeMsg.getFieldValue (Float.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Float' is not float", e);
    }
    fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Indicator' is not present");
    __Indicator = fudgeField.getValue () != null;
    fudgeField = fudgeMsg.getByName (_INT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Int' is not present");
    try {
      __Int = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Int' is not integer", e);
    }
    fudgeField = fudgeMsg.getByName (_LONG_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Long' is not present");
    try {
      __Long = fudgeMsg.getFieldValue (Long.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Long' is not long", e);
    }
    fudgeField = fudgeMsg.getByName (_SHORT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Short' is not present");
    try {
      __Short = fudgeMsg.getFieldValue (Short.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Short' is not short", e);
    }
    fudgeField = fudgeMsg.getByName (_STRING_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_String' is not present");
    try {
      __String = fudgeField.getValue ().toString ();
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_String' is not string", e);
    }
    fudgeField = fudgeMsg.getByName (_SUB_MESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_SubMessage' is not present");
    try {
      __SubMessage = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_SubMessage' is not SubMessage message", e);
    }
    fudgeField = fudgeMsg.getByName (_CUSTOM_ENUM_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_CustomEnum' is not present");
    try {
      __CustomEnum = fudgeMsg.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_CustomEnum' is not CustomEnum enum", e);
    }
    fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Message' is not present");
    try {
      __Message = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Message' is not anonymous/unknown message", e);
    }
    fudgeField = fudgeMsg.getByName (_DATE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Date' is not present");
    try {
      __Date = fudgeMsg.getFieldValue (javax.time.calendar.DateProvider.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Date' is not date", e);
    }
    fudgeField = fudgeMsg.getByName (_DATE_TIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_DateTime' is not present");
    try {
      __DateTime = fudgeMsg.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_DateTime' is not datetime", e);
    }
    fudgeField = fudgeMsg.getByName (_TIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Time' is not present");
    try {
      __Time = fudgeMsg.getFieldValue (javax.time.calendar.TimeProvider.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a STypes_Required - field '_Time' is not time", e);
    }
  }
  protected STypes_Required (final STypes_Required source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    __Boolean = source.__Boolean;
    __Byte = source.__Byte;
    __Double = source.__Double;
    __Float = source.__Float;
    __Indicator = source.__Indicator;
    __Int = source.__Int;
    __Long = source.__Long;
    __Short = source.__Short;
    __String = source.__String;
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = source.__SubMessage;
    }
    __CustomEnum = source.__CustomEnum;
    __Message = source.__Message;
    __Date = source.__Date;
    __DateTime = source.__DateTime;
    __Time = source.__Time;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (_BOOLEAN_KEY, null, __Boolean);
    msg.add (_BYTE_KEY, null, __Byte);
    msg.add (_DOUBLE_KEY, null, __Double);
    msg.add (_FLOAT_KEY, null, __Float);
    if (__Indicator) msg.add (_INDICATOR_KEY, null, org.fudgemsg.types.IndicatorType.INSTANCE);
    msg.add (_INT_KEY, null, __Int);
    msg.add (_LONG_KEY, null, __Long);
    msg.add (_SHORT_KEY, null, __Short);
    if (__String != null)  {
      msg.add (_STRING_KEY, null, __String);
    }
    if (__SubMessage != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      Class<?> fudge2 = __SubMessage.getClass ();
      while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge2)) {
        fudge1.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge2.getName ());
        fudge2 = fudge2.getSuperclass ();
      }
      __SubMessage.toFudgeMsg (fudgeContext, fudge1);
      msg.add (_SUB_MESSAGE_KEY, null, fudge1);
    }
    if (__CustomEnum != null)  {
      msg.add (_CUSTOM_ENUM_KEY, null, __CustomEnum.name ());
    }
    if (__Message != null)  {
      msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (__Message));
    }
    if (__Date != null)  {
      msg.add (_DATE_KEY, null, __Date);
    }
    if (__DateTime != null)  {
      msg.add (_DATE_TIME_KEY, null, __DateTime);
    }
    if (__Time != null)  {
      msg.add (_TIME_KEY, null, __Time);
    }
  }
  public static STypes_Required fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.STypes_Required".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.STypes_Required)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new STypes_Required (fudgeMsg);
  }
  public boolean get_Boolean () {
    return __Boolean;
  }
  public byte get_Byte () {
    return __Byte;
  }
  public double get_Double () {
    return __Double;
  }
  public float get_Float () {
    return __Float;
  }
  public boolean get_Indicator () {
    return __Indicator;
  }
  public int get_Int () {
    return __Int;
  }
  public long get_Long () {
    return __Long;
  }
  public short get_Short () {
    return __Short;
  }
  public String get_String () {
    return __String;
  }
  public org.fudgemsg.proto.tests.types.SubMessage get_SubMessage () {
    return __SubMessage;
  }
  public org.fudgemsg.proto.tests.types.CustomEnum get_CustomEnum () {
    return __CustomEnum;
  }
  public org.fudgemsg.FudgeFieldContainer get_Message () {
    return __Message;
  }
  public javax.time.calendar.DateProvider get_Date () {
    return __Date;
  }
  public javax.time.calendar.DateTimeProvider get_DateTime () {
    return __DateTime;
  }
  public javax.time.calendar.TimeProvider get_Time () {
    return __Time;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof STypes_Required)) return false;
    STypes_Required msg = (STypes_Required)o;
    if (__Boolean != msg.__Boolean) return false;
    if (__Byte != msg.__Byte) return false;
    if (__Double != msg.__Double) return false;
    if (__Float != msg.__Float) return false;
    if (__Indicator != msg.__Indicator) return false;
    if (__Int != msg.__Int) return false;
    if (__Long != msg.__Long) return false;
    if (__Short != msg.__Short) return false;
    if (__String != null) {
      if (msg.__String != null) {
        if (!__String.equals (msg.__String)) return false;
      }
      else return false;
    }
    else if (msg.__String != null) return false;
    if (__SubMessage != null) {
      if (msg.__SubMessage != null) {
        if (!__SubMessage.equals (msg.__SubMessage)) return false;
      }
      else return false;
    }
    else if (msg.__SubMessage != null) return false;
    if (__CustomEnum != null) {
      if (msg.__CustomEnum != null) {
        if (!__CustomEnum.equals (msg.__CustomEnum)) return false;
      }
      else return false;
    }
    else if (msg.__CustomEnum != null) return false;
    if (__Message != null) {
      if (msg.__Message != null) {
        if (!__Message.equals (msg.__Message)) return false;
      }
      else return false;
    }
    else if (msg.__Message != null) return false;
    if (__Date != null) {
      if (msg.__Date != null) {
        if (!__Date.equals (msg.__Date)) return false;
      }
      else return false;
    }
    else if (msg.__Date != null) return false;
    if (__DateTime != null) {
      if (msg.__DateTime != null) {
        if (!__DateTime.equals (msg.__DateTime)) return false;
      }
      else return false;
    }
    else if (msg.__DateTime != null) return false;
    if (__Time != null) {
      if (msg.__Time != null) {
        if (!__Time.equals (msg.__Time)) return false;
      }
      else return false;
    }
    else if (msg.__Time != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (__Boolean) hc++;
    hc = (hc * 31) + (int)__Byte;
    hc = (hc * 31) + (int)__Double;
    hc = (hc * 31) + (int)__Float;
    hc *= 31;
    if (__Indicator) hc++;
    hc = (hc * 31) + (int)__Int;
    hc = (hc * 31) + (int)__Long;
    hc = (hc * 31) + (int)__Short;
    hc *= 31;
    if (__String != null) hc += __String.hashCode ();
    hc *= 31;
    if (__SubMessage != null) hc += __SubMessage.hashCode ();
    hc *= 31;
    if (__CustomEnum != null) hc += __CustomEnum.hashCode ();
    hc *= 31;
    if (__Message != null) hc += __Message.hashCode ();
    hc *= 31;
    if (__Date != null) hc += __Date.hashCode ();
    hc *= 31;
    if (__DateTime != null) hc += __DateTime.hashCode ();
    hc *= 31;
    if (__Time != null) hc += __Time.hashCode ();
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
