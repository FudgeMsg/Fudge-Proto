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

import java.io.IOException;
import java.io.Writer;

import org.fudgemsg.proto.IndentWriter;

public interface BlockCode {

  public IndentWriter createIndentWriter (final Writer writer);
  
  public void beginBlock (final IndentWriter writer) throws IOException;
  
  public void endBlock (final IndentWriter writer) throws IOException;
  
  public void endStmt (final IndentWriter writer) throws IOException;
  
  public void comment (final IndentWriter writer, final String text) throws IOException;
  
  public LiteralCode getLiteralCode ();

}