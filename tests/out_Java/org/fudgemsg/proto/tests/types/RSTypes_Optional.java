// Automatically created - do not modify
// Created from types.proto:59(10)
package org.fudgemsg.proto.tests.types;
public class RSTypes_Optional implements java.io.Serializable, RSTypesBase {
  private static final long serialVersionUID = 6483206744971745384l;
  private final java.util.List<Boolean> __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private final java.util.List<Byte> __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final java.util.List<Double> __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final java.util.List<Float> __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final java.util.List<Boolean> __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final java.util.List<Integer> __Int;
  public static final String _INT_KEY = "_Int";
  private final java.util.List<Long> __Long;
  public static final String _LONG_KEY = "_Long";
  private final java.util.List<Short> __Short;
  public static final String _SHORT_KEY = "_Short";
  private final java.util.List<String> __String;
  public static final String _STRING_KEY = "_String";
  private final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private final java.util.List<org.fudgemsg.FudgeFieldContainer> __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final java.util.List<org.fudgemsg.types.FudgeDate> __Date;
  public static final String _DATE_KEY = "_Date";
  private final java.util.List<java.util.Date> __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private final java.util.List<org.fudgemsg.types.FudgeTime> __Time;
  public static final String _TIME_KEY = "_Time";
  public static class Builder {
    private java.util.List<Boolean> __Bool;
    private java.util.List<Byte> __Byte;
    private java.util.List<Double> __Double;
    private java.util.List<Float> __Float;
    private java.util.List<Boolean> __Indicator;
    private java.util.List<Integer> __Int;
    private java.util.List<Long> __Long;
    private java.util.List<Short> __Short;
    private java.util.List<String> __String;
    private java.util.List<org.fudgemsg.proto.tests.types.SubMessage> __SubMessage;
    private java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> __CustomEnum;
    private java.util.List<org.fudgemsg.FudgeFieldContainer> __Message;
    private java.util.List<org.fudgemsg.types.FudgeDate> __Date;
    private java.util.List<java.util.Date> __DateTime;
    private java.util.List<org.fudgemsg.types.FudgeTime> __Time;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeFields = fudgeMsg.getAllByName (_BOOL_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Boolean> fudge1;
        fudge1 = new java.util.ArrayList<Boolean> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Boolean.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Bool' is not boolean", e);
          }
        }
        _Bool (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_BYTE_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Byte> fudge1;
        fudge1 = new java.util.ArrayList<Byte> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Byte.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Byte' is not byte", e);
          }
        }
        _Byte (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_DOUBLE_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Double> fudge1;
        fudge1 = new java.util.ArrayList<Double> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Double.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Double' is not double", e);
          }
        }
        _Double (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_FLOAT_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Float> fudge1;
        fudge1 = new java.util.ArrayList<Float> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Float.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Float' is not float", e);
          }
        }
        _Float (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_INDICATOR_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Boolean> fudge1;
        fudge1 = new java.util.ArrayList<Boolean> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          fudge1.add (fudge2.getValue () != null);
        }
        _Indicator (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_INT_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Integer> fudge1;
        fudge1 = new java.util.ArrayList<Integer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Integer.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Int' is not integer", e);
          }
        }
        _Int (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_LONG_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Long> fudge1;
        fudge1 = new java.util.ArrayList<Long> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Long.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Long' is not long", e);
          }
        }
        _Long (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_SHORT_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Short> fudge1;
        fudge1 = new java.util.ArrayList<Short> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Short.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Short' is not short", e);
          }
        }
        _Short (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_STRING_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<String> fudge1;
        fudge1 = new java.util.ArrayList<String> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudge2.getValue ().toString ());
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_String' is not string", e);
          }
        }
        _String (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_SUBMESSAGE_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge1;
        fudge1 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            final org.fudgemsg.proto.tests.types.SubMessage fudge3;
            fudge3 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2));
            fudge1.add (fudge3);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_SubMessage' is not SubMessage message", e);
          }
        }
        _SubMessage (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_CUSTOMENUM_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge1;
        fudge1 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            final org.fudgemsg.proto.tests.types.CustomEnum fudge3;
            fudge3 = org.fudgemsg.proto.tests.types.CustomEnum.fromFudgeEncoding (fudgeMsg.getFieldValue (Integer.class, fudge2));
            fudge1.add (fudge3);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_CustomEnum' is not CustomEnum enum", e);
          }
        }
        _CustomEnum (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_MESSAGE_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge1;
        fudge1 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            final org.fudgemsg.FudgeFieldContainer fudge3;
            fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
            fudge1.add (fudge3);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Message' is not anonymous/unknown message", e);
          }
        }
        _Message (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_DATE_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<org.fudgemsg.types.FudgeDate> fudge1;
        fudge1 = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (org.fudgemsg.types.FudgeDate.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Date' is not date", e);
          }
        }
        _Date (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_DATETIME_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<java.util.Date> fudge1;
        fudge1 = new java.util.ArrayList<java.util.Date> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (java.util.Date.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_DateTime' is not datetime", e);
          }
        }
        _DateTime (fudge1);
      }
      fudgeFields = fudgeMsg.getAllByName (_TIME_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<org.fudgemsg.types.FudgeTime> fudge1;
        fudge1 = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (org.fudgemsg.types.FudgeTime.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RSTypes_Optional - field '_Time' is not time", e);
          }
        }
        _Time (fudge1);
      }
    }
    public Builder _Bool (Boolean _Bool) {
      if (_Bool == null) __Bool = null;
      else {
        __Bool = new java.util.ArrayList<Boolean> (1);
        add_Bool (_Bool);
      }
      return this;
    }
    public Builder _Bool (java.util.Collection<? extends Boolean> _Bool) {
      if (_Bool == null) __Bool = null;
      else {
        final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Bool);
        for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Boolean fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Bool' cannot be null");
        }
        __Bool = fudge0;
      }
      return this;
    }
    public Builder add_Bool (Boolean _Bool) {
      if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
      if (__Bool == null) __Bool = new java.util.ArrayList<Boolean> ();
      __Bool.add (_Bool);
      return this;
    }
    public Builder _Byte (Byte _Byte) {
      if (_Byte == null) __Byte = null;
      else {
        __Byte = new java.util.ArrayList<Byte> (1);
        add_Byte (_Byte);
      }
      return this;
    }
    public Builder _Byte (java.util.Collection<? extends Byte> _Byte) {
      if (_Byte == null) __Byte = null;
      else {
        final java.util.List<Byte> fudge0 = new java.util.ArrayList<Byte> (_Byte);
        for (java.util.ListIterator<Byte> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Byte fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
        }
        __Byte = fudge0;
      }
      return this;
    }
    public Builder add_Byte (Byte _Byte) {
      if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
      if (__Byte == null) __Byte = new java.util.ArrayList<Byte> ();
      __Byte.add (_Byte);
      return this;
    }
    public Builder _Double (Double _Double) {
      if (_Double == null) __Double = null;
      else {
        __Double = new java.util.ArrayList<Double> (1);
        add_Double (_Double);
      }
      return this;
    }
    public Builder _Double (java.util.Collection<? extends Double> _Double) {
      if (_Double == null) __Double = null;
      else {
        final java.util.List<Double> fudge0 = new java.util.ArrayList<Double> (_Double);
        for (java.util.ListIterator<Double> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Double fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
        }
        __Double = fudge0;
      }
      return this;
    }
    public Builder add_Double (Double _Double) {
      if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
      if (__Double == null) __Double = new java.util.ArrayList<Double> ();
      __Double.add (_Double);
      return this;
    }
    public Builder _Float (Float _Float) {
      if (_Float == null) __Float = null;
      else {
        __Float = new java.util.ArrayList<Float> (1);
        add_Float (_Float);
      }
      return this;
    }
    public Builder _Float (java.util.Collection<? extends Float> _Float) {
      if (_Float == null) __Float = null;
      else {
        final java.util.List<Float> fudge0 = new java.util.ArrayList<Float> (_Float);
        for (java.util.ListIterator<Float> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Float fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
        }
        __Float = fudge0;
      }
      return this;
    }
    public Builder add_Float (Float _Float) {
      if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
      if (__Float == null) __Float = new java.util.ArrayList<Float> ();
      __Float.add (_Float);
      return this;
    }
    public Builder _Indicator (Boolean _Indicator) {
      if (_Indicator == null) __Indicator = null;
      else {
        __Indicator = new java.util.ArrayList<Boolean> (1);
        add_Indicator (_Indicator);
      }
      return this;
    }
    public Builder _Indicator (java.util.Collection<? extends Boolean> _Indicator) {
      if (_Indicator == null) __Indicator = null;
      else {
        final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Indicator);
        for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Boolean fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
        }
        __Indicator = fudge0;
      }
      return this;
    }
    public Builder add_Indicator (Boolean _Indicator) {
      if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
      if (__Indicator == null) __Indicator = new java.util.ArrayList<Boolean> ();
      __Indicator.add (_Indicator);
      return this;
    }
    public Builder _Int (Integer _Int) {
      if (_Int == null) __Int = null;
      else {
        __Int = new java.util.ArrayList<Integer> (1);
        add_Int (_Int);
      }
      return this;
    }
    public Builder _Int (java.util.Collection<? extends Integer> _Int) {
      if (_Int == null) __Int = null;
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (_Int);
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
        }
        __Int = fudge0;
      }
      return this;
    }
    public Builder add_Int (Integer _Int) {
      if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
      if (__Int == null) __Int = new java.util.ArrayList<Integer> ();
      __Int.add (_Int);
      return this;
    }
    public Builder _Long (Long _Long) {
      if (_Long == null) __Long = null;
      else {
        __Long = new java.util.ArrayList<Long> (1);
        add_Long (_Long);
      }
      return this;
    }
    public Builder _Long (java.util.Collection<? extends Long> _Long) {
      if (_Long == null) __Long = null;
      else {
        final java.util.List<Long> fudge0 = new java.util.ArrayList<Long> (_Long);
        for (java.util.ListIterator<Long> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Long fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
        }
        __Long = fudge0;
      }
      return this;
    }
    public Builder add_Long (Long _Long) {
      if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
      if (__Long == null) __Long = new java.util.ArrayList<Long> ();
      __Long.add (_Long);
      return this;
    }
    public Builder _Short (Short _Short) {
      if (_Short == null) __Short = null;
      else {
        __Short = new java.util.ArrayList<Short> (1);
        add_Short (_Short);
      }
      return this;
    }
    public Builder _Short (java.util.Collection<? extends Short> _Short) {
      if (_Short == null) __Short = null;
      else {
        final java.util.List<Short> fudge0 = new java.util.ArrayList<Short> (_Short);
        for (java.util.ListIterator<Short> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Short fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
        }
        __Short = fudge0;
      }
      return this;
    }
    public Builder add_Short (Short _Short) {
      if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
      if (__Short == null) __Short = new java.util.ArrayList<Short> ();
      __Short.add (_Short);
      return this;
    }
    public Builder _String (String _String) {
      if (_String == null) __String = null;
      else {
        __String = new java.util.ArrayList<String> (1);
        add_String (_String);
      }
      return this;
    }
    public Builder _String (java.util.Collection<? extends String> _String) {
      if (_String == null) __String = null;
      else {
        final java.util.List<String> fudge0 = new java.util.ArrayList<String> (_String);
        for (java.util.ListIterator<String> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          String fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
        }
        __String = fudge0;
      }
      return this;
    }
    public Builder add_String (String _String) {
      if (_String == null) throw new NullPointerException ("'_String' cannot be null");
      if (__String == null) __String = new java.util.ArrayList<String> ();
      __String.add (_String);
      return this;
    }
    public Builder _SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
      if (_SubMessage == null) __SubMessage = null;
      else {
        __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (1);
        add_SubMessage (_SubMessage);
      }
      return this;
    }
    public Builder _SubMessage (java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage> _SubMessage) {
      if (_SubMessage == null) __SubMessage = null;
      else {
        final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (_SubMessage);
        for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_SubMessage' cannot be null");
          fudge1.set (fudge2);
        }
        __SubMessage = fudge0;
      }
      return this;
    }
    public Builder add_SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
      if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
      if (__SubMessage == null) __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
      __SubMessage.add (_SubMessage);
      return this;
    }
    public Builder _CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
      if (_CustomEnum == null) __CustomEnum = null;
      else {
        __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (1);
        add_CustomEnum (_CustomEnum);
      }
      return this;
    }
    public Builder _CustomEnum (java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum> _CustomEnum) {
      if (_CustomEnum == null) __CustomEnum = null;
      else {
        final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (_CustomEnum);
        for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          org.fudgemsg.proto.tests.types.CustomEnum fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
        }
        __CustomEnum = fudge0;
      }
      return this;
    }
    public Builder add_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
      if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
      if (__CustomEnum == null) __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
      __CustomEnum.add (_CustomEnum);
      return this;
    }
    public Builder _Message (org.fudgemsg.FudgeFieldContainer _Message) {
      if (_Message == null) __Message = null;
      else {
        __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (1);
        add_Message (_Message);
      }
      return this;
    }
    public Builder _Message (java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer> _Message) {
      if (_Message == null) __Message = null;
      else {
        final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (_Message);
        for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          org.fudgemsg.FudgeFieldContainer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
        }
        __Message = fudge0;
      }
      return this;
    }
    public Builder add_Message (org.fudgemsg.FudgeFieldContainer _Message) {
      if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
      if (__Message == null) __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
      __Message.add (_Message);
      return this;
    }
    public Builder _Date (org.fudgemsg.types.FudgeDate _Date) {
      if (_Date == null) __Date = null;
      else {
        __Date = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (1);
        add_Date (_Date);
      }
      return this;
    }
    public Builder _Date (java.util.Collection<? extends org.fudgemsg.types.FudgeDate> _Date) {
      if (_Date == null) __Date = null;
      else {
        final java.util.List<org.fudgemsg.types.FudgeDate> fudge0 = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (_Date);
        for (java.util.ListIterator<org.fudgemsg.types.FudgeDate> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          org.fudgemsg.types.FudgeDate fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
        }
        __Date = fudge0;
      }
      return this;
    }
    public Builder add_Date (org.fudgemsg.types.FudgeDate _Date) {
      if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
      if (__Date == null) __Date = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> ();
      __Date.add (_Date);
      return this;
    }
    public Builder _DateTime (java.util.Date _DateTime) {
      if (_DateTime == null) __DateTime = null;
      else {
        __DateTime = new java.util.ArrayList<java.util.Date> (1);
        add_DateTime (_DateTime);
      }
      return this;
    }
    public Builder _DateTime (java.util.Collection<? extends java.util.Date> _DateTime) {
      if (_DateTime == null) __DateTime = null;
      else {
        final java.util.List<java.util.Date> fudge0 = new java.util.ArrayList<java.util.Date> (_DateTime);
        for (java.util.ListIterator<java.util.Date> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          java.util.Date fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
        }
        __DateTime = fudge0;
      }
      return this;
    }
    public Builder add_DateTime (java.util.Date _DateTime) {
      if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
      if (__DateTime == null) __DateTime = new java.util.ArrayList<java.util.Date> ();
      __DateTime.add (_DateTime);
      return this;
    }
    public Builder _Time (org.fudgemsg.types.FudgeTime _Time) {
      if (_Time == null) __Time = null;
      else {
        __Time = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (1);
        add_Time (_Time);
      }
      return this;
    }
    public Builder _Time (java.util.Collection<? extends org.fudgemsg.types.FudgeTime> _Time) {
      if (_Time == null) __Time = null;
      else {
        final java.util.List<org.fudgemsg.types.FudgeTime> fudge0 = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (_Time);
        for (java.util.ListIterator<org.fudgemsg.types.FudgeTime> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          org.fudgemsg.types.FudgeTime fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
        }
        __Time = fudge0;
      }
      return this;
    }
    public Builder add_Time (org.fudgemsg.types.FudgeTime _Time) {
      if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
      if (__Time == null) __Time = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> ();
      __Time.add (_Time);
      return this;
    }
    public RSTypes_Optional build () {
      return new RSTypes_Optional (this);
    }
  }
  protected RSTypes_Optional (final Builder builder) {
    if (builder.__Bool == null) __Bool = null;
    else {
      __Bool = new java.util.ArrayList<Boolean> (builder.__Bool);
    }
    if (builder.__Byte == null) __Byte = null;
    else {
      __Byte = new java.util.ArrayList<Byte> (builder.__Byte);
    }
    if (builder.__Double == null) __Double = null;
    else {
      __Double = new java.util.ArrayList<Double> (builder.__Double);
    }
    if (builder.__Float == null) __Float = null;
    else {
      __Float = new java.util.ArrayList<Float> (builder.__Float);
    }
    if (builder.__Indicator == null) __Indicator = null;
    else {
      __Indicator = new java.util.ArrayList<Boolean> (builder.__Indicator);
    }
    if (builder.__Int == null) __Int = null;
    else {
      __Int = new java.util.ArrayList<Integer> (builder.__Int);
    }
    if (builder.__Long == null) __Long = null;
    else {
      __Long = new java.util.ArrayList<Long> (builder.__Long);
    }
    if (builder.__Short == null) __Short = null;
    else {
      __Short = new java.util.ArrayList<Short> (builder.__Short);
    }
    if (builder.__String == null) __String = null;
    else {
      __String = new java.util.ArrayList<String> (builder.__String);
    }
    if (builder.__SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (builder.__SubMessage);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (builder.__CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (builder.__CustomEnum);
    }
    if (builder.__Message == null) __Message = null;
    else {
      __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (builder.__Message);
    }
    if (builder.__Date == null) __Date = null;
    else {
      __Date = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (builder.__Date);
    }
    if (builder.__DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<java.util.Date> (builder.__DateTime);
    }
    if (builder.__Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (builder.__Time);
    }
  }
  public RSTypes_Optional (java.util.Collection<? extends Boolean> _Bool, java.util.Collection<? extends Byte> _Byte, java.util.Collection<? extends Double> _Double, java.util.Collection<? extends Float> _Float, java.util.Collection<? extends Boolean> _Indicator, java.util.Collection<? extends Integer> _Int, java.util.Collection<? extends Long> _Long, java.util.Collection<? extends Short> _Short, java.util.Collection<? extends String> _String, java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage> _SubMessage, java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum> _CustomEnum, java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer> _Message, java.util.Collection<? extends org.fudgemsg.types.FudgeDate> _Date, java.util.Collection<? extends java.util.Date> _DateTime, java.util.Collection<? extends org.fudgemsg.types.FudgeTime> _Time) {
    if (_Bool == null) __Bool = null;
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Bool);
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Bool' cannot be null");
      }
      __Bool = fudge0;
    }
    if (_Byte == null) __Byte = null;
    else {
      final java.util.List<Byte> fudge0 = new java.util.ArrayList<Byte> (_Byte);
      for (java.util.ListIterator<Byte> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Byte fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
      }
      __Byte = fudge0;
    }
    if (_Double == null) __Double = null;
    else {
      final java.util.List<Double> fudge0 = new java.util.ArrayList<Double> (_Double);
      for (java.util.ListIterator<Double> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Double fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
      }
      __Double = fudge0;
    }
    if (_Float == null) __Float = null;
    else {
      final java.util.List<Float> fudge0 = new java.util.ArrayList<Float> (_Float);
      for (java.util.ListIterator<Float> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Float fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
      }
      __Float = fudge0;
    }
    if (_Indicator == null) __Indicator = null;
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Indicator);
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
      }
      __Indicator = fudge0;
    }
    if (_Int == null) __Int = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (_Int);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
      }
      __Int = fudge0;
    }
    if (_Long == null) __Long = null;
    else {
      final java.util.List<Long> fudge0 = new java.util.ArrayList<Long> (_Long);
      for (java.util.ListIterator<Long> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Long fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
      }
      __Long = fudge0;
    }
    if (_Short == null) __Short = null;
    else {
      final java.util.List<Short> fudge0 = new java.util.ArrayList<Short> (_Short);
      for (java.util.ListIterator<Short> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Short fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
      }
      __Short = fudge0;
    }
    if (_String == null) __String = null;
    else {
      final java.util.List<String> fudge0 = new java.util.ArrayList<String> (_String);
      for (java.util.ListIterator<String> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
      }
      __String = fudge0;
    }
    if (_SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (_SubMessage);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_SubMessage' cannot be null");
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (_CustomEnum);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
      }
      __CustomEnum = fudge0;
    }
    if (_Message == null) __Message = null;
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (_Message);
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
      }
      __Message = fudge0;
    }
    if (_Date == null) __Date = null;
    else {
      final java.util.List<org.fudgemsg.types.FudgeDate> fudge0 = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (_Date);
      for (java.util.ListIterator<org.fudgemsg.types.FudgeDate> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.types.FudgeDate fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
      }
      __Date = fudge0;
    }
    if (_DateTime == null) __DateTime = null;
    else {
      final java.util.List<java.util.Date> fudge0 = new java.util.ArrayList<java.util.Date> (_DateTime);
      for (java.util.ListIterator<java.util.Date> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        java.util.Date fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
      }
      __DateTime = fudge0;
    }
    if (_Time == null) __Time = null;
    else {
      final java.util.List<org.fudgemsg.types.FudgeTime> fudge0 = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (_Time);
      for (java.util.ListIterator<org.fudgemsg.types.FudgeTime> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.types.FudgeTime fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
      }
      __Time = fudge0;
    }
  }
  protected RSTypes_Optional (final RSTypes_Optional source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Bool == null) __Bool = null;
    else {
      __Bool = new java.util.ArrayList<Boolean> (source.__Bool);
    }
    if (source.__Byte == null) __Byte = null;
    else {
      __Byte = new java.util.ArrayList<Byte> (source.__Byte);
    }
    if (source.__Double == null) __Double = null;
    else {
      __Double = new java.util.ArrayList<Double> (source.__Double);
    }
    if (source.__Float == null) __Float = null;
    else {
      __Float = new java.util.ArrayList<Float> (source.__Float);
    }
    if (source.__Indicator == null) __Indicator = null;
    else {
      __Indicator = new java.util.ArrayList<Boolean> (source.__Indicator);
    }
    if (source.__Int == null) __Int = null;
    else {
      __Int = new java.util.ArrayList<Integer> (source.__Int);
    }
    if (source.__Long == null) __Long = null;
    else {
      __Long = new java.util.ArrayList<Long> (source.__Long);
    }
    if (source.__Short == null) __Short = null;
    else {
      __Short = new java.util.ArrayList<Short> (source.__Short);
    }
    if (source.__String == null) __String = null;
    else {
      __String = new java.util.ArrayList<String> (source.__String);
    }
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (source.__SubMessage);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage fudge2 = fudge1.next ();
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (source.__CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (source.__CustomEnum);
    }
    if (source.__Message == null) __Message = null;
    else {
      __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (source.__Message);
    }
    if (source.__Date == null) __Date = null;
    else {
      __Date = new java.util.ArrayList<org.fudgemsg.types.FudgeDate> (source.__Date);
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<java.util.Date> (source.__DateTime);
    }
    if (source.__Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<org.fudgemsg.types.FudgeTime> (source.__Time);
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
      for (Boolean fudge1 : __Bool) {
        msg.add (_BOOL_KEY, null, fudge1);
      }
    }
    if (__Byte != null)  {
      for (Byte fudge1 : __Byte) {
        msg.add (_BYTE_KEY, null, fudge1);
      }
    }
    if (__Double != null)  {
      for (Double fudge1 : __Double) {
        msg.add (_DOUBLE_KEY, null, fudge1);
      }
    }
    if (__Float != null)  {
      for (Float fudge1 : __Float) {
        msg.add (_FLOAT_KEY, null, fudge1);
      }
    }
    if (__Indicator != null)  {
      for (Boolean fudge1 : __Indicator) {
        if (fudge1) msg.add (_INDICATOR_KEY, null, org.fudgemsg.types.IndicatorType.INSTANCE);
      }
    }
    if (__Int != null)  {
      for (Integer fudge1 : __Int) {
        msg.add (_INT_KEY, null, fudge1);
      }
    }
    if (__Long != null)  {
      for (Long fudge1 : __Long) {
        msg.add (_LONG_KEY, null, fudge1);
      }
    }
    if (__Short != null)  {
      for (Short fudge1 : __Short) {
        msg.add (_SHORT_KEY, null, fudge1);
      }
    }
    if (__String != null)  {
      for (String fudge1 : __String) {
        msg.add (_STRING_KEY, null, fudge1);
      }
    }
    if (__SubMessage != null)  {
      for (org.fudgemsg.proto.tests.types.SubMessage fudge1 : __SubMessage) {
        msg.add (_SUBMESSAGE_KEY, null, fudge1.toFudgeMsg (fudgeContext));
      }
    }
    if (__CustomEnum != null)  {
      for (org.fudgemsg.proto.tests.types.CustomEnum fudge1 : __CustomEnum) {
        msg.add (_CUSTOMENUM_KEY, null, fudge1.getFudgeEncoding ());
      }
    }
    if (__Message != null)  {
      for (org.fudgemsg.FudgeFieldContainer fudge1 : __Message) {
        msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (fudge1));
      }
    }
    if (__Date != null)  {
      for (org.fudgemsg.types.FudgeDate fudge1 : __Date) {
        msg.add (_DATE_KEY, null, fudge1);
      }
    }
    if (__DateTime != null)  {
      for (java.util.Date fudge1 : __DateTime) {
        msg.add (_DATETIME_KEY, null, fudge1);
      }
    }
    if (__Time != null)  {
      for (org.fudgemsg.types.FudgeTime fudge1 : __Time) {
        msg.add (_TIME_KEY, null, fudge1);
      }
    }
  }
  public static RSTypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public Boolean get_Bool () {
    return get_Bool (0);
  }
  public int get_BoolCount () {
    return (__Bool != null) ? __Bool.size () : 0;
  }
  public Boolean get_Bool (final int n) {
    if (__Bool == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Bool.get (n);
  }
  public java.util.List<Boolean> get_BoolList () {
    return java.util.Collections.unmodifiableList (__Bool);
  }
  public Byte get_Byte () {
    return get_Byte (0);
  }
  public int get_ByteCount () {
    return (__Byte != null) ? __Byte.size () : 0;
  }
  public Byte get_Byte (final int n) {
    if (__Byte == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Byte.get (n);
  }
  public java.util.List<Byte> get_ByteList () {
    return java.util.Collections.unmodifiableList (__Byte);
  }
  public Double get_Double () {
    return get_Double (0);
  }
  public int get_DoubleCount () {
    return (__Double != null) ? __Double.size () : 0;
  }
  public Double get_Double (final int n) {
    if (__Double == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Double.get (n);
  }
  public java.util.List<Double> get_DoubleList () {
    return java.util.Collections.unmodifiableList (__Double);
  }
  public Float get_Float () {
    return get_Float (0);
  }
  public int get_FloatCount () {
    return (__Float != null) ? __Float.size () : 0;
  }
  public Float get_Float (final int n) {
    if (__Float == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Float.get (n);
  }
  public java.util.List<Float> get_FloatList () {
    return java.util.Collections.unmodifiableList (__Float);
  }
  public Boolean get_Indicator () {
    return get_Indicator (0);
  }
  public int get_IndicatorCount () {
    return (__Indicator != null) ? __Indicator.size () : 0;
  }
  public Boolean get_Indicator (final int n) {
    if (__Indicator == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Indicator.get (n);
  }
  public java.util.List<Boolean> get_IndicatorList () {
    return java.util.Collections.unmodifiableList (__Indicator);
  }
  public Integer get_Int () {
    return get_Int (0);
  }
  public int get_IntCount () {
    return (__Int != null) ? __Int.size () : 0;
  }
  public Integer get_Int (final int n) {
    if (__Int == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Int.get (n);
  }
  public java.util.List<Integer> get_IntList () {
    return java.util.Collections.unmodifiableList (__Int);
  }
  public Long get_Long () {
    return get_Long (0);
  }
  public int get_LongCount () {
    return (__Long != null) ? __Long.size () : 0;
  }
  public Long get_Long (final int n) {
    if (__Long == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Long.get (n);
  }
  public java.util.List<Long> get_LongList () {
    return java.util.Collections.unmodifiableList (__Long);
  }
  public Short get_Short () {
    return get_Short (0);
  }
  public int get_ShortCount () {
    return (__Short != null) ? __Short.size () : 0;
  }
  public Short get_Short (final int n) {
    if (__Short == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Short.get (n);
  }
  public java.util.List<Short> get_ShortList () {
    return java.util.Collections.unmodifiableList (__Short);
  }
  public String get_String () {
    return get_String (0);
  }
  public int get_StringCount () {
    return (__String != null) ? __String.size () : 0;
  }
  public String get_String (final int n) {
    if (__String == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __String.get (n);
  }
  public java.util.List<String> get_StringList () {
    return java.util.Collections.unmodifiableList (__String);
  }
  public org.fudgemsg.proto.tests.types.SubMessage get_SubMessage () {
    return get_SubMessage (0);
  }
  public int get_SubMessageCount () {
    return (__SubMessage != null) ? __SubMessage.size () : 0;
  }
  public org.fudgemsg.proto.tests.types.SubMessage get_SubMessage (final int n) {
    if (__SubMessage == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __SubMessage.get (n);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.SubMessage> get_SubMessageList () {
    return java.util.Collections.unmodifiableList (__SubMessage);
  }
  public org.fudgemsg.proto.tests.types.CustomEnum get_CustomEnum () {
    return get_CustomEnum (0);
  }
  public int get_CustomEnumCount () {
    return (__CustomEnum != null) ? __CustomEnum.size () : 0;
  }
  public org.fudgemsg.proto.tests.types.CustomEnum get_CustomEnum (final int n) {
    if (__CustomEnum == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __CustomEnum.get (n);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> get_CustomEnumList () {
    return java.util.Collections.unmodifiableList (__CustomEnum);
  }
  public org.fudgemsg.FudgeFieldContainer get_Message () {
    return get_Message (0);
  }
  public int get_MessageCount () {
    return (__Message != null) ? __Message.size () : 0;
  }
  public org.fudgemsg.FudgeFieldContainer get_Message (final int n) {
    if (__Message == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Message.get (n);
  }
  public java.util.List<org.fudgemsg.FudgeFieldContainer> get_MessageList () {
    return java.util.Collections.unmodifiableList (__Message);
  }
  public org.fudgemsg.types.FudgeDate get_Date () {
    return get_Date (0);
  }
  public int get_DateCount () {
    return (__Date != null) ? __Date.size () : 0;
  }
  public org.fudgemsg.types.FudgeDate get_Date (final int n) {
    if (__Date == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Date.get (n);
  }
  public java.util.List<org.fudgemsg.types.FudgeDate> get_DateList () {
    return java.util.Collections.unmodifiableList (__Date);
  }
  public java.util.Date get_DateTime () {
    return get_DateTime (0);
  }
  public int get_DateTimeCount () {
    return (__DateTime != null) ? __DateTime.size () : 0;
  }
  public java.util.Date get_DateTime (final int n) {
    if (__DateTime == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __DateTime.get (n);
  }
  public java.util.List<java.util.Date> get_DateTimeList () {
    return java.util.Collections.unmodifiableList (__DateTime);
  }
  public org.fudgemsg.types.FudgeTime get_Time () {
    return get_Time (0);
  }
  public int get_TimeCount () {
    return (__Time != null) ? __Time.size () : 0;
  }
  public org.fudgemsg.types.FudgeTime get_Time (final int n) {
    if (__Time == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return __Time.get (n);
  }
  public java.util.List<org.fudgemsg.types.FudgeTime> get_TimeList () {
    return java.util.Collections.unmodifiableList (__Time);
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof RSTypes_Optional)) return false;
    RSTypes_Optional msg = (RSTypes_Optional)o;
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
