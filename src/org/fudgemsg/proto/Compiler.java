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

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Collections;
import java.util.Comparator;

/**
 * Main compiler functionality. An instance of this should be used to convert
 * the {@code .proto} files into a particular language binding.
 * 
 * The compiler runs through six main phases:
 *    Parsing         - working on the supplied source files
 *    Expansion       - working on the AST
 *    Fixup           - working on the AST
 *    Semantic build  - working on the AST
 *    Semantic check  - working on the semantic representation
 *    Code generation - working on the code generation
 *    
 * Each phase type has an interface definition so that the functionality for a phase does not clutter this class
 * and can be easily substituted at a later date. It also allows for the code generation to be selected at
 * runtime so that a particular language binding can be used for the compiler output.
 * 
 * @author Andrew
 */
public class Compiler {
  
  /**
   * Callback interface for handling compiler warnings.
   * 
   * @author Andrew
   */
  public static interface WarningListener {
    public void compilerWarning (CodePosition position, String message);
  }
  
  /**
   * Callback interface for handling compiler errors.
   * 
   * @author Andrew
   */
  public static interface ErrorListener {
    public void compilerError (CodePosition position, String message);
  }
  
  /**
   * Exposes enough of the Compiler API as is required for a phase to operate. This minimises visibility
   * of members to users of the Compiler, without restricting the operation of phases that aren't within
   * this package such as custom code generators.
   * 
   * @author Andrew
   */
  public class Context {
    
    public void warning (final String message) {
      Compiler.this.warning (null, message);
    }
    
    public void warning (final CodePosition position, final String message) {
      Compiler.this.warning (position, message);
    }
    
    public void error (final String message) {
      Compiler.this.error (null, message);
    }
    
    public void error (final CodePosition position, final String message) {
      Compiler.this.error (position, message);
    }
    
    public void addSource (final Source source) {
      Compiler.this.addSource (source);
    }
    
    public void addParsedRoot (final AST node) {
      Compiler.this.addParsedRoot (node);
    }
    
    public void addExpandedRoot (final AST node) {
      Compiler.this.addExpandedRoot (node);
    }
    
    public void addFixedRoot (final AST node) {
      Compiler.this.addFixedRoot (node);
    }
    
    public void addDefinition (final Definition definition) {
      Compiler.this.addDefinition (definition);
    }
    
    public Definition getDefinition (final String identifier) {
      return Compiler.this.getDefinition (identifier);
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getUserState (final String key) {
      return (T)Compiler.this.getUserState (key);
    }
    
    public <T> void setUserState (final String key, final T state) {
      Compiler.this.setUserState (key, state);
    }
    
  }
  
  private final Context _context = new Context ();
  
  private final Parser _parser = AntlrParser.INSTANCE;
  
  private final ASTWalker _fixupPhase = FixupExternalReferences.INSTANCE;
  
  private final ASTWalker _expansionPhase = ExpandNamespaces.INSTANCE;
  
  private final ASTWalker _semanticBuildPhase = BuildSemanticRepresentation.INSTANCE;
  
  private final DefinitionChecker _definitionCheckPhase = CheckDefinitions.INSTANCE;
  
  private CodeGenerator _codeGenerator = null; 
  
  private WarningListener _warningListener = DefaultCompilerListener.INSTANCE;
  
  private int _warningCount = 0;
  
  private ErrorListener _errorListener = DefaultCompilerListener.INSTANCE;
  
  private int _errorCount = 0;
  
  private Queue<Source> _sources = new LinkedList<Source> ();
  
  private Queue<AST> _parsedRoots = new LinkedList<AST> ();
  
  private Queue<AST> _expandedRoots = new LinkedList<AST> ();
  
  private LinkedList<AST> _fixedRoots = new LinkedList<AST> ();
  
  private Map<String,Definition> _definitions = new HashMap<String,Definition>();
  
  private Map<String,Object> _userState = new HashMap<String,Object>();
  
  private File _targetPath = null;
  
  //private boolean _rethrowExceptions = false; // for production build
  private boolean _rethrowExceptions = true; // for debug build
  
  /**
   * Creates a new compiler object. Note that a compiler is not thread-safe. If you want to do concurrent compilations, use multiple Compiler objects.
   */ 
  public Compiler () {
  }

  /**
   * Sets the listener to handle compiler warnings.
   * 
   * @param warnings the listener, or null to silently ignore (but still count) warnings
   */
  public void setWarningListener (final WarningListener warnings) {
    _warningListener = (warnings != null) ? warnings : DefaultCompilerListener.INSTANCE;
  }
  
  public void setErrorListener (final ErrorListener errors) {
    if (errors == null) throw new IllegalArgumentException ("errorListener cannot be null");
    _errorListener = errors;
  }
  
  public void setCodeGenerator (final CodeGenerator codeGenerator) {
    if (codeGenerator == null) throw new IllegalArgumentException ("codeGenerator cannot be null");
    _codeGenerator = codeGenerator;
  }
  
  public CodeGenerator getCodeGenerator () {
    return _codeGenerator;
  }
  
  public void setTargetPath (final File targetPath) {
    if (targetPath == null) throw new IllegalArgumentException ("targetPath cannot be null");
    _targetPath = targetPath;
  }
  
  private void setCompilerDefaults () {
    if (_warningListener == null) setWarningListener (DefaultCompilerListener.INSTANCE);
    if (_errorListener == null) setErrorListener (DefaultCompilerListener.INSTANCE);
    if (getCodeGenerator () == null) setCodeGenerator (CodeGeneratorFactory.createDefaultCodeGenerator ());
    if (_targetPath == null) setTargetPath (new File ("."));
  }
  
  private void warning (final CodePosition position, final String message) {
    _warningCount++;
    _warningListener.compilerWarning (position, message);
  }
  
  private void error (final CodePosition position, final String message) {
    _errorCount++;
    _errorListener.compilerError (position, message);
  }
  
  public int getWarningCount () {
    return _warningCount;
  }
  
  public int getErrorCount () {
    return _errorCount;
  }
  
  public void setRethrowExceptions (final boolean rethrowExceptions) {
    _rethrowExceptions = rethrowExceptions;
  }
  
  public void reset () {
    _warningCount = 0;
    _errorCount = 0;
    _sources.clear ();
    _parsedRoots.clear ();
    _expandedRoots.clear ();
    _fixedRoots.clear ();
    _definitions.clear ();
    _userState.clear ();
  }
  
  public void addSource (final Source source) {
    if (source == null) throw new IllegalArgumentException ("source cannot be null");
    if (!_sources.contains (source)) _sources.add (source);
  }
  
  private void addParsedRoot (final AST node) {
    if (node == null) throw new IllegalArgumentException ("node cannot be null");
    _parsedRoots.add (node);
  }
  
  private void addExpandedRoot (final AST node) {
    if (node == null) throw new IllegalArgumentException ("node cannot be null");
    _expandedRoots.add (node);
  }
  
  private void addFixedRoot (final AST node) {
    if (node == null) throw new IllegalArgumentException ("node cannot be null");
    _fixedRoots.add (node);
  }
  
  private void addDefinition (final Definition definition) {
    if (definition == null) throw new IllegalArgumentException ("definition cannot be null");
    final Definition prev = _definitions.get (definition.getIdentifier ());
    do {
      if (prev != null) {
        if ((prev instanceof MessageDefinition) && (definition instanceof MessageDefinition)) {
          final MessageDefinition mdOld = (MessageDefinition)prev;
          final MessageDefinition mdNew = (MessageDefinition)definition;
          if (mdOld.isExternal ()) {
            if (mdNew.isExternal ()) {
              // duplicate external declaration; ignore
              return;
            } else {
              // now have a non-external definition - replace the previous one
              break;
            }
          } else {
            if (mdNew.isExternal ()) {
              // already have a non-external declaration; ignore
              return;
            } else {
              // error condition - drop through to alerts below
            }
          }
        }
        error (definition.getCodePosition (), "duplicate definition of identifier '" + definition.getIdentifier () + "'");
        warning (prev.getCodePosition (), "this was the previously encountered definition of '" + prev.getIdentifier () + "'");
      }
    } while (false);
    _definitions.put (definition.getIdentifier (), definition);
  }
  
  private Definition getDefinition (final String identifier) {
    return _definitions.get (identifier);
  }
  
  private Object getUserState (final String key) {
    return _userState.get (key);
  }
  
  private <T> void setUserState (final String key, final T state) {
    _userState.put (key, state);
  }
  
  private boolean runASTPhase (final Queue<AST> inputs, final ASTWalker walker, final String phaseName) {
    if (inputs.isEmpty ()) return false;
    AST node;
    while ((node = inputs.poll ()) != null) {
      try {
        walker.walkAstNode (_context, node);
      } catch (CompilationException e) {
        throw e; // default error handler
      } catch (RuntimeException e) {
        final String errMsg = "uncaught exception from " + phaseName;
        error (node.getCodePosition (), errMsg);
        if (_rethrowExceptions) throw new CompilationException (errMsg, e);
      }
    }
    return true;
  }
 
 /**
   * Runs all compilation phases on the set of sources. Any phase may request data be fed into an ealier phase - e.g. referencing
   * additional source files. This causes a repeat of earlier phases for the new data
   */
  public boolean compileAll () {
    setCompilerDefaults ();
    while (getErrorCount () == 0) {
      // Parsing from _sources to _parsedRoots
      if (!_sources.isEmpty ()) {
        Source src;
        while ((src = _sources.poll ()) != null) {
          try {
            _parser.parseSource (_context, src);
          } catch (CompilationException e) {
            throw e; // default error handler
          } catch (RuntimeException e) {
            error (new CodePosition (src), "uncaught exception from parser");
            if (_rethrowExceptions) throw new CompilationException ("uncaught exception from parser", e);
          }
        }
        continue;
      }
      // AST phases
      if (runASTPhase (_parsedRoots, _expansionPhase, "second phase of compilation")) continue;
      if (runASTPhase (_expandedRoots, _fixupPhase, "third phase of compilation")) continue;
      // Sort the roots so that we process enums, then messages, then taxonomies (the symbols are in that order in the grammar)
      Collections.sort (_fixedRoots, new Comparator<AST> () {
        @Override
        public int compare (final AST a, final AST b) {
          return a.getNodeLabel () - b.getNodeLabel ();
        }
      });
      if (runASTPhase (_fixedRoots, _semanticBuildPhase, "fourth phase of compilation")) continue;
      // Phase 5 - apply semantic checks to the model for consistency before build
      for (Definition definition : _definitions.values ()) {
        try {
          _definitionCheckPhase.checkDefinition (_context, definition);
        } catch (CompilationException e) {
          throw e; // default error handler
        } catch (RuntimeException e) {
          error (definition.getCodePosition (), "uncaught exception from code checker");
        }
      }
      // Phase 6 - generate output code from the model
      for (Definition definition : _definitions.values ()) {
        if (definition.isCompilationTarget ()) {
          try {
            if (definition instanceof EnumDefinition) {
              getCodeGenerator ().generateCode (_context, (EnumDefinition)definition, _targetPath);
            } else if (definition instanceof MessageDefinition) {
              getCodeGenerator ().generateCode (_context, (MessageDefinition)definition, _targetPath);
            } else if (definition instanceof TaxonomyDefinition) {
              getCodeGenerator ().generateCode (_context, (TaxonomyDefinition)definition, _targetPath);
            }
          } catch (CompilationException e) {
            throw e; // default error handler
          } catch (RuntimeException e) {
            error (definition.getCodePosition (), "uncaught exception from code generator");
            if (_rethrowExceptions) throw new CompilationException ("uncaught exception from code generator", e);
          }
        }
      }
      // Phase 7 - optional cleanup for the code generator (e.g. closing stuff)
      getCodeGenerator ().generationComplete (_context, _targetPath);
      return true;
    }
    return false;
  }
  
}