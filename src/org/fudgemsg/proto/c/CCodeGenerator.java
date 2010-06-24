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

import java.io.File;
import java.io.IOException;

import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.proto.ClassCodeGenerator;

/**
 * Code generator implementation for the C Fudge implementation.
 *
 * @author Andrew
 */
public class CCodeGenerator extends ClassCodeGenerator {

  public static final String LANG_ID = "C";

  private String _include = null;
  private String _cType = "char";
  private String _cSuffix = "ASCII";
  private String _cLength = "strlen";

  public CCodeGenerator() {
    super(CClassCode.INSTANCE);
  }

  protected void setInclude(final String include) {
    _include = include;
  }

  protected String getInclude() {
    return _include;
  }

  protected void setCType(final String cType) {
    _cType = cType;
  }

  protected String getCType() {
    return _cType;
  }

  protected void setCSuffix(final String cSuffix) {
    _cSuffix = cSuffix;
  }

  protected String getCSuffix() {
    return _cSuffix;
  }

  protected void setCLength(final String cLength) {
    _cLength = cLength;
  }

  protected String getCLength() {
    return _cLength;
  }

  private void writeDefineIfNDef(final IndentWriter writer, final String macro, final String definition)
      throws IOException {
    writer.write("#ifndef " + macro);
    writer.newLine();
    writer.write("#define " + macro + definition);
    writer.newLine();
    writer.write("#endif /* ifndef " + macro + " */");
    writer.newLine();
  }

  private void writeInclude(final IndentWriter writer) throws IOException {
    if (getInclude() != null) {
      final String include = getInclude();
      if (include.charAt(0) == '<') {
        writer.write("#include " + getInclude());
      } else {
        writer.write("#include \"" + getInclude() + "\"");
      }
      writer.newLine();
    }
  }

  private void writeTCharDefs(final IndentWriter writer) throws IOException {
    writer.write("#ifndef _TCHAR_DEFINED");
    writer.newLine();
    writer.write("typedef " + getCType() + " TCHAR");
    endStmt(writer);
    writer.write("#define _TCHAR_DEFINED");
    writer.newLine();
    writer.write("#endif /* ifndef _TCHAR_DEFINED */");
    writer.newLine();
    writeDefineIfNDef(writer, "TEXT", "(_str_) _str_");
  }

  @Override
  public void writeHeaderFileHeader(final Compiler.Context context, final File header, final IndentWriter writer)
      throws IOException {
    writeInclude(writer);
    super.writeHeaderFileHeader(context, header, writer);
    writeTCharDefs(writer);
  }

  @Override
  public void writeImplementationFileHeader(final Compiler.Context context, final File file, final IndentWriter writer)
      throws IOException {
    writeInclude(writer);
    super.writeImplementationFileHeader(context, file, writer);
    writeTCharDefs(writer);
    writeDefineIfNDef(writer, "FUDGE_STRING_TYPE", " " + getCSuffix());
    writeDefineIfNDef(writer, "FUDGE_STRING_TYPE_CAST", getCSuffix().equals("ASCII") ? "" : " (fudge_byte*)");
    writer.write("#ifndef FudgeString_createFrom");
    writer.newLine();
    writer
        .write("#define __FudgeString_createFrom(_suffix_,_pstr_,_str_,_strlen_) FudgeString_createFrom##_suffix_(_pstr_,FUDGE_STRING_TYPE_CAST _str_,_strlen_)");
    writer.newLine();
    writer
        .write("#define _FudgeString_createFrom(_suffix_,_pstr_,_str_,_strlen_) __FudgeString_createFrom(_suffix_,_pstr_,_str_,_strlen_)");
    writer.newLine();
    writer
        .write("#define FudgeString_createFrom(_pstr_,_str_,_strlen_) _FudgeString_createFrom(FUDGE_STRING_TYPE,_pstr_,_str_,_strlen_)");
    writer.newLine();
    writer.write("#endif /* ifndef FudgeString_createFrom */");
    writer.newLine();
    writer.write("#ifndef FudgeString_copyTo");
    writer.newLine();
    writer
        .write("#define __FudgeString_copyTo(_suffix_,_buffer_,_buflen_,_str_) FudgeString_copyTo##_suffix_(FUDGE_STRING_TYPE_CAST _buffer_,_buflen_,_str_)");
    writer.newLine();
    writer
        .write("#define _FudgeString_copyTo(_suffix_,_buffer_,_buflen_,_str_) __FudgeString_copyTo(_suffix_,_buffer_,_buflen_,_str_)");
    writer.newLine();
    writer
        .write("#define FudgeString_copyTo(_buffer_,_buflen_,_str_) _FudgeString_copyTo(FUDGE_STRING_TYPE,_buffer_,_buflen_,_str_)");
    writer.newLine();
    writer.write("#endif /* ifndef FudgeString_copyTo */");
    writer.newLine();
    writeDefineIfNDef(writer, "FUDGE_STRING_LENGTH", " " + getCLength());
  }

  @Override
  public void setOption(String option, String value) {
    if (option.equals("cLength")) {
      setCLength(value);
    } else if (option.equals("cSuffix")) {
      setCSuffix(value);
    } else if (option.equals("cType")) {
      setCType(value);
    } else if (option.equals("include")) {
      setInclude(value);
    } else {
      super.setOption(option, value);
    }
  }

}
