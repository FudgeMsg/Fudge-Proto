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

import java.io.IOException;
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
  public final void writeLiteral (final Writer writer, final LiteralValue value) throws IOException {
    if (value instanceof LiteralValue.DoubleValue) {
      writeLiteral (writer, (LiteralValue.DoubleValue)value);
    } else if (value instanceof LiteralValue.EnumValue) {
      writeLiteral (writer, (LiteralValue.EnumValue)value);
    } else if (value instanceof LiteralValue.FloatValue) {
      writeLiteral (writer, (LiteralValue.FloatValue)value);
    } else if (value instanceof LiteralValue.IntegerValue) {
      writeLiteral (writer, (LiteralValue.IntegerValue)value);
    } else if (value instanceof LiteralValue.NumericValue) {
      writeLiteral (writer, (LiteralValue.NumericValue)value);
    } else if (value instanceof LiteralValue.StringValue) {
      writeLiteral (writer, (LiteralValue.StringValue)value);
    }
  }
  
  /**
   * Default uses the NumericLiteral handler.
   */
  protected void writeLiteral (final Writer writer, final LiteralValue.DoubleValue value) throws IOException {
    writeLiteral (writer, (LiteralValue.NumericValue)value);
  }

  /**
   * This is a bit too language specific things normally descended from C - must be implemented specifically for each one.
   */
  protected abstract void writeLiteral (final Writer writer, final LiteralValue.EnumValue value) throws IOException;

  protected void writeLiteral (final Writer writer, final LiteralValue.FloatValue value) throws IOException {
    writer.write (value.getNumber ().toString ());
    writer.write ('f');
  }

  /**
   * Default uses the NumericLiteral handler.
   */
  protected void writeLiteral (final Writer writer, final LiteralValue.IntegerValue value) throws IOException {
    writeLiteral (writer, (LiteralValue.NumericValue)value);
  }

  protected void writeLiteral (final Writer writer, final LiteralValue.NumericValue value) throws IOException {
    writer.write (value.getNumber ().toString ());
  }

  protected void writeLiteral (final Writer writer, final LiteralValue.StringValue value) throws IOException {
    final char[] c = value.get ().toCharArray ();
    writer.write ('\"');
    for (int i = 0; i < c.length; i++) {
      final String seq = _escapeChars.get (c[i]); 
      if (seq != null) {
        writer.write (seq);
      } else if (c[i] < 32) {
        // Deal with the standard C-ish escapes
        if (c[i] < 8) {
          writer.write ("\\00");
          writer.write (Integer.toOctalString (c[i]));
        } else if (c[i] < 64) {
          writer.write ("\\0");
          writer.write (Integer.toOctalString (c[i]));
        }
      } else if (c[i] < 128) {
        // Printable characters
        writer.write (c[i]);
      } else if (c[i] < 256) {
        // Non-printable characters
        writer.write ('\\');
        writer.write (Integer.toOctalString (c[i]));
      } else {
        // Unicode sequence
        writer.write ("\\u");
        final String hex = Integer.toHexString (c[i]);
        for (int j = hex.length (); j < 4; j++) writer.write ('0');
        writer.write (hex);
      }
    }
    writer.write ('\"');
  }

}