// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from inheritance.proto:45(9)
package org.fudgemsg.proto.tests.inheritance;
public class BuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = -672257859l;
  private final Integer _b;
  public static final String B_KEY = "b";
  public static class Builder {
    private Integer _b;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (B_KEY);
      if (fudgeField != null)  {
        try {
          b (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BuilderBase - field 'b' is not integer", e);
        }
      }
    }
    public Builder b (Integer b) {
      _b = b;
      return this;
    }
    public BuilderBase build () {
      return new BuilderBase (this);
    }
  }
  protected BuilderBase (final Builder builder) {
    _b = builder._b;
  }
  public BuilderBase (Integer b) {
    _b = b;
  }
  protected BuilderBase (final BuilderBase source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _b = source._b;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_b != null)  {
      msg.add (B_KEY, null, _b);
    }
  }
  public static BuilderBase fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.inheritance.BuilderBase".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.inheritance.BuilderBase)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public Integer getB () {
    return _b;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (!(o instanceof BuilderBase)) return false;
    BuilderBase msg = (BuilderBase)o;
    if (_b != null) {
      if (msg._b != null) {
        if (!_b.equals (msg._b)) return false;
      }
      else return false;
    }
    else if (msg._b != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_b != null) hc += _b.hashCode ();
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
