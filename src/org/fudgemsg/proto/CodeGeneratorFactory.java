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
import java.util.Set;

/**
 * Factory class to manage a set of language bindings and instantiate them for use by Compiler instances.
 * The default implementation contains mappings for all of the language code generators available in this
 * package.
 * 
 * @author Andrew
 */
public class CodeGeneratorFactory {
  
  private static CodeGeneratorFactory _defaultInstance = null;
  
  public static final String DEFAULT_LANG = org.fudgemsg.proto.java.JavaCodeGenerator.LANG_ID;
  
  private final HashMap<String,Class<? extends CodeGenerator>> _codeGenerators = new HashMap<String,Class<? extends CodeGenerator>>();

  /**
   * Creates a new factory with the default (built in) language bindings. Note that this implementation is not thread safe - you must synchronise externally.
   */
  public CodeGeneratorFactory () {
    registerCodeGenerator (org.fudgemsg.proto.c.CCodeGenerator.LANG_ID, org.fudgemsg.proto.c.CCodeGenerator.class);
    registerCodeGenerator (org.fudgemsg.proto.csharp.CSharpCodeGenerator.LANG_ID, org.fudgemsg.proto.csharp.CSharpCodeGenerator.class);
    registerCodeGenerator (org.fudgemsg.proto.cpp.CPPCodeGenerator.LANG_ID, org.fudgemsg.proto.cpp.CPPCodeGenerator.class);
    registerCodeGenerator (org.fudgemsg.proto.java.JavaCodeGenerator.LANG_ID, org.fudgemsg.proto.java.JavaCodeGenerator.class); 
    registerCodeGenerator (org.fudgemsg.proto.proto.ProtoCodeGenerator.LANG_ID, org.fudgemsg.proto.proto.ProtoCodeGenerator.class);
  }
  
  public void registerCodeGenerator (final String lang, final Class<? extends CodeGenerator> clazz) {
    _codeGenerators.put (lang, clazz);
  }
  
  protected Class<? extends CodeGenerator> getCodeGenerator (final String lang) {
    return _codeGenerators.get (lang);
  }
  
  /* package */ CodeGenerator createCodeGenerator (final String lang) {
    Class<? extends CodeGenerator> clazz = getCodeGenerator (lang);
    if (clazz == null) throw new IllegalArgumentException ("Code generator for '" + lang + "' not found");
    try {
      return clazz.newInstance ();
    } catch (InstantiationException e) {
      throw new IllegalArgumentException ("Code generator for '" + lang + "' could not be started", e);
    } catch (IllegalAccessException e) {
      throw new IllegalArgumentException ("Code generator for '" + lang + "' could not be started", e);
    }
  }
  
  @SuppressWarnings("unchecked") // the cast from clone below -- is there a better way to return a read only set of the keys ?
  public Set<String> getLanguages () {
    final HashMap<String,?> copy = (HashMap<String,?>)_codeGenerators.clone ();
    return copy.keySet ();
  }
  
  private static CodeGeneratorFactory getDefaultInstance () {
    if (_defaultInstance == null) {
      synchronized (CodeGeneratorFactory.class) {
        if (_defaultInstance == null) {
          _defaultInstance = new CodeGeneratorFactory ();
        }
      }
    }
    return _defaultInstance;
  }
  
  /* package */ static CodeGenerator createDefaultCodeGenerator () {
    return getDefaultInstance ().createCodeGenerator (DEFAULT_LANG);
  }
  
}