// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from polymorphism.proto:9(10)
package org.fudgemsg.proto.tests.polymorphism;
public class M2 extends org.fudgemsg.proto.tests.polymorphism.M1 implements java.io.Serializable {
  private static final long serialVersionUID = -1804968980l;
  private String _foo;
  public static final String FOO_KEY = "foo";
  public M2 () {
  }
  protected M2 (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    super (fudgeMsg);
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FOO_KEY);
    if (fudgeField != null)  {
      try {
        setFoo (fudgeField.getValue ().toString ());
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M2 - field 'foo' is not string", e);
      }
    }
  }
  public M2 (String id, String foo) {
    super (id);
    _foo = foo;
  }
  protected M2 (final M2 source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _foo = source._foo;
  }
  public M2 clone () {
    return new M2 (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    if (_foo != null)  {
      msg.add (FOO_KEY, null, _foo);
    }
  }
  public static M2 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.polymorphism.M2".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.polymorphism.M2)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new M2 (fudgeMsg);
  }
  public String getFoo () {
    return _foo;
  }
  public void setFoo (String foo) {
    _foo = foo;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof M2)) return false;
    M2 msg = (M2)o;
    if (_foo != null) {
      if (msg._foo != null) {
        if (!_foo.equals (msg._foo)) return false;
      }
      else return false;
    }
    else if (msg._foo != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc *= 31;
    if (_foo != null) hc += _foo.hashCode ();
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
