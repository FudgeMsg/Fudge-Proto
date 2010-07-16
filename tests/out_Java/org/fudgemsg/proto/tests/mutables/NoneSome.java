// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from mutables.proto:48(10)
package org.fudgemsg.proto.tests.mutables;
public class NoneSome implements java.io.Serializable {
  private static final long serialVersionUID = 2458027157l;
  private final int _foo;
  public static final String FOO_KEY = "foo";
  private final Integer _bar;
  public static final String BAR_KEY = "bar";
  public static class Builder {
    private int _foo;
    private Integer _bar;
    public Builder (int foo) {
      foo (foo);
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
    public Builder foo (int foo) {
      _foo = foo;
      return this;
    }
    public Builder bar (Integer bar) {
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
  public NoneSome (int foo, Integer bar) {
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
    if (_bar != null)  {
      msg.add (BAR_KEY, null, _bar);
    }
  }
  public static NoneSome fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.mutables.NoneSome".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.mutables.NoneSome)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public int getFoo () {
    return _foo;
  }
  public Integer getBar () {
    return _bar;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof NoneSome)) return false;
    NoneSome msg = (NoneSome)o;
    if (_foo != msg._foo) return false;
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
    hc = (hc * 31) + (int)_foo;
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
