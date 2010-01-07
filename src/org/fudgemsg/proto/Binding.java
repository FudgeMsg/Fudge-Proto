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

import java.util.Map;
import java.util.HashMap;

/**
 * Language binding data. This is custom code and instructions specific for a given code generator
 * that can be embedded within a .proto file.
 * 
 * @author Andrew
 */
public class Binding {
  
  /* package */ static final Binding EMPTY_BINDING = new Binding (); 
  
  public static class Data {
    
    private final String _value;
    
    private final CodePosition _codePosition;
    
    private Data (final String value, final CodePosition codePosition) {
      _value = value;
      _codePosition = codePosition;
    }
    
    public String getValue () {
      return _value;
    }
    
    public CodePosition getCodePosition () {
      return _codePosition;
    }
    
  }
  
  private final Map<String,Data> _data = new HashMap<String,Data> ();
  
  /* package */ Binding () {
  }
  
  public Data getData (final String key) {
    if (key == null) throw new IllegalArgumentException ("key must not be null");
    return _data.get (key);
  }
  
  /* package */ void setData (final String key, final String data, final CodePosition codePosition) {
    if (key == null) throw new IllegalArgumentException ("key must not be null");
    if (codePosition == null) throw new IllegalArgumentException ("codePosition must not be null");
    if (data == null) {
      _data.remove (key);
    } else {
      _data.put (key, new Data (data, codePosition));
    }
  }
  
}