/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fudgemsg.proto.c;

import java.io.Writer;
import java.util.HashMap;

import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.proto.LiteralCode;

/**
 * Partial implementation of a code generator for languages with a C-like syntax.
 * 
 * @author Andrew
 */
public abstract class CStyleLiteralCode implements LiteralCode {
  
  private final HashMap<Character,String> _escapeChars = new HashMap<Character,String>(); 
  
  protected CStyleLiteralCode () {
    escape ('\0', "0");
    escape ((char)007, "a");
    escape ('\b', "b");
    escape ('\t', "t");
    escape ('\f', "f");
    escape ('\n', "n");
    escape ('\r', "r");
    escape ((char)013, "v");
    escape ('\'', "'");
    escape ('\"', "\"");
    escape ('\\', "\\");
  }
  
  /**
   * Add additional characters that have special escape sequences to the standard set.
   */ 
  protected void escape (final char chr, final String seq) {
    _escapeChars.put (chr, "\\" + seq);
  }
  
  @Override
  public String camelCaseFieldName (FieldDefinition field) {
    final String name = localFieldName (field);
    return Character.toUpperCase (name.charAt (0)) + name.substring (1);
  }

  @Override
  public String localFieldName (FieldDefinition field) {
    return field.getName ();
  }

  @Override
  public String privateFieldName (FieldDefinition field) {
    return "_" + localFieldName (field);
  }

  /**
   * Protected forms of this exist for specific literal subclasses so that this can be used as a trivial bases
   * for any languages which differ only slightly from C-style literal encodings.
   */
  @Override
  public final String getLiteral (final LiteralValue value) {
    if (value instanceof LiteralValue.DoubleValue) {
      return getLiteral ((LiteralValue.DoubleValue)value);
    } else if (value instanceof LiteralValue.EnumValue) {
      return getLiteral ((LiteralValue.EnumValue)value);
    } else if (value instanceof LiteralValue.FloatValue) {
      return getLiteral ((LiteralValue.FloatValue)value);
    } else if (value instanceof LiteralValue.IntegerValue) {
      return getLiteral ((LiteralValue.IntegerValue)value);
    } else if (value instanceof LiteralValue.NumericValue) {
      return getLiteral ((LiteralValue.NumericValue)value);
    } else if (value instanceof LiteralValue.StringValue) {
      return getLiteral ((LiteralValue.StringValue)value);
    } else {
      throw new IllegalStateException ("LiteralValue '" + value + "' is not an expected type");
    }
  }
  
  /**
   * Default uses the NumericLiteral handler.
   */
  protected String getLiteral (final LiteralValue.DoubleValue value) {
    return getLiteral ((LiteralValue.NumericValue)value);
  }

  /**
   * This is a bit too language specific things normally descended from C - must be implemented specifically for each one.
   */
  protected abstract String getLiteral (final LiteralValue.EnumValue value);

  protected String getLiteral (final LiteralValue.FloatValue value) {
    final StringBuilder sb = new StringBuilder (value.getNumber ().toString ()).append ('f');
    return sb.toString ();
  }

  /**
   * Default uses the NumericLiteral handler.
   */
  protected String getLiteral (final LiteralValue.IntegerValue value) {
    return getLiteral ((LiteralValue.NumericValue)value);
  }

  protected String getLiteral (final LiteralValue.NumericValue value) {
    return value.getNumber ().toString ();
  }

  protected String getLiteral (final LiteralValue.StringValue value) {
    final StringBuilder sb = new StringBuilder ();
    final char[] c = value.get ().toCharArray ();
    sb.append ('\"');
    for (int i = 0; i < c.length; i++) {
      final String seq = _escapeChars.get (c[i]); 
      if (seq != null) {
        sb.append (seq);
      } else if (c[i] < 32) {
        // Deal with the standard C-ish escapes
        if (c[i] < 8) {
          sb.append ("\\00").append (Integer.toOctalString (c[i]));
        } else if (c[i] < 64) {
          sb.append ("\\0").append (Integer.toOctalString (c[i]));
        }
      } else if (c[i] < 128) {
        // Printable characters
        sb.append (c[i]);
      } else if (c[i] < 256) {
        // Non-printable characters
        sb.append ('\\').append (Integer.toOctalString (c[i]));
      } else {
        // Unicode sequence
        sb.append ("\\u");
        final String hex = Integer.toHexString (c[i]);
        for (int j = hex.length (); j < 4; j++) sb.append ('0');
        sb.append (hex);
      }
    }
    sb.append ('\"');
    return sb.toString ();
  }

}