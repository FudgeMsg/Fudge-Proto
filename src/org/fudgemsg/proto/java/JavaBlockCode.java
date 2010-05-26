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
