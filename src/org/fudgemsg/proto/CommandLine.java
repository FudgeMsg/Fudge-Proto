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
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * A basic command line compiler.
 * 
 * @author Andrew
 */
public class CommandLine implements Compiler.WarningListener, Compiler.ErrorListener, Compiler.VerboseListener, SourceResolver {
  
  private static final String MSG_WARN = "Warning";
  private static final String MSG_ERROR = "Error";
  private static final String MSG_INFO = "Info";
  
  private File _sourceDir = new File (".");
  
  private List<Object> _searchPath = new ArrayList<Object> ();
  
  private int _verbosity = 0;
  
  private CommandLine () {
  }
  
  private static void compilerMessage (final boolean err, final String pfx, final CodePosition position, final String message) {
    final StringBuilder sb = new StringBuilder ();
    if (position != null) sb.append (position.toString ()).append (": ");
    sb.append (pfx).append (": ");
    sb.append (message);
    (err ? System.err : System.out).println (sb.toString ());
  }
  
  private boolean addSearchDir (final File path) {
    if (path.isDirectory ()) {
      _searchPath.add (path);
      return true;
    }
    final String name = path.getName ();
    final int dot = name.lastIndexOf ('.');
    try {
      if (dot > 0) {
        final String ext = name.substring (dot + 1);
        if (ext.equals ("zip") || ext.equals ("war") || ext.equals ("jar")) {
          _searchPath.add (new ZipFile (path));
          return true;
        }
      }
    } catch (IOException e) {
      // ignore - error will be handled below
    }
    compilerError (null, path.getPath () + " invalid search path element"); 
    return false;
  }
  
  @Override
  public void compilerWarning (final CodePosition position, final String message) {
    compilerMessage (true, MSG_WARN, position, message);
  }
  
  @Override
  public void compilerError (final CodePosition position, final String message) {
    compilerMessage (true, MSG_ERROR, position, message);
  }
  
  private Source findSource (final File dir, final String[] identifier, final boolean compilationTarget) throws IOException {
    final StringBuilder stem = new StringBuilder ();
    for (int i = 0; i < identifier.length; i++) {
      if (i > 0) stem.append (File.separatorChar);
      stem.append (identifier[i]);
      final int ext = stem.length ();
      stem.append (".proto");
      final File f = new File (dir, stem.toString ());
      if (f.exists ()) return new SourceFile (stem.toString (), f, this, compilationTarget);
      stem.delete (ext, ext + 6);
    }
    return null;
  }
  
  private Source findSource (final ZipFile zip, final String[] identifier, final boolean compilationTarget) throws IOException {
    final StringBuilder stem = new StringBuilder ();
    for (int i = 0; i < identifier.length; i++) {
      if (i > 0) stem.append (File.separatorChar);
      stem.append (identifier[i]);
      final int ext = stem.length ();
      stem.append (".proto");
      final ZipEntry entry = zip.getEntry (stem.toString ());
      if (entry != null) {
        return new ZipSourceFile (stem.toString (), zip, entry, this, compilationTarget);
      }
      stem.delete (ext, ext + 6);
    }
    return null;
  }
  
  @Override
  public Source findSource (final String identifier) throws IOException {
    final String[] identifierAsArray = identifier.split ("\\.");
    Source source;
    if ((source = findSource (_sourceDir, identifierAsArray, true)) != null) return source;
    for (Object elem : _searchPath) {
      if (elem instanceof File) {
        if ((source = findSource ((File)elem, identifierAsArray, false)) != null) return source;
      } else if (elem instanceof ZipFile) {
        if ((source = findSource ((ZipFile)elem, identifierAsArray, false)) != null) return source;
      } else {
        throw new IllegalStateException ("unexpected object '" + elem + "' in search path");
      }
    }
    return null;
  }
  
  private void setVerbosity (final int level) {
    _verbosity = level;
  }
  
  @Override
  public int getVerbosity () {
    return _verbosity;
  }
  
  @Override
  public void verboseMessage (final String message) {
    compilerMessage (false, MSG_INFO, null, message);
  }
  
  private boolean codeGenOption (final CodeGenerator codeGen, final String option) {
    if (codeGen == null) {
      compilerError (null, "-X option invalid before -l");
      return false;
    }
    int i = option.indexOf ('=');
    try {
      if (i < 0) {
        codeGen.setOption (option);
      } else {
        codeGen.setOption (option.substring (0, i), option.substring (i + 1));
      }
    } catch (IllegalArgumentException e) {
      compilerError (null, e.getMessage ());
      return false;
    }
    return true;
  }
  
  private boolean fieldDefaultProperty (final Compiler compiler, final String str) {
    if (str.equals ("readonly")) {
      compiler.setDefaultFieldsMutable (false);
    } else if (str.equals ("mutable")) {
      compiler.setDefaultFieldsMutable (true);
    } else if (str.equals ("required")) {
      compiler.setDefaultFieldsRequired (true);
    } else if (str.equals ("optional")) {
      compiler.setDefaultFieldsRequired (false);
    } else {
      compilerError (null, "invalid field modifier '" + str + "'");
      return false;
    }
    return true;
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
    compiler.setVerboseListener (cmdLine);
    for (int i = 0; i < args.length; i++) {
      if (args[i].charAt (0) == '-') {
        switch (args[i].charAt (1)) {
        case 'd' : // -d<path>        Select an output folder for the generated files
          compiler.setTargetPath (new File (args[i].substring (2)));
          break;
        case 'f' : // -f<property>    Set a field default property (readonly, mutable, required, optional)
          if (!cmdLine.fieldDefaultProperty (compiler, args[i].substring (2))) {
            return 1;
          }
          break;
        case 'l' : // -l<language>    Select a language binding for the output files
          compiler.setCodeGenerator(codeGeneratorFactory.createCodeGenerator(args[i].substring(2)));
          break;
        case 's' : // -s<path>        Select a source folder for loading in referenced files
          cmdLine._sourceDir = new File (args[i].substring (2));
          break;
        case 'p' : // -p<path>        Add a source folder for loading additional .proto files from (no code will be generated)
          if (!cmdLine.addSearchDir (new File (args[i].substring (2)))) {
            return 1;
          }
          break;
        case 'v' : // -v[v[v]]        Verbosity level
          if (args[i].equals ("-v")) {
            cmdLine.setVerbosity (1);
          } else if (args[i].equals ("-vv")) {
            cmdLine.setVerbosity (2);
          } else if (args[i].equals ("-vvv")) {
            cmdLine.setVerbosity (3);
          } else {
            cmdLine.compilerError (null, "invalid command line option " + args[i]);
            return 1;
          }
          break;
        case 'X' : // -X<option>[=<value>]  Pass flags to the code generator
          if (!cmdLine.codeGenOption (compiler.getCodeGenerator (), args[i].substring (2))) {
            return 1;
          }
          break;
        default:
          cmdLine.compilerError (null, "invalid command line option " + args[i]);
          return 1;
        }
      } else {
        File f = new File (args[i]);
        if (!f.isAbsolute ()) {
          if (cmdLine._sourceDir != null) {
            f = new File (cmdLine._sourceDir, args[i]);
          }
        }
        if (f.exists ()) {
          String displayName = args[i];
          if (cmdLine._sourceDir != null) {
            final String pfx = cmdLine._sourceDir.toString () + File.separatorChar;
            if (displayName.startsWith (pfx)) {
              displayName = displayName.substring (pfx.length ());
            }
          }
          compiler.addSource (new SourceFile (displayName, f, cmdLine, true));
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
      compilerMessage (true, MSG_INFO, null, "" + warnings + " warning(s), " + errors + " error(s)");  
    }
    return (errors > 0) ? 1 : 0;
  }
  
  private static boolean checkPackage (final String testClass, final String packageName) {
    try {
      Class.forName (testClass, false, CommandLine.class.getClassLoader ());
      return true;
    } catch (ClassNotFoundException e) {
      compilerMessage (true, MSG_ERROR, null, "The " + packageName + " is not available in the classpath");
      return false;
    }
  }
  
  public static boolean checkPackages () {
    return checkPackage ("org.antlr.runtime.Parser", "antlr3") && checkPackage ("org.fudgemsg.FudgeMsg", "fudge-java");
  }
    
  /**
   * Program entry point.
   */
  public static void main (final String[] args) {
    if (!checkPackages ()) System.exit (1);
    System.exit (compile (args));
  }
  
}