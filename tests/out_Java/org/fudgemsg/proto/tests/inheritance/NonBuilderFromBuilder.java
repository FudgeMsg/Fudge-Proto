// Automatically created - do not modify
// Created from inheritance.proto:47(9)
package org.fudgemsg.proto.tests.inheritance;
public class NonBuilderFromBuilder extends org.fudgemsg.proto.tests.inheritance.BuilderBase implements java.io.Serializable {
  private static final long serialVersionUID = 108461l;
  private final int _c;
  public static final String C_KEY = "c";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.BuilderBase.Builder {
    private final int _c;
    public Builder (int c) {
      _c = c;
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (C_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a NonBuilderFromBuilder - field 'c' is not present");
      try {
        _c = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a NonBuilderFromBuilder - field 'c' is not integer", e);
      }
    }
    public NonBuilderFromBuilder build () {
      return new NonBuilderFromBuilder (this);
    }
  }
  protected NonBuilderFromBuilder (final Builder builder) {
    super (builder);
    _c = builder._c;
  }
  public NonBuilderFromBuilder (int b, int c) {
    super (b);
    _c = c;
  }
  protected NonBuilderFromBuilder (final NonBuilderFromBuilder source) {
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
  public static NonBuilderFromBuilder fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getC () {
    return _c;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof NonBuilderFromBuilder)) return false;
    NonBuilderFromBuilder msg = (NonBuilderFromBuilder)o;
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
