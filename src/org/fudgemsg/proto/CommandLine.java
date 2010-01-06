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

import java.io.File;
import java.io.IOException;

/**
 * A basic command line compiler.
 * 
 * @author Andrew
 */
public class CommandLine implements Compiler.WarningListener, Compiler.ErrorListener, SourceFile.Resolver {
  
  private static final String MSG_WARN = "Warning";
  private static final String MSG_ERROR = "Error";
  private static final String MSG_INFO = "Info";
  
  private File _sourceDir = new File (".");
  
  private CommandLine () {
  }
  
  private static void compilerMessage (final String pfx, final CodePosition position, final String message) {
    final StringBuilder sb = new StringBuilder ();
    if (position != null) sb.append (position.toString ()).append (": ");
    sb.append (pfx).append (": ");
    sb.append (message);
    System.err.println (sb.toString ());
  }
  
  @Override
  public void compilerWarning (final CodePosition position, final String message) {
    compilerMessage (MSG_WARN, position, message);
  }
  
  @Override
  public void compilerError (final CodePosition position, final String message) {
    compilerMessage (MSG_ERROR, position, message);
  }
  
  @Override
  public File findSource (final String identifier) throws IOException {
    final String[] identifierAsArray = identifier.split ("\\.");
    final StringBuilder stem = new StringBuilder ();
    for (int i = 0; i < identifierAsArray.length; i++) {
      if (i > 0) stem.append (File.separatorChar);
      stem.append (identifierAsArray[i]);
      final int ext = stem.length ();
      stem.append (".proto");
      final File f = new File (_sourceDir, stem.toString ());
      stem.delete (ext, ext + 6);
      if (f.exists ()) return f;
    }
    return null;
  }
  
  /**
   * Actual implementation of the program entry point, but returns the exit code. This is to facilitate testing, or crudely embedding the
   * compiler into an IDE or something.
   */
  public static int compile (final String[] args) {
    final CommandLine cmdLine = new CommandLine ();
    final Compiler compiler = new Compiler ();
    final CodeGeneratorFactory codeGeneratorFactory = new CodeGeneratorFactory ();
    compiler.setWarningListener (cmdLine);
    compiler.setErrorListener (cmdLine);
    for (int i = 0; i < args.length; i++) {
      if ((args[i].charAt (0) == '-') || (args[i].charAt (0) == '/')) {
        switch (args[i].charAt (1)) {
        case 'd' : // -d<path>        Select an output folder for the generated files
          compiler.setTargetPath (new File (args[i].substring (2)));
          break;
        case 'l': // -l<language>     Select a language binding for the output files
          compiler.setCodeGenerator(codeGeneratorFactory.createCodeGenerator(args[i].substring(2)));
          break;
        case 's': // -s<path>         Select a source folder for loading in referenced files
          cmdLine._sourceDir = new File (args[i].substring (2));
          break;
        default:
          cmdLine.compilerError (null, "invalid command line option " + args[i]);
          return 1;
        }
      } else {
        final File f = (cmdLine._sourceDir != null) ? new File (cmdLine._sourceDir, args[i]) : new File (args[i]);
        if (f.exists ()) {
          compiler.addSource (new SourceFile (f, cmdLine));
        } else {
          cmdLine.compilerError (null, "source file '" + args[i] + "' doesn't exist");
          return 1;
        }
      }
    }
    compiler.compileAll ();
    final int warnings = compiler.getWarningCount ();
    final int errors = compiler.getErrorCount ();
    if ((warnings > 0) || (errors > 0)) {
      compilerMessage (MSG_INFO, null, "" + warnings + " warning(s), " + errors + " error(s)");  
    }
    return (errors > 0) ? 1 : 0;
  }
    
  /**
   * Program entry point.
   */
  public static void main (final String[] args) {
    try {
      Class.forName ("org.antlr.runtime.Parser", false, CommandLine.class.getClassLoader ());
    } catch (ClassNotFoundException e) {
      compilerMessage (MSG_ERROR, null, "The ANTLR2 runtime is not available in the classpath");
      System.exit (1);
    }
    System.exit (compile (args));
  }
  
}