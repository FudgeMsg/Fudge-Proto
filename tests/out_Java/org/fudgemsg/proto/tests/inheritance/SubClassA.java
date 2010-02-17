// Automatically created - do not modify
// Created from inheritance.proto:26(9)
package org.fudgemsg.proto.tests.inheritance;
public class SubClassA extends org.fudgemsg.proto.tests.inheritance.BaseClassA implements java.io.Serializable {
  private static final long serialVersionUID = 3008705679666207638l;
  private final int _scA_o;
  public static final String SCA_O_KEY = "scA_o";
  private final java.util.List<Integer> _scA_r;
  public static final String SCA_R_KEY = "scA_r";
  private final int _scA_q;
  public static final String SCA_Q_KEY = "scA_q";
  private final java.util.List<Integer> _scA_rq;
  public static final String SCA_RQ_KEY = "scA_rq";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.BaseClassA.Builder {
    private int _scA_o;
    private java.util.List<Integer> _scA_r;
    private final int _scA_q;
    private final java.util.List<Integer> _scA_rq;
    public Builder (int bcA_q, java.util.Collection<? extends Integer> bcA_rq, int scA_q, java.util.Collection<? extends Integer> scA_rq) {
      super (bcA_q, bcA_rq);
      _scA_q = scA_q;
      if (scA_rq == null) throw new NullPointerException ("'scA_rq' cannot be null");
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA_rq);
        if (scA_rq.size () == 0) throw new IllegalArgumentException ("'scA_rq' cannot be an empty list");
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'scA_rq' cannot be null");
        }
        _scA_rq = fudge0;
      }
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeField = fudgeMsg.getByName (SCA_Q_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_q' is not present");
      try {
        _scA_q = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_q' is not integer", e);
      }
      fudgeFields = fudgeMsg.getAllByName (SCA_RQ_KEY);
      if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_rq' is not present");
      _scA_rq = new java.util.ArrayList<Integer> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
        try {
          _scA_rq.add (fudgeMsg.getFieldValue (Integer.class, fudge1));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_rq' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (SCA_O_KEY);
      if (fudgeField != null)  {
        try {
          scA_o (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_o' is not integer", e);
        }
      }
      fudgeFields = fudgeMsg.getAllByName (SCA_R_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Integer> fudge1;
        fudge1 = new java.util.ArrayList<Integer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Integer.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a SubClassA - field 'scA_r' is not integer", e);
          }
        }
        scA_r (fudge1);
      }
    }
    public Builder scA_o (int scA_o) {
      _scA_o = scA_o;
      return this;
    }
    public Builder scA_r (Integer scA_r) {
      if (scA_r == null) _scA_r = null;
      else {
        _scA_r = new java.util.ArrayList<Integer> (1);
        addScA_r (scA_r);
      }
      return this;
    }
    public Builder scA_r (java.util.Collection<? extends Integer> scA_r) {
      if (scA_r == null) _scA_r = null;
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA_r);
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'scA_r' cannot be null");
        }
        _scA_r = fudge0;
      }
      return this;
    }
    public Builder addScA_r (Integer scA_r) {
      if (scA_r == null) throw new NullPointerException ("'scA_r' cannot be null");
      if (_scA_r == null) _scA_r = new java.util.ArrayList<Integer> ();
      _scA_r.add (scA_r);
      return this;
    }
    public SubClassA build () {
      return new SubClassA (this);
    }
  }
  protected SubClassA (final Builder builder) {
    super (builder);
    _scA_o = builder._scA_o;
    if (builder._scA_r == null) _scA_r = null;
    else {
      _scA_r = new java.util.ArrayList<Integer> (builder._scA_r);
    }
    _scA_q = builder._scA_q;
    if (builder._scA_rq == null) _scA_rq = null;
    else {
      _scA_rq = new java.util.ArrayList<Integer> (builder._scA_rq);
    }
  }
  public SubClassA (int bcA_o, java.util.Collection<? extends Integer> bcA_r, int bcA_q, java.util.Collection<? extends Integer> bcA_rq, int scA_o, java.util.Collection<? extends Integer> scA_r, int scA_q, java.util.Collection<? extends Integer> scA_rq) {
    super (bcA_o, bcA_r, bcA_q, bcA_rq);
    _scA_o = scA_o;
    if (scA_r == null) _scA_r = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA_r);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'scA_r' cannot be null");
      }
      _scA_r = fudge0;
    }
    _scA_q = scA_q;
    if (scA_rq == null) throw new NullPointerException ("'scA_rq' cannot be null");
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA_rq);
      if (scA_rq.size () == 0) throw new IllegalArgumentException ("'scA_rq' cannot be an empty list");
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'scA_rq' cannot be null");
      }
      _scA_rq = fudge0;
    }
  }
  protected SubClassA (final SubClassA source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _scA_o = source._scA_o;
    if (source._scA_r == null) _scA_r = null;
    else {
      _scA_r = new java.util.ArrayList<Integer> (source._scA_r);
    }
    _scA_q = source._scA_q;
    if (source._scA_rq == null) _scA_rq = null;
    else {
      _scA_rq = new java.util.ArrayList<Integer> (source._scA_rq);
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    super.toFudgeMsg (fudgeContext, msg);
    msg.add (SCA_O_KEY, null, _scA_o);
    if (_scA_r != null)  {
      for (Integer fudge1 : _scA_r) {
        msg.add (SCA_R_KEY, null, fudge1);
      }
    }
    msg.add (SCA_Q_KEY, null, _scA_q);
    if (_scA_rq != null)  {
      for (Integer fudge1 : _scA_rq) {
        msg.add (SCA_RQ_KEY, null, fudge1);
      }
    }
  }
  public static SubClassA fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getScA_o () {
    return _scA_o;
  }
  public Integer getScA_r () {
    return getScA_r (0);
  }
  public int getScA_rCount () {
    return (_scA_r != null) ? _scA_r.size () : 0;
  }
  public Integer getScA_r (final int n) {
    if (_scA_r == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _scA_r.get (n);
  }
  public java.util.List<Integer> getScA_rList () {
    return java.util.Collections.unmodifiableList (_scA_r);
  }
  public int getScA_q () {
    return _scA_q;
  }
  public Integer getScA_rq () {
    return getScA_rq (0);
  }
  public int getScA_rqCount () {
    return (_scA_rq != null) ? _scA_rq.size () : 0;
  }
  public Integer getScA_rq (final int n) {
    if (_scA_rq == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _scA_rq.get (n);
  }
  public java.util.List<Integer> getScA_rqList () {
    return java.util.Collections.unmodifiableList (_scA_rq);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof SubClassA)) return false;
    SubClassA msg = (SubClassA)o;
    if (_scA_o != msg._scA_o) return false;
    if (_scA_r != null) {
      if (msg._scA_r != null) {
        if (!_scA_r.equals (msg._scA_r)) return false;
      }
      else return false;
    }
    else if (msg._scA_r != null) return false;
    if (_scA_q != msg._scA_q) return false;
    if (_scA_rq != null) {
      if (msg._scA_rq != null) {
        if (!_scA_rq.equals (msg._scA_rq)) return false;
      }
      else return false;
    }
    else if (msg._scA_rq != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_scA_o;
    hc *= 31;
    if (_scA_r != null) hc += _scA_r.hashCode ();
    hc = (hc * 31) + (int)_scA_q;
    hc *= 31;
    if (_scA_rq != null) hc += _scA_rq.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
