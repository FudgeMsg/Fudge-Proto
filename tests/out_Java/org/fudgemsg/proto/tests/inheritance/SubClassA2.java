// Automatically created - do not modify
// Created from inheritance.proto:19(9)
package org.fudgemsg.proto.tests.inheritance;
public class SubClassA2 extends org.fudgemsg.proto.tests.inheritance.SubClassA implements java.io.Serializable {
  private static final long serialVersionUID = -6593094244036035402l;
  private final int _scA2_o;
  public static final String SCA2_O_KEY = "scA2_o";
  private final java.util.List<Integer> _scA2_r;
  public static final String SCA2_R_KEY = "scA2_r";
  private final int _scA2_q;
  public static final String SCA2_Q_KEY = "scA2_q";
  private final java.util.List<Integer> _scA2_rq;
  public static final String SCA2_RQ_KEY = "scA2_rq";
  public static class Builder extends org.fudgemsg.proto.tests.inheritance.SubClassA.Builder {
    private int _scA2_o;
    private java.util.List<Integer> _scA2_r;
    private final int _scA2_q;
    private final java.util.List<Integer> _scA2_rq;
    public Builder (int bcA_q, java.util.Collection<? extends Integer> bcA_rq, int scA_q, java.util.Collection<? extends Integer> scA_rq, int scA2_q, java.util.Collection<? extends Integer> scA2_rq) {
      super (bcA_q, bcA_rq, scA_q, scA_rq);
      _scA2_q = scA2_q;
      if (scA2_rq == null) throw new NullPointerException ("'scA2_rq' cannot be null");
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA2_rq);
        if (scA2_rq.size () == 0) throw new IllegalArgumentException ("'scA2_rq' cannot be an empty list");
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'scA2_rq' cannot be null");
        }
        _scA2_rq = fudge0;
      }
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      super (fudgeMsg);
      org.fudgemsg.FudgeField fudgeField;
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeField = fudgeMsg.getByName (SCA2_Q_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_q' is not present");
      try {
        _scA2_q = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_q' is not integer", e);
      }
      fudgeFields = fudgeMsg.getAllByName (SCA2_RQ_KEY);
      if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_rq' is not present");
      _scA2_rq = new java.util.ArrayList<Integer> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
        try {
          _scA2_rq.add (fudgeMsg.getFieldValue (Integer.class, fudge1));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_rq' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (SCA2_O_KEY);
      if (fudgeField != null)  {
        try {
          scA2_o (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_o' is not integer", e);
        }
      }
      fudgeFields = fudgeMsg.getAllByName (SCA2_R_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Integer> fudge1;
        fudge1 = new java.util.ArrayList<Integer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Integer.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a SubClassA2 - field 'scA2_r' is not integer", e);
          }
        }
        scA2_r (fudge1);
      }
    }
    public Builder scA2_o (int scA2_o) {
      _scA2_o = scA2_o;
      return this;
    }
    public Builder scA2_r (Integer scA2_r) {
      if (scA2_r == null) _scA2_r = null;
      else {
        _scA2_r = new java.util.ArrayList<Integer> (1);
        addScA2_r (scA2_r);
      }
      return this;
    }
    public Builder scA2_r (java.util.Collection<? extends Integer> scA2_r) {
      if (scA2_r == null) _scA2_r = null;
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA2_r);
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'scA2_r' cannot be null");
        }
        _scA2_r = fudge0;
      }
      return this;
    }
    public Builder addScA2_r (Integer scA2_r) {
      if (scA2_r == null) throw new NullPointerException ("'scA2_r' cannot be null");
      if (_scA2_r == null) _scA2_r = new java.util.ArrayList<Integer> ();
      _scA2_r.add (scA2_r);
      return this;
    }
    public SubClassA2 build () {
      return new SubClassA2 (this);
    }
  }
  protected SubClassA2 (final Builder builder) {
    super (builder);
    _scA2_o = builder._scA2_o;
    if (builder._scA2_r == null) _scA2_r = null;
    else {
      _scA2_r = new java.util.ArrayList<Integer> (builder._scA2_r);
    }
    _scA2_q = builder._scA2_q;
    if (builder._scA2_rq == null) _scA2_rq = null;
    else {
      _scA2_rq = new java.util.ArrayList<Integer> (builder._scA2_rq);
    }
  }
  public SubClassA2 (int bcA_o, java.util.Collection<? extends Integer> bcA_r, int bcA_q, java.util.Collection<? extends Integer> bcA_rq, int scA_o, java.util.Collection<? extends Integer> scA_r, int scA_q, java.util.Collection<? extends Integer> scA_rq, int scA2_o, java.util.Collection<? extends Integer> scA2_r, int scA2_q, java.util.Collection<? extends Integer> scA2_rq) {
    super (bcA_o, bcA_r, bcA_q, bcA_rq, scA_o, scA_r, scA_q, scA_rq);
    _scA2_o = scA2_o;
    if (scA2_r == null) _scA2_r = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA2_r);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'scA2_r' cannot be null");
      }
      _scA2_r = fudge0;
    }
    _scA2_q = scA2_q;
    if (scA2_rq == null) throw new NullPointerException ("'scA2_rq' cannot be null");
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (scA2_rq);
      if (scA2_rq.size () == 0) throw new IllegalArgumentException ("'scA2_rq' cannot be an empty list");
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'scA2_rq' cannot be null");
      }
      _scA2_rq = fudge0;
    }
  }
  protected SubClassA2 (final SubClassA2 source) {
    super (source);
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _scA2_o = source._scA2_o;
    if (source._scA2_r == null) _scA2_r = null;
    else {
      _scA2_r = new java.util.ArrayList<Integer> (source._scA2_r);
    }
    _scA2_q = source._scA2_q;
    if (source._scA2_rq == null) _scA2_rq = null;
    else {
      _scA2_rq = new java.util.ArrayList<Integer> (source._scA2_rq);
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
    msg.add (SCA2_O_KEY, null, _scA2_o);
    if (_scA2_r != null)  {
      for (Integer fudge1 : _scA2_r) {
        msg.add (SCA2_R_KEY, null, fudge1);
      }
    }
    msg.add (SCA2_Q_KEY, null, _scA2_q);
    if (_scA2_rq != null)  {
      for (Integer fudge1 : _scA2_rq) {
        msg.add (SCA2_RQ_KEY, null, fudge1);
      }
    }
  }
  public static SubClassA2 fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getScA2_o () {
    return _scA2_o;
  }
  public Integer getScA2_r () {
    return getScA2_r (0);
  }
  public int getScA2_rCount () {
    return (_scA2_r != null) ? _scA2_r.size () : 0;
  }
  public Integer getScA2_r (final int n) {
    if (_scA2_r == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _scA2_r.get (n);
  }
  public java.util.List<Integer> getScA2_rList () {
    return java.util.Collections.unmodifiableList (_scA2_r);
  }
  public int getScA2_q () {
    return _scA2_q;
  }
  public Integer getScA2_rq () {
    return getScA2_rq (0);
  }
  public int getScA2_rqCount () {
    return (_scA2_rq != null) ? _scA2_rq.size () : 0;
  }
  public Integer getScA2_rq (final int n) {
    if (_scA2_rq == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _scA2_rq.get (n);
  }
  public java.util.List<Integer> getScA2_rqList () {
    return java.util.Collections.unmodifiableList (_scA2_rq);
  }
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof SubClassA2)) return false;
    SubClassA2 msg = (SubClassA2)o;
    if (_scA2_o != msg._scA2_o) return false;
    if (_scA2_r != null) {
      if (msg._scA2_r != null) {
        if (!_scA2_r.equals (msg._scA2_r)) return false;
      }
      else return false;
    }
    else if (msg._scA2_r != null) return false;
    if (_scA2_q != msg._scA2_q) return false;
    if (_scA2_rq != null) {
      if (msg._scA2_rq != null) {
        if (!_scA2_rq.equals (msg._scA2_rq)) return false;
      }
      else return false;
    }
    else if (msg._scA2_rq != null) return false;
    return super.equals (msg);
  }
  public int hashCode () {
    int hc = super.hashCode ();
    hc = (hc * 31) + (int)_scA2_o;
    hc *= 31;
    if (_scA2_r != null) hc += _scA2_r.hashCode ();
    hc = (hc * 31) + (int)_scA2_q;
    hc *= 31;
    if (_scA2_rq != null) hc += _scA2_rq.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
