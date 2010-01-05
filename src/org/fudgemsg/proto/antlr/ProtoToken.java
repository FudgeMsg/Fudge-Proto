/* Copyright 2009 by OpenGamma Inc and other contributors.
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

package org.fudgemsg.proto.antlr;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.fudgemsg.proto.CodePosition;
import org.fudgemsg.proto.Source;

/**
 * Custom token implementation that can track the original source during multi-file compilations.
 * 
 * @author Andrew
 */
/* package */ class ProtoToken extends CommonToken {
  
  private static final long serialVersionUID = 5123776096973266505L;

  private final Source _source;

  /* package */ ProtoToken (final Source source, final int tokenType, final String text) {
    super (tokenType, text);
    _source = source;
  }
  
  /* package */ ProtoToken (final Source source, final Token fromToken) {
    super (fromToken);
    _source = source;
  }
  
  /* package */ CodePosition getCodePosition () {
    if (getLine () == 0) {
      return null;
    } else {
      return new CodePosition (_source, getLine (), getCharPositionInLine ());
    }
  }
  
}