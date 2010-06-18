// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from polymorphism.proto:5(10)
package org.fudgemsg.proto.tests.polymorphism;
public class M1 implements java.io.Serializable {
  private static final long serialVersionUID = -1808013769l;
  private String _id;
  public static final String ID_KEY = "id";
  public M1 () {
  }
  protected M1 (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (ID_KEY);
    if (fudgeField != null)  {
      try {
        setId ((fudgeField.getValue () != null) ? fudgeField.getValue ().toString () : null);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a M1 - field 'id' is not string", e);
      }
    }
  }
  public M1 (String id) {
    _id = id;
  }
  protected M1 (final M1 source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _id = source._id;
  }
  public M1 clone () {
    return new M1 (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_id != null)  {
      msg.add (ID_KEY, null, _id);
    }
  }
  public static M1 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.polymorphism.M1".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.polymorphism.M1)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new M1 (fudgeMsg);
  }
  public String getId () {
    return _id;
  }
  public void setId (String id) {
    _id = id;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof M1)) return false;
    M1 msg = (M1)o;
    if (_id != null) {
      if (msg._id != null) {
        if (!_id.equals (msg._id)) return false;
      }
      else return false;
    }
    else if (msg._id != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_id != null) hc += _id.hashCode ();
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
