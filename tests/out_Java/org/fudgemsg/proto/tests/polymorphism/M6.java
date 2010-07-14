// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from polymorphism.proto:27(10)
package org.fudgemsg.proto.tests.polymorphism;
public class M6 extends org.fudgemsg.proto.tests.polymorphism.M5 implements java.io.Serializable {
  private static final long serialVersionUID = -1805101505l;
  private String _bar;
  public static final String BAR_KEY = "bar";
  public M6 () {
  }
  protected M6 (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    super (fudgeMsg);
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (BAR_KEY);
    if (fudgeField != null)  {
      try {
        setBar ((fudgeField.getValue () != null) ? fudgeField.getValue ().toString () : null);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M6 - field 'bar' is not string", e);
      }
    }
  }
  public M6 (String foo, String bar) {
    super (foo);
    _bar = bar;
  }
  protected M6 (final M6 source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _bar = source._bar;
  }
  public M6 clone () {
    return new M6 (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    if (_bar != null)  {
      msg.add (BAR_KEY, null, _bar);
    }
  }
  public static M6 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.polymorphism.M6".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.polymorphism.M6)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new M6 (fudgeMsg);
  }
  public String getBar () {
    return _bar;
  }
  public void setBar (String bar) {
    _bar = bar;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof M6)) return false;
    M6 msg = (M6)o;
    if (_bar != null) {
      if (msg._bar != null) {
        if (!_bar.equals (msg._bar)) return false;
      }
      else return false;
    }
    else if (msg._bar != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc *= 31;
    if (_bar != null) hc += _bar.hashCode ();
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