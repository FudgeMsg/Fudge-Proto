// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-02-05 13:51:52

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
    public static final int T__66=66;
    public static final int BINDING=5;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=31;
    public static final int ML_STRING=40;
    public static final int T_BOOL=21;
    public static final int EXTERN=11;
    public static final int T_DOUBLE=23;
    public static final int FLOAT=38;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_LONG=29;
    public static final int T__55=55;
    public static final int TIME=43;
    public static final int ML_COMMENT=39;
    public static final int T_INDICATOR=27;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=13;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=36;
    public static final int TAXONOMY=33;
    public static final int T__59=59;
    public static final int T_INT=28;
    public static final int MESSAGE=14;
    public static final int COMMENT=35;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=37;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T_BYTE=22;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int DIM_FIXED=7;
    public static final int T__49=49;
    public static final int ORDINAL=17;
    public static final int DEFAULT=6;
    public static final int REPEATED=18;
    public static final int T_FLOAT=26;
    public static final int WHITESPACE=42;
    public static final int REQUIRED=19;
    public static final int ROOT=20;
    public static final int T_DATETIME=25;
    public static final int NAMESPACE=16;
    public static final int DIM_VARIANT=8;
    public static final int ENUM=9;
    public static final int USES=34;
    public static final int T_DATE=24;
    public static final int FIELD=12;
    public static final int T_TIME=32;
    public static final int EXTENDS=10;
    public static final int T_SHORT=30;
    public static final int MUTABLE=15;
    public static final int STRING=41;

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

    // $ANTLR start "BINDING"
    public final void mBINDING() throws RecognitionException {
        try {
            int _type = BINDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:29:9: ( 'binding' )
            // org/fudgemsg/proto/antlr/Proto.g:29:11: 'binding'
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
            // org/fudgemsg/proto/antlr/Proto.g:30:9: ( 'default' )
            // org/fudgemsg/proto/antlr/Proto.g:30:11: 'default'
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
            // org/fudgemsg/proto/antlr/Proto.g:31:6: ( 'enum' )
            // org/fudgemsg/proto/antlr/Proto.g:31:8: 'enum'
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
            // org/fudgemsg/proto/antlr/Proto.g:32:9: ( 'extends' )
            // org/fudgemsg/proto/antlr/Proto.g:32:11: 'extends'
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
            // org/fudgemsg/proto/antlr/Proto.g:33:8: ( 'extern' )
            // org/fudgemsg/proto/antlr/Proto.g:33:10: 'extern'
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
            // org/fudgemsg/proto/antlr/Proto.g:34:8: ( 'import' )
            // org/fudgemsg/proto/antlr/Proto.g:34:10: 'import'
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
            // org/fudgemsg/proto/antlr/Proto.g:35:9: ( 'message' )
            // org/fudgemsg/proto/antlr/Proto.g:35:11: 'message'
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
            // org/fudgemsg/proto/antlr/Proto.g:36:9: ( 'mutable' )
            // org/fudgemsg/proto/antlr/Proto.g:36:11: 'mutable'
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
            // org/fudgemsg/proto/antlr/Proto.g:37:11: ( 'namespace' )
            // org/fudgemsg/proto/antlr/Proto.g:37:13: 'namespace'
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

    // $ANTLR start "REPEATED"
    public final void mREPEATED() throws RecognitionException {
        try {
            int _type = REPEATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:38:10: ( 'repeated' )
            // org/fudgemsg/proto/antlr/Proto.g:38:12: 'repeated'
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
            // org/fudgemsg/proto/antlr/Proto.g:39:10: ( 'required' )
            // org/fudgemsg/proto/antlr/Proto.g:39:12: 'required'
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
            // org/fudgemsg/proto/antlr/Proto.g:40:8: ( 'bool' )
            // org/fudgemsg/proto/antlr/Proto.g:40:10: 'bool'
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
            // org/fudgemsg/proto/antlr/Proto.g:41:8: ( 'byte' )
            // org/fudgemsg/proto/antlr/Proto.g:41:10: 'byte'
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
            // org/fudgemsg/proto/antlr/Proto.g:42:10: ( 'double' )
            // org/fudgemsg/proto/antlr/Proto.g:42:12: 'double'
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
            // org/fudgemsg/proto/antlr/Proto.g:43:8: ( 'date' )
            // org/fudgemsg/proto/antlr/Proto.g:43:10: 'date'
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
            // org/fudgemsg/proto/antlr/Proto.g:44:12: ( 'datetime' )
            // org/fudgemsg/proto/antlr/Proto.g:44:14: 'datetime'
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
            // org/fudgemsg/proto/antlr/Proto.g:45:9: ( 'float' )
            // org/fudgemsg/proto/antlr/Proto.g:45:11: 'float'
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
            // org/fudgemsg/proto/antlr/Proto.g:46:13: ( 'indicator' )
            // org/fudgemsg/proto/antlr/Proto.g:46:15: 'indicator'
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
            // org/fudgemsg/proto/antlr/Proto.g:47:7: ( 'int' )
            // org/fudgemsg/proto/antlr/Proto.g:47:9: 'int'
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
            // org/fudgemsg/proto/antlr/Proto.g:48:8: ( 'long' )
            // org/fudgemsg/proto/antlr/Proto.g:48:10: 'long'
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
            // org/fudgemsg/proto/antlr/Proto.g:49:9: ( 'short' )
            // org/fudgemsg/proto/antlr/Proto.g:49:11: 'short'
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
            // org/fudgemsg/proto/antlr/Proto.g:50:10: ( 'string' )
            // org/fudgemsg/proto/antlr/Proto.g:50:12: 'string'
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
            // org/fudgemsg/proto/antlr/Proto.g:51:8: ( 'time' )
            // org/fudgemsg/proto/antlr/Proto.g:51:10: 'time'
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
            // org/fudgemsg/proto/antlr/Proto.g:52:10: ( 'taxonomy' )
            // org/fudgemsg/proto/antlr/Proto.g:52:12: 'taxonomy'
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
            // org/fudgemsg/proto/antlr/Proto.g:53:6: ( 'uses' )
            // org/fudgemsg/proto/antlr/Proto.g:53:8: 'uses'
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

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:54:7: ( '{' )
            // org/fudgemsg/proto/antlr/Proto.g:54:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:55:7: ( '}' )
            // org/fudgemsg/proto/antlr/Proto.g:55:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:56:7: ( ';' )
            // org/fudgemsg/proto/antlr/Proto.g:56:9: ';'
            {
            match(';'); 

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
            // org/fudgemsg/proto/antlr/Proto.g:57:7: ( '=' )
            // org/fudgemsg/proto/antlr/Proto.g:57:9: '='
            {
            match('='); 

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
            // org/fudgemsg/proto/antlr/Proto.g:58:7: ( '[' )
            // org/fudgemsg/proto/antlr/Proto.g:58:9: '['
            {
            match('['); 

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
            // org/fudgemsg/proto/antlr/Proto.g:59:7: ( ']' )
            // org/fudgemsg/proto/antlr/Proto.g:59:9: ']'
            {
            match(']'); 

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
            // org/fudgemsg/proto/antlr/Proto.g:60:7: ( ',' )
            // org/fudgemsg/proto/antlr/Proto.g:60:9: ','
            {
            match(','); 

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
            // org/fudgemsg/proto/antlr/Proto.g:61:7: ( 'optional' )
            // org/fudgemsg/proto/antlr/Proto.g:61:9: 'optional'
            {
            match("optional"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:62:7: ( 'boolean' )
            // org/fudgemsg/proto/antlr/Proto.g:62:9: 'boolean'
            {
            match("boolean"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:63:7: ( 'int8' )
            // org/fudgemsg/proto/antlr/Proto.g:63:9: 'int8'
            {
            match("int8"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:64:7: ( 'int16' )
            // org/fudgemsg/proto/antlr/Proto.g:64:9: 'int16'
            {
            match("int16"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:65:7: ( 'int32' )
            // org/fudgemsg/proto/antlr/Proto.g:65:9: 'int32'
            {
            match("int32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:66:7: ( 'uint32' )
            // org/fudgemsg/proto/antlr/Proto.g:66:9: 'uint32'
            {
            match("uint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:67:7: ( 'sint32' )
            // org/fudgemsg/proto/antlr/Proto.g:67:9: 'sint32'
            {
            match("sint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:68:7: ( 'fixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:68:9: 'fixed32'
            {
            match("fixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:69:7: ( 'sfixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:69:9: 'sfixed32'
            {
            match("sfixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:70:7: ( 'integer' )
            // org/fudgemsg/proto/antlr/Proto.g:70:9: 'integer'
            {
            match("integer"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:71:7: ( 'int64' )
            // org/fudgemsg/proto/antlr/Proto.g:71:9: 'int64'
            {
            match("int64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:72:7: ( 'uint64' )
            // org/fudgemsg/proto/antlr/Proto.g:72:9: 'uint64'
            {
            match("uint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:73:7: ( 'sint64' )
            // org/fudgemsg/proto/antlr/Proto.g:73:9: 'sint64'
            {
            match("sint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:74:7: ( 'fixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:74:9: 'fixed64'
            {
            match("fixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:75:7: ( 'sfixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:75:9: 'sfixed64'
            {
            match("sfixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:76:7: ( 'float32' )
            // org/fudgemsg/proto/antlr/Proto.g:76:9: 'float32'
            {
            match("float32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:77:7: ( 'float64' )
            // org/fudgemsg/proto/antlr/Proto.g:77:9: 'float64'
            {
            match("float64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:78:7: ( '.' )
            // org/fudgemsg/proto/antlr/Proto.g:78:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:109:9: ( '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' ) )
            // org/fudgemsg/proto/antlr/Proto.g:109:11: '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // org/fudgemsg/proto/antlr/Proto.g:109:16: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:109:48: .
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
            // org/fudgemsg/proto/antlr/Proto.g:110:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/fudgemsg/proto/antlr/Proto.g:110:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:110:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // org/fudgemsg/proto/antlr/Proto.g:111:9: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:111:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:111:11: ( '+' | '-' )?
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

            // org/fudgemsg/proto/antlr/Proto.g:111:22: ( '0' .. '9' )+
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
            	    // org/fudgemsg/proto/antlr/Proto.g:111:22: '0' .. '9'
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
            // org/fudgemsg/proto/antlr/Proto.g:112:7: ( ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // org/fudgemsg/proto/antlr/Proto.g:112:9: ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // org/fudgemsg/proto/antlr/Proto.g:112:9: ( '+' | '-' )?
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

            // org/fudgemsg/proto/antlr/Proto.g:112:20: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:112:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('.'); 
            // org/fudgemsg/proto/antlr/Proto.g:112:36: ( '0' .. '9' )+
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
            	    // org/fudgemsg/proto/antlr/Proto.g:112:37: '0' .. '9'
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

            // org/fudgemsg/proto/antlr/Proto.g:112:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:112:50: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // org/fudgemsg/proto/antlr/Proto.g:112:60: ( '+' | '-' )?
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

                    // org/fudgemsg/proto/antlr/Proto.g:112:71: ( '0' .. '9' )+
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
                    	    // org/fudgemsg/proto/antlr/Proto.g:112:72: '0' .. '9'
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
            // org/fudgemsg/proto/antlr/Proto.g:113:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:113:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // org/fudgemsg/proto/antlr/Proto.g:113:19: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:113:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // org/fudgemsg/proto/antlr/Proto.g:115:11: ( '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' ) )
            // org/fudgemsg/proto/antlr/Proto.g:115:13: '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' )
            {
            match("<<<"); 

            // org/fudgemsg/proto/antlr/Proto.g:115:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:115:52: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:115:84: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:115:101: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
            // org/fudgemsg/proto/antlr/Proto.g:116:8: ( '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"' )
            // org/fudgemsg/proto/antlr/Proto.g:116:10: '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"'
            {
            match('\"'); 
            // org/fudgemsg/proto/antlr/Proto.g:116:14: ( options {greedy=false; } : ( '\\\\' . | . ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\"') ) {
                    alt16=2;
                }
                else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:116:46: ( '\\\\' . | . )
            	    {
            	    // org/fudgemsg/proto/antlr/Proto.g:116:46: ( '\\\\' . | . )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='\\') ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1=='\"') ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_1=='\\') ) {
            	            alt15=1;
            	        }
            	        else if ( ((LA15_1>='\u0000' && LA15_1<='!')||(LA15_1>='#' && LA15_1<='[')||(LA15_1>=']' && LA15_1<='\uFFFF')) ) {
            	            alt15=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA15_0>='\u0000' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:116:47: '\\\\' .
            	            {
            	            match('\\'); 
            	            matchAny(); 

            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:116:53: .
            	            {
            	            matchAny(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
            // org/fudgemsg/proto/antlr/Proto.g:117:12: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:117:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:117:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
        // org/fudgemsg/proto/antlr/Proto.g:1:8: ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_DATE | T_DATETIME | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE )
        int alt18=58;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // org/fudgemsg/proto/antlr/Proto.g:1:10: BINDING
                {
                mBINDING(); 

                }
                break;
            case 2 :
                // org/fudgemsg/proto/antlr/Proto.g:1:18: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 3 :
                // org/fudgemsg/proto/antlr/Proto.g:1:26: ENUM
                {
                mENUM(); 

                }
                break;
            case 4 :
                // org/fudgemsg/proto/antlr/Proto.g:1:31: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 5 :
                // org/fudgemsg/proto/antlr/Proto.g:1:39: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 6 :
                // org/fudgemsg/proto/antlr/Proto.g:1:46: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 7 :
                // org/fudgemsg/proto/antlr/Proto.g:1:53: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 8 :
                // org/fudgemsg/proto/antlr/Proto.g:1:61: MUTABLE
                {
                mMUTABLE(); 

                }
                break;
            case 9 :
                // org/fudgemsg/proto/antlr/Proto.g:1:69: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 10 :
                // org/fudgemsg/proto/antlr/Proto.g:1:79: REPEATED
                {
                mREPEATED(); 

                }
                break;
            case 11 :
                // org/fudgemsg/proto/antlr/Proto.g:1:88: REQUIRED
                {
                mREQUIRED(); 

                }
                break;
            case 12 :
                // org/fudgemsg/proto/antlr/Proto.g:1:97: T_BOOL
                {
                mT_BOOL(); 

                }
                break;
            case 13 :
                // org/fudgemsg/proto/antlr/Proto.g:1:104: T_BYTE
                {
                mT_BYTE(); 

                }
                break;
            case 14 :
                // org/fudgemsg/proto/antlr/Proto.g:1:111: T_DOUBLE
                {
                mT_DOUBLE(); 

                }
                break;
            case 15 :
                // org/fudgemsg/proto/antlr/Proto.g:1:120: T_DATE
                {
                mT_DATE(); 

                }
                break;
            case 16 :
                // org/fudgemsg/proto/antlr/Proto.g:1:127: T_DATETIME
                {
                mT_DATETIME(); 

                }
                break;
            case 17 :
                // org/fudgemsg/proto/antlr/Proto.g:1:138: T_FLOAT
                {
                mT_FLOAT(); 

                }
                break;
            case 18 :
                // org/fudgemsg/proto/antlr/Proto.g:1:146: T_INDICATOR
                {
                mT_INDICATOR(); 

                }
                break;
            case 19 :
                // org/fudgemsg/proto/antlr/Proto.g:1:158: T_INT
                {
                mT_INT(); 

                }
                break;
            case 20 :
                // org/fudgemsg/proto/antlr/Proto.g:1:164: T_LONG
                {
                mT_LONG(); 

                }
                break;
            case 21 :
                // org/fudgemsg/proto/antlr/Proto.g:1:171: T_SHORT
                {
                mT_SHORT(); 

                }
                break;
            case 22 :
                // org/fudgemsg/proto/antlr/Proto.g:1:179: T_STRING
                {
                mT_STRING(); 

                }
                break;
            case 23 :
                // org/fudgemsg/proto/antlr/Proto.g:1:188: T_TIME
                {
                mT_TIME(); 

                }
                break;
            case 24 :
                // org/fudgemsg/proto/antlr/Proto.g:1:195: TAXONOMY
                {
                mTAXONOMY(); 

                }
                break;
            case 25 :
                // org/fudgemsg/proto/antlr/Proto.g:1:204: USES
                {
                mUSES(); 

                }
                break;
            case 26 :
                // org/fudgemsg/proto/antlr/Proto.g:1:209: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // org/fudgemsg/proto/antlr/Proto.g:1:215: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // org/fudgemsg/proto/antlr/Proto.g:1:221: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // org/fudgemsg/proto/antlr/Proto.g:1:227: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // org/fudgemsg/proto/antlr/Proto.g:1:233: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // org/fudgemsg/proto/antlr/Proto.g:1:239: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // org/fudgemsg/proto/antlr/Proto.g:1:245: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // org/fudgemsg/proto/antlr/Proto.g:1:251: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // org/fudgemsg/proto/antlr/Proto.g:1:257: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // org/fudgemsg/proto/antlr/Proto.g:1:263: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // org/fudgemsg/proto/antlr/Proto.g:1:269: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // org/fudgemsg/proto/antlr/Proto.g:1:275: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // org/fudgemsg/proto/antlr/Proto.g:1:281: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // org/fudgemsg/proto/antlr/Proto.g:1:287: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // org/fudgemsg/proto/antlr/Proto.g:1:293: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // org/fudgemsg/proto/antlr/Proto.g:1:299: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // org/fudgemsg/proto/antlr/Proto.g:1:305: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // org/fudgemsg/proto/antlr/Proto.g:1:311: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // org/fudgemsg/proto/antlr/Proto.g:1:317: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // org/fudgemsg/proto/antlr/Proto.g:1:323: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // org/fudgemsg/proto/antlr/Proto.g:1:329: T__64
                {
                mT__64(); 

                }
                break;
            case 47 :
                // org/fudgemsg/proto/antlr/Proto.g:1:335: T__65
                {
                mT__65(); 

                }
                break;
            case 48 :
                // org/fudgemsg/proto/antlr/Proto.g:1:341: T__66
                {
                mT__66(); 

                }
                break;
            case 49 :
                // org/fudgemsg/proto/antlr/Proto.g:1:347: T__67
                {
                mT__67(); 

                }
                break;
            case 50 :
                // org/fudgemsg/proto/antlr/Proto.g:1:353: T__68
                {
                mT__68(); 

                }
                break;
            case 51 :
                // org/fudgemsg/proto/antlr/Proto.g:1:359: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 52 :
                // org/fudgemsg/proto/antlr/Proto.g:1:367: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 53 :
                // org/fudgemsg/proto/antlr/Proto.g:1:378: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 54 :
                // org/fudgemsg/proto/antlr/Proto.g:1:386: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 55 :
                // org/fudgemsg/proto/antlr/Proto.g:1:392: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 56 :
                // org/fudgemsg/proto/antlr/Proto.g:1:403: ML_STRING
                {
                mML_STRING(); 

                }
                break;
            case 57 :
                // org/fudgemsg/proto/antlr/Proto.g:1:413: STRING
                {
                mSTRING(); 

                }
                break;
            case 58 :
                // org/fudgemsg/proto/antlr/Proto.g:1:420: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA13_eotS =
        "\6\uffff";
    static final String DFA13_eofS =
        "\6\uffff";
    static final String DFA13_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA13_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA13_specialS =
        "\1\3\1\0\1\uffff\1\1\1\2\1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\12\2\1\1\2\2\1\1\ufff2\2",
            "\101\2\32\3\6\2\32\3\uff85\2",
            "",
            "\73\2\1\4\5\2\32\3\6\2\32\3\uff85\2",
            "\12\2\1\5\2\2\1\5\ufff2\2",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()* loopback of 115:52: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                        s = -1;
                        if ( ((LA13_1>='\u0000' && LA13_1<='@')||(LA13_1>='[' && LA13_1<='`')||(LA13_1>='{' && LA13_1<='\uFFFF')) ) {s = 2;}

                        else if ( ((LA13_1>='A' && LA13_1<='Z')||(LA13_1>='a' && LA13_1<='z')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_3 = input.LA(1);

                        s = -1;
                        if ( ((LA13_3>='\u0000' && LA13_3<=':')||(LA13_3>='<' && LA13_3<='@')||(LA13_3>='[' && LA13_3<='`')||(LA13_3>='{' && LA13_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA13_3==';') ) {s = 4;}

                        else if ( ((LA13_3>='A' && LA13_3<='Z')||(LA13_3>='a' && LA13_3<='z')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_4 = input.LA(1);

                        s = -1;
                        if ( (LA13_4=='\n'||LA13_4=='\r') ) {s = 5;}

                        else if ( ((LA13_4>='\u0000' && LA13_4<='\t')||(LA13_4>='\u000B' && LA13_4<='\f')||(LA13_4>='\u000E' && LA13_4<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='\n'||LA13_0=='\r') ) {s = 1;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\14\27\7\uffff\1\27\1\67\3\uffff\1\73\3\uffff\32\27\5\uffff"+
        "\12\27\1\147\22\27\1\173\1\174\2\27\1\u0080\1\u0081\3\27\1\u0086"+
        "\4\27\1\uffff\7\27\1\u0092\4\27\1\u0098\1\27\1\u009a\4\27\2\uffff"+
        "\3\27\2\uffff\4\27\1\uffff\1\u00a7\1\u00a8\1\27\1\u00aa\5\27\1\u00b2"+
        "\1\27\1\uffff\1\u00b5\4\27\1\uffff\1\27\1\uffff\6\27\1\u00c1\2\27"+
        "\1\u00c4\1\u00c5\1\27\2\uffff\1\27\1\uffff\7\27\1\uffff\2\27\1\uffff"+
        "\1\u00d1\1\u00d2\1\u00d3\2\27\1\u00d7\1\u00d8\1\27\1\u00da\1\u00db"+
        "\1\u00dc\1\uffff\1\27\1\u00de\2\uffff\1\27\1\u00e0\1\u00e1\1\u00e2"+
        "\3\27\1\u00e6\1\u00e7\1\u00e8\1\u00e9\3\uffff\3\27\2\uffff\1\27"+
        "\3\uffff\1\u00ee\1\uffff\1\27\3\uffff\1\27\1\u00f1\1\u00f2\4\uffff"+
        "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\uffff\1\u00f7\1\u00f8\10\uffff";
    static final String DFA18_eofS =
        "\u00f9\uffff";
    static final String DFA18_minS =
        "\1\11\1\151\1\141\1\156\1\155\1\145\1\141\1\145\1\151\1\157\1\146"+
        "\1\141\1\151\7\uffff\1\160\1\60\1\52\1\uffff\2\56\3\uffff\1\156"+
        "\1\157\1\164\1\146\1\165\1\164\1\165\1\164\1\160\1\144\1\163\1\164"+
        "\1\155\1\160\1\157\1\170\1\156\1\157\1\162\1\156\1\151\1\155\1\170"+
        "\1\145\1\156\1\164\5\uffff\1\144\1\154\1\145\1\141\1\142\1\145\1"+
        "\155\1\145\1\157\1\151\1\60\1\163\1\141\2\145\1\165\1\141\1\145"+
        "\1\147\1\162\1\151\1\164\1\170\1\145\1\157\1\163\1\164\2\151\2\60"+
        "\1\165\1\154\2\60\1\156\1\162\1\143\1\60\1\66\1\62\1\147\1\64\1"+
        "\uffff\1\141\1\142\1\163\1\141\1\151\1\164\1\144\1\60\1\164\1\156"+
        "\1\63\1\145\1\60\1\156\1\60\1\63\1\157\1\156\1\141\2\uffff\1\154"+
        "\1\145\1\151\2\uffff\1\144\1\156\1\164\1\141\1\uffff\2\60\1\145"+
        "\1\60\1\147\1\154\1\160\1\164\1\162\1\60\1\63\1\uffff\1\60\1\147"+
        "\1\62\1\64\1\144\1\uffff\1\157\1\uffff\1\62\1\64\1\156\1\147\1\156"+
        "\1\164\1\60\1\155\1\163\2\60\1\164\2\uffff\1\162\1\uffff\2\145\1"+
        "\141\2\145\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\60\1\63\1\155\2"+
        "\60\1\141\3\60\1\uffff\1\145\1\60\2\uffff\1\157\3\60\1\143\2\144"+
        "\4\60\3\uffff\1\62\1\64\1\171\2\uffff\1\154\3\uffff\1\60\1\uffff"+
        "\1\162\3\uffff\1\145\2\60\4\uffff\4\60\1\uffff\2\60\10\uffff";
    static final String DFA18_maxS =
        "\1\175\1\171\1\157\1\170\1\156\1\165\1\141\1\145\1\154\1\157\1\164"+
        "\1\151\1\163\7\uffff\1\160\1\71\1\57\1\uffff\2\71\3\uffff\1\156"+
        "\1\157\1\164\1\146\1\165\1\164\1\165\1\164\1\160\1\164\1\163\1\164"+
        "\1\155\1\161\1\157\1\170\1\156\1\157\1\162\1\156\1\151\1\155\1\170"+
        "\1\145\1\156\1\164\5\uffff\1\144\1\154\1\145\1\141\1\142\1\145\1"+
        "\155\1\145\1\157\1\151\1\172\1\163\1\141\2\145\1\165\1\141\1\145"+
        "\1\147\1\162\1\151\1\164\1\170\1\145\1\157\1\163\1\164\2\151\2\172"+
        "\1\165\1\154\2\172\2\162\1\143\1\172\1\66\1\62\1\147\1\64\1\uffff"+
        "\1\141\1\142\1\163\1\141\1\151\1\164\1\144\1\172\1\164\1\156\1\66"+
        "\1\145\1\172\1\156\1\172\1\66\1\157\1\156\1\141\2\uffff\1\154\1"+
        "\145\1\151\2\uffff\1\144\1\156\1\164\1\141\1\uffff\2\172\1\145\1"+
        "\172\1\147\1\154\1\160\1\164\1\162\1\172\1\66\1\uffff\1\172\1\147"+
        "\1\62\1\64\1\144\1\uffff\1\157\1\uffff\1\62\1\64\1\156\1\147\1\156"+
        "\1\164\1\172\1\155\1\163\2\172\1\164\2\uffff\1\162\1\uffff\2\145"+
        "\1\141\2\145\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\172\1\66\1\155"+
        "\2\172\1\141\3\172\1\uffff\1\145\1\172\2\uffff\1\157\3\172\1\143"+
        "\2\144\4\172\3\uffff\1\62\1\64\1\171\2\uffff\1\154\3\uffff\1\172"+
        "\1\uffff\1\162\3\uffff\1\145\2\172\4\uffff\4\172\1\uffff\2\172\10"+
        "\uffff";
    static final String DFA18_acceptS =
        "\15\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1\40\3\uffff\1\64\2\uffff"+
        "\1\70\1\71\1\72\32\uffff\1\62\1\66\1\63\1\67\1\65\53\uffff\1\23"+
        "\23\uffff\1\14\1\15\3\uffff\1\17\1\3\4\uffff\1\43\13\uffff\1\24"+
        "\5\uffff\1\27\1\uffff\1\31\14\uffff\1\44\1\45\1\uffff\1\53\7\uffff"+
        "\1\21\2\uffff\1\25\13\uffff\1\16\2\uffff\1\5\1\6\13\uffff\1\26\1"+
        "\47\1\55\3\uffff\1\46\1\54\1\uffff\1\1\1\42\1\2\1\uffff\1\4\1\uffff"+
        "\1\52\1\7\1\10\3\uffff\1\60\1\61\1\50\1\56\4\uffff\1\20\2\uffff"+
        "\1\12\1\13\1\51\1\57\1\30\1\41\1\22\1\11";
    static final String DFA18_specialS =
        "\u00f9\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\uffff\1\33\10\uffff\1\30"+
            "\1\23\1\30\1\25\1\26\12\31\1\uffff\1\17\1\32\1\20\3\uffff\32"+
            "\27\1\21\1\uffff\1\22\1\uffff\1\27\1\uffff\1\27\1\1\1\27\1\2"+
            "\1\3\1\10\2\27\1\4\2\27\1\11\1\5\1\6\1\24\2\27\1\7\1\12\1\13"+
            "\1\14\5\27\1\15\1\uffff\1\16",
            "\1\35\5\uffff\1\36\11\uffff\1\37",
            "\1\42\3\uffff\1\40\11\uffff\1\41",
            "\1\43\11\uffff\1\44",
            "\1\45\1\46",
            "\1\47\17\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\54\2\uffff\1\53",
            "\1\55",
            "\1\61\1\uffff\1\56\1\60\12\uffff\1\57",
            "\1\63\7\uffff\1\62",
            "\1\65\11\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\70",
            "\1\72\4\uffff\1\71",
            "",
            "\1\70\1\uffff\12\31",
            "\1\70\1\uffff\12\31",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\17\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\27\1\143\1\27\1\144\2\27\1\146\1\27\1\142\1\27\7\uffff\32"+
            "\27\4\uffff\1\27\1\uffff\4\27\1\145\25\27",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
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
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\172\25\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\175",
            "\1\176",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\23\27\1\177\6\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0082\3\uffff\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\2\uffff\1\u0096",
            "\1\u0097",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0099",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009b\2\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\3\27\1\u00b0\2\27\1\u00b1\3\27\7\uffff\32\27\4\uffff\1\27\1"+
            "\uffff\32\27",
            "\1\u00b3\2\uffff\1\u00b4",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c2",
            "\1\u00c3",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c6",
            "",
            "",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d4\2\uffff\1\u00d5",
            "\1\u00d6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u00dd",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\u00df",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\1\u00ed",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u00ef",
            "",
            "",
            "",
            "\1\u00f0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_DATE | T_DATETIME | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE );";
        }
    }
 

}