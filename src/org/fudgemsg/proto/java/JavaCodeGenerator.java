/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
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

package org.fudgemsg.proto.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.fudgemsg.proto.Binding;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.proto.InnerClassCodeGenerator;

/**
 * Code generator for the Java Fudge implementation
 * 
 * @author Andrew
 */
public class JavaCodeGenerator extends InnerClassCodeGenerator {
  
  public static final String LANG_ID = "Java";
  
  /* package */ static enum ProtoBinding {
    /**
     * Java fragment to be dropped into the class or enum generated
     */
    BODY ("body"),
    /**
     * Class to be instantiated in place of the generated one by Builder, clone, and fromFudgeMsg. It will need to be a subclass of the generated one.
     */ 
    DELEGATE ("delegate"),
    /**
     * Global {@link FudgeContext} to be used in {@code fromFudgeMsg} methods.
     */
    FUDGECONTEXT ("fudgeContext"),
    /**
     * Comma separated list of interfaces to be put on any class definitions.
     */
    IMPLEMENTS ("implements"),
    /**
     * Comma separated list of packages to be imported at the head of the file (for use in implements, delegate, or body)
     */
    IMPORTS ("imports"),
    /**
     * Comma separated list of methods (or no- prefixed) to override the global code generator config. E.g. equals, hashCode, toString, no-equals, no-hashCode, no-toString.
     */
    METHODS ("methods");
    private final String _key;
    private ProtoBinding (final String key) {
      _key = key;
    }
    /* package */ String get (final Definition definition) {
      final Binding.Data data = definition.getLanguageBinding (LANG_ID).getData (_key);
      return (data != null) ? data.getValue () : null;
    }
  }
  
  private String _globalFudgeContext = null;
  
  public JavaCodeGenerator () {
    super (JavaClassCode.INSTANCE);
  }
  
  protected void setGlobalFudgeContext (final String path) {
    _globalFudgeContext = path;
  }
  
  protected String getGlobalFudgeContext () {
    return _globalFudgeContext;
  }
  
  @Override
  public void writeClassImplementationConstructor (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    super.writeClassImplementationConstructor (context, message, writer);
    // The hack below is something I'm not too keen on
    if (message.referencesExternal ()) {
      String globalFudgeContext = ProtoBinding.FUDGECONTEXT.get (message);
      if (globalFudgeContext == null) {
        globalFudgeContext = getGlobalFudgeContext ();
      }
      if (globalFudgeContext != null) {
        writer.write ("public static " + message.getName () + " fromFudgeMsg (final org.fudgemsg.FudgeFieldContainer fudgeMsg)");
        beginBlock (writer);
        writer.write ("return fromFudgeMsg (new org.fudgemsg.mapping.FudgeDeserializationContext (" + globalFudgeContext + "), fudgeMsg)");
        endStmt (writer);
        endBlock (writer);
      }
    }
  }
  
  private List<String> methodList (final Definition definition) {
    String m = ProtoBinding.METHODS.get (definition);
    if (m == null) return null;
    final String[] ms = m.split (",\\s*");
    return Arrays.asList (ms);
  }
  
  @Override
  protected boolean flagGenerateEquality (final Definition definition) {
    final List<String> methods = methodList (definition);
    if (methods != null) {
      if (methods.contains ("equals")) return true;
      if (methods.contains ("no-equals")) return false;
    }
    return super.flagGenerateEquality (definition);
  }
  
  @Override
  protected boolean flagGenerateHash (final Definition definition) {
    final List<String> methods = methodList (definition);
    if (methods != null) {
      if (methods.contains ("hashCode")) return true;
      if (methods.contains ("no-hashCode")) return false;
    }
    return super.flagGenerateHash (definition);
  }
  
  @Override
  protected boolean flagGenerateString (final Definition definition) {
    final List<String> methods = methodList (definition);
    if (methods != null) {
      if (methods.contains ("toString")) return true;
      if (methods.contains ("no-toString")) return false;
    }
    return super.flagGenerateString (definition);
  }
  
  @Override
  public void setOption (String option) {
    if (option.equals ("equals")) option = "equality";
    if (option.equals ("hashCode")) option = "hash";
    if (option.equals ("toString")) option = "string";
    super.setOption (option);
  }
  
  @Override
  public void setOption (String option, String value) {
    if (option.equals ("fudgeContext")) {
      setGlobalFudgeContext (value);
      return;
    }
    super.setOption (option, value);
  }
   
}