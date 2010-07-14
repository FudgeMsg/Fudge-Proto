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

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.fudgemsg.proto.antlr.ProtoLexer;
import org.fudgemsg.proto.antlr.ProtoParser;

/**
 * Implementation of a .proto file parser using ANTLR.
 * 
 * @author Andrew
 */
/* package */ class AntlrParser implements Parser {
  
  /* package */ static final AntlrParser INSTANCE = new AntlrParser ();
  
  private AntlrParser () {
  }
  
  //@SuppressWarnings("unused")
  /* package */ static void debug_print_tree (final AST tree, final String indent) {
    System.out.print (indent);
    if (tree == null) {
      System.out.println ("<null>");
      return;
    }
    System.out.print (tree.getNodeLabel ());
    System.out.print (": ");
    System.out.println (tree.getNodeValue ());
    List<AST> l = tree.getChildNodes ();
    if (l != null) {
      for (AST child : l) {
        debug_print_tree (child, indent + "  "); 
      }
    }
  }
  
  @Override
  public void parseSource (final Compiler.Context context, final Source source) {
    try {
      
      // Setup the ANTLR parser
      final ANTLRReaderStream input = new ANTLRReaderStream (source.openReader ());
      final ProtoLexer lexer = new ProtoLexer (context, source, input);
      final CommonTokenStream tokens = new CommonTokenStream (lexer);
      final ProtoParser parser = new ProtoParser (context, source, tokens);
      
      // Parse the root node
      final AST root = (AST)parser.root ().getTree ();

      //System.out.println (source);
      //debug_print_tree(root, "");

      // Extract all top level entries (root_object) for the next compilation phase
      final List<AST> root_objects = root.getChildNodes ();
      if (root_objects != null) {
        for (AST root_object : root_objects) {
          context.addParsedRoot (root_object);
        }
      } else {
        context.warning (new CodePosition (source), "no definitions were found in this file");
      }
      
    } catch (IOException e) {
      context.error (new CodePosition (source), e.getMessage ());
    } catch (RecognitionException e) {
      context.error (new CodePosition (source, e.line, e.charPositionInLine), e.getMessage ());
    }
  }
  
}