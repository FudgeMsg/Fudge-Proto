// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from extern.proto:14(10)
package org.fudgemsg.proto.tests.extern;
public class UsesExternArray implements java.io.Serializable {
  private static final long serialVersionUID = 30463760l;
  private final org.fudgemsg.proto.tests.ExternalMessage[] _foo;
  public static final String FOO_KEY = "foo";
  public static class Builder {
    private org.fudgemsg.proto.tests.ExternalMessage[] _foo;
    public Builder () {
    }
    protected Builder (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (FOO_KEY);
      if (fudgeField != null)  {
        try {
          final org.fudgemsg.FudgeFieldContainer fudge1 = fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField);
          final java.util.List<org.fudgemsg.proto.tests.ExternalMessage> fudge2 = new java.util.ArrayList<org.fudgemsg.proto.tests.ExternalMessage> ();
          for (org.fudgemsg.FudgeField fudge3 : fudge1) {
            try {
              final org.fudgemsg.proto.tests.ExternalMessage fudge4;
              fudge4 = fudgeContext.fieldValueToObject (org.fudgemsg.proto.tests.ExternalMessage.class, fudge3);
              fudge2.add (fudge4);
            }
            catch (IllegalArgumentException e) {
              throw new IllegalArgumentException ("Fudge message is not a UsesExternArray - field 'foo[]' is not ExternalMessage message", e);
            }
          }
          foo (fudge2.toArray (new org.fudgemsg.proto.tests.ExternalMessage[fudge2.size ()]));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a UsesExternArray - field 'foo' is not ExternalMessage message[]", e);
        }
      }
    }
    public Builder foo (org.fudgemsg.proto.tests.ExternalMessage[] foo) {
      if (foo == null) _foo = null;
      else {
        foo = java.util.Arrays.copyOf (foo, foo.length);
        for (int fudge0 = 0; fudge0 < foo.length; fudge0++) {
          if (foo[fudge0] != null) {
          }
        }
        _foo = foo;
      }
      return this;
    }
    public UsesExternArray build () {
      return new UsesExternArray (this);
    }
  }
  protected UsesExternArray (final Builder builder) {
    if (builder._foo == null) _foo = null;
    else {
      final org.fudgemsg.proto.tests.ExternalMessage[] fudge0 = java.util.Arrays.copyOf (builder._foo, builder._foo.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        if (fudge0[fudge1] != null) {
        }
      }
      _foo = fudge0;
    }
  }
  public UsesExternArray (org.fudgemsg.proto.tests.ExternalMessage[] foo) {
    if (foo == null) _foo = null;
    else {
      foo = java.util.Arrays.copyOf (foo, foo.length);
      for (int fudge0 = 0; fudge0 < foo.length; fudge0++) {
        if (foo[fudge0] != null) {
        }
      }
      _foo = foo;
    }
  }
  protected UsesExternArray (final UsesExternArray source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._foo == null) _foo = null;
    else {
      final org.fudgemsg.proto.tests.ExternalMessage[] fudge0 = java.util.Arrays.copyOf (source._foo, source._foo.length);
      for (int fudge1 = 0; fudge1 < fudge0.length; fudge1++) {
        if (fudge0[fudge1] != null) {
        }
      }
      _foo = fudge0;
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.mapping.FudgeSerializationContext fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_foo != null)  {
      final org.fudgemsg.MutableFudgeFieldContainer fudge1 = fudgeContext.newMessage ();
      for (org.fudgemsg.proto.tests.ExternalMessage fudge2 : _foo) {
        if (fudge2 != null)  {
          fudgeContext.objectToFudgeMsg (fudge1, null, null, fudge2);
        }
        else {
          fudge1.add (null, null, org.fudgemsg.types.IndicatorType.INSTANCE);
        }
      }
      msg.add (FOO_KEY, null, fudge1);
    }
  }
  public static UsesExternArray fromFudgeMsg (final org.fudgemsg.mapping.FudgeDeserializationContext fudgeContext, final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.extern.UsesExternArray".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.extern.UsesExternArray)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.mapping.FudgeDeserializationContext.class, org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeContext, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeContext, fudgeMsg).build ();
  }
  public org.fudgemsg.proto.tests.ExternalMessage[] getFoo () {
    return _foo;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof UsesExternArray)) return false;
    UsesExternArray msg = (UsesExternArray)o;
    if (!java.util.Arrays.deepEquals (_foo, msg._foo)) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_foo != null)hc += java.util.Arrays.deepHashCode (_foo);
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
