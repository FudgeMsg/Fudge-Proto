// Automatically created - do not modify
// Created from extern.proto:5(10)
package org.fudgemsg.proto.tests.extern;
public class ExtendsExtern extends org.fudgemsg.proto.tests.ExternalMessage implements java.io.Serializable {
  private static final long serialVersionUID = 108399l;
  private final int _a;
  public static final String A_KEY = "a";
  public static class Builder {
    private final org.fudgemsg.proto.tests.ExternalMessage _fudgeRoot;
    private int _a;
    public Builder () {
      _fudgeRoot = null;
    }
    protected Builder (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      _fudgeRoot = fudgeContext.fudgeMsgToObject (org.fudgemsg.proto.tests.ExternalMessage.class, fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (A_KEY);
      if (fudgeField != null)  {
        try {
          a (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a ExtendsExtern - field 'a' is not integer", e);
        }
      }
    }
    public Builder a (int a) {
      _a = a;
      return this;
    }
    public ExtendsExtern build () {
      return new ExtendsExtern (this);
    }
  }
  protected ExtendsExtern (final Builder builder) {
    super (builder._fudgeRoot);
    _a = builder._a;
  }
  public ExtendsExtern (int a) {
    _a = a;
  }
  public ExtendsExtern (final ExtendsExtern source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _a = source._a;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    msg.add (A_KEY, null, _a);
  }
  public static ExtendsExtern fromFudgeMsg (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeContext, fudgeMsg).build ();
  }
  public int getA () {
    return _a;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof ExtendsExtern)) return false;
    ExtendsExtern msg = (ExtendsExtern)o;
    if (_a != msg._a) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_a;
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
