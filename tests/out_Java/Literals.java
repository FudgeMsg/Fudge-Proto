// Automatically created - do not modify
// Created from Literals.proto:3(8)
public class Literals implements java.io.Serializable {
  private static final long serialVersionUID = 2215538162932658061l;
  private final double _nullDouble;
  public static final String NULLDOUBLE_KEY = "nullDouble";
  private final double _zeroDouble;
  public static final String ZERODOUBLE_KEY = "zeroDouble";
  private final double _posDouble;
  public static final String POSDOUBLE_KEY = "posDouble";
  private final double _negDouble;
  public static final String NEGDOUBLE_KEY = "negDouble";
  private final double _piDouble;
  public static final String PIDOUBLE_KEY = "piDouble";
  private final double _bigDouble;
  public static final String BIGDOUBLE_KEY = "bigDouble";
  private final double _tinyDouble;
  public static final String TINYDOUBLE_KEY = "tinyDouble";
  private final float _nullFloat;
  public static final String NULLFLOAT_KEY = "nullFloat";
  private final float _zeroFloat;
  public static final String ZEROFLOAT_KEY = "zeroFloat";
  private final float _posFloat;
  public static final String POSFLOAT_KEY = "posFloat";
  private final float _negFloat;
  public static final String NEGFLOAT_KEY = "negFloat";
  private final float _piFloat;
  public static final String PIFLOAT_KEY = "piFloat";
  private final float _bigFloat;
  public static final String BIGFLOAT_KEY = "bigFloat";
  private final float _tinyFloat;
  public static final String TINYFLOAT_KEY = "tinyFloat";
  private final int _nullInt;
  public static final String NULLINT_KEY = "nullInt";
  private final int _zeroInt;
  public static final String ZEROINT_KEY = "zeroInt";
  private final int _posInt;
  public static final String POSINT_KEY = "posInt";
  private final int _negInt;
  public static final String NEGINT_KEY = "negInt";
  private final String _nullString;
  public static final String NULLSTRING_KEY = "nullString";
  private final String _emptyString;
  public static final String EMPTYSTRING_KEY = "emptyString";
  private final String _simpleString;
  public static final String SIMPLESTRING_KEY = "simpleString";
  private final String _escapeString;
  public static final String ESCAPESTRING_KEY = "escapeString";
  public static class Builder {
    private double _nullDouble;
    private double _zeroDouble;
    private double _posDouble;
    private double _negDouble;
    private double _piDouble;
    private double _bigDouble;
    private double _tinyDouble;
    private float _nullFloat;
    private float _zeroFloat;
    private float _posFloat;
    private float _negFloat;
    private float _piFloat;
    private float _bigFloat;
    private float _tinyFloat;
    private int _nullInt;
    private int _zeroInt;
    private int _posInt;
    private int _negInt;
    private String _nullString;
    private String _emptyString;
    private String _simpleString;
    private String _escapeString;
    public Builder () {
      zeroDouble (0.0);
      posDouble (4.0);
      negDouble (-4.0);
      piDouble (3.141592);
      bigDouble (3.0E8);
      tinyDouble (3.0E-8);
      zeroFloat (0.0f);
      posFloat (4.0f);
      negFloat (-4.0f);
      piFloat (3.141592f);
      bigFloat (3.0E8f);
      tinyFloat (3.0E-8f);
      zeroInt (0);
      posInt (42);
      negInt (-42);
      emptyString ("");
      simpleString ("abc123");
      escapeString ("\"\\\r\n\"\0\377");
    }
    protected Builder (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
      org.fudgemsg.FudgeField fudgeField;
      fudgeField = fudgeMsg.getByName (NULLDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          nullDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'nullDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (ZERODOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          zeroDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'zeroDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (POSDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          posDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'posDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NEGDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          negDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'negDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (PIDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          piDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'piDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (BIGDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          bigDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'bigDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (TINYDOUBLE_KEY);
      if (fudgeField != null)  {
        try {
          tinyDouble (fudgeMsg.getFieldValue (Double.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'tinyDouble' is not double", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NULLFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          nullFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'nullFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (ZEROFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          zeroFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'zeroFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (POSFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          posFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'posFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NEGFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          negFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'negFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (PIFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          piFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'piFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (BIGFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          bigFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'bigFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (TINYFLOAT_KEY);
      if (fudgeField != null)  {
        try {
          tinyFloat (fudgeMsg.getFieldValue (Float.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'tinyFloat' is not float", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NULLINT_KEY);
      if (fudgeField != null)  {
        try {
          nullInt (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'nullInt' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (ZEROINT_KEY);
      if (fudgeField != null)  {
        try {
          zeroInt (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'zeroInt' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (POSINT_KEY);
      if (fudgeField != null)  {
        try {
          posInt (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'posInt' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NEGINT_KEY);
      if (fudgeField != null)  {
        try {
          negInt (fudgeMsg.getFieldValue (Integer.class, fudgeField));
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'negInt' is not integer", e);
        }
      }
      fudgeField = fudgeMsg.getByName (NULLSTRING_KEY);
      if (fudgeField != null)  {
        try {
          nullString (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'nullString' is not string", e);
        }
      }
      fudgeField = fudgeMsg.getByName (EMPTYSTRING_KEY);
      if (fudgeField != null)  {
        try {
          emptyString (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'emptyString' is not string", e);
        }
      }
      fudgeField = fudgeMsg.getByName (SIMPLESTRING_KEY);
      if (fudgeField != null)  {
        try {
          simpleString (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'simpleString' is not string", e);
        }
      }
      fudgeField = fudgeMsg.getByName (ESCAPESTRING_KEY);
      if (fudgeField != null)  {
        try {
          escapeString (fudgeField.getValue ().toString ());
        }
        catch (IllegalArgumentException e) {
          throw new IllegalArgumentException ("Fudge message is not a Literals - field 'escapeString' is not string", e);
        }
      }
    }
    public Builder nullDouble (double nullDouble) {
      _nullDouble = nullDouble;
      return this;
    }
    public Builder zeroDouble (double zeroDouble) {
      _zeroDouble = zeroDouble;
      return this;
    }
    public Builder posDouble (double posDouble) {
      _posDouble = posDouble;
      return this;
    }
    public Builder negDouble (double negDouble) {
      _negDouble = negDouble;
      return this;
    }
    public Builder piDouble (double piDouble) {
      _piDouble = piDouble;
      return this;
    }
    public Builder bigDouble (double bigDouble) {
      _bigDouble = bigDouble;
      return this;
    }
    public Builder tinyDouble (double tinyDouble) {
      _tinyDouble = tinyDouble;
      return this;
    }
    public Builder nullFloat (float nullFloat) {
      _nullFloat = nullFloat;
      return this;
    }
    public Builder zeroFloat (float zeroFloat) {
      _zeroFloat = zeroFloat;
      return this;
    }
    public Builder posFloat (float posFloat) {
      _posFloat = posFloat;
      return this;
    }
    public Builder negFloat (float negFloat) {
      _negFloat = negFloat;
      return this;
    }
    public Builder piFloat (float piFloat) {
      _piFloat = piFloat;
      return this;
    }
    public Builder bigFloat (float bigFloat) {
      _bigFloat = bigFloat;
      return this;
    }
    public Builder tinyFloat (float tinyFloat) {
      _tinyFloat = tinyFloat;
      return this;
    }
    public Builder nullInt (int nullInt) {
      _nullInt = nullInt;
      return this;
    }
    public Builder zeroInt (int zeroInt) {
      _zeroInt = zeroInt;
      return this;
    }
    public Builder posInt (int posInt) {
      _posInt = posInt;
      return this;
    }
    public Builder negInt (int negInt) {
      _negInt = negInt;
      return this;
    }
    public Builder nullString (String nullString) {
      _nullString = nullString;
      return this;
    }
    public Builder emptyString (String emptyString) {
      _emptyString = emptyString;
      return this;
    }
    public Builder simpleString (String simpleString) {
      _simpleString = simpleString;
      return this;
    }
    public Builder escapeString (String escapeString) {
      _escapeString = escapeString;
      return this;
    }
    public Literals build () {
      return new Literals (this);
    }
  }
  protected Literals (final Builder builder) {
    _nullDouble = builder._nullDouble;
    _zeroDouble = builder._zeroDouble;
    _posDouble = builder._posDouble;
    _negDouble = builder._negDouble;
    _piDouble = builder._piDouble;
    _bigDouble = builder._bigDouble;
    _tinyDouble = builder._tinyDouble;
    _nullFloat = builder._nullFloat;
    _zeroFloat = builder._zeroFloat;
    _posFloat = builder._posFloat;
    _negFloat = builder._negFloat;
    _piFloat = builder._piFloat;
    _bigFloat = builder._bigFloat;
    _tinyFloat = builder._tinyFloat;
    _nullInt = builder._nullInt;
    _zeroInt = builder._zeroInt;
    _posInt = builder._posInt;
    _negInt = builder._negInt;
    _nullString = builder._nullString;
    _emptyString = builder._emptyString;
    _simpleString = builder._simpleString;
    _escapeString = builder._escapeString;
  }
  public Literals (double nullDouble, double zeroDouble, double posDouble, double negDouble, double piDouble, double bigDouble, double tinyDouble, float nullFloat, float zeroFloat, float posFloat, float negFloat, float piFloat, float bigFloat, float tinyFloat, int nullInt, int zeroInt, int posInt, int negInt, String nullString, String emptyString, String simpleString, String escapeString) {
    _nullDouble = nullDouble;
    _zeroDouble = zeroDouble;
    _posDouble = posDouble;
    _negDouble = negDouble;
    _piDouble = piDouble;
    _bigDouble = bigDouble;
    _tinyDouble = tinyDouble;
    _nullFloat = nullFloat;
    _zeroFloat = zeroFloat;
    _posFloat = posFloat;
    _negFloat = negFloat;
    _piFloat = piFloat;
    _bigFloat = bigFloat;
    _tinyFloat = tinyFloat;
    _nullInt = nullInt;
    _zeroInt = zeroInt;
    _posInt = posInt;
    _negInt = negInt;
    _nullString = nullString;
    _emptyString = emptyString;
    _simpleString = simpleString;
    _escapeString = escapeString;
  }
  protected Literals (final Literals source) {
    if (source == null) throw new NullPointerException ("'source' must not be null");
    _nullDouble = source._nullDouble;
    _nullFloat = source._nullFloat;
    _nullInt = source._nullInt;
    _nullString = source._nullString;
    _zeroDouble = source._zeroDouble;
    _posDouble = source._posDouble;
    _negDouble = source._negDouble;
    _piDouble = source._piDouble;
    _bigDouble = source._bigDouble;
    _tinyDouble = source._tinyDouble;
    _zeroFloat = source._zeroFloat;
    _posFloat = source._posFloat;
    _negFloat = source._negFloat;
    _piFloat = source._piFloat;
    _bigFloat = source._bigFloat;
    _tinyFloat = source._tinyFloat;
    _zeroInt = source._zeroInt;
    _posInt = source._posInt;
    _negInt = source._negInt;
    _emptyString = source._emptyString;
    _simpleString = source._simpleString;
    _escapeString = source._escapeString;
  }
  public org.fudgemsg.FudgeFieldContainer toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext) {
    if (fudgeContext == null) throw new NullPointerException ("fudgeContext must not be null");
    final org.fudgemsg.MutableFudgeFieldContainer msg = fudgeContext.newMessage ();
    toFudgeMsg (fudgeContext, msg);
    return msg;
  }
  public void toFudgeMsg (final org.fudgemsg.FudgeMessageFactory fudgeContext, final org.fudgemsg.MutableFudgeFieldContainer msg) {
    msg.add (NULLDOUBLE_KEY, null, _nullDouble);
    msg.add (ZERODOUBLE_KEY, null, _zeroDouble);
    msg.add (POSDOUBLE_KEY, null, _posDouble);
    msg.add (NEGDOUBLE_KEY, null, _negDouble);
    msg.add (PIDOUBLE_KEY, null, _piDouble);
    msg.add (BIGDOUBLE_KEY, null, _bigDouble);
    msg.add (TINYDOUBLE_KEY, null, _tinyDouble);
    msg.add (NULLFLOAT_KEY, null, _nullFloat);
    msg.add (ZEROFLOAT_KEY, null, _zeroFloat);
    msg.add (POSFLOAT_KEY, null, _posFloat);
    msg.add (NEGFLOAT_KEY, null, _negFloat);
    msg.add (PIFLOAT_KEY, null, _piFloat);
    msg.add (BIGFLOAT_KEY, null, _bigFloat);
    msg.add (TINYFLOAT_KEY, null, _tinyFloat);
    msg.add (NULLINT_KEY, null, _nullInt);
    msg.add (ZEROINT_KEY, null, _zeroInt);
    msg.add (POSINT_KEY, null, _posInt);
    msg.add (NEGINT_KEY, null, _negInt);
    if (_nullString != null)  {
      msg.add (NULLSTRING_KEY, null, _nullString);
    }
    if (_emptyString != null)  {
      msg.add (EMPTYSTRING_KEY, null, _emptyString);
    }
    if (_simpleString != null)  {
      msg.add (SIMPLESTRING_KEY, null, _simpleString);
    }
    if (_escapeString != null)  {
      msg.add (ESCAPESTRING_KEY, null, _escapeString);
    }
  }
  public static Literals fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg) {
    return new Builder (fudgeMsg).build ();
  }
  public double getNullDouble () {
    return _nullDouble;
  }
  public double getZeroDouble () {
    return _zeroDouble;
  }
  public double getPosDouble () {
    return _posDouble;
  }
  public double getNegDouble () {
    return _negDouble;
  }
  public double getPiDouble () {
    return _piDouble;
  }
  public double getBigDouble () {
    return _bigDouble;
  }
  public double getTinyDouble () {
    return _tinyDouble;
  }
  public float getNullFloat () {
    return _nullFloat;
  }
  public float getZeroFloat () {
    return _zeroFloat;
  }
  public float getPosFloat () {
    return _posFloat;
  }
  public float getNegFloat () {
    return _negFloat;
  }
  public float getPiFloat () {
    return _piFloat;
  }
  public float getBigFloat () {
    return _bigFloat;
  }
  public float getTinyFloat () {
    return _tinyFloat;
  }
  public int getNullInt () {
    return _nullInt;
  }
  public int getZeroInt () {
    return _zeroInt;
  }
  public int getPosInt () {
    return _posInt;
  }
  public int getNegInt () {
    return _negInt;
  }
  public String getNullString () {
    return _nullString;
  }
  public String getEmptyString () {
    return _emptyString;
  }
  public String getSimpleString () {
    return _simpleString;
  }
  public String getEscapeString () {
    return _escapeString;
  }
  public boolean equals (final Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Literals)) return false;
    Literals msg = (Literals)o;
    if (_nullDouble != msg._nullDouble) return false;
    if (_zeroDouble != msg._zeroDouble) return false;
    if (_posDouble != msg._posDouble) return false;
    if (_negDouble != msg._negDouble) return false;
    if (_piDouble != msg._piDouble) return false;
    if (_bigDouble != msg._bigDouble) return false;
    if (_tinyDouble != msg._tinyDouble) return false;
    if (_nullFloat != msg._nullFloat) return false;
    if (_zeroFloat != msg._zeroFloat) return false;
    if (_posFloat != msg._posFloat) return false;
    if (_negFloat != msg._negFloat) return false;
    if (_piFloat != msg._piFloat) return false;
    if (_bigFloat != msg._bigFloat) return false;
    if (_tinyFloat != msg._tinyFloat) return false;
    if (_nullInt != msg._nullInt) return false;
    if (_zeroInt != msg._zeroInt) return false;
    if (_posInt != msg._posInt) return false;
    if (_negInt != msg._negInt) return false;
    if (_nullString != null) {
      if (msg._nullString != null) {
        if (!_nullString.equals (msg._nullString)) return false;
      }
      else return false;
    }
    else if (msg._nullString != null) return false;
    if (_emptyString != null) {
      if (msg._emptyString != null) {
        if (!_emptyString.equals (msg._emptyString)) return false;
      }
      else return false;
    }
    else if (msg._emptyString != null) return false;
    if (_simpleString != null) {
      if (msg._simpleString != null) {
        if (!_simpleString.equals (msg._simpleString)) return false;
      }
      else return false;
    }
    else if (msg._simpleString != null) return false;
    if (_escapeString != null) {
      if (msg._escapeString != null) {
        if (!_escapeString.equals (msg._escapeString)) return false;
      }
      else return false;
    }
    else if (msg._escapeString != null) return false;
    return true;
  }
  public int hashCode () {
    int hc = 1;
    hc = (hc * 31) + (int)_nullDouble;
    hc = (hc * 31) + (int)_zeroDouble;
    hc = (hc * 31) + (int)_posDouble;
    hc = (hc * 31) + (int)_negDouble;
    hc = (hc * 31) + (int)_piDouble;
    hc = (hc * 31) + (int)_bigDouble;
    hc = (hc * 31) + (int)_tinyDouble;
    hc = (hc * 31) + (int)_nullFloat;
    hc = (hc * 31) + (int)_zeroFloat;
    hc = (hc * 31) + (int)_posFloat;
    hc = (hc * 31) + (int)_negFloat;
    hc = (hc * 31) + (int)_piFloat;
    hc = (hc * 31) + (int)_bigFloat;
    hc = (hc * 31) + (int)_tinyFloat;
    hc = (hc * 31) + (int)_nullInt;
    hc = (hc * 31) + (int)_zeroInt;
    hc = (hc * 31) + (int)_posInt;
    hc = (hc * 31) + (int)_negInt;
    hc *= 31;
    if (_nullString != null) hc += _nullString.hashCode ();
    hc *= 31;
    if (_emptyString != null) hc += _emptyString.hashCode ();
    hc *= 31;
    if (_simpleString != null) hc += _simpleString.hashCode ();
    hc *= 31;
    if (_escapeString != null) hc += _escapeString.hashCode ();
    return hc;
  }
  public String toString () {
    return org.apache.commons.lang.builder.ToStringBuilder.reflectionToString(this, org.apache.commons.lang.builder.ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
