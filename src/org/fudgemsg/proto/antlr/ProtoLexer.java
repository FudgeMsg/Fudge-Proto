// $ANTLR 3.2 Fedora release 12 (Constantine) Thu Mar 11 20:28:57 UTC 2010 org/fudgemsg/proto/antlr/Proto.g 2010-07-14 16:50:31

  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ProtoLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int BINDING=6;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=34;
    public static final int ML_STRING=43;
    public static final int T_BOOL=24;
    public static final int EXTERN=12;
    public static final int T_DOUBLE=26;
    public static final int FLOAT=41;
    public static final int ABSTRACT=4;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T_LONG=32;
    public static final int T__55=55;
    public static final int ML_COMMENT=42;
    public static final int T_INDICATOR=30;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=39;
    public static final int TAXONOMY=36;
    public static final int T__59=59;
    public static final int T_INT=31;
    public static final int MESSAGE=15;
    public static final int COMMENT=38;
    public static final int T__50=50;
    public static final int ARRAY=5;
    public static final int INTEGER=40;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=25;
    public static final int T__48=48;
    public static final int DIM_FIXED=8;
    public static final int T__49=49;
    public static final int ORDINAL=19;
    public static final int DEFAULT=7;
    public static final int REPEATED=21;
    public static final int T_FLOAT=29;
    public static final int WHITESPACE=45;
    public static final int REQUIRED=22;
    public static final int READONLY=20;
    public static final int ROOT=23;
    public static final int T_DATETIME=28;
    public static final int NAMESPACE=17;
    public static final int OPTIONAL=18;
    public static final int DIM_VARIANT=9;
    public static final int ENUM=10;
    public static final int USES=37;
    public static final int T_DATE=27;
    public static final int FIELD=13;
    public static final int T_TIME=35;
    public static final int EXTENDS=11;
    public static final int T_SHORT=33;
    public static final int MUTABLE=16;
    public static final int STRING=44;

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


    // delegates
    // delegators

    public ProtoLexer() {;} 
    public ProtoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ProtoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "org/fudgemsg/proto/antlr/Proto.g"; }

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:29:10: ( 'abstract' )
            // org/fudgemsg/proto/antlr/Proto.g:29:12: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "BINDING"
    public final void mBINDING() throws RecognitionException {
        try {
            int _type = BINDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:30:9: ( 'binding' )
            // org/fudgemsg/proto/antlr/Proto.g:30:11: 'binding'
            {
            match("binding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINDING"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:31:9: ( 'default' )
            // org/fudgemsg/proto/antlr/Proto.g:31:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:32:6: ( 'enum' )
            // org/fudgemsg/proto/antlr/Proto.g:32:8: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:33:9: ( 'extends' )
            // org/fudgemsg/proto/antlr/Proto.g:33:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:34:8: ( 'extern' )
            // org/fudgemsg/proto/antlr/Proto.g:34:10: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:35:8: ( 'import' )
            // org/fudgemsg/proto/antlr/Proto.g:35:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "MESSAGE"
    public final void mMESSAGE() throws RecognitionException {
        try {
            int _type = MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:36:9: ( 'message' )
            // org/fudgemsg/proto/antlr/Proto.g:36:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MESSAGE"

    // $ANTLR start "MUTABLE"
    public final void mMUTABLE() throws RecognitionException {
        try {
            int _type = MUTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:37:9: ( 'mutable' )
            // org/fudgemsg/proto/antlr/Proto.g:37:11: 'mutable'
            {
            match("mutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUTABLE"

    // $ANTLR start "NAMESPACE"
    public final void mNAMESPACE() throws RecognitionException {
        try {
            int _type = NAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:38:11: ( 'namespace' )
            // org/fudgemsg/proto/antlr/Proto.g:38:13: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMESPACE"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:39:10: ( 'optional' )
            // org/fudgemsg/proto/antlr/Proto.g:39:12: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "READONLY"
    public final void mREADONLY() throws RecognitionException {
        try {
            int _type = READONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:40:10: ( 'readonly' )
            // org/fudgemsg/proto/antlr/Proto.g:40:12: 'readonly'
            {
            match("readonly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READONLY"

    // $ANTLR start "REPEATED"
    public final void mREPEATED() throws RecognitionException {
        try {
            int _type = REPEATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:41:10: ( 'repeated' )
            // org/fudgemsg/proto/antlr/Proto.g:41:12: 'repeated'
            {
            match("repeated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEATED"

    // $ANTLR start "REQUIRED"
    public final void mREQUIRED() throws RecognitionException {
        try {
            int _type = REQUIRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:42:10: ( 'required' )
            // org/fudgemsg/proto/antlr/Proto.g:42:12: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQUIRED"

    // $ANTLR start "T_BOOL"
    public final void mT_BOOL() throws RecognitionException {
        try {
            int _type = T_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:43:8: ( 'bool' )
            // org/fudgemsg/proto/antlr/Proto.g:43:10: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_BOOL"

    // $ANTLR start "T_BYTE"
    public final void mT_BYTE() throws RecognitionException {
        try {
            int _type = T_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:44:8: ( 'byte' )
            // org/fudgemsg/proto/antlr/Proto.g:44:10: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_BYTE"

    // $ANTLR start "T_DOUBLE"
    public final void mT_DOUBLE() throws RecognitionException {
        try {
            int _type = T_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:45:10: ( 'double' )
            // org/fudgemsg/proto/antlr/Proto.g:45:12: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_DOUBLE"

    // $ANTLR start "T_DATE"
    public final void mT_DATE() throws RecognitionException {
        try {
            int _type = T_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:46:8: ( 'date' )
            // org/fudgemsg/proto/antlr/Proto.g:46:10: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_DATE"

    // $ANTLR start "T_DATETIME"
    public final void mT_DATETIME() throws RecognitionException {
        try {
            int _type = T_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:47:12: ( 'datetime' )
            // org/fudgemsg/proto/antlr/Proto.g:47:14: 'datetime'
            {
            match("datetime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_DATETIME"

    // $ANTLR start "T_FLOAT"
    public final void mT_FLOAT() throws RecognitionException {
        try {
            int _type = T_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:48:9: ( 'float' )
            // org/fudgemsg/proto/antlr/Proto.g:48:11: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_FLOAT"

    // $ANTLR start "T_INDICATOR"
    public final void mT_INDICATOR() throws RecognitionException {
        try {
            int _type = T_INDICATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:49:13: ( 'indicator' )
            // org/fudgemsg/proto/antlr/Proto.g:49:15: 'indicator'
            {
            match("indicator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INDICATOR"

    // $ANTLR start "T_INT"
    public final void mT_INT() throws RecognitionException {
        try {
            int _type = T_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:50:7: ( 'int' )
            // org/fudgemsg/proto/antlr/Proto.g:50:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_INT"

    // $ANTLR start "T_LONG"
    public final void mT_LONG() throws RecognitionException {
        try {
            int _type = T_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:51:8: ( 'long' )
            // org/fudgemsg/proto/antlr/Proto.g:51:10: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_LONG"

    // $ANTLR start "T_SHORT"
    public final void mT_SHORT() throws RecognitionException {
        try {
            int _type = T_SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:52:9: ( 'short' )
            // org/fudgemsg/proto/antlr/Proto.g:52:11: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_SHORT"

    // $ANTLR start "T_STRING"
    public final void mT_STRING() throws RecognitionException {
        try {
            int _type = T_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:53:10: ( 'string' )
            // org/fudgemsg/proto/antlr/Proto.g:53:12: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_STRING"

    // $ANTLR start "T_TIME"
    public final void mT_TIME() throws RecognitionException {
        try {
            int _type = T_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:54:8: ( 'time' )
            // org/fudgemsg/proto/antlr/Proto.g:54:10: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T_TIME"

    // $ANTLR start "TAXONOMY"
    public final void mTAXONOMY() throws RecognitionException {
        try {
            int _type = TAXONOMY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:55:10: ( 'taxonomy' )
            // org/fudgemsg/proto/antlr/Proto.g:55:12: 'taxonomy'
            {
            match("taxonomy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TAXONOMY"

    // $ANTLR start "USES"
    public final void mUSES() throws RecognitionException {
        try {
            int _type = USES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:56:6: ( 'uses' )
            // org/fudgemsg/proto/antlr/Proto.g:56:8: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USES"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:57:7: ( '{' )
            // org/fudgemsg/proto/antlr/Proto.g:57:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:58:7: ( '}' )
            // org/fudgemsg/proto/antlr/Proto.g:58:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:59:7: ( ';' )
            // org/fudgemsg/proto/antlr/Proto.g:59:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:60:7: ( '=' )
            // org/fudgemsg/proto/antlr/Proto.g:60:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:61:7: ( '[' )
            // org/fudgemsg/proto/antlr/Proto.g:61:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:62:7: ( ']' )
            // org/fudgemsg/proto/antlr/Proto.g:62:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:63:7: ( ',' )
            // org/fudgemsg/proto/antlr/Proto.g:63:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:64:7: ( 'boolean' )
            // org/fudgemsg/proto/antlr/Proto.g:64:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:65:7: ( 'int8' )
            // org/fudgemsg/proto/antlr/Proto.g:65:9: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:66:7: ( 'int16' )
            // org/fudgemsg/proto/antlr/Proto.g:66:9: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:67:7: ( 'int32' )
            // org/fudgemsg/proto/antlr/Proto.g:67:9: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:68:7: ( 'uint32' )
            // org/fudgemsg/proto/antlr/Proto.g:68:9: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:69:7: ( 'sint32' )
            // org/fudgemsg/proto/antlr/Proto.g:69:9: 'sint32'
            {
            match("sint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:70:7: ( 'fixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:70:9: 'fixed32'
            {
            match("fixed32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:71:7: ( 'sfixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:71:9: 'sfixed32'
            {
            match("sfixed32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:72:7: ( 'integer' )
            // org/fudgemsg/proto/antlr/Proto.g:72:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:73:7: ( 'int64' )
            // org/fudgemsg/proto/antlr/Proto.g:73:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:74:7: ( 'uint64' )
            // org/fudgemsg/proto/antlr/Proto.g:74:9: 'uint64'
            {
            match("uint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:75:7: ( 'sint64' )
            // org/fudgemsg/proto/antlr/Proto.g:75:9: 'sint64'
            {
            match("sint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:76:7: ( 'fixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:76:9: 'fixed64'
            {
            match("fixed64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:77:7: ( 'sfixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:77:9: 'sfixed64'
            {
            match("sfixed64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:78:7: ( 'float32' )
            // org/fudgemsg/proto/antlr/Proto.g:78:9: 'float32'
            {
            match("float32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:79:7: ( 'float64' )
            // org/fudgemsg/proto/antlr/Proto.g:79:9: 'float64'
            {
            match("float64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:80:7: ( '.' )
            // org/fudgemsg/proto/antlr/Proto.g:80:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:112:9: ( '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' ) )
            // org/fudgemsg/proto/antlr/Proto.g:112:11: '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // org/fudgemsg/proto/antlr/Proto.g:112:16: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n'||LA1_0=='\r') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:112:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip (); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:113:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/fudgemsg/proto/antlr/Proto.g:113:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:113:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:114:9: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:114:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:114:11: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:114:22: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:114:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:115:7: ( ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )? )
            // org/fudgemsg/proto/antlr/Proto.g:115:9: ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? ( 'f' )?
            {
            // org/fudgemsg/proto/antlr/Proto.g:115:9: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:115:20: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:115:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('.'); 
            // org/fudgemsg/proto/antlr/Proto.g:115:36: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:115:37: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // org/fudgemsg/proto/antlr/Proto.g:115:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:115:50: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // org/fudgemsg/proto/antlr/Proto.g:115:60: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:115:71: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:115:72: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:115:86: ( 'f' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='f') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:115:86: 'f'
                    {
                    match('f'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:116:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:116:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // org/fudgemsg/proto/antlr/Proto.g:116:19: ( options {greedy=false; } : . )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='*') ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1=='/') ) {
                        alt12=2;
                    }
                    else if ( ((LA12_1>='\u0000' && LA12_1<='.')||(LA12_1>='0' && LA12_1<='\uFFFF')) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>='\u0000' && LA12_0<=')')||(LA12_0>='+' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:116:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match("*/"); 

             skip (); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "ML_STRING"
    public final void mML_STRING() throws RecognitionException {
        try {
            int _type = ML_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:118:11: ( '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' ) )
            // org/fudgemsg/proto/antlr/Proto.g:118:13: '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' )
            {
            match("<<<"); 

            // org/fudgemsg/proto/antlr/Proto.g:118:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:118:52: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:118:84: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:118:101: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match(';'); 
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_STRING"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:119:8: ( '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"' )
            // org/fudgemsg/proto/antlr/Proto.g:119:10: '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"'
            {
            match('\"'); 
            // org/fudgemsg/proto/antlr/Proto.g:119:14: ( options {greedy=false; } : ( '\\\\' . | . ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\"') ) {
                    alt17=2;
                }
                else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:119:46: ( '\\\\' . | . )
            	    {
            	    // org/fudgemsg/proto/antlr/Proto.g:119:46: ( '\\\\' . | . )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0=='\\') ) {
            	        int LA16_1 = input.LA(2);

            	        if ( (LA16_1=='\"') ) {
            	            alt16=1;
            	        }
            	        else if ( (LA16_1=='\\') ) {
            	            alt16=1;
            	        }
            	        else if ( ((LA16_1>='\u0000' && LA16_1<='!')||(LA16_1>='#' && LA16_1<='[')||(LA16_1>=']' && LA16_1<='\uFFFF')) ) {
            	            alt16=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 16, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA16_0>='\u0000' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:119:47: '\\\\' .
            	            {
            	            match('\\'); 
            	            matchAny(); 

            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:119:53: .
            	            {
            	            matchAny(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:120:12: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:120:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:120:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

             skip (); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // org/fudgemsg/proto/antlr/Proto.g:1:8: ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_DATE | T_DATETIME | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE )
        int alt19=60;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // org/fudgemsg/proto/antlr/Proto.g:1:10: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 2 :
                // org/fudgemsg/proto/antlr/Proto.g:1:19: BINDING
                {
                mBINDING(); 

                }
                break;
            case 3 :
                // org/fudgemsg/proto/antlr/Proto.g:1:27: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 4 :
                // org/fudgemsg/proto/antlr/Proto.g:1:35: ENUM
                {
                mENUM(); 

                }
                break;
            case 5 :
                // org/fudgemsg/proto/antlr/Proto.g:1:40: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 6 :
                // org/fudgemsg/proto/antlr/Proto.g:1:48: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 7 :
                // org/fudgemsg/proto/antlr/Proto.g:1:55: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 8 :
                // org/fudgemsg/proto/antlr/Proto.g:1:62: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 9 :
                // org/fudgemsg/proto/antlr/Proto.g:1:70: MUTABLE
                {
                mMUTABLE(); 

                }
                break;
            case 10 :
                // org/fudgemsg/proto/antlr/Proto.g:1:78: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 11 :
                // org/fudgemsg/proto/antlr/Proto.g:1:88: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 12 :
                // org/fudgemsg/proto/antlr/Proto.g:1:97: READONLY
                {
                mREADONLY(); 

                }
                break;
            case 13 :
                // org/fudgemsg/proto/antlr/Proto.g:1:106: REPEATED
                {
                mREPEATED(); 

                }
                break;
            case 14 :
                // org/fudgemsg/proto/antlr/Proto.g:1:115: REQUIRED
                {
                mREQUIRED(); 

                }
                break;
            case 15 :
                // org/fudgemsg/proto/antlr/Proto.g:1:124: T_BOOL
                {
                mT_BOOL(); 

                }
                break;
            case 16 :
                // org/fudgemsg/proto/antlr/Proto.g:1:131: T_BYTE
                {
                mT_BYTE(); 

                }
                break;
            case 17 :
                // org/fudgemsg/proto/antlr/Proto.g:1:138: T_DOUBLE
                {
                mT_DOUBLE(); 

                }
                break;
            case 18 :
                // org/fudgemsg/proto/antlr/Proto.g:1:147: T_DATE
                {
                mT_DATE(); 

                }
                break;
            case 19 :
                // org/fudgemsg/proto/antlr/Proto.g:1:154: T_DATETIME
                {
                mT_DATETIME(); 

                }
                break;
            case 20 :
                // org/fudgemsg/proto/antlr/Proto.g:1:165: T_FLOAT
                {
                mT_FLOAT(); 

                }
                break;
            case 21 :
                // org/fudgemsg/proto/antlr/Proto.g:1:173: T_INDICATOR
                {
                mT_INDICATOR(); 

                }
                break;
            case 22 :
                // org/fudgemsg/proto/antlr/Proto.g:1:185: T_INT
                {
                mT_INT(); 

                }
                break;
            case 23 :
                // org/fudgemsg/proto/antlr/Proto.g:1:191: T_LONG
                {
                mT_LONG(); 

                }
                break;
            case 24 :
                // org/fudgemsg/proto/antlr/Proto.g:1:198: T_SHORT
                {
                mT_SHORT(); 

                }
                break;
            case 25 :
                // org/fudgemsg/proto/antlr/Proto.g:1:206: T_STRING
                {
                mT_STRING(); 

                }
                break;
            case 26 :
                // org/fudgemsg/proto/antlr/Proto.g:1:215: T_TIME
                {
                mT_TIME(); 

                }
                break;
            case 27 :
                // org/fudgemsg/proto/antlr/Proto.g:1:222: TAXONOMY
                {
                mTAXONOMY(); 

                }
                break;
            case 28 :
                // org/fudgemsg/proto/antlr/Proto.g:1:231: USES
                {
                mUSES(); 

                }
                break;
            case 29 :
                // org/fudgemsg/proto/antlr/Proto.g:1:236: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // org/fudgemsg/proto/antlr/Proto.g:1:242: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // org/fudgemsg/proto/antlr/Proto.g:1:248: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // org/fudgemsg/proto/antlr/Proto.g:1:254: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // org/fudgemsg/proto/antlr/Proto.g:1:260: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // org/fudgemsg/proto/antlr/Proto.g:1:266: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // org/fudgemsg/proto/antlr/Proto.g:1:272: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // org/fudgemsg/proto/antlr/Proto.g:1:278: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // org/fudgemsg/proto/antlr/Proto.g:1:284: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // org/fudgemsg/proto/antlr/Proto.g:1:290: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // org/fudgemsg/proto/antlr/Proto.g:1:296: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // org/fudgemsg/proto/antlr/Proto.g:1:302: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // org/fudgemsg/proto/antlr/Proto.g:1:308: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // org/fudgemsg/proto/antlr/Proto.g:1:314: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // org/fudgemsg/proto/antlr/Proto.g:1:320: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // org/fudgemsg/proto/antlr/Proto.g:1:326: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // org/fudgemsg/proto/antlr/Proto.g:1:332: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // org/fudgemsg/proto/antlr/Proto.g:1:338: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // org/fudgemsg/proto/antlr/Proto.g:1:344: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // org/fudgemsg/proto/antlr/Proto.g:1:350: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // org/fudgemsg/proto/antlr/Proto.g:1:356: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // org/fudgemsg/proto/antlr/Proto.g:1:362: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // org/fudgemsg/proto/antlr/Proto.g:1:368: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // org/fudgemsg/proto/antlr/Proto.g:1:374: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // org/fudgemsg/proto/antlr/Proto.g:1:380: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 54 :
                // org/fudgemsg/proto/antlr/Proto.g:1:388: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 55 :
                // org/fudgemsg/proto/antlr/Proto.g:1:399: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 56 :
                // org/fudgemsg/proto/antlr/Proto.g:1:407: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 57 :
                // org/fudgemsg/proto/antlr/Proto.g:1:413: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 58 :
                // org/fudgemsg/proto/antlr/Proto.g:1:424: ML_STRING
                {
                mML_STRING(); 

                }
                break;
            case 59 :
                // org/fudgemsg/proto/antlr/Proto.g:1:434: STRING
                {
                mSTRING(); 

                }
                break;
            case 60 :
                // org/fudgemsg/proto/antlr/Proto.g:1:441: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA14_eotS =
        "\6\uffff";
    static final String DFA14_eofS =
        "\6\uffff";
    static final String DFA14_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA14_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA14_specialS =
        "\1\2\1\1\1\uffff\1\3\1\0\1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\12\2\1\1\2\2\1\1\ufff2\2",
            "\101\2\32\3\6\2\32\3\uff85\2",
            "",
            "\73\2\1\4\5\2\32\3\6\2\32\3\uff85\2",
            "\12\2\1\5\2\2\1\5\ufff2\2",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 118:52: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_4 = input.LA(1);

                        s = -1;
                        if ( (LA14_4=='\n'||LA14_4=='\r') ) {s = 5;}

                        else if ( ((LA14_4>='\u0000' && LA14_4<='\t')||(LA14_4>='\u000B' && LA14_4<='\f')||(LA14_4>='\u000E' && LA14_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_1 = input.LA(1);

                        s = -1;
                        if ( ((LA14_1>='\u0000' && LA14_1<='@')||(LA14_1>='[' && LA14_1<='`')||(LA14_1>='{' && LA14_1<='\uFFFF')) ) {s = 2;}

                        else if ( ((LA14_1>='A' && LA14_1<='Z')||(LA14_1>='a' && LA14_1<='z')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\n'||LA14_0=='\r') ) {s = 1;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_3 = input.LA(1);

                        s = -1;
                        if ( ((LA14_3>='\u0000' && LA14_3<=':')||(LA14_3>='<' && LA14_3<='@')||(LA14_3>='[' && LA14_3<='`')||(LA14_3>='{' && LA14_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA14_3==';') ) {s = 4;}

                        else if ( ((LA14_3>='A' && LA14_3<='Z')||(LA14_3>='a' && LA14_3<='z')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\16\30\7\uffff\1\72\3\uffff\1\75\3\uffff\33\30\5\uffff\13"+
        "\30\1\154\24\30\1\u0082\1\u0083\2\30\1\u0087\1\u0088\3\30\1\u008d"+
        "\4\30\1\uffff\11\30\1\u009b\4\30\1\u00a1\1\30\1\u00a3\4\30\2\uffff"+
        "\3\30\2\uffff\4\30\1\uffff\1\u00b0\1\u00b1\1\30\1\u00b3\7\30\1\u00bd"+
        "\1\30\1\uffff\1\u00c0\4\30\1\uffff\1\30\1\uffff\6\30\1\u00cc\2\30"+
        "\1\u00cf\1\u00d0\1\30\2\uffff\1\30\1\uffff\11\30\1\uffff\2\30\1"+
        "\uffff\1\u00de\1\u00df\1\u00e0\2\30\1\u00e4\1\u00e5\1\30\1\u00e7"+
        "\1\u00e8\1\u00e9\1\uffff\1\30\1\u00eb\2\uffff\1\30\1\u00ed\1\u00ee"+
        "\1\u00ef\5\30\1\u00f5\1\u00f6\1\u00f7\1\u00f8\3\uffff\3\30\2\uffff"+
        "\1\u00fc\3\uffff\1\u00fd\1\uffff\1\30\3\uffff\1\30\1\u0100\1\u0101"+
        "\1\u0102\1\u0103\4\uffff\1\u0104\1\u0105\1\u0106\2\uffff\1\u0107"+
        "\1\u0108\11\uffff";
    static final String DFA19_eofS =
        "\u0109\uffff";
    static final String DFA19_minS =
        "\1\11\1\142\1\151\1\141\1\156\1\155\1\145\1\141\1\160\1\145\1\151"+
        "\1\157\1\146\1\141\1\151\7\uffff\1\60\1\52\1\uffff\2\56\3\uffff"+
        "\1\163\1\156\1\157\1\164\1\146\1\165\1\164\1\165\1\164\1\160\1\144"+
        "\1\163\1\164\1\155\1\164\1\141\1\157\1\170\1\156\1\157\1\162\1\156"+
        "\1\151\1\155\1\170\1\145\1\156\5\uffff\1\164\1\144\1\154\1\145\1"+
        "\141\1\142\1\145\1\155\1\145\1\157\1\151\1\60\1\163\1\141\1\145"+
        "\1\151\1\144\1\145\1\165\1\141\1\145\1\147\1\162\1\151\1\164\1\170"+
        "\1\145\1\157\1\163\1\164\1\162\1\151\2\60\1\165\1\154\2\60\1\156"+
        "\1\162\1\143\1\60\1\66\1\62\1\147\1\64\1\uffff\1\141\1\142\1\163"+
        "\2\157\1\141\1\151\1\164\1\144\1\60\1\164\1\156\1\63\1\145\1\60"+
        "\1\156\1\60\1\63\1\141\1\156\1\141\2\uffff\1\154\1\145\1\151\2\uffff"+
        "\1\144\1\156\1\164\1\141\1\uffff\2\60\1\145\1\60\1\147\1\154\1\160"+
        "\2\156\1\164\1\162\1\60\1\63\1\uffff\1\60\1\147\1\62\1\64\1\144"+
        "\1\uffff\1\157\1\uffff\1\62\1\64\1\143\1\147\1\156\1\164\1\60\1"+
        "\155\1\163\2\60\1\164\2\uffff\1\162\1\uffff\2\145\2\141\1\154\2"+
        "\145\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\60\1\63\1\155\2\60\1"+
        "\164\3\60\1\uffff\1\145\1\60\2\uffff\1\157\3\60\1\143\1\154\1\171"+
        "\2\144\4\60\3\uffff\1\62\1\64\1\171\2\uffff\1\60\3\uffff\1\60\1"+
        "\uffff\1\162\3\uffff\1\145\4\60\4\uffff\3\60\2\uffff\2\60\11\uffff";
    static final String DFA19_maxS =
        "\1\175\1\142\1\171\1\157\1\170\1\156\1\165\1\141\1\160\1\145\1\154"+
        "\1\157\1\164\1\151\1\163\7\uffff\1\71\1\57\1\uffff\2\71\3\uffff"+
        "\1\163\1\156\1\157\1\164\1\146\1\165\1\164\1\165\1\164\1\160\1\164"+
        "\1\163\1\164\1\155\1\164\1\161\1\157\1\170\1\156\1\157\1\162\1\156"+
        "\1\151\1\155\1\170\1\145\1\156\5\uffff\1\164\1\144\1\154\1\145\1"+
        "\141\1\142\1\145\1\155\1\145\1\157\1\151\1\172\1\163\1\141\1\145"+
        "\1\151\1\144\1\145\1\165\1\141\1\145\1\147\1\162\1\151\1\164\1\170"+
        "\1\145\1\157\1\163\1\164\1\162\1\151\2\172\1\165\1\154\2\172\2\162"+
        "\1\143\1\172\1\66\1\62\1\147\1\64\1\uffff\1\141\1\142\1\163\2\157"+
        "\1\141\1\151\1\164\1\144\1\172\1\164\1\156\1\66\1\145\1\172\1\156"+
        "\1\172\1\66\1\141\1\156\1\141\2\uffff\1\154\1\145\1\151\2\uffff"+
        "\1\144\1\156\1\164\1\141\1\uffff\2\172\1\145\1\172\1\147\1\154\1"+
        "\160\2\156\1\164\1\162\1\172\1\66\1\uffff\1\172\1\147\1\62\1\64"+
        "\1\144\1\uffff\1\157\1\uffff\1\62\1\64\1\143\1\147\1\156\1\164\1"+
        "\172\1\155\1\163\2\172\1\164\2\uffff\1\162\1\uffff\2\145\2\141\1"+
        "\154\2\145\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\172\1\66\1\155"+
        "\2\172\1\164\3\172\1\uffff\1\145\1\172\2\uffff\1\157\3\172\1\143"+
        "\1\154\1\171\2\144\4\172\3\uffff\1\62\1\64\1\171\2\uffff\1\172\3"+
        "\uffff\1\172\1\uffff\1\162\3\uffff\1\145\4\172\4\uffff\3\172\2\uffff"+
        "\2\172\11\uffff";
    static final String DFA19_acceptS =
        "\17\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\2\uffff\1\66\2\uffff"+
        "\1\72\1\73\1\74\33\uffff\1\70\1\64\1\65\1\71\1\67\56\uffff\1\26"+
        "\25\uffff\1\17\1\20\3\uffff\1\22\1\4\4\uffff\1\45\15\uffff\1\27"+
        "\5\uffff\1\32\1\uffff\1\34\14\uffff\1\46\1\47\1\uffff\1\55\11\uffff"+
        "\1\24\2\uffff\1\30\13\uffff\1\21\2\uffff\1\6\1\7\15\uffff\1\31\1"+
        "\51\1\57\3\uffff\1\50\1\56\1\uffff\1\2\1\44\1\3\1\uffff\1\5\1\uffff"+
        "\1\54\1\10\1\11\5\uffff\1\62\1\63\1\52\1\60\3\uffff\1\1\1\23\2\uffff"+
        "\1\13\1\14\1\15\1\16\1\53\1\61\1\33\1\25\1\12";
    static final String DFA19_specialS =
        "\u0109\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\34\10\uffff\1\31"+
            "\1\25\1\31\1\26\1\27\12\32\1\uffff\1\21\1\33\1\22\3\uffff\32"+
            "\30\1\23\1\uffff\1\24\1\uffff\1\30\1\uffff\1\1\1\2\1\30\1\3"+
            "\1\4\1\12\2\30\1\5\2\30\1\13\1\6\1\7\1\10\2\30\1\11\1\14\1\15"+
            "\1\16\5\30\1\17\1\uffff\1\20",
            "\1\36",
            "\1\37\5\uffff\1\40\11\uffff\1\41",
            "\1\44\3\uffff\1\42\11\uffff\1\43",
            "\1\45\11\uffff\1\46",
            "\1\47\1\50",
            "\1\51\17\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\2\uffff\1\56",
            "\1\60",
            "\1\64\1\uffff\1\61\1\63\12\uffff\1\62",
            "\1\66\7\uffff\1\65",
            "\1\70\11\uffff\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\71",
            "\1\74\4\uffff\1\73",
            "",
            "\1\71\1\uffff\12\32",
            "\1\71\1\uffff\12\32",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\17\uffff\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\16\uffff\1\117\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\30\1\150\1\30\1\151\2\30\1\153\1\30\1\147\1\30\7\uffff\32"+
            "\30\4\uffff\1\30\1\uffff\4\30\1\152\25\30",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30\1\u0081\25\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0084",
            "\1\u0085",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\23\30\1\u0086\6\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0089\3\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\2\uffff\1\u009f",
            "\1\u00a0",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00a2",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00a4\2\uffff\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00b2",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\3\30\1\u00bb\2\30\1\u00bc\3\30\7\uffff\32\30\4\uffff\1\30"+
            "\1\uffff\32\30",
            "\1\u00be\2\uffff\1\u00bf",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00cd",
            "\1\u00ce",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00d1",
            "",
            "",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00e1\2\uffff\1\u00e2",
            "\1\u00e3",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00e6",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00ea",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\u00ec",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u00fe",
            "",
            "",
            "",
            "\1\u00ff",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_DATE | T_DATETIME | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE );";
        }
    }
 

}