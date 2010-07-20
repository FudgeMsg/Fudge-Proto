// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:41(9)
package org.fudgemsg.proto.tests.inheritance;
public class NonBuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = 108399l;
  private final int _a;
  public static final String A_KEY = "a";
  public NonBuilderBase (int a) {
    _a = a;
  }
  protected NonBuilderBase (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (A_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a NonBuilderBase - field 'a' is not present");
    try {
      _a = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a NonBuilderBase - field 'a' is not integer", e);
    }
  }
  protected NonBuilderBase (final NonBuilderBase source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _a = source._a;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (A_KEY, null, _a);
  }
  public static NonBuilderBase fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.NonBuilderBase".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.NonBuilderBase)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new NonBuilderBase (fudgeMsg);
  }
  public int getA () {
    return _a;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof NonBuilderBase)) return false;
    NonBuilderBase msg = (NonBuilderBase)o;
    if (_a != msg._a) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_a;
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
