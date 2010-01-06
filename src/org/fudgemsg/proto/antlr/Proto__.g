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
T__37 : '=' ;
T__38 : '[' ;
T__39 : ']' ;
T__40 : ';' ;
T__41 : ',' ;
T__42 : 'optional' ;
T__43 : 'boolean' ;
T__44 : 'int8' ;
T__45 : 'int16' ;
T__46 : 'int32' ;
T__47 : 'uint32' ;
T__48 : 'sint32' ;
T__49 : 'fixed32' ;
T__50 : 'sfixed32' ;
T__51 : 'integer' ;
T__52 : 'int64' ;
T__53 : 'uint64' ;
T__54 : 'sint64' ;
T__55 : 'fixed64' ;
T__56 : 'sfixed64' ;
T__57 : 'float32' ;
T__58 : 'float64' ;
T__59 : '.' ;
T__60 : '{' ;
T__61 : '}' ;

// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 103
COMMENT : '//' ( options { greedy = false; } : . )* ('\n'|'\r') { skip (); } ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 104
DOC_COMMENT : '/**' (' '|'\t'|'\r'|'\n') ( options { greedy = false; } : . )* '*/' ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 105
IDENTIFIER : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 106
INTEGER : ('+'|'-')? '0'..'9'+ ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 107
FLOAT : ('+'|'-')? ('0'..'9')* '.' ('0'..'9')+ ( ('e'|'E') ('+'|'-')? ('0'..'9')+ )? ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 108
ML_COMMENT : '/*' ( options { greedy = false; } : . )* '*/' { skip (); } ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 109
STRING : '"' ( options { greedy = false; } : ('\\'.|.) )* '"' ;
// $ANTLR src "org/fudgemsg/proto/antlr/Proto.g" 110
WHITESPACE : (' '|'\t'|'\r'|'\n')+ { skip (); } ;

