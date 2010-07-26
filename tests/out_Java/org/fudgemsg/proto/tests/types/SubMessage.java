// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from types.proto:5(10)
package org.fudgemsg.proto.tests.types;
public class SubMessage implements java.io.Serializable {
  private static final long serialVersionUID = -26247296095l;
  private final int _int;
  public static final String INT_KEY = "int";
  private final String _string;
  public static final String STRING_KEY = "string";
  public SubMessage (int intValue, String string) {
    _int = intValue;
    if (string == null) throw new NullPointerException ("string' cannot be null");
    _string = string;
  }
  protected SubMessage (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (INT_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'int' is not present");
    try {
      _int = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'int' is not integer", e);
    }
    fudgeField = fudgeMsg.getByName (STRING_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'string' is not present");
    try {
      _string = fudgeField.getValue ().toString ();
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SubMessage - field 'string' is not string", e);
    }
  }
  protected SubMessage (final SubMessage source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _int = source._int;
    _string = source._string;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (INT_KEY, null, _int);
    if (_string != null)  {
      msg.add (STRING_KEY, null, _string);
    }
  }
  public static SubMessage fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.types.SubMessage".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.types.SubMessage)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new SubMessage (fudgeMsg);
  }
  public int getInt () {
    return _int;
  }
  public String getString () {
    return _string;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof SubMessage)) return false;
    SubMessage msg = (SubMessage)o;
    if (_int != msg._int) return false;
    if (_string != null) {
      if (msg._string != null) {
        if (!_string.equals (msg._string)) return false;
      }
      else return false;
    }
    else if (msg._string != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_int;
    hc *= 31;
    if (_string != null) hc += _string.hashCode ();
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
