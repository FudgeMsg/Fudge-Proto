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
EXTENDS : 'extends' ;
EXTERN : 'extern' ;
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
T__40 : '{' ;
T__41 : '}' ;
T__42 : ';' ;
T__43 : '=' ;
T__44 : '[' ;
T__45 : ']' ;
T__46 : ',' ;
T__47 : 'optional' ;
T__48 : 'boolean' ;
T__49 : 'int8' ;
T__50 : 'int16' ;
T__51 : 'int32' ;
T__52 : 'uint32' ;
T__53 : 'sint32' ;
T__54 : 'fixed32' ;
T__55 : 'sfixed32' ;
T__56 : 'integer' ;
T__57 : 'int64' ;
T__58 : 'uint64' ;
T__59 : 'sint64' ;
T__60 : 'fixed64' ;
T__61 : 'sfixed64' ;
T__62 : 'float32' ;
T__63 : 'float64' ;
T__64 : '.' ;

// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 106
COMMENT : '//' ( options { greedy = false; } : . )* ('\n'|'\r') { skip (); } ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 107
IDENTIFIER : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 108
INTEGER : ('+'|'-')? '0'..'9'+ ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 109
FLOAT : ('+'|'-')? ('0'..'9')* '.' ('0'..'9')+ ( ('e'|'E') ('+'|'-')? ('0'..'9')+ )? ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 110
ML_COMMENT : '/*' ( options { greedy = false; } : . )* '*/' { skip (); } ;
// Note: the lex rule below is NOT correct
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 112
ML_STRING : '<<<' ('a'..'z'|'A'..'Z')+ ('\r'|'\n') ( options { greedy = false; } : . )* ('\r'|'\n') ('a'..'z'|'A'..'Z')+ ';' ('\r'|'\n') ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 113
STRING : '"' ( options { greedy = false; } : ('\\'.|.) )* '"' ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 114
WHITESPACE : (' '|'\t'|'\r'|'\n')+ { skip (); } ;

