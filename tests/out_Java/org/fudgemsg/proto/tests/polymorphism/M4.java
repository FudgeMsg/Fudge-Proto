// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from polymorphism.proto:17(10)
package org.fudgemsg.proto.tests.polymorphism;
public class M4 implements java.io.Serializable {
  private static final long serialVersionUID = 844755515443102l;
  private org.fudgemsg.proto.tests.polymorphism.M1 _foo;
  public static final String FOO_KEY = "foo";
  private org.fudgemsg.proto.tests.polymorphism.M1 _bar;
  public static final String BAR_KEY = "bar";
  private org.fudgemsg.proto.tests.polymorphism.M1 _other;
  public static final String OTHER_KEY = "other";
  public M4 () {
  }
  protected M4 (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FOO_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.proto.tests.polymorphism.M1 fudge1;
        fudge1 = org.fudgemsg.proto.tests.polymorphism.M1.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
        setFoo (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M4 - field 'foo' is not M1 message", e);
      }
    }
    fudgeField = fudgeMsg.getByName (BAR_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.proto.tests.polymorphism.M1 fudge1;
        fudge1 = org.fudgemsg.proto.tests.polymorphism.M1.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
        setBar (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M4 - field 'bar' is not M1 message", e);
      }
    }
    fudgeField = fudgeMsg.getByName (OTHER_KEY);
    if (fudgeField != null)  {
      try {
        final org.fudgemsg.proto.tests.polymorphism.M1 fudge1;
        fudge1 = org.fudgemsg.proto.tests.polymorphism.M1.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
        setOther (fudge1);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M4 - field 'other' is not M1 message", e);
      }
    }
  }
  public M4 (org.fudgemsg.proto.tests.polymorphism.M1 foo, org.fudgemsg.proto.tests.polymorphism.M1 bar, org.fudgemsg.proto.tests.polymorphism.M1 other) {
    if (foo == null) _foo = null;
    else {
      _foo = (org.fudgemsg.proto.tests.polymorphism.M1)foo.clone ();
    }
    if (bar == null) _bar = null;
    else {
      _bar = (org.fudgemsg.proto.tests.polymorphism.M1)bar.clone ();
    }
    if (other == null) _other = null;
    else {
      _other = (org.fudgemsg.proto.tests.polymorphism.M1)other.clone ();
    }
  }
  protected M4 (final M4 source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._foo == null) _foo = null;
    else {
      _foo = (org.fudgemsg.proto.tests.polymorphism.M1)source._foo.clone ();
    }
    if (source._bar == null) _bar = null;
    else {
      _bar = (org.fudgemsg.proto.tests.polymorphism.M1)source._bar.clone ();
    }
    if (source._other == null) _other = null;
    else {
      _other = (org.fudgemsg.proto.tests.polymorphism.M1)source._other.clone ();
    }
  }
  public M4 clone () {
    return new M4 (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      Class<?> fudge2 = _foo.getClass ();
      while (!org.fudgemsg.proto.tests.polymorphism.M1.class.equals (fudge2)) {
        fudge1.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge2.getName ());
        fudge2 = fudge2.getSuperclass ();
      }
      _foo.toFudgeMsg (fudgeContext, fudge1);
      msg.add (FOO_KEY, null, fudge1);
    }
    if (_bar != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      Class<?> fudge2 = _bar.getClass ();
      while (!org.fudgemsg.proto.tests.polymorphism.M1.class.equals (fudge2)) {
        fudge1.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge2.getName ());
        fudge2 = fudge2.getSuperclass ();
      }
      _bar.toFudgeMsg (fudgeContext, fudge1);
      msg.add (BAR_KEY, null, fudge1);
    }
    if (_other != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      Class<?> fudge2 = _other.getClass ();
      while (!org.fudgemsg.proto.tests.polymorphism.M1.class.equals (fudge2)) {
        fudge1.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge2.getName ());
        fudge2 = fudge2.getSuperclass ();
      }
      _other.toFudgeMsg (fudgeContext, fudge1);
      msg.add (OTHER_KEY, null, fudge1);
    }
  }
  public static M4 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.polymorphism.M4".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.polymorphism.M4)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new M4 (fudgeMsg);
  }
  public org.fudgemsg.proto.tests.polymorphism.M1 getFoo () {
    return _foo;
  }
  public void setFoo (org.fudgemsg.proto.tests.polymorphism.M1 foo) {
    if (foo == null) _foo = null;
    else {
      _foo = (org.fudgemsg.proto.tests.polymorphism.M1)foo.clone ();
    }
  }
  public org.fudgemsg.proto.tests.polymorphism.M1 getBar () {
    return _bar;
  }
  public void setBar (org.fudgemsg.proto.tests.polymorphism.M1 bar) {
    if (bar == null) _bar = null;
    else {
      _bar = (org.fudgemsg.proto.tests.polymorphism.M1)bar.clone ();
    }
  }
  public org.fudgemsg.proto.tests.polymorphism.M1 getOther () {
    return _other;
  }
  public void setOther (org.fudgemsg.proto.tests.polymorphism.M1 other) {
    if (other == null) _other = null;
    else {
      _other = (org.fudgemsg.proto.tests.polymorphism.M1)other.clone ();
    }
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof M4)) return false;
    M4 msg = (M4)o;
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
    if (_other != null) {
      if (msg._other != null) {
        if (!_other.equals (msg._other)) return false;
      }
      else return false;
    }
    else if (msg._other != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_foo != null) hc += _foo.hashCode ();
    hc *= 31;
    if (_bar != null) hc += _bar.hashCode ();
    hc *= 31;
    if (_other != null) hc += _other.hashCode ();
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
