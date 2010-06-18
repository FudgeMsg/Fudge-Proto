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

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Concrete implementation of a Source that is backed by a ZipFile.
 * 
 * @author Andrew
 */
public class ZipSourceFile extends AbstractSource {
  
  private final ZipFile _zipFile;
  private final ZipEntry _zipEntry;
  
  public ZipSourceFile (final String displayName, final ZipFile zipFile, final ZipEntry zipEntry, final SourceResolver resolver, final boolean isCompilationTarget) {
    super (displayName, resolver, isCompilationTarget);
    _zipFile = zipFile;
    _zipEntry = zipEntry;
  }
  
  protected ZipFile getZipFile () {
    return _zipFile;
  }
  
  protected ZipEntry getZipEntry () {
    return _zipEntry;
  }
  
  @Override
  public boolean equals (final Object o) {
    if (o == null) return false;
    if (o == this) return true;
    if (!(o instanceof ZipSourceFile)) return false;
    final ZipSourceFile jsf = (ZipSourceFile)o;
    return jsf.getZipFile ().equals (getZipFile ()) && jsf.getZipEntry ().equals (getZipEntry ());
  }

  @Override
  protected InputStream openInputStream() throws IOException {
    return getZipFile ().getInputStream (getZipEntry ());
  }
  
}