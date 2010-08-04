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

package org.fudgemsg.proto.java;

import java.util.Collection;

import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.c.CStyleLiteralCode;
import org.fudgemsg.proto.proto.LiteralCode;

/**
 * Implementation of a code generator for Java language.
 * 
 * @author Andrew
 */
public class JavaLiteralCode extends CStyleLiteralCode {
  
  public static final LiteralCode INSTANCE = new JavaLiteralCode();

  private JavaLiteralCode () {
    setTrueLiteral("true");
    setFalseLiteral("false");
  }
  
  @Override
  protected Collection<String> getReservedWords() {
    Collection<String> collection = super.getReservedWords();
    for (String reservedWord : new String[] {"abstract", "continue", "for", "new", "switch", "assert", "default",
        "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double", "implements",
        "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return",
        "transient", "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
        "class", "finally", "long", "strictfp", "volatile", "const", "float", "native", "super", "while"}) {
      collection.add(reservedWord);
    }
    return collection;
  }

  @Override
  protected String getLiteral (final LiteralValue.EnumValue value) {
    final StringBuilder sb = new StringBuilder (value.getEnumDefinition ().getIdentifier ());
    sb.append ('.');
    sb.append (value.get ());
    return sb.toString ();
  }
  
  @Override
  protected String getLiteral(final LiteralValue.MessageValue value) {
    final StringBuilder sb = new StringBuilder("new ");
    sb.append(value.getMessageDefinition().getIdentifier());
    sb.append(" (");
    boolean first = true;
    for (LiteralValue literal : value.getParameters()) {
      if (first) {
        first = false;
      } else {
        sb.append(", ");
      }
      sb.append(getLiteral(literal));
    }
    sb.append(")");
    return sb.toString();
  }
}
