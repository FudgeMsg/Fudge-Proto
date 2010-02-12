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

import org.fudgemsg.proto.LiteralValue;
import org.fudgemsg.proto.c.CStyleLiteralCode;

/**
 * Implementation of a code generator for C languages that can be reused for others with a similar syntax.
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
  protected String getLiteral (final LiteralValue.EnumValue value) {
    return value.get ();
  }
  
}
