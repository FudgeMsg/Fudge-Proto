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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.util.Set;

import org.fudgemsg.proto.Compiler.Context;
import org.junit.Test;

/**
 * Tests the CodeGeneratorFactory class
 * 
 * @author Andrew
 */
public class CodeGeneratorFactoryTest {
  
  public static class NoddyCodeGenerator implements CodeGenerator {
    
    static final String LANG_ID = "Noddy";
    
    public NoddyCodeGenerator () {
    }
    
    @Override
    public void generateCode (Context context, EnumDefinition enumDefinition, File targetPath) {
    }

    @Override
    public void generateCode (Context context, MessageDefinition message, File targetPath) {
    }
    
    @Override
    public void generateCode (Context context, TaxonomyDefinition taxonomy, File targetPath) {
    }
    
    @Override
    public void generationComplete (Context context, File targetPath) {
    }
    
  }
  
  @Test
  public void registerCodeGenerator () {
    final CodeGeneratorFactory factory = new CodeGeneratorFactory ();
    factory.registerCodeGenerator (NoddyCodeGenerator.LANG_ID, NoddyCodeGenerator.class);
    assertNotNull (factory.createCodeGenerator (NoddyCodeGenerator.LANG_ID));
  }
  
  @Test
  public void createAllCodeGenerators () {
    final CodeGeneratorFactory factory = new CodeGeneratorFactory ();
    final Set<String> languages = factory.getLanguages ();
    assertNotNull (languages);
    for (String language : languages) {
      assertNotNull (factory.createCodeGenerator (language));
    }
  }
  
  @Test
  public void createDefaultCodeGenerator () {
    assertNotNull (CodeGeneratorFactory.createDefaultCodeGenerator ());
  }
  
}