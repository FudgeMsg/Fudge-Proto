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

import java.util.Collection;

import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.proto.LiteralCode;

/**
 * Implementation of a code generator for C languages that can be reused for others with a similar syntax.
 * 
 * @author Andrew
 */
public class CLiteralCode extends CStyleLiteralCode {
  
  public static final LiteralCode INSTANCE = new CLiteralCode ();
  
  private CLiteralCode () {
    escape ((char)007, "a");
    escape ((char)013, "v");
  }
  
  @Override
  protected Collection<String> getReservedWords() {
    Collection<String> collection = super.getReservedWords();
    for (String reservedWord : new String[] {"auto", "if", "break", "int", "case", "long", "char", "register",
        "continue", "return", "default", "short", "do", "sizeof", "double", "static", "else", "struct", "entry",
        "switch", "extern", "typedef", "float", "union", "for", "unsigned", "goto", "while", "enum", "void", "const",
        "signed", "volatile"}) {
      collection.add(reservedWord);
    }
    return collection;
  }

  @Override
  protected String getLiteral (final LiteralValue.EnumValue value) {
    return value.get ();
    /*final StringBuilder sb = new StringBuilder (value.getEnumDefinition ().getIdentifier ().replace ('.', '_'));
    sb.append ('_');
    sb.append (value.get ());
    return sb.toString ();*/
  }
  
  @Override
  protected String getLiteral(final LiteralValue.MessageValue value) {
    return "/* TODO: instantiate " + value.toString() + " */ 0";
  }

  @Override
  protected String getLiteral (final LiteralValue.StringValue value) {
    return "TEXT(" + super.getLiteral(value) + ")";
  }

}
