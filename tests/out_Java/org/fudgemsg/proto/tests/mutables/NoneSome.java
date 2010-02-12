// Automatically created - do not modify
// Created from mutables.proto:48(10)
package org.fudgemsg.proto.tests.mutables;
public class NoneSome implements java.io.Serializable {
  private static final long serialVersionUID = 3130393446l;
  private final int _foo;
  public static final String FOO_KEY = "foo";
  private final int _bar;
  public static final String BAR_KEY = "bar";
  public static class Builder {
    private final int _foo;
    private int _bar;
    public Builder (int foo) {
      _foo = foo;
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (FOO_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a NoneSome - field 'foo' is not present");
      try {
        _foo = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a NoneSome - field 'foo' is not integer", e);
      }
      fudgeField = fudgeMsg.getByName (BAR_KEY);
      if (fudgeField != null)  {
        try {
          bar (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a NoneSome - field 'bar' is not integer", e);
        }
      }
    }
    public Builder bar (int bar) {
      _bar = bar;
      return this;
    }
    public NoneSome build () {
      return new NoneSome (this);
    }
  }
  protected NoneSome (final Builder builder) {
    _foo = builder._foo;
    _bar = builder._bar;
  }
  public NoneSome (int foo, int bar) {
    _foo = foo;
    _bar = bar;
  }
  protected NoneSome (final NoneSome source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _foo = source._foo;
    _bar = source._bar;
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
  public static NoneSome fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getFoo () {
    return _foo;
  }
  public int getBar () {
    return _bar;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof NoneSome)) return false;
    NoneSome msg = (NoneSome)o;
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
