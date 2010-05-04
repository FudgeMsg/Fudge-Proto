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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CodeGenerationTest extends DefaultSettings {
  
  private static final Map<String,Boolean> s_compiled = new HashMap<String,Boolean> ();
  
  @Test
  public void simpleFileAllCodeGenerators () {
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
  
  @Test
  public void polymorphismFileAllCodeGenerators () {
    fileAllCodeGenerators ("polymorphism.proto");
  }
  
  @Test
  public void enumFileAllCodeGenerators () {
    fileAllCodeGenerators ("enums.proto");
  }
  
  private void fileAllCodeGenerators (final String filename) {
    final CodeGeneratorFactory factory = new CodeGeneratorFactory ();
    int errorCount = 0;
    if (!fileCodeGenerator (filename, null)) errorCount++; // default compilation
    for (String language : factory.getLanguages ()) {
      if (!fileCodeGenerator (filename, language)) errorCount++;
    }
    assertEquals (0, errorCount);
  }
  
  protected static void codeGeneratorAllFiles (final String language) {
    fileCodeGenerator ("simple.proto", language);
    fileCodeGenerator ("Literals.proto", language);
    fileCodeGenerator ("namespace.proto", language);
    fileCodeGenerator ("taxonomy.proto", language);
    fileCodeGenerator ("types.proto", language);
    fileCodeGenerator ("mutables.proto", language);
    fileCodeGenerator ("inheritance.proto", language);
    fileCodeGenerator ("binding.proto", language);
    fileCodeGenerator ("extern.proto", language);
    fileCodeGenerator ("polymorphism.proto", language);
    fileCodeGenerator ("enums.proto", language);
  }
  
  protected static boolean fileCodeGenerator (final String filename, final String language) {
    final String key = filename + ":" + language;
    if (s_compiled.containsKey (key)) {
      final boolean result = s_compiled.get (key);
      System.out.println ("File " + filename + " already processed for " + language + " (" + (result ? "Ok" : "Failed") + ")");
      return result;
    }
    final ArrayList<String> args = new ArrayList<String> ();
    args.add ("-d" + CompilerTest.getTestPath ("out_" + (language != null ? language : "default")));
    args.add ("-s" + CompilerTest.getTestPath ("proto"));
    args.add ("-freadonly"); // non-mutable field default
    args.add ("-foptional"); // optional field default
    args.add ("-vvv"); // full verbose output
    if (language != null) {
      args.add ("-l" + language);
      addLanguageOptions (language, args);
    }
    args.add (filename);
    final boolean result = (CommandLine.compile (args.toArray (new String[0])) == 0);
    s_compiled.put (key, result);
    return result;
  }
  
  protected static void addLanguageOptions (final String language, final ArrayList<String> args) {
    if (language.equals ("Java")) {
      args.add ("-Xequals");
      args.add ("-XhashCode");
      args.add ("-XtoString");
    }
  }
  
}
