// Automatically created - do not modify
// Created from inheritance.proto:5(9)
package org.fudgemsg.proto.tests.inheritance;
public class BaseClassA implements java.io.Serializable {
  private static final long serialVersionUID = 2576311616048591640l;
  private final int _bcA_o;
  public static final String BCA_O_KEY = "bcA_o";
  private final java.util.List<Integer> _bcA_r;
  public static final String BCA_R_KEY = "bcA_r";
  private final int _bcA_q;
  public static final String BCA_Q_KEY = "bcA_q";
  private final java.util.List<Integer> _bcA_rq;
  public static final String BCA_RQ_KEY = "bcA_rq";
  public static class Builder {
    private int _bcA_o;
    private java.util.List<Integer> _bcA_r;
    private final int _bcA_q;
    private final java.util.List<Integer> _bcA_rq;
    public Builder (int bcA_q, java.util.Collection<? extends Integer> bcA_rq) {
      _bcA_q = bcA_q;
      if (bcA_rq == null) throw new NullPointerException ("'bcA_rq' cannot be null");
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcA_rq);
        if (bcA_rq.size () == 0) throw new IllegalArgumentException ("'bcA_rq' cannot be an empty list");
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'bcA_rq' cannot be null");
        }
        _bcA_rq = fudge0;
      }
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      java.util.List<org.fudgemsg.FudgeField> fudgeFields;
      fudgeField = fudgeMsg.getByName (BCA_Q_KEY);
      if (fudgeField == null) throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_q' is not present");
      try {
        _bcA_q = fudgeMsg.getFieldValue (Integer.class, fudgeField);
      }
      catch (IllegalArgumentException e) {
        throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_q' is not integer", e);
      }
      fudgeFields = fudgeMsg.getAllByName (BCA_RQ_KEY);
      if (fudgeFields.size () == 0) throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_rq' is not present");
      _bcA_rq = new java.util.ArrayList<Integer> (fudgeFields.size ());
      for (org.fudgemsg.FudgeField fudge1 : fudgeFields) {
        try {
          _bcA_rq.add (fudgeMsg.getFieldValue (Integer.class, fudge1));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_rq' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (BCA_O_KEY);
      if (fudgeField != null)  {
        try {
          bcA_o (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_o' is not integer", e);
        }
      }
      fudgeFields = fudgeMsg.getAllByName (BCA_R_KEY);
      if (fudgeFields.size () > 0)  {
        final java.util.List<Integer> fudge1;
        fudge1 = new java.util.ArrayList<Integer> (fudgeFields.size ());
        for (org.fudgemsg.FudgeField fudge2 : fudgeFields) {
          try {
            fudge1.add (fudgeMsg.getFieldValue (Integer.class, fudge2));
          }
          catch (IllegalArgumentException e) {
            throw new IllegalArgumentException ("Fudge message is not a BaseClassA - field 'bcA_r' is not integer", e);
          }
        }
        bcA_r (fudge1);
      }
    }
    public Builder bcA_o (int bcA_o) {
      _bcA_o = bcA_o;
      return this;
    }
    public Builder bcA_r (Integer bcA_r) {
      if (bcA_r == null) _bcA_r = null;
      else {
        _bcA_r = new java.util.ArrayList<Integer> (1);
        addBcA_r (bcA_r);
      }
      return this;
    }
    public Builder bcA_r (java.util.Collection<? extends Integer> bcA_r) {
      if (bcA_r == null) _bcA_r = null;
      else {
        final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcA_r);
        for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
          Integer fudge2 = fudge1.next ();
          if (fudge2 == null) throw new NullPointerException ("List element of 'bcA_r' cannot be null");
        }
        _bcA_r = fudge0;
      }
      return this;
    }
    public Builder addBcA_r (Integer bcA_r) {
      if (bcA_r == null) throw new NullPointerException ("'bcA_r' cannot be null");
      if (_bcA_r == null) _bcA_r = new java.util.ArrayList<Integer> ();
      _bcA_r.add (bcA_r);
      return this;
    }
    public BaseClassA build () {
      return new BaseClassA (this);
    }
  }
  protected BaseClassA (final Builder builder) {
    _bcA_o = builder._bcA_o;
    if (builder._bcA_r == null) _bcA_r = null;
    else {
      _bcA_r = new java.util.ArrayList<Integer> (builder._bcA_r);
    }
    _bcA_q = builder._bcA_q;
    if (builder._bcA_rq == null) _bcA_rq = null;
    else {
      _bcA_rq = new java.util.ArrayList<Integer> (builder._bcA_rq);
    }
  }
  public BaseClassA (int bcA_o, java.util.Collection<? extends Integer> bcA_r, int bcA_q, java.util.Collection<? extends Integer> bcA_rq) {
    _bcA_o = bcA_o;
    if (bcA_r == null) _bcA_r = null;
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcA_r);
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'bcA_r' cannot be null");
      }
      _bcA_r = fudge0;
    }
    _bcA_q = bcA_q;
    if (bcA_rq == null) throw new NullPointerException ("'bcA_rq' cannot be null");
    else {
      final java.util.List<Integer> fudge0 = new java.util.ArrayList<Integer> (bcA_rq);
      if (bcA_rq.size () == 0) throw new IllegalArgumentException ("'bcA_rq' cannot be an empty list");
      for (java.util.ListIterator<Integer> fudge1 = fudge0.listIterator (); fudge1.hasNext (); ) {
        Integer fudge2 = fudge1.next ();
        if (fudge2 == null) throw new NullPointerException ("List element of 'bcA_rq' cannot be null");
      }
      _bcA_rq = fudge0;
    }
  }
  protected BaseClassA (final BaseClassA source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _bcA_o = source._bcA_o;
    if (source._bcA_r == null) _bcA_r = null;
    else {
      _bcA_r = new java.util.ArrayList<Integer> (source._bcA_r);
    }
    _bcA_q = source._bcA_q;
    if (source._bcA_rq == null) _bcA_rq = null;
    else {
      _bcA_rq = new java.util.ArrayList<Integer> (source._bcA_rq);
    }
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (BCA_O_KEY, null, _bcA_o);
    if (_bcA_r != null)  {
      for (Integer fudge1 : _bcA_r) {
        msg.add (BCA_R_KEY, null, fudge1);
      }
    }
    msg.add (BCA_Q_KEY, null, _bcA_q);
    if (_bcA_rq != null)  {
      for (Integer fudge1 : _bcA_rq) {
        msg.add (BCA_RQ_KEY, null, fudge1);
      }
    }
  }
  public static BaseClassA fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public int getBcA_o () {
    return _bcA_o;
  }
  public Integer getBcA_r () {
    return getBcA_r (0);
  }
  public int getBcA_rCount () {
    return (_bcA_r != null) ? _bcA_r.size () : 0;
  }
  public Integer getBcA_r (final int n) {
    if (_bcA_r == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _bcA_r.get (n);
  }
  public java.util.List<Integer> getBcA_rList () {
    return java.util.Collections.unmodifiableList (_bcA_r);
  }
  public int getBcA_q () {
    return _bcA_q;
  }
  public Integer getBcA_rq () {
    return getBcA_rq (0);
  }
  public int getBcA_rqCount () {
    return (_bcA_rq != null) ? _bcA_rq.size () : 0;
  }
  public Integer getBcA_rq (final int n) {
    if (_bcA_rq == null)  {
      if (n == 0) return null;
      throw new IndexOutOfBoundsException ("n=" + n);
    }
    return _bcA_rq.get (n);
  }
  public java.util.List<Integer> getBcA_rqList () {
    return java.util.Collections.unmodifiableList (_bcA_rq);
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof BaseClassA)) return false;
    BaseClassA msg = (BaseClassA)o;
    if (_bcA_o != msg._bcA_o) return false;
    if (_bcA_r != null) {
      if (msg._bcA_r != null) {
        if (!_bcA_r.equals (msg._bcA_r)) return false;
      }
      else return false;
    }
    else if (msg._bcA_r != null) return false;
    if (_bcA_q != msg._bcA_q) return false;
    if (_bcA_rq != null) {
      if (msg._bcA_rq != null) {
        if (!_bcA_rq.equals (msg._bcA_rq)) return false;
      }
      else return false;
    }
    else if (msg._bcA_rq != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_bcA_o;
    hc *= 31;
    if (_bcA_r != null) hc += _bcA_r.hashCode ();
    hc = (hc * 31) + (int)_bcA_q;
    hc *= 31;
    if (_bcA_rq != null) hc += _bcA_rq.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
