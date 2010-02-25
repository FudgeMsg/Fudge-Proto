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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.fudgemsg.proto.CodeGenerator;
import org.fudgemsg.proto.Compiler;
import org.fudgemsg.proto.Definition;
import org.fudgemsg.proto.EnumDefinition;
import org.fudgemsg.proto.FieldDefinition;
import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.TaxonomyDefinition;

/**
 * Implementation of a code generator for languages that have class, struct or message constructs. The main work
 * is delegated to a ClassCode instance. Note that a tightly coupled subclass has slightly modified behaviours
 * for languages that can support "inner" or "nested" constructs.
 * 
 * @author Andrew
 */
public class ClassCodeGenerator extends ClassCodeAdapter implements CodeGenerator {
  
  private static final String _headerFilesOpen = ClassCodeGenerator.class.getName () + ":headerFilesOpen"; // Set<File>
  
  private static final String _implementationFilesOpen = ClassCodeGenerator.class.getName () + ":implementationFilesOpen"; // Set<File>
  
  private boolean _generateEquality = false;
  private boolean _generateHash = false;
  private boolean _generateString = false;
  private boolean _writeGitIgnore = false;
  
  protected ClassCodeGenerator (final ClassCode delegate) {
    super (delegate);
  }
  
  private Set<File> getHeaderFilesOpen (final Compiler.Context context) {
    Set<File> state = context.getUserState (_headerFilesOpen);
    if (state == null) {
      context.setUserState (_headerFilesOpen, state = new HashSet<File> ());
    }
    return state;
  }
  
  private Set<File> getImplementationFilesOpen (final Compiler.Context context) {
    Set<File> state = context.getUserState (_implementationFilesOpen);
    if (state == null) {
      context.setUserState (_implementationFilesOpen, state = new HashSet<File> ());
    }
    return state;
  }
  
  private void writeClassHeaderAttributes (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writeClassHeaderAttribute (context, field, writer);
    }
  }
  
  private void writeClassHeaderAccessors (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writeClassHeaderAccessor (context, field, writer);
    }
  }
  
  protected void writeEnumHeaderDeclarations (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (EnumDefinition enumdef : message.getEnumDefinitions ()) {
      writeEnumHeaderDeclaration (context, enumdef, writer);
    }
  }
  
  private void writeClassImplementationAttributes (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writeClassImplementationAttribute (context, field, writer);
    }
  }
  
  private void writeClassImplementationAccessors (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (FieldDefinition field : message.getFieldDefinitions ()) {
      writeClassImplementationAccessor (context, field, writer);
    }
  }
  
  protected void writeEnumImplementationDeclarations (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    for (EnumDefinition enumdef : message.getEnumDefinitions ()) {
      writeEnumImplementationDeclaration (context, enumdef, writer);
    }
  }
  
  private IndentWriter createFile (final Compiler.Context context, final File file) throws IOException {
    IndentWriter iw = createIndentWriter (new BufferedWriter (new FileWriter (file, false)));
    if (context.getVerbosity () >= 2) context.verboseMessage ("Writing " + file);
    return iw;
  }
  
  private IndentWriter appendFile (final File file) throws IOException {
    return createIndentWriter (new BufferedWriter (new FileWriter (file, true)));
  }
  
  private IndentWriter openHeaderFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    final File header = getHeaderFile (context, definition, targetPath);
    // Abort if implementation doesn't want a header file to be written
    if (header == null) return null;
    final Set<File> filesOpen = getHeaderFilesOpen (context);
    if (filesOpen.contains (header)) {
      // Open the file in "append" mode
      return appendFile (header);
    } else {
      // Create the file and write out the header
      final IndentWriter writer = createFile (context, header);
      filesOpen.add (header);
      writeHeaderFileHeader (context, header, writer);
      return writer;
    }
  }
  
  private IndentWriter openImplementationFile (final Compiler.Context context, final Definition definition, final File targetPath) throws IOException {
    final File implementation = getImplementationFile (context, definition, targetPath);
    // Abort if implementation doesn't want an implementation file to be written
    if (implementation == null) return null;
    final Set<File> filesOpen = getImplementationFilesOpen (context);
    if (filesOpen.contains (implementation)) {
      // Open the file in "append" mode
      return appendFile (implementation);
    } else {
      // Create the file and write out the header
      final IndentWriter writer = createFile (context, implementation);
      filesOpen.add (implementation);
      writeImplementationFileHeader (context, implementation, writer);
      return writer;
    }
  }
  
  private int writeImplementationFileFooters (final Compiler.Context context) throws IOException {
    int count = 0;
    for (File file : getImplementationFilesOpen (context)) {
      final IndentWriter writer = appendFile (file);
      try {
        writeImplementationFileFooter (context, file, writer);
        count++;
      } finally {
        writer.close ();
      }
    }
    return count;
  }
  
  private int writeHeaderFileFooters (final Compiler.Context context) throws IOException {
    int count = 0;
    for (File file : getHeaderFilesOpen (context)) {
      final IndentWriter writer = appendFile (file);
      try {
        writeHeaderFileFooter (context, file, writer);
        count++;
      } finally {
        writer.close ();
      }
    }
    return count;
  }
  
  private void addToGitIgnore (final File file, final Map<File,Set<String>> folders) {
    Set<String> files = folders.get (file.getParentFile ());
    if (files == null) {
      folders.put (file.getParentFile (), files = new HashSet<String> ()); 
    }
    files.add (file.getName ());
  }
  
  private int writeGitIgnore (final Compiler.Context context) throws IOException {
    int count = 0;
    final Map<File,Set<String>> folders = new HashMap<File,Set<String>> ();
    for (File file : getImplementationFilesOpen (context)) {
      addToGitIgnore (file, folders);
    }
    for (File file : getHeaderFilesOpen (context)) {
      addToGitIgnore (file, folders);
    }
    for (Map.Entry<File,Set<String>> entry : folders.entrySet ()) {
      final File gitIgnore = new File (entry.getKey (), ".gitignore");
      if (gitIgnore.exists ()) {
        context.warning (null, ".gitignore already exists in " + entry.getKey ());
      } else {
        if (context.getVerbosity () >= 2) context.verboseMessage ("Writing " + gitIgnore);
        final BufferedWriter out = new BufferedWriter (new FileWriter (gitIgnore));
        try {
          for (String filename : entry.getValue ()) {
            out.write (filename);
            out.write ("\n");
          }
          count++;
        } finally {
          out.close ();
        }
      }
    }
    return count;
  }
  
  protected boolean flagGenerateEquality (final Definition message) {
    return _generateEquality;
  }
  
  protected boolean flagGenerateHash (final Definition message) {
    return _generateHash;
  }
  
  protected boolean flagGenerateString (final Definition message) {
    return _generateString;
  }
  
  protected void writeClassHeader (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    writeEnumHeaderDeclarations (context, message, writer);
    beginClassHeaderDeclaration (context, message, writer);
    writeClassHeaderAttributes (context, message, writer);
    writeClassHeaderConstructor (context, message, writer);
    writeClassHeaderAccessors (context, message, writer);
    if (flagGenerateEquality (message)) writeClassHeaderEquality (context, message, writer);
    if (flagGenerateHash (message)) writeClassHeaderHash (context, message, writer);
    if (flagGenerateString (message)) writeClassHeaderString (context, message, writer);
    endClassHeaderDeclaration (context, message, writer);
  }
  
  protected void writeClassImplementation (final Compiler.Context context, final MessageDefinition message, final IndentWriter writer) throws IOException {
    writeEnumImplementationDeclarations (context, message, writer);
    beginClassImplementationDeclaration (context, message, writer);
    writeClassImplementationAttributes (context, message, writer);
    writeClassImplementationConstructor (context, message, writer);
    writeClassImplementationAccessors (context, message, writer);
    if (flagGenerateEquality (message)) writeClassImplementationEquality (context, message, writer);
    if (flagGenerateHash (message)) writeClassImplementationHash (context, message, writer);
    if (flagGenerateString (message)) writeClassImplementationString (context, message, writer);
    endClassImplementationDeclaration (context, message, writer);
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final EnumDefinition enumDefinition, final File targetPath) {
    // Header output if required
    try {
      final IndentWriter writer = openHeaderFile (context, enumDefinition, targetPath);
      if (writer != null) {
        try {
          writeEnumHeaderDeclaration (context, enumDefinition, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (enumDefinition.getCodePosition (), e.getMessage ());
    }
    // Implementation output if required
    try {
      final IndentWriter writer = openImplementationFile (context, enumDefinition, targetPath);
      if (writer != null) {
        try {
          writeEnumImplementationDeclaration (context, enumDefinition, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (enumDefinition.getCodePosition (), e.getMessage ());
    }
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final MessageDefinition message, final File targetPath) {
    // Header output if required
    try {
      final IndentWriter writer = openHeaderFile (context, message, targetPath);
      if (writer != null) {
        try {
          writeClassHeader (context, message, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (message.getCodePosition (), e.getMessage ());
    }
    // Implementation output if required
    try {
      final IndentWriter writer = openImplementationFile (context, message, targetPath);
      if (writer != null) {
        try {
          writeClassImplementation (context, message, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (message.getCodePosition (), e.getMessage ());
    }
  }
  
  @Override
  public void generateCode (final Compiler.Context context, final TaxonomyDefinition taxonomy, final File targetPath) {
    // Header output if required
    try {
      final IndentWriter writer = openHeaderFile (context, taxonomy, targetPath);
      if (writer != null) {
        try {
          writeTaxonomyHeaderDeclaration (context, taxonomy, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (taxonomy.getCodePosition (), e.getMessage ());
    }
    // Implementation output if required
    try {
      final IndentWriter writer = openImplementationFile (context, taxonomy, targetPath);
      if (writer != null) {
        try {
          writeTaxonomyImplementationDeclaration (context, taxonomy, writer);
        } finally {
          writer.close ();
        }
      }
    } catch (IOException e) {
      context.error (taxonomy.getCodePosition (), e.getMessage ());
    }
  }
  
  @Override
  public void generationComplete (final Compiler.Context context, final File targetPath) {
    int count = 0;
    try {
      count += writeImplementationFileFooters (context);
      count += writeHeaderFileFooters (context);
      if (_writeGitIgnore) count += writeGitIgnore (context);
      if (context.getVerbosity () >= 1) context.verboseMessage (count + " file(s) written");
    } catch (IOException e) {
      context.error (null, e.getMessage ());
    }
  }
  
  @Override
  public void setOption (final String option) {
    if (option.equals ("equality")) {
      _generateEquality = true;
      return;
    }
    if (option.equals ("gitIgnore")) {
      _writeGitIgnore = true;
      return;
    }
    if (option.equals ("hash")) {
      _generateHash = true;
      return;
    }
    if (option.equals ("string")) {
      _generateString = true;
      return;
    }
    throw new IllegalArgumentException ("unknown option '" + option + "'");
  }
  
  @Override
  public void setOption (final String option, final String value) {
    throw new IllegalArgumentException ("unknown option '" + option + "'");
  }
  
}