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

package org.fudgemsg.proto;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Extension of a basic Writer that can remember indentation levels.
 * 
 * @author Andrew
 */
public class IndentWriter extends FilterWriter {
  
  private final String _linefeedChars;
  
  private final String _indentChars;
  
  private int _indent = 0;
  
  private boolean _blankLine = false;
  
  public IndentWriter (final Writer out, final String linefeedChars, final String indentChars) {
    super (out);
    _linefeedChars = linefeedChars;
    _indentChars = indentChars;
  }
  
  @Override
  public void write (final char[] cbuf, final int ofs, final int len) throws IOException {
    cachedNewLine ();
    super.write (cbuf, ofs, len);
  }
  
  @Override
  public void write (final int c) throws IOException {
    cachedNewLine ();
    super.write (c);
  }
  
  @Override
  public void write (final String str, final int ofs, final int len) throws IOException {
    cachedNewLine ();
    super.write (str, ofs, len);
  }
  
  private void cachedNewLine () throws IOException {
    if (_blankLine) {
      _blankLine = false;
      super.write (_linefeedChars);
      for (int i = 0; i < _indent; i++) {
        super.write (_indentChars);
      }
    }
  }
  
  public void uncacheNewLine () throws IOException {
    _blankLine = false;
  }
  
  public void newLine () throws IOException {
    _blankLine = true;
  }
  
  public void newLineIndent () throws IOException {
    _indent++;
    newLine ();
  }
  
  public void newLineOutdent () throws IOException {
    if (_indent <= 0) throw new IllegalStateException ("negative indent");
    _indent--;
    newLine ();
  }
  
  @Override
  public void close () throws IOException {
    cachedNewLine ();
    super.close ();
  }
  
}