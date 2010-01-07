// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-07 17:21:18

  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ProtoLexer extends Lexer {
    public static final int BINDING=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=27;
    public static final int ML_STRING=36;
    public static final int T_BOOL=19;
    public static final int T_DOUBLE=21;
    public static final int FLOAT=34;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_LONG=25;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T_INDICATOR=23;
    public static final int ML_COMMENT=35;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=11;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=32;
    public static final int TAXONOMY=28;
    public static final int T__59=59;
    public static final int T_INT=24;
    public static final int DOC_COMMENT=31;
    public static final int MESSAGE=12;
    public static final int COMMENT=30;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=33;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=20;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int DIM_FIXED=7;
    public static final int T__49=49;
    public static final int ORDINAL=15;
    public static final int DEFAULT=6;
    public static final int REPEATED=16;
    public static final int T_FLOAT=22;
    public static final int WHITESPACE=38;
    public static final int REQUIRED=17;
    public static final int ROOT=18;
    public static final int NAMESPACE=14;
    public static final int DIM_VARIANT=8;
    public static final int ENUM=9;
    public static final int USES=29;
    public static final int T__39=39;
    public static final int FIELD=10;
    public static final int T_SHORT=26;
    public static final int MUTABLE=13;
    public static final int STRING=37;

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

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:32:8: ( 'import' )
            // org/fudgemsg/proto/antlr/Proto.g:32:10: 'import'
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
            // org/fudgemsg/proto/antlr/Proto.g:33:9: ( 'message' )
            // org/fudgemsg/proto/antlr/Proto.g:33:11: 'message'
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
            // org/fudgemsg/proto/antlr/Proto.g:34:9: ( 'mutable' )
            // org/fudgemsg/proto/antlr/Proto.g:34:11: 'mutable'
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
            // org/fudgemsg/proto/antlr/Proto.g:35:11: ( 'namespace' )
            // org/fudgemsg/proto/antlr/Proto.g:35:13: 'namespace'
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
            // org/fudgemsg/proto/antlr/Proto.g:36:10: ( 'repeated' )
            // org/fudgemsg/proto/antlr/Proto.g:36:12: 'repeated'
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
            // org/fudgemsg/proto/antlr/Proto.g:37:10: ( 'required' )
            // org/fudgemsg/proto/antlr/Proto.g:37:12: 'required'
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
            // org/fudgemsg/proto/antlr/Proto.g:38:8: ( 'bool' )
            // org/fudgemsg/proto/antlr/Proto.g:38:10: 'bool'
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
            // org/fudgemsg/proto/antlr/Proto.g:39:8: ( 'byte' )
            // org/fudgemsg/proto/antlr/Proto.g:39:10: 'byte'
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
            // org/fudgemsg/proto/antlr/Proto.g:40:10: ( 'double' )
            // org/fudgemsg/proto/antlr/Proto.g:40:12: 'double'
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

    // $ANTLR start "T_FLOAT"
    public final void mT_FLOAT() throws RecognitionException {
        try {
            int _type = T_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:41:9: ( 'float' )
            // org/fudgemsg/proto/antlr/Proto.g:41:11: 'float'
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
            // org/fudgemsg/proto/antlr/Proto.g:42:13: ( 'indicator' )
            // org/fudgemsg/proto/antlr/Proto.g:42:15: 'indicator'
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
            // org/fudgemsg/proto/antlr/Proto.g:43:7: ( 'int' )
            // org/fudgemsg/proto/antlr/Proto.g:43:9: 'int'
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
            // org/fudgemsg/proto/antlr/Proto.g:44:8: ( 'long' )
            // org/fudgemsg/proto/antlr/Proto.g:44:10: 'long'
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
            // org/fudgemsg/proto/antlr/Proto.g:45:9: ( 'short' )
            // org/fudgemsg/proto/antlr/Proto.g:45:11: 'short'
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
            // org/fudgemsg/proto/antlr/Proto.g:46:10: ( 'string' )
            // org/fudgemsg/proto/antlr/Proto.g:46:12: 'string'
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

    // $ANTLR start "TAXONOMY"
    public final void mTAXONOMY() throws RecognitionException {
        try {
            int _type = TAXONOMY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:47:10: ( 'taxonomy' )
            // org/fudgemsg/proto/antlr/Proto.g:47:12: 'taxonomy'
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
            // org/fudgemsg/proto/antlr/Proto.g:48:6: ( 'uses' )
            // org/fudgemsg/proto/antlr/Proto.g:48:8: 'uses'
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

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:49:7: ( '{' )
            // org/fudgemsg/proto/antlr/Proto.g:49:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:50:7: ( '}' )
            // org/fudgemsg/proto/antlr/Proto.g:50:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:51:7: ( ';' )
            // org/fudgemsg/proto/antlr/Proto.g:51:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:52:7: ( '=' )
            // org/fudgemsg/proto/antlr/Proto.g:52:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:53:7: ( '[' )
            // org/fudgemsg/proto/antlr/Proto.g:53:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:54:7: ( ']' )
            // org/fudgemsg/proto/antlr/Proto.g:54:9: ']'
            {
            match(']'); 

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
            // org/fudgemsg/proto/antlr/Proto.g:55:7: ( ',' )
            // org/fudgemsg/proto/antlr/Proto.g:55:9: ','
            {
            match(','); 

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
            // org/fudgemsg/proto/antlr/Proto.g:56:7: ( 'optional' )
            // org/fudgemsg/proto/antlr/Proto.g:56:9: 'optional'
            {
            match("optional"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:57:7: ( 'boolean' )
            // org/fudgemsg/proto/antlr/Proto.g:57:9: 'boolean'
            {
            match("boolean"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:58:7: ( 'int8' )
            // org/fudgemsg/proto/antlr/Proto.g:58:9: 'int8'
            {
            match("int8"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:59:7: ( 'int16' )
            // org/fudgemsg/proto/antlr/Proto.g:59:9: 'int16'
            {
            match("int16"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:60:7: ( 'int32' )
            // org/fudgemsg/proto/antlr/Proto.g:60:9: 'int32'
            {
            match("int32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:61:7: ( 'uint32' )
            // org/fudgemsg/proto/antlr/Proto.g:61:9: 'uint32'
            {
            match("uint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:62:7: ( 'sint32' )
            // org/fudgemsg/proto/antlr/Proto.g:62:9: 'sint32'
            {
            match("sint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:63:7: ( 'fixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:63:9: 'fixed32'
            {
            match("fixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:64:7: ( 'sfixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:64:9: 'sfixed32'
            {
            match("sfixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:65:7: ( 'integer' )
            // org/fudgemsg/proto/antlr/Proto.g:65:9: 'integer'
            {
            match("integer"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:66:7: ( 'int64' )
            // org/fudgemsg/proto/antlr/Proto.g:66:9: 'int64'
            {
            match("int64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:67:7: ( 'uint64' )
            // org/fudgemsg/proto/antlr/Proto.g:67:9: 'uint64'
            {
            match("uint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:68:7: ( 'sint64' )
            // org/fudgemsg/proto/antlr/Proto.g:68:9: 'sint64'
            {
            match("sint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:69:7: ( 'fixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:69:9: 'fixed64'
            {
            match("fixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:70:7: ( 'sfixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:70:9: 'sfixed64'
            {
            match("sfixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:71:7: ( 'float32' )
            // org/fudgemsg/proto/antlr/Proto.g:71:9: 'float32'
            {
            match("float32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:72:7: ( 'float64' )
            // org/fudgemsg/proto/antlr/Proto.g:72:9: 'float64'
            {
            match("float64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:73:7: ( '.' )
            // org/fudgemsg/proto/antlr/Proto.g:73:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:104:9: ( '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' ) )
            // org/fudgemsg/proto/antlr/Proto.g:104:11: '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // org/fudgemsg/proto/antlr/Proto.g:104:16: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:104:48: .
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

    // $ANTLR start "DOC_COMMENT"
    public final void mDOC_COMMENT() throws RecognitionException {
        try {
            int _type = DOC_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:105:13: ( '/**' ( ' ' | '\\t' | '\\r' | '\\n' ) ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:105:15: '/**' ( ' ' | '\\t' | '\\r' | '\\n' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:105:42: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:105:74: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOC_COMMENT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:106:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/fudgemsg/proto/antlr/Proto.g:106:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:106:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // org/fudgemsg/proto/antlr/Proto.g:107:9: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:107:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:107:11: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
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

            // org/fudgemsg/proto/antlr/Proto.g:107:22: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:107:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // org/fudgemsg/proto/antlr/Proto.g:108:7: ( ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // org/fudgemsg/proto/antlr/Proto.g:108:9: ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // org/fudgemsg/proto/antlr/Proto.g:108:9: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
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

            // org/fudgemsg/proto/antlr/Proto.g:108:20: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:108:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // org/fudgemsg/proto/antlr/Proto.g:108:36: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:108:37: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // org/fudgemsg/proto/antlr/Proto.g:108:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:108:50: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // org/fudgemsg/proto/antlr/Proto.g:108:60: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
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

                    // org/fudgemsg/proto/antlr/Proto.g:108:71: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:108:72: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
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
            // org/fudgemsg/proto/antlr/Proto.g:109:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:109:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // org/fudgemsg/proto/antlr/Proto.g:109:19: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:109:51: .
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
            // org/fudgemsg/proto/antlr/Proto.g:111:11: ( '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' ) )
            // org/fudgemsg/proto/antlr/Proto.g:111:13: '<<<' ( 'a' .. 'z' | 'A' .. 'Z' )+ ( '\\r' | '\\n' ) ( options {greedy=false; } : . )* ( '\\r' | '\\n' ) ( 'a' .. 'z' | 'A' .. 'Z' )+ ';' ( '\\r' | '\\n' )
            {
            match("<<<"); 

            // org/fudgemsg/proto/antlr/Proto.g:111:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
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

            // org/fudgemsg/proto/antlr/Proto.g:111:52: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:111:84: .
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

            // org/fudgemsg/proto/antlr/Proto.g:111:101: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            // org/fudgemsg/proto/antlr/Proto.g:112:8: ( '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"' )
            // org/fudgemsg/proto/antlr/Proto.g:112:10: '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"'
            {
            match('\"'); 
            // org/fudgemsg/proto/antlr/Proto.g:112:14: ( options {greedy=false; } : ( '\\\\' . | . ) )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:112:46: ( '\\\\' . | . )
            	    {
            	    // org/fudgemsg/proto/antlr/Proto.g:112:46: ( '\\\\' . | . )
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
            	            // org/fudgemsg/proto/antlr/Proto.g:112:47: '\\\\' .
            	            {
            	            match('\\'); 
            	            matchAny(); 

            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:112:53: .
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
            // org/fudgemsg/proto/antlr/Proto.g:113:12: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:113:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:113:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
        // org/fudgemsg/proto/antlr/Proto.g:1:8: ( BINDING | DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | COMMENT | DOC_COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE )
        int alt19=54;
        alt19 = dfa19.predict(input);
        switch (alt19) {
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
                // org/fudgemsg/proto/antlr/Proto.g:1:31: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 5 :
                // org/fudgemsg/proto/antlr/Proto.g:1:38: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 6 :
                // org/fudgemsg/proto/antlr/Proto.g:1:46: MUTABLE
                {
                mMUTABLE(); 

                }
                break;
            case 7 :
                // org/fudgemsg/proto/antlr/Proto.g:1:54: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 8 :
                // org/fudgemsg/proto/antlr/Proto.g:1:64: REPEATED
                {
                mREPEATED(); 

                }
                break;
            case 9 :
                // org/fudgemsg/proto/antlr/Proto.g:1:73: REQUIRED
                {
                mREQUIRED(); 

                }
                break;
            case 10 :
                // org/fudgemsg/proto/antlr/Proto.g:1:82: T_BOOL
                {
                mT_BOOL(); 

                }
                break;
            case 11 :
                // org/fudgemsg/proto/antlr/Proto.g:1:89: T_BYTE
                {
                mT_BYTE(); 

                }
                break;
            case 12 :
                // org/fudgemsg/proto/antlr/Proto.g:1:96: T_DOUBLE
                {
                mT_DOUBLE(); 

                }
                break;
            case 13 :
                // org/fudgemsg/proto/antlr/Proto.g:1:105: T_FLOAT
                {
                mT_FLOAT(); 

                }
                break;
            case 14 :
                // org/fudgemsg/proto/antlr/Proto.g:1:113: T_INDICATOR
                {
                mT_INDICATOR(); 

                }
                break;
            case 15 :
                // org/fudgemsg/proto/antlr/Proto.g:1:125: T_INT
                {
                mT_INT(); 

                }
                break;
            case 16 :
                // org/fudgemsg/proto/antlr/Proto.g:1:131: T_LONG
                {
                mT_LONG(); 

                }
                break;
            case 17 :
                // org/fudgemsg/proto/antlr/Proto.g:1:138: T_SHORT
                {
                mT_SHORT(); 

                }
                break;
            case 18 :
                // org/fudgemsg/proto/antlr/Proto.g:1:146: T_STRING
                {
                mT_STRING(); 

                }
                break;
            case 19 :
                // org/fudgemsg/proto/antlr/Proto.g:1:155: TAXONOMY
                {
                mTAXONOMY(); 

                }
                break;
            case 20 :
                // org/fudgemsg/proto/antlr/Proto.g:1:164: USES
                {
                mUSES(); 

                }
                break;
            case 21 :
                // org/fudgemsg/proto/antlr/Proto.g:1:169: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // org/fudgemsg/proto/antlr/Proto.g:1:175: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // org/fudgemsg/proto/antlr/Proto.g:1:181: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // org/fudgemsg/proto/antlr/Proto.g:1:187: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // org/fudgemsg/proto/antlr/Proto.g:1:193: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // org/fudgemsg/proto/antlr/Proto.g:1:199: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // org/fudgemsg/proto/antlr/Proto.g:1:205: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // org/fudgemsg/proto/antlr/Proto.g:1:211: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // org/fudgemsg/proto/antlr/Proto.g:1:217: T__47
                {
                mT__47(); 

                }
                break;
            case 30 :
                // org/fudgemsg/proto/antlr/Proto.g:1:223: T__48
                {
                mT__48(); 

                }
                break;
            case 31 :
                // org/fudgemsg/proto/antlr/Proto.g:1:229: T__49
                {
                mT__49(); 

                }
                break;
            case 32 :
                // org/fudgemsg/proto/antlr/Proto.g:1:235: T__50
                {
                mT__50(); 

                }
                break;
            case 33 :
                // org/fudgemsg/proto/antlr/Proto.g:1:241: T__51
                {
                mT__51(); 

                }
                break;
            case 34 :
                // org/fudgemsg/proto/antlr/Proto.g:1:247: T__52
                {
                mT__52(); 

                }
                break;
            case 35 :
                // org/fudgemsg/proto/antlr/Proto.g:1:253: T__53
                {
                mT__53(); 

                }
                break;
            case 36 :
                // org/fudgemsg/proto/antlr/Proto.g:1:259: T__54
                {
                mT__54(); 

                }
                break;
            case 37 :
                // org/fudgemsg/proto/antlr/Proto.g:1:265: T__55
                {
                mT__55(); 

                }
                break;
            case 38 :
                // org/fudgemsg/proto/antlr/Proto.g:1:271: T__56
                {
                mT__56(); 

                }
                break;
            case 39 :
                // org/fudgemsg/proto/antlr/Proto.g:1:277: T__57
                {
                mT__57(); 

                }
                break;
            case 40 :
                // org/fudgemsg/proto/antlr/Proto.g:1:283: T__58
                {
                mT__58(); 

                }
                break;
            case 41 :
                // org/fudgemsg/proto/antlr/Proto.g:1:289: T__59
                {
                mT__59(); 

                }
                break;
            case 42 :
                // org/fudgemsg/proto/antlr/Proto.g:1:295: T__60
                {
                mT__60(); 

                }
                break;
            case 43 :
                // org/fudgemsg/proto/antlr/Proto.g:1:301: T__61
                {
                mT__61(); 

                }
                break;
            case 44 :
                // org/fudgemsg/proto/antlr/Proto.g:1:307: T__62
                {
                mT__62(); 

                }
                break;
            case 45 :
                // org/fudgemsg/proto/antlr/Proto.g:1:313: T__63
                {
                mT__63(); 

                }
                break;
            case 46 :
                // org/fudgemsg/proto/antlr/Proto.g:1:319: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 47 :
                // org/fudgemsg/proto/antlr/Proto.g:1:327: DOC_COMMENT
                {
                mDOC_COMMENT(); 

                }
                break;
            case 48 :
                // org/fudgemsg/proto/antlr/Proto.g:1:339: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 49 :
                // org/fudgemsg/proto/antlr/Proto.g:1:350: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 50 :
                // org/fudgemsg/proto/antlr/Proto.g:1:358: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 51 :
                // org/fudgemsg/proto/antlr/Proto.g:1:364: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 52 :
                // org/fudgemsg/proto/antlr/Proto.g:1:375: ML_STRING
                {
                mML_STRING(); 

                }
                break;
            case 53 :
                // org/fudgemsg/proto/antlr/Proto.g:1:385: STRING
                {
                mSTRING(); 

                }
                break;
            case 54 :
                // org/fudgemsg/proto/antlr/Proto.g:1:392: WHITESPACE
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
        "\1\3\1\1\1\uffff\1\2\1\0\1\uffff}>";
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
            return "()* loopback of 111:52: ( options {greedy=false; } : . )*";
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
                        int LA14_3 = input.LA(1);

                        s = -1;
                        if ( ((LA14_3>='\u0000' && LA14_3<=':')||(LA14_3>='<' && LA14_3<='@')||(LA14_3>='[' && LA14_3<='`')||(LA14_3>='{' && LA14_3<='\uFFFF')) ) {s = 2;}

                        else if ( (LA14_3==';') ) {s = 4;}

                        else if ( ((LA14_3>='A' && LA14_3<='Z')||(LA14_3>='a' && LA14_3<='z')) ) {s = 3;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='\n'||LA14_0=='\r') ) {s = 1;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {s = 2;}

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
        "\1\uffff\14\27\7\uffff\1\27\1\64\3\uffff\1\70\3\uffff\27\27\5\uffff"+
        "\10\27\1\141\20\27\2\uffff\1\27\1\165\1\166\2\27\1\171\2\27\1\174"+
        "\4\27\1\uffff\7\27\1\u0088\5\27\1\u008f\2\27\1\uffff\2\27\2\uffff"+
        "\2\27\1\uffff\2\27\1\uffff\1\u009b\1\u009c\1\27\1\u009e\5\27\1\u00a6"+
        "\1\27\1\uffff\1\u00a9\5\27\1\uffff\3\27\2\uffff\3\27\1\u00b6\1\u00b7"+
        "\1\27\2\uffff\1\27\1\uffff\7\27\1\uffff\2\27\1\uffff\1\u00c3\1\u00c4"+
        "\1\u00c5\2\27\1\u00c9\1\u00ca\1\27\1\u00cc\1\u00cd\1\u00ce\1\u00cf"+
        "\2\uffff\1\27\1\u00d1\1\u00d2\1\u00d3\3\27\1\u00d7\1\u00d8\1\u00d9"+
        "\1\u00da\3\uffff\3\27\2\uffff\1\27\4\uffff\1\27\3\uffff\1\27\1\u00e1"+
        "\1\u00e2\4\uffff\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8"+
        "\10\uffff";
    static final String DFA19_eofS =
        "\u00e9\uffff";
    static final String DFA19_minS =
        "\1\11\1\151\1\145\1\156\1\155\1\145\1\141\1\145\1\151\1\157\1\146"+
        "\1\141\1\151\7\uffff\1\160\1\60\1\52\1\uffff\2\56\3\uffff\1\156"+
        "\1\157\1\164\1\146\2\165\1\160\1\144\1\163\1\164\1\155\1\160\1\157"+
        "\1\170\1\156\1\157\1\162\1\156\1\151\1\170\1\145\1\156\1\164\3\uffff"+
        "\1\0\1\uffff\1\144\1\154\1\145\1\141\1\142\1\155\1\157\1\151\1\60"+
        "\1\163\1\141\2\145\1\165\1\141\1\145\1\147\1\162\1\151\1\164\1\170"+
        "\1\157\1\163\1\164\1\151\1\0\1\uffff\1\151\2\60\1\165\1\154\1\60"+
        "\1\162\1\143\1\60\1\66\1\62\1\147\1\64\1\uffff\1\141\1\142\1\163"+
        "\1\141\1\151\1\164\1\144\1\60\1\164\1\156\1\63\1\145\1\156\1\60"+
        "\1\63\1\157\1\0\1\156\1\141\2\uffff\1\154\1\145\1\uffff\1\164\1"+
        "\141\1\uffff\2\60\1\145\1\60\1\147\1\154\1\160\1\164\1\162\1\60"+
        "\1\63\1\uffff\1\60\1\147\1\62\1\64\1\144\1\157\1\uffff\1\62\1\64"+
        "\1\156\2\0\1\147\1\156\1\164\2\60\1\164\2\uffff\1\162\1\uffff\2"+
        "\145\1\141\2\145\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\60\1\63\1"+
        "\155\2\60\1\141\1\0\3\60\2\uffff\1\157\3\60\1\143\2\144\4\60\3\uffff"+
        "\1\62\1\64\1\171\2\uffff\1\154\4\uffff\1\162\3\uffff\1\145\2\60"+
        "\4\uffff\6\60\10\uffff";
    static final String DFA19_maxS =
        "\1\175\1\171\1\157\2\156\1\165\1\141\1\145\1\154\1\157\1\164\1\141"+
        "\1\163\7\uffff\1\160\1\71\1\57\1\uffff\2\71\3\uffff\1\156\1\157"+
        "\1\164\1\146\2\165\1\160\1\164\1\163\1\164\1\155\1\161\1\157\1\170"+
        "\1\156\1\157\1\162\1\156\1\151\1\170\1\145\1\156\1\164\3\uffff\1"+
        "\uffff\1\uffff\1\144\1\154\1\145\1\141\1\142\1\155\1\157\1\151\1"+
        "\172\1\163\1\141\2\145\1\165\1\141\1\145\1\147\1\162\1\151\1\164"+
        "\1\170\1\157\1\163\1\164\1\151\1\uffff\1\uffff\1\151\2\172\1\165"+
        "\1\154\1\172\1\162\1\143\1\172\1\66\1\62\1\147\1\64\1\uffff\1\141"+
        "\1\142\1\163\1\141\1\151\1\164\1\144\1\172\1\164\1\156\1\66\1\145"+
        "\1\156\1\172\1\66\1\157\1\uffff\1\156\1\141\2\uffff\1\154\1\145"+
        "\1\uffff\1\164\1\141\1\uffff\2\172\1\145\1\172\1\147\1\154\1\160"+
        "\1\164\1\162\1\172\1\66\1\uffff\1\172\1\147\1\62\1\64\1\144\1\157"+
        "\1\uffff\1\62\1\64\1\156\2\uffff\1\147\1\156\1\164\2\172\1\164\2"+
        "\uffff\1\162\1\uffff\2\145\1\141\2\145\1\62\1\64\1\uffff\1\62\1"+
        "\64\1\uffff\3\172\1\66\1\155\2\172\1\141\1\uffff\3\172\2\uffff\1"+
        "\157\3\172\1\143\2\144\4\172\3\uffff\1\62\1\64\1\171\2\uffff\1\154"+
        "\4\uffff\1\162\3\uffff\1\145\2\172\4\uffff\6\172\10\uffff";
    static final String DFA19_acceptS =
        "\15\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\3\uffff\1\60\2\uffff"+
        "\1\64\1\65\1\66\27\uffff\1\55\1\62\1\56\1\uffff\1\61\32\uffff\1"+
        "\63\15\uffff\1\17\23\uffff\1\12\1\13\2\uffff\1\3\2\uffff\1\36\13"+
        "\uffff\1\20\6\uffff\1\24\13\uffff\1\37\1\40\1\uffff\1\46\7\uffff"+
        "\1\15\2\uffff\1\21\14\uffff\1\14\1\4\13\uffff\1\22\1\42\1\50\3\uffff"+
        "\1\41\1\47\1\uffff\1\57\1\1\1\35\1\2\1\uffff\1\45\1\5\1\6\3\uffff"+
        "\1\53\1\54\1\43\1\51\6\uffff\1\10\1\11\1\44\1\52\1\23\1\34\1\16"+
        "\1\7";
    static final String DFA19_specialS =
        "\67\uffff\1\1\32\uffff\1\2\37\uffff\1\3\40\uffff\1\0\1\5\35\uffff"+
        "\1\4\66\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\uffff\1\33\10\uffff\1\30"+
            "\1\23\1\30\1\25\1\26\12\31\1\uffff\1\17\1\32\1\20\3\uffff\32"+
            "\27\1\21\1\uffff\1\22\1\uffff\1\27\1\uffff\1\27\1\1\1\27\1\2"+
            "\1\3\1\10\2\27\1\4\2\27\1\11\1\5\1\6\1\24\2\27\1\7\1\12\1\13"+
            "\1\14\5\27\1\15\1\uffff\1\16",
            "\1\35\5\uffff\1\36\11\uffff\1\37",
            "\1\40\11\uffff\1\41",
            "\1\42",
            "\1\43\1\44",
            "\1\45\17\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\52\2\uffff\1\51",
            "\1\53",
            "\1\57\1\uffff\1\54\1\56\12\uffff\1\55",
            "\1\60",
            "\1\62\11\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\12\65",
            "\1\67\4\uffff\1\66",
            "",
            "\1\65\1\uffff\12\31",
            "\1\65\1\uffff\12\31",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\17\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "\52\123\1\122\uffd5\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\27\1\135\1\27\1\136\2\27\1\140\1\27\1\134\1\27\7\uffff\32"+
            "\27\4\uffff\1\27\1\uffff\4\27\1\137\25\27",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
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
            "\11\123\2\162\2\123\1\162\22\123\1\162\uffdf\123",
            "",
            "\1\163",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\164\25\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\167",
            "\1\170",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\172",
            "\1\173",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\2\uffff\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0090\2\uffff\1\u0091",
            "\1\u0092",
            "\52\u0094\1\u0093\uffd5\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009d",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\3\27\1\u00a4\2\27\1\u00a5\3\27\7\uffff\32\27\4\uffff\1\27\1"+
            "\uffff\32\27",
            "\1\u00a7\2\uffff\1\u00a8",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\52\u0094\1\u0093\4\u0094\1\u00b2\uffd0\u0094",
            "\52\u0094\1\u0093\uffd5\u0094",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c6\2\uffff\1\u00c7",
            "\1\u00c8",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00cb",
            "\52\u0094\1\u0093\uffd5\u0094",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\u00d0",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "",
            "\1\u00de",
            "",
            "",
            "",
            "",
            "\1\u00df",
            "",
            "",
            "",
            "\1\u00e0",
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
            return "1:1: Tokens : ( BINDING | DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | COMMENT | DOC_COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | ML_STRING | STRING | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_147 = input.LA(1);

                        s = -1;
                        if ( (LA19_147=='/') ) {s = 178;}

                        else if ( (LA19_147=='*') ) {s = 147;}

                        else if ( ((LA19_147>='\u0000' && LA19_147<=')')||(LA19_147>='+' && LA19_147<='.')||(LA19_147>='0' && LA19_147<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_55 = input.LA(1);

                        s = -1;
                        if ( (LA19_55=='*') ) {s = 82;}

                        else if ( ((LA19_55>='\u0000' && LA19_55<=')')||(LA19_55>='+' && LA19_55<='\uFFFF')) ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_82 = input.LA(1);

                        s = -1;
                        if ( ((LA19_82>='\t' && LA19_82<='\n')||LA19_82=='\r'||LA19_82==' ') ) {s = 114;}

                        else if ( ((LA19_82>='\u0000' && LA19_82<='\b')||(LA19_82>='\u000B' && LA19_82<='\f')||(LA19_82>='\u000E' && LA19_82<='\u001F')||(LA19_82>='!' && LA19_82<='\uFFFF')) ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_114 = input.LA(1);

                        s = -1;
                        if ( (LA19_114=='*') ) {s = 147;}

                        else if ( ((LA19_114>='\u0000' && LA19_114<=')')||(LA19_114>='+' && LA19_114<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_178 = input.LA(1);

                        s = -1;
                        if ( (LA19_178=='*') ) {s = 147;}

                        else if ( ((LA19_178>='\u0000' && LA19_178<=')')||(LA19_178>='+' && LA19_178<='\uFFFF')) ) {s = 148;}

                        else s = 204;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_148 = input.LA(1);

                        s = -1;
                        if ( (LA19_148=='*') ) {s = 147;}

                        else if ( ((LA19_148>='\u0000' && LA19_148<=')')||(LA19_148>='+' && LA19_148<='\uFFFF')) ) {s = 148;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}