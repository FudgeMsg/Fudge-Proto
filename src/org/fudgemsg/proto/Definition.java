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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Base class for any 'definition' objects. There are some common behaviours for all such as
 * tracking the source code positions, but also this allows some item types to share a unique
 * identifier namespace.
 * 
 * @author Andrew
 */ 
public abstract class Definition {
  
  private final Definition _outerDefinition;
  
  private final String _identifier;
  
  private final CodePosition _codePosition;
  
  private final Map<String,Binding> _languageBindings = new HashMap<String,Binding> ();
  
  private final boolean _compilationTarget;
  
  /* package */ Definition (final String identifier, final CodePosition codePosition, final Definition outerDefinition, final boolean compilationTarget) {
    _identifier = identifier;
    _codePosition = codePosition;
    _outerDefinition = outerDefinition;
    _compilationTarget = compilationTarget;
  }
  
  /* package */ Binding createLanguageBinding (final String identifier) {
    Binding b = _languageBindings.get (identifier);
    if (b != null) return b;
    b = new Binding ();
    _languageBindings.put (identifier, b);
    return b;
  }
  
  public Binding getLanguageBinding (final String identifier) {
    final Binding b = _languageBindings.get (identifier);
    return (b != null) ? b : Binding.EMPTY_BINDING;
  }
  
  public Map<String,Binding> getAllLanguageBindings () {
    return Collections.unmodifiableMap (_languageBindings);
  }
  
  public String getIdentifier () {
    return _identifier;
  }
  
  public String[] getIdentifierArray () {
    return _identifier.split ("\\.");
  }
  
  public String getName () {
    final int l = _identifier.lastIndexOf ('.');
    return (l >= 0) ? _identifier.substring (l + 1) : _identifier;
  }
  
  public String getNamespace () {
    final int l = _identifier.lastIndexOf ('.');
    return (l >= 0) ? _identifier.substring (0, l) : null;
  }
  
  public CodePosition getCodePosition () {
    return _codePosition;
  }
  
  public Definition getOuterDefinition () {
    return _outerDefinition;
  }
  
  public boolean isCompilationTarget () {
    return _compilationTarget;
  }
  
  @Override
  public String toString () {
    return _identifier + "[" + _codePosition + "] = " + getClass ().getName ();
  }
  
}