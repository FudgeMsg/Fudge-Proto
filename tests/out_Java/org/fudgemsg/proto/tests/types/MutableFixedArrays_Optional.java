// Automatically created - do not modify
// Created from types.proto:415(10)
package org.fudgemsg.proto.tests.types;
public class MutableFixedArrays_Optional implements java.io.Serializable {
  private static final long serialVersionUID = -3340035727419015371l;
  private int[] _fixedArray1;
  public static final String FIXEDARRAY1_KEY = "fixedArray1";
  private int[][] _fixedArray2;
  public static final String FIXEDARRAY2_KEY = "fixedArray2";
  private int[][] _fixedArray3;
  public static final String FIXEDARRAY3_KEY = "fixedArray3";
  private int[][] _fixedArray4;
  public static final String FIXEDARRAY4_KEY = "fixedArray4";
  public MutableFixedArrays_Optional () {
  }
  protected MutableFixedArrays_Optional (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FIXEDARRAY1_KEY);
    if (fudgeField != null)  {
      try {
        if (fudgeMsg.getFieldValue (int[].class, fudgeField).length != 42) throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray1' is not integer[42]");
        setFixedArray1 (fudgeMsg.getFieldValue (int[].class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray1' is not integer[42]", e);
      }
    }
    fudgeField = fudgeMsg.getByName (FIXEDARRAY2_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
        final java.util.List<int[]> fudge2 = new java.util.ArrayList<int[]> ();
        for (org.fudgemsg.FudgeField fudge3 : fudge1) {
          try {
            if (fudge1.getFieldValue (int[].class, fudge3).length != 42) throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray2[]' is not integer[42]");
            fudge2.add (fudge1.getFieldValue (int[].class, fudge3));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray2[]' is not integer[42]", e);
          }
        }
        setFixedArray2 (fudge2.toArray (new int[fudge2.size ()][]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray2' is not integer[42][]", e);
      }
    }
    fudgeField = fudgeMsg.getByName (FIXEDARRAY3_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
        final java.util.List<int[]> fudge2 = new java.util.ArrayList<int[]> ();
        for (org.fudgemsg.FudgeField fudge3 : fudge1) {
          try {
            fudge2.add (fudge1.getFieldValue (int[].class, fudge3));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray3[]' is not integer[]", e);
          }
        }
        if (fudge2.size () != 42) throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray3' is not integer[][42]");
        setFixedArray3 (fudge2.toArray (new int[fudge2.size ()][]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray3' is not integer[][42]", e);
      }
    }
    fudgeField = fudgeMsg.getByName (FIXEDARRAY4_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
        final java.util.List<int[]> fudge2 = new java.util.ArrayList<int[]> ();
        for (org.fudgemsg.FudgeField fudge3 : fudge1) {
          try {
            if (fudge1.getFieldValue (int[].class, fudge3).length != 42) throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray4[]' is not integer[42]");
            fudge2.add (fudge1.getFieldValue (int[].class, fudge3));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray4[]' is not integer[42]", e);
          }
        }
        if (fudge2.size () != 42) throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray4' is not integer[42][42]");
        setFixedArray4 (fudge2.toArray (new int[fudge2.size ()][]));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a MutableFixedArrays_Optional - field 'fixedArray4' is not integer[42][42]", e);
      }
    }
  }
  public MutableFixedArrays_Optional (int[] fixedArray1, int[][] fixedArray2, int[][] fixedArray3, int[][] fixedArray4) {
    if (fixedArray1 == null) _fixedArray1 = null;
    else {
      fixedArray1 = java.util.Arrays.copyOf (fixedArray1, fixedArray1.length);
      if (fixedArray1.length != 42) throw new IllegalArgumentException ("'fixedArray1' is not the expected length (42)");
      _fixedArray1 = fixedArray1;
    }
    if (fixedArray2 == null) _fixedArray2 = null;
    else {
      fixedArray2 = java.util.Arrays.copyOf (fixedArray2, fixedArray2.length);
      for (int fudge0 = 0; fudge0 < fixedArray2.length; fudge0++) {
        fixedArray2[fudge0] = java.util.Arrays.copyOf (fixedArray2[fudge0], fixedArray2[fudge0].length);
        if (fixedArray2[fudge0].length != 42) throw new IllegalArgumentException ("'fixedArray2[]' is not the expected length (42)");
      }
      for (int[] fudge0 : fixedArray2) {
        if (fudge0.length != 42) throw new IllegalArgumentException ("'fixedArray2[]' is not the expected length (42)");
      }
      _fixedArray2 = fixedArray2;
    }
    if (fixedArray3 == null) _fixedArray3 = null;
    else {
      fixedArray3 = java.util.Arrays.copyOf (fixedArray3, fixedArray3.length);
      for (int fudge0 = 0; fudge0 < fixedArray3.length; fudge0++) {
        fixedArray3[fudge0] = java.util.Arrays.copyOf (fixedArray3[fudge0], fixedArray3[fudge0].length);
      }
      if (fixedArray3.length != 42) throw new IllegalArgumentException ("'fixedArray3' is not the expected length (42)");
      _fixedArray3 = fixedArray3;
    }
    if (fixedArray4 == null) _fixedArray4 = null;
    else {
      fixedArray4 = java.util.Arrays.copyOf (fixedArray4, fixedArray4.length);
      for (int fudge0 = 0; fudge0 < fixedArray4.length; fudge0++) {
        fixedArray4[fudge0] = java.util.Arrays.copyOf (fixedArray4[fudge0], fixedArray4[fudge0].length);
        if (fixedArray4[fudge0].length != 42) throw new IllegalArgumentException ("'fixedArray4[]' is not the expected length (42)");
      }
      if (fixedArray4.length != 42) throw new IllegalArgumentException ("'fixedArray4' is not the expected length (42)");
      for (int[] fudge0 : fixedArray4) {
        if (fudge0.length != 42) throw new IllegalArgumentException ("'fixedArray4[]' is not the expected length (42)");
      }
      _fixedArray4 = fixedArray4;
    }
  }
  public MutableFixedArrays_Optional (final MutableFixedArrays_Optional source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._fixedArray1 == null) _fixedArray1 = null;
    else {
      _fixedArray1 = java.util.Arrays.copyOf (source._fixedArray1, source._fixedArray1.length);
    }
    if (source._fixedArray2 == null) _fixedArray2 = null;
    else {
      final int[][] fudge0 = java.util.Arrays.copyOf (source._fixedArray2, source._fixedArray2.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      _fixedArray2 = fudge0;
    }
    if (source._fixedArray3 == null) _fixedArray3 = null;
    else {
      final int[][] fudge0 = java.util.Arrays.copyOf (source._fixedArray3, source._fixedArray3.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      _fixedArray3 = fudge0;
    }
    if (source._fixedArray4 == null) _fixedArray4 = null;
    else {
      final int[][] fudge0 = java.util.Arrays.copyOf (source._fixedArray4, source._fixedArray4.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        fudge0[fudge1] = java.util.Arrays.copyOf (fudge0[fudge1], fudge0[fudge1].length);
      }
      _fixedArray4 = fudge0;
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_fixedArray1 != null)  {
      msg.add (FIXEDARRAY1_KEY, null, _fixedArray1);
    }
    if (_fixedArray2 != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (int[] fudge2 : _fixedArray2) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (FIXEDARRAY2_KEY, null, fudge1);
    }
    if (_fixedArray3 != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (int[] fudge2 : _fixedArray3) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (FIXEDARRAY3_KEY, null, fudge1);
    }
    if (_fixedArray4 != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (int[] fudge2 : _fixedArray4) {
        fudge1.add (null, null, fudge2);
      }
      msg.add (FIXEDARRAY4_KEY, null, fudge1);
    }
  }
  public static MutableFixedArrays_Optional fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new MutableFixedArrays_Optional (fudgeMsg);
  }
  public int[] getFixedArray1 () {
    return _fixedArray1;
  }
  public void setFixedArray1 (int[] fixedArray1) {
    if (fixedArray1 == null) _fixedArray1 = null;
    else {
      fixedArray1 = java.util.Arrays.copyOf (fixedArray1, fixedArray1.length);
      if (fixedArray1.length != 42) throw new IllegalArgumentException ("'fixedArray1' is not the expected length (42)");
      _fixedArray1 = fixedArray1;
    }
  }
  public int[][] getFixedArray2 () {
    return _fixedArray2;
  }
  public void setFixedArray2 (int[][] fixedArray2) {
    if (fixedArray2 == null) _fixedArray2 = null;
    else {
      fixedArray2 = java.util.Arrays.copyOf (fixedArray2, fixedArray2.length);
      for (int fudge0 = 0; fudge0 < fixedArray2.length; fudge0++) {
        fixedArray2[fudge0] = java.util.Arrays.copyOf (fixedArray2[fudge0], fixedArray2[fudge0].length);
        if (fixedArray2[fudge0].length != 42) throw new IllegalArgumentException ("'fixedArray2[]' is not the expected length (42)");
      }
      for (int[] fudge0 : fixedArray2) {
        if (fudge0.length != 42) throw new IllegalArgumentException ("'fixedArray2[]' is not the expected length (42)");
      }
      _fixedArray2 = fixedArray2;
    }
  }
  public int[][] getFixedArray3 () {
    return _fixedArray3;
  }
  public void setFixedArray3 (int[][] fixedArray3) {
    if (fixedArray3 == null) _fixedArray3 = null;
    else {
      fixedArray3 = java.util.Arrays.copyOf (fixedArray3, fixedArray3.length);
      for (int fudge0 = 0; fudge0 < fixedArray3.length; fudge0++) {
        fixedArray3[fudge0] = java.util.Arrays.copyOf (fixedArray3[fudge0], fixedArray3[fudge0].length);
      }
      if (fixedArray3.length != 42) throw new IllegalArgumentException ("'fixedArray3' is not the expected length (42)");
      _fixedArray3 = fixedArray3;
    }
  }
  public int[][] getFixedArray4 () {
    return _fixedArray4;
  }
  public void setFixedArray4 (int[][] fixedArray4) {
    if (fixedArray4 == null) _fixedArray4 = null;
    else {
      fixedArray4 = java.util.Arrays.copyOf (fixedArray4, fixedArray4.length);
      for (int fudge0 = 0; fudge0 < fixedArray4.length; fudge0++) {
        fixedArray4[fudge0] = java.util.Arrays.copyOf (fixedArray4[fudge0], fixedArray4[fudge0].length);
        if (fixedArray4[fudge0].length != 42) throw new IllegalArgumentException ("'fixedArray4[]' is not the expected length (42)");
      }
      if (fixedArray4.length != 42) throw new IllegalArgumentException ("'fixedArray4' is not the expected length (42)");
      for (int[] fudge0 : fixedArray4) {
        if (fudge0.length != 42) throw new IllegalArgumentException ("'fixedArray4[]' is not the expected length (42)");
      }
      _fixedArray4 = fixedArray4;
    }
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof MutableFixedArrays_Optional)) return false;
    MutableFixedArrays_Optional msg = (MutableFixedArrays_Optional)o;
    if (!java.util.Arrays.equals (_fixedArray1, msg._fixedArray1)) return false;
    if (!java.util.Arrays.deepEquals (_fixedArray2, msg._fixedArray2)) return false;
    if (!java.util.Arrays.deepEquals (_fixedArray3, msg._fixedArray3)) return false;
    if (!java.util.Arrays.deepEquals (_fixedArray4, msg._fixedArray4)) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_fixedArray1 != null)hc += java.util.Arrays.hashCode (_fixedArray1);
    hc *= 31;
    if (_fixedArray2 != null)hc += java.util.Arrays.deepHashCode (_fixedArray2);
    hc *= 31;
    if (_fixedArray3 != null)hc += java.util.Arrays.deepHashCode (_fixedArray3);
    hc *= 31;
    if (_fixedArray4 != null)hc += java.util.Arrays.deepHashCode (_fixedArray4);
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
