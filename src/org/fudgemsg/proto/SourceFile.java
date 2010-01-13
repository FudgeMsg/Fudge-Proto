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

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Concrete implementation of a Source that is backed by a File that can be read.
 * 
 * @author Andrew
 */
public class SourceFile implements Source {
  
  public static interface Resolver {
    
    /**
     * Returns a candidate target file to contain the identifier, or null if no logics are available.
     * The files doesn't have to exist - we will check for that before continuing. 
     */
    public File findCompilationTargetSource (final String identifier) throws IOException;
    
    /**
     * Returns a candidate non-target file to contain the identifier, or null if no logics are available.
     * The files doesn't have to exist - we will check for that before continuing. 
     */
    public File findNonCompilationTargetSource (final String identifier) throws IOException;
    
  }
  
  private final File _file;
  
  private final Resolver _resolver;
  
  private final boolean _isCompilationTarget;
  
  public SourceFile (final File file) {
    this (file, null, true);
  }
  
  public SourceFile (final File file, final boolean isCompilationTarget) {
    this (file, null, isCompilationTarget);
  }
  
  public SourceFile (final File file, final Resolver resolver) {
    this (file, resolver, true);
  }
  
  public SourceFile (final File file, final Resolver resolver, final boolean isCompilationTarget) {
    _file = file;
    _resolver = resolver;
    _isCompilationTarget = isCompilationTarget;
  }
  
  @Override
  public Reader openReader () throws IOException {
      return new InputStreamReader (new BufferedInputStream (new FileInputStream (_file)));
  }
  
  @Override
  public Source findSource (final String identifier) throws IOException {
    if (_resolver == null) return null;
    File f = _resolver.findCompilationTargetSource (identifier);
    if ((f != null) && (f.exists ())) return new SourceFile (f, _resolver, true);
    f = _resolver.findNonCompilationTargetSource (identifier);
    if ((f != null) && (f.exists ())) return new SourceFile (f, _resolver, false);
    return null;
  }
  
  @Override
  public boolean isCompilationTarget () {
    return _isCompilationTarget;
  }
  
  @Override
  public String toString () {
    return _file.getPath ();
  }
  
  @Override
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof SourceFile)) return false;
    final SourceFile sf = (SourceFile)o;
    return sf._file.equals (_file);
  }
  
}