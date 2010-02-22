// Automatically created - do not modify
// Created from mutables.proto:24(10)
package org.fudgemsg.proto.tests.mutables;
public class SomeOnly implements java.io.Serializable {
  private static final long serialVersionUID = 3130393446l;
  private int _foo;
  public static final String FOO_KEY = "foo";
  private final int _bar;
  public static final String BAR_KEY = "bar";
  public SomeOnly (int foo, int bar) {
    _foo = foo;
    _bar = bar;
  }
  protected SomeOnly (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FOO_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SomeOnly - field 'foo' is not present");
    try {
      _foo = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SomeOnly - field 'foo' is not integer", e);
    }
    fudgeField = fudgeMsg.getByName (BAR_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SomeOnly - field 'bar' is not present");
    try {
      _bar = fudgeMsg.getFieldValue (Integer.class, fudgeField);
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a SomeOnly - field 'bar' is not integer", e);
    }
  }
  protected SomeOnly (final SomeOnly source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _foo = source._foo;
    _bar = source._bar;
  }
  public SomeOnly clone () {
    return new SomeOnly (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (FOO_KEY, null, _foo);
    msg.add (BAR_KEY, null, _bar);
  }
  public static SomeOnly fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.mutables.SomeOnly".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.mutables.SomeOnly)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new SomeOnly (fudgeMsg);
  }
  public int getFoo () {
    return _foo;
  }
  public void setFoo (int foo) {
    _foo = foo;
  }
  public int getBar () {
    return _bar;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof SomeOnly)) return false;
    SomeOnly msg = (SomeOnly)o;
    if (_foo != msg._foo) return false;
    if (_bar != msg._bar) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_foo;
    hc = (hc * 31) + (int)_bar;
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
