// Automatically created - do not modify
// Created from binding.proto:17(9)
package org.fudgemsg.proto.tests.binding;
public class IdentificationDomain implements java.io.Serializable {
  private static final long serialVersionUID = -40374780829l;
  private final String _domainName;
  public static final String DOMAINNAME_KEY = "domainName";
  public IdentificationDomain (String domainName) {
    if (domainName == null) throw new NullPointerException ("domainName' cannot be null");
    _domainName = domainName;
  }
  protected IdentificationDomain (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (DOMAINNAME_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a IdentificationDomain - field 'domainName' is not present");
    try {
      _domainName = fudgeField.getValue ().toString ();
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a IdentificationDomain - field 'domainName' is not string", e);
    }
  }
  protected IdentificationDomain (final IdentificationDomain source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _domainName = source._domainName;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_domainName != null)  {
      msg.add (DOMAINNAME_KEY, null, _domainName);
    }
  }
  public static IdentificationDomain fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("org.fudgemsg.proto.tests.binding.IdentificationDomain".equals (className)) break;
      try {
        return (org.fudgemsg.proto.tests.binding.IdentificationDomain)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new IdentificationDomain (fudgeMsg);
  }
  public String getDomainName () {
    return _domainName;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof IdentificationDomain)) return false;
    IdentificationDomain msg = (IdentificationDomain)o;
    if (_domainName != null) {
      if (msg._domainName != null) {
        if (!_domainName.equals (msg._domainName)) return false;
      }
      else return false;
    }
    else if (msg._domainName != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_domainName != null) hc += _domainName.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
