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

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.BuildException;

/**
 * An Ant task for generating Java files. The following attributes are supported:
 * 
 *   srcdir - source directory (defaults to src), cannot take a path id
 *   destdir - destination directory (defaults to src), cannot take a path id
 *   verbose - true for verbose/debugging output, defaults to false
 *   equals - true to generate equals methods in output, defaults to true
 *   hashCode - true to generate hashCode methods in output, defaults to true
 *   toString - true to generate toString methods in output, defaults to false 
 * 
 * @author Andrew
 */
public class AntTask extends Task {
  
  private String _srcdir = "src";
  
  private String _destdir = "src";
  
  private String _searchdir = null;
  
  private boolean _verbose = false;
  
  private boolean _equals = true;
  
  private boolean _hashCode = true;
  
  private boolean _toString = false;
  
  private String _fudgeContext = null;
  
  private boolean _rebuildAll = false;
  
  public void setSrcdir (final String srcdir) {
    _srcdir = srcdir;
  }
  
  public void setDestdir (final String destdir) {
    _destdir = destdir;
  }
  
  public void setSearchdir (final String searchdir) {
    _searchdir = searchdir;
  }
  
  public void setVerbose (final String verbose) {
    _verbose = verbose.equalsIgnoreCase ("true");
  }
  
  public void setToString (final String toString) {
    _toString = toString.equalsIgnoreCase ("true");
  }
  
  public void setHashCode (final String hashCode) {
    _hashCode = hashCode.equalsIgnoreCase ("true");
  }
  
  public void setEquals (final String equals) {
    _equals = equals.equalsIgnoreCase ("true");
  }
  
  public void setRebuildAll (final String rebuildAll) {
    _rebuildAll = rebuildAll.equalsIgnoreCase ("true");
  }
  
  public void setFudgeContext (final String fudgeContext) {
    if ((fudgeContext == null) || fudgeContext.equals ("")) {
      _fudgeContext = null;
    } else {
      _fudgeContext = fudgeContext;
    }
  }
  
  private void findFiles (final File src, File dest, final String srcExt, final String destExt, final List<String> names) {
    if ((dest != null) && !dest.isDirectory ()) dest = null;
    for (File file : src.listFiles ()) {
      final String name = file.getName ();
      if (file.isDirectory ()) {
        findFiles (file, (dest != null) ? new File (dest, name) : null, srcExt, destExt, names);
      } else {
        final int i = name.lastIndexOf ('.');
        if (i >= 0) {
          if (srcExt.equals (name.substring (i))) {
            if (!_rebuildAll) {
              if (dest != null) {
                final File target = new File (dest, name.substring (0, i) + destExt);
                if (target.exists ()) {
                  if (target.lastModified () > file.lastModified ()) {
                    continue;
                  }
                }
              }
            }
            if (_verbose) {
              System.out.println ("Loading " + file);
            }
            names.add (file.getAbsolutePath ());
          }
        }
      }
    }
  }
  
  @Override
  public void execute () throws BuildException {
    if (!CommandLine.checkPackages ()) throw new BuildException ("check the classpath settings");
    final List<String> args = new ArrayList<String> (3);
    args.add ("-d" + _destdir);
    args.add ("-s" + _srcdir);
    args.add ("-lJava");
    if (_searchdir != null) {
      for (String dir : _searchdir.split (File.pathSeparator)) {
        if (_verbose) {
          System.out.println ("Searching " + dir); 
        }
        args.add ("-p" + dir);
      }
    }
    findFiles (new File (_srcdir), new File (_destdir), ".proto", ".java", args);
    if (_equals) args.add ("-Xequals");
    if (_toString) args.add ("-XtoString");
    if (_hashCode) args.add ("-XhashCode");
    if (_fudgeContext != null) args.add ("-XfudgeContext=" + _fudgeContext);
    if (CommandLine.compile (args.toArray (new String[args.size ()])) > 0) throw new BuildException ("compilation failed"); 
  }
  
}