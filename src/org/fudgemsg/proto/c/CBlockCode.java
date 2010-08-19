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

import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.proto.BlockCode;
import org.fudgemsg.proto.proto.BlockCodeAdapter;

/**
 * Implementation of a code generator for C language, that can be reused for others with a C-like syntax.
 * 
 * @author Andrew
 */
public class CBlockCode extends BlockCodeAdapter {
  
  public CBlockCode (final BlockCode delegate) {
    super (delegate);
  }
  
  @Override
  public IndentWriter createIndentWriter (final Writer writer) {
    return new IndentWriter (writer, System.getProperty("line.separator"), "  ");
  }
  
  @Override
  public void beginBlock (final IndentWriter writer) throws IOException {
    writer.write (" {");
    writer.newLineIndent ();
  }
  
  @Override
  public void endBlock (final IndentWriter writer) throws IOException {
    writer.newLineOutdent ();
    writer.write ('}');
    writer.newLine ();
  }
  
  @Override
  public void endStmt (final IndentWriter writer) throws IOException {
    writer.uncacheNewLine ();
    writer.write (';');
    writer.newLine ();
  }
  
  @Override
  public void comment (final IndentWriter writer, final String text) throws IOException {
    writer.write ("// ");
    writer.write (text);
    writer.newLine ();
  }
  
}