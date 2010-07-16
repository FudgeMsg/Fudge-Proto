// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:57(10)
package org.fudgemsg.proto.tests.inheritance;
public class NonBuilderFromNonBuilder extends org.fudgemsg.proto.tests.inheritance.NonBuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = 108461l;
  private final int _c;
  public static final String C_KEY = "c";
  public NonBuilderFromNonBuilder (int a, int c) {
    super (a);
    _c = c;
  }
  protected NonBuilderFromNonBuilder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    super (fudgeMsg);
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (C_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a NonBuilderFromNonBuilder - field 'c' is not present");
    try {
      _c = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a NonBuilderFromNonBuilder - field 'c' is not integer", e);
    }
  }
  protected NonBuilderFromNonBuilder (final NonBuilderFromNonBuilder source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _c = source._c;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    msg.add (C_KEY, null, _c);
  }
  public static NonBuilderFromNonBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.NonBuilderFromNonBuilder".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.NonBuilderFromNonBuilder)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new NonBuilderFromNonBuilder (fudgeMsg);
  }
  public int getC () {
    return _c;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof NonBuilderFromNonBuilder)) return false;
    NonBuilderFromNonBuilder msg = (NonBuilderFromNonBuilder)o;
    if (_c != msg._c) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_c;
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
