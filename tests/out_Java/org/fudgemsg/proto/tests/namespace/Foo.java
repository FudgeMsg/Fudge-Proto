// Automatically created - do not modify
// Created from namespace.proto:5(9)
package org.fudgemsg.proto.tests.namespace;
public class Foo implements java.io.Serializable {
  private static final long serialVersionUID = -385146518l;
  private final org.fudgemsg.proto.tests.namespace.subnamespace.Bar _bar;
  public static final String BAR_KEY = "bar";
  public static class Builder {
    private org.fudgemsg.proto.tests.namespace.subnamespace.Bar _bar;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (BAR_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.namespace.subnamespace.Bar fudge1;
          fudge1 = org.fudgemsg.proto.tests.namespace.subnamespace.Bar.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
          bar (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Foo - field 'bar' is not Bar message", e);
        }
      }
    }
    public Builder bar (org.fudgemsg.proto.tests.namespace.subnamespace.Bar bar) {
      if (bar == null) _bar = null;
      else {
        _bar = bar;
      }
      return this;
    }
    public Foo build () {
      return new Foo (this);
    }
  }
  protected Foo (final Builder builder) {
    if (builder._bar == null) _bar = null;
    else {
      _bar = builder._bar;
    }
  }
  public Foo (org.fudgemsg.proto.tests.namespace.subnamespace.Bar bar) {
    if (bar == null) _bar = null;
    else {
      _bar = bar;
    }
  }
  protected Foo (final Foo source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._bar == null) _bar = null;
    else {
      _bar = source._bar;
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_bar != null)  {
      msg.add (BAR_KEY, null, _bar.toFudgeMsg (fudgeContext));
    }
  }
  public static Foo fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public org.fudgemsg.proto.tests.namespace.subnamespace.Bar getBar () {
    return _bar;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof Foo)) return false;
    Foo msg = (Foo)o;
    if (_bar != null) {
      if (msg._bar != null) {
        if (!_bar.equals (msg._bar)) return false;
      }
      else return false;
    }
    else if (msg._bar != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_bar != null) hc += _bar.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
