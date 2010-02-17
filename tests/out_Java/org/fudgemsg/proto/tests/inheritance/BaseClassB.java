// Automatically created - do not modify
// Created from inheritance.proto:12(9)
package org.fudgemsg.proto.tests.inheritance;
public class BaseClassB implements java.io.Serializable {
  private static final long serialVersionUID = 2576338083212919094l;
  private final int _bcB_o;
  public static final String BCB_O_KEY = "bcB_o";
  private final java.util.List<Integer> _bcB_r;
  public static final String BCB_R_KEY = "bcB_r";
  private final int _bcB_q;
  public static final String BCB_Q_KEY = "bcB_q";
  private final java.util.List<Integer> _bcB_rq;
  public static final String BCB_RQ_KEY = "bcB_rq";
  public static class Builder {
    private int _bcB_o;
    private java.util.List<Integer> _bcB_r;
    private final int _bcB_q;
    private final java.util.List<Integer> _bcB_rq;
    public Builder (int bcB_q, java.util.Collection<? extends Integer> bcB_rq) {
      _bcB_q = bcB_q;
      if (bcB_rq == null) throw new NullPointerException ("'bcB_rq' cannot be null");
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcB_rq);
        if (bcB_rq.size () == 0) throw new IllegalArgumentException ("'bcB_rq' cannot be an empty list");
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'bcB_rq' cannot be null");
        }
        _bcB_rq = fudge0;
      }
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeField = fudgeMsg.getByName (BCB_Q_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_q' is not present");
      try {
        _bcB_q = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_q' is not integer", e);
      }
      fudgeFields = fudgeMsg.getAllByName (BCB_RQ_KEY);
      if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_rq' is not present");
      _bcB_rq = new java.util.ArrayList<Integer> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
        try {
          _bcB_rq.add (fudgeMsg.getFieldValue (Integer.class, fudge1));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_rq' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (BCB_O_KEY);
      if (fudgeField != null)  {
        try {
          bcB_o (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_o' is not integer", e);
        }
      }
      fudgeFields = fudgeMsg.getAllByName (BCB_R_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Integer> fudge1;
        fudge1 = new java.util.ArrayList<Integer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Integer.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a BaseClassB - field 'bcB_r' is not integer", e);
          }
        }
        bcB_r (fudge1);
      }
    }
    public Builder bcB_o (int bcB_o) {
      _bcB_o = bcB_o;
      return this;
    }
    public Builder bcB_r (Integer bcB_r) {
      if (bcB_r == null) _bcB_r = null;
      else {
        _bcB_r = new java.util.ArrayList<Integer> (1);
        addBcB_r (bcB_r);
      }
      return this;
    }
    public Builder bcB_r (java.util.Collection<? extends Integer> bcB_r) {
      if (bcB_r == null) _bcB_r = null;
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcB_r);
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'bcB_r' cannot be null");
        }
        _bcB_r = fudge0;
      }
      return this;
    }
    public Builder addBcB_r (Integer bcB_r) {
      if (bcB_r == null) throw new NullPointerException ("'bcB_r' cannot be null");
      if (_bcB_r == null) _bcB_r = new java.util.ArrayList<Integer> ();
      _bcB_r.add (bcB_r);
      return this;
    }
    public BaseClassB build () {
      return new BaseClassB (this);
    }
  }
  protected BaseClassB (final Builder builder) {
    _bcB_o = builder._bcB_o;
    if (builder._bcB_r == null) _bcB_r = null;
    else {
      _bcB_r = new java.util.ArrayList<Integer> (builder._bcB_r);
    }
    _bcB_q = builder._bcB_q;
    if (builder._bcB_rq == null) _bcB_rq = null;
    else {
      _bcB_rq = new java.util.ArrayList<Integer> (builder._bcB_rq);
    }
  }
  public BaseClassB (int bcB_o, java.util.Collection<? extends Integer> bcB_r, int bcB_q, java.util.Collection<? extends Integer> bcB_rq) {
    _bcB_o = bcB_o;
    if (bcB_r == null) _bcB_r = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcB_r);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'bcB_r' cannot be null");
      }
      _bcB_r = fudge0;
    }
    _bcB_q = bcB_q;
    if (bcB_rq == null) throw new NullPointerException ("'bcB_rq' cannot be null");
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcB_rq);
      if (bcB_rq.size () == 0) throw new IllegalArgumentException ("'bcB_rq' cannot be an empty list");
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'bcB_rq' cannot be null");
      }
      _bcB_rq = fudge0;
    }
  }
  protected BaseClassB (final BaseClassB source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _bcB_o = source._bcB_o;
    if (source._bcB_r == null) _bcB_r = null;
    else {
      _bcB_r = new java.util.ArrayList<Integer> (source._bcB_r);
    }
    _bcB_q = source._bcB_q;
    if (source._bcB_rq == null) _bcB_rq = null;
    else {
      _bcB_rq = new java.util.ArrayList<Integer> (source._bcB_rq);
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (BCB_O_KEY, null, _bcB_o);
    if (_bcB_r != null)  {
      for (Integer fudge1 : _bcB_r) {
        msg.add (BCB_R_KEY, null, fudge1);
      }
    }
    msg.add (BCB_Q_KEY, null, _bcB_q);
    if (_bcB_rq != null)  {
      for (Integer fudge1 : _bcB_rq) {
        msg.add (BCB_RQ_KEY, null, fudge1);
      }
    }
  }
  public static BaseClassB fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getBcB_o () {
    return _bcB_o;
  }
  public Integer getBcB_r () {
    return getBcB_r (0);
  }
  public int getBcB_rCount () {
    return (_bcB_r != null) ? _bcB_r.size () : 0;
  }
  public Integer getBcB_r (final int n) {
    if (_bcB_r == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _bcB_r.get (n);
  }
  public java.util.List<Integer> getBcB_rList () {
    return java.util.Collections.unmodifiableList (_bcB_r);
  }
  public int getBcB_q () {
    return _bcB_q;
  }
  public Integer getBcB_rq () {
    return getBcB_rq (0);
  }
  public int getBcB_rqCount () {
    return (_bcB_rq != null) ? _bcB_rq.size () : 0;
  }
  public Integer getBcB_rq (final int n) {
    if (_bcB_rq == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _bcB_rq.get (n);
  }
  public java.util.List<Integer> getBcB_rqList () {
    return java.util.Collections.unmodifiableList (_bcB_rq);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof BaseClassB)) return false;
    BaseClassB msg = (BaseClassB)o;
    if (_bcB_o != msg._bcB_o) return false;
    if (_bcB_r != null) {
      if (msg._bcB_r != null) {
        if (!_bcB_r.equals (msg._bcB_r)) return false;
      }
      else return false;
    }
    else if (msg._bcB_r != null) return false;
    if (_bcB_q != msg._bcB_q) return false;
    if (_bcB_rq != null) {
      if (msg._bcB_rq != null) {
        if (!_bcB_rq.equals (msg._bcB_rq)) return false;
      }
      else return false;
    }
    else if (msg._bcB_rq != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_bcB_o;
    hc *= 31;
    if (_bcB_r != null) hc += _bcB_r.hashCode ();
    hc = (hc * 31) + (int)_bcB_q;
    hc *= 31;
    if (_bcB_rq != null) hc += _bcB_rq.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
