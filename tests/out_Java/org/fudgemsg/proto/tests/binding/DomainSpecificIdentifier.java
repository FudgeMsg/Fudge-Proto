// Automatically created - do not modify
// Created from binding.proto:5(9)
package org.fudgemsg.proto.tests.binding;
public class DomainSpecificIdentifier implements java.io.Serializable {
  				public DomainSpecificIdentifier (String domain, String value) {
					this (new IdentificationDomain (domain), value);
				}
  private static final long serialVersionUID = -39704635807967l;
  private final org.fudgemsg.proto.tests.binding.IdentificationDomain _domain;
  public static final String DOMAIN_KEY = "domain";
  private final String _value;
  public static final String VALUE_KEY = "value";
  public DomainSpecificIdentifier (org.fudgemsg.proto.tests.binding.IdentificationDomain domain, String value) {
    if (domain == null) throw new NullPointerException ("'domain' cannot be null");
    else {
      _domain = domain;
    }
    if (value == null) throw new NullPointerException ("value' cannot be null");
    _value = value;
  }
  protected DomainSpecificIdentifier (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    org.fudgemsg.FudgeField fudgeField;
    fudgeField = fudgeMsg.getByName (DOMAIN_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a DomainSpecificIdentifier - field 'domain' is not present");
    try {
      _domain = org.fudgemsg.proto.tests.binding.IdentificationDomain.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudgeField));
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a DomainSpecificIdentifier - field 'domain' is not IdentificationDomain message", e);
    }
    fudgeField = fudgeMsg.getByName (VALUE_KEY);
    if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a DomainSpecificIdentifier - field 'value' is not present");
    try {
      _value = fudgeField.getValue ().toString ();
    }
    catch (IllegalArgumentException e) {
      throw new IllegalArgumentException ("Fudge message is not a DomainSpecificIdentifier - field 'value' is not string", e);
    }
  }
  protected DomainSpecificIdentifier (final DomainSpecificIdentifier source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    if (source._domain == null) _domain = null;
    else {
      _domain = source._domain;
    }
    _value = source._value;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_domain != null)  {
      msg.add (DOMAIN_KEY, null, _domain.toFudgeMsg (fudgeContext));
    }
    if (_value != null)  {
      msg.add (VALUE_KEY, null, _value);
    }
  }
  public static DomainSpecificIdentifier fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new DomainSpecificIdentifier (fudgeMsg);
  }
  public org.fudgemsg.proto.tests.binding.IdentificationDomain getDomain () {
    return _domain;
  }
  public String getValue () {
    return _value;
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof DomainSpecificIdentifier)) return false;
    DomainSpecificIdentifier msg = (DomainSpecificIdentifier)o;
    if (_domain != null) {
      if (msg._domain != null) {
        if (!_domain.equals (msg._domain)) return false;
      }
      else return false;
    }
    else if (msg._domain != null) return false;
    if (_value != null) {
      if (msg._value != null) {
        if (!_value.equals (msg._value)) return false;
      }
      else return false;
    }
    else if (msg._value != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_domain != null) hc += _domain.hashCode ();
    hc *= 31;
    if (_value != null) hc += _value.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
