// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:245(10)
package org.fudgemsg.proto.tests.types;
public class MutableRSTypes_Optional implements java.io.Serializable, RSTypesBase {
  private static final long serialVersionUID = 6481051323154551075l;
  private java.util.List<Boolean> __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private java.util.List<Byte> __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private java.util.List<Double> __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private java.util.List<Float> __Float;
  public static final String _FLOAT_KEY = "_Float";
  private java.util.List<Boolean> __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private java.util.List<Integer> __Int;
  public static final String _INT_KEY = "_Int";
  private java.util.List<Long> __Long;
  public static final String _LONG_KEY = "_Long";
  private java.util.List<Short> __Short;
  public static final String _SHORT_KEY = "_Short";
  private java.util.List<String> __String;
  public static final String _STRING_KEY = "_String";
  private java.util.List<org.fudgemsg.proto.tests.types.SubMessage> __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private java.util.List<org.fudgemsg.FudgeFieldContainer> __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private java.util.List<javax.time.calendar.DateProvider> __Date;
  public static final String _DATE_KEY = "_Date";
  private java.util.List<javax.time.calendar.DateTimeProvider> __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private java.util.List<javax.time.calendar.TimeProvider> __Time;
  public static final String _TIME_KEY = "_Time";
  public MutableRSTypes_Optional () {
  }
  protected MutableRSTypes_Optional (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Bool' is not boolean", e);
        }
      }
      set_Bool (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Byte' is not byte", e);
        }
      }
      set_Byte (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Double' is not double", e);
        }
      }
      set_Double (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Float' is not float", e);
        }
      }
      set_Float (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_INDICATOR_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<Boolean> fudge1;
      fudge1 = new java.util.ArrayList<Boolean> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        fudge1.add (fudge2.getValue () != null);
      }
      set_Indicator (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Int' is not integer", e);
        }
      }
      set_Int (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Long' is not long", e);
        }
      }
      set_Long (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Short' is not short", e);
        }
      }
      set_Short (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_String' is not string", e);
        }
      }
      set_String (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_SubMessage' is not SubMessage message", e);
        }
      }
      set_SubMessage (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_CUSTOMENUM_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge1;
      fudge1 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.proto.tests.types.CustomEnum fudge3;
          fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge2);
          fudge1.add (fudge3);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_CustomEnum' is not CustomEnum enum", e);
        }
      }
      set_CustomEnum (fudge1);
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
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Message' is not anonymous/unknown message", e);
        }
      }
      set_Message (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_DATE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.DateProvider> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.DateProvider> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (javax.time.calendar.DateProvider.class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Date' is not date", e);
        }
      }
      set_Date (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_DATETIME_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.DateTimeProvider> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_DateTime' is not datetime", e);
        }
      }
      set_DateTime (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_TIME_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.TimeProvider> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.TimeProvider> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (javax.time.calendar.TimeProvider.class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRSTypes_Optional - field '_Time' is not time", e);
        }
      }
      set_Time (fudge1);
    }
  }
  public MutableRSTypes_Optional (java.util.Collection<? extends Boolean> _Bool, java.util.Collection<? extends Byte> _Byte, java.util.Collection<? extends Double> _Double, java.util.Collection<? extends Float> _Float, java.util.Collection<? extends Boolean> _Indicator, java.util.Collection<? extends Integer> _Int, java.util.Collection<? extends Long> _Long, java.util.Collection<? extends Short> _Short, java.util.Collection<? extends String> _String, java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage> _SubMessage, java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum> _CustomEnum, java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer> _Message, java.util.Collection<? extends javax.time.calendar.DateProvider> _Date, java.util.Collection<? extends javax.time.calendar.DateTimeProvider> _DateTime, java.util.Collection<? extends javax.time.calendar.TimeProvider> _Time) {
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
      final java.util.List<javax.time.calendar.DateProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider> (_Date);
      for (java.util.ListIterator<javax.time.calendar.DateProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
      }
      __Date = fudge0;
    }
    if (_DateTime == null) __DateTime = null;
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (_DateTime);
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
      }
      __DateTime = fudge0;
    }
    if (_Time == null) __Time = null;
    else {
      final java.util.List<javax.time.calendar.TimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider> (_Time);
      for (java.util.ListIterator<javax.time.calendar.TimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
      }
      __Time = fudge0;
    }
  }
  protected MutableRSTypes_Optional (final MutableRSTypes_Optional source) {
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
      __Date = new java.util.ArrayList<javax.time.calendar.DateProvider> (source.__Date);
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (source.__DateTime);
    }
    if (source.__Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider> (source.__Time);
    }
  }
  public MutableRSTypes_Optional clone () {
    return new MutableRSTypes_Optional (this);
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
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        Class<?> fudge3 = fudge1.getClass ();
        while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge3)) {
          fudge2.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge3.getName ());
          fudge3 = fudge3.getSuperclass ();
        }
        fudge1.toFudgeMsg (fudgeContext, fudge2);
        msg.add (_SUBMESSAGE_KEY, null, fudge2);
      }
    }
    if (__CustomEnum != null)  {
      for (org.fudgemsg.proto.tests.types.CustomEnum fudge1 : __CustomEnum) {
        msg.add (_CUSTOMENUM_KEY, null, fudge1.name ());
      }
    }
    if (__Message != null)  {
      for (org.fudgemsg.FudgeFieldContainer fudge1 : __Message) {
        msg.add (_MESSAGE_KEY, null, fudgeContext.newMessage (fudge1));
      }
    }
    if (__Date != null)  {
      for (javax.time.calendar.DateProvider fudge1 : __Date) {
        msg.add (_DATE_KEY, null, fudge1);
      }
    }
    if (__DateTime != null)  {
      for (javax.time.calendar.DateTimeProvider fudge1 : __DateTime) {
        msg.add (_DATETIME_KEY, null, fudge1);
      }
    }
    if (__Time != null)  {
      for (javax.time.calendar.TimeProvider fudge1 : __Time) {
        msg.add (_TIME_KEY, null, fudge1);
      }
    }
  }
  public static MutableRSTypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.MutableRSTypes_Optional".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.MutableRSTypes_Optional)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new MutableRSTypes_Optional (fudgeMsg);
  }
  public java.util.List<Boolean> get_Bool () {
    return java.util.Collections.unmodifiableList (__Bool);
  }
  public void set_Bool (Boolean _Bool) {
    if (_Bool == null) __Bool = null;
    else {
      __Bool = new java.util.ArrayList<Boolean> (1);
      add_Bool (_Bool);
    }
  }
  public void set_Bool (java.util.Collection<? extends Boolean> _Bool) {
    if (_Bool == null) __Bool = null;
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Bool);
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Bool' cannot be null");
      }
      __Bool = fudge0;
    }
  }
  public void add_Bool (Boolean _Bool) {
    if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
    if (__Bool == null) __Bool = new java.util.ArrayList<Boolean> ();
    __Bool.add (_Bool);
  }
  public java.util.List<Byte> get_Byte () {
    return java.util.Collections.unmodifiableList (__Byte);
  }
  public void set_Byte (Byte _Byte) {
    if (_Byte == null) __Byte = null;
    else {
      __Byte = new java.util.ArrayList<Byte> (1);
      add_Byte (_Byte);
    }
  }
  public void set_Byte (java.util.Collection<? extends Byte> _Byte) {
    if (_Byte == null) __Byte = null;
    else {
      final java.util.List<Byte> fudge0 = new java.util.ArrayList<Byte> (_Byte);
      for (java.util.ListIterator<Byte> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Byte fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
      }
      __Byte = fudge0;
    }
  }
  public void add_Byte (Byte _Byte) {
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    if (__Byte == null) __Byte = new java.util.ArrayList<Byte> ();
    __Byte.add (_Byte);
  }
  public java.util.List<Double> get_Double () {
    return java.util.Collections.unmodifiableList (__Double);
  }
  public void set_Double (Double _Double) {
    if (_Double == null) __Double = null;
    else {
      __Double = new java.util.ArrayList<Double> (1);
      add_Double (_Double);
    }
  }
  public void set_Double (java.util.Collection<? extends Double> _Double) {
    if (_Double == null) __Double = null;
    else {
      final java.util.List<Double> fudge0 = new java.util.ArrayList<Double> (_Double);
      for (java.util.ListIterator<Double> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Double fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
      }
      __Double = fudge0;
    }
  }
  public void add_Double (Double _Double) {
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    if (__Double == null) __Double = new java.util.ArrayList<Double> ();
    __Double.add (_Double);
  }
  public java.util.List<Float> get_Float () {
    return java.util.Collections.unmodifiableList (__Float);
  }
  public void set_Float (Float _Float) {
    if (_Float == null) __Float = null;
    else {
      __Float = new java.util.ArrayList<Float> (1);
      add_Float (_Float);
    }
  }
  public void set_Float (java.util.Collection<? extends Float> _Float) {
    if (_Float == null) __Float = null;
    else {
      final java.util.List<Float> fudge0 = new java.util.ArrayList<Float> (_Float);
      for (java.util.ListIterator<Float> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Float fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
      }
      __Float = fudge0;
    }
  }
  public void add_Float (Float _Float) {
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    if (__Float == null) __Float = new java.util.ArrayList<Float> ();
    __Float.add (_Float);
  }
  public java.util.List<Boolean> get_Indicator () {
    return java.util.Collections.unmodifiableList (__Indicator);
  }
  public void set_Indicator (Boolean _Indicator) {
    if (_Indicator == null) __Indicator = null;
    else {
      __Indicator = new java.util.ArrayList<Boolean> (1);
      add_Indicator (_Indicator);
    }
  }
  public void set_Indicator (java.util.Collection<? extends Boolean> _Indicator) {
    if (_Indicator == null) __Indicator = null;
    else {
      final java.util.List<Boolean> fudge0 = new java.util.ArrayList<Boolean> (_Indicator);
      for (java.util.ListIterator<Boolean> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Boolean fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
      }
      __Indicator = fudge0;
    }
  }
  public void add_Indicator (Boolean _Indicator) {
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    if (__Indicator == null) __Indicator = new java.util.ArrayList<Boolean> ();
    __Indicator.add (_Indicator);
  }
  public java.util.List<Integer> get_Int () {
    return java.util.Collections.unmodifiableList (__Int);
  }
  public void set_Int (Integer _Int) {
    if (_Int == null) __Int = null;
    else {
      __Int = new java.util.ArrayList<Integer> (1);
      add_Int (_Int);
    }
  }
  public void set_Int (java.util.Collection<? extends Integer> _Int) {
    if (_Int == null) __Int = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (_Int);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
      }
      __Int = fudge0;
    }
  }
  public void add_Int (Integer _Int) {
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    if (__Int == null) __Int = new java.util.ArrayList<Integer> ();
    __Int.add (_Int);
  }
  public java.util.List<Long> get_Long () {
    return java.util.Collections.unmodifiableList (__Long);
  }
  public void set_Long (Long _Long) {
    if (_Long == null) __Long = null;
    else {
      __Long = new java.util.ArrayList<Long> (1);
      add_Long (_Long);
    }
  }
  public void set_Long (java.util.Collection<? extends Long> _Long) {
    if (_Long == null) __Long = null;
    else {
      final java.util.List<Long> fudge0 = new java.util.ArrayList<Long> (_Long);
      for (java.util.ListIterator<Long> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Long fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
      }
      __Long = fudge0;
    }
  }
  public void add_Long (Long _Long) {
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    if (__Long == null) __Long = new java.util.ArrayList<Long> ();
    __Long.add (_Long);
  }
  public java.util.List<Short> get_Short () {
    return java.util.Collections.unmodifiableList (__Short);
  }
  public void set_Short (Short _Short) {
    if (_Short == null) __Short = null;
    else {
      __Short = new java.util.ArrayList<Short> (1);
      add_Short (_Short);
    }
  }
  public void set_Short (java.util.Collection<? extends Short> _Short) {
    if (_Short == null) __Short = null;
    else {
      final java.util.List<Short> fudge0 = new java.util.ArrayList<Short> (_Short);
      for (java.util.ListIterator<Short> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Short fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
      }
      __Short = fudge0;
    }
  }
  public void add_Short (Short _Short) {
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    if (__Short == null) __Short = new java.util.ArrayList<Short> ();
    __Short.add (_Short);
  }
  public java.util.List<String> get_String () {
    return java.util.Collections.unmodifiableList (__String);
  }
  public void set_String (String _String) {
    if (_String == null) __String = null;
    else {
      __String = new java.util.ArrayList<String> (1);
      add_String (_String);
    }
  }
  public void set_String (java.util.Collection<? extends String> _String) {
    if (_String == null) __String = null;
    else {
      final java.util.List<String> fudge0 = new java.util.ArrayList<String> (_String);
      for (java.util.ListIterator<String> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
      }
      __String = fudge0;
    }
  }
  public void add_String (String _String) {
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    if (__String == null) __String = new java.util.ArrayList<String> ();
    __String.add (_String);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.SubMessage> get_SubMessage () {
    return java.util.Collections.unmodifiableList (__SubMessage);
  }
  public void set_SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
    if (_SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> (1);
      add_SubMessage (_SubMessage);
    }
  }
  public void set_SubMessage (java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage> _SubMessage) {
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
  }
  public void add_SubMessage (org.fudgemsg.proto.tests.types.SubMessage _SubMessage) {
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    if (__SubMessage == null) __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
    __SubMessage.add (_SubMessage);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> get_CustomEnum () {
    return java.util.Collections.unmodifiableList (__CustomEnum);
  }
  public void set_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (1);
      add_CustomEnum (_CustomEnum);
    }
  }
  public void set_CustomEnum (java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum> _CustomEnum) {
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> (_CustomEnum);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
      }
      __CustomEnum = fudge0;
    }
  }
  public void add_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum _CustomEnum) {
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    if (__CustomEnum == null) __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
    __CustomEnum.add (_CustomEnum);
  }
  public java.util.List<org.fudgemsg.FudgeFieldContainer> get_Message () {
    return java.util.Collections.unmodifiableList (__Message);
  }
  public void set_Message (org.fudgemsg.FudgeFieldContainer _Message) {
    if (_Message == null) __Message = null;
    else {
      __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (1);
      add_Message (_Message);
    }
  }
  public void set_Message (java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer> _Message) {
    if (_Message == null) __Message = null;
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> (_Message);
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
      }
      __Message = fudge0;
    }
  }
  public void add_Message (org.fudgemsg.FudgeFieldContainer _Message) {
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    if (__Message == null) __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
    __Message.add (_Message);
  }
  public java.util.List<javax.time.calendar.DateProvider> get_Date () {
    return java.util.Collections.unmodifiableList (__Date);
  }
  public void set_Date (javax.time.calendar.DateProvider _Date) {
    if (_Date == null) __Date = null;
    else {
      __Date = new java.util.ArrayList<javax.time.calendar.DateProvider> (1);
      add_Date (_Date);
    }
  }
  public void set_Date (java.util.Collection<? extends javax.time.calendar.DateProvider> _Date) {
    if (_Date == null) __Date = null;
    else {
      final java.util.List<javax.time.calendar.DateProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider> (_Date);
      for (java.util.ListIterator<javax.time.calendar.DateProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
      }
      __Date = fudge0;
    }
  }
  public void add_Date (javax.time.calendar.DateProvider _Date) {
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    if (__Date == null) __Date = new java.util.ArrayList<javax.time.calendar.DateProvider> ();
    __Date.add (_Date);
  }
  public java.util.List<javax.time.calendar.DateTimeProvider> get_DateTime () {
    return java.util.Collections.unmodifiableList (__DateTime);
  }
  public void set_DateTime (javax.time.calendar.DateTimeProvider _DateTime) {
    if (_DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (1);
      add_DateTime (_DateTime);
    }
  }
  public void set_DateTime (java.util.Collection<? extends javax.time.calendar.DateTimeProvider> _DateTime) {
    if (_DateTime == null) __DateTime = null;
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> (_DateTime);
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
      }
      __DateTime = fudge0;
    }
  }
  public void add_DateTime (javax.time.calendar.DateTimeProvider _DateTime) {
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    if (__DateTime == null) __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> ();
    __DateTime.add (_DateTime);
  }
  public java.util.List<javax.time.calendar.TimeProvider> get_Time () {
    return java.util.Collections.unmodifiableList (__Time);
  }
  public void set_Time (javax.time.calendar.TimeProvider _Time) {
    if (_Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider> (1);
      add_Time (_Time);
    }
  }
  public void set_Time (java.util.Collection<? extends javax.time.calendar.TimeProvider> _Time) {
    if (_Time == null) __Time = null;
    else {
      final java.util.List<javax.time.calendar.TimeProvider> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider> (_Time);
      for (java.util.ListIterator<javax.time.calendar.TimeProvider> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
      }
      __Time = fudge0;
    }
  }
  public void add_Time (javax.time.calendar.TimeProvider _Time) {
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    if (__Time == null) __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider> ();
    __Time.add (_Time);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof MutableRSTypes_Optional)) return false;
    MutableRSTypes_Optional msg = (MutableRSTypes_Optional)o;
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
