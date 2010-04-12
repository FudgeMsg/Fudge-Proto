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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Partial implementation of a Source that is backed by an InputStream of some description.
 * 
 * @author Andrew
 */
public abstract class AbstractSource implements Source {
  
  private final String _displayName;
  
  private final SourceResolver _resolver;
  
  private final boolean _isCompilationTarget;
  
  public AbstractSource (final String displayName) {
    this (displayName, null, true);
  }
  
  public AbstractSource (final String displayName, final boolean isCompilationTarget) {
    this (displayName, null, isCompilationTarget);
  }
  
  public AbstractSource (final String displayName, final SourceResolver resolver) {
    this (displayName, resolver, true);
  }
  
  public AbstractSource (final String displayName, final SourceResolver resolver, final boolean isCompilationTarget) {
    _displayName = displayName;
    _resolver = resolver;
    _isCompilationTarget = isCompilationTarget;
  }
  
  protected abstract InputStream openInputStream () throws IOException;
  
  @Override
  public Reader openReader () throws IOException {
      return new InputStreamReader (new BufferedInputStream (openInputStream ()));
  }
  
  @Override
  public Source findSource (final String identifier) throws IOException {
    if (getResolver () == null) return null;
    return getResolver ().findSource (identifier);
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
  
}