// Automatically created - do not modify
// Created from types.proto:5(10)
package org.fudgemsg.proto.tests.types;
public class SubMessage implements java.io.Serializable {
  private static final long serialVersionUID = -1703705403l;
  private final int _i;
  public static final String I_KEY = "i";
  private final String _s;
  public static final String S_KEY = "s";
  public SubMessage (int i, String s) {
    _i = i;
    if (s == null) throw new NullPointerException ("s' cannot be null");
    _s = s;
  }
  protected SubMessage (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (I_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'i' is not present");
    try {
      _i = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'i' is not integer", e);
    }
    fudgeField = fudgeMsg.getByName (S_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 's' is not present");
    try {
      _s = fudgeField.getValue ().toString ();
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 's' is not string", e);
    }
  }
  protected SubMessage (final SubMessage source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _i = source._i;
    _s = source._s;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (I_KEY, null, _i);
    if (_s != null)  {
      msg.add (S_KEY, null, _s);
    }
  }
  public static SubMessage fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new SubMessage (fudgeMsg);
  }
  public int getI () {
    return _i;
  }
  public String getS () {
    return _s;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof SubMessage)) return false;
    SubMessage msg = (SubMessage)o;
    if (_i != msg._i) return false;
    if (_s != null) {
      if (msg._s != null) {
        if (!_s.equals (msg._s)) return false;
      }
      else return false;
    }
    else if (msg._s != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_i;
    hc *= 31;
    if (_s != null) hc += _s.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
