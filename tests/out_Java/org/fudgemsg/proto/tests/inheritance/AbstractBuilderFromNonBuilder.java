// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:75(19)
package org.fudgemsg.proto.tests.inheritance;
public abstract class AbstractBuilderFromNonBuilder extends org.fudgemsg.proto.tests.inheritance.BuilderFromNonBuilder implements java.io.Serializable {
  private static final long serialVersionUID = 108492l;
  private final int _d;
  public static final String D_KEY = "d";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.BuilderFromNonBuilder.Builder {
    private final int _d;
    public Builder (int a, int d) {
      super (a);
      _d = d;
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (D_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a AbstractBuilderFromNonBuilder - field 'd' is not present");
      try {
        _d = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a AbstractBuilderFromNonBuilder - field 'd' is not integer", e);
      }
    }
  }
  protected AbstractBuilderFromNonBuilder (final Builder builder) {
    super (builder);
    _d = builder._d;
  }
  protected AbstractBuilderFromNonBuilder (final org.fudgemsg.FudgeFieldContainer fudgeMsg, final Builder builder) {
    super (fudgeMsg, builder);
    _d = builder._d;
  }
  public AbstractBuilderFromNonBuilder (int a, Integer c, int d) {
    super (a, c);
    _d = d;
  }
  protected AbstractBuilderFromNonBuilder (final AbstractBuilderFromNonBuilder source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _d = source._d;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    msg.add (D_KEY, null, _d);
  }
  public static AbstractBuilderFromNonBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.AbstractBuilderFromNonBuilder".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.AbstractBuilderFromNonBuilder)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    throw new UnsupportedOperationException ("AbstractBuilderFromNonBuilder is an abstract message");
  }
  public int getD () {
    return _d;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof AbstractBuilderFromNonBuilder)) return false;
    AbstractBuilderFromNonBuilder msg = (AbstractBuilderFromNonBuilder)o;
    if (_d != msg._d) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_d;
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
