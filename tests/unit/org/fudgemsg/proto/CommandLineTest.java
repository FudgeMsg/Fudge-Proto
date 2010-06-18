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

package org.fudgemsg.proto;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

import org.junit.Test;

public class CommandLineTest extends DefaultSettings {
  
  @Test
  public void parameterPassing () {
    assertEquals (0, CommandLine.compile (new String[] { })); // no parameters = no action, okay
    assertEquals (0, CommandLine.compile (new String[] { "-d" + CompilerTest.getTestPath ("output") })); // select a different output folder
    assertEquals (0, CommandLine.compile (new String[] { "-lC#" })); // select a different language
    assertEquals (0, CommandLine.compile (new String[] { "-s" + CompilerTest.getTestPath ("proto") })); // select a different language
    assertEquals (0, CommandLine.compile (new String[] { "-p" + CompilerTest.getTestPath ("proto") })); // set a search path
    assertEquals (1, CommandLine.compile (new String[] { "-Xequals", "-lJava" })); // code gen option before language
    assertEquals (0, CommandLine.compile (new String[] { "-lJava", "-Xequals", "-XhashCode", "-XtoString" })); // valid code gen options for Java
    assertEquals (1, CommandLine.compile (new String[] { "-lJava", "-Xfoo" })); // invalid code gen option for Java
    assertEquals (1, CommandLine.compile (new String[] { "-x" })); // bad parameter
    assertEquals (0, CommandLine.compile (new String[] { "-freadonly", "-foptional" })); // field defaults
    assertEquals (0, CommandLine.compile (new String[] { "-fmutable", "-frequired" })); // field defaults
    assertEquals (1, CommandLine.compile (new String[] { "-finvalid" })); // invalid field default
    assertEquals (0, CommandLine.compile (new String[] { "-v" })); // verbose 1
    assertEquals (0, CommandLine.compile (new String[] { "-vv" })); // verbose 2
    assertEquals (0, CommandLine.compile (new String[] { "-vvv" })); // verbose 3
    assertEquals (1, CommandLine.compile (new String[] { "-vvvv" })); // invalid
  }
  
  @Test
  public void testPathResolver () {
    final ArrayList<String> args = new ArrayList<String> ();
    args.add ("-d" + CompilerTest.getTestPath ("out_default"));
    args.add (CompilerTest.getTestPath ("proto", "extern.proto"));
    assertEquals (1, CommandLine.compile (args.toArray (new String[0]))); // compilation should fail as there is no search path
    args.add ("-p" + CompilerTest.getTestPath ("proto"));
    assertEquals (0, CommandLine.compile (args.toArray (new String[0]))); // compilation should succeed
  }
  
  private void writeJar (final JarOutputStream jos, String baseDir, final File file) throws IOException {
    if (file.isDirectory ()) {
      if (baseDir.length () > 0) {
        baseDir = baseDir + File.separatorChar;
      }
      for (File child : file.listFiles ()) {
        writeJar (jos, baseDir + child.getName (), child);
      }
    } else {
      jos.putNextEntry (new ZipEntry (baseDir));
      final FileInputStream in = new FileInputStream (file);
      final byte[] buffer = new byte[4096];
      int l;
      while ((l = in.read (buffer)) > 0) {
        jos.write (buffer, 0, l);
      }
      in.close ();
      jos.closeEntry ();
    }
  }
  
  @Test
  public void testJarResolver () throws IOException {
    final ArrayList<String> args = new ArrayList<String> ();
    args.add ("-d" + CompilerTest.getTestPath ("out_default"));
    args.add (CompilerTest.getTestPath ("proto", "extern.proto"));
    assertEquals (1, CommandLine.compile (args.toArray (new String[0]))); // compilation should fail as there is no search path
    final File tempJar = File.createTempFile ("FudgeProtoTest", ".jar");
    try {
      final JarOutputStream jos = new JarOutputStream (new FileOutputStream (tempJar));
      writeJar (jos, "", new File (CompilerTest.getTestPath ("proto")));
      jos.close ();
      args.add ("-p" + tempJar.getPath ());
      assertEquals (0, CommandLine.compile (args.toArray (new String[0]))); // compilation should succeed
    } finally {
      tempJar.delete ();
    }
  }
  
}