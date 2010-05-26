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

import java.io.IOException;

import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.c.CBlockCode;
import org.fudgemsg.proto.proto.BlockCode;

/**
 * Implementation of a code generator for Java, based on the C generator.
 * 
 * @author jonathan
 */
public class JavaBlockCode extends CBlockCode {

  public JavaBlockCode(final BlockCode delegate) {
    super(delegate);
  }
 
  @Override
  public void comment(IndentWriter writer, String text) throws IOException {
    super.comment(writer, escapeCommentText(text));
  }
  
  private String escapeCommentText(String text) {
    if (text == null) {
      return null;
    }
    // javac treats a backslash followed by 'u' in a comment as the start of a Unicode escape sequence. This needs to
    // be turned into '\\u'. We know we're not going to be generating actual Unicode escape sequences within comments,
    // so we can blindly add an extra backslash.
    return text.replace("\\u", "\\\\u");
  }

}
