// $ANTLR 3.2 Fedora release 12 (Constantine) Thu Mar 11 20:28:57 UTC 2010 org/fudgemsg/proto/antlr/Proto.g 2010-07-14 16:50:30

  package org.fudgemsg.proto.antlr;
  import org.fudgemsg.proto.Compiler;
  import org.fudgemsg.proto.CodePosition;
  import org.fudgemsg.proto.Source;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ProtoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "EXTERN", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "OPTIONAL", "ORDINAL", "READONLY", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_DATE", "T_DATETIME", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "T_TIME", "TAXONOMY", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
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
    public static final int T_DOUBLE=26;
    public static final int EXTERN=12;
    public static final int FLOAT=41;
    public static final int ABSTRACT=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int T__49=49;
    public static final int DIM_FIXED=8;
    public static final int DEFAULT=7;
    public static final int ORDINAL=19;
    public static final int T_FLOAT=29;
    public static final int REPEATED=21;
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
    public static final int T_SHORT=33;
    public static final int EXTENDS=11;
    public static final int MUTABLE=16;
    public static final int STRING=44;

    // delegates
    // delegators


        public ProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ProtoParser.tokenNames; }
    public String getGrammarFileName() { return "org/fudgemsg/proto/antlr/Proto.g"; }


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


    public static class anyword_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anyword"
    // org/fudgemsg/proto/antlr/Proto.g:122:1: anyword : ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES );
    public final ProtoParser.anyword_return anyword() throws RecognitionException {
        ProtoParser.anyword_return retval = new ProtoParser.anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set1=null;

        ProtoTree set1_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:123:3: ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( input.LA(1)==ABSTRACT||(input.LA(1)>=BINDING && input.LA(1)<=DEFAULT)||(input.LA(1)>=ENUM && input.LA(1)<=EXTERN)||(input.LA(1)>=IMPORT && input.LA(1)<=OPTIONAL)||(input.LA(1)>=READONLY && input.LA(1)<=REQUIRED)||(input.LA(1)>=T_BOOL && input.LA(1)<=USES) ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set1));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "anyword"

    public static class binding_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding"
    // org/fudgemsg/proto/antlr/Proto.g:153:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
    public final ProtoParser.binding_return binding() throws RecognitionException {
        ProtoParser.binding_return retval = new ProtoParser.binding_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token BINDING2=null;
        Token char_literal4=null;
        Token char_literal6=null;
        ProtoParser.binding_anyword_return binding_anyword3 = null;

        ProtoParser.binding_element_return binding_element5 = null;


        ProtoTree BINDING2_tree=null;
        ProtoTree char_literal4_tree=null;
        ProtoTree char_literal6_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:153:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:153:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING2=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding860); 
            BINDING2_tree = (ProtoTree)adaptor.create(BINDING2);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING2_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding863);
            binding_anyword3=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword3.getTree());
            char_literal4=(Token)match(input,46,FOLLOW_46_in_binding865); 
            // org/fudgemsg/proto/antlr/Proto.g:153:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:153:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding868);
            	    binding_element5=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal6=(Token)match(input,47,FOLLOW_47_in_binding872); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding"

    public static class binding_anyword_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding_anyword"
    // org/fudgemsg/proto/antlr/Proto.g:155:1: binding_anyword : ( fullidentifier | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING8=null;
        ProtoParser.fullidentifier_return fullidentifier7 = null;


        ProtoTree STRING8_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:156:2: ( fullidentifier | STRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENTIFIER) ) {
                alt2=1;
            }
            else if ( (LA2_0==STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:156:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword883);
                    fullidentifier7=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier7.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:157:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword888); 
                    STRING8_tree = (ProtoTree)adaptor.create(STRING8);
                    adaptor.addChild(root_0, STRING8_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding_anyword"

    public static class binding_element_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding_element"
    // org/fudgemsg/proto/antlr/Proto.g:160:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword9 = null;

        ProtoParser.binding_text_return binding_text10 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:160:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:160:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element898);
            binding_anyword9=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword9.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element900);
            binding_text10=binding_text();

            state._fsp--;

            adaptor.addChild(root_0, binding_text10.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding_element"

    public static class binding_text_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding_text"
    // org/fudgemsg/proto/antlr/Proto.g:162:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
    public final ProtoParser.binding_text_return binding_text() throws RecognitionException {
        ProtoParser.binding_text_return retval = new ProtoParser.binding_text_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING11=null;
        Token char_literal12=null;
        Token ML_STRING13=null;
        Token char_literal15=null;
        ProtoParser.fullidentifier_return fullidentifier14 = null;


        ProtoTree STRING11_tree=null;
        ProtoTree char_literal12_tree=null;
        ProtoTree ML_STRING13_tree=null;
        ProtoTree char_literal15_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:163:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt3=1;
                }
                break;
            case ML_STRING:
                {
                alt3=2;
                }
                break;
            case IDENTIFIER:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:163:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text910); 
                    STRING11_tree = (ProtoTree)adaptor.create(STRING11);
                    adaptor.addChild(root_0, STRING11_tree);

                    char_literal12=(Token)match(input,48,FOLLOW_48_in_binding_text912); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:164:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING13=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text918); 
                    ML_STRING13_tree = (ProtoTree)adaptor.create(ML_STRING13);
                    adaptor.addChild(root_0, ML_STRING13_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:165:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text923);
                    fullidentifier14=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier14.getTree());
                    char_literal15=(Token)match(input,48,FOLLOW_48_in_binding_text925); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "binding_text"

    public static class constraint_default_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraint_default"
    // org/fudgemsg/proto/antlr/Proto.g:168:1: constraint_default : DEFAULT '=' literal ;
    public final ProtoParser.constraint_default_return constraint_default() throws RecognitionException {
        ProtoParser.constraint_default_return retval = new ProtoParser.constraint_default_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token DEFAULT16=null;
        Token char_literal17=null;
        ProtoParser.literal_return literal18 = null;


        ProtoTree DEFAULT16_tree=null;
        ProtoTree char_literal17_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:168:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:168:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT16=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default936); 
            DEFAULT16_tree = (ProtoTree)adaptor.create(DEFAULT16);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT16_tree, root_0);

            char_literal17=(Token)match(input,49,FOLLOW_49_in_constraint_default939); 
            pushFollow(FOLLOW_literal_in_constraint_default942);
            literal18=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal18.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constraint_default"

    public static class dimension_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dimension"
    // org/fudgemsg/proto/antlr/Proto.g:170:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
    public final ProtoParser.dimension_return dimension() throws RecognitionException {
        ProtoParser.dimension_return retval = new ProtoParser.dimension_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal19=null;
        Token INTEGER20=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Token char_literal23=null;

        ProtoTree char_literal19_tree=null;
        ProtoTree INTEGER20_tree=null;
        ProtoTree char_literal21_tree=null;
        ProtoTree char_literal22_tree=null;
        ProtoTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:171:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==51) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:171:4: '[' INTEGER ']'
                    {
                    char_literal19=(Token)match(input,50,FOLLOW_50_in_dimension952);  
                    stream_50.add(char_literal19);

                    INTEGER20=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension954);  
                    stream_INTEGER.add(INTEGER20);

                    char_literal21=(Token)match(input,51,FOLLOW_51_in_dimension956);  
                    stream_51.add(char_literal21);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 171:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:171:23: ^( DIM_FIXED INTEGER )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(DIM_FIXED, "DIM_FIXED"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:172:4: '[' ']'
                    {
                    char_literal22=(Token)match(input,50,FOLLOW_50_in_dimension969);  
                    stream_50.add(char_literal22);

                    char_literal23=(Token)match(input,51,FOLLOW_51_in_dimension971);  
                    stream_51.add(char_literal23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 172:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:172:15: ^( DIM_VARIANT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(DIM_VARIANT, "DIM_VARIANT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dimension"

    public static class enum_element_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_element"
    // org/fudgemsg/proto/antlr/Proto.g:175:1: enum_element : ( binding | IDENTIFIER ( enum_value )? ';' );
    public final ProtoParser.enum_element_return enum_element() throws RecognitionException {
        ProtoParser.enum_element_return retval = new ProtoParser.enum_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER25=null;
        Token char_literal27=null;
        ProtoParser.binding_return binding24 = null;

        ProtoParser.enum_value_return enum_value26 = null;


        ProtoTree IDENTIFIER25_tree=null;
        ProtoTree char_literal27_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:176:3: ( binding | IDENTIFIER ( enum_value )? ';' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==BINDING) ) {
                alt6=1;
            }
            else if ( (LA6_0==IDENTIFIER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:176:5: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_enum_element989);
                    binding24=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding24.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:177:5: IDENTIFIER ( enum_value )? ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element995); 
                    IDENTIFIER25_tree = (ProtoTree)adaptor.create(IDENTIFIER25);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER25_tree, root_0);

                    // org/fudgemsg/proto/antlr/Proto.g:177:17: ( enum_value )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==49) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:177:17: enum_value
                            {
                            pushFollow(FOLLOW_enum_value_in_enum_element998);
                            enum_value26=enum_value();

                            state._fsp--;

                            adaptor.addChild(root_0, enum_value26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,48,FOLLOW_48_in_enum_element1001); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_element"

    public static class enum_value_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enum_value"
    // org/fudgemsg/proto/antlr/Proto.g:180:1: enum_value : '=' ( INTEGER | STRING ) ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal28=null;
        Token set29=null;

        ProtoTree char_literal28_tree=null;
        ProtoTree set29_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:180:12: ( '=' ( INTEGER | STRING ) )
            // org/fudgemsg/proto/antlr/Proto.g:180:14: '=' ( INTEGER | STRING )
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal28=(Token)match(input,49,FOLLOW_49_in_enum_value1013); 
            set29=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set29));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enum_value"

    public static class field_constraint_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_constraint"
    // org/fudgemsg/proto/antlr/Proto.g:182:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default30 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:182:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:182:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint1031);
            constraint_default30=constraint_default();

            state._fsp--;

            adaptor.addChild(root_0, constraint_default30.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_constraint"

    public static class field_constraints_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_constraints"
    // org/fudgemsg/proto/antlr/Proto.g:184:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
    public final ProtoParser.field_constraints_return field_constraints() throws RecognitionException {
        ProtoParser.field_constraints_return retval = new ProtoParser.field_constraints_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        ProtoParser.field_constraint_return field_constraint32 = null;

        ProtoParser.field_constraint_return field_constraint34 = null;


        ProtoTree char_literal31_tree=null;
        ProtoTree char_literal33_tree=null;
        ProtoTree char_literal35_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:184:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:184:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal31=(Token)match(input,50,FOLLOW_50_in_field_constraints1040); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints1043);
            field_constraint32=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint32.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:184:43: ( ',' field_constraint )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==52) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:184:44: ',' field_constraint
            	    {
            	    char_literal33=(Token)match(input,52,FOLLOW_52_in_field_constraints1046); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints1049);
            	    field_constraint34=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal35=(Token)match(input,51,FOLLOW_51_in_field_constraints1053); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_constraints"

    public static class field_ordinal_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_ordinal"
    // org/fudgemsg/proto/antlr/Proto.g:186:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal36=null;
        Token INTEGER37=null;

        ProtoTree char_literal36_tree=null;
        ProtoTree INTEGER37_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:186:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:186:17: '=' INTEGER
            {
            char_literal36=(Token)match(input,49,FOLLOW_49_in_field_ordinal1063);  
            stream_49.add(char_literal36);

            INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal1065);  
            stream_INTEGER.add(INTEGER37);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 186:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:186:32: ^( ORDINAL INTEGER )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ORDINAL, "ORDINAL"), root_1);

                adaptor.addChild(root_1, stream_INTEGER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_ordinal"

    public static class field_modifier_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_modifier"
    // org/fudgemsg/proto/antlr/Proto.g:189:1: field_modifier : ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set38=null;

        ProtoTree set38_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:190:2: ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set38=(Token)input.LT(1);
            if ( input.LA(1)==MUTABLE||input.LA(1)==OPTIONAL||(input.LA(1)>=READONLY && input.LA(1)<=REQUIRED) ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set38));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_modifier"

    public static class field_arraytype_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_arraytype"
    // org/fudgemsg/proto/antlr/Proto.g:197:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype39 = null;

        ProtoParser.dimension_return dimension40 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:197:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:197:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype1114);
            field_basetype39=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype39.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:197:34: ( dimension )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==50) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:197:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype1116);
            	    dimension40=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension40.getTree());

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



            // AST REWRITE
            // elements: dimension, field_basetype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 197:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:197:48: ^( ARRAY field_basetype ( dimension )+ )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_field_basetype.nextTree());
                if ( !(stream_dimension.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_dimension.hasNext() ) {
                    adaptor.addChild(root_1, stream_dimension.nextTree());

                }
                stream_dimension.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_arraytype"

    public static class field_primtype_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_primtype"
    // org/fudgemsg/proto/antlr/Proto.g:199:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL41=null;
        Token string_literal42=null;
        Token T_BYTE43=null;
        Token string_literal44=null;
        Token T_DATE45=null;
        Token T_DATETIME46=null;
        Token T_SHORT47=null;
        Token string_literal48=null;
        Token T_INT49=null;
        Token string_literal50=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token T_LONG56=null;
        Token string_literal57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        Token T_FLOAT62=null;
        Token string_literal63=null;
        Token T_DOUBLE64=null;
        Token string_literal65=null;
        Token T_INDICATOR66=null;
        Token T_STRING67=null;
        Token T_TIME68=null;

        ProtoTree T_BOOL41_tree=null;
        ProtoTree string_literal42_tree=null;
        ProtoTree T_BYTE43_tree=null;
        ProtoTree string_literal44_tree=null;
        ProtoTree T_DATE45_tree=null;
        ProtoTree T_DATETIME46_tree=null;
        ProtoTree T_SHORT47_tree=null;
        ProtoTree string_literal48_tree=null;
        ProtoTree T_INT49_tree=null;
        ProtoTree string_literal50_tree=null;
        ProtoTree string_literal51_tree=null;
        ProtoTree string_literal52_tree=null;
        ProtoTree string_literal53_tree=null;
        ProtoTree string_literal54_tree=null;
        ProtoTree string_literal55_tree=null;
        ProtoTree T_LONG56_tree=null;
        ProtoTree string_literal57_tree=null;
        ProtoTree string_literal58_tree=null;
        ProtoTree string_literal59_tree=null;
        ProtoTree string_literal60_tree=null;
        ProtoTree string_literal61_tree=null;
        ProtoTree T_FLOAT62_tree=null;
        ProtoTree string_literal63_tree=null;
        ProtoTree T_DOUBLE64_tree=null;
        ProtoTree string_literal65_tree=null;
        ProtoTree T_INDICATOR66_tree=null;
        ProtoTree T_STRING67_tree=null;
        ProtoTree T_TIME68_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:200:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME )
            int alt9=28;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt9=1;
                }
                break;
            case 53:
                {
                alt9=2;
                }
                break;
            case T_BYTE:
                {
                alt9=3;
                }
                break;
            case 54:
                {
                alt9=4;
                }
                break;
            case T_DATE:
                {
                alt9=5;
                }
                break;
            case T_DATETIME:
                {
                alt9=6;
                }
                break;
            case T_SHORT:
                {
                alt9=7;
                }
                break;
            case 55:
                {
                alt9=8;
                }
                break;
            case T_INT:
                {
                alt9=9;
                }
                break;
            case 56:
                {
                alt9=10;
                }
                break;
            case 57:
                {
                alt9=11;
                }
                break;
            case 58:
                {
                alt9=12;
                }
                break;
            case 59:
                {
                alt9=13;
                }
                break;
            case 60:
                {
                alt9=14;
                }
                break;
            case 61:
                {
                alt9=15;
                }
                break;
            case T_LONG:
                {
                alt9=16;
                }
                break;
            case 62:
                {
                alt9=17;
                }
                break;
            case 63:
                {
                alt9=18;
                }
                break;
            case 64:
                {
                alt9=19;
                }
                break;
            case 65:
                {
                alt9=20;
                }
                break;
            case 66:
                {
                alt9=21;
                }
                break;
            case T_FLOAT:
                {
                alt9=22;
                }
                break;
            case 67:
                {
                alt9=23;
                }
                break;
            case T_DOUBLE:
                {
                alt9=24;
                }
                break;
            case 68:
                {
                alt9=25;
                }
                break;
            case T_INDICATOR:
                {
                alt9=26;
                }
                break;
            case T_STRING:
                {
                alt9=27;
                }
                break;
            case T_TIME:
                {
                alt9=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL41=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype1138); 
                    T_BOOL41_tree = (ProtoTree)adaptor.create(T_BOOL41);
                    adaptor.addChild(root_0, T_BOOL41_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: 'boolean'
                    {
                    string_literal42=(Token)match(input,53,FOLLOW_53_in_field_primtype1143);  
                    stream_53.add(string_literal42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 201:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:201:17: ^( T_BOOL )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_BOOL, "T_BOOL"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE43=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype1154); 
                    T_BYTE43_tree = (ProtoTree)adaptor.create(T_BYTE43);
                    adaptor.addChild(root_0, T_BYTE43_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:203:4: 'int8'
                    {
                    string_literal44=(Token)match(input,54,FOLLOW_54_in_field_primtype1159);  
                    stream_54.add(string_literal44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 203:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:203:14: ^( T_BYTE )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_BYTE, "T_BYTE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:204:4: T_DATE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATE45=(Token)match(input,T_DATE,FOLLOW_T_DATE_in_field_primtype1170); 
                    T_DATE45_tree = (ProtoTree)adaptor.create(T_DATE45);
                    adaptor.addChild(root_0, T_DATE45_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: T_DATETIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATETIME46=(Token)match(input,T_DATETIME,FOLLOW_T_DATETIME_in_field_primtype1175); 
                    T_DATETIME46_tree = (ProtoTree)adaptor.create(T_DATETIME46);
                    adaptor.addChild(root_0, T_DATETIME46_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT47=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1180); 
                    T_SHORT47_tree = (ProtoTree)adaptor.create(T_SHORT47);
                    adaptor.addChild(root_0, T_SHORT47_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: 'int16'
                    {
                    string_literal48=(Token)match(input,55,FOLLOW_55_in_field_primtype1185);  
                    stream_55.add(string_literal48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 207:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:207:15: ^( T_SHORT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_SHORT, "T_SHORT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT49=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1196); 
                    T_INT49_tree = (ProtoTree)adaptor.create(T_INT49);
                    adaptor.addChild(root_0, T_INT49_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: 'int32'
                    {
                    string_literal50=(Token)match(input,56,FOLLOW_56_in_field_primtype1201);  
                    stream_56.add(string_literal50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 209:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:209:15: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: 'uint32'
                    {
                    string_literal51=(Token)match(input,57,FOLLOW_57_in_field_primtype1212);  
                    stream_57.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 210:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:210:16: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 12 :
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: 'sint32'
                    {
                    string_literal52=(Token)match(input,58,FOLLOW_58_in_field_primtype1223);  
                    stream_58.add(string_literal52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 211:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:211:16: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 13 :
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: 'fixed32'
                    {
                    string_literal53=(Token)match(input,59,FOLLOW_59_in_field_primtype1234);  
                    stream_59.add(string_literal53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 212:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:212:17: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 14 :
                    // org/fudgemsg/proto/antlr/Proto.g:213:4: 'sfixed32'
                    {
                    string_literal54=(Token)match(input,60,FOLLOW_60_in_field_primtype1245);  
                    stream_60.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 213:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:213:18: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:214:4: 'integer'
                    {
                    string_literal55=(Token)match(input,61,FOLLOW_61_in_field_primtype1256);  
                    stream_61.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 214:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:214:17: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG56=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1267); 
                    T_LONG56_tree = (ProtoTree)adaptor.create(T_LONG56);
                    adaptor.addChild(root_0, T_LONG56_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:216:4: 'int64'
                    {
                    string_literal57=(Token)match(input,62,FOLLOW_62_in_field_primtype1272);  
                    stream_62.add(string_literal57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 216:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:216:15: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 18 :
                    // org/fudgemsg/proto/antlr/Proto.g:217:4: 'uint64'
                    {
                    string_literal58=(Token)match(input,63,FOLLOW_63_in_field_primtype1283);  
                    stream_63.add(string_literal58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 217:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:217:16: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 19 :
                    // org/fudgemsg/proto/antlr/Proto.g:218:4: 'sint64'
                    {
                    string_literal59=(Token)match(input,64,FOLLOW_64_in_field_primtype1294);  
                    stream_64.add(string_literal59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 218:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:218:16: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 20 :
                    // org/fudgemsg/proto/antlr/Proto.g:219:4: 'fixed64'
                    {
                    string_literal60=(Token)match(input,65,FOLLOW_65_in_field_primtype1305);  
                    stream_65.add(string_literal60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 219:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:219:17: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:220:4: 'sfixed64'
                    {
                    string_literal61=(Token)match(input,66,FOLLOW_66_in_field_primtype1316);  
                    stream_66.add(string_literal61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 220:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:220:18: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // org/fudgemsg/proto/antlr/Proto.g:221:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT62=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1327); 
                    T_FLOAT62_tree = (ProtoTree)adaptor.create(T_FLOAT62);
                    adaptor.addChild(root_0, T_FLOAT62_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:222:4: 'float32'
                    {
                    string_literal63=(Token)match(input,67,FOLLOW_67_in_field_primtype1332);  
                    stream_67.add(string_literal63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 222:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:222:17: ^( T_FLOAT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_FLOAT, "T_FLOAT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // org/fudgemsg/proto/antlr/Proto.g:223:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE64=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1343); 
                    T_DOUBLE64_tree = (ProtoTree)adaptor.create(T_DOUBLE64);
                    adaptor.addChild(root_0, T_DOUBLE64_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:224:4: 'float64'
                    {
                    string_literal65=(Token)match(input,68,FOLLOW_68_in_field_primtype1348);  
                    stream_68.add(string_literal65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 224:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:224:17: ^( T_DOUBLE )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_DOUBLE, "T_DOUBLE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 26 :
                    // org/fudgemsg/proto/antlr/Proto.g:225:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR66=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1359); 
                    T_INDICATOR66_tree = (ProtoTree)adaptor.create(T_INDICATOR66);
                    adaptor.addChild(root_0, T_INDICATOR66_tree);


                    }
                    break;
                case 27 :
                    // org/fudgemsg/proto/antlr/Proto.g:226:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING67=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1364); 
                    T_STRING67_tree = (ProtoTree)adaptor.create(T_STRING67);
                    adaptor.addChild(root_0, T_STRING67_tree);


                    }
                    break;
                case 28 :
                    // org/fudgemsg/proto/antlr/Proto.g:227:4: T_TIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_TIME68=(Token)match(input,T_TIME,FOLLOW_T_TIME_in_field_primtype1369); 
                    T_TIME68_tree = (ProtoTree)adaptor.create(T_TIME68);
                    adaptor.addChild(root_0, T_TIME68_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_primtype"

    public static class field_basetype_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_basetype"
    // org/fudgemsg/proto/antlr/Proto.g:230:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype69 = null;

        ProtoParser.fullidentifier_return fullidentifier70 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:231:2: ( field_primtype | fullidentifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=T_BOOL && LA10_0<=T_TIME)||(LA10_0>=53 && LA10_0<=68)) ) {
                alt10=1;
            }
            else if ( (LA10_0==IDENTIFIER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:231:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1380);
                    field_primtype69=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype69.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:232:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1385);
                    fullidentifier70=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier70.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_basetype"

    public static class field_type_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_type"
    // org/fudgemsg/proto/antlr/Proto.g:235:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype71 = null;

        ProtoParser.field_arraytype_return field_arraytype72 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:236:2: ( field_basetype | field_arraytype )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:236:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1396);
                    field_basetype71=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype71.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:237:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1401);
                    field_arraytype72=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "field_type"

    public static class fullidentifier_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fullidentifier"
    // org/fudgemsg/proto/antlr/Proto.g:240:1: fullidentifier : IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER73=null;
        Token char_literal74=null;
        Token IDENTIFIER75=null;
        ProtoParser.anyword_return anyword76 = null;


        ProtoTree IDENTIFIER73_tree=null;
        ProtoTree char_literal74_tree=null;
        ProtoTree IDENTIFIER75_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:240:16: ( IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* )
            // org/fudgemsg/proto/antlr/Proto.g:240:18: IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1411); 
            IDENTIFIER73_tree = (ProtoTree)adaptor.create(IDENTIFIER73);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER73_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:240:30: ( '.' ( IDENTIFIER | anyword ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==69) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:240:31: '.' ( IDENTIFIER | anyword )
            	    {
            	    char_literal74=(Token)match(input,69,FOLLOW_69_in_fullidentifier1415); 
            	    // org/fudgemsg/proto/antlr/Proto.g:240:36: ( IDENTIFIER | anyword )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==IDENTIFIER) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==ABSTRACT||(LA12_0>=BINDING && LA12_0<=DEFAULT)||(LA12_0>=ENUM && LA12_0<=EXTERN)||(LA12_0>=IMPORT && LA12_0<=OPTIONAL)||(LA12_0>=READONLY && LA12_0<=REQUIRED)||(LA12_0>=T_BOOL && LA12_0<=USES)) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:240:37: IDENTIFIER
            	            {
            	            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1419); 
            	            IDENTIFIER75_tree = (ProtoTree)adaptor.create(IDENTIFIER75);
            	            adaptor.addChild(root_0, IDENTIFIER75_tree);


            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:240:50: anyword
            	            {
            	            pushFollow(FOLLOW_anyword_in_fullidentifier1423);
            	            anyword76=anyword();

            	            state._fsp--;

            	            adaptor.addChild(root_0, anyword76.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fullidentifier"

    public static class literal_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // org/fudgemsg/proto/antlr/Proto.g:242:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set77=null;

        ProtoTree set77_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:243:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set77=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set77));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class message_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // org/fudgemsg/proto/antlr/Proto.g:249:1: message : ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ABSTRACT78=null;
        Token MESSAGE79=null;
        Token IDENTIFIER80=null;
        Token char_literal83=null;
        Token char_literal85=null;
        ProtoParser.message_uses_return message_uses81 = null;

        ProtoParser.message_extends_return message_extends82 = null;

        ProtoParser.message_element_return message_element84 = null;


        ProtoTree ABSTRACT78_tree=null;
        ProtoTree MESSAGE79_tree=null;
        ProtoTree IDENTIFIER80_tree=null;
        ProtoTree char_literal83_tree=null;
        ProtoTree char_literal85_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:249:9: ( ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:249:11: ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            // org/fudgemsg/proto/antlr/Proto.g:249:11: ( ABSTRACT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ABSTRACT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:11: ABSTRACT
                    {
                    ABSTRACT78=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_message1461); 
                    ABSTRACT78_tree = (ProtoTree)adaptor.create(ABSTRACT78);
                    adaptor.addChild(root_0, ABSTRACT78_tree);


                    }
                    break;

            }

            MESSAGE79=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1464); 
            MESSAGE79_tree = (ProtoTree)adaptor.create(MESSAGE79);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE79_tree, root_0);

            IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1467); 
            IDENTIFIER80_tree = (ProtoTree)adaptor.create(IDENTIFIER80);
            adaptor.addChild(root_0, IDENTIFIER80_tree);

            // org/fudgemsg/proto/antlr/Proto.g:249:41: ( message_uses )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==USES) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:41: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1469);
                    message_uses81=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses81.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:249:55: ( message_extends )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EXTENDS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:55: message_extends
                    {
                    pushFollow(FOLLOW_message_extends_in_message1472);
                    message_extends82=message_extends();

                    state._fsp--;

                    adaptor.addChild(root_0, message_extends82.getTree());

                    }
                    break;

            }

            char_literal83=(Token)match(input,46,FOLLOW_46_in_message1475); 
            // org/fudgemsg/proto/antlr/Proto.g:249:77: ( message_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ABSTRACT||LA17_0==BINDING||LA17_0==ENUM||(LA17_0>=MESSAGE && LA17_0<=MUTABLE)||LA17_0==OPTIONAL||(LA17_0>=READONLY && LA17_0<=REQUIRED)||(LA17_0>=T_BOOL && LA17_0<=T_TIME)||LA17_0==IDENTIFIER||(LA17_0>=53 && LA17_0<=68)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:249:77: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1478);
            	    message_element84=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element84.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal85=(Token)match(input,47,FOLLOW_47_in_message1481); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class message_element_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_element"
    // org/fudgemsg/proto/antlr/Proto.g:251:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum86 = null;

        ProtoParser.message_field_return message_field87 = null;

        ProtoParser.message_submsg_return message_submsg88 = null;

        ProtoParser.binding_return binding89 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:252:2: ( message_enum | message_field | message_submsg | binding )
            int alt18=4;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt18=1;
                }
                break;
            case MUTABLE:
            case OPTIONAL:
            case READONLY:
            case REPEATED:
            case REQUIRED:
            case T_BOOL:
            case T_BYTE:
            case T_DOUBLE:
            case T_DATE:
            case T_DATETIME:
            case T_FLOAT:
            case T_INDICATOR:
            case T_INT:
            case T_LONG:
            case T_SHORT:
            case T_STRING:
            case T_TIME:
            case IDENTIFIER:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt18=2;
                }
                break;
            case ABSTRACT:
            case MESSAGE:
                {
                alt18=3;
                }
                break;
            case BINDING:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:252:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1492);
                    message_enum86=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum86.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:253:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1497);
                    message_field87=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field87.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:254:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1502);
                    message_submsg88=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg88.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:255:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1507);
                    binding89=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding89.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_element"

    public static class message_enum_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_enum"
    // org/fudgemsg/proto/antlr/Proto.g:258:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM90=null;
        Token IDENTIFIER91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        ProtoParser.enum_element_return enum_element93 = null;


        ProtoTree ENUM90_tree=null;
        ProtoTree IDENTIFIER91_tree=null;
        ProtoTree char_literal92_tree=null;
        ProtoTree char_literal94_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:258:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:258:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM90=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1517); 
            ENUM90_tree = (ProtoTree)adaptor.create(ENUM90);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM90_tree, root_0);

            IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1520); 
            IDENTIFIER91_tree = (ProtoTree)adaptor.create(IDENTIFIER91);
            adaptor.addChild(root_0, IDENTIFIER91_tree);

            char_literal92=(Token)match(input,46,FOLLOW_46_in_message_enum1522); 
            // org/fudgemsg/proto/antlr/Proto.g:258:38: ( enum_element )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BINDING||LA19_0==IDENTIFIER) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:258:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1525);
            	    enum_element93=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element93.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            char_literal94=(Token)match(input,47,FOLLOW_47_in_message_enum1528); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_enum"

    public static class message_field_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_field"
    // org/fudgemsg/proto/antlr/Proto.g:260:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER97=null;
        Token char_literal100=null;
        Token MESSAGE102=null;
        Token IDENTIFIER103=null;
        Token char_literal106=null;
        Token MESSAGE108=null;
        Token IDENTIFIER110=null;
        Token char_literal113=null;
        ProtoParser.field_modifier_return field_modifier95 = null;

        ProtoParser.field_type_return field_type96 = null;

        ProtoParser.field_ordinal_return field_ordinal98 = null;

        ProtoParser.field_constraints_return field_constraints99 = null;

        ProtoParser.field_modifier_return field_modifier101 = null;

        ProtoParser.field_ordinal_return field_ordinal104 = null;

        ProtoParser.field_constraints_return field_constraints105 = null;

        ProtoParser.field_modifier_return field_modifier107 = null;

        ProtoParser.dimension_return dimension109 = null;

        ProtoParser.field_ordinal_return field_ordinal111 = null;

        ProtoParser.field_constraints_return field_constraints112 = null;


        ProtoTree IDENTIFIER97_tree=null;
        ProtoTree char_literal100_tree=null;
        ProtoTree MESSAGE102_tree=null;
        ProtoTree IDENTIFIER103_tree=null;
        ProtoTree char_literal106_tree=null;
        ProtoTree MESSAGE108_tree=null;
        ProtoTree IDENTIFIER110_tree=null;
        ProtoTree char_literal113_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:261:3: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:261:5: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:261:5: ( field_modifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==MUTABLE||LA20_0==OPTIONAL||(LA20_0>=READONLY && LA20_0<=REQUIRED)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:261:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1540);
                    	    field_modifier95=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier95.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_field_type_in_message_field1543);
                    field_type96=field_type();

                    state._fsp--;

                    stream_field_type.add(field_type96.getTree());
                    IDENTIFIER97=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1545);  
                    stream_IDENTIFIER.add(IDENTIFIER97);

                    // org/fudgemsg/proto/antlr/Proto.g:261:43: ( field_ordinal )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==49) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:261:43: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1547);
                            field_ordinal98=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal98.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:261:58: ( field_constraints )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==50) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:261:58: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1550);
                            field_constraints99=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints99.getTree());

                            }
                            break;

                    }

                    char_literal100=(Token)match(input,48,FOLLOW_48_in_message_field1553);  
                    stream_48.add(char_literal100);



                    // AST REWRITE
                    // elements: field_constraints, field_ordinal, field_modifier, IDENTIFIER, field_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 261:81: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:261:84: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_field_type.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:261:114: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:261:130: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:261:145: ( field_constraints )?
                        if ( stream_field_constraints.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_constraints.nextTree());

                        }
                        stream_field_constraints.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:262:5: ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:262:5: ( field_modifier )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==MUTABLE||LA23_0==OPTIONAL||(LA23_0>=READONLY && LA23_0<=REQUIRED)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:262:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1578);
                    	    field_modifier101=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier101.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    MESSAGE102=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1581);  
                    stream_MESSAGE.add(MESSAGE102);

                    IDENTIFIER103=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1583);  
                    stream_IDENTIFIER.add(IDENTIFIER103);

                    // org/fudgemsg/proto/antlr/Proto.g:262:40: ( field_ordinal )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==49) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:262:40: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1585);
                            field_ordinal104=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal104.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:262:55: ( field_constraints )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==50) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:262:55: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1588);
                            field_constraints105=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints105.getTree());

                            }
                            break;

                    }

                    char_literal106=(Token)match(input,48,FOLLOW_48_in_message_field1591);  
                    stream_48.add(char_literal106);



                    // AST REWRITE
                    // elements: field_modifier, IDENTIFIER, field_constraints, MESSAGE, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 262:78: -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:262:81: ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:262:108: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:262:124: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:262:139: ( field_constraints )?
                        if ( stream_field_constraints.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_constraints.nextTree());

                        }
                        stream_field_constraints.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:263:5: ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:263:5: ( field_modifier )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==MUTABLE||LA26_0==OPTIONAL||(LA26_0>=READONLY && LA26_0<=REQUIRED)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:263:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1616);
                    	    field_modifier107=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    MESSAGE108=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1619);  
                    stream_MESSAGE.add(MESSAGE108);

                    // org/fudgemsg/proto/antlr/Proto.g:263:29: ( dimension )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==50) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:263:29: dimension
                    	    {
                    	    pushFollow(FOLLOW_dimension_in_message_field1621);
                    	    dimension109=dimension();

                    	    state._fsp--;

                    	    stream_dimension.add(dimension109.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);

                    IDENTIFIER110=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1624);  
                    stream_IDENTIFIER.add(IDENTIFIER110);

                    // org/fudgemsg/proto/antlr/Proto.g:263:51: ( field_ordinal )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==49) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:263:51: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1626);
                            field_ordinal111=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal111.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:263:66: ( field_constraints )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==50) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:263:66: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1629);
                            field_constraints112=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints112.getTree());

                            }
                            break;

                    }

                    char_literal113=(Token)match(input,48,FOLLOW_48_in_message_field1632);  
                    stream_48.add(char_literal113);



                    // AST REWRITE
                    // elements: IDENTIFIER, field_modifier, field_constraints, dimension, field_ordinal, MESSAGE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 263:89: -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:263:92: ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:263:100: ^( ARRAY MESSAGE ( dimension )+ )
                        {
                        ProtoTree root_2 = (ProtoTree)adaptor.nil();
                        root_2 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ARRAY, "ARRAY"), root_2);

                        adaptor.addChild(root_2, stream_MESSAGE.nextNode());
                        if ( !(stream_dimension.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_dimension.hasNext() ) {
                            adaptor.addChild(root_2, stream_dimension.nextTree());

                        }
                        stream_dimension.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:263:139: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:263:155: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:263:170: ( field_constraints )?
                        if ( stream_field_constraints.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_constraints.nextTree());

                        }
                        stream_field_constraints.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_field"

    public static class message_submsg_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_submsg"
    // org/fudgemsg/proto/antlr/Proto.g:266:1: message_submsg : ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ABSTRACT114=null;
        Token MESSAGE115=null;
        Token IDENTIFIER116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        ProtoParser.message_element_return message_element118 = null;


        ProtoTree ABSTRACT114_tree=null;
        ProtoTree MESSAGE115_tree=null;
        ProtoTree IDENTIFIER116_tree=null;
        ProtoTree char_literal117_tree=null;
        ProtoTree char_literal119_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:266:16: ( ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:266:18: ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            // org/fudgemsg/proto/antlr/Proto.g:266:18: ( ABSTRACT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ABSTRACT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:266:18: ABSTRACT
                    {
                    ABSTRACT114=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_message_submsg1669); 
                    ABSTRACT114_tree = (ProtoTree)adaptor.create(ABSTRACT114);
                    adaptor.addChild(root_0, ABSTRACT114_tree);


                    }
                    break;

            }

            MESSAGE115=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1672); 
            MESSAGE115_tree = (ProtoTree)adaptor.create(MESSAGE115);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE115_tree, root_0);

            IDENTIFIER116=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1675); 
            IDENTIFIER116_tree = (ProtoTree)adaptor.create(IDENTIFIER116);
            adaptor.addChild(root_0, IDENTIFIER116_tree);

            char_literal117=(Token)match(input,46,FOLLOW_46_in_message_submsg1677); 
            // org/fudgemsg/proto/antlr/Proto.g:266:53: ( message_element )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ABSTRACT||LA32_0==BINDING||LA32_0==ENUM||(LA32_0>=MESSAGE && LA32_0<=MUTABLE)||LA32_0==OPTIONAL||(LA32_0>=READONLY && LA32_0<=REQUIRED)||(LA32_0>=T_BOOL && LA32_0<=T_TIME)||LA32_0==IDENTIFIER||(LA32_0>=53 && LA32_0<=68)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:266:53: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1680);
            	    message_element118=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element118.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            char_literal119=(Token)match(input,47,FOLLOW_47_in_message_submsg1683); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_submsg"

    public static class message_uses_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_uses"
    // org/fudgemsg/proto/antlr/Proto.g:269:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES120=null;
        Token char_literal122=null;
        ProtoParser.fullidentifier_return fullidentifier121 = null;

        ProtoParser.fullidentifier_return fullidentifier123 = null;


        ProtoTree USES120_tree=null;
        ProtoTree char_literal122_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:269:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:269:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES120=(Token)match(input,USES,FOLLOW_USES_in_message_uses1694); 
            USES120_tree = (ProtoTree)adaptor.create(USES120);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES120_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1697);
            fullidentifier121=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier121.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:269:37: ( ',' fullidentifier )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==52) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:269:38: ',' fullidentifier
            	    {
            	    char_literal122=(Token)match(input,52,FOLLOW_52_in_message_uses1700); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1703);
            	    fullidentifier123=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier123.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_uses"

    public static class message_extends_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_extends"
    // org/fudgemsg/proto/antlr/Proto.g:272:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_extends_return message_extends() throws RecognitionException {
        ProtoParser.message_extends_return retval = new ProtoParser.message_extends_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTENDS124=null;
        Token char_literal126=null;
        ProtoParser.fullidentifier_return fullidentifier125 = null;

        ProtoParser.fullidentifier_return fullidentifier127 = null;


        ProtoTree EXTENDS124_tree=null;
        ProtoTree char_literal126_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:272:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:272:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS124=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1715); 
            EXTENDS124_tree = (ProtoTree)adaptor.create(EXTENDS124);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS124_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1718);
            fullidentifier125=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier125.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:272:43: ( ',' fullidentifier )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==52) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:272:44: ',' fullidentifier
            	    {
            	    char_literal126=(Token)match(input,52,FOLLOW_52_in_message_extends1721); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1724);
            	    fullidentifier127=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier127.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message_extends"

    public static class namespace_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // org/fudgemsg/proto/antlr/Proto.g:274:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE128=null;
        Token char_literal130=null;
        Token char_literal132=null;
        ProtoParser.fullidentifier_return fullidentifier129 = null;

        ProtoParser.root_object_return root_object131 = null;


        ProtoTree NAMESPACE128_tree=null;
        ProtoTree char_literal130_tree=null;
        ProtoTree char_literal132_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:274:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:274:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE128=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1735); 
            NAMESPACE128_tree = (ProtoTree)adaptor.create(NAMESPACE128);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE128_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1738);
            fullidentifier129=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier129.getTree());
            char_literal130=(Token)match(input,46,FOLLOW_46_in_namespace1740); 
            // org/fudgemsg/proto/antlr/Proto.g:274:44: ( root_object )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ABSTRACT||LA35_0==ENUM||LA35_0==EXTERN||LA35_0==MESSAGE||LA35_0==NAMESPACE||LA35_0==TAXONOMY) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:274:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1743);
            	    root_object131=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object131.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            char_literal132=(Token)match(input,47,FOLLOW_47_in_namespace1746); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "namespace"

    public static class root_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // org/fudgemsg/proto/antlr/Proto.g:276:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object133 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:276:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:276:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:276:8: ( root_object )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ABSTRACT||LA36_0==ENUM||LA36_0==EXTERN||LA36_0==MESSAGE||LA36_0==NAMESPACE||LA36_0==TAXONOMY) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:276:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1756);
            	    root_object133=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object133.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);



            // AST REWRITE
            // elements: root_object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 276:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:276:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:276:31: ( root_object )*
                while ( stream_root_object.hasNext() ) {
                    adaptor.addChild(root_1, stream_root_object.nextTree());

                }
                stream_root_object.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class root_object_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root_object"
    // org/fudgemsg/proto/antlr/Proto.g:278:1: root_object : ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTERN134=null;
        Token set135=null;
        Token char_literal137=null;
        ProtoParser.fullidentifier_return fullidentifier136 = null;

        ProtoParser.message_return message138 = null;

        ProtoParser.message_enum_return message_enum139 = null;

        ProtoParser.namespace_return namespace140 = null;

        ProtoParser.taxonomy_return taxonomy141 = null;


        ProtoTree EXTERN134_tree=null;
        ProtoTree set135_tree=null;
        ProtoTree char_literal137_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:279:3: ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy )
            int alt38=5;
            switch ( input.LA(1) ) {
            case EXTERN:
                {
                alt38=1;
                }
                break;
            case ABSTRACT:
            case MESSAGE:
                {
                alt38=2;
                }
                break;
            case ENUM:
                {
                alt38=3;
                }
                break;
            case NAMESPACE:
                {
                alt38=4;
                }
                break;
            case TAXONOMY:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:279:5: EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )?
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN134=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1776); 
                    EXTERN134_tree = (ProtoTree)adaptor.create(EXTERN134);
                    root_0 = (ProtoTree)adaptor.becomeRoot(EXTERN134_tree, root_0);

                    set135=(Token)input.LT(1);
                    if ( input.LA(1)==ENUM||input.LA(1)==MESSAGE||input.LA(1)==TAXONOMY ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProtoTree)adaptor.create(set135));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_fullidentifier_in_root_object1791);
                    fullidentifier136=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier136.getTree());
                    // org/fudgemsg/proto/antlr/Proto.g:279:56: ( ';' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==48) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:279:56: ';'
                            {
                            char_literal137=(Token)match(input,48,FOLLOW_48_in_root_object1793); 
                            char_literal137_tree = (ProtoTree)adaptor.create(char_literal137);
                            adaptor.addChild(root_0, char_literal137_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:280:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1799);
                    message138=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message138.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:281:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1804);
                    message_enum139=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum139.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:282:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1809);
                    namespace140=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace140.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:283:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1814);
                    taxonomy141=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy141.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root_object"

    public static class taxonomy_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "taxonomy"
    // org/fudgemsg/proto/antlr/Proto.g:286:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY142=null;
        Token IDENTIFIER143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        ProtoParser.taxonomy_element_return taxonomy_element145 = null;


        ProtoTree TAXONOMY142_tree=null;
        ProtoTree IDENTIFIER143_tree=null;
        ProtoTree char_literal144_tree=null;
        ProtoTree char_literal146_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:286:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:286:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY142=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1824); 
            TAXONOMY142_tree = (ProtoTree)adaptor.create(TAXONOMY142);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY142_tree, root_0);

            IDENTIFIER143=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1827); 
            IDENTIFIER143_tree = (ProtoTree)adaptor.create(IDENTIFIER143);
            adaptor.addChild(root_0, IDENTIFIER143_tree);

            char_literal144=(Token)match(input,46,FOLLOW_46_in_taxonomy1829); 
            // org/fudgemsg/proto/antlr/Proto.g:286:38: ( taxonomy_element )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==BINDING||LA39_0==IMPORT||LA39_0==IDENTIFIER) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:286:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1832);
            	    taxonomy_element145=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element145.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal146=(Token)match(input,47,FOLLOW_47_in_taxonomy1835); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "taxonomy"

    public static class taxonomy_element_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "taxonomy_element"
    // org/fudgemsg/proto/antlr/Proto.g:288:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT148=null;
        Token char_literal150=null;
        ProtoParser.enum_element_return enum_element147 = null;

        ProtoParser.fullidentifier_return fullidentifier149 = null;


        ProtoTree IMPORT148_tree=null;
        ProtoTree char_literal150_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:289:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==BINDING||LA40_0==IDENTIFIER) ) {
                alt40=1;
            }
            else if ( (LA40_0==IMPORT) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:289:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1846);
                    enum_element147=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element147.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:290:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT148=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1851); 
                    IMPORT148_tree = (ProtoTree)adaptor.create(IMPORT148);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT148_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1854);
                    fullidentifier149=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier149.getTree());
                    char_literal150=(Token)match(input,48,FOLLOW_48_in_taxonomy_element1856); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (ProtoTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ProtoTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "taxonomy_element"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA11_eotS =
        "\43\uffff";
    static final String DFA11_eofS =
        "\43\uffff";
    static final String DFA11_minS =
        "\1\30\35\47\2\uffff\1\4\2\47";
    static final String DFA11_maxS =
        "\1\104\34\62\1\105\2\uffff\1\47\2\105";
    static final String DFA11_acceptS =
        "\36\uffff\1\2\1\1\3\uffff";
    static final String DFA11_specialS =
        "\43\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\3\1\30\1\5\1\6\1\26\1\32\1\11\1\20\1\7\1\33\1\34\3\uffff"+
            "\1\35\15\uffff\1\2\1\4\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\21\1\22\1\23\1\24\1\25\1\27\1\31",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36",
            "\1\37\12\uffff\1\36\22\uffff\1\40",
            "",
            "",
            "\1\42\1\uffff\2\42\2\uffff\3\42\1\uffff\5\42\1\uffff\3\42\1"+
            "\uffff\16\42\1\uffff\1\41",
            "\1\37\12\uffff\1\36\22\uffff\1\40",
            "\1\37\12\uffff\1\36\22\uffff\1\40"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "235:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
    static final String DFA30_eotS =
        "\6\uffff";
    static final String DFA30_eofS =
        "\6\uffff";
    static final String DFA30_minS =
        "\1\20\1\17\1\uffff\1\47\2\uffff";
    static final String DFA30_maxS =
        "\2\104\1\uffff\1\62\2\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA30_specialS =
        "\6\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\3\uffff\1\2\15\uffff"+
            "\20\2",
            "\1\3\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\3\uffff\1\2\15"+
            "\uffff\20\2",
            "",
            "\1\4\12\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "260:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_anyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding860 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_binding_anyword_in_binding863 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_binding865 = new BitSet(new long[]{0x0000908000000000L});
    public static final BitSet FOLLOW_binding_element_in_binding868 = new BitSet(new long[]{0x0000908000000000L});
    public static final BitSet FOLLOW_47_in_binding872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element898 = new BitSet(new long[]{0x0000188000000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text910 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_binding_text912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text923 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_binding_text925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default936 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constraint_default939 = new BitSet(new long[]{0x0000138000000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_dimension952 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension954 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_dimension956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_dimension969 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_dimension971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_enum_element989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element995 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element998 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_enum_element1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_enum_value1013 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_set_in_enum_value1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_constraints1040 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1043 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_field_constraints1046 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1049 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_field_constraints1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_ordinal1063 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_field_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype1114 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype1116 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATE_in_field_primtype1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATETIME_in_field_primtype1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_field_primtype1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_field_primtype1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_field_primtype1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_field_primtype1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_field_primtype1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_field_primtype1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_TIME_in_field_primtype1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_fullidentifier1415 = new BitSet(new long[]{0x000000BFFF77DCD0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_anyword_in_fullidentifier1423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_message1461 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MESSAGE_in_message1464 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1467 = new BitSet(new long[]{0x0000402000000800L});
    public static final BitSet FOLLOW_message_uses_in_message1469 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_message_extends_in_message1472 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message1475 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_message_element_in_message1478 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_47_in_message1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1517 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1520 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message_enum1522 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_enum_element_in_message_enum1525 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_47_in_message_enum1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1540 = new BitSet(new long[]{0xFFE0008FFF750000L,0x000000000000001FL});
    public static final BitSet FOLLOW_field_type_in_message_field1543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1545 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1547 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1550 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message_field1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1578 = new BitSet(new long[]{0x0000000000758000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1581 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1583 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1585 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1588 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message_field1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1616 = new BitSet(new long[]{0x0000000000758000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1619 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_dimension_in_message_field1621 = new BitSet(new long[]{0x0004008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1624 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1626 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1629 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message_field1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_message_submsg1669 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1672 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1675 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message_submsg1677 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_message_element_in_message_submsg1680 = new BitSet(new long[]{0xFFE0808FFF758450L,0x000000000000001FL});
    public static final BitSet FOLLOW_47_in_message_submsg1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1694 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1697 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_message_uses1700 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1703 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1715 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1718 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_message_extends1721 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1724 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1735 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1738 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_namespace1740 = new BitSet(new long[]{0x0000801000029410L});
    public static final BitSet FOLLOW_root_object_in_namespace1743 = new BitSet(new long[]{0x0000801000029410L});
    public static final BitSet FOLLOW_47_in_namespace1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1756 = new BitSet(new long[]{0x0000001000029412L});
    public static final BitSet FOLLOW_EXTERN_in_root_object1776 = new BitSet(new long[]{0x0000001000008400L});
    public static final BitSet FOLLOW_set_in_root_object1779 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_root_object1791 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_root_object1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_root_object1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1824 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1827 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_taxonomy1829 = new BitSet(new long[]{0xFFE0808FFF75C450L,0x000000000000001FL});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1832 = new BitSet(new long[]{0xFFE0808FFF75C450L,0x000000000000001FL});
    public static final BitSet FOLLOW_47_in_taxonomy1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1851 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1854 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_taxonomy_element1856 = new BitSet(new long[]{0x0000000000000002L});

}