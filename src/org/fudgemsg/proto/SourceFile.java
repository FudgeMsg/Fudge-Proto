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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Concrete implementation of a Source that is backed by a File.
 * 
 * @author Andrew
 */
public class SourceFile extends AbstractSource {
  
  private final File _file;
  
  public SourceFile (final String displayName, final File file) {
    this (displayName, file, null, true);
  }
  
  public SourceFile (final String displayName, final File file, final boolean isCompilationTarget) {
    this (displayName, file, null, isCompilationTarget);
  }
  
  public SourceFile (final String displayName, final File file, final SourceResolver resolver, final boolean isCompilationTarget) {
    super (displayName, resolver, isCompilationTarget);
    _file = file;
  }
  
  protected File getFile () {
    return _file;
  }
  
  @Override
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (o == this) return true;
    if (!(o instanceof SourceFile)) return false;
    final SourceFile sf = (SourceFile)o;
    return sf._file.equals (_file);
  }

  @Override
  protected InputStream openInputStream() throws FileNotFoundException {
    return new FileInputStream (getFile ());
  }
  
}