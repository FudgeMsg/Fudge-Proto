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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Abstract representation of something containing String/Integer pairings. E.g. an Enum or a Taxonomy.
 * 
 * @author Andrew
 */
public abstract class StringIntPairDefinition extends Definition {
  
  private final Map<String,Integer> _elementsByName = new HashMap<String,Integer>();
  
  private final Map<Integer,String> _elementsByIndex = new HashMap<Integer,String>();
  
  /* package */ StringIntPairDefinition (final String identifier, final CodePosition codePosition, final Definition outerDefinition) {
    super (identifier, codePosition, outerDefinition);
  }
  
  public Integer findElementByName (final String name) {
    return _elementsByName.get (name);
  }
  
  public String findElementByIndex (final int index) {
    return _elementsByIndex.get (index);    
  }
  
  /* package */ void addElement (final String name, final int value) {
    _elementsByName.put (name, value);
    _elementsByIndex.put (value, name);
  }
  
  public Iterator<Map.Entry<String,Integer>> getElements () {
    return _elementsByName.entrySet ().iterator ();
  }
  
}