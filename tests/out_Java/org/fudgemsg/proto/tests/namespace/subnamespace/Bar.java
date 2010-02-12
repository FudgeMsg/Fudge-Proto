// Automatically created - do not modify
// Created from namespace.proto:13(10)
package org.fudgemsg.proto.tests.namespace.subnamespace;
public class Bar implements java.io.Serializable {
  private static final long serialVersionUID = 2022314533l;
  private final org.fudgemsg.proto.tests.namespace.Foo _foo;
  public static final String FOO_KEY = "foo";
  public static class Builder {
    private org.fudgemsg.proto.tests.namespace.Foo _foo;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (FOO_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.proto.tests.namespace.Foo fudge1;
          fudge1 = org.fudgemsg.proto.tests.namespace.Foo.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
          foo (fudge1);
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Bar - field 'foo' is not Foo message", e);
        }
      }
    }
    public Builder foo (org.fudgemsg.proto.tests.namespace.Foo foo) {
      if (foo == null) _foo = null;
      else {
        _foo = foo;
      }
      return this;
    }
    public Bar build () {
      return new Bar (this);
    }
  }
  protected Bar (final Builder builder) {
    if (builder._foo == null) _foo = null;
    else {
      _foo = builder._foo;
    }
  }
  public Bar (org.fudgemsg.proto.tests.namespace.Foo foo) {
    if (foo == null) _foo = null;
    else {
      _foo = foo;
    }
  }
  protected Bar (final Bar source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._foo == null) _foo = null;
    else {
      _foo = source._foo;
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      msg.add (FOO_KEY, null, _foo.toFudgeMsg (fudgeContext));
    }
  }
  public static Bar fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public org.fudgemsg.proto.tests.namespace.Foo getFoo () {
    return _foo;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof Bar)) return false;
    Bar msg = (Bar)o;
    if (_foo != null) {
      if (msg._foo != null) {
        if (!_foo.equals (msg._foo)) return false;
      }
      else return false;
    }
    else if (msg._foo != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_foo != null) hc += _foo.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
