// Automatically created - do not modify
// Created from extern.proto:9(10)
package org.fudgemsg.proto.tests.extern;
public class UsesExtern implements java.io.Serializable {
  private static final long serialVersionUID = -859164874992l;
  private final org.fudgemsg.proto.tests.ExternalMessage _foo;
  public static final String FOO_KEY = "foo";
  private final org.fudgemsg.proto.tests.ExternalEnum _bar;
  public static final String BAR_KEY = "bar";
  public static class Builder {
    private org.fudgemsg.proto.tests.ExternalMessage _foo;
    private org.fudgemsg.proto.tests.ExternalEnum _bar;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (FOO_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.ExternalMessage fudge1;
          fudge1 = fudgeContext.fieldValueToObject (org.fudgemsg.proto.tests.ExternalMessage.class, fudgeField);
          foo (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a UsesExtern - field 'foo' is not ExternalMessage message", e);
        }
      }
      fudgeField = fudgeMsg.getByName (BAR_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.ExternalEnum fudge1;
          fudge1 = fudgeContext.fieldValueToObject (org.fudgemsg.proto.tests.ExternalEnum.class, fudgeField);
          bar (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a UsesExtern - field 'bar' is not ExternalEnum enum", e);
        }
      }
    }
    public Builder foo (org.fudgemsg.proto.tests.ExternalMessage foo) {
      if (foo == null) _foo = null;
      else {
        _foo = foo;
      }
      return this;
    }
    public Builder bar (org.fudgemsg.proto.tests.ExternalEnum bar) {
      _bar = bar;
      return this;
    }
    public UsesExtern build () {
      return new UsesExtern (this);
    }
  }
  protected UsesExtern (final Builder builder) {
    if (builder._foo == null) _foo = null;
    else {
      _foo = builder._foo;
    }
    _bar = builder._bar;
  }
  public UsesExtern (org.fudgemsg.proto.tests.ExternalMessage foo, org.fudgemsg.proto.tests.ExternalEnum bar) {
    if (foo == null) _foo = null;
    else {
      _foo = foo;
    }
    _bar = bar;
  }
  protected UsesExtern (final UsesExtern source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._foo == null) _foo = null;
    else {
      _foo = source._foo;
    }
    _bar = source._bar;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      fudgeContext.objectToFudgeMsg (msg, FOO_KEY, null, _foo);
    }
    if (_bar != null)  {
      msg.add (BAR_KEY, null, _bar);
    }
  }
  public static UsesExtern fromFudgeMsg (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.extern.UsesExtern".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.extern.UsesExtern)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.mapping.FudgeDeserializationContext.class, org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeContext, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeContext, fudgeMsg).build ();
  }
  public org.fudgemsg.proto.tests.ExternalMessage getFoo () {
    return _foo;
  }
  public org.fudgemsg.proto.tests.ExternalEnum getBar () {
    return _bar;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof UsesExtern)) return false;
    UsesExtern msg = (UsesExtern)o;
    if (_foo != null) {
      if (msg._foo != null) {
        if (!_foo.equals (msg._foo)) return false;
      }
      else return false;
    }
    else if (msg._foo != null) return false;
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
    if (_foo != null) hc += _foo.hashCode ();
    hc *= 31;
    if (_bar != null) hc += _bar.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
