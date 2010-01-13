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

import org.junit.Test;

public class CommandLineTest {
  
  @Test
  public void parameterPassing () {
    assertEquals (CommandLine.compile (new String[] { }), 0); // no parameters = no action, okay
    assertEquals (CommandLine.compile (new String[] { "-dtests" + File.separatorChar + "output" }), 0); // select a different output folder
    assertEquals (CommandLine.compile (new String[] { "-lC#" }), 0); // select a different language
    assertEquals (CommandLine.compile (new String[] { "-stests" + File.separatorChar + "proto" }), 0); // select a different language
    assertEquals (CommandLine.compile (new String[] { "-x" }), 1); // bad parameter
  }
  
  @Test
  public void simpleFileAllCodeGenerators () {
    assertEquals (CommandLine.compile (new String[] { "-dtests" + File.separatorChar + "out_default", "tests" + File.separatorChar + "proto" + File.separatorChar + "simple.proto" }), 0); // default compilation
    fileAllCodeGenerators ("simple.proto");
  }
  
  @Test
  public void literalFileAllCodeGenerators () {
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
    fileAllCodeGenerators ("Types.proto");
  }
  
  @Test
  public void mutablesFileAllCodeGenerators () {
    fileAllCodeGenerators ("Mutables.proto");
  }
  
  @Test
  public void inheritanceFileAllCodeGenerators () {
    fileAllCodeGenerators ("inheritance.proto");
  }
  
  @Test
  public void bindingFileAllCodeGenerators () {
    fileAllCodeGenerators ("BindingJava.proto");
    // TODO 2010-01-07 Andrew -- binding test file for other code generators
  }
  
  private void fileAllCodeGenerators (final String filename) {
    final CodeGeneratorFactory factory = new CodeGeneratorFactory ();
    // Don't assert on each call so that we get a plethora of error behaviours from all generators, not just the first one to fall over!
    int errorCount = 0;
    for (String language : factory.getLanguages ()) {
      if (CommandLine.compile (new String[] { "-dtests" + File.separatorChar + "out_" + language, "-l" + language, "-stests" + File.separatorChar + "proto", filename }) != 0) errorCount++;
    }
    assertEquals (errorCount, 0);
  }
  
}
