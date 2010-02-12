// Automatically created - do not modify
// Created from inheritance.proto:43(9)
package org.fudgemsg.proto.tests.inheritance;
public class BuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = 108430l;
  private final int _b;
  public static final String B_KEY = "b";
  public static class Builder {
    private int _b;
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
    public Builder b (int b) {
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
  public BuilderBase (int b) {
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
    msg.add (B_KEY, null, _b);
  }
  public static BuilderBase fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getB () {
    return _b;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof BuilderBase)) return false;
    BuilderBase msg = (BuilderBase)o;
    if (_b != msg._b) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_b;
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
