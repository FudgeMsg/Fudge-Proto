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
 * Abstract interface for the code generation phase of compilation. Refer to the Compiler class for a description of the available phases.
 * 
 * @author Andrew
 */
public interface CodeGenerator {
  
  public void generateCode (final Compiler.Context context, final EnumDefinition enumDefinition, final File targetPath);

  public void generateCode (final Compiler.Context context, final MessageDefinition message, final File targetPath);
  
  public void generateCode (final Compiler.Context context, final TaxonomyDefinition taxonomy, final File targetPath);
  
  public void generateCode(final Compiler.Context context, final TypeDefinition typedef, final File targetPath);

  public void generationComplete (final Compiler.Context context, final File targetPath);
  
  public void setOption (final String optionKey) throws IllegalArgumentException;
  
  public void setOption (final String optionKey, final String optionValue) throws IllegalArgumentException;
  
}
