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

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CompilerTest {
  
  protected static String getTestBaseDir () {
    // TODO 2010-02-12 Andrew -- this won't work in the combined OG-Build tests
    return "tests";
  }
  
  protected static String getTestPath (final String ... components) {
    final StringBuilder path = new StringBuilder (getTestBaseDir ());
    for (String component : components) {
      path.append (File.separatorChar).append (component);
    }
    return path.toString ();
  }
  
  @Test(expected=CompilationException.class)
  public void defaultErrorCompilation () {
    final Compiler compiler = new Compiler ();
    compiler.addSource (new SourceFile ("non-existent", new File ("doesn't exist")));
    compiler.compileAll ();
  }
  
  private static class ErrorListener implements Compiler.ErrorListener {
    
    private final Set<String> _messages = new HashSet<String> ();
    
    @Override
    public void compilerError(CodePosition position, String message) {
      _messages.add (message);
    }
    
    private void dumpMessages () {
      for (String message : _messages) {
        System.out.println (message);
      }
    }
    
    public ErrorListener assertMessage (final String message) {
      if (!_messages.contains (message)) {
        dumpMessages ();
        fail ("expected error '" + message + "'");
      } else {
        _messages.remove (message);
      }
      return this;
    }
    
    public ErrorListener assertNoMoreMessages () {
      if (_messages.size () > 0) {
        dumpMessages ();
        fail (_messages.size () + " unexpected messages");
      }
      return this;
    }
    
  }
  
  private ErrorListener compilerError (final String ... refs) {
    final Compiler compiler = new Compiler ();
    final ErrorListener errors = new ErrorListener ();
    compiler.setErrorListener (errors);
    for (String ref : refs) {
      compiler.addSource (new SourceFile (ref + ".proto", new File (getTestPath ("proto", "errors", ref + ".proto"))));
    }
    compiler.compileAll ();
    return errors;
  }
  
  @Test
  public void errorE201002221611 () {
    compilerError ("E201002221611a").assertMessage ("duplicate definition of identifier 'foo.Foo'").assertNoMoreMessages ();
    compilerError ("E201002221611b", "E201002221611c").assertMessage ("duplicate definition of identifier 'foo.Foo'").assertNoMoreMessages ();
    compilerError ("E201002221611c", "E201002221611b").assertMessage ("duplicate definition of identifier 'foo.Foo'").assertNoMoreMessages ();
  }
  
}