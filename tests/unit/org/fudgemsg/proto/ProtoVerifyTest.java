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
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Runs the compilation job over the out_proto output to verify that it creates the same
 * file output as the original files.  
 * 
 * @author Andrew Griffin
 */
public class ProtoVerifyTest {
  
  private static class IgnoreStuff implements FilenameFilter {
    
    /* package */ static final IgnoreStuff INSTANCE = new IgnoreStuff ();
    
    private IgnoreStuff () {
    }
    
    public boolean accept (final File dir, final String name) {
      if (name.charAt (0) == '.') return false;
      if (name.endsWith (".class")) return false;
      if (name.equals ("html")) return false;
      if (name.equals ("xml")) return false;
      if (name.startsWith ("rerun_")) return false;
      return true;
    }
    
  }
  
  @Before
  public void setupSourceFiles () {
    CommandLineTest.codeGeneratorAllFiles ("proto");
  }
  
  private String concatenatePath (String path, final String next) {
    if (path.length () != 0) path = path + File.separatorChar;
    return path + next;
  }
  
  private void findFiles (final File path, final String localPath, final ArrayList<String> args) {
    for (File file : path.listFiles (IgnoreStuff.INSTANCE)) {
      final String name = file.getName ();
      if (file.isDirectory ()) {
        if (name.startsWith ("rerun_")) continue;
        findFiles (file, concatenatePath (localPath, name), args);
      } else {
        if (name.endsWith (".proto")) {
          args.add (concatenatePath (localPath, name));
        }
      }
    }
  }
  
  private void assertFilesEqual (final File path1, final File path2) {
    try {
      final BufferedReader in1 = new BufferedReader (new InputStreamReader (new FileInputStream (path1)));
      try {
        final BufferedReader in2 = new BufferedReader (new InputStreamReader (new FileInputStream (path2)));
        try {
          String s1, s2;
          while (((s1 = in1.readLine ()) != null)
              && ((s2 = in2.readLine ()) != null)) {
            if (!s1.equals (s2)) {
              if (s1.trim ().startsWith ("//") && s2.trim ().startsWith ("//")) continue;
              fail (path1 + " different to " + path2);
            }
          }
        } finally {
          in2.close ();
        }
      } finally {
        in1.close ();
      }
    } catch (IOException e) {
      throw new RuntimeException ("wrapped", e);
    }
  }
  
  private void matchFiles (final File path1, final File path2) {
    if (path1.isDirectory () && path2.isDirectory ()) {
      final File[] list1 = path1.listFiles (IgnoreStuff.INSTANCE);
      Arrays.sort (list1);
      final File[] list2 = path2.listFiles (IgnoreStuff.INSTANCE);
      Arrays.sort (list2);
      int i;
      for (i = 0; (i < list1.length) && (i < list2.length); i++) {
        assertEquals (list1[i].getName (), list2[i].getName ());
        matchFiles (list1[i], list2[i]);
      }
      for (int j = i; j < list1.length; j++) {
        fail (list1[j] + " not in " + path2);
      }
      for (int j = i; j < list2.length; j++) {
        fail (list2[j] + " not in " + path1);
      }
      assertEquals (list1.length, list2.length);
    } else {
      assertFilesEqual (path1, path2);
    }
  }
  
  private void testProtoReapplication (final String language) {
    final ArrayList<String> args = new ArrayList<String> ();
    args.add ("-d" + CommandLineTest.getTestPath ("out_proto", "rerun_" + language));
    args.add ("-l" + language);
    args.add ("-s" + CommandLineTest.getTestPath ("out_proto"));
    findFiles (new File (CommandLineTest.getTestPath ("out_proto")), "", args);
    CommandLineTest.addLanguageOptions (language, args);
    /*for (int i = 0; i < args.size (); i++) {
      System.out.println (i + ": " + args.get (i));
    }*/
    assertEquals (0, CommandLine.compile (args.toArray (new String[0])));
    matchFiles (new File (CommandLineTest.getTestPath ("out_" + language)), new File (CommandLineTest.getTestPath ("out_proto", "rerun_" + language)));
  }
  
  @Test
  public void testProtoReapplication_C () {
    testProtoReapplication ("C");
  }
  
  @Test
  public void testProtoReapplication_Cpp () {
    testProtoReapplication ("C++");
  }
  
  @Test
  public void testProtoReapplication_CSharp () {
    testProtoReapplication ("C#");
  }
  
  @Test
  public void testProtoReapplication_Java () {
    testProtoReapplication ("Java");
  }
  
  @Test
  public void testProtoReapplication_Proto () {
    testProtoReapplication ("proto");
  }
  
}