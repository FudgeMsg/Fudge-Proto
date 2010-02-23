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
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.PatternSet;

/**
 * <p>An Ant task for generating Java files. The following attributes are supported:</p>
 * <ul>
 *   <li>srcdir - source directory (defaults to src), cannot take a path id
 *   <li>destdir - destination directory (defaults to src), cannot take a path id
 *   <li>verbose - true for verbose/debugging output, defaults to false
 *   <li>equals - true to generate equals methods in output, defaults to true
 *   <li>hashCode - true to generate hashCode methods in output, defaults to true
 *   <li>toString - true to generate toString methods in output, defaults to false
 *   <li>rebuildAll - true to ignore timestamps
 *   <li>fudgeContext - default expression to use in place of a parameterized context (e.g. FudgeContext.GLOBAL_DEFAULT)
 *   <li>fieldsMutable - true if fields are mutable by default, false otherwise
 *   <li>fieldsRequired - true if fields are required by default, false otherwise
 *   <li>gitIgnore - true to write a .gitignore file for generated files, defaults to false
 * </ul>  
 * <p><code>&lt;exclude&gt;</code> entries can be included for filename patterns to be ignored.</p>
 * 
 * @author Andrew Griffin
 */
public class AntTask extends Task {
  
  private PatternSet _patternSet = null;
  
  private String _srcdir = "src";
  
  private String _destdir = "src";
  
  private String _searchdir = null;
  
  private boolean _verbose = false;
  
  private boolean _equals = true;
  
  private boolean _hashCode = true;
  
  private boolean _toString = false;
  
  private String _fudgeContext = null;
  
  private boolean _rebuildAll = false;
  
  private Boolean _fieldsMutable = null;
  
  private Boolean _fieldsRequired = null;
  
  private boolean _gitIgnore = false;
  
  public void setSrcdir (final String srcdir) {
    _srcdir = srcdir;
  }
  
  public void setDestdir (final String destdir) {
    _destdir = destdir;
  }
  
  public void setSearchdir (final String searchdir) {
    _searchdir = searchdir;
  }
  
  public void setVerbose (final boolean verbose) {
    _verbose = verbose;
  }
  
  public void setToString (final boolean toString) {
    _toString = toString;
  }
  
  public void setHashCode (final boolean hashCode) {
    _hashCode = hashCode;
  }
  
  public void setEquals (final boolean equals) {
    _equals = equals;
  }
  
  public void setRebuildAll (final boolean rebuildAll) {
    _rebuildAll = rebuildAll;
  }
  
  public void setFudgeContext (final String fudgeContext) {
    if ((fudgeContext == null) || fudgeContext.equals ("")) {
      _fudgeContext = null;
    } else {
      _fudgeContext = fudgeContext;
    }
  }
  
  public void setFieldsMutable (final boolean fieldsMutable) {
    _fieldsMutable = fieldsMutable;
  }
  
  public void setFieldsRequired (final boolean fieldsRequired) {
    _fieldsRequired = fieldsRequired;
  }
  
  public void setGitIgnore (final boolean gitIgnore) {
    _gitIgnore = gitIgnore;
  }
  
  private void findFiles (final File src, File dest, final String srcExt, final String destExt, final List<String> names, final String basePath) {
    if ((dest != null) && !dest.isDirectory ()) dest = null;
    fileloop: for (File file : src.listFiles ()) {
      final String name = file.getName ();
      if (file.isDirectory ()) {
        findFiles (file, (dest != null) ? new File (dest, name) : null, srcExt, destExt, names, basePath);
      } else {
        final int i = name.lastIndexOf ('.');
        if (i >= 0) {
          if (srcExt.equals (name.substring (i))) {
            if (!_rebuildAll) {
              if (dest != null) {
                final File target = new File (dest, name.substring (0, i) + destExt);
                if (target.exists ()) {
                  if (target.lastModified () > file.lastModified ()) {
                    if (_verbose) {
                      System.out.println ("Ignoring " + file);
                    }
                    continue fileloop;
                  }
                }
              }
            }
            String path = file.getAbsolutePath ();
            if (path.startsWith (basePath)) {
              path = path.substring (basePath.length ());
            }
            if (_patternSet != null) {
              final String[] excludes = _patternSet.getExcludePatterns (getProject ());
              for (final String exclude : excludes) {
                if (DirectoryScanner.match (exclude, path)) {
                  if (_verbose) {
                    System.out.println ("Excluding " + file);
                  }
                  continue fileloop;
                }
              }
            }
            if (_verbose) {
              System.out.println ("Loading " + file);
            }
            names.add (path);
          }
        }
      }
    }
  }
  
  @Override
  public void execute () throws BuildException {
    if (!CommandLine.checkPackages ()) throw new BuildException ("check the classpath settings");
    final List<String> args = new ArrayList<String> (10);
    args.add ("-d" + _destdir);
    args.add ("-s" + _srcdir);
    args.add ("-lJava");
    if (_fieldsMutable != null) {
      args.add (_fieldsMutable ? "-fmutable" : "-freadonly");
    }
    if (_fieldsRequired != null) {
      args.add (_fieldsRequired ? "-frequired" : "-foptional");
    }
    if (_searchdir != null) {
      for (String dir : _searchdir.split (File.pathSeparator)) {
        if (_verbose) {
          System.out.println ("Searching " + dir); 
        }
        args.add ("-p" + dir);
      }
    }
    final File srcdir = new File (_srcdir);
    findFiles (srcdir, new File (_destdir), ".proto", ".java", args, srcdir.getAbsolutePath () + File.separatorChar);
    if (_equals) args.add ("-Xequals");
    if (_toString) args.add ("-XtoString");
    if (_hashCode) args.add ("-XhashCode");
    if (_fudgeContext != null) args.add ("-XfudgeContext=" + _fudgeContext);
    if (_gitIgnore) args.add ("-XgitIgnore");
    if (_verbose) {
      System.out.print ("Commandline:");
      for (final String arg : args) {
        System.out.print (' ');
        System.out.print (arg);
      }
      System.out.println ();
    }
    if (CommandLine.compile (args.toArray (new String[args.size ()])) > 0) throw new BuildException ("compilation failed"); 
  }
  
  public PatternSet.NameEntry createExclude () {
    if (_patternSet == null) _patternSet = new PatternSet ();
    return _patternSet.createExclude ();
  }
  
}