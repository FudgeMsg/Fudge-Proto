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

package org.fudgemsg.proto.proto;

import java.util.Collection;

import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.c.CStyleLiteralCode;

/**
 * Implementation of a code generator for .proto files
 * 
 * @author Andrew
 */
public class ProtoLiteralCode extends CStyleLiteralCode {
  
  public static final LiteralCode INSTANCE = new ProtoLiteralCode ();
  
  private ProtoLiteralCode () {
    escape ((char)007, "a");
    escape ((char)013, "v");
  }
  
  @Override
  protected Collection<String> getReservedWords() {
    final Collection<String> collection = super.getReservedWords();
    for (String reservedWord : new String[] {"abstract", "binding", "default", "enum", "extends", "extern", "import",
        "message", "mutable", "namespace", "optional", "readonly", "repeated", "required", "boolean", "byte", "date",
        "datetime", "double", "float", "indicator", "int", "long", "short", "string", "time", "taxonomy", "typedef",
        "uses"}) {
      collection.add(reservedWord);
    }
    return collection;
  }

  @Override
  protected String escapedReservedWord(final String identifier) {
    return "$" + identifier;
  }

  @Override
  protected String getLiteral (final LiteralValue.EnumValue value) {
    return value.get ();
  }
  
  @Override
  protected String getLiteral(final LiteralValue.MessageValue value) {
    final StringBuilder sb = new StringBuilder("(");
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
