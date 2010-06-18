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

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Abstract representation of something containing String/Value pairings. E.g. an Enum or a Taxonomy.
 * 
 * @author Andrew
 */
public abstract class StringValuePairDefinition<T> extends Definition {
  
  private final Map<String,T> _elementsByName = new LinkedHashMap<String,T>();
  
  private final Map<T,String> _elementsByValue = new HashMap<T,String>();
  
  /* package */ StringValuePairDefinition (final String identifier, final CodePosition codePosition, final Definition outerDefinition, final boolean compilationTarget) {
    super (identifier, codePosition, outerDefinition, compilationTarget);
  }
  
  public Map.Entry<String,T> findElementByName (final String name) {
    if (_elementsByName.containsKey (name)) {
      return new AbstractMap.SimpleImmutableEntry<String,T> (name, _elementsByName.get (name));
    } else {
      return null;
    }
  }
  
  public Map.Entry<String,T> findElementByValue (final T index) {
    String name = _elementsByValue.get (index);
    if (name != null) {
      return findElementByName (name);
    } else {
      return null;
    }
  }
  
  /* package */ void addElement (final String name, final T value) {
    _elementsByName.put (name, value);
    if (value != null) {
      _elementsByValue.put (value, name);
    }
  }
  
  public Iterable<Map.Entry<String,T>> getElements () {
    return _elementsByName.entrySet ();
  }
  
}