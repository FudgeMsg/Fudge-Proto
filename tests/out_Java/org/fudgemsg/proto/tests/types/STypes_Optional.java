// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:17(10)
package org.fudgemsg.proto.tests.types;
public class STypes_Optional implements java.io.Serializable, TypesBase_Optional {
  private static final long serialVersionUID = 4340358908083072877l;
  private final Boolean __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private final Byte __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final Double __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final Float __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final Boolean __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final Integer __Int;
  public static final String _INT_KEY = "_Int";
  private final Long __Long;
  public static final String _LONG_KEY = "_Long";
  private final Short __Short;
  public static final String _SHORT_KEY = "_Short";
  private final String __String;
  public static final String _STRING_KEY = "_String";
  private final org.fudgemsg.proto.tests.types.SubMessage __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private final org.fudgemsg.proto.tests.types.CustomEnum __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private final org.fudgemsg.FudgeFieldContainer __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final javax.time.calendar.DateProvider __Date;
  public static final String _DATE_KEY = "_Date";
  private final javax.time.calendar.DateTimeProvider __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private final javax.time.calendar.TimeProvider __Time;
  public static final String _TIME_KEY = "_Time";
  public static class Builder {
    private Boolean __Bool;
    private Byte __Byte;
    private Double __Double;
    private Float __Float;
    private Boolean __Indicator;
    private Integer __Int;
    private Long __Long;
    private Short __Short;
    private String __String;
    private org.fudgemsg.proto.tests.types.SubMessage __SubMessage;
    private org.fudgemsg.proto.tests.types.CustomEnum __CustomEnum;
    private org.fudgemsg.FudgeFieldContainer __Message;
    private javax.time.calendar.DateProvider __Date;
    private javax.time.calendar.DateTimeProvider __DateTime;
    private javax.time.calendar.TimeProvider __Time;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (_BOOL_KEY);
      if (fudgeField != null)  {
        try {
          _Bool (fudgeMsg.getFieldValue (Boolean.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Bool' is not boolean", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_BYTE_KEY);
      if (fudgeField != null)  {
        try {
          _Byte (fudgeMsg.getFieldValue (Byte.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Byte' is not byte", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          _Double (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Double' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
      if (fudgeField != null)  {
        try {
          _Float (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Float' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
      if (fudgeField != null)  {
        _Indicator (fudgeField.getValue () != null);
      }
      fudgeField = fudgeMsg.getByName (_INT_KEY);
      if (fudgeField != null)  {
        try {
          _Int (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Int' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_LONG_KEY);
      if (fudgeField != null)  {
        try {
          _Long (fudgeMsg.getFieldValue (Long.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Long' is not long", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_SHORT_KEY);
      if (fudgeField != null)  {
        try {
          _Short (fudgeMsg.getFieldValue (Short.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Short' is not short", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_STRING_KEY);
      if (fudgeField != null)  {
        try {
          _String (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_String' is not string", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_SUBMESSAGE_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.types.SubMessage fudge1;
          fudge1 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
          _SubMessage (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_SubMessage' is not SubMessage message", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_CUSTOMENUM_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.types.CustomEnum fudge1;
          fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudgeField);
          _CustomEnum (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_CustomEnum' is not CustomEnum enum", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1;
          fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          _Message (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Message' is not anonymous/unknown message", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DATE_KEY);
      if (fudgeField != null)  {
        try {
          _Date (fudgeMsg.getFieldValue (javax.time.calendar.DateProvider.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Date' is not date", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_DATETIME_KEY);
      if (fudgeField != null)  {
        try {
          _DateTime (fudgeMsg.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_DateTime' is not datetime", e);
        }
      }
      fudgeField = fudgeMsg.getByName (_TIME_KEY);
      if (fudgeField != null)  {
        try {
          _Time (fudgeMsg.getFieldValue (javax.time.calendar.TimeProvider.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a STypes_Optional - field '_Time' is not time", e);
        }
      }
    }
    public Builder _Bool (Boolean _Bool) {
      __Bool = _Bool;
      return this;
    }
    public Builder _Byte (Byte _Byte) {
      __Byte = _Byte;
      return this;
    }
    public Builder _Double (Double _Double) {
      __Double = _Double;
      return this;
    }
    public Builder _Float (Float _Float) {
      __Float = _Float;
      return this;
    }
    public Builder _Indicator (Boolean _Indicator) {
      __Indicator = _Indicator;
      return this;
    }
    public Builder _Int (Integer _Int) {
      __Int = _Int;
      return this;
    }
    public Builder _Long (Long _Long) {
      __Long = _Long;
      return this;
    }
    public Builder _Short (Short _Short) {
      __Short = _Short;
      return this;
    }
    public Builder _String (String _String) {
      __String = _String;
      return this;
    }
    public Builder _SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
      if (_SubMessage == null) __SubMessage = null;
      else {
        __SubMessage = _SubMessage;
      }
      return this;
    }
    public Builder _CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
      __CustomEnum = _CustomEnum;
      return this;
    }
    public Builder _Message (org.fudgemsg.FudgeFieldContainer _Message) {
      __Message = _Message;
      return this;
    }
    public Builder _Date (javax.time.calendar.DateProvider _Date) {
      __Date = _Date;
      return this;
    }
    public Builder _DateTime (javax.time.calendar.DateTimeProvider _DateTime) {
      __DateTime = _DateTime;
      return this;
    }
    public Builder _Time (javax.time.calendar.TimeProvider _Time) {
      __Time = _Time;
      return this;
    }
    public STypes_Optional build () {
      return new STypes_Optional (this);
    }
  }
  protected STypes_Optional (final Builder builder) {
    __Bool = builder.__Bool;
    __Byte = builder.__Byte;
    __Double = builder.__Double;
    __Float = builder.__Float;
    __Indicator = builder.__Indicator;
    __Int = builder.__Int;
    __Long = builder.__Long;
    __Short = builder.__Short;
    __String = builder.__String;
    if (builder.__SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = builder.__SubMessage;
    }
    __CustomEnum = builder.__CustomEnum;
    __Message = builder.__Message;
    __Date = builder.__Date;
    __DateTime = builder.__DateTime;
    __Time = builder.__Time;
  }
  public STypes_Optional (Boolean _Bool, Byte _Byte, Double _Double, Float _Float, Boolean _Indicator, Integer _Int, Long _Long, Short _Short, String _String, org.fudgemsg.proto.tests.types.SubMessage _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum, org.fudgemsg.FudgeFieldContainer _Message, javax.time.calendar.DateProvider _Date, javax.time.calendar.DateTimeProvider _DateTime, javax.time.calendar.TimeProvider _Time) {
    __Bool = _Bool;
    __Byte = _Byte;
    __Double = _Double;
    __Float = _Float;
    __Indicator = _Indicator;
    __Int = _Int;
    __Long = _Long;
    __Short = _Short;
    __String = _String;
    if (_SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = _SubMessage;
    }
    __CustomEnum = _CustomEnum;
    __Message = _Message;
    __Date = _Date;
    __DateTime = _DateTime;
    __Time = _Time;
  }
  protected STypes_Optional (final STypes_Optional source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    __Bool = source.__Bool;
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
    if (__Bool != null)  {
      msg.add (_BOOL_KEY, null, __Bool);
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
      if (__Indicator) msg.add (_INDICATOR_KEY, null, org.fudgemsg.types.IndicatorType.INSTANCE);
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
      msg.add (_SUBMESSAGE_KEY, null, fudge1);
    }
    if (__CustomEnum != null)  {
      msg.add (_CUSTOMENUM_KEY, null, __CustomEnum.name ());
    }
    if (__Message != null)  {
      msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (__Message));
    }
    if (__Date != null)  {
      msg.add (_DATE_KEY, null, __Date);
    }
    if (__DateTime != null)  {
      msg.add (_DATETIME_KEY, null, __DateTime);
    }
    if (__Time != null)  {
      msg.add (_TIME_KEY, null, __Time);
    }
  }
  public static STypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.STypes_Optional".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.STypes_Optional)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public Boolean get_Bool () {
    return __Bool;
  }
  public Byte get_Byte () {
    return __Byte;
  }
  public Double get_Double () {
    return __Double;
  }
  public Float get_Float () {
    return __Float;
  }
  public Boolean get_Indicator () {
    return __Indicator;
  }
  public Integer get_Int () {
    return __Int;
  }
  public Long get_Long () {
    return __Long;
  }
  public Short get_Short () {
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
    if (!(o instanceof STypes_Optional)) return false;
    STypes_Optional msg = (STypes_Optional)o;
    if (__Bool != null) {
      if (msg.__Bool != null) {
        if (!__Bool.equals (msg.__Bool)) return false;
      }
      else return false;
    }
    else if (msg.__Bool != null) return false;
    if (__Byte != null) {
      if (msg.__Byte != null) {
        if (!__Byte.equals (msg.__Byte)) return false;
      }
      else return false;
    }
    else if (msg.__Byte != null) return false;
    if (__Double != null) {
      if (msg.__Double != null) {
        if (!__Double.equals (msg.__Double)) return false;
      }
      else return false;
    }
    else if (msg.__Double != null) return false;
    if (__Float != null) {
      if (msg.__Float != null) {
        if (!__Float.equals (msg.__Float)) return false;
      }
      else return false;
    }
    else if (msg.__Float != null) return false;
    if (__Indicator != null) {
      if (msg.__Indicator != null) {
        if (!__Indicator.equals (msg.__Indicator)) return false;
      }
      else return false;
    }
    else if (msg.__Indicator != null) return false;
    if (__Int != null) {
      if (msg.__Int != null) {
        if (!__Int.equals (msg.__Int)) return false;
      }
      else return false;
    }
    else if (msg.__Int != null) return false;
    if (__Long != null) {
      if (msg.__Long != null) {
        if (!__Long.equals (msg.__Long)) return false;
      }
      else return false;
    }
    else if (msg.__Long != null) return false;
    if (__Short != null) {
      if (msg.__Short != null) {
        if (!__Short.equals (msg.__Short)) return false;
      }
      else return false;
    }
    else if (msg.__Short != null) return false;
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
    if (__Bool != null) hc += __Bool.hashCode ();
    hc *= 31;
    if (__Byte != null) hc += __Byte.hashCode ();
    hc *= 31;
    if (__Double != null) hc += __Double.hashCode ();
    hc *= 31;
    if (__Float != null) hc += __Float.hashCode ();
    hc *= 31;
    if (__Indicator != null) hc += __Indicator.hashCode ();
    hc *= 31;
    if (__Int != null) hc += __Int.hashCode ();
    hc *= 31;
    if (__Long != null) hc += __Long.hashCode ();
    hc *= 31;
    if (__Short != null) hc += __Short.hashCode ();
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
