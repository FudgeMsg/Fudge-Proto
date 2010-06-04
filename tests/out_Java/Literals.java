// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from Literals.proto:3(8)
public class Literals implements java.io.Serializable {
  private static final long serialVersionUID = -6304599754091825719l;
  private final Double _nullDouble;
  public static final String NULLDOUBLE_KEY = "nullDouble";
  private final Double _zeroDouble;
  public static final String ZERODOUBLE_KEY = "zeroDouble";
  private final Double _posDouble;
  public static final String POSDOUBLE_KEY = "posDouble";
  private final Double _negDouble;
  public static final String NEGDOUBLE_KEY = "negDouble";
  private final Double _piDouble;
  public static final String PIDOUBLE_KEY = "piDouble";
  private final Double _bigDouble;
  public static final String BIGDOUBLE_KEY = "bigDouble";
  private final Double _tinyDouble;
  public static final String TINYDOUBLE_KEY = "tinyDouble";
  private final Float _nullFloat;
  public static final String NULLFLOAT_KEY = "nullFloat";
  private final Float _zeroFloat;
  public static final String ZEROFLOAT_KEY = "zeroFloat";
  private final Float _posFloat;
  public static final String POSFLOAT_KEY = "posFloat";
  private final Float _negFloat;
  public static final String NEGFLOAT_KEY = "negFloat";
  private final Float _piFloat;
  public static final String PIFLOAT_KEY = "piFloat";
  private final Float _bigFloat;
  public static final String BIGFLOAT_KEY = "bigFloat";
  private final Float _tinyFloat;
  public static final String TINYFLOAT_KEY = "tinyFloat";
  private final Integer _nullInt;
  public static final String NULLINT_KEY = "nullInt";
  private final Integer _zeroInt;
  public static final String ZEROINT_KEY = "zeroInt";
  private final Integer _posInt;
  public static final String POSINT_KEY = "posInt";
  private final Integer _negInt;
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
    private Double _nullDouble;
    private Double _zeroDouble;
    private Double _posDouble;
    private Double _negDouble;
    private Double _piDouble;
    private Double _bigDouble;
    private Double _tinyDouble;
    private Float _nullFloat;
    private Float _zeroFloat;
    private Float _posFloat;
    private Float _negFloat;
    private Float _piFloat;
    private Float _bigFloat;
    private Float _tinyFloat;
    private Integer _nullInt;
    private Integer _zeroInt;
    private Integer _posInt;
    private Integer _negInt;
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
    public Builder nullDouble (Double nullDouble) {
      _nullDouble = nullDouble;
      return this;
    }
    public Builder zeroDouble (Double zeroDouble) {
      _zeroDouble = zeroDouble;
      return this;
    }
    public Builder posDouble (Double posDouble) {
      _posDouble = posDouble;
      return this;
    }
    public Builder negDouble (Double negDouble) {
      _negDouble = negDouble;
      return this;
    }
    public Builder piDouble (Double piDouble) {
      _piDouble = piDouble;
      return this;
    }
    public Builder bigDouble (Double bigDouble) {
      _bigDouble = bigDouble;
      return this;
    }
    public Builder tinyDouble (Double tinyDouble) {
      _tinyDouble = tinyDouble;
      return this;
    }
    public Builder nullFloat (Float nullFloat) {
      _nullFloat = nullFloat;
      return this;
    }
    public Builder zeroFloat (Float zeroFloat) {
      _zeroFloat = zeroFloat;
      return this;
    }
    public Builder posFloat (Float posFloat) {
      _posFloat = posFloat;
      return this;
    }
    public Builder negFloat (Float negFloat) {
      _negFloat = negFloat;
      return this;
    }
    public Builder piFloat (Float piFloat) {
      _piFloat = piFloat;
      return this;
    }
    public Builder bigFloat (Float bigFloat) {
      _bigFloat = bigFloat;
      return this;
    }
    public Builder tinyFloat (Float tinyFloat) {
      _tinyFloat = tinyFloat;
      return this;
    }
    public Builder nullInt (Integer nullInt) {
      _nullInt = nullInt;
      return this;
    }
    public Builder zeroInt (Integer zeroInt) {
      _zeroInt = zeroInt;
      return this;
    }
    public Builder posInt (Integer posInt) {
      _posInt = posInt;
      return this;
    }
    public Builder negInt (Integer negInt) {
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
  public Literals (Double nullDouble, Double zeroDouble, Double posDouble, Double negDouble, Double piDouble, Double bigDouble, Double tinyDouble, Float nullFloat, Float zeroFloat, Float posFloat, Float negFloat, Float piFloat, Float bigFloat, Float tinyFloat, Integer nullInt, Integer zeroInt, Integer posInt, Integer negInt, String nullString, String emptyString, String simpleString, String escapeString) {
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
    if (_nullDouble != null)  {
      msg.add (NULLDOUBLE_KEY, null, _nullDouble);
    }
    if (_zeroDouble != null)  {
      msg.add (ZERODOUBLE_KEY, null, _zeroDouble);
    }
    if (_posDouble != null)  {
      msg.add (POSDOUBLE_KEY, null, _posDouble);
    }
    if (_negDouble != null)  {
      msg.add (NEGDOUBLE_KEY, null, _negDouble);
    }
    if (_piDouble != null)  {
      msg.add (PIDOUBLE_KEY, null, _piDouble);
    }
    if (_bigDouble != null)  {
      msg.add (BIGDOUBLE_KEY, null, _bigDouble);
    }
    if (_tinyDouble != null)  {
      msg.add (TINYDOUBLE_KEY, null, _tinyDouble);
    }
    if (_nullFloat != null)  {
      msg.add (NULLFLOAT_KEY, null, _nullFloat);
    }
    if (_zeroFloat != null)  {
      msg.add (ZEROFLOAT_KEY, null, _zeroFloat);
    }
    if (_posFloat != null)  {
      msg.add (POSFLOAT_KEY, null, _posFloat);
    }
    if (_negFloat != null)  {
      msg.add (NEGFLOAT_KEY, null, _negFloat);
    }
    if (_piFloat != null)  {
      msg.add (PIFLOAT_KEY, null, _piFloat);
    }
    if (_bigFloat != null)  {
      msg.add (BIGFLOAT_KEY, null, _bigFloat);
    }
    if (_tinyFloat != null)  {
      msg.add (TINYFLOAT_KEY, null, _tinyFloat);
    }
    if (_nullInt != null)  {
      msg.add (NULLINT_KEY, null, _nullInt);
    }
    if (_zeroInt != null)  {
      msg.add (ZEROINT_KEY, null, _zeroInt);
    }
    if (_posInt != null)  {
      msg.add (POSINT_KEY, null, _posInt);
    }
    if (_negInt != null)  {
      msg.add (NEGINT_KEY, null, _negInt);
    }
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
    final java.util.List<org.fudgemsg.FudgeField> types = fudgeMsg.getAllByOrdinal (0);
    for (org.fudgemsg.FudgeField field : types) {
      final String className = (String)field.getValue ();
      if ("Literals".equals (className)) break;
      try {
        return (Literals)Class.forName (className).getDeclaredMethod ("fromFudgeMsg", org.fudgemsg.FudgeFieldContainer.class).invoke (null, fudgeMsg);
      }
      catch (Throwable t) {
        // no-action
      }
    }
    return new Builder (fudgeMsg).build ();
  }
  public Double getNullDouble () {
    return _nullDouble;
  }
  public Double getZeroDouble () {
    return _zeroDouble;
  }
  public Double getPosDouble () {
    return _posDouble;
  }
  public Double getNegDouble () {
    return _negDouble;
  }
  public Double getPiDouble () {
    return _piDouble;
  }
  public Double getBigDouble () {
    return _bigDouble;
  }
  public Double getTinyDouble () {
    return _tinyDouble;
  }
  public Float getNullFloat () {
    return _nullFloat;
  }
  public Float getZeroFloat () {
    return _zeroFloat;
  }
  public Float getPosFloat () {
    return _posFloat;
  }
  public Float getNegFloat () {
    return _negFloat;
  }
  public Float getPiFloat () {
    return _piFloat;
  }
  public Float getBigFloat () {
    return _bigFloat;
  }
  public Float getTinyFloat () {
    return _tinyFloat;
  }
  public Integer getNullInt () {
    return _nullInt;
  }
  public Integer getZeroInt () {
    return _zeroInt;
  }
  public Integer getPosInt () {
    return _posInt;
  }
  public Integer getNegInt () {
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
    if (_nullDouble != null) {
      if (msg._nullDouble != null) {
        if (!_nullDouble.equals (msg._nullDouble)) return false;
      }
      else return false;
    }
    else if (msg._nullDouble != null) return false;
    if (_zeroDouble != null) {
      if (msg._zeroDouble != null) {
        if (!_zeroDouble.equals (msg._zeroDouble)) return false;
      }
      else return false;
    }
    else if (msg._zeroDouble != null) return false;
    if (_posDouble != null) {
      if (msg._posDouble != null) {
        if (!_posDouble.equals (msg._posDouble)) return false;
      }
      else return false;
    }
    else if (msg._posDouble != null) return false;
    if (_negDouble != null) {
      if (msg._negDouble != null) {
        if (!_negDouble.equals (msg._negDouble)) return false;
      }
      else return false;
    }
    else if (msg._negDouble != null) return false;
    if (_piDouble != null) {
      if (msg._piDouble != null) {
        if (!_piDouble.equals (msg._piDouble)) return false;
      }
      else return false;
    }
    else if (msg._piDouble != null) return false;
    if (_bigDouble != null) {
      if (msg._bigDouble != null) {
        if (!_bigDouble.equals (msg._bigDouble)) return false;
      }
      else return false;
    }
    else if (msg._bigDouble != null) return false;
    if (_tinyDouble != null) {
      if (msg._tinyDouble != null) {
        if (!_tinyDouble.equals (msg._tinyDouble)) return false;
      }
      else return false;
    }
    else if (msg._tinyDouble != null) return false;
    if (_nullFloat != null) {
      if (msg._nullFloat != null) {
        if (!_nullFloat.equals (msg._nullFloat)) return false;
      }
      else return false;
    }
    else if (msg._nullFloat != null) return false;
    if (_zeroFloat != null) {
      if (msg._zeroFloat != null) {
        if (!_zeroFloat.equals (msg._zeroFloat)) return false;
      }
      else return false;
    }
    else if (msg._zeroFloat != null) return false;
    if (_posFloat != null) {
      if (msg._posFloat != null) {
        if (!_posFloat.equals (msg._posFloat)) return false;
      }
      else return false;
    }
    else if (msg._posFloat != null) return false;
    if (_negFloat != null) {
      if (msg._negFloat != null) {
        if (!_negFloat.equals (msg._negFloat)) return false;
      }
      else return false;
    }
    else if (msg._negFloat != null) return false;
    if (_piFloat != null) {
      if (msg._piFloat != null) {
        if (!_piFloat.equals (msg._piFloat)) return false;
      }
      else return false;
    }
    else if (msg._piFloat != null) return false;
    if (_bigFloat != null) {
      if (msg._bigFloat != null) {
        if (!_bigFloat.equals (msg._bigFloat)) return false;
      }
      else return false;
    }
    else if (msg._bigFloat != null) return false;
    if (_tinyFloat != null) {
      if (msg._tinyFloat != null) {
        if (!_tinyFloat.equals (msg._tinyFloat)) return false;
      }
      else return false;
    }
    else if (msg._tinyFloat != null) return false;
    if (_nullInt != null) {
      if (msg._nullInt != null) {
        if (!_nullInt.equals (msg._nullInt)) return false;
      }
      else return false;
    }
    else if (msg._nullInt != null) return false;
    if (_zeroInt != null) {
      if (msg._zeroInt != null) {
        if (!_zeroInt.equals (msg._zeroInt)) return false;
      }
      else return false;
    }
    else if (msg._zeroInt != null) return false;
    if (_posInt != null) {
      if (msg._posInt != null) {
        if (!_posInt.equals (msg._posInt)) return false;
      }
      else return false;
    }
    else if (msg._posInt != null) return false;
    if (_negInt != null) {
      if (msg._negInt != null) {
        if (!_negInt.equals (msg._negInt)) return false;
      }
      else return false;
    }
    else if (msg._negInt != null) return false;
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
    hc *= 31;
    if (_nullDouble != null) hc += _nullDouble.hashCode ();
    hc *= 31;
    if (_zeroDouble != null) hc += _zeroDouble.hashCode ();
    hc *= 31;
    if (_posDouble != null) hc += _posDouble.hashCode ();
    hc *= 31;
    if (_negDouble != null) hc += _negDouble.hashCode ();
    hc *= 31;
    if (_piDouble != null) hc += _piDouble.hashCode ();
    hc *= 31;
    if (_bigDouble != null) hc += _bigDouble.hashCode ();
    hc *= 31;
    if (_tinyDouble != null) hc += _tinyDouble.hashCode ();
    hc *= 31;
    if (_nullFloat != null) hc += _nullFloat.hashCode ();
    hc *= 31;
    if (_zeroFloat != null) hc += _zeroFloat.hashCode ();
    hc *= 31;
    if (_posFloat != null) hc += _posFloat.hashCode ();
    hc *= 31;
    if (_negFloat != null) hc += _negFloat.hashCode ();
    hc *= 31;
    if (_piFloat != null) hc += _piFloat.hashCode ();
    hc *= 31;
    if (_bigFloat != null) hc += _bigFloat.hashCode ();
    hc *= 31;
    if (_tinyFloat != null) hc += _tinyFloat.hashCode ();
    hc *= 31;
    if (_nullInt != null) hc += _nullInt.hashCode ();
    hc *= 31;
    if (_zeroInt != null) hc += _zeroInt.hashCode ();
    hc *= 31;
    if (_posInt != null) hc += _posInt.hashCode ();
    hc *= 31;
    if (_negInt != null) hc += _negInt.hashCode ();
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
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
