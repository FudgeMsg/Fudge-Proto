// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:264(10)
package org.fudgemsg.proto.tests.types;
public class MutableRATypes_Optional implements java.io.Serializable, RATypesBase {
  private static final long serialVersionUID = 4382965593991127732l;
  private java.util.List<boolean[]> __Boolean;
  public static final String _BOOLEAN_KEY = "_Boolean";
  private java.util.List<byte[]> __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private java.util.List<double[]> __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private java.util.List<float[]> __Float;
  public static final String _FLOAT_KEY = "_Float";
  private java.util.List<boolean[]> __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private java.util.List<int[]> __Int;
  public static final String _INT_KEY = "_Int";
  private java.util.List<long[]> __Long;
  public static final String _LONG_KEY = "_Long";
  private java.util.List<short[]> __Short;
  public static final String _SHORT_KEY = "_Short";
  private java.util.List<String[]> __String;
  public static final String _STRING_KEY = "_String";
  private java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> __SubMessage;
  public static final String _SUB_MESSAGE_KEY = "_SubMessage";
  private java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> __CustomEnum;
  public static final String _CUSTOM_ENUM_KEY = "_CustomEnum";
  private java.util.List<org.fudgemsg.FudgeFieldContainer[]> __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private java.util.List<javax.time.calendar.DateProvider[]> __Date;
  public static final String _DATE_KEY = "_Date";
  private java.util.List<javax.time.calendar.DateTimeProvider[]> __DateTime;
  public static final String _DATE_TIME_KEY = "_DateTime";
  private java.util.List<javax.time.calendar.TimeProvider[]> __Time;
  public static final String _TIME_KEY = "_Time";
  public MutableRATypes_Optional () {
  }
  protected MutableRATypes_Optional (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    java.util.List<org.fudgemsg.FudgeField> fudgeFields;
    fudgeFields = fudgeMsg.getAllByName (_BOOLEAN_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<boolean[]> fudge1;
      fudge1 = new java.util.ArrayList<boolean[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<Boolean> fudge4 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add (fudge3.getFieldValue (Boolean.class, fudge5));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Boolean[]' is not boolean", e);
            }
          }
          final boolean[] fudge6 = new boolean[fudge4.size ()];
          int fudge7 = 0;
          for (boolean fudge8 : fudge4) {
            fudge6[fudge7++] = fudge8;
          }
          fudge1.add (fudge6);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Boolean' is not boolean[]", e);
        }
      }
      set_Boolean (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_BYTE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<byte[]> fudge1;
      fudge1 = new java.util.ArrayList<byte[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (byte[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Byte' is not byte[]", e);
        }
      }
      set_Byte (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_DOUBLE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<double[]> fudge1;
      fudge1 = new java.util.ArrayList<double[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (double[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Double' is not double[]", e);
        }
      }
      set_Double (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_FLOAT_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<float[]> fudge1;
      fudge1 = new java.util.ArrayList<float[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (float[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Float' is not float[]", e);
        }
      }
      set_Float (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_INDICATOR_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<boolean[]> fudge1;
      fudge1 = new java.util.ArrayList<boolean[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<Boolean> fudge4 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            fudge4.add (fudge5.getValue () != null);
          }
          final boolean[] fudge6 = new boolean[fudge4.size ()];
          int fudge7 = 0;
          for (boolean fudge8 : fudge4) {
            fudge6[fudge7++] = fudge8;
          }
          fudge1.add (fudge6);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Indicator' is not indicator[]", e);
        }
      }
      set_Indicator (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_INT_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<int[]> fudge1;
      fudge1 = new java.util.ArrayList<int[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (int[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Int' is not integer[]", e);
        }
      }
      set_Int (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_LONG_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<long[]> fudge1;
      fudge1 = new java.util.ArrayList<long[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (long[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Long' is not long[]", e);
        }
      }
      set_Long (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_SHORT_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<short[]> fudge1;
      fudge1 = new java.util.ArrayList<short[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          fudge1.add (fudgeMsg.getFieldValue (short[].class, fudge2));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Short' is not short[]", e);
        }
      }
      set_Short (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_STRING_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<String[]> fudge1;
      fudge1 = new java.util.ArrayList<String[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<String> fudge4 = new java.util.ArrayList<String> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add ((fudge5.getValue () != null) ? fudge5.getValue ().toString () : null);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_String[]' is not string", e);
            }
          }
          fudge1.add (fudge4.toArray (new String[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_String' is not string[]", e);
        }
      }
      set_String (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_SUB_MESSAGE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge1;
      fudge1 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge4 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              final org.fudgemsg.proto.tests.types.SubMessage fudge6;
              fudge6 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudge3.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge5));
              fudge4.add (fudge6);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_SubMessage[]' is not SubMessage message", e);
            }
          }
          fudge1.add (fudge4.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_SubMessage' is not SubMessage message[]", e);
        }
      }
      set_SubMessage (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_CUSTOM_ENUM_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge1;
      fudge1 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge4 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add (fudge3.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge5));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_CustomEnum[]' is not CustomEnum enum", e);
            }
          }
          fudge1.add (fudge4.toArray (new org.fudgemsg.proto.tests.types.CustomEnum[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_CustomEnum' is not CustomEnum enum[]", e);
        }
      }
      set_CustomEnum (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_MESSAGE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge1;
      fudge1 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge4 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              final org.fudgemsg.FudgeFieldContainer fudge6;
              fudge6 = fudge3.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge5);
              fudge4.add (fudge6);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Message[]' is not anonymous/unknown message", e);
            }
          }
          fudge1.add (fudge4.toArray (new org.fudgemsg.FudgeFieldContainer[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Message' is not anonymous/unknown message[]", e);
        }
      }
      set_Message (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_DATE_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.DateProvider[]> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<javax.time.calendar.DateProvider> fudge4 = new java.util.ArrayList<javax.time.calendar.DateProvider> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add (fudge3.getFieldValue (javax.time.calendar.DateProvider.class, fudge5));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Date[]' is not date", e);
            }
          }
          fudge1.add (fudge4.toArray (new javax.time.calendar.DateProvider[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Date' is not date[]", e);
        }
      }
      set_Date (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_DATE_TIME_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<javax.time.calendar.DateTimeProvider> fudge4 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add (fudge3.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge5));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_DateTime[]' is not datetime", e);
            }
          }
          fudge1.add (fudge4.toArray (new javax.time.calendar.DateTimeProvider[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_DateTime' is not datetime[]", e);
        }
      }
      set_DateTime (fudge1);
    }
    fudgeFields = fudgeMsg.getAllByName (_TIME_KEY);
    if (fudgeFields.size () > 0)  {
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge1;
      fudge1 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge3 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2);
          final java.util.List<javax.time.calendar.TimeProvider> fudge4 = new java.util.ArrayList<javax.time.calendar.TimeProvider> ();
          for (org.fudgemsg.FudgeField fudge5 : fudge3) {
            try {
              fudge4.add (fudge3.getFieldValue (javax.time.calendar.TimeProvider.class, fudge5));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Time[]' is not time", e);
            }
          }
          fudge1.add (fudge4.toArray (new javax.time.calendar.TimeProvider[fudge4.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableRATypes_Optional - field '_Time' is not time[]", e);
        }
      }
      set_Time (fudge1);
    }
  }
  public MutableRATypes_Optional (java.util.Collection<? extends boolean[]> _Boolean, java.util.Collection<? extends byte[]> _Byte, java.util.Collection<? extends double[]> _Double, java.util.Collection<? extends float[]> _Float, java.util.Collection<? extends boolean[]> _Indicator, java.util.Collection<? extends int[]> _Int, java.util.Collection<? extends long[]> _Long, java.util.Collection<? extends short[]> _Short, java.util.Collection<? extends String[]> _String, java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage[]> _SubMessage, java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum[]> _CustomEnum, java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer[]> _Message, java.util.Collection<? extends javax.time.calendar.DateProvider[]> _Date, java.util.Collection<? extends javax.time.calendar.DateTimeProvider[]> _DateTime, java.util.Collection<? extends javax.time.calendar.TimeProvider[]> _Time) {
    if (_Boolean == null) __Boolean = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Boolean);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Boolean' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Boolean = fudge0;
    }
    if (_Byte == null) __Byte = null;
    else {
      final java.util.List<byte[]> fudge0 = new java.util.ArrayList<byte[]> (_Byte);
      for (java.util.ListIterator<byte[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        byte[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Byte = fudge0;
    }
    if (_Double == null) __Double = null;
    else {
      final java.util.List<double[]> fudge0 = new java.util.ArrayList<double[]> (_Double);
      for (java.util.ListIterator<double[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        double[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Double = fudge0;
    }
    if (_Float == null) __Float = null;
    else {
      final java.util.List<float[]> fudge0 = new java.util.ArrayList<float[]> (_Float);
      for (java.util.ListIterator<float[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        float[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Float = fudge0;
    }
    if (_Indicator == null) __Indicator = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Indicator);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Indicator = fudge0;
    }
    if (_Int == null) __Int = null;
    else {
      final java.util.List<int[]> fudge0 = new java.util.ArrayList<int[]> (_Int);
      for (java.util.ListIterator<int[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        int[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Int = fudge0;
    }
    if (_Long == null) __Long = null;
    else {
      final java.util.List<long[]> fudge0 = new java.util.ArrayList<long[]> (_Long);
      for (java.util.ListIterator<long[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        long[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Long = fudge0;
    }
    if (_Short == null) __Short = null;
    else {
      final java.util.List<short[]> fudge0 = new java.util.ArrayList<short[]> (_Short);
      for (java.util.ListIterator<short[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        short[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Short = fudge0;
    }
    if (_String == null) __String = null;
    else {
      final java.util.List<String[]> fudge0 = new java.util.ArrayList<String[]> (_String);
      for (java.util.ListIterator<String[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __String = fudge0;
    }
    if (_SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (_SubMessage);
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
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (_CustomEnum);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __CustomEnum = fudge0;
    }
    if (_Message == null) __Message = null;
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (_Message);
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Message = fudge0;
    }
    if (_Date == null) __Date = null;
    else {
      final java.util.List<javax.time.calendar.DateProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (_Date);
      for (java.util.ListIterator<javax.time.calendar.DateProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Date = fudge0;
    }
    if (_DateTime == null) __DateTime = null;
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (_DateTime);
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __DateTime = fudge0;
    }
    if (_Time == null) __Time = null;
    else {
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (_Time);
      for (java.util.ListIterator<javax.time.calendar.TimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Time = fudge0;
    }
  }
  protected MutableRATypes_Optional (final MutableRATypes_Optional source) {
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
  public MutableRATypes_Optional clone () {
    return new MutableRATypes_Optional (this);
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
        msg.add (_SUB_MESSAGE_KEY, null, fudge2);
      }
    }
    if (__CustomEnum != null)  {
      for (org.fudgemsg.proto.tests.types.CustomEnum[] fudge1 : __CustomEnum) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        for (org.fudgemsg.proto.tests.types.CustomEnum fudge3 : fudge1) {
          fudge2.add (null, null, fudge3.name ());
        }
        msg.add (_CUSTOM_ENUM_KEY, null, fudge2);
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
        msg.add (_DATE_TIME_KEY, null, fudge2);
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
  public static MutableRATypes_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.MutableRATypes_Optional".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.MutableRATypes_Optional)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new MutableRATypes_Optional (fudgeMsg);
  }
  public java.util.List<boolean[]> get_Boolean () {
    if (__Boolean != null) {
      return java.util.Collections.unmodifiableList (__Boolean);
    }
    else return null;
  }
  public void set_Boolean (boolean[] _Boolean) {
    if (_Boolean == null) __Boolean = null;
    else {
      __Boolean = new java.util.ArrayList<boolean[]> (1);
      add_Boolean (_Boolean);
    }
  }
  public void set_Boolean (java.util.Collection<? extends boolean[]> _Boolean) {
    if (_Boolean == null) __Boolean = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Boolean);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Boolean' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Boolean = fudge0;
    }
  }
  public void add_Boolean (boolean[] _Boolean) {
    if (_Boolean == null) throw new NullPointerException ("'_Boolean' cannot be null");
    if (__Boolean == null) __Boolean = new java.util.ArrayList<boolean[]> ();
    __Boolean.add (java.util.Arrays.copyOf (_Boolean, _Boolean.length));
  }
  public java.util.List<byte[]> get_Byte () {
    if (__Byte != null) {
      return java.util.Collections.unmodifiableList (__Byte);
    }
    else return null;
  }
  public void set_Byte (byte[] _Byte) {
    if (_Byte == null) __Byte = null;
    else {
      __Byte = new java.util.ArrayList<byte[]> (1);
      add_Byte (_Byte);
    }
  }
  public void set_Byte (java.util.Collection<? extends byte[]> _Byte) {
    if (_Byte == null) __Byte = null;
    else {
      final java.util.List<byte[]> fudge0 = new java.util.ArrayList<byte[]> (_Byte);
      for (java.util.ListIterator<byte[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        byte[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Byte' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Byte = fudge0;
    }
  }
  public void add_Byte (byte[] _Byte) {
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    if (__Byte == null) __Byte = new java.util.ArrayList<byte[]> ();
    __Byte.add (java.util.Arrays.copyOf (_Byte, _Byte.length));
  }
  public java.util.List<double[]> get_Double () {
    if (__Double != null) {
      return java.util.Collections.unmodifiableList (__Double);
    }
    else return null;
  }
  public void set_Double (double[] _Double) {
    if (_Double == null) __Double = null;
    else {
      __Double = new java.util.ArrayList<double[]> (1);
      add_Double (_Double);
    }
  }
  public void set_Double (java.util.Collection<? extends double[]> _Double) {
    if (_Double == null) __Double = null;
    else {
      final java.util.List<double[]> fudge0 = new java.util.ArrayList<double[]> (_Double);
      for (java.util.ListIterator<double[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        double[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Double' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Double = fudge0;
    }
  }
  public void add_Double (double[] _Double) {
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    if (__Double == null) __Double = new java.util.ArrayList<double[]> ();
    __Double.add (java.util.Arrays.copyOf (_Double, _Double.length));
  }
  public java.util.List<float[]> get_Float () {
    if (__Float != null) {
      return java.util.Collections.unmodifiableList (__Float);
    }
    else return null;
  }
  public void set_Float (float[] _Float) {
    if (_Float == null) __Float = null;
    else {
      __Float = new java.util.ArrayList<float[]> (1);
      add_Float (_Float);
    }
  }
  public void set_Float (java.util.Collection<? extends float[]> _Float) {
    if (_Float == null) __Float = null;
    else {
      final java.util.List<float[]> fudge0 = new java.util.ArrayList<float[]> (_Float);
      for (java.util.ListIterator<float[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        float[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Float' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Float = fudge0;
    }
  }
  public void add_Float (float[] _Float) {
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    if (__Float == null) __Float = new java.util.ArrayList<float[]> ();
    __Float.add (java.util.Arrays.copyOf (_Float, _Float.length));
  }
  public java.util.List<boolean[]> get_Indicator () {
    if (__Indicator != null) {
      return java.util.Collections.unmodifiableList (__Indicator);
    }
    else return null;
  }
  public void set_Indicator (boolean[] _Indicator) {
    if (_Indicator == null) __Indicator = null;
    else {
      __Indicator = new java.util.ArrayList<boolean[]> (1);
      add_Indicator (_Indicator);
    }
  }
  public void set_Indicator (java.util.Collection<? extends boolean[]> _Indicator) {
    if (_Indicator == null) __Indicator = null;
    else {
      final java.util.List<boolean[]> fudge0 = new java.util.ArrayList<boolean[]> (_Indicator);
      for (java.util.ListIterator<boolean[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        boolean[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Indicator' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Indicator = fudge0;
    }
  }
  public void add_Indicator (boolean[] _Indicator) {
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    if (__Indicator == null) __Indicator = new java.util.ArrayList<boolean[]> ();
    __Indicator.add (java.util.Arrays.copyOf (_Indicator, _Indicator.length));
  }
  public java.util.List<int[]> get_Int () {
    if (__Int != null) {
      return java.util.Collections.unmodifiableList (__Int);
    }
    else return null;
  }
  public void set_Int (int[] _Int) {
    if (_Int == null) __Int = null;
    else {
      __Int = new java.util.ArrayList<int[]> (1);
      add_Int (_Int);
    }
  }
  public void set_Int (java.util.Collection<? extends int[]> _Int) {
    if (_Int == null) __Int = null;
    else {
      final java.util.List<int[]> fudge0 = new java.util.ArrayList<int[]> (_Int);
      for (java.util.ListIterator<int[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        int[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Int' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Int = fudge0;
    }
  }
  public void add_Int (int[] _Int) {
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    if (__Int == null) __Int = new java.util.ArrayList<int[]> ();
    __Int.add (java.util.Arrays.copyOf (_Int, _Int.length));
  }
  public java.util.List<long[]> get_Long () {
    if (__Long != null) {
      return java.util.Collections.unmodifiableList (__Long);
    }
    else return null;
  }
  public void set_Long (long[] _Long) {
    if (_Long == null) __Long = null;
    else {
      __Long = new java.util.ArrayList<long[]> (1);
      add_Long (_Long);
    }
  }
  public void set_Long (java.util.Collection<? extends long[]> _Long) {
    if (_Long == null) __Long = null;
    else {
      final java.util.List<long[]> fudge0 = new java.util.ArrayList<long[]> (_Long);
      for (java.util.ListIterator<long[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        long[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Long' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Long = fudge0;
    }
  }
  public void add_Long (long[] _Long) {
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    if (__Long == null) __Long = new java.util.ArrayList<long[]> ();
    __Long.add (java.util.Arrays.copyOf (_Long, _Long.length));
  }
  public java.util.List<short[]> get_Short () {
    if (__Short != null) {
      return java.util.Collections.unmodifiableList (__Short);
    }
    else return null;
  }
  public void set_Short (short[] _Short) {
    if (_Short == null) __Short = null;
    else {
      __Short = new java.util.ArrayList<short[]> (1);
      add_Short (_Short);
    }
  }
  public void set_Short (java.util.Collection<? extends short[]> _Short) {
    if (_Short == null) __Short = null;
    else {
      final java.util.List<short[]> fudge0 = new java.util.ArrayList<short[]> (_Short);
      for (java.util.ListIterator<short[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        short[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Short' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Short = fudge0;
    }
  }
  public void add_Short (short[] _Short) {
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    if (__Short == null) __Short = new java.util.ArrayList<short[]> ();
    __Short.add (java.util.Arrays.copyOf (_Short, _Short.length));
  }
  public java.util.List<String[]> get_String () {
    if (__String != null) {
      return java.util.Collections.unmodifiableList (__String);
    }
    else return null;
  }
  public void set_String (String[] _String) {
    if (_String == null) __String = null;
    else {
      __String = new java.util.ArrayList<String[]> (1);
      add_String (_String);
    }
  }
  public void set_String (java.util.Collection<? extends String[]> _String) {
    if (_String == null) __String = null;
    else {
      final java.util.List<String[]> fudge0 = new java.util.ArrayList<String[]> (_String);
      for (java.util.ListIterator<String[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        String[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_String' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __String = fudge0;
    }
  }
  public void add_String (String[] _String) {
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    if (__String == null) __String = new java.util.ArrayList<String[]> ();
    __String.add (java.util.Arrays.copyOf (_String, _String.length));
  }
  public java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> get_SubMessage () {
    if (__SubMessage != null) {
      return java.util.Collections.unmodifiableList (__SubMessage);
    }
    else return null;
  }
  public void set_SubMessage (org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage) {
    if (_SubMessage == null) __SubMessage = null;
    else {
      __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (1);
      add_SubMessage (_SubMessage);
    }
  }
  public void set_SubMessage (java.util.Collection<? extends org.fudgemsg.proto.tests.types.SubMessage[]> _SubMessage) {
    if (_SubMessage == null) __SubMessage = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> (_SubMessage);
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
  }
  public void add_SubMessage (org.fudgemsg.proto.tests.types.SubMessage[] _SubMessage) {
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    if (__SubMessage == null) __SubMessage = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> ();
    _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
    for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
      if (_SubMessage[fudge0] != null) {
      }
    }
    __SubMessage.add (_SubMessage);
  }
  public java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> get_CustomEnum () {
    if (__CustomEnum != null) {
      return java.util.Collections.unmodifiableList (__CustomEnum);
    }
    else return null;
  }
  public void set_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum) {
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (1);
      add_CustomEnum (_CustomEnum);
    }
  }
  public void set_CustomEnum (java.util.Collection<? extends org.fudgemsg.proto.tests.types.CustomEnum[]> _CustomEnum) {
    if (_CustomEnum == null) __CustomEnum = null;
    else {
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge0 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> (_CustomEnum);
      for (java.util.ListIterator<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.proto.tests.types.CustomEnum[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_CustomEnum' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __CustomEnum = fudge0;
    }
  }
  public void add_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum[] _CustomEnum) {
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    if (__CustomEnum == null) __CustomEnum = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> ();
    __CustomEnum.add (java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length));
  }
  public java.util.List<org.fudgemsg.FudgeFieldContainer[]> get_Message () {
    if (__Message != null) {
      return java.util.Collections.unmodifiableList (__Message);
    }
    else return null;
  }
  public void set_Message (org.fudgemsg.FudgeFieldContainer[] _Message) {
    if (_Message == null) __Message = null;
    else {
      __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (1);
      add_Message (_Message);
    }
  }
  public void set_Message (java.util.Collection<? extends org.fudgemsg.FudgeFieldContainer[]> _Message) {
    if (_Message == null) __Message = null;
    else {
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge0 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> (_Message);
      for (java.util.ListIterator<org.fudgemsg.FudgeFieldContainer[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        org.fudgemsg.FudgeFieldContainer[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Message' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Message = fudge0;
    }
  }
  public void add_Message (org.fudgemsg.FudgeFieldContainer[] _Message) {
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    if (__Message == null) __Message = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> ();
    __Message.add (java.util.Arrays.copyOf (_Message, _Message.length));
  }
  public java.util.List<javax.time.calendar.DateProvider[]> get_Date () {
    if (__Date != null) {
      return java.util.Collections.unmodifiableList (__Date);
    }
    else return null;
  }
  public void set_Date (javax.time.calendar.DateProvider[] _Date) {
    if (_Date == null) __Date = null;
    else {
      __Date = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (1);
      add_Date (_Date);
    }
  }
  public void set_Date (java.util.Collection<? extends javax.time.calendar.DateProvider[]> _Date) {
    if (_Date == null) __Date = null;
    else {
      final java.util.List<javax.time.calendar.DateProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> (_Date);
      for (java.util.ListIterator<javax.time.calendar.DateProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Date' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Date = fudge0;
    }
  }
  public void add_Date (javax.time.calendar.DateProvider[] _Date) {
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    if (__Date == null) __Date = new java.util.ArrayList<javax.time.calendar.DateProvider[]> ();
    __Date.add (java.util.Arrays.copyOf (_Date, _Date.length));
  }
  public java.util.List<javax.time.calendar.DateTimeProvider[]> get_DateTime () {
    if (__DateTime != null) {
      return java.util.Collections.unmodifiableList (__DateTime);
    }
    else return null;
  }
  public void set_DateTime (javax.time.calendar.DateTimeProvider[] _DateTime) {
    if (_DateTime == null) __DateTime = null;
    else {
      __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (1);
      add_DateTime (_DateTime);
    }
  }
  public void set_DateTime (java.util.Collection<? extends javax.time.calendar.DateTimeProvider[]> _DateTime) {
    if (_DateTime == null) __DateTime = null;
    else {
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> (_DateTime);
      for (java.util.ListIterator<javax.time.calendar.DateTimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.DateTimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_DateTime' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __DateTime = fudge0;
    }
  }
  public void add_DateTime (javax.time.calendar.DateTimeProvider[] _DateTime) {
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    if (__DateTime == null) __DateTime = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> ();
    __DateTime.add (java.util.Arrays.copyOf (_DateTime, _DateTime.length));
  }
  public java.util.List<javax.time.calendar.TimeProvider[]> get_Time () {
    if (__Time != null) {
      return java.util.Collections.unmodifiableList (__Time);
    }
    else return null;
  }
  public void set_Time (javax.time.calendar.TimeProvider[] _Time) {
    if (_Time == null) __Time = null;
    else {
      __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (1);
      add_Time (_Time);
    }
  }
  public void set_Time (java.util.Collection<? extends javax.time.calendar.TimeProvider[]> _Time) {
    if (_Time == null) __Time = null;
    else {
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge0 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> (_Time);
      for (java.util.ListIterator<javax.time.calendar.TimeProvider[]> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        javax.time.calendar.TimeProvider[] fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of '_Time' cannot be null");
        fudge1.set (java.util.Arrays.copyOf (fudge2, fudge2.length));
      }
      __Time = fudge0;
    }
  }
  public void add_Time (javax.time.calendar.TimeProvider[] _Time) {
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    if (__Time == null) __Time = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> ();
    __Time.add (java.util.Arrays.copyOf (_Time, _Time.length));
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof MutableRATypes_Optional)) return false;
    MutableRATypes_Optional msg = (MutableRATypes_Optional)o;
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
