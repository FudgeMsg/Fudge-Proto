// Automatically created - do not modify
// Created from simple.proto:15(8)
public class Person implements java.io.Serializable {
  private static final long serialVersionUID = -1511890345953819044l;
  // Created from simple.proto:21(7)
  public enum PhoneType {
    MOBILE (0),
    HOME (1),
    WORK (2);
    private final int _fudgeEncoding;
    private PhoneType (final int fudgeEncoding) {
      _fudgeEncoding = fudgeEncoding;
    }
    public int getFudgeEncoding () {
      return _fudgeEncoding;
    }
    public static PhoneType fromFudgeEncoding (final int fudgeEncoding) {
      switch (fudgeEncoding) {
        case 0 : return MOBILE;
        case 1 : return HOME;
        case 2 : return WORK;
        default : throw new IllegalArgumentException ("field is not a PhoneType - invalid value '" + fudgeEncoding + "'");
      }
    }
  }
  // Created from simple.proto:27(10)
  public static class PhoneNumber implements java.io.Serializable {
    private static final long serialVersionUID = -32551788302850l;
    private final String _number;
    public static final String NUMBER_KEY = "number";
    private final Person.PhoneType _type;
    public static final String TYPE_KEY = "type";
    public static class Builder {
      private final String _number;
      private Person.PhoneType _type;
      public Builder (String number) {
        if (number == null) throw new NullPointerException ("number' cannot be null");
        _number = number;
        type (Person.PhoneType.HOME);
      }
      protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
        org.fudgemsg.FudgeField fudgeField;
        fudgeField = fudgeMsg.getByOrdinal (1);
        if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a PhoneNumber - field 'number' is not present");
        try {
          _number = fudgeField.getValue ().toString ();
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a PhoneNumber - field 'number' is not string", e);
        }
        fudgeField = fudgeMsg.getByOrdinal (2);
        if (fudgeField != null)  {
          try {
            final Person.PhoneType fudge1;
            fudge1 = Person.PhoneType.fromFudgeEncoding (fudgeMsg.getFieldValue (Integer.class, fudgeField));
            type (fudge1);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a PhoneNumber - field 'type' is not PhoneType enum", e);
          }
        }
      }
      public Builder type (Person.PhoneType type) {
        _type = type;
        return this;
      }
      public PhoneNumber build () {
        return new PhoneNumber (this);
      }
    }
    protected PhoneNumber (final Builder builder) {
      _number = builder._number;
      _type = builder._type;
    }
    public PhoneNumber (String number, Person.PhoneType type) {
      if (number == null) throw new NullPointerException ("number' cannot be null");
      _number = number;
      _type = type;
    }
    protected PhoneNumber (final PhoneNumber source) {
      if (source == null) throw new NullPointerException ("'source' must not be null");
      _number = source._number;
      _type = source._type;
    }
    public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
      if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
      final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
      toFudgeMsg (fudgeContext, msg);
      return msg;
    }
    public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
      if (_number != null)  {
        msg.add (NUMBER_KEY, 1, _number);
      }
      if (_type != null)  {
        msg.add (TYPE_KEY, 2, _type.getFudgeEncoding ());
      }
    }
    public static PhoneNumber fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
      for (org.fudgemsg.FudgeField field : types) {
        final String className = (String)field.getValue ();
        if ("Person.PhoneNumber".equals (className)) break;
        try {
          return (Person.PhoneNumber)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
        }
        catch (Throwable t) {
          // no-action
        }
      }
      return new Builder (fudgeMsg).build ();
    }
    public String getNumber () {
      return _number;
    }
    public Person.PhoneType getType () {
      return _type;
    }
    public boolean equals (final Object o) {
      if (o == this) return true;
      if (o == null) return false;
      if (!(o instanceof PhoneNumber)) return false;
      PhoneNumber msg = (PhoneNumber)o;
      if (_number != null) {
        if (msg._number != null) {
          if (!_number.equals (msg._number)) return false;
        }
        else return false;
      }
      else if (msg._number != null) return false;
      if (_type != null) {
        if (msg._type != null) {
          if (!_type.equals (msg._type)) return false;
        }
        else return false;
      }
      else if (msg._type != null) return false;
      return true;
    }
    public int hashCode () {
      int hc = 1;
      hc *= 31;
      if (_number != null) hc += _number.hashCode ();
      hc *= 31;
      if (_type != null) hc += _type.hashCode ();
      return hc;
    }
    public String toString () {
      return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
    }
  }
  private final String _name;
  public static final String NAME_KEY = "name";
  private final int _id;
  public static final String ID_KEY = "id";
  private final String _email;
  public static final String EMAIL_KEY = "email";
  private final java.util.List<Person.PhoneNumber> _phone;
  public static final String PHONE_KEY = "phone";
  public static class Builder {
    private final String _name;
    private final int _id;
    private String _email;
    private java.util.List<Person.PhoneNumber> _phone;
    public Builder (String name, int id) {
      if (name == null) throw new NullPointerException ("name' cannot be null");
      _name = name;
      _id = id;
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeField = fudgeMsg.getByOrdinal (1);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a Person - field 'name' is not present");
      try {
        _name = fudgeField.getValue ().toString ();
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a Person - field 'name' is not string", e);
      }
      fudgeField = fudgeMsg.getByOrdinal (2);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a Person - field 'id' is not present");
      try {
        _id = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a Person - field 'id' is not integer", e);
      }
      fudgeField = fudgeMsg.getByOrdinal (3);
      if (fudgeField != null)  {
        try {
          email (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Person - field 'email' is not string", e);
        }
      }
      fudgeFields = fudgeMsg.getAllByOrdinal (4);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Person.PhoneNumber> fudge1;
        fudge1 = new java.util.ArrayList<Person.PhoneNumber> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            final Person.PhoneNumber fudge3;
            fudge3 = Person.PhoneNumber.fromFudgeMsg (fudgeMsg.getFieldValue (org.fudgemsg.FudgeFieldContainer.class, fudge2));
            fudge1.add (fudge3);
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a Person - field 'phone' is not PhoneNumber message", e);
          }
        }
        phone (fudge1);
      }
    }
    public Builder email (String email) {
      _email = email;
      return this;
    }
    public Builder phone (Person.PhoneNumber phone) {
      if (phone == null) _phone = null;
      else {
        _phone = new java.util.ArrayList<Person.PhoneNumber> (1);
        addPhone (phone);
      }
      return this;
    }
    public Builder phone (java.util.Collection<? extends Person.PhoneNumber> phone) {
      if (phone == null) _phone = null;
      else {
        final java.util.List<Person.PhoneNumber> fudge0 = new java.util.ArrayList<Person.PhoneNumber> (phone);
        for (java.util.ListIterator<Person.PhoneNumber> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Person.PhoneNumber fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'phone' cannot be null");
          fudge1.set (fudge2);
        }
        _phone = fudge0;
      }
      return this;
    }
    public Builder addPhone (Person.PhoneNumber phone) {
      if (phone == null) throw new NullPointerException ("'phone' cannot be null");
      if (_phone == null) _phone = new java.util.ArrayList<Person.PhoneNumber> ();
      _phone.add (phone);
      return this;
    }
    public Person build () {
      return new Person (this);
    }
  }
  protected Person (final Builder builder) {
    _name = builder._name;
    _id = builder._id;
    _email = builder._email;
    if (builder._phone == null) _phone = null;
    else {
      final java.util.List<Person.PhoneNumber> fudge0 = new java.util.ArrayList<Person.PhoneNumber> (builder._phone);
      for (java.util.ListIterator<Person.PhoneNumber> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Person.PhoneNumber fudge2 = fudge1.next ();
        fudge1.set (fudge2);
      }
      _phone = fudge0;
    }
  }
  public Person (String name, int id, String email, java.util.Collection<? extends Person.PhoneNumber> phone) {
    if (name == null) throw new NullPointerException ("name' cannot be null");
    _name = name;
    _id = id;
    _email = email;
    if (phone == null) _phone = null;
    else {
      final java.util.List<Person.PhoneNumber> fudge0 = new java.util.ArrayList<Person.PhoneNumber> (phone);
      for (java.util.ListIterator<Person.PhoneNumber> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Person.PhoneNumber fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'phone' cannot be null");
        fudge1.set (fudge2);
      }
      _phone = fudge0;
    }
  }
  protected Person (final Person source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _name = source._name;
    _id = source._id;
    _email = source._email;
    if (source._phone == null) _phone = null;
    else {
      final java.util.List<Person.PhoneNumber> fudge0 = new java.util.ArrayList<Person.PhoneNumber> (source._phone);
      for (java.util.ListIterator<Person.PhoneNumber> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Person.PhoneNumber fudge2 = fudge1.next ();
        fudge1.set (fudge2);
      }
      _phone = fudge0;
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    if (_name != null)  {
      msg.add (NAME_KEY, 1, _name);
    }
    msg.add (ID_KEY, 2, _id);
    if (_email != null)  {
      msg.add (EMAIL_KEY, 3, _email);
    }
    if (_phone != null)  {
      for (Person.PhoneNumber fudge1 : _phone) {
        final org.fudgemsg.MutableFudgeFieldContainer fudge2 = fudgeContext.newMessage ();
        Class<?> fudge3 = fudge1.getClass ();
        while (!Person.PhoneNumber.class.equals (fudge3)) {
          fudge2.add (null, 0, org.fudgemsg.types.StringFieldType.INSTANCE, fudge3.getName ());
          fudge3 = fudge3.getSuperclass ();
        }
        fudge1.toFudgeMsg (fudgeContext, fudge2);
        msg.add (PHONE_KEY, 4, fudge2);
      }
    }
  }
  public static Person fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("Person".equals (className)) break;
      try {
        return (Person)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public String getName () {
    return _name;
  }
  public int getId () {
    return _id;
  }
  public String getEmail () {
    return _email;
  }
  public java.util.List<Person.PhoneNumber> getPhone () {
    return java.util.Collections.unmodifiableList (_phone);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Person)) return false;
    Person msg = (Person)o;
    if (_name != null) {
      if (msg._name != null) {
        if (!_name.equals (msg._name)) return false;
      }
      else return false;
    }
    else if (msg._name != null) return false;
    if (_id != msg._id) return false;
    if (_email != null) {
      if (msg._email != null) {
        if (!_email.equals (msg._email)) return false;
      }
      else return false;
    }
    else if (msg._email != null) return false;
    if (_phone != null) {
      if (msg._phone != null) {
        if (!_phone.equals (msg._phone)) return false;
      }
      else return false;
    }
    else if (msg._phone != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc *= 31;
    if (_name != null) hc += _name.hashCode ();
    hc = (hc * 31) + (int)_id;
    hc *= 31;
    if (_email != null) hc += _email.hashCode ();
    hc *= 31;
    if (_phone != null) hc += _phone.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
