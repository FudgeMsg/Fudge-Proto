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

package org.fudgemsg.proto;

import java.io.File;

/**
 * Adapter for wrapping delegating work to another CodeGenerator implementation.
 * 
 * @author Andrew
 */
public class CodeGeneratorAdapter implements CodeGenerator {
  
  private final CodeGenerator _codeGenerator;
  
  protected CodeGeneratorAdapter (final CodeGenerator codeGenerator) {
    _codeGenerator = codeGenerator;
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final EnumDefinition enumDefinition, final File targetPath) {
    _codeGenerator.generateCode (context, enumDefinition, targetPath);
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final MessageDefinition message, final File targetPath) {
    _codeGenerator.generateCode (context, message, targetPath);
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final TaxonomyDefinition taxonomy, final File targetPath) {
    _codeGenerator.generateCode (context, taxonomy, targetPath);
  }
  
  @Override
  public void generationComplete (final Compiler.Context context, final File targetPath) {
    _codeGenerator.generationComplete (context, targetPath);
  }
  
  @Override
  public void setOption (final String option) {
    _codeGenerator.setOption (option);
  }
  
  @Override
  public void setOption (final String option, final String value) {
    _codeGenerator.setOption (option, value);
  }
  
}
