// Automatically created - do not modify
// Created from inheritance.proto:59(9)
package org.fudgemsg.proto.tests.inheritance;
public class BuilderFromNonBuilder extends org.fudgemsg.proto.tests.inheritance.NonBuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = 108461l;
  private final int _c;
  public static final String C_KEY = "c";
  public static class Builder {
    private final org.fudgemsg.proto.tests.inheritance.NonBuilderBase _fudgeRoot;
    private int _c;
    public Builder (int a) {
      _fudgeRoot = new org.fudgemsg.proto.tests.inheritance.NonBuilderBase (a);
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      _fudgeRoot = org.fudgemsg.proto.tests.inheritance.NonBuilderBase.fromFudgeMsg (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (C_KEY);
      if (fudgeField != null)  {
        try {
          c (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BuilderFromNonBuilder - field 'c' is not integer", e);
        }
      }
    }
    public Builder c (int c) {
      _c = c;
      return this;
    }
    public BuilderFromNonBuilder build () {
      return new BuilderFromNonBuilder (this);
    }
  }
  protected BuilderFromNonBuilder (final Builder builder) {
    super (builder._fudgeRoot);
    _c = builder._c;
  }
  public BuilderFromNonBuilder (int a, int c) {
    super (a);
    _c = c;
  }
  protected BuilderFromNonBuilder (final BuilderFromNonBuilder source) {
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
    msg.add (C_KEY, null, _c);
  }
  public static BuilderFromNonBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getC () {
    return _c;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof BuilderFromNonBuilder)) return false;
    BuilderFromNonBuilder msg = (BuilderFromNonBuilder)o;
    if (_c != msg._c) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_c;
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
