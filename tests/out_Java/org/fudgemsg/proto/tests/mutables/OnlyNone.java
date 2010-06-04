// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from mutables.proto:18(10)
package org.fudgemsg.proto.tests.mutables;
public class OnlyNone implements java.io.Serializable {
  private static final long serialVersionUID = -643685976572l;
  private Integer _foo;
  public static final String FOO_KEY = "foo";
  private Integer _bar;
  public static final String BAR_KEY = "bar";
  public OnlyNone () {
  }
  protected OnlyNone (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (FOO_KEY);
    if (fudgeField != null)  {
      try {
        setFoo (fudgeMsg.getFieldValue (Integer.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a OnlyNone - field 'foo' is not integer", e);
      }
    }
    fudgeField = fudgeMsg.getByName (BAR_KEY);
    if (fudgeField != null)  {
      try {
        setBar (fudgeMsg.getFieldValue (Integer.class, fudgeField));
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a OnlyNone - field 'bar' is not integer", e);
      }
    }
  }
  public OnlyNone (Integer foo, Integer bar) {
    _foo = foo;
    _bar = bar;
  }
  protected OnlyNone (final OnlyNone source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _foo = source._foo;
    _bar = source._bar;
  }
  public OnlyNone clone () {
    return new OnlyNone (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      msg.add (FOO_KEY, null, _foo);
    }
    if (_bar != null)  {
      msg.add (BAR_KEY, null, _bar);
    }
  }
  public static OnlyNone fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.mutables.OnlyNone".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.mutables.OnlyNone)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new OnlyNone (fudgeMsg);
  }
  public Integer getFoo () {
    return _foo;
  }
  public void setFoo (Integer foo) {
    _foo = foo;
  }
  public Integer getBar () {
    return _bar;
  }
  public void setBar (Integer bar) {
    _bar = bar;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof OnlyNone)) return false;
    OnlyNone msg = (OnlyNone)o;
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
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
