// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:378(10)
package org.fudgemsg.proto.tests.types;
public class MutableAATypes_Required implements java.io.Serializable, AATypesBase {
  private static final long serialVersionUID = -4467558730677445862l;
  private boolean[][] __Bool;
  public static final String _BOOL_KEY = "_Bool";
  private byte[][] __Byte;
  public static final String _BYTE_KEY = "_Byte";
  private double[][] __Double;
  public static final String _DOUBLE_KEY = "_Double";
  private float[][] __Float;
  public static final String _FLOAT_KEY = "_Float";
  private boolean[][] __Indicator;
  public static final String _INDICATOR_KEY = "_Indicator";
  private int[][] __Int;
  public static final String _INT_KEY = "_Int";
  private long[][] __Long;
  public static final String _LONG_KEY = "_Long";
  private short[][] __Short;
  public static final String _SHORT_KEY = "_Short";
  private String[][] __String;
  public static final String _STRING_KEY = "_String";
  private org.fudgemsg.proto.tests.types.SubMessage[][] __SubMessage;
  public static final String _SUBMESSAGE_KEY = "_SubMessage";
  private org.fudgemsg.proto.tests.types.CustomEnum[][] __CustomEnum;
  public static final String _CUSTOMENUM_KEY = "_CustomEnum";
  private org.fudgemsg.FudgeFieldContainer[][] __Message;
  public static final String _MESSAGE_KEY = "_Message";
  private javax.time.calendar.DateProvider[][] __Date;
  public static final String _DATE_KEY = "_Date";
  private javax.time.calendar.DateTimeProvider[][] __DateTime;
  public static final String _DATETIME_KEY = "_DateTime";
  private javax.time.calendar.TimeProvider[][] __Time;
  public static final String _TIME_KEY = "_Time";
  public MutableAATypes_Required (boolean[][] _Bool, byte[][] _Byte, double[][] _Double, float[][] _Float, boolean[][] _Indicator, int[][] _Int, long[][] _Long, short[][] _Short, String[][] _String, org.fudgemsg.proto.tests.types.SubMessage[][] _SubMessage, org.fudgemsg.proto.tests.types.CustomEnum[][] _CustomEnum, org.fudgemsg.FudgeFieldContainer[][] _Message, javax.time.calendar.DateProvider[][] _Date, javax.time.calendar.DateTimeProvider[][] _DateTime, javax.time.calendar.TimeProvider[][] _Time) {
    if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
    else {
      _Bool = java.util.Arrays.copyOf (_Bool, _Bool.length);
      for (int fudge0 = 0; fudge0 < _Bool.length; fudge0++) {
        _Bool[fudge0] = java.util.Arrays.copyOf (_Bool[fudge0], _Bool[fudge0].length);
      }
      __Bool = _Bool;
    }
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      _Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
      for (int fudge0 = 0; fudge0 < _Byte.length; fudge0++) {
        _Byte[fudge0] = java.util.Arrays.copyOf (_Byte[fudge0], _Byte[fudge0].length);
      }
      __Byte = _Byte;
    }
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      _Double = java.util.Arrays.copyOf (_Double, _Double.length);
      for (int fudge0 = 0; fudge0 < _Double.length; fudge0++) {
        _Double[fudge0] = java.util.Arrays.copyOf (_Double[fudge0], _Double[fudge0].length);
      }
      __Double = _Double;
    }
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      _Float = java.util.Arrays.copyOf (_Float, _Float.length);
      for (int fudge0 = 0; fudge0 < _Float.length; fudge0++) {
        _Float[fudge0] = java.util.Arrays.copyOf (_Float[fudge0], _Float[fudge0].length);
      }
      __Float = _Float;
    }
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      _Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
      for (int fudge0 = 0; fudge0 < _Indicator.length; fudge0++) {
        _Indicator[fudge0] = java.util.Arrays.copyOf (_Indicator[fudge0], _Indicator[fudge0].length);
      }
      __Indicator = _Indicator;
    }
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      _Int = java.util.Arrays.copyOf (_Int, _Int.length);
      for (int fudge0 = 0; fudge0 < _Int.length; fudge0++) {
        _Int[fudge0] = java.util.Arrays.copyOf (_Int[fudge0], _Int[fudge0].length);
      }
      __Int = _Int;
    }
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      _Long = java.util.Arrays.copyOf (_Long, _Long.length);
      for (int fudge0 = 0; fudge0 < _Long.length; fudge0++) {
        _Long[fudge0] = java.util.Arrays.copyOf (_Long[fudge0], _Long[fudge0].length);
      }
      __Long = _Long;
    }
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      _Short = java.util.Arrays.copyOf (_Short, _Short.length);
      for (int fudge0 = 0; fudge0 < _Short.length; fudge0++) {
        _Short[fudge0] = java.util.Arrays.copyOf (_Short[fudge0], _Short[fudge0].length);
      }
      __Short = _Short;
    }
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      _String = java.util.Arrays.copyOf (_String, _String.length);
      for (int fudge0 = 0; fudge0 < _String.length; fudge0++) {
        _String[fudge0] = java.util.Arrays.copyOf (_String[fudge0], _String[fudge0].length);
      }
      __String = _String;
    }
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
      for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
        _SubMessage[fudge0] = java.util.Arrays.copyOf (_SubMessage[fudge0], _SubMessage[fudge0].length);
        for (int fudge1 = 0; fudge1 < _SubMessage[fudge0].length; fudge1++) {
        }
      }
      __SubMessage = _SubMessage;
    }
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      _CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
      for (int fudge0 = 0; fudge0 < _CustomEnum.length; fudge0++) {
        _CustomEnum[fudge0] = java.util.Arrays.copyOf (_CustomEnum[fudge0], _CustomEnum[fudge0].length);
      }
      __CustomEnum = _CustomEnum;
    }
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      _Message = java.util.Arrays.copyOf (_Message, _Message.length);
      for (int fudge0 = 0; fudge0 < _Message.length; fudge0++) {
        _Message[fudge0] = java.util.Arrays.copyOf (_Message[fudge0], _Message[fudge0].length);
      }
      __Message = _Message;
    }
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      _Date = java.util.Arrays.copyOf (_Date, _Date.length);
      for (int fudge0 = 0; fudge0 < _Date.length; fudge0++) {
        _Date[fudge0] = java.util.Arrays.copyOf (_Date[fudge0], _Date[fudge0].length);
      }
      __Date = _Date;
    }
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      _DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
      for (int fudge0 = 0; fudge0 < _DateTime.length; fudge0++) {
        _DateTime[fudge0] = java.util.Arrays.copyOf (_DateTime[fudge0], _DateTime[fudge0].length);
      }
      __DateTime = _DateTime;
    }
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      _Time = java.util.Arrays.copyOf (_Time, _Time.length);
      for (int fudge0 = 0; fudge0 < _Time.length; fudge0++) {
        _Time[fudge0] = java.util.Arrays.copyOf (_Time[fudge0], _Time[fudge0].length);
      }
      __Time = _Time;
    }
  }
  protected MutableAATypes_Required (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (_BOOL_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Bool' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<boolean[]> fudge2 = new java.util.ArrayList<boolean[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<Boolean> fudge5 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              fudge5.add (fudge4.getFieldValue (Boolean.class, fudge6));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Bool[][]' is not boolean", e);
            }
          }
          final boolean[] fudge7 = new boolean[fudge5.size ()];
          int fudge8 = 0;
          for (boolean fudge9 : fudge5) {
            fudge7[fudge8++] = fudge9;
          }
          fudge2.add (fudge7);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Bool[]' is not boolean[]", e);
        }
      }
      __Bool = fudge2.toArray (new boolean[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Bool' is not boolean[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_BYTE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Byte' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<byte[]> fudge2 = new java.util.ArrayList<byte[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (byte[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Byte[]' is not byte[]", e);
        }
      }
      __Byte = fudge2.toArray (new byte[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Byte' is not byte[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_DOUBLE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Double' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<double[]> fudge2 = new java.util.ArrayList<double[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (double[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Double[]' is not double[]", e);
        }
      }
      __Double = fudge2.toArray (new double[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Double' is not double[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_FLOAT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Float' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<float[]> fudge2 = new java.util.ArrayList<float[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (float[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Float[]' is not float[]", e);
        }
      }
      __Float = fudge2.toArray (new float[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Float' is not float[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_INDICATOR_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Indicator' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<boolean[]> fudge2 = new java.util.ArrayList<boolean[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<Boolean> fudge5 = new java.util.ArrayList<Boolean> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            fudge5.add (fudge6.getValue () != null);
          }
          final boolean[] fudge7 = new boolean[fudge5.size ()];
          int fudge8 = 0;
          for (boolean fudge9 : fudge5) {
            fudge7[fudge8++] = fudge9;
          }
          fudge2.add (fudge7);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Indicator[]' is not indicator[]", e);
        }
      }
      __Indicator = fudge2.toArray (new boolean[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Indicator' is not indicator[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_INT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Int' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<int[]> fudge2 = new java.util.ArrayList<int[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (int[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Int[]' is not integer[]", e);
        }
      }
      __Int = fudge2.toArray (new int[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Int' is not integer[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_LONG_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Long' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<long[]> fudge2 = new java.util.ArrayList<long[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (long[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Long[]' is not long[]", e);
        }
      }
      __Long = fudge2.toArray (new long[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Long' is not long[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_SHORT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Short' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<short[]> fudge2 = new java.util.ArrayList<short[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          fudge2.add (fudge1.getFieldValue (short[].class, fudge3));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Short[]' is not short[]", e);
        }
      }
      __Short = fudge2.toArray (new short[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Short' is not short[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_STRING_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_String' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<String[]> fudge2 = new java.util.ArrayList<String[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<String> fudge5 = new java.util.ArrayList<String> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              fudge5.add (fudge6.getValue ().toString ());
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_String[][]' is not string", e);
            }
          }
          fudge2.add (fudge5.toArray (new String[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_String[]' is not string[]", e);
        }
      }
      __String = fudge2.toArray (new String[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_String' is not string[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_SUBMESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_SubMessage' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<org.fudgemsg.proto.tests.types.SubMessage[]> fudge2 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<org.fudgemsg.proto.tests.types.SubMessage> fudge5 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.SubMessage> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              final org.fudgemsg.proto.tests.types.SubMessage fudge7;
              fudge7 = org.fudgemsg.proto.tests.types.SubMessage.fromFudgeMsg (fudge4.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge6));
              fudge5.add (fudge7);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_SubMessage[][]' is not SubMessage message", e);
            }
          }
          fudge2.add (fudge5.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_SubMessage[]' is not SubMessage message[]", e);
        }
      }
      __SubMessage = fudge2.toArray (new org.fudgemsg.proto.tests.types.SubMessage[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_SubMessage' is not SubMessage message[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_CUSTOMENUM_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_CustomEnum' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum[]> fudge2 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<org.fudgemsg.proto.tests.types.CustomEnum> fudge5 = new java.util.ArrayList<org.fudgemsg.proto.tests.types.CustomEnum> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              final org.fudgemsg.proto.tests.types.CustomEnum fudge7;
              fudge7 = fudge4.getFieldValue (org.fudgemsg.proto.tests.types.CustomEnum.class, fudge6);
              fudge5.add (fudge7);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_CustomEnum[][]' is not CustomEnum enum", e);
            }
          }
          fudge2.add (fudge5.toArray (new org.fudgemsg.proto.tests.types.CustomEnum[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_CustomEnum[]' is not CustomEnum enum[]", e);
        }
      }
      __CustomEnum = fudge2.toArray (new org.fudgemsg.proto.tests.types.CustomEnum[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_CustomEnum' is not CustomEnum enum[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_MESSAGE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Message' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<org.fudgemsg.FudgeFieldContainer[]> fudge2 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<org.fudgemsg.FudgeFieldContainer> fudge5 = new java.util.ArrayList<org.fudgemsg.FudgeFieldContainer> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              final org.fudgemsg.FudgeFieldContainer fudge7;
              fudge7 = fudge4.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge6);
              fudge5.add (fudge7);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Message[][]' is not anonymous/unknown message", e);
            }
          }
          fudge2.add (fudge5.toArray (new org.fudgemsg.FudgeFieldContainer[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Message[]' is not anonymous/unknown message[]", e);
        }
      }
      __Message = fudge2.toArray (new org.fudgemsg.FudgeFieldContainer[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Message' is not anonymous/unknown message[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_DATE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Date' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<javax.time.calendar.DateProvider[]> fudge2 = new java.util.ArrayList<javax.time.calendar.DateProvider[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<javax.time.calendar.DateProvider> fudge5 = new java.util.ArrayList<javax.time.calendar.DateProvider> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              fudge5.add (fudge4.getFieldValue (javax.time.calendar.DateProvider.class, fudge6));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Date[][]' is not date", e);
            }
          }
          fudge2.add (fudge5.toArray (new javax.time.calendar.DateProvider[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Date[]' is not date[]", e);
        }
      }
      __Date = fudge2.toArray (new javax.time.calendar.DateProvider[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Date' is not date[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_DATETIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_DateTime' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<javax.time.calendar.DateTimeProvider[]> fudge2 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<javax.time.calendar.DateTimeProvider> fudge5 = new java.util.ArrayList<javax.time.calendar.DateTimeProvider> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              fudge5.add (fudge4.getFieldValue (javax.time.calendar.DateTimeProvider.class, fudge6));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_DateTime[][]' is not datetime", e);
            }
          }
          fudge2.add (fudge5.toArray (new javax.time.calendar.DateTimeProvider[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_DateTime[]' is not datetime[]", e);
        }
      }
      __DateTime = fudge2.toArray (new javax.time.calendar.DateTimeProvider[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_DateTime' is not datetime[][]", e);
    }
    fudgeField = fudgeMsg.getByName (_TIME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Time' is not present");
    try {
      final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
      final java.util.List<javax.time.calendar.TimeProvider[]> fudge2 = new java.util.ArrayList<javax.time.calendar.TimeProvider[]> ();
      for (org.fudgemsg.FudgeField fudge3 : fudge1) {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge4 = fudge1.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge3);
          final java.util.List<javax.time.calendar.TimeProvider> fudge5 = new java.util.ArrayList<javax.time.calendar.TimeProvider> ();
          for (org.fudgemsg.FudgeField fudge6 : fudge4) {
            try {
              fudge5.add (fudge4.getFieldValue (javax.time.calendar.TimeProvider.class, fudge6));
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Time[][]' is not time", e);
            }
          }
          fudge2.add (fudge5.toArray (new javax.time.calendar.TimeProvider[fudge5.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Time[]' is not time[]", e);
        }
      }
      __Time = fudge2.toArray (new javax.time.calendar.TimeProvider[fudge2.size ()][]);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a MutableAATypes_Required - field '_Time' is not time[][]", e);
    }
  }
  protected MutableAATypes_Required (final MutableAATypes_Required source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source.__Bool == null) __Bool = null;
    else {
      final boolean[][] fudge0 = java.util.Arrays.copyOf (source.__Bool, source.__Bool.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Bool = fudge0;
    }
    if (source.__Byte == null) __Byte = null;
    else {
      final byte[][] fudge0 = java.util.Arrays.copyOf (source.__Byte, source.__Byte.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Byte = fudge0;
    }
    if (source.__Double == null) __Double = null;
    else {
      final double[][] fudge0 = java.util.Arrays.copyOf (source.__Double, source.__Double.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Double = fudge0;
    }
    if (source.__Float == null) __Float = null;
    else {
      final float[][] fudge0 = java.util.Arrays.copyOf (source.__Float, source.__Float.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Float = fudge0;
    }
    if (source.__Indicator == null) __Indicator = null;
    else {
      final boolean[][] fudge0 = java.util.Arrays.copyOf (source.__Indicator, source.__Indicator.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Indicator = fudge0;
    }
    if (source.__Int == null) __Int = null;
    else {
      final int[][] fudge0 = java.util.Arrays.copyOf (source.__Int, source.__Int.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Int = fudge0;
    }
    if (source.__Long == null) __Long = null;
    else {
      final long[][] fudge0 = java.util.Arrays.copyOf (source.__Long, source.__Long.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Long = fudge0;
    }
    if (source.__Short == null) __Short = null;
    else {
      final short[][] fudge0 = java.util.Arrays.copyOf (source.__Short, source.__Short.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Short = fudge0;
    }
    if (source.__String == null) __String = null;
    else {
      final String[][] fudge0 = java.util.Arrays.copyOf (source.__String, source.__String.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __String = fudge0;
    }
    if (source.__SubMessage == null) __SubMessage = null;
    else {
      final org.fudgemsg.proto.tests.types.SubMessage[][] fudge0 = java.util.Arrays.copyOf (source.__SubMessage, source.__SubMessage.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
        for (int fudge2 = 0; fudge2 < fudge0[fudge1].length; fudge2++) {
        }
      }
      __SubMessage = fudge0;
    }
    if (source.__CustomEnum == null) __CustomEnum = null;
    else {
      final org.fudgemsg.proto.tests.types.CustomEnum[][] fudge0 = java.util.Arrays.copyOf (source.__CustomEnum, source.__CustomEnum.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __CustomEnum = fudge0;
    }
    if (source.__Message == null) __Message = null;
    else {
      final org.fudgemsg.FudgeFieldContainer[][] fudge0 = java.util.Arrays.copyOf (source.__Message, source.__Message.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Message = fudge0;
    }
    if (source.__Date == null) __Date = null;
    else {
      final javax.time.calendar.DateProvider[][] fudge0 = java.util.Arrays.copyOf (source.__Date, source.__Date.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Date = fudge0;
    }
    if (source.__DateTime == null) __DateTime = null;
    else {
      final javax.time.calendar.DateTimeProvider[][] fudge0 = java.util.Arrays.copyOf (source.__DateTime, source.__DateTime.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __DateTime = fudge0;
    }
    if (source.__Time == null) __Time = null;
    else {
      final javax.time.calendar.TimeProvider[][] fudge0 = java.util.Arrays.copyOf (source.__Time, source.__Time.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      __Time = fudge0;
    }
  }
  public MutableAATypes_Required clone () {
    return new MutableAATypes_Required (this);
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
      for (boolean[] fudge2 : __Bool) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (boolean fudge4 : fudge2) {
          fudge3.add (null, null, fudge4);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_BOOL_KEY, null, fudge1);
    }
    if (__Byte != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (byte[] fudge2 : __Byte) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_BYTE_KEY, null, fudge1);
    }
    if (__Double != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (double[] fudge2 : __Double) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_DOUBLE_KEY, null, fudge1);
    }
    if (__Float != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (float[] fudge2 : __Float) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_FLOAT_KEY, null, fudge1);
    }
    if (__Indicator != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (boolean[] fudge2 : __Indicator) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (boolean fudge4 : fudge2) {
          if (fudge4) fudge3.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_INDICATOR_KEY, null, fudge1);
    }
    if (__Int != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (int[] fudge2 : __Int) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_INT_KEY, null, fudge1);
    }
    if (__Long != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (long[] fudge2 : __Long) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_LONG_KEY, null, fudge1);
    }
    if (__Short != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (short[] fudge2 : __Short) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (_SHORT_KEY, null, fudge1);
    }
    if (__String != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (String[] fudge2 : __String) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (String fudge4 : fudge2) {
          fudge3.add (null, null, fudge4);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_STRING_KEY, null, fudge1);
    }
    if (__SubMessage != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.proto.tests.types.SubMessage[] fudge2 : __SubMessage) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (org.fudgemsg.proto.tests.types.SubMessage fudge4 : fudge2) {
          final org.fudgemsg.MutableFudgeFieldContainer fudge5 = fudgeContext.newMessage ();
          Class<?> fudge6 = fudge4.getClass ();
          while (!org.fudgemsg.proto.tests.types.SubMessage.class.equals (fudge6)) {
            fudge5.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge6.getName ());
            fudge6 = fudge6.getSuperclass ();
          }
          fudge4.toFudgeMsg (fudgeContext, fudge5);
          fudge3.add (null, null, fudge5);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_SUBMESSAGE_KEY, null, fudge1);
    }
    if (__CustomEnum != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.proto.tests.types.CustomEnum[] fudge2 : __CustomEnum) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (org.fudgemsg.proto.tests.types.CustomEnum fudge4 : fudge2) {
          fudge3.add (null, null, fudge4.name ());
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_CUSTOMENUM_KEY, null, fudge1);
    }
    if (__Message != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.FudgeFieldContainer[] fudge2 : __Message) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (org.fudgemsg.FudgeFieldContainer fudge4 : fudge2) {
          fudge3.add (null, null, fudgeContext.newMessage (fudge4));
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_MESSAGE_KEY, null, fudge1);
    }
    if (__Date != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.DateProvider[] fudge2 : __Date) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (javax.time.calendar.DateProvider fudge4 : fudge2) {
          fudge3.add (null, null, fudge4);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_DATE_KEY, null, fudge1);
    }
    if (__DateTime != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.DateTimeProvider[] fudge2 : __DateTime) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (javax.time.calendar.DateTimeProvider fudge4 : fudge2) {
          fudge3.add (null, null, fudge4);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_DATETIME_KEY, null, fudge1);
    }
    if (__Time != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (javax.time.calendar.TimeProvider[] fudge2 : __Time) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge3 = fudgeContext.newMessage ();
        for (javax.time.calendar.TimeProvider fudge4 : fudge2) {
          fudge3.add (null, null, fudge4);
        }
        fudge1.add (null, null, fudge3);
      }
      msg.add (_TIME_KEY, null, fudge1);
    }
  }
  public static MutableAATypes_Required fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.MutableAATypes_Required".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.MutableAATypes_Required)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new MutableAATypes_Required (fudgeMsg);
  }
  public boolean[][] get_Bool () {
    return __Bool;
  }
  public void set_Bool (boolean[][] _Bool) {
    if (_Bool == null) throw new NullPointerException ("'_Bool' cannot be null");
    else {
      _Bool = java.util.Arrays.copyOf (_Bool, _Bool.length);
      for (int fudge0 = 0; fudge0 < _Bool.length; fudge0++) {
        _Bool[fudge0] = java.util.Arrays.copyOf (_Bool[fudge0], _Bool[fudge0].length);
      }
      __Bool = _Bool;
    }
  }
  public byte[][] get_Byte () {
    return __Byte;
  }
  public void set_Byte (byte[][] _Byte) {
    if (_Byte == null) throw new NullPointerException ("'_Byte' cannot be null");
    else {
      _Byte = java.util.Arrays.copyOf (_Byte, _Byte.length);
      for (int fudge0 = 0; fudge0 < _Byte.length; fudge0++) {
        _Byte[fudge0] = java.util.Arrays.copyOf (_Byte[fudge0], _Byte[fudge0].length);
      }
      __Byte = _Byte;
    }
  }
  public double[][] get_Double () {
    return __Double;
  }
  public void set_Double (double[][] _Double) {
    if (_Double == null) throw new NullPointerException ("'_Double' cannot be null");
    else {
      _Double = java.util.Arrays.copyOf (_Double, _Double.length);
      for (int fudge0 = 0; fudge0 < _Double.length; fudge0++) {
        _Double[fudge0] = java.util.Arrays.copyOf (_Double[fudge0], _Double[fudge0].length);
      }
      __Double = _Double;
    }
  }
  public float[][] get_Float () {
    return __Float;
  }
  public void set_Float (float[][] _Float) {
    if (_Float == null) throw new NullPointerException ("'_Float' cannot be null");
    else {
      _Float = java.util.Arrays.copyOf (_Float, _Float.length);
      for (int fudge0 = 0; fudge0 < _Float.length; fudge0++) {
        _Float[fudge0] = java.util.Arrays.copyOf (_Float[fudge0], _Float[fudge0].length);
      }
      __Float = _Float;
    }
  }
  public boolean[][] get_Indicator () {
    return __Indicator;
  }
  public void set_Indicator (boolean[][] _Indicator) {
    if (_Indicator == null) throw new NullPointerException ("'_Indicator' cannot be null");
    else {
      _Indicator = java.util.Arrays.copyOf (_Indicator, _Indicator.length);
      for (int fudge0 = 0; fudge0 < _Indicator.length; fudge0++) {
        _Indicator[fudge0] = java.util.Arrays.copyOf (_Indicator[fudge0], _Indicator[fudge0].length);
      }
      __Indicator = _Indicator;
    }
  }
  public int[][] get_Int () {
    return __Int;
  }
  public void set_Int (int[][] _Int) {
    if (_Int == null) throw new NullPointerException ("'_Int' cannot be null");
    else {
      _Int = java.util.Arrays.copyOf (_Int, _Int.length);
      for (int fudge0 = 0; fudge0 < _Int.length; fudge0++) {
        _Int[fudge0] = java.util.Arrays.copyOf (_Int[fudge0], _Int[fudge0].length);
      }
      __Int = _Int;
    }
  }
  public long[][] get_Long () {
    return __Long;
  }
  public void set_Long (long[][] _Long) {
    if (_Long == null) throw new NullPointerException ("'_Long' cannot be null");
    else {
      _Long = java.util.Arrays.copyOf (_Long, _Long.length);
      for (int fudge0 = 0; fudge0 < _Long.length; fudge0++) {
        _Long[fudge0] = java.util.Arrays.copyOf (_Long[fudge0], _Long[fudge0].length);
      }
      __Long = _Long;
    }
  }
  public short[][] get_Short () {
    return __Short;
  }
  public void set_Short (short[][] _Short) {
    if (_Short == null) throw new NullPointerException ("'_Short' cannot be null");
    else {
      _Short = java.util.Arrays.copyOf (_Short, _Short.length);
      for (int fudge0 = 0; fudge0 < _Short.length; fudge0++) {
        _Short[fudge0] = java.util.Arrays.copyOf (_Short[fudge0], _Short[fudge0].length);
      }
      __Short = _Short;
    }
  }
  public String[][] get_String () {
    return __String;
  }
  public void set_String (String[][] _String) {
    if (_String == null) throw new NullPointerException ("'_String' cannot be null");
    else {
      _String = java.util.Arrays.copyOf (_String, _String.length);
      for (int fudge0 = 0; fudge0 < _String.length; fudge0++) {
        _String[fudge0] = java.util.Arrays.copyOf (_String[fudge0], _String[fudge0].length);
      }
      __String = _String;
    }
  }
  public org.fudgemsg.proto.tests.types.SubMessage[][] get_SubMessage () {
    return __SubMessage;
  }
  public void set_SubMessage (org.fudgemsg.proto.tests.types.SubMessage[][] _SubMessage) {
    if (_SubMessage == null) throw new NullPointerException ("'_SubMessage' cannot be null");
    else {
      _SubMessage = java.util.Arrays.copyOf (_SubMessage, _SubMessage.length);
      for (int fudge0 = 0; fudge0 < _SubMessage.length; fudge0++) {
        _SubMessage[fudge0] = java.util.Arrays.copyOf (_SubMessage[fudge0], _SubMessage[fudge0].length);
        for (int fudge1 = 0; fudge1 < _SubMessage[fudge0].length; fudge1++) {
        }
      }
      __SubMessage = _SubMessage;
    }
  }
  public org.fudgemsg.proto.tests.types.CustomEnum[][] get_CustomEnum () {
    return __CustomEnum;
  }
  public void set_CustomEnum (org.fudgemsg.proto.tests.types.CustomEnum[][] _CustomEnum) {
    if (_CustomEnum == null) throw new NullPointerException ("'_CustomEnum' cannot be null");
    else {
      _CustomEnum = java.util.Arrays.copyOf (_CustomEnum, _CustomEnum.length);
      for (int fudge0 = 0; fudge0 < _CustomEnum.length; fudge0++) {
        _CustomEnum[fudge0] = java.util.Arrays.copyOf (_CustomEnum[fudge0], _CustomEnum[fudge0].length);
      }
      __CustomEnum = _CustomEnum;
    }
  }
  public org.fudgemsg.FudgeFieldContainer[][] get_Message () {
    return __Message;
  }
  public void set_Message (org.fudgemsg.FudgeFieldContainer[][] _Message) {
    if (_Message == null) throw new NullPointerException ("'_Message' cannot be null");
    else {
      _Message = java.util.Arrays.copyOf (_Message, _Message.length);
      for (int fudge0 = 0; fudge0 < _Message.length; fudge0++) {
        _Message[fudge0] = java.util.Arrays.copyOf (_Message[fudge0], _Message[fudge0].length);
      }
      __Message = _Message;
    }
  }
  public javax.time.calendar.DateProvider[][] get_Date () {
    return __Date;
  }
  public void set_Date (javax.time.calendar.DateProvider[][] _Date) {
    if (_Date == null) throw new NullPointerException ("'_Date' cannot be null");
    else {
      _Date = java.util.Arrays.copyOf (_Date, _Date.length);
      for (int fudge0 = 0; fudge0 < _Date.length; fudge0++) {
        _Date[fudge0] = java.util.Arrays.copyOf (_Date[fudge0], _Date[fudge0].length);
      }
      __Date = _Date;
    }
  }
  public javax.time.calendar.DateTimeProvider[][] get_DateTime () {
    return __DateTime;
  }
  public void set_DateTime (javax.time.calendar.DateTimeProvider[][] _DateTime) {
    if (_DateTime == null) throw new NullPointerException ("'_DateTime' cannot be null");
    else {
      _DateTime = java.util.Arrays.copyOf (_DateTime, _DateTime.length);
      for (int fudge0 = 0; fudge0 < _DateTime.length; fudge0++) {
        _DateTime[fudge0] = java.util.Arrays.copyOf (_DateTime[fudge0], _DateTime[fudge0].length);
      }
      __DateTime = _DateTime;
    }
  }
  public javax.time.calendar.TimeProvider[][] get_Time () {
    return __Time;
  }
  public void set_Time (javax.time.calendar.TimeProvider[][] _Time) {
    if (_Time == null) throw new NullPointerException ("'_Time' cannot be null");
    else {
      _Time = java.util.Arrays.copyOf (_Time, _Time.length);
      for (int fudge0 = 0; fudge0 < _Time.length; fudge0++) {
        _Time[fudge0] = java.util.Arrays.copyOf (_Time[fudge0], _Time[fudge0].length);
      }
      __Time = _Time;
    }
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof MutableAATypes_Required)) return false;
    MutableAATypes_Required msg = (MutableAATypes_Required)o;
    if (!java.util.Arrays.deepEquals (__Bool, msg.__Bool)) return false;
    if (!java.util.Arrays.deepEquals (__Byte, msg.__Byte)) return false;
    if (!java.util.Arrays.deepEquals (__Double, msg.__Double)) return false;
    if (!java.util.Arrays.deepEquals (__Float, msg.__Float)) return false;
    if (!java.util.Arrays.deepEquals (__Indicator, msg.__Indicator)) return false;
    if (!java.util.Arrays.deepEquals (__Int, msg.__Int)) return false;
    if (!java.util.Arrays.deepEquals (__Long, msg.__Long)) return false;
    if (!java.util.Arrays.deepEquals (__Short, msg.__Short)) return false;
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
    if (__Bool != null)hc += java.util.Arrays.deepHashCode (__Bool);
    hc *= 31;
    if (__Byte != null)hc += java.util.Arrays.deepHashCode (__Byte);
    hc *= 31;
    if (__Double != null)hc += java.util.Arrays.deepHashCode (__Double);
    hc *= 31;
    if (__Float != null)hc += java.util.Arrays.deepHashCode (__Float);
    hc *= 31;
    if (__Indicator != null)hc += java.util.Arrays.deepHashCode (__Indicator);
    hc *= 31;
    if (__Int != null)hc += java.util.Arrays.deepHashCode (__Int);
    hc *= 31;
    if (__Long != null)hc += java.util.Arrays.deepHashCode (__Long);
    hc *= 31;
    if (__Short != null)hc += java.util.Arrays.deepHashCode (__Short);
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
