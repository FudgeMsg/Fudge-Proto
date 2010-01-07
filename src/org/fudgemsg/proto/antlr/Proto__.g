lexer grammar Proto;

@members {
  private Compiler.Context _context;
  private Source _source;
  private CodePosition _currentErrorPosition;
  public ProtoLexer (final Compiler.Context context, final Source source, CharStream input) {
    this (input);
    _context = context;
    _source = source;
  } 
  @Override
  public void emitErrorMessage (final String msg) {
    _context.error (_currentErrorPosition, msg);
  }
  @Override
  public String getErrorHeader (final RecognitionException e) {
    _currentErrorPosition = new CodePosition (_source, e.line, e.charPositionInLine);
    return "";
  }
}
@header {
  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;
}

BINDING : 'binding' ;
DEFAULT : 'default' ;
ENUM : 'enum' ;
IMPORT : 'import' ;
MESSAGE : 'message' ;
MUTABLE : 'mutable' ;
NAMESPACE : 'namespace' ;
REPEATED : 'repeated' ;
REQUIRED : 'required' ;
T_BOOL : 'bool' ;
T_BYTE : 'byte' ;
T_DOUBLE : 'double' ;
T_FLOAT : 'float' ;
T_INDICATOR : 'indicator' ;
T_INT : 'int' ;
T_LONG : 'long' ;
T_SHORT : 'short' ;
T_STRING : 'string' ;
TAXONOMY : 'taxonomy' ;
USES : 'uses' ;
T__39 : '{' ;
T__40 : '}' ;
T__41 : ';' ;
T__42 : '=' ;
T__43 : '[' ;
T__44 : ']' ;
T__45 : ',' ;
T__46 : 'optional' ;
T__47 : 'boolean' ;
T__48 : 'int8' ;
T__49 : 'int16' ;
T__50 : 'int32' ;
T__51 : 'uint32' ;
T__52 : 'sint32' ;
T__53 : 'fixed32' ;
T__54 : 'sfixed32' ;
T__55 : 'integer' ;
T__56 : 'int64' ;
T__57 : 'uint64' ;
T__58 : 'sint64' ;
T__59 : 'fixed64' ;
T__60 : 'sfixed64' ;
T__61 : 'float32' ;
T__62 : 'float64' ;
T__63 : '.' ;

// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 104
COMMENT : '//' ( options { greedy = false; } : . )* ('\n'|'\r') { skip (); } ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 105
DOC_COMMENT : '/**' (' '|'\t'|'\r'|'\n') ( options { greedy = false; } : . )* '*/' ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 106
IDENTIFIER : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 107
INTEGER : ('+'|'-')? '0'..'9'+ ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 108
FLOAT : ('+'|'-')? ('0'..'9')* '.' ('0'..'9')+ ( ('e'|'E') ('+'|'-')? ('0'..'9')+ )? ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 109
ML_COMMENT : '/*' ( options { greedy = false; } : . )* '*/' { skip (); } ;
// Note: the lex rule below is NOT correct
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 111
ML_STRING : '<<<' ('a'..'z'|'A'..'Z')+ ('\r'|'\n') ( options { greedy = false; } : . )* ('\r'|'\n') ('a'..'z'|'A'..'Z')+ ';' ('\r'|'\n') ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 112
STRING : '"' ( options { greedy = false; } : ('\\'.|.) )* '"' ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 113
WHITESPACE : (' '|'\t'|'\r'|'\n')+ { skip (); } ;

