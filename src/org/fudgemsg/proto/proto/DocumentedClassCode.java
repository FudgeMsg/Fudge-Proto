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

package org.fudgemsg.proto.proto;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;

/**
 * Writes out brief documentation before various nodes. Subclassing this could be used to build a Javadoc / XMLdoc or
 * other documentation system relevant to a language.  
 * 
 * @author Andrew
 */
public class DocumentedClassCode extends ClassCodeAdapter {
  
  public DocumentedClassCode (final ClassCode delegate) {
    super (delegate);
  }
  
  @Override
  public void writeHeaderFileHeader (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    comment (writer, "automatically created - " + new Date ());
  }
  
  @Override
  public void writeHeaderFileFooter (final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    // default no-op
  }
  
  @Override
  public void writeImplementationFileHeader(final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    comment (writer, "automatically created - " + new Date ());
  }

  @Override
  public void writeImplementationFileFooter(final Compiler.Context context, final File targetFile, final IndentWriter writer) throws IOException {
    // default no-op
  }
  
  @Override
  public void beginClassImplementationDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "created from " + message.getCodePosition ());
  }
  
  @Override
  public void writeTaxonomyImplementationDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter writer) throws IOException {
    comment (writer, "created from " + taxonomy.getCodePosition ());
  }
  
  @Override
  public void beginClassHeaderDeclaration(final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    comment (writer, "created from " + message.getCodePosition ());
  }
  
  @Override
  public void writeTaxonomyHeaderDeclaration (final Compiler.Context context, final TaxonomyDefinition taxonomy, final IndentWriter writer) throws IOException {
    comment (writer, "created from " + taxonomy.getCodePosition ());
  }
  
}