// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from extern.proto:5(10)
package org.fudgemsg.proto.tests.extern;
public class ExtendsExtern extends org.fudgemsg.proto.tests.ExternalMessage implements java.io.Serializable {
  private static final long serialVersionUID = -672257890l;
  private final Integer _a;
  public static final String A_KEY = "a";
  public static class Builder {
    private org.fudgemsg.mapping.FudgeDeserializationContext _fudgeContext;
    protected org.fudgemsg.mapping.FudgeDeserializationContext getFudgeContext () {
      return _fudgeContext;
    }
    private org.fudgemsg.FudgeFieldContainer _fudgeRoot;
    protected org.fudgemsg.FudgeFieldContainer getFudgeRoot () {
      return _fudgeRoot;
    }
    private Integer _a;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      _fudgeRoot = fudgeMsg;
      _fudgeContext = fudgeContext;
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
    public Builder a (Integer a) {
      _a = a;
      return this;
    }
    public ExtendsExtern build () {
      return (getFudgeRoot () != null) ? new ExtendsExtern (getFudgeContext (), getFudgeRoot (), this) : new ExtendsExtern (this);
    }
  }
  protected ExtendsExtern (final Builder builder) {
    super ();
    _a = builder._a;
  }
  protected ExtendsExtern (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg, final Builder builder) {
    super (fudgeContext, fudgeMsg);
    _a = builder._a;
  }
  public ExtendsExtern (Integer a) {
    _a = a;
  }
  protected ExtendsExtern (final ExtendsExtern source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _a = source._a;
  }
  public ExtendsExtern clone () {
    return new ExtendsExtern (this);
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    if (_a != null)  {
      msg.add (A_KEY, null, _a);
    }
  }
  public static ExtendsExtern fromFudgeMsg (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.extern.ExtendsExtern".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.extern.ExtendsExtern)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.mapping.FudgeDeserializationContext.class, org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeContext, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeContext, fudgeMsg).build ();
  }
  public Integer getA () {
    return _a;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof ExtendsExtern)) return false;
    ExtendsExtern msg = (ExtendsExtern)o;
    if (_a != null) {
      if (msg._a != null) {
        if (!_a.equals (msg._a)) return false;
      }
      else return false;
    }
    else if (msg._a != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc *= 31;
    if (_a != null) hc += _a.hashCode ();
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
