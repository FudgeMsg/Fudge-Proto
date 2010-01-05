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

grammar Proto;

options {
  output = AST;
  ASTLabelType = ProtoTree;
}

tokens {
	ARRAY;
	DEFAULT			= 'default';
	DIM_FIXED;
	DIM_VARIANT;
	ENUM			= 'enum';
	FIELD;
	IMPORT			= 'import';
	MESSAGE			= 'message';
	NAMESPACE		= 'namespace';
	OPTIONAL		= 'optional';
	ORDINAL;
	REPEATED		= 'repeated';
	REQUIRED		= 'required';
	ROOT;
	T_BOOL			= 'bool';
	T_BYTE			= 'byte';
	T_DOUBLE		= 'double';
	T_FLOAT			= 'float';
	T_INDICATOR		= 'indicator';
	T_INT			= 'int';
	T_LONG			= 'long';
	T_SHORT			= 'short';
	T_STRING		= 'string';
	TAXONOMY		= 'taxonomy';
	USES			= 'uses';
}

@header {
  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;
}
@lexer::header {
  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;
}
@members {
  private Compiler.Context _context;
  private Source _source;
  private CodePosition _currentErrorPosition;
  public ProtoParser (final Compiler.Context context, final Source source, TokenStream input) {
    this (input);
    _context = context;
    _source = source;
    setTreeAdaptor (new ProtoTreeAdaptor (_source));
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
@lexer::members {
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

COMMENT : '//' ( options { greedy = false; } : . )* ('\n'|'\r') { skip (); } ;
DOC_COMMENT : '/**' (' '|'\t'|'\r'|'\n') ( options { greedy = false; } : . )* '*/' ;
IDENTIFIER : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER : ('+'|'-')? '0'..'9'+ ;
FLOAT : ('+'|'-')? ('0'..'9')* '.' ('0'..'9')+ ( ('e'|'E') ('+'|'-')? ('0'..'9')+ )? ;
ML_COMMENT : '/*' ( options { greedy = false; } : . )* '*/' { skip (); } ;
STRING : '"' ( options { greedy = false; } : ('\\'.|.) )* '"' ;
WHITESPACE : (' '|'\t'|'\r'|'\n')+ { skip (); } ;

constraint_default : DEFAULT^ '='! literal ;

dimension
	: '[' INTEGER ']' -> ^(DIM_FIXED INTEGER)
	| '[' ']' -> ^(DIM_VARIANT)
	;

enum_element : IDENTIFIER^ enum_value? ';'! ;

enum_value : '='! INTEGER ;

field_constraint : constraint_default ;

field_constraints : '['! field_constraint (','! field_constraint)* ']'! ;

field_ordinal : '=' INTEGER -> ^(ORDINAL INTEGER); 

field_modifier
	: OPTIONAL
	| REQUIRED
	| REPEATED
	;

field_arraytype : field_basetype dimension+ -> ^(ARRAY field_basetype dimension+) ;

field_primtype
	: T_BOOL
	| 'boolean' -> ^(T_BOOL)
	| T_BYTE
	| 'int8' -> ^(T_BYTE)
	| T_SHORT
	| 'int16' -> ^(T_SHORT)
	| T_INT
	| 'int32' -> ^(T_INT)
	| 'uint32' -> ^(T_INT)
	| 'sint32' -> ^(T_INT)
	| 'fixed32' -> ^(T_INT)
	| 'sfixed32' -> ^(T_INT)
	| 'integer' -> ^(T_INT)
	| T_LONG
	| 'int64' -> ^(T_LONG)
	| 'uint64' -> ^(T_LONG)
	| 'sint64' -> ^(T_LONG)
	| 'fixed64' -> ^(T_LONG)
	| 'sfixed64' -> ^(T_LONG)
	| T_FLOAT
	| 'float32' -> ^(T_FLOAT)
	| T_DOUBLE
	| 'float64' -> ^(T_DOUBLE)
	| T_INDICATOR
	| T_STRING
	;

field_basetype
	: field_primtype
	| fullidentifier
	;

field_type
	: field_basetype
	| field_arraytype
	;

fullidentifier : IDENTIFIER^ ('.'! IDENTIFIER)* ;

literal
	: IDENTIFIER
	| INTEGER
	| FLOAT
	| STRING
	;

message : MESSAGE^ IDENTIFIER message_uses? '{'! message_element* '}'! ;

message_element
	: message_enum
	| message_field
	| message_submsg
	;

message_enum : ENUM^ IDENTIFIER '{'! enum_element* '}'! ;

message_field : field_modifier* field_type IDENTIFIER field_ordinal? field_constraints? ';' -> ^(FIELD field_type IDENTIFIER field_modifier* field_ordinal? field_constraints?) ;

message_submsg : MESSAGE^ IDENTIFIER '{'! message_element* '}'! ;

message_uses : USES^ fullidentifier (','! fullidentifier)* ;

namespace : NAMESPACE^ fullidentifier '{'! root_object* '}'! ;

root : root_object* -> ^(ROOT root_object*);

root_object
	: message
	| message_enum
	| namespace
	| taxonomy
	;

taxonomy : TAXONOMY^ IDENTIFIER '{'! taxonomy_element* '}'! ;

taxonomy_element
	: enum_element
	| IMPORT^ fullidentifier ';'!
	;