// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:53(9)
package org.fudgemsg.proto.tests.inheritance;
public class BuilderFromBuilder extends org.fudgemsg.proto.tests.inheritance.BuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = -672257828l;
  private final Integer _c;
  public static final String C_KEY = "c";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.BuilderBase.Builder {
    private Integer _c;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (C_KEY);
      if (fudgeField != null)  {
        try {
          c (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BuilderFromBuilder - field 'c' is not integer", e);
        }
      }
    }
    public Builder c (Integer c) {
      _c = c;
      return this;
    }
    public BuilderFromBuilder build () {
      return new BuilderFromBuilder (this);
    }
  }
  protected BuilderFromBuilder (final Builder builder) {
    super (builder);
    _c = builder._c;
  }
  public BuilderFromBuilder (Integer b, Integer c) {
    super (b);
    _c = c;
  }
  protected BuilderFromBuilder (final BuilderFromBuilder source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _c = source._c;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    if (_c != null)  {
      msg.add (C_KEY, null, _c);
    }
  }
  public static BuilderFromBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.BuilderFromBuilder".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.BuilderFromBuilder)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public Integer getC () {
    return _c;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof BuilderFromBuilder)) return false;
    BuilderFromBuilder msg = (BuilderFromBuilder)o;
    if (_c != null) {
      if (msg._c != null) {
        if (!_c.equals (msg._c)) return false;
      }
      else return false;
    }
    else if (msg._c != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc *= 31;
    if (_c != null) hc += _c.hashCode ();
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
