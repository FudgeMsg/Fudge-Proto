// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:169(10)
package org.fudgemsg.proto.tests.types;
public class RATypes_Required implements java.io.Serializable, RATypesBase {
  private static final long serialVersionUID = 4382965593991127732l;
  private final java.util.List<boolean[]> __Boolean;
  public static final String _BOOLEAN_KEY = "_Boolean";
  private final java.util.List<byte[]> __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private final java.util.List<double[]> __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private final java.util.List<float[]> __Float;
  public static final String _FLOAT_KEY = "_Float";
  private final java.util.List<boolean[]> __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private final java.util.List<int[]> __Int;
  public static final String _INT_KEY = "_Int";
  private final java.util.List<long[]> __Long;
  public static final String _LONG_KEY = "_Long";
  private final java.util.List<short[]> __Short;
  public static final String _SHORT_KEY = "_Short";
  private final java.util.List<String[]> __String;
  public static final String _STRING_KEY = "_String";
  private final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private final java.util.List<org.fudgemsg.FudgeFieldContainer[]> __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private final java.util.List<javax.time.calendar.DateProvider[]> __Date;
  public static final String _DATE_KEY = "_Date";
  private final java.util.List<javax.time.calendar.DateTimeProvider[]> __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private final java.util.List<javax.time.calendar.TimeProvider[]> __Time;
  public static final String _TIME_KEY = "_Time";
  public RATypes_Required (java.util.Collection<? extends boolean[]> _Boolean, java.util.Collection<? extends byte[]> _Byte, java.util.Collection<? extends double[]> _Double, java.util.Collection<? extends float[]> _Float, java.util.Collection<? extends boolean[]> _Indicator, java.util.Collection<? extends int[]> _Int, java.util.Collection<? extends long[]> _Long, java.util.Collection<? extends short[]> _Short, java.util.Collection<? extends String[]> _String, java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage[]> _SubMessage, java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum[]> _CustomEnum, java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer[]> _Message, java.util.Collection<? extends javax.time.calendar.DateProvider[]> _Date, java.util.Collection<? extends javax.time.calendar.DateTimeProvider[]> _DateTime, java.util.Collection<? extends javax.time.calendar.TimeProvider[]> _Time) {
    if (_Boolean == null) throw new NullPointerException ("'_Boolean' cannot be null");
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Boolean);
      if (_Boolean.size () == 0) throw new IllegalArgumentException ("'_Boolean' cannot be an empty list");
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Boolean' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Boolean = fudge0;
    }
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      final java.util.List<byte[]> fudge0 = new java.util.ArrayList<byte[]> (_Byte);
      if (_Byte.size () == 0) throw new IllegalArgumentException ("'_Byte' cannot be an empty list");
      for (java.util.ListIterator<byte[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        byte[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Byte = fudge0;
    }
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      final java.util.List<double[]> fudge0 = new java.util.ArrayList<double[]> (_Double);
      if (_Double.size () == 0) throw new IllegalArgumentException ("'_Double' cannot be an empty list");
      for (java.util.ListIterator<double[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        double[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Double = fudge0;
    }
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      final java.util.List<float[]> fudge0 = new java.util.ArrayList<float[]> (_Float);
      if (_Float.size () == 0) throw new IllegalArgumentException ("'_Float' cannot be an empty list");
      for (java.util.ListIterator<float[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        float[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Float = fudge0;
    }
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Indicator);
      if (_Indicator.size () == 0) throw new IllegalArgumentException ("'_Indicator' cannot be an empty list");
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Indicator = fudge0;
    }
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      final java.util.List<int[]> fudge0 = new java.util.ArrayList<int[]> (_Int);
      if (_Int.size () == 0) throw new IllegalArgumentException ("'_Int' cannot be an empty list");
      for (java.util.ListIterator<int[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        int[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Int = fudge0;
    }
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      final java.util.List<long[]> fudge0 = new java.util.ArrayList<long[]> (_Long);
      if (_Long.size () == 0) throw new IllegalArgumentException ("'_Long' cannot be an empty list");
      for (java.util.ListIterator<long[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        long[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Long = fudge0;
    }
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      final java.util.List<short[]> fudge0 = new java.util.ArrayList<short[]> (_Short);
      if (_Short.size () == 0) throw new IllegalArgumentException ("'_Short' cannot be an empty list");
      for (java.util.ListIterator<short[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        short[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Short = fudge0;
    }
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      final java.util.List<String[]> fudge0 = new java.util.ArrayList<String[]> (_String);
      if (_String.size () == 0) throw new IllegalArgumentException ("'_String' cannot be an empty list");
      for (java.util.ListIterator<String[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __String = fudge0;
    }
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (_SubMessage);
      if (_SubMessage.size () == 0) throw new IllegalArgumentException ("'_SubMessage' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_SubMessage' cannot be null");
        fudge2 = java.util.Arrays.copyOf (fudge2, fudge2.length);
        for (int fudge3 = 0; fudge3 < fudge2.length; fudge3++) {
          if (fudge2[fudge3] != null) {
          }
        }
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (_CustomEnum);
      if (_CustomEnum.size () == 0) throw new IllegalArgumentException ("'_CustomEnum' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __CustomEnum = fudge0;
    }
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (_Message);
      if (_Message.size () == 0) throw new IllegalArgumentException ("'_Message' cannot be an empty list");
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Message = fudge0;
    }
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      final java.util.List<javax.time.calendar.DateProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (_Date);
      if (_Date.size () == 0) throw new IllegalArgumentException ("'_Date' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.DateProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Date = fudge0;
    }
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (_DateTime);
      if (_DateTime.size () == 0) throw new IllegalArgumentException ("'_DateTime' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __DateTime = fudge0;
    }
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (_Time);
      if (_Time.size () == 0) throw new IllegalArgumentException ("'_Time' cannot be an empty list");
      for (java.util.ListIterator<javax.time.calendar.TimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Time = fudge0;
    }
  }
  protected RATypes_Required (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    java.util.List<org.fudgemsg.FudgeField> fudgeFields;
    fudgeFields = fudgeMsg.getAllByName (_BOOLEAN_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Boolean' is not present");
    __Boolean = new java.util.ArrayList<boolean[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge2 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge1);
        final java.util.List<Boolean> fudge3 = new java.util.ArrayList<Boolean> ();
        for (org.fudgemsg.FudgeField fudge4 : fudge2) {
          try {
            fudge3.add (fudge2.getFieldValue (Boolean.class, fudge4));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Boolean[]' is not boolean", e);
          }
        }
        final boolean[] fudge5 = new boolean[fudge3.size ()];
        int fudge6 = 0;
        for (boolean fudge7 : fudge3) {
          fudge5[fudge6++] = fudge7;
        }
        __Boolean.add (fudge5);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Boolean' is not boolean[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_BYTE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Byte' is not present");
    __Byte = new java.util.ArrayList<byte[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
      try {
        __Byte.add (fudgeMsg.getFieldValue (byte[].class, fudge2));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Byte' is not byte[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DOUBLE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Double' is not present");
    __Double = new java.util.ArrayList<double[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge3 : fudgeFields) {
      try {
        __Double.add (fudgeMsg.getFieldValue (double[].class, fudge3));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Double' is not double[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_FLOAT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Float' is not present");
    __Float = new java.util.ArrayList<float[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge4 : fudgeFields) {
      try {
        __Float.add (fudgeMsg.getFieldValue (float[].class, fudge4));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Float' is not float[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_INDICATOR_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Indicator' is not present");
    __Indicator = new java.util.ArrayList<boolean[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge5 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge6 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge5);
        final java.util.List<Boolean> fudge7 = new java.util.ArrayList<Boolean> ();
        for (org.fudgemsg.FudgeField fudge8 : fudge6) {
          fudge7.add (fudge8.getValue () != null);
        }
        final boolean[] fudge9 = new boolean[fudge7.size ()];
        int fudge10 = 0;
        for (boolean fudge11 : fudge7) {
          fudge9[fudge10++] = fudge11;
        }
        __Indicator.add (fudge9);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Indicator' is not indicator[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_INT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Int' is not present");
    __Int = new java.util.ArrayList<int[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge6 : fudgeFields) {
      try {
        __Int.add (fudgeMsg.getFieldValue (int[].class, fudge6));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Int' is not integer[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_LONG_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Long' is not present");
    __Long = new java.util.ArrayList<long[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge7 : fudgeFields) {
      try {
        __Long.add (fudgeMsg.getFieldValue (long[].class, fudge7));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Long' is not long[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_SHORT_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Short' is not present");
    __Short = new java.util.ArrayList<short[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge8 : fudgeFields) {
      try {
        __Short.add (fudgeMsg.getFieldValue (short[].class, fudge8));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Short' is not short[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_STRING_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_String' is not present");
    __String = new java.util.ArrayList<String[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge9 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge10 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge9);
        final java.util.List<String> fudge11 = new java.util.ArrayList<String> ();
        for (org.fudgemsg.FudgeField fudge12 : fudge10) {
          try {
            fudge11.add ((fudge12.getValue () != null) ? fudge12.getValue ().toString () : null);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_String[]' is not string", e);
          }
        }
        __String.add (fudge11.toArray (new String[fudge11.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_String' is not string[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_SUBMESSAGE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_SubMessage' is not present");
    __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge10 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge11 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge10);
        final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge12 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
        for (org.fudgemsg.FudgeField fudge13 : fudge11) {
          try {
            final org.fudgemsg.proto.tests.types.SubMessage fudge14;
            fudge14 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudge11.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge13));
            fudge12.add (fudge14);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_SubMessage[]' is not SubMessage message", e);
          }
        }
        __SubMessage.add (fudge12.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge12.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_SubMessage' is not SubMessage message[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_CUSTOMENUM_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_CustomEnum' is not present");
    __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge11 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge12 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge11);
        final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge13 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
        for (org.fudgemsg.FudgeField fudge14 : fudge12) {
          try {
            final org.fudgemsg.proto.tests.types.CustomEnum fudge15;
            fudge15 = fudge12.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge14);
            fudge13.add (fudge15);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_CustomEnum[]' is not CustomEnum enum", e);
          }
        }
        __CustomEnum.add (fudge13.toArray (new org.fudgemsg.proto.tests.types.CustomEnum[fudge13.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_CustomEnum' is not CustomEnum enum[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_MESSAGE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Message' is not present");
    __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge12 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge13 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge12);
        final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge14 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
        for (org.fudgemsg.FudgeField fudge15 : fudge13) {
          try {
            final org.fudgemsg.FudgeFieldContainer fudge16;
            fudge16 = fudge13.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge15);
            fudge14.add (fudge16);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Message[]' is not anonymous/unknown message", e);
          }
        }
        __Message.add (fudge14.toArray (new org.fudgemsg.FudgeFieldContainer[fudge14.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Message' is not anonymous/unknown message[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DATE_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Date' is not present");
    __Date = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge13 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge14 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge13);
        final java.util.List<javax.time.calendar.DateProvider> fudge15 = new java.util.ArrayList<javax.time.calendar.DateProvider> ();
        for (org.fudgemsg.FudgeField fudge16 : fudge14) {
          try {
            fudge15.add (fudge14.getFieldValue (javax.time.calendar.DateProvider.class, fudge16));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Date[]' is not date", e);
          }
        }
        __Date.add (fudge15.toArray (new javax.time.calendar.DateProvider[fudge15.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Date' is not date[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_DATETIME_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_DateTime' is not present");
    __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge14 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge15 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge14);
        final java.util.List<javax.time.calendar.DateTimeProvider> fudge16 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> ();
        for (org.fudgemsg.FudgeField fudge17 : fudge15) {
          try {
            fudge16.add (fudge15.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge17));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_DateTime[]' is not datetime", e);
          }
        }
        __DateTime.add (fudge16.toArray (new javax.time.calendar.DateTimeProvider[fudge16.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_DateTime' is not datetime[]", e);
      }
    }
    fudgeFields = fudgeMsg.getAllByName (_TIME_KEY);
    if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Time' is not present");
    __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (fudgeFields.size ());
    for (org.fudgemsg.FudgeField fudge15 : fudgeFields) {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge16 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge15);
        final java.util.List<javax.time.calendar.TimeProvider> fudge17 = new java.util.ArrayList<javax.time.calendar.TimeProvider> ();
        for (org.fudgemsg.FudgeField fudge18 : fudge16) {
          try {
            fudge17.add (fudge16.getFieldValue (javax.time.calendar.TimeProvider.class, fudge18));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Time[]' is not time", e);
          }
        }
        __Time.add (fudge17.toArray (new javax.time.calendar.TimeProvider[fudge17.size ()]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a RATypes_Required - field '_Time' is not time[]", e);
      }
    }
  }
  protected RATypes_Required (final RATypes_Required source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Boolean == null) __Boolean = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (source.__Boolean);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Boolean = fudge0;
    }
    if (source.__Byte == null) __Byte = null;
    else {
      final java.util.List<byte[]> fudge0 = new java.util.ArrayList<byte[]> (source.__Byte);
      for (java.util.ListIterator<byte[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        byte[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Byte = fudge0;
    }
    if (source.__Double == null) __Double = null;
    else {
      final java.util.List<double[]> fudge0 = new java.util.ArrayList<double[]> (source.__Double);
      for (java.util.ListIterator<double[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        double[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Double = fudge0;
    }
    if (source.__Float == null) __Float = null;
    else {
      final java.util.List<float[]> fudge0 = new java.util.ArrayList<float[]> (source.__Float);
      for (java.util.ListIterator<float[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        float[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Float = fudge0;
    }
    if (source.__Indicator == null) __Indicator = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (source.__Indicator);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Indicator = fudge0;
    }
    if (source.__Int == null) __Int = null;
    else {
      final java.util.List<int[]> fudge0 = new java.util.ArrayList<int[]> (source.__Int);
      for (java.util.ListIterator<int[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        int[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Int = fudge0;
    }
    if (source.__Long == null) __Long = null;
    else {
      final java.util.List<long[]> fudge0 = new java.util.ArrayList<long[]> (source.__Long);
      for (java.util.ListIterator<long[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        long[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Long = fudge0;
    }
    if (source.__Short == null) __Short = null;
    else {
      final java.util.List<short[]> fudge0 = new java.util.ArrayList<short[]> (source.__Short);
      for (java.util.ListIterator<short[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        short[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Short = fudge0;
    }
    if (source.__String == null) __String = null;
    else {
      final java.util.List<String[]> fudge0 = new java.util.ArrayList<String[]> (source.__String);
      for (java.util.ListIterator<String[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __String = fudge0;
    }
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (source.__SubMessage);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.SubMessage[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.SubMessage[] fudge2 = fudge1.next ();
        fudge2 = java.util.Arrays.copyOf (fudge2, fudge2.length);
        for (int fudge3 = 0; fudge3 < fudge2.length; fudge3++) {
          if (fudge2[fudge3] != null) {
          }
        }
        fudge1.set (fudge2);
      }
      __SubMessage = fudge0;
    }
    if (source.__CustomEnum == null) __CustomEnum = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (source.__CustomEnum);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __CustomEnum = fudge0;
    }
    if (source.__Message == null) __Message = null;
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (source.__Message);
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Message = fudge0;
    }
    if (source.__Date == null) __Date = null;
    else {
      final java.util.List<javax.time.calendar.DateProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (source.__Date);
      for (java.util.ListIterator<javax.time.calendar.DateProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Date = fudge0;
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (source.__DateTime);
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __DateTime = fudge0;
    }
    if (source.__Time == null) __Time = null;
    else {
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (source.__Time);
      for (java.util.ListIterator<javax.time.calendar.TimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider[] fudge2 = fudge1.next ();
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Time = fudge0;
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
      for (boolean[] fudge1 : __Boolean) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (boolean fudge3 : fudge1) {
          fudge2.add (null, null, fudge3);
        }
        msg.add (_BOOLEAN_KEY, null, fudge2);
      }
    }
    if (__Byte != null)  {
      for (byte[] fudge1 : __Byte) {
        msg.add (_BYTE_KEY, null, fudge1);
      }
    }
    if (__Double != null)  {
      for (double[] fudge1 : __Double) {
        msg.add (_DOUBLE_KEY, null, fudge1);
      }
    }
    if (__Float != null)  {
      for (float[] fudge1 : __Float) {
        msg.add (_FLOAT_KEY, null, fudge1);
      }
    }
    if (__Indicator != null)  {
      for (boolean[] fudge1 : __Indicator) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (boolean fudge3 : fudge1) {
          if (fudge3) fudge2.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
        }
        msg.add (_INDICATOR_KEY, null, fudge2);
      }
    }
    if (__Int != null)  {
      for (int[] fudge1 : __Int) {
        msg.add (_INT_KEY, null, fudge1);
      }
    }
    if (__Long != null)  {
      for (long[] fudge1 : __Long) {
        msg.add (_LONG_KEY, null, fudge1);
      }
    }
    if (__Short != null)  {
      for (short[] fudge1 : __Short) {
        msg.add (_SHORT_KEY, null, fudge1);
      }
    }
    if (__String != null)  {
      for (String[] fudge1 : __String) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (String fudge3 : fudge1) {
          fudge2.add (null, null, fudge3);
        }
        msg.add (_STRING_KEY, null, fudge2);
      }
    }
    if (__SubMessage != null)  {
      for (org.fudgemsg.proto.tests.types.SubMessage[] fudge1 : __SubMessage) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (org.fudgemsg.proto.tests.types.SubMessage fudge3 : fudge1) {
          if (fudge3 != null)  {
            final org.fudgemsg.MutableFudgeFieldContainer fudge4 = fudgeContext.newMessage ();
            Class<?> fudge5 = fudge3.getClass ();
            while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge5)) {
              fudge4.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge5.getName ());
              fudge5 = fudge5.getSuperclass ();
            }
            fudge3.toFudgeMsg (fudgeContext, fudge4);
            fudge2.add (null, null, fudge4);
          }
          else {
            fudge2.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
          }
        }
        msg.add (_SUBMESSAGE_KEY, null, fudge2);
      }
    }
    if (__CustomEnum != null)  {
      for (org.fudgemsg.proto.tests.types.CustomEnum[] fudge1 : __CustomEnum) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (org.fudgemsg.proto.tests.types.CustomEnum fudge3 : fudge1) {
          fudge2.add (null, null, fudge3.name ());
        }
        msg.add (_CUSTOMENUM_KEY, null, fudge2);
      }
    }
    if (__Message != null)  {
      for (org.fudgemsg.FudgeFieldContainer[] fudge1 : __Message) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (org.fudgemsg.FudgeFieldContainer fudge3 : fudge1) {
          fudge2.add (null, null, fudgeContext.newMessage (fudge3));
        }
        msg.add (_MESSAGE_KEY, null, fudge2);
      }
    }
    if (__Date != null)  {
      for (javax.time.calendar.DateProvider[] fudge1 : __Date) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (javax.time.calendar.DateProvider fudge3 : fudge1) {
          fudge2.add (null, null, fudge3);
        }
        msg.add (_DATE_KEY, null, fudge2);
      }
    }
    if (__DateTime != null)  {
      for (javax.time.calendar.DateTimeProvider[] fudge1 : __DateTime) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (javax.time.calendar.DateTimeProvider fudge3 : fudge1) {
          fudge2.add (null, null, fudge3);
        }
        msg.add (_DATETIME_KEY, null, fudge2);
      }
    }
    if (__Time != null)  {
      for (javax.time.calendar.TimeProvider[] fudge1 : __Time) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (javax.time.calendar.TimeProvider fudge3 : fudge1) {
          fudge2.add (null, null, fudge3);
        }
        msg.add (_TIME_KEY, null, fudge2);
      }
    }
  }
  public static RATypes_Required fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.RATypes_Required".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.RATypes_Required)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new RATypes_Required (fudgeMsg);
  }
  public java.util.List<boolean[]> get_Boolean () {
    return java.util.Collections.unmodifiableList (__Boolean);
  }
  public java.util.List<byte[]> get_Byte () {
    return java.util.Collections.unmodifiableList (__Byte);
  }
  public java.util.List<double[]> get_Double () {
    return java.util.Collections.unmodifiableList (__Double);
  }
  public java.util.List<float[]> get_Float () {
    return java.util.Collections.unmodifiableList (__Float);
  }
  public java.util.List<boolean[]> get_Indicator () {
    return java.util.Collections.unmodifiableList (__Indicator);
  }
  public java.util.List<int[]> get_Int () {
    return java.util.Collections.unmodifiableList (__Int);
  }
  public java.util.List<long[]> get_Long () {
    return java.util.Collections.unmodifiableList (__Long);
  }
  public java.util.List<short[]> get_Short () {
    return java.util.Collections.unmodifiableList (__Short);
  }
  public java.util.List<String[]> get_String () {
    return java.util.Collections.unmodifiableList (__String);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> get_SubMessage () {
    return java.util.Collections.unmodifiableList (__SubMessage);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> get_CustomEnum () {
    return java.util.Collections.unmodifiableList (__CustomEnum);
  }
  public java.util.List<org.fudgemsg.FudgeFieldContainer[]> get_Message () {
    return java.util.Collections.unmodifiableList (__Message);
  }
  public java.util.List<javax.time.calendar.DateProvider[]> get_Date () {
    return java.util.Collections.unmodifiableList (__Date);
  }
  public java.util.List<javax.time.calendar.DateTimeProvider[]> get_DateTime () {
    return java.util.Collections.unmodifiableList (__DateTime);
  }
  public java.util.List<javax.time.calendar.TimeProvider[]> get_Time () {
    return java.util.Collections.unmodifiableList (__Time);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof RATypes_Required)) return false;
    RATypes_Required msg = (RATypes_Required)o;
    if (__Boolean != null) {
      if (msg.__Boolean != null) {
        if (__Boolean.size () != msg.__Boolean.size ()) return false;
        for (int i = 0; i < __Boolean.size (); i++) {
          if (!java.util.Arrays.equals (__Boolean.get (i), msg.__Boolean.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Boolean != null) return false;
    if (__Byte != null) {
      if (msg.__Byte != null) {
        if (__Byte.size () != msg.__Byte.size ()) return false;
        for (int i = 0; i < __Byte.size (); i++) {
          if (!java.util.Arrays.equals (__Byte.get (i), msg.__Byte.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Byte != null) return false;
    if (__Double != null) {
      if (msg.__Double != null) {
        if (__Double.size () != msg.__Double.size ()) return false;
        for (int i = 0; i < __Double.size (); i++) {
          if (!java.util.Arrays.equals (__Double.get (i), msg.__Double.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Double != null) return false;
    if (__Float != null) {
      if (msg.__Float != null) {
        if (__Float.size () != msg.__Float.size ()) return false;
        for (int i = 0; i < __Float.size (); i++) {
          if (!java.util.Arrays.equals (__Float.get (i), msg.__Float.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Float != null) return false;
    if (__Indicator != null) {
      if (msg.__Indicator != null) {
        if (__Indicator.size () != msg.__Indicator.size ()) return false;
        for (int i = 0; i < __Indicator.size (); i++) {
          if (!java.util.Arrays.equals (__Indicator.get (i), msg.__Indicator.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Indicator != null) return false;
    if (__Int != null) {
      if (msg.__Int != null) {
        if (__Int.size () != msg.__Int.size ()) return false;
        for (int i = 0; i < __Int.size (); i++) {
          if (!java.util.Arrays.equals (__Int.get (i), msg.__Int.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Int != null) return false;
    if (__Long != null) {
      if (msg.__Long != null) {
        if (__Long.size () != msg.__Long.size ()) return false;
        for (int i = 0; i < __Long.size (); i++) {
          if (!java.util.Arrays.equals (__Long.get (i), msg.__Long.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Long != null) return false;
    if (__Short != null) {
      if (msg.__Short != null) {
        if (__Short.size () != msg.__Short.size ()) return false;
        for (int i = 0; i < __Short.size (); i++) {
          if (!java.util.Arrays.equals (__Short.get (i), msg.__Short.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Short != null) return false;
    if (__String != null) {
      if (msg.__String != null) {
        if (__String.size () != msg.__String.size ()) return false;
        for (int i = 0; i < __String.size (); i++) {
          if (!java.util.Arrays.deepEquals (__String.get (i), msg.__String.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__String != null) return false;
    if (__SubMessage != null) {
      if (msg.__SubMessage != null) {
        if (__SubMessage.size () != msg.__SubMessage.size ()) return false;
        for (int i = 0; i < __SubMessage.size (); i++) {
          if (!java.util.Arrays.deepEquals (__SubMessage.get (i), msg.__SubMessage.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__SubMessage != null) return false;
    if (__CustomEnum != null) {
      if (msg.__CustomEnum != null) {
        if (__CustomEnum.size () != msg.__CustomEnum.size ()) return false;
        for (int i = 0; i < __CustomEnum.size (); i++) {
          if (!java.util.Arrays.deepEquals (__CustomEnum.get (i), msg.__CustomEnum.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__CustomEnum != null) return false;
    if (__Message != null) {
      if (msg.__Message != null) {
        if (__Message.size () != msg.__Message.size ()) return false;
        for (int i = 0; i < __Message.size (); i++) {
          if (!java.util.Arrays.deepEquals (__Message.get (i), msg.__Message.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Message != null) return false;
    if (__Date != null) {
      if (msg.__Date != null) {
        if (__Date.size () != msg.__Date.size ()) return false;
        for (int i = 0; i < __Date.size (); i++) {
          if (!java.util.Arrays.deepEquals (__Date.get (i), msg.__Date.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Date != null) return false;
    if (__DateTime != null) {
      if (msg.__DateTime != null) {
        if (__DateTime.size () != msg.__DateTime.size ()) return false;
        for (int i = 0; i < __DateTime.size (); i++) {
          if (!java.util.Arrays.deepEquals (__DateTime.get (i), msg.__DateTime.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__DateTime != null) return false;
    if (__Time != null) {
      if (msg.__Time != null) {
        if (__Time.size () != msg.__Time.size ()) return false;
        for (int i = 0; i < __Time.size (); i++) {
          if (!java.util.Arrays.deepEquals (__Time.get (i), msg.__Time.get (i))) return false;
        }
      }
      else return false;
    }
    else if (msg.__Time != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (__Boolean != null) for (boolean[] elem : __Boolean) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Byte != null) for (byte[] elem : __Byte) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Double != null) for (double[] elem : __Double) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Float != null) for (float[] elem : __Float) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Indicator != null) for (boolean[] elem : __Indicator) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Int != null) for (int[] elem : __Int) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Long != null) for (long[] elem : __Long) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__Short != null) for (short[] elem : __Short) hc = (hc * 31) + java.util.Arrays.hashCode (elem);
    hc *= 31;
    if (__String != null) for (String[] elem : __String) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__SubMessage != null) for (org.fudgemsg.proto.tests.types.SubMessage[] elem : __SubMessage) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__CustomEnum != null) for (org.fudgemsg.proto.tests.types.CustomEnum[] elem : __CustomEnum) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__Message != null) for (org.fudgemsg.FudgeFieldContainer[] elem : __Message) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__Date != null) for (javax.time.calendar.DateProvider[] elem : __Date) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__DateTime != null) for (javax.time.calendar.DateTimeProvider[] elem : __DateTime) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
    hc *= 31;
    if (__Time != null) for (javax.time.calendar.TimeProvider[] elem : __Time) hc = (hc * 31) + java.util.Arrays.deepHashCode (elem);
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
