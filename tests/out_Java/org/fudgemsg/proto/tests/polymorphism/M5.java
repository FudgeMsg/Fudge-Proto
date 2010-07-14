// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from polymorphism.proto:23(19)
package org.fudgemsg.proto.tests.polymorphism;
public abstract class M5 implements java.io.Serializable {
  private static final long serialVersionUID = -1804968980l;
  private String _foo;
  public static final String FOO_KEY = "foo";
  public M5 () {
  }
  protected M5 (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FOO_KEY);
    if (fudgeField != null)  {
      try {
        setFoo ((fudgeField.getValue () != null) ? fudgeField.getValue ().toString () : null);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M5 - field 'foo' is not string", e);
      }
    }
  }
  public M5 (String foo) {
    _foo = foo;
  }
  protected M5 (final M5 source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _foo = source._foo;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      msg.add (FOO_KEY, null, _foo);
    }
  }
  public static M5 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.polymorphism.M5".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.polymorphism.M5)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    throw new UnsupportedOperationException ("M5 is an abstract message");
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
    if (!(o instanceof M5)) return false;
    M5 msg = (M5)o;
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
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
