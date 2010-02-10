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
  
  private final String _displayName;
  
  private final File _file;
  
  private final SourceResolver _resolver;
  
  private final boolean _isCompilationTarget;
  
  public SourceFile (final String displayName, final File file) {
    this (displayName, file, null, true);
  }
  
  public SourceFile (final String displayName, final File file, final boolean isCompilationTarget) {
    this (displayName, file, null, isCompilationTarget);
  }
  
  public SourceFile (final String displayName, final File file, final SourceResolver resolver) {
    this (displayName, file, resolver, true);
  }
  
  public SourceFile (final String displayName, final File file, final SourceResolver resolver, final boolean isCompilationTarget) {
    _displayName = displayName;
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
    if (getResolver () == null) return null;
    return getResolver ().findSource (identifier);
  }
  
  protected File getFile () {
    return _file;
  }
  
  protected SourceResolver getResolver () {
    return _resolver;
  }
  
  @Override
  public boolean isCompilationTarget () {
    return _isCompilationTarget;
  }
  
  @Override
  public String toString () {
    return _displayName;
  }
  
  @Override
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (!(o instanceof SourceFile)) return false;
    final SourceFile sf = (SourceFile)o;
    return sf._file.equals (_file);
  }
  
}