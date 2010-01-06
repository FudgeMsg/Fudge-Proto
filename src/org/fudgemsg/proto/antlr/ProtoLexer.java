// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-06 16:08:30

  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ProtoLexer extends Lexer {
    public static final int T_STRING=26;
    public static final int T_BOOL=18;
    public static final int T_DOUBLE=20;
    public static final int FLOAT=33;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_LONG=24;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T_INDICATOR=22;
    public static final int ML_COMMENT=34;
    public static final int T__57=57;
    public static final int IMPORT=10;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=31;
    public static final int TAXONOMY=27;
    public static final int T__59=59;
    public static final int T_INT=23;
    public static final int DOC_COMMENT=30;
    public static final int MESSAGE=11;
    public static final int COMMENT=29;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=32;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=19;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=6;
    public static final int ORDINAL=14;
    public static final int DEFAULT=5;
    public static final int REPEATED=15;
    public static final int T_FLOAT=21;
    public static final int WHITESPACE=36;
    public static final int REQUIRED=16;
    public static final int ROOT=17;
    public static final int NAMESPACE=13;
    public static final int DIM_VARIANT=7;
    public static final int ENUM=8;
    public static final int T__37=37;
    public static final int USES=28;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int FIELD=9;
    public static final int T_SHORT=25;
    public static final int MUTABLE=12;
    public static final int STRING=35;

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

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:29:9: ( 'default' )
            // org/fudgemsg/proto/antlr/Proto.g:29:11: 'default'
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
            // org/fudgemsg/proto/antlr/Proto.g:30:6: ( 'enum' )
            // org/fudgemsg/proto/antlr/Proto.g:30:8: 'enum'
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
            // org/fudgemsg/proto/antlr/Proto.g:31:8: ( 'import' )
            // org/fudgemsg/proto/antlr/Proto.g:31:10: 'import'
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
            // org/fudgemsg/proto/antlr/Proto.g:32:9: ( 'message' )
            // org/fudgemsg/proto/antlr/Proto.g:32:11: 'message'
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
            // org/fudgemsg/proto/antlr/Proto.g:33:9: ( 'mutable' )
            // org/fudgemsg/proto/antlr/Proto.g:33:11: 'mutable'
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
            // org/fudgemsg/proto/antlr/Proto.g:34:11: ( 'namespace' )
            // org/fudgemsg/proto/antlr/Proto.g:34:13: 'namespace'
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
            // org/fudgemsg/proto/antlr/Proto.g:35:10: ( 'repeated' )
            // org/fudgemsg/proto/antlr/Proto.g:35:12: 'repeated'
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
            // org/fudgemsg/proto/antlr/Proto.g:36:10: ( 'required' )
            // org/fudgemsg/proto/antlr/Proto.g:36:12: 'required'
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
            // org/fudgemsg/proto/antlr/Proto.g:37:8: ( 'bool' )
            // org/fudgemsg/proto/antlr/Proto.g:37:10: 'bool'
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
            // org/fudgemsg/proto/antlr/Proto.g:38:8: ( 'byte' )
            // org/fudgemsg/proto/antlr/Proto.g:38:10: 'byte'
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
            // org/fudgemsg/proto/antlr/Proto.g:39:10: ( 'double' )
            // org/fudgemsg/proto/antlr/Proto.g:39:12: 'double'
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
            // org/fudgemsg/proto/antlr/Proto.g:40:9: ( 'float' )
            // org/fudgemsg/proto/antlr/Proto.g:40:11: 'float'
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
            // org/fudgemsg/proto/antlr/Proto.g:41:13: ( 'indicator' )
            // org/fudgemsg/proto/antlr/Proto.g:41:15: 'indicator'
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
            // org/fudgemsg/proto/antlr/Proto.g:42:7: ( 'int' )
            // org/fudgemsg/proto/antlr/Proto.g:42:9: 'int'
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
            // org/fudgemsg/proto/antlr/Proto.g:43:8: ( 'long' )
            // org/fudgemsg/proto/antlr/Proto.g:43:10: 'long'
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
            // org/fudgemsg/proto/antlr/Proto.g:44:9: ( 'short' )
            // org/fudgemsg/proto/antlr/Proto.g:44:11: 'short'
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
            // org/fudgemsg/proto/antlr/Proto.g:45:10: ( 'string' )
            // org/fudgemsg/proto/antlr/Proto.g:45:12: 'string'
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
            // org/fudgemsg/proto/antlr/Proto.g:46:10: ( 'taxonomy' )
            // org/fudgemsg/proto/antlr/Proto.g:46:12: 'taxonomy'
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
            // org/fudgemsg/proto/antlr/Proto.g:47:6: ( 'uses' )
            // org/fudgemsg/proto/antlr/Proto.g:47:8: 'uses'
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

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:48:7: ( '=' )
            // org/fudgemsg/proto/antlr/Proto.g:48:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:49:7: ( '[' )
            // org/fudgemsg/proto/antlr/Proto.g:49:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:50:7: ( ']' )
            // org/fudgemsg/proto/antlr/Proto.g:50:9: ']'
            {
            match(']'); 

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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:52:7: ( ',' )
            // org/fudgemsg/proto/antlr/Proto.g:52:9: ','
            {
            match(','); 

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
            // org/fudgemsg/proto/antlr/Proto.g:53:7: ( 'optional' )
            // org/fudgemsg/proto/antlr/Proto.g:53:9: 'optional'
            {
            match("optional"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:54:7: ( 'boolean' )
            // org/fudgemsg/proto/antlr/Proto.g:54:9: 'boolean'
            {
            match("boolean"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:55:7: ( 'int8' )
            // org/fudgemsg/proto/antlr/Proto.g:55:9: 'int8'
            {
            match("int8"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:56:7: ( 'int16' )
            // org/fudgemsg/proto/antlr/Proto.g:56:9: 'int16'
            {
            match("int16"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:57:7: ( 'int32' )
            // org/fudgemsg/proto/antlr/Proto.g:57:9: 'int32'
            {
            match("int32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:58:7: ( 'uint32' )
            // org/fudgemsg/proto/antlr/Proto.g:58:9: 'uint32'
            {
            match("uint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:59:7: ( 'sint32' )
            // org/fudgemsg/proto/antlr/Proto.g:59:9: 'sint32'
            {
            match("sint32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:60:7: ( 'fixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:60:9: 'fixed32'
            {
            match("fixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:61:7: ( 'sfixed32' )
            // org/fudgemsg/proto/antlr/Proto.g:61:9: 'sfixed32'
            {
            match("sfixed32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:62:7: ( 'integer' )
            // org/fudgemsg/proto/antlr/Proto.g:62:9: 'integer'
            {
            match("integer"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:63:7: ( 'int64' )
            // org/fudgemsg/proto/antlr/Proto.g:63:9: 'int64'
            {
            match("int64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:64:7: ( 'uint64' )
            // org/fudgemsg/proto/antlr/Proto.g:64:9: 'uint64'
            {
            match("uint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:65:7: ( 'sint64' )
            // org/fudgemsg/proto/antlr/Proto.g:65:9: 'sint64'
            {
            match("sint64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:66:7: ( 'fixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:66:9: 'fixed64'
            {
            match("fixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:67:7: ( 'sfixed64' )
            // org/fudgemsg/proto/antlr/Proto.g:67:9: 'sfixed64'
            {
            match("sfixed64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:68:7: ( 'float32' )
            // org/fudgemsg/proto/antlr/Proto.g:68:9: 'float32'
            {
            match("float32"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:69:7: ( 'float64' )
            // org/fudgemsg/proto/antlr/Proto.g:69:9: 'float64'
            {
            match("float64"); 


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
            // org/fudgemsg/proto/antlr/Proto.g:70:7: ( '.' )
            // org/fudgemsg/proto/antlr/Proto.g:70:9: '.'
            {
            match('.'); 

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
            // org/fudgemsg/proto/antlr/Proto.g:71:7: ( '{' )
            // org/fudgemsg/proto/antlr/Proto.g:71:9: '{'
            {
            match('{'); 

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
            // org/fudgemsg/proto/antlr/Proto.g:72:7: ( '}' )
            // org/fudgemsg/proto/antlr/Proto.g:72:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:103:9: ( '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' ) )
            // org/fudgemsg/proto/antlr/Proto.g:103:11: '//' ( options {greedy=false; } : . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // org/fudgemsg/proto/antlr/Proto.g:103:16: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:103:48: .
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
            // org/fudgemsg/proto/antlr/Proto.g:104:13: ( '/**' ( ' ' | '\\t' | '\\r' | '\\n' ) ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:104:15: '/**' ( ' ' | '\\t' | '\\r' | '\\n' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:104:42: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:104:74: .
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
            // org/fudgemsg/proto/antlr/Proto.g:105:12: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // org/fudgemsg/proto/antlr/Proto.g:105:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // org/fudgemsg/proto/antlr/Proto.g:105:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // org/fudgemsg/proto/antlr/Proto.g:106:9: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:106:11: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:106:11: ( '+' | '-' )?
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

            // org/fudgemsg/proto/antlr/Proto.g:106:22: ( '0' .. '9' )+
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
            	    // org/fudgemsg/proto/antlr/Proto.g:106:22: '0' .. '9'
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
            // org/fudgemsg/proto/antlr/Proto.g:107:7: ( ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )? )
            // org/fudgemsg/proto/antlr/Proto.g:107:9: ( '+' | '-' )? ( '0' .. '9' )* '.' ( '0' .. '9' )+ ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            {
            // org/fudgemsg/proto/antlr/Proto.g:107:9: ( '+' | '-' )?
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

            // org/fudgemsg/proto/antlr/Proto.g:107:20: ( '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:107:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('.'); 
            // org/fudgemsg/proto/antlr/Proto.g:107:36: ( '0' .. '9' )+
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
            	    // org/fudgemsg/proto/antlr/Proto.g:107:37: '0' .. '9'
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

            // org/fudgemsg/proto/antlr/Proto.g:107:48: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:107:50: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // org/fudgemsg/proto/antlr/Proto.g:107:60: ( '+' | '-' )?
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

                    // org/fudgemsg/proto/antlr/Proto.g:107:71: ( '0' .. '9' )+
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
                    	    // org/fudgemsg/proto/antlr/Proto.g:107:72: '0' .. '9'
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
            // org/fudgemsg/proto/antlr/Proto.g:108:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // org/fudgemsg/proto/antlr/Proto.g:108:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // org/fudgemsg/proto/antlr/Proto.g:108:19: ( options {greedy=false; } : . )*
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
            	    // org/fudgemsg/proto/antlr/Proto.g:108:51: .
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/fudgemsg/proto/antlr/Proto.g:109:8: ( '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"' )
            // org/fudgemsg/proto/antlr/Proto.g:109:10: '\"' ( options {greedy=false; } : ( '\\\\' . | . ) )* '\"'
            {
            match('\"'); 
            // org/fudgemsg/proto/antlr/Proto.g:109:14: ( options {greedy=false; } : ( '\\\\' . | . ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\"') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:109:46: ( '\\\\' . | . )
            	    {
            	    // org/fudgemsg/proto/antlr/Proto.g:109:46: ( '\\\\' . | . )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='\\') ) {
            	        int LA13_1 = input.LA(2);

            	        if ( (LA13_1=='\"') ) {
            	            alt13=1;
            	        }
            	        else if ( (LA13_1=='\\') ) {
            	            alt13=1;
            	        }
            	        else if ( ((LA13_1>='\u0000' && LA13_1<='!')||(LA13_1>='#' && LA13_1<='[')||(LA13_1>=']' && LA13_1<='\uFFFF')) ) {
            	            alt13=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 13, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA13_0>='\u0000' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:109:47: '\\\\' .
            	            {
            	            match('\\'); 
            	            matchAny(); 

            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:109:53: .
            	            {
            	            matchAny(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
            // org/fudgemsg/proto/antlr/Proto.g:110:12: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // org/fudgemsg/proto/antlr/Proto.g:110:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // org/fudgemsg/proto/antlr/Proto.g:110:14: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
        // org/fudgemsg/proto/antlr/Proto.g:1:8: ( DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | COMMENT | DOC_COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | STRING | WHITESPACE )
        int alt16=52;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // org/fudgemsg/proto/antlr/Proto.g:1:10: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 2 :
                // org/fudgemsg/proto/antlr/Proto.g:1:18: ENUM
                {
                mENUM(); 

                }
                break;
            case 3 :
                // org/fudgemsg/proto/antlr/Proto.g:1:23: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 4 :
                // org/fudgemsg/proto/antlr/Proto.g:1:30: MESSAGE
                {
                mMESSAGE(); 

                }
                break;
            case 5 :
                // org/fudgemsg/proto/antlr/Proto.g:1:38: MUTABLE
                {
                mMUTABLE(); 

                }
                break;
            case 6 :
                // org/fudgemsg/proto/antlr/Proto.g:1:46: NAMESPACE
                {
                mNAMESPACE(); 

                }
                break;
            case 7 :
                // org/fudgemsg/proto/antlr/Proto.g:1:56: REPEATED
                {
                mREPEATED(); 

                }
                break;
            case 8 :
                // org/fudgemsg/proto/antlr/Proto.g:1:65: REQUIRED
                {
                mREQUIRED(); 

                }
                break;
            case 9 :
                // org/fudgemsg/proto/antlr/Proto.g:1:74: T_BOOL
                {
                mT_BOOL(); 

                }
                break;
            case 10 :
                // org/fudgemsg/proto/antlr/Proto.g:1:81: T_BYTE
                {
                mT_BYTE(); 

                }
                break;
            case 11 :
                // org/fudgemsg/proto/antlr/Proto.g:1:88: T_DOUBLE
                {
                mT_DOUBLE(); 

                }
                break;
            case 12 :
                // org/fudgemsg/proto/antlr/Proto.g:1:97: T_FLOAT
                {
                mT_FLOAT(); 

                }
                break;
            case 13 :
                // org/fudgemsg/proto/antlr/Proto.g:1:105: T_INDICATOR
                {
                mT_INDICATOR(); 

                }
                break;
            case 14 :
                // org/fudgemsg/proto/antlr/Proto.g:1:117: T_INT
                {
                mT_INT(); 

                }
                break;
            case 15 :
                // org/fudgemsg/proto/antlr/Proto.g:1:123: T_LONG
                {
                mT_LONG(); 

                }
                break;
            case 16 :
                // org/fudgemsg/proto/antlr/Proto.g:1:130: T_SHORT
                {
                mT_SHORT(); 

                }
                break;
            case 17 :
                // org/fudgemsg/proto/antlr/Proto.g:1:138: T_STRING
                {
                mT_STRING(); 

                }
                break;
            case 18 :
                // org/fudgemsg/proto/antlr/Proto.g:1:147: TAXONOMY
                {
                mTAXONOMY(); 

                }
                break;
            case 19 :
                // org/fudgemsg/proto/antlr/Proto.g:1:156: USES
                {
                mUSES(); 

                }
                break;
            case 20 :
                // org/fudgemsg/proto/antlr/Proto.g:1:161: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // org/fudgemsg/proto/antlr/Proto.g:1:167: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // org/fudgemsg/proto/antlr/Proto.g:1:173: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // org/fudgemsg/proto/antlr/Proto.g:1:179: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // org/fudgemsg/proto/antlr/Proto.g:1:185: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // org/fudgemsg/proto/antlr/Proto.g:1:191: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // org/fudgemsg/proto/antlr/Proto.g:1:197: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // org/fudgemsg/proto/antlr/Proto.g:1:203: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // org/fudgemsg/proto/antlr/Proto.g:1:209: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // org/fudgemsg/proto/antlr/Proto.g:1:215: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // org/fudgemsg/proto/antlr/Proto.g:1:221: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // org/fudgemsg/proto/antlr/Proto.g:1:227: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // org/fudgemsg/proto/antlr/Proto.g:1:233: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // org/fudgemsg/proto/antlr/Proto.g:1:239: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // org/fudgemsg/proto/antlr/Proto.g:1:245: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // org/fudgemsg/proto/antlr/Proto.g:1:251: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // org/fudgemsg/proto/antlr/Proto.g:1:257: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // org/fudgemsg/proto/antlr/Proto.g:1:263: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // org/fudgemsg/proto/antlr/Proto.g:1:269: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // org/fudgemsg/proto/antlr/Proto.g:1:275: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // org/fudgemsg/proto/antlr/Proto.g:1:281: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // org/fudgemsg/proto/antlr/Proto.g:1:287: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // org/fudgemsg/proto/antlr/Proto.g:1:293: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // org/fudgemsg/proto/antlr/Proto.g:1:299: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // org/fudgemsg/proto/antlr/Proto.g:1:305: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // org/fudgemsg/proto/antlr/Proto.g:1:311: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 46 :
                // org/fudgemsg/proto/antlr/Proto.g:1:319: DOC_COMMENT
                {
                mDOC_COMMENT(); 

                }
                break;
            case 47 :
                // org/fudgemsg/proto/antlr/Proto.g:1:331: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 48 :
                // org/fudgemsg/proto/antlr/Proto.g:1:342: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 49 :
                // org/fudgemsg/proto/antlr/Proto.g:1:350: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 50 :
                // org/fudgemsg/proto/antlr/Proto.g:1:356: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 51 :
                // org/fudgemsg/proto/antlr/Proto.g:1:367: STRING
                {
                mSTRING(); 

                }
                break;
            case 52 :
                // org/fudgemsg/proto/antlr/Proto.g:1:374: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\14\27\5\uffff\1\27\1\63\5\uffff\1\66\2\uffff\26\27\5\uffff"+
        "\5\27\1\133\22\27\2\uffff\2\27\1\161\2\27\1\164\4\27\1\uffff\5\27"+
        "\1\177\1\u0080\2\27\1\u0083\5\27\1\u008a\2\27\1\uffff\2\27\1\uffff"+
        "\2\27\1\uffff\1\u0094\1\u0095\1\27\1\u0097\6\27\2\uffff\1\u00a0"+
        "\1\27\1\uffff\1\u00a3\5\27\1\uffff\3\27\2\uffff\1\27\1\u00ae\1\u00af"+
        "\1\27\2\uffff\1\27\1\uffff\10\27\1\uffff\2\27\1\uffff\1\u00bc\1"+
        "\u00bd\1\u00be\2\27\1\u00c2\1\u00c3\1\27\1\u00c5\1\u00c6\2\uffff"+
        "\1\27\1\u00c8\1\u00c9\1\u00ca\3\27\1\u00ce\1\u00cf\1\u00d0\1\u00d1"+
        "\1\u00d2\3\uffff\3\27\2\uffff\1\27\2\uffff\1\27\3\uffff\1\27\1\u00d9"+
        "\1\u00da\5\uffff\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0"+
        "\10\uffff";
    static final String DFA16_eofS =
        "\u00e1\uffff";
    static final String DFA16_minS =
        "\1\11\1\145\1\156\1\155\1\145\1\141\1\145\1\157\1\151\1\157\1\146"+
        "\1\141\1\151\5\uffff\1\160\1\60\2\uffff\1\52\1\uffff\2\56\2\uffff"+
        "\1\146\2\165\1\160\1\144\1\163\1\164\1\155\1\160\1\157\1\164\1\157"+
        "\1\170\1\156\1\157\1\162\1\156\1\151\1\170\1\145\1\156\1\164\3\uffff"+
        "\1\0\1\uffff\1\141\1\142\1\155\1\157\1\151\1\60\1\163\1\141\2\145"+
        "\1\165\1\154\1\145\1\141\1\145\1\147\1\162\1\151\1\164\1\170\1\157"+
        "\1\163\1\164\1\151\1\0\1\uffff\1\165\1\154\1\60\1\162\1\143\1\60"+
        "\1\66\1\62\1\147\1\64\1\uffff\1\141\1\142\1\163\1\141\1\151\2\60"+
        "\1\164\1\144\1\60\1\164\1\156\1\63\1\145\1\156\1\60\1\63\1\157\1"+
        "\0\1\154\1\145\1\uffff\1\164\1\141\1\uffff\2\60\1\145\1\60\1\147"+
        "\1\154\1\160\1\164\1\162\1\141\2\uffff\1\60\1\63\1\uffff\1\60\1"+
        "\147\1\62\1\64\1\144\1\157\1\uffff\1\62\1\64\1\156\2\0\1\164\2\60"+
        "\1\164\2\uffff\1\162\1\uffff\2\145\1\141\2\145\1\156\1\62\1\64\1"+
        "\uffff\1\62\1\64\1\uffff\3\60\1\63\1\155\2\60\1\141\1\0\1\60\2\uffff"+
        "\1\157\3\60\1\143\2\144\5\60\3\uffff\1\62\1\64\1\171\2\uffff\1\154"+
        "\2\uffff\1\162\3\uffff\1\145\2\60\5\uffff\6\60\10\uffff";
    static final String DFA16_maxS =
        "\1\175\1\157\2\156\1\165\1\141\1\145\1\171\1\154\1\157\1\164\1\141"+
        "\1\163\5\uffff\1\160\1\71\2\uffff\1\57\1\uffff\2\71\2\uffff\1\146"+
        "\2\165\1\160\1\164\1\163\1\164\1\155\1\161\1\157\1\164\1\157\1\170"+
        "\1\156\1\157\1\162\1\156\1\151\1\170\1\145\1\156\1\164\3\uffff\1"+
        "\uffff\1\uffff\1\141\1\142\1\155\1\157\1\151\1\172\1\163\1\141\2"+
        "\145\1\165\1\154\1\145\1\141\1\145\1\147\1\162\1\151\1\164\1\170"+
        "\1\157\1\163\1\164\1\151\1\uffff\1\uffff\1\165\1\154\1\172\1\162"+
        "\1\143\1\172\1\66\1\62\1\147\1\64\1\uffff\1\141\1\142\1\163\1\141"+
        "\1\151\2\172\1\164\1\144\1\172\1\164\1\156\1\66\1\145\1\156\1\172"+
        "\1\66\1\157\1\uffff\1\154\1\145\1\uffff\1\164\1\141\1\uffff\2\172"+
        "\1\145\1\172\1\147\1\154\1\160\1\164\1\162\1\141\2\uffff\1\172\1"+
        "\66\1\uffff\1\172\1\147\1\62\1\64\1\144\1\157\1\uffff\1\62\1\64"+
        "\1\156\2\uffff\1\164\2\172\1\164\2\uffff\1\162\1\uffff\2\145\1\141"+
        "\2\145\1\156\1\62\1\64\1\uffff\1\62\1\64\1\uffff\3\172\1\66\1\155"+
        "\2\172\1\141\1\uffff\1\172\2\uffff\1\157\3\172\1\143\2\144\5\172"+
        "\3\uffff\1\62\1\64\1\171\2\uffff\1\154\2\uffff\1\162\3\uffff\1\145"+
        "\2\172\5\uffff\6\172\10\uffff";
    static final String DFA16_acceptS =
        "\15\uffff\1\24\1\25\1\26\1\27\1\30\2\uffff\1\53\1\54\1\uffff\1\57"+
        "\2\uffff\1\63\1\64\26\uffff\1\61\1\52\1\55\1\uffff\1\60\31\uffff"+
        "\1\62\12\uffff\1\16\25\uffff\1\2\2\uffff\1\33\12\uffff\1\11\1\12"+
        "\2\uffff\1\17\6\uffff\1\23\11\uffff\1\34\1\35\1\uffff\1\43\10\uffff"+
        "\1\14\2\uffff\1\20\12\uffff\1\13\1\3\14\uffff\1\21\1\37\1\45\3\uffff"+
        "\1\36\1\44\1\uffff\1\56\1\1\1\uffff\1\42\1\4\1\5\3\uffff\1\32\1"+
        "\50\1\51\1\40\1\46\6\uffff\1\7\1\10\1\41\1\47\1\22\1\31\1\15\1\6";
    static final String DFA16_specialS =
        "\65\uffff\1\4\31\uffff\1\0\36\uffff\1\2\37\uffff\1\5\1\3\34\uffff"+
        "\1\1\64\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\uffff\1\32\10\uffff\1\30"+
            "\1\21\1\30\1\23\1\26\12\31\1\uffff\1\20\1\uffff\1\15\3\uffff"+
            "\32\27\1\16\1\uffff\1\17\1\uffff\1\27\1\uffff\1\27\1\7\1\27"+
            "\1\1\1\2\1\10\2\27\1\3\2\27\1\11\1\4\1\5\1\22\2\27\1\6\1\12"+
            "\1\13\1\14\5\27\1\24\1\uffff\1\25",
            "\1\34\11\uffff\1\35",
            "\1\36",
            "\1\37\1\40",
            "\1\41\17\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "\1\50\2\uffff\1\47",
            "\1\51",
            "\1\55\1\uffff\1\52\1\54\12\uffff\1\53",
            "\1\56",
            "\1\60\11\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\12\62",
            "",
            "",
            "\1\65\4\uffff\1\64",
            "",
            "\1\62\1\uffff\12\31",
            "\1\62\1\uffff\12\31",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\17\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "",
            "",
            "",
            "\52\120\1\117\uffd5\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\27\1\127\1\27\1\130\2\27\1\132\1\27\1\126\1\27\7\uffff\32"+
            "\27\4\uffff\1\27\1\uffff\4\27\1\131\25\27",
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
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\11\120\2\156\2\120\1\156\22\120\1\156\uffdf\120",
            "",
            "\1\157",
            "\1\160",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\162",
            "\1\163",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\4\27\1\176\25\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0081",
            "\1\u0082",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086\2\uffff\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u008b\2\uffff\1\u008c",
            "\1\u008d",
            "\52\u008f\1\u008e\uffd5\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0096",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\3\27\1\u009e\2\27\1\u009f\3\27\7\uffff\32\27\4\uffff\1\27\1"+
            "\uffff\32\27",
            "\1\u00a1\2\uffff\1\u00a2",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\52\u008f\1\u008e\4\u008f\1\u00ac\uffd0\u008f",
            "\52\u008f\1\u008e\uffd5\u008f",
            "\1\u00ad",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00bf\2\uffff\1\u00c0",
            "\1\u00c1",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c4",
            "\52\u008f\1\u008e\uffd5\u008f",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\u00c7",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "",
            "",
            "",
            "\1\u00d8",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | COMMENT | DOC_COMMENT | IDENTIFIER | INTEGER | FLOAT | ML_COMMENT | STRING | WHITESPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_79 = input.LA(1);

                        s = -1;
                        if ( ((LA16_79>='\t' && LA16_79<='\n')||LA16_79=='\r'||LA16_79==' ') ) {s = 110;}

                        else if ( ((LA16_79>='\u0000' && LA16_79<='\b')||(LA16_79>='\u000B' && LA16_79<='\f')||(LA16_79>='\u000E' && LA16_79<='\u001F')||(LA16_79>='!' && LA16_79<='\uFFFF')) ) {s = 80;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_172 = input.LA(1);

                        s = -1;
                        if ( (LA16_172=='*') ) {s = 142;}

                        else if ( ((LA16_172>='\u0000' && LA16_172<=')')||(LA16_172>='+' && LA16_172<='\uFFFF')) ) {s = 143;}

                        else s = 197;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_110 = input.LA(1);

                        s = -1;
                        if ( (LA16_110=='*') ) {s = 142;}

                        else if ( ((LA16_110>='\u0000' && LA16_110<=')')||(LA16_110>='+' && LA16_110<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_143 = input.LA(1);

                        s = -1;
                        if ( (LA16_143=='*') ) {s = 142;}

                        else if ( ((LA16_143>='\u0000' && LA16_143<=')')||(LA16_143>='+' && LA16_143<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_53 = input.LA(1);

                        s = -1;
                        if ( (LA16_53=='*') ) {s = 79;}

                        else if ( ((LA16_53>='\u0000' && LA16_53<=')')||(LA16_53>='+' && LA16_53<='\uFFFF')) ) {s = 80;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_142 = input.LA(1);

                        s = -1;
                        if ( (LA16_142=='/') ) {s = 172;}

                        else if ( (LA16_142=='*') ) {s = 142;}

                        else if ( ((LA16_142>='\u0000' && LA16_142<=')')||(LA16_142>='+' && LA16_142<='.')||(LA16_142>='0' && LA16_142<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}