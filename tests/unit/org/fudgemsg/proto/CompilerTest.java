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

public class CompilerTest {
  
  @Test
  public void defaultSuccessfulCompilation () {
    final Compiler compiler = new Compiler ();
    compiler.addSource (new SourceFile (new File ("tests" + File.separatorChar + "proto" + File.separatorChar + "simple.proto")));
    compiler.setTargetPath (new File ("tests" + File.separatorChar + "out_default"));
    compiler.compileAll ();
    assertEquals (compiler.getWarningCount (), 0);
    assertEquals (compiler.getErrorCount (), 0);
  }
  
  @Test(expected=CompilationException.class)
  public void defaultErrorCompilation () {
    final Compiler compiler = new Compiler ();
    compiler.addSource (new SourceFile (new File ("doesn't exist")));
    compiler.compileAll ();
  }
  
}