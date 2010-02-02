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
import java.util.ArrayList;

import org.junit.Test;

public class CommandLineTest {
  
  @Test
  public void parameterPassing () {
    assertEquals (CommandLine.compile (new String[] { }), 0); // no parameters = no action, okay
    assertEquals (CommandLine.compile (new String[] { "-dtests" + File.separatorChar + "output" }), 0); // select a different output folder
    assertEquals (CommandLine.compile (new String[] { "-lC#" }), 0); // select a different language
    assertEquals (CommandLine.compile (new String[] { "-stests" + File.separatorChar + "proto" }), 0); // select a different language
    assertEquals (CommandLine.compile (new String[] { "-ptests" + File.separatorChar + "out_proto" }), 0); // set a search path
    assertEquals (CommandLine.compile (new String[] { "-Xequals", "-lJava" }), 1); // code gen option before language
    assertEquals (CommandLine.compile (new String[] { "-lJava", "-Xequals", "-XhashCode", "-XtoString" }), 0); // valid code gen options for Java
    assertEquals (CommandLine.compile (new String[] { "-lJava", "-Xfoo" }), 1); // invalid code gen option for Java
    assertEquals (CommandLine.compile (new String[] { "-x" }), 1); // bad parameter
  }
  
  @Test
  public void simpleFileAllCodeGenerators () {
    assertEquals (CommandLine.compile (new String[] { "-dtests" + File.separatorChar + "out_default", "tests" + File.separatorChar + "proto" + File.separatorChar + "simple.proto" }), 0); // default compilation
    fileAllCodeGenerators ("simple.proto");
  }
  
  @Test
  public void literalsFileAllCodeGenerators () {
    fileAllCodeGenerators ("Literals.proto");
  }
  
  @Test
  public void namespaceFileAllCodeGenerators () {
    fileAllCodeGenerators ("namespace.proto");
  }
  
  @Test
  public void taxonomyFileAllCodeGenerators () {
    fileAllCodeGenerators ("taxonomy.proto");
  }
  
  @Test
  public void typesFileAllCodeGenerators () {
    fileAllCodeGenerators ("types.proto");
  }
  
  @Test
  public void mutablesFileAllCodeGenerators () {
    fileAllCodeGenerators ("mutables.proto");
  }
  
  @Test
  public void inheritanceFileAllCodeGenerators () {
    fileAllCodeGenerators ("inheritance.proto");
  }
  
  @Test
  public void bindingFileAllCodeGenerators () {
    fileAllCodeGenerators ("binding.proto");
  }
  
  @Test
  public void externFileAllCodeGenerators () {
    fileAllCodeGenerators ("extern.proto");
  }
  
  private void fileAllCodeGenerators (final String filename) {
    final CodeGeneratorFactory factory = new CodeGeneratorFactory ();
    // Don't assert on each call so that we get a plethora of error behaviours from all generators, not just the first one to fall over!
    int errorCount = 0;
    for (String language : factory.getLanguages ()) {
      final ArrayList<String> args = new ArrayList<String> ();
      args.add ("-dtests" + File.separatorChar + "out_" + language);
      args.add ("-l" + language);
      args.add ("-stests" + File.separatorChar + "proto");
      args.add (filename);
      if (language.equals ("Java")) {
        args.add ("-Xequals");
        args.add ("-XhashCode");
        args.add ("-XtoString");
      }
      if (CommandLine.compile (args.toArray (new String[0])) != 0) errorCount++;
    }
    assertEquals (errorCount, 0);
  }
  
}
