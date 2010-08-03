// $ANTLR 3.2 Fedora release 12 (Constantine) Thu Apr 29 14:41:02 UTC 2010 org/fudgemsg/proto/antlr/Proto.g 2010-08-03 17:51:42

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "EXTERN", "FIELD", "FORWARD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "OPTIONAL", "ORDINAL", "READONLY", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_DATE", "T_DATETIME", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "T_TIME", "TAXONOMY", "TYPEDEF", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'", "'('", "')'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int BINDING=6;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int FORWARD=14;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=35;
    public static final int ML_STRING=45;
    public static final int T_BOOL=25;
    public static final int T_DOUBLE=27;
    public static final int EXTERN=12;
    public static final int FLOAT=43;
    public static final int ABSTRACT=4;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_LONG=33;
    public static final int T__55=55;
    public static final int ML_COMMENT=44;
    public static final int T_INDICATOR=31;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=15;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=41;
    public static final int TAXONOMY=37;
    public static final int T__59=59;
    public static final int T_INT=32;
    public static final int MESSAGE=16;
    public static final int COMMENT=40;
    public static final int T__50=50;
    public static final int ARRAY=5;
    public static final int INTEGER=42;
    public static final int T_BYTE=26;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=8;
    public static final int TYPEDEF=38;
    public static final int ORDINAL=20;
    public static final int DEFAULT=7;
    public static final int T_FLOAT=30;
    public static final int REPEATED=22;
    public static final int WHITESPACE=47;
    public static final int REQUIRED=23;
    public static final int READONLY=21;
    public static final int ROOT=24;
    public static final int T_DATETIME=29;
    public static final int NAMESPACE=18;
    public static final int OPTIONAL=19;
    public static final int T__71=71;
    public static final int DIM_VARIANT=9;
    public static final int T__72=72;
    public static final int ENUM=10;
    public static final int T__70=70;
    public static final int USES=39;
    public static final int T_DATE=28;
    public static final int FIELD=13;
    public static final int T_TIME=36;
    public static final int T_SHORT=34;
    public static final int EXTENDS=11;
    public static final int T__73=73;
    public static final int MUTABLE=17;
    public static final int STRING=46;

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
    // org/fudgemsg/proto/antlr/Proto.g:124:1: anyword : ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | TYPEDEF | USES );
    public final ProtoParser.anyword_return anyword() throws RecognitionException {
        ProtoParser.anyword_return retval = new ProtoParser.anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set1=null;

        ProtoTree set1_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:125:3: ( ABSTRACT | BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | TYPEDEF | USES )
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
    // org/fudgemsg/proto/antlr/Proto.g:156:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:156:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:156:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING2=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding885); 
            BINDING2_tree = (ProtoTree)adaptor.create(BINDING2);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING2_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding888);
            binding_anyword3=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword3.getTree());
            char_literal4=(Token)match(input,48,FOLLOW_48_in_binding890); 
            // org/fudgemsg/proto/antlr/Proto.g:156:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ABSTRACT||(LA1_0>=BINDING && LA1_0<=DEFAULT)||(LA1_0>=ENUM && LA1_0<=EXTERN)||(LA1_0>=IMPORT && LA1_0<=OPTIONAL)||(LA1_0>=READONLY && LA1_0<=REQUIRED)||(LA1_0>=T_BOOL && LA1_0<=USES)||LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:156:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding893);
            	    binding_element5=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal6=(Token)match(input,49,FOLLOW_49_in_binding897); 

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
    // org/fudgemsg/proto/antlr/Proto.g:158:1: binding_anyword : ( fullidentifier | anyword | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING9=null;
        ProtoParser.fullidentifier_return fullidentifier7 = null;

        ProtoParser.anyword_return anyword8 = null;


        ProtoTree STRING9_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:159:2: ( fullidentifier | anyword | STRING )
            int alt2=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BINDING:
            case DEFAULT:
            case ENUM:
            case EXTENDS:
            case EXTERN:
            case IMPORT:
            case MESSAGE:
            case MUTABLE:
            case NAMESPACE:
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
            case TAXONOMY:
            case TYPEDEF:
            case USES:
                {
                alt2=2;
                }
                break;
            case STRING:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:159:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword908);
                    fullidentifier7=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier7.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:160:4: anyword
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_anyword_in_binding_anyword913);
                    anyword8=anyword();

                    state._fsp--;

                    adaptor.addChild(root_0, anyword8.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:161:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword918); 
                    STRING9_tree = (ProtoTree)adaptor.create(STRING9);
                    adaptor.addChild(root_0, STRING9_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:164:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword10 = null;

        ProtoParser.binding_text_return binding_text11 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:164:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:164:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element928);
            binding_anyword10=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword10.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element930);
            binding_text11=binding_text();

            state._fsp--;

            adaptor.addChild(root_0, binding_text11.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:166:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
    public final ProtoParser.binding_text_return binding_text() throws RecognitionException {
        ProtoParser.binding_text_return retval = new ProtoParser.binding_text_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING12=null;
        Token char_literal13=null;
        Token ML_STRING14=null;
        Token char_literal16=null;
        ProtoParser.fullidentifier_return fullidentifier15 = null;


        ProtoTree STRING12_tree=null;
        ProtoTree char_literal13_tree=null;
        ProtoTree ML_STRING14_tree=null;
        ProtoTree char_literal16_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:167:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:167:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text940); 
                    STRING12_tree = (ProtoTree)adaptor.create(STRING12);
                    adaptor.addChild(root_0, STRING12_tree);

                    char_literal13=(Token)match(input,50,FOLLOW_50_in_binding_text942); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:168:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING14=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text948); 
                    ML_STRING14_tree = (ProtoTree)adaptor.create(ML_STRING14);
                    adaptor.addChild(root_0, ML_STRING14_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:169:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text953);
                    fullidentifier15=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier15.getTree());
                    char_literal16=(Token)match(input,50,FOLLOW_50_in_binding_text955); 

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
    // org/fudgemsg/proto/antlr/Proto.g:172:1: constraint_default : DEFAULT '=' literal ;
    public final ProtoParser.constraint_default_return constraint_default() throws RecognitionException {
        ProtoParser.constraint_default_return retval = new ProtoParser.constraint_default_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token DEFAULT17=null;
        Token char_literal18=null;
        ProtoParser.literal_return literal19 = null;


        ProtoTree DEFAULT17_tree=null;
        ProtoTree char_literal18_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:172:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:172:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT17=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default966); 
            DEFAULT17_tree = (ProtoTree)adaptor.create(DEFAULT17);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT17_tree, root_0);

            char_literal18=(Token)match(input,51,FOLLOW_51_in_constraint_default969); 
            pushFollow(FOLLOW_literal_in_constraint_default972);
            literal19=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal19.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:174:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
    public final ProtoParser.dimension_return dimension() throws RecognitionException {
        ProtoParser.dimension_return retval = new ProtoParser.dimension_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal20=null;
        Token INTEGER21=null;
        Token char_literal22=null;
        Token char_literal23=null;
        Token char_literal24=null;

        ProtoTree char_literal20_tree=null;
        ProtoTree INTEGER21_tree=null;
        ProtoTree char_literal22_tree=null;
        ProtoTree char_literal23_tree=null;
        ProtoTree char_literal24_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:175:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==53) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:175:4: '[' INTEGER ']'
                    {
                    char_literal20=(Token)match(input,52,FOLLOW_52_in_dimension982);  
                    stream_52.add(char_literal20);

                    INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension984);  
                    stream_INTEGER.add(INTEGER21);

                    char_literal22=(Token)match(input,53,FOLLOW_53_in_dimension986);  
                    stream_53.add(char_literal22);



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
                    // 175:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:175:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:176:4: '[' ']'
                    {
                    char_literal23=(Token)match(input,52,FOLLOW_52_in_dimension999);  
                    stream_52.add(char_literal23);

                    char_literal24=(Token)match(input,53,FOLLOW_53_in_dimension1001);  
                    stream_53.add(char_literal24);



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
                    // 176:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:176:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:179:1: enum_element : ( binding | IDENTIFIER ( enum_value )? ';' );
    public final ProtoParser.enum_element_return enum_element() throws RecognitionException {
        ProtoParser.enum_element_return retval = new ProtoParser.enum_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER26=null;
        Token char_literal28=null;
        ProtoParser.binding_return binding25 = null;

        ProtoParser.enum_value_return enum_value27 = null;


        ProtoTree IDENTIFIER26_tree=null;
        ProtoTree char_literal28_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:180:3: ( binding | IDENTIFIER ( enum_value )? ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:180:5: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_enum_element1019);
                    binding25=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding25.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:181:5: IDENTIFIER ( enum_value )? ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER26=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element1025); 
                    IDENTIFIER26_tree = (ProtoTree)adaptor.create(IDENTIFIER26);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER26_tree, root_0);

                    // org/fudgemsg/proto/antlr/Proto.g:181:17: ( enum_value )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==51) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:181:17: enum_value
                            {
                            pushFollow(FOLLOW_enum_value_in_enum_element1028);
                            enum_value27=enum_value();

                            state._fsp--;

                            adaptor.addChild(root_0, enum_value27.getTree());

                            }
                            break;

                    }

                    char_literal28=(Token)match(input,50,FOLLOW_50_in_enum_element1031); 

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
    // org/fudgemsg/proto/antlr/Proto.g:184:1: enum_value : '=' ( INTEGER | STRING ) ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal29=null;
        Token set30=null;

        ProtoTree char_literal29_tree=null;
        ProtoTree set30_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:184:12: ( '=' ( INTEGER | STRING ) )
            // org/fudgemsg/proto/antlr/Proto.g:184:14: '=' ( INTEGER | STRING )
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal29=(Token)match(input,51,FOLLOW_51_in_enum_value1043); 
            set30=(Token)input.LT(1);
            if ( input.LA(1)==INTEGER||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set30));
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
    // org/fudgemsg/proto/antlr/Proto.g:186:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default31 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:186:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:186:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint1061);
            constraint_default31=constraint_default();

            state._fsp--;

            adaptor.addChild(root_0, constraint_default31.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:188:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
    public final ProtoParser.field_constraints_return field_constraints() throws RecognitionException {
        ProtoParser.field_constraints_return retval = new ProtoParser.field_constraints_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        ProtoParser.field_constraint_return field_constraint33 = null;

        ProtoParser.field_constraint_return field_constraint35 = null;


        ProtoTree char_literal32_tree=null;
        ProtoTree char_literal34_tree=null;
        ProtoTree char_literal36_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:188:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:188:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal32=(Token)match(input,52,FOLLOW_52_in_field_constraints1070); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints1073);
            field_constraint33=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint33.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:188:43: ( ',' field_constraint )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==54) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:188:44: ',' field_constraint
            	    {
            	    char_literal34=(Token)match(input,54,FOLLOW_54_in_field_constraints1076); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints1079);
            	    field_constraint35=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint35.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal36=(Token)match(input,53,FOLLOW_53_in_field_constraints1083); 

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
    // org/fudgemsg/proto/antlr/Proto.g:190:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal37=null;
        Token INTEGER38=null;

        ProtoTree char_literal37_tree=null;
        ProtoTree INTEGER38_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:190:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:190:17: '=' INTEGER
            {
            char_literal37=(Token)match(input,51,FOLLOW_51_in_field_ordinal1093);  
            stream_51.add(char_literal37);

            INTEGER38=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal1095);  
            stream_INTEGER.add(INTEGER38);



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
            // 190:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:190:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:193:1: field_modifier : ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set39=null;

        ProtoTree set39_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:194:2: ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set39=(Token)input.LT(1);
            if ( input.LA(1)==MUTABLE||input.LA(1)==OPTIONAL||(input.LA(1)>=READONLY && input.LA(1)<=REQUIRED) ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set39));
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
    // org/fudgemsg/proto/antlr/Proto.g:201:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype40 = null;

        ProtoParser.dimension_return dimension41 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:201:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:201:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype1144);
            field_basetype40=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype40.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:201:34: ( dimension )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==52) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:201:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype1146);
            	    dimension41=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension41.getTree());

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
            // 201:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:201:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:203:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL42=null;
        Token string_literal43=null;
        Token T_BYTE44=null;
        Token string_literal45=null;
        Token T_DATE46=null;
        Token T_DATETIME47=null;
        Token T_SHORT48=null;
        Token string_literal49=null;
        Token T_INT50=null;
        Token string_literal51=null;
        Token string_literal52=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token T_LONG57=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        Token string_literal62=null;
        Token T_FLOAT63=null;
        Token string_literal64=null;
        Token T_DOUBLE65=null;
        Token string_literal66=null;
        Token T_INDICATOR67=null;
        Token T_STRING68=null;
        Token T_TIME69=null;

        ProtoTree T_BOOL42_tree=null;
        ProtoTree string_literal43_tree=null;
        ProtoTree T_BYTE44_tree=null;
        ProtoTree string_literal45_tree=null;
        ProtoTree T_DATE46_tree=null;
        ProtoTree T_DATETIME47_tree=null;
        ProtoTree T_SHORT48_tree=null;
        ProtoTree string_literal49_tree=null;
        ProtoTree T_INT50_tree=null;
        ProtoTree string_literal51_tree=null;
        ProtoTree string_literal52_tree=null;
        ProtoTree string_literal53_tree=null;
        ProtoTree string_literal54_tree=null;
        ProtoTree string_literal55_tree=null;
        ProtoTree string_literal56_tree=null;
        ProtoTree T_LONG57_tree=null;
        ProtoTree string_literal58_tree=null;
        ProtoTree string_literal59_tree=null;
        ProtoTree string_literal60_tree=null;
        ProtoTree string_literal61_tree=null;
        ProtoTree string_literal62_tree=null;
        ProtoTree T_FLOAT63_tree=null;
        ProtoTree string_literal64_tree=null;
        ProtoTree T_DOUBLE65_tree=null;
        ProtoTree string_literal66_tree=null;
        ProtoTree T_INDICATOR67_tree=null;
        ProtoTree T_STRING68_tree=null;
        ProtoTree T_TIME69_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:204:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME )
            int alt9=28;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case T_BYTE:
                {
                alt9=3;
                }
                break;
            case 56:
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
            case 57:
                {
                alt9=8;
                }
                break;
            case T_INT:
                {
                alt9=9;
                }
                break;
            case 58:
                {
                alt9=10;
                }
                break;
            case 59:
                {
                alt9=11;
                }
                break;
            case 60:
                {
                alt9=12;
                }
                break;
            case 61:
                {
                alt9=13;
                }
                break;
            case 62:
                {
                alt9=14;
                }
                break;
            case 63:
                {
                alt9=15;
                }
                break;
            case T_LONG:
                {
                alt9=16;
                }
                break;
            case 64:
                {
                alt9=17;
                }
                break;
            case 65:
                {
                alt9=18;
                }
                break;
            case 66:
                {
                alt9=19;
                }
                break;
            case 67:
                {
                alt9=20;
                }
                break;
            case 68:
                {
                alt9=21;
                }
                break;
            case T_FLOAT:
                {
                alt9=22;
                }
                break;
            case 69:
                {
                alt9=23;
                }
                break;
            case T_DOUBLE:
                {
                alt9=24;
                }
                break;
            case 70:
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
                    // org/fudgemsg/proto/antlr/Proto.g:204:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL42=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype1168); 
                    T_BOOL42_tree = (ProtoTree)adaptor.create(T_BOOL42);
                    adaptor.addChild(root_0, T_BOOL42_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: 'boolean'
                    {
                    string_literal43=(Token)match(input,55,FOLLOW_55_in_field_primtype1173);  
                    stream_55.add(string_literal43);



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
                    // 205:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:205:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE44=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype1184); 
                    T_BYTE44_tree = (ProtoTree)adaptor.create(T_BYTE44);
                    adaptor.addChild(root_0, T_BYTE44_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: 'int8'
                    {
                    string_literal45=(Token)match(input,56,FOLLOW_56_in_field_primtype1189);  
                    stream_56.add(string_literal45);



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
                    // 207:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:207:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: T_DATE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATE46=(Token)match(input,T_DATE,FOLLOW_T_DATE_in_field_primtype1200); 
                    T_DATE46_tree = (ProtoTree)adaptor.create(T_DATE46);
                    adaptor.addChild(root_0, T_DATE46_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: T_DATETIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATETIME47=(Token)match(input,T_DATETIME,FOLLOW_T_DATETIME_in_field_primtype1205); 
                    T_DATETIME47_tree = (ProtoTree)adaptor.create(T_DATETIME47);
                    adaptor.addChild(root_0, T_DATETIME47_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT48=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1210); 
                    T_SHORT48_tree = (ProtoTree)adaptor.create(T_SHORT48);
                    adaptor.addChild(root_0, T_SHORT48_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: 'int16'
                    {
                    string_literal49=(Token)match(input,57,FOLLOW_57_in_field_primtype1215);  
                    stream_57.add(string_literal49);



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
                    // 211:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:211:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT50=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1226); 
                    T_INT50_tree = (ProtoTree)adaptor.create(T_INT50);
                    adaptor.addChild(root_0, T_INT50_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:213:4: 'int32'
                    {
                    string_literal51=(Token)match(input,58,FOLLOW_58_in_field_primtype1231);  
                    stream_58.add(string_literal51);



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
                    // 213:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:213:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:214:4: 'uint32'
                    {
                    string_literal52=(Token)match(input,59,FOLLOW_59_in_field_primtype1242);  
                    stream_59.add(string_literal52);



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
                    // 214:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:214:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: 'sint32'
                    {
                    string_literal53=(Token)match(input,60,FOLLOW_60_in_field_primtype1253);  
                    stream_60.add(string_literal53);



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
                    // 215:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:215:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:216:4: 'fixed32'
                    {
                    string_literal54=(Token)match(input,61,FOLLOW_61_in_field_primtype1264);  
                    stream_61.add(string_literal54);



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
                    // 216:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:216:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:217:4: 'sfixed32'
                    {
                    string_literal55=(Token)match(input,62,FOLLOW_62_in_field_primtype1275);  
                    stream_62.add(string_literal55);



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
                    // 217:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:217:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:218:4: 'integer'
                    {
                    string_literal56=(Token)match(input,63,FOLLOW_63_in_field_primtype1286);  
                    stream_63.add(string_literal56);



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
                    // 218:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:218:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:219:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG57=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1297); 
                    T_LONG57_tree = (ProtoTree)adaptor.create(T_LONG57);
                    adaptor.addChild(root_0, T_LONG57_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:220:4: 'int64'
                    {
                    string_literal58=(Token)match(input,64,FOLLOW_64_in_field_primtype1302);  
                    stream_64.add(string_literal58);



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
                    // 220:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:220:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:221:4: 'uint64'
                    {
                    string_literal59=(Token)match(input,65,FOLLOW_65_in_field_primtype1313);  
                    stream_65.add(string_literal59);



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
                    // 221:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:221:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:222:4: 'sint64'
                    {
                    string_literal60=(Token)match(input,66,FOLLOW_66_in_field_primtype1324);  
                    stream_66.add(string_literal60);



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
                    // 222:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:222:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:223:4: 'fixed64'
                    {
                    string_literal61=(Token)match(input,67,FOLLOW_67_in_field_primtype1335);  
                    stream_67.add(string_literal61);



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
                    // 223:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:223:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:224:4: 'sfixed64'
                    {
                    string_literal62=(Token)match(input,68,FOLLOW_68_in_field_primtype1346);  
                    stream_68.add(string_literal62);



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
                    // 224:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:224:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:225:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT63=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1357); 
                    T_FLOAT63_tree = (ProtoTree)adaptor.create(T_FLOAT63);
                    adaptor.addChild(root_0, T_FLOAT63_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:226:4: 'float32'
                    {
                    string_literal64=(Token)match(input,69,FOLLOW_69_in_field_primtype1362);  
                    stream_69.add(string_literal64);



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
                    // 226:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:226:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:227:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE65=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1373); 
                    T_DOUBLE65_tree = (ProtoTree)adaptor.create(T_DOUBLE65);
                    adaptor.addChild(root_0, T_DOUBLE65_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:228:4: 'float64'
                    {
                    string_literal66=(Token)match(input,70,FOLLOW_70_in_field_primtype1378);  
                    stream_70.add(string_literal66);



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
                    // 228:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:228:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:229:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR67=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1389); 
                    T_INDICATOR67_tree = (ProtoTree)adaptor.create(T_INDICATOR67);
                    adaptor.addChild(root_0, T_INDICATOR67_tree);


                    }
                    break;
                case 27 :
                    // org/fudgemsg/proto/antlr/Proto.g:230:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING68=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1394); 
                    T_STRING68_tree = (ProtoTree)adaptor.create(T_STRING68);
                    adaptor.addChild(root_0, T_STRING68_tree);


                    }
                    break;
                case 28 :
                    // org/fudgemsg/proto/antlr/Proto.g:231:4: T_TIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_TIME69=(Token)match(input,T_TIME,FOLLOW_T_TIME_in_field_primtype1399); 
                    T_TIME69_tree = (ProtoTree)adaptor.create(T_TIME69);
                    adaptor.addChild(root_0, T_TIME69_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:234:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype70 = null;

        ProtoParser.fullidentifier_return fullidentifier71 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:235:2: ( field_primtype | fullidentifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=T_BOOL && LA10_0<=T_TIME)||(LA10_0>=55 && LA10_0<=70)) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:235:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1410);
                    field_primtype70=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype70.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:236:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1415);
                    fullidentifier71=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier71.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:239:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype72 = null;

        ProtoParser.field_arraytype_return field_arraytype73 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:240:2: ( field_basetype | field_arraytype )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:240:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1426);
                    field_basetype72=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype72.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:241:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1431);
                    field_arraytype73=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype73.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:244:1: fullidentifier : IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER74=null;
        Token char_literal75=null;
        Token IDENTIFIER76=null;
        ProtoParser.anyword_return anyword77 = null;


        ProtoTree IDENTIFIER74_tree=null;
        ProtoTree char_literal75_tree=null;
        ProtoTree IDENTIFIER76_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:244:16: ( IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* )
            // org/fudgemsg/proto/antlr/Proto.g:244:18: IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1441); 
            IDENTIFIER74_tree = (ProtoTree)adaptor.create(IDENTIFIER74);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER74_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:244:30: ( '.' ( IDENTIFIER | anyword ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==71) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:244:31: '.' ( IDENTIFIER | anyword )
            	    {
            	    char_literal75=(Token)match(input,71,FOLLOW_71_in_fullidentifier1445); 
            	    // org/fudgemsg/proto/antlr/Proto.g:244:36: ( IDENTIFIER | anyword )
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
            	            // org/fudgemsg/proto/antlr/Proto.g:244:37: IDENTIFIER
            	            {
            	            IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1449); 
            	            IDENTIFIER76_tree = (ProtoTree)adaptor.create(IDENTIFIER76);
            	            adaptor.addChild(root_0, IDENTIFIER76_tree);


            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:244:50: anyword
            	            {
            	            pushFollow(FOLLOW_anyword_in_fullidentifier1453);
            	            anyword77=anyword();

            	            state._fsp--;

            	            adaptor.addChild(root_0, anyword77.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:246:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING | '(' ( literal )? ( ',' literal )* ')' -> ^( MESSAGE ( literal )* ) );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER78=null;
        Token INTEGER79=null;
        Token FLOAT80=null;
        Token STRING81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        ProtoParser.literal_return literal83 = null;

        ProtoParser.literal_return literal85 = null;


        ProtoTree IDENTIFIER78_tree=null;
        ProtoTree INTEGER79_tree=null;
        ProtoTree FLOAT80_tree=null;
        ProtoTree STRING81_tree=null;
        ProtoTree char_literal82_tree=null;
        ProtoTree char_literal84_tree=null;
        ProtoTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:247:2: ( IDENTIFIER | INTEGER | FLOAT | STRING | '(' ( literal )? ( ',' literal )* ')' -> ^( MESSAGE ( literal )* ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case INTEGER:
                {
                alt16=2;
                }
                break;
            case FLOAT:
                {
                alt16=3;
                }
                break;
            case STRING:
                {
                alt16=4;
                }
                break;
            case 72:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:247:4: IDENTIFIER
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_literal1466); 
                    IDENTIFIER78_tree = (ProtoTree)adaptor.create(IDENTIFIER78);
                    adaptor.addChild(root_0, IDENTIFIER78_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:248:4: INTEGER
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    INTEGER79=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal1471); 
                    INTEGER79_tree = (ProtoTree)adaptor.create(INTEGER79);
                    adaptor.addChild(root_0, INTEGER79_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:4: FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    FLOAT80=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal1476); 
                    FLOAT80_tree = (ProtoTree)adaptor.create(FLOAT80);
                    adaptor.addChild(root_0, FLOAT80_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:250:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING81=(Token)match(input,STRING,FOLLOW_STRING_in_literal1481); 
                    STRING81_tree = (ProtoTree)adaptor.create(STRING81);
                    adaptor.addChild(root_0, STRING81_tree);


                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:251:4: '(' ( literal )? ( ',' literal )* ')'
                    {
                    char_literal82=(Token)match(input,72,FOLLOW_72_in_literal1486);  
                    stream_72.add(char_literal82);

                    // org/fudgemsg/proto/antlr/Proto.g:251:8: ( literal )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=IDENTIFIER && LA14_0<=FLOAT)||LA14_0==STRING||LA14_0==72) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:251:8: literal
                            {
                            pushFollow(FOLLOW_literal_in_literal1488);
                            literal83=literal();

                            state._fsp--;

                            stream_literal.add(literal83.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:251:17: ( ',' literal )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==54) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:251:18: ',' literal
                    	    {
                    	    char_literal84=(Token)match(input,54,FOLLOW_54_in_literal1492);  
                    	    stream_54.add(char_literal84);

                    	    pushFollow(FOLLOW_literal_in_literal1494);
                    	    literal85=literal();

                    	    state._fsp--;

                    	    stream_literal.add(literal85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    char_literal86=(Token)match(input,73,FOLLOW_73_in_literal1498);  
                    stream_73.add(char_literal86);



                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 251:36: -> ^( MESSAGE ( literal )* )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:251:39: ^( MESSAGE ( literal )* )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(MESSAGE, "MESSAGE"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:251:49: ( literal )*
                        while ( stream_literal.hasNext() ) {
                            adaptor.addChild(root_1, stream_literal.nextTree());

                        }
                        stream_literal.reset();

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
    // $ANTLR end "literal"

    public static class message_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // org/fudgemsg/proto/antlr/Proto.g:254:1: message : ( ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' | MESSAGE IDENTIFIER ';' -> ^( EXTERN MESSAGE IDENTIFIER FORWARD ) );
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ABSTRACT87=null;
        Token MESSAGE88=null;
        Token IDENTIFIER89=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token MESSAGE95=null;
        Token IDENTIFIER96=null;
        Token char_literal97=null;
        ProtoParser.message_uses_return message_uses90 = null;

        ProtoParser.message_extends_return message_extends91 = null;

        ProtoParser.message_element_return message_element93 = null;


        ProtoTree ABSTRACT87_tree=null;
        ProtoTree MESSAGE88_tree=null;
        ProtoTree IDENTIFIER89_tree=null;
        ProtoTree char_literal92_tree=null;
        ProtoTree char_literal94_tree=null;
        ProtoTree MESSAGE95_tree=null;
        ProtoTree IDENTIFIER96_tree=null;
        ProtoTree char_literal97_tree=null;
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:255:3: ( ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' | MESSAGE IDENTIFIER ';' -> ^( EXTERN MESSAGE IDENTIFIER FORWARD ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ABSTRACT) ) {
                alt21=1;
            }
            else if ( (LA21_0==MESSAGE) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==IDENTIFIER) ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3==50) ) {
                        alt21=2;
                    }
                    else if ( (LA21_3==EXTENDS||LA21_3==USES||LA21_3==48) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:255:5: ( ABSTRACT )? MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    // org/fudgemsg/proto/antlr/Proto.g:255:5: ( ABSTRACT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ABSTRACT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:255:5: ABSTRACT
                            {
                            ABSTRACT87=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_message1519); 
                            ABSTRACT87_tree = (ProtoTree)adaptor.create(ABSTRACT87);
                            adaptor.addChild(root_0, ABSTRACT87_tree);


                            }
                            break;

                    }

                    MESSAGE88=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1522); 
                    MESSAGE88_tree = (ProtoTree)adaptor.create(MESSAGE88);
                    root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE88_tree, root_0);

                    IDENTIFIER89=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1525); 
                    IDENTIFIER89_tree = (ProtoTree)adaptor.create(IDENTIFIER89);
                    adaptor.addChild(root_0, IDENTIFIER89_tree);

                    // org/fudgemsg/proto/antlr/Proto.g:255:35: ( message_uses )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==USES) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:255:35: message_uses
                            {
                            pushFollow(FOLLOW_message_uses_in_message1527);
                            message_uses90=message_uses();

                            state._fsp--;

                            adaptor.addChild(root_0, message_uses90.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:255:49: ( message_extends )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==EXTENDS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:255:49: message_extends
                            {
                            pushFollow(FOLLOW_message_extends_in_message1530);
                            message_extends91=message_extends();

                            state._fsp--;

                            adaptor.addChild(root_0, message_extends91.getTree());

                            }
                            break;

                    }

                    char_literal92=(Token)match(input,48,FOLLOW_48_in_message1533); 
                    // org/fudgemsg/proto/antlr/Proto.g:255:71: ( message_element )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==ABSTRACT||LA20_0==BINDING||LA20_0==ENUM||(LA20_0>=MESSAGE && LA20_0<=MUTABLE)||LA20_0==OPTIONAL||(LA20_0>=READONLY && LA20_0<=REQUIRED)||(LA20_0>=T_BOOL && LA20_0<=T_TIME)||LA20_0==TYPEDEF||LA20_0==IDENTIFIER||(LA20_0>=55 && LA20_0<=70)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:255:71: message_element
                    	    {
                    	    pushFollow(FOLLOW_message_element_in_message1536);
                    	    message_element93=message_element();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, message_element93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    char_literal94=(Token)match(input,49,FOLLOW_49_in_message1539); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:256:5: MESSAGE IDENTIFIER ';'
                    {
                    MESSAGE95=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1546);  
                    stream_MESSAGE.add(MESSAGE95);

                    IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1548);  
                    stream_IDENTIFIER.add(IDENTIFIER96);

                    char_literal97=(Token)match(input,50,FOLLOW_50_in_message1550);  
                    stream_50.add(char_literal97);



                    // AST REWRITE
                    // elements: IDENTIFIER, MESSAGE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 256:28: -> ^( EXTERN MESSAGE IDENTIFIER FORWARD )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:256:31: ^( EXTERN MESSAGE IDENTIFIER FORWARD )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(EXTERN, "EXTERN"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        adaptor.addChild(root_1, (ProtoTree)adaptor.create(FORWARD, "FORWARD"));

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
    // $ANTLR end "message"

    public static class message_element_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_element"
    // org/fudgemsg/proto/antlr/Proto.g:259:1: message_element : ( message_enum | message_field | message_submsg | binding | typedef );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum98 = null;

        ProtoParser.message_field_return message_field99 = null;

        ProtoParser.message_submsg_return message_submsg100 = null;

        ProtoParser.binding_return binding101 = null;

        ProtoParser.typedef_return typedef102 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:260:2: ( message_enum | message_field | message_submsg | binding | typedef )
            int alt22=5;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt22=1;
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
            case 69:
            case 70:
                {
                alt22=2;
                }
                break;
            case ABSTRACT:
            case MESSAGE:
                {
                alt22=3;
                }
                break;
            case BINDING:
                {
                alt22=4;
                }
                break;
            case TYPEDEF:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:260:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1574);
                    message_enum98=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum98.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:261:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1579);
                    message_field99=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field99.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:262:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1584);
                    message_submsg100=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg100.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:263:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1589);
                    binding101=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding101.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:264:4: typedef
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_typedef_in_message_element1594);
                    typedef102=typedef();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef102.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:267:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM103=null;
        Token IDENTIFIER104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        ProtoParser.enum_element_return enum_element106 = null;


        ProtoTree ENUM103_tree=null;
        ProtoTree IDENTIFIER104_tree=null;
        ProtoTree char_literal105_tree=null;
        ProtoTree char_literal107_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:267:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:267:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM103=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1604); 
            ENUM103_tree = (ProtoTree)adaptor.create(ENUM103);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM103_tree, root_0);

            IDENTIFIER104=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1607); 
            IDENTIFIER104_tree = (ProtoTree)adaptor.create(IDENTIFIER104);
            adaptor.addChild(root_0, IDENTIFIER104_tree);

            char_literal105=(Token)match(input,48,FOLLOW_48_in_message_enum1609); 
            // org/fudgemsg/proto/antlr/Proto.g:267:38: ( enum_element )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==BINDING||LA23_0==IDENTIFIER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:267:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1612);
            	    enum_element106=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element106.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            char_literal107=(Token)match(input,49,FOLLOW_49_in_message_enum1615); 

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
    // org/fudgemsg/proto/antlr/Proto.g:269:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER110=null;
        Token char_literal113=null;
        Token MESSAGE115=null;
        Token IDENTIFIER116=null;
        Token char_literal119=null;
        Token MESSAGE121=null;
        Token IDENTIFIER123=null;
        Token char_literal126=null;
        ProtoParser.field_modifier_return field_modifier108 = null;

        ProtoParser.field_type_return field_type109 = null;

        ProtoParser.field_ordinal_return field_ordinal111 = null;

        ProtoParser.field_constraints_return field_constraints112 = null;

        ProtoParser.field_modifier_return field_modifier114 = null;

        ProtoParser.field_ordinal_return field_ordinal117 = null;

        ProtoParser.field_constraints_return field_constraints118 = null;

        ProtoParser.field_modifier_return field_modifier120 = null;

        ProtoParser.dimension_return dimension122 = null;

        ProtoParser.field_ordinal_return field_ordinal124 = null;

        ProtoParser.field_constraints_return field_constraints125 = null;


        ProtoTree IDENTIFIER110_tree=null;
        ProtoTree char_literal113_tree=null;
        ProtoTree MESSAGE115_tree=null;
        ProtoTree IDENTIFIER116_tree=null;
        ProtoTree char_literal119_tree=null;
        ProtoTree MESSAGE121_tree=null;
        ProtoTree IDENTIFIER123_tree=null;
        ProtoTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:270:3: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            int alt34=3;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:270:5: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:270:5: ( field_modifier )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==MUTABLE||LA24_0==OPTIONAL||(LA24_0>=READONLY && LA24_0<=REQUIRED)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:270:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1627);
                    	    field_modifier108=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    pushFollow(FOLLOW_field_type_in_message_field1630);
                    field_type109=field_type();

                    state._fsp--;

                    stream_field_type.add(field_type109.getTree());
                    IDENTIFIER110=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1632);  
                    stream_IDENTIFIER.add(IDENTIFIER110);

                    // org/fudgemsg/proto/antlr/Proto.g:270:43: ( field_ordinal )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==51) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:270:43: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1634);
                            field_ordinal111=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal111.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:270:58: ( field_constraints )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==52) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:270:58: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1637);
                            field_constraints112=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints112.getTree());

                            }
                            break;

                    }

                    char_literal113=(Token)match(input,50,FOLLOW_50_in_message_field1640);  
                    stream_50.add(char_literal113);



                    // AST REWRITE
                    // elements: field_modifier, IDENTIFIER, field_constraints, field_type, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 270:81: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:270:84: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_field_type.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:270:114: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:270:130: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:270:145: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:271:5: ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:271:5: ( field_modifier )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==MUTABLE||LA27_0==OPTIONAL||(LA27_0>=READONLY && LA27_0<=REQUIRED)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:271:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1665);
                    	    field_modifier114=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier114.getTree());

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

                    MESSAGE115=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1668);  
                    stream_MESSAGE.add(MESSAGE115);

                    IDENTIFIER116=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1670);  
                    stream_IDENTIFIER.add(IDENTIFIER116);

                    // org/fudgemsg/proto/antlr/Proto.g:271:40: ( field_ordinal )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==51) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:271:40: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1672);
                            field_ordinal117=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal117.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:271:55: ( field_constraints )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==52) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:271:55: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1675);
                            field_constraints118=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints118.getTree());

                            }
                            break;

                    }

                    char_literal119=(Token)match(input,50,FOLLOW_50_in_message_field1678);  
                    stream_50.add(char_literal119);



                    // AST REWRITE
                    // elements: field_ordinal, field_constraints, field_modifier, MESSAGE, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 271:78: -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:271:81: ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:271:108: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:271:124: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:271:139: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:272:5: ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:272:5: ( field_modifier )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==MUTABLE||LA30_0==OPTIONAL||(LA30_0>=READONLY && LA30_0<=REQUIRED)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:272:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1703);
                    	    field_modifier120=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    MESSAGE121=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1706);  
                    stream_MESSAGE.add(MESSAGE121);

                    // org/fudgemsg/proto/antlr/Proto.g:272:29: ( dimension )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==52) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:272:29: dimension
                    	    {
                    	    pushFollow(FOLLOW_dimension_in_message_field1708);
                    	    dimension122=dimension();

                    	    state._fsp--;

                    	    stream_dimension.add(dimension122.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    IDENTIFIER123=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1711);  
                    stream_IDENTIFIER.add(IDENTIFIER123);

                    // org/fudgemsg/proto/antlr/Proto.g:272:51: ( field_ordinal )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==51) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:272:51: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1713);
                            field_ordinal124=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal124.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:272:66: ( field_constraints )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==52) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:272:66: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1716);
                            field_constraints125=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints125.getTree());

                            }
                            break;

                    }

                    char_literal126=(Token)match(input,50,FOLLOW_50_in_message_field1719);  
                    stream_50.add(char_literal126);



                    // AST REWRITE
                    // elements: field_modifier, IDENTIFIER, dimension, field_ordinal, MESSAGE, field_constraints
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 272:89: -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:272:92: ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:272:100: ^( ARRAY MESSAGE ( dimension )+ )
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
                        // org/fudgemsg/proto/antlr/Proto.g:272:139: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:272:155: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:272:170: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:275:1: message_submsg : ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ABSTRACT127=null;
        Token MESSAGE128=null;
        Token IDENTIFIER129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        ProtoParser.message_element_return message_element131 = null;


        ProtoTree ABSTRACT127_tree=null;
        ProtoTree MESSAGE128_tree=null;
        ProtoTree IDENTIFIER129_tree=null;
        ProtoTree char_literal130_tree=null;
        ProtoTree char_literal132_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:275:16: ( ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:275:18: ( ABSTRACT )? MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            // org/fudgemsg/proto/antlr/Proto.g:275:18: ( ABSTRACT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ABSTRACT) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:275:18: ABSTRACT
                    {
                    ABSTRACT127=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_message_submsg1756); 
                    ABSTRACT127_tree = (ProtoTree)adaptor.create(ABSTRACT127);
                    adaptor.addChild(root_0, ABSTRACT127_tree);


                    }
                    break;

            }

            MESSAGE128=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1759); 
            MESSAGE128_tree = (ProtoTree)adaptor.create(MESSAGE128);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE128_tree, root_0);

            IDENTIFIER129=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1762); 
            IDENTIFIER129_tree = (ProtoTree)adaptor.create(IDENTIFIER129);
            adaptor.addChild(root_0, IDENTIFIER129_tree);

            char_literal130=(Token)match(input,48,FOLLOW_48_in_message_submsg1764); 
            // org/fudgemsg/proto/antlr/Proto.g:275:53: ( message_element )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==ABSTRACT||LA36_0==BINDING||LA36_0==ENUM||(LA36_0>=MESSAGE && LA36_0<=MUTABLE)||LA36_0==OPTIONAL||(LA36_0>=READONLY && LA36_0<=REQUIRED)||(LA36_0>=T_BOOL && LA36_0<=T_TIME)||LA36_0==TYPEDEF||LA36_0==IDENTIFIER||(LA36_0>=55 && LA36_0<=70)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:275:53: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1767);
            	    message_element131=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element131.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            char_literal132=(Token)match(input,49,FOLLOW_49_in_message_submsg1770); 

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
    // org/fudgemsg/proto/antlr/Proto.g:278:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES133=null;
        Token char_literal135=null;
        ProtoParser.fullidentifier_return fullidentifier134 = null;

        ProtoParser.fullidentifier_return fullidentifier136 = null;


        ProtoTree USES133_tree=null;
        ProtoTree char_literal135_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:278:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:278:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES133=(Token)match(input,USES,FOLLOW_USES_in_message_uses1781); 
            USES133_tree = (ProtoTree)adaptor.create(USES133);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES133_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1784);
            fullidentifier134=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier134.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:278:37: ( ',' fullidentifier )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==54) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:278:38: ',' fullidentifier
            	    {
            	    char_literal135=(Token)match(input,54,FOLLOW_54_in_message_uses1787); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1790);
            	    fullidentifier136=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier136.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // org/fudgemsg/proto/antlr/Proto.g:281:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_extends_return message_extends() throws RecognitionException {
        ProtoParser.message_extends_return retval = new ProtoParser.message_extends_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTENDS137=null;
        Token char_literal139=null;
        ProtoParser.fullidentifier_return fullidentifier138 = null;

        ProtoParser.fullidentifier_return fullidentifier140 = null;


        ProtoTree EXTENDS137_tree=null;
        ProtoTree char_literal139_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:281:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:281:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS137=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1802); 
            EXTENDS137_tree = (ProtoTree)adaptor.create(EXTENDS137);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS137_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1805);
            fullidentifier138=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier138.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:281:43: ( ',' fullidentifier )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==54) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:281:44: ',' fullidentifier
            	    {
            	    char_literal139=(Token)match(input,54,FOLLOW_54_in_message_extends1808); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1811);
            	    fullidentifier140=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier140.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // org/fudgemsg/proto/antlr/Proto.g:283:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        ProtoParser.fullidentifier_return fullidentifier142 = null;

        ProtoParser.root_object_return root_object144 = null;


        ProtoTree NAMESPACE141_tree=null;
        ProtoTree char_literal143_tree=null;
        ProtoTree char_literal145_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:283:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:283:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE141=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1822); 
            NAMESPACE141_tree = (ProtoTree)adaptor.create(NAMESPACE141);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE141_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1825);
            fullidentifier142=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier142.getTree());
            char_literal143=(Token)match(input,48,FOLLOW_48_in_namespace1827); 
            // org/fudgemsg/proto/antlr/Proto.g:283:44: ( root_object )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ABSTRACT||LA39_0==ENUM||LA39_0==EXTERN||LA39_0==MESSAGE||LA39_0==NAMESPACE||(LA39_0>=TAXONOMY && LA39_0<=TYPEDEF)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:283:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1830);
            	    root_object144=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object144.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            char_literal145=(Token)match(input,49,FOLLOW_49_in_namespace1833); 

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
    // org/fudgemsg/proto/antlr/Proto.g:285:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object146 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:285:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:285:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:285:8: ( root_object )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ABSTRACT||LA40_0==ENUM||LA40_0==EXTERN||LA40_0==MESSAGE||LA40_0==NAMESPACE||(LA40_0>=TAXONOMY && LA40_0<=TYPEDEF)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:285:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1843);
            	    root_object146=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object146.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
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
            // 285:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:285:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:285:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:287:1: root_object : ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ';' | EXTERN typedef | message | message_enum | namespace | taxonomy | typedef );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTERN147=null;
        Token set148=null;
        Token char_literal150=null;
        Token EXTERN151=null;
        ProtoParser.fullidentifier_return fullidentifier149 = null;

        ProtoParser.typedef_return typedef152 = null;

        ProtoParser.message_return message153 = null;

        ProtoParser.message_enum_return message_enum154 = null;

        ProtoParser.namespace_return namespace155 = null;

        ProtoParser.taxonomy_return taxonomy156 = null;

        ProtoParser.typedef_return typedef157 = null;


        ProtoTree EXTERN147_tree=null;
        ProtoTree set148_tree=null;
        ProtoTree char_literal150_tree=null;
        ProtoTree EXTERN151_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:288:3: ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ';' | EXTERN typedef | message | message_enum | namespace | taxonomy | typedef )
            int alt41=7;
            switch ( input.LA(1) ) {
            case EXTERN:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==ENUM||LA41_1==MESSAGE||LA41_1==TAXONOMY) ) {
                    alt41=1;
                }
                else if ( (LA41_1==TYPEDEF) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
                }
                break;
            case ABSTRACT:
            case MESSAGE:
                {
                alt41=3;
                }
                break;
            case ENUM:
                {
                alt41=4;
                }
                break;
            case NAMESPACE:
                {
                alt41=5;
                }
                break;
            case TAXONOMY:
                {
                alt41=6;
                }
                break;
            case TYPEDEF:
                {
                alt41=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:288:5: EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN147=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1863); 
                    EXTERN147_tree = (ProtoTree)adaptor.create(EXTERN147);
                    root_0 = (ProtoTree)adaptor.becomeRoot(EXTERN147_tree, root_0);

                    set148=(Token)input.LT(1);
                    if ( input.LA(1)==ENUM||input.LA(1)==MESSAGE||input.LA(1)==TAXONOMY ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProtoTree)adaptor.create(set148));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_fullidentifier_in_root_object1878);
                    fullidentifier149=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier149.getTree());
                    char_literal150=(Token)match(input,50,FOLLOW_50_in_root_object1880); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:289:5: EXTERN typedef
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN151=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1887); 
                    EXTERN151_tree = (ProtoTree)adaptor.create(EXTERN151);
                    root_0 = (ProtoTree)adaptor.becomeRoot(EXTERN151_tree, root_0);

                    pushFollow(FOLLOW_typedef_in_root_object1890);
                    typedef152=typedef();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef152.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:290:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1895);
                    message153=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message153.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:291:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1900);
                    message_enum154=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum154.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:292:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1905);
                    namespace155=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace155.getTree());

                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:293:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1910);
                    taxonomy156=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy156.getTree());

                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:294:4: typedef
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_typedef_in_root_object1915);
                    typedef157=typedef();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef157.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:297:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY158=null;
        Token IDENTIFIER159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        ProtoParser.taxonomy_element_return taxonomy_element161 = null;


        ProtoTree TAXONOMY158_tree=null;
        ProtoTree IDENTIFIER159_tree=null;
        ProtoTree char_literal160_tree=null;
        ProtoTree char_literal162_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:297:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:297:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY158=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1925); 
            TAXONOMY158_tree = (ProtoTree)adaptor.create(TAXONOMY158);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY158_tree, root_0);

            IDENTIFIER159=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1928); 
            IDENTIFIER159_tree = (ProtoTree)adaptor.create(IDENTIFIER159);
            adaptor.addChild(root_0, IDENTIFIER159_tree);

            char_literal160=(Token)match(input,48,FOLLOW_48_in_taxonomy1930); 
            // org/fudgemsg/proto/antlr/Proto.g:297:38: ( taxonomy_element )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BINDING||LA42_0==IMPORT||LA42_0==IDENTIFIER) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:297:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1933);
            	    taxonomy_element161=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element161.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            char_literal162=(Token)match(input,49,FOLLOW_49_in_taxonomy1936); 

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
    // org/fudgemsg/proto/antlr/Proto.g:299:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT164=null;
        Token char_literal166=null;
        ProtoParser.enum_element_return enum_element163 = null;

        ProtoParser.fullidentifier_return fullidentifier165 = null;


        ProtoTree IMPORT164_tree=null;
        ProtoTree char_literal166_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:300:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==BINDING||LA43_0==IDENTIFIER) ) {
                alt43=1;
            }
            else if ( (LA43_0==IMPORT) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:300:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1947);
                    enum_element163=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element163.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:301:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT164=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1952); 
                    IMPORT164_tree = (ProtoTree)adaptor.create(IMPORT164);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT164_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1955);
                    fullidentifier165=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier165.getTree());
                    char_literal166=(Token)match(input,50,FOLLOW_50_in_taxonomy_element1957); 

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

    public static class typedef_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedef"
    // org/fudgemsg/proto/antlr/Proto.g:304:1: typedef : TYPEDEF fullidentifier '=' field_type ';' ;
    public final ProtoParser.typedef_return typedef() throws RecognitionException {
        ProtoParser.typedef_return retval = new ProtoParser.typedef_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TYPEDEF167=null;
        Token char_literal169=null;
        Token char_literal171=null;
        ProtoParser.fullidentifier_return fullidentifier168 = null;

        ProtoParser.field_type_return field_type170 = null;


        ProtoTree TYPEDEF167_tree=null;
        ProtoTree char_literal169_tree=null;
        ProtoTree char_literal171_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:304:9: ( TYPEDEF fullidentifier '=' field_type ';' )
            // org/fudgemsg/proto/antlr/Proto.g:304:11: TYPEDEF fullidentifier '=' field_type ';'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TYPEDEF167=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef1968); 
            TYPEDEF167_tree = (ProtoTree)adaptor.create(TYPEDEF167);
            root_0 = (ProtoTree)adaptor.becomeRoot(TYPEDEF167_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_typedef1971);
            fullidentifier168=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier168.getTree());
            char_literal169=(Token)match(input,51,FOLLOW_51_in_typedef1973); 
            pushFollow(FOLLOW_field_type_in_typedef1976);
            field_type170=field_type();

            state._fsp--;

            adaptor.addChild(root_0, field_type170.getTree());
            char_literal171=(Token)match(input,50,FOLLOW_50_in_typedef1978); 

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
    // $ANTLR end "typedef"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA11_eotS =
        "\43\uffff";
    static final String DFA11_eofS =
        "\43\uffff";
    static final String DFA11_minS =
        "\1\31\35\51\2\uffff\1\4\2\51";
    static final String DFA11_maxS =
        "\1\106\34\64\1\107\2\uffff\1\51\2\107";
    static final String DFA11_acceptS =
        "\36\uffff\1\2\1\1\3\uffff";
    static final String DFA11_specialS =
        "\43\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\3\1\30\1\5\1\6\1\26\1\32\1\11\1\20\1\7\1\33\1\34\4\uffff"+
            "\1\35\15\uffff\1\2\1\4\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\21\1\22\1\23\1\24\1\25\1\27\1\31",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36",
            "\1\37\10\uffff\1\37\1\uffff\1\36\22\uffff\1\40",
            "",
            "",
            "\1\42\1\uffff\2\42\2\uffff\3\42\2\uffff\5\42\1\uffff\3\42\1"+
            "\uffff\17\42\1\uffff\1\41",
            "\1\37\10\uffff\1\37\1\uffff\1\36\22\uffff\1\40",
            "\1\37\10\uffff\1\37\1\uffff\1\36\22\uffff\1\40"
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
            return "239:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
    static final String DFA34_eotS =
        "\6\uffff";
    static final String DFA34_eofS =
        "\6\uffff";
    static final String DFA34_minS =
        "\1\21\1\20\1\uffff\1\51\2\uffff";
    static final String DFA34_maxS =
        "\2\106\1\uffff\1\64\2\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA34_specialS =
        "\6\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\4\uffff\1\2\15\uffff"+
            "\20\2",
            "\1\3\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\4\uffff\1\2\15"+
            "\uffff\20\2",
            "",
            "\1\4\12\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "269:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_anyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding885 = new BitSet(new long[]{0x000042FFFEEF9CD0L});
    public static final BitSet FOLLOW_binding_anyword_in_binding888 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_binding890 = new BitSet(new long[]{0x000242FFFEEF9CD0L});
    public static final BitSet FOLLOW_binding_element_in_binding893 = new BitSet(new long[]{0x000242FFFEEF9CD0L});
    public static final BitSet FOLLOW_49_in_binding897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyword_in_binding_anyword913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element928 = new BitSet(new long[]{0x0000620000000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text940 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_binding_text942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text953 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_binding_text955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default966 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constraint_default969 = new BitSet(new long[]{0x00004E0000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_literal_in_constraint_default972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_dimension982 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension984 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_dimension986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_dimension999 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_dimension1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_enum_element1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element1025 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element1028 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_enum_element1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_enum_value1043 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_set_in_enum_value1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_constraints1070 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1073 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_54_in_field_constraints1076 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1079 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_field_constraints1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_ordinal1093 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_field_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype1144 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype1146 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATE_in_field_primtype1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATETIME_in_field_primtype1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_field_primtype1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_field_primtype1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_field_primtype1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_field_primtype1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_field_primtype1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_field_primtype1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_field_primtype1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_field_primtype1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_TIME_in_field_primtype1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1441 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_fullidentifier1445 = new BitSet(new long[]{0x000002FFFEEF9CD0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1449 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_anyword_in_fullidentifier1453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_IDENTIFIER_in_literal1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_literal1486 = new BitSet(new long[]{0x00404E0000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_literal_in_literal1488 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54_in_literal1492 = new BitSet(new long[]{0x00004E0000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_literal_in_literal1494 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_literal1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_message1519 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MESSAGE_in_message1522 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1525 = new BitSet(new long[]{0x0001008000000800L});
    public static final BitSet FOLLOW_message_uses_in_message1527 = new BitSet(new long[]{0x0001000000000800L});
    public static final BitSet FOLLOW_message_extends_in_message1530 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message1533 = new BitSet(new long[]{0xFF82025FFEEB0450L,0x000000000000007FL});
    public static final BitSet FOLLOW_message_element_in_message1536 = new BitSet(new long[]{0xFF82025FFEEB0450L,0x000000000000007FL});
    public static final BitSet FOLLOW_49_in_message1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1546 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1548 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_message1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_in_message_element1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1604 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1607 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message_enum1609 = new BitSet(new long[]{0x0002020000000040L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1612 = new BitSet(new long[]{0x0002020000000040L});
    public static final BitSet FOLLOW_49_in_message_enum1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1627 = new BitSet(new long[]{0xFF80021FFEEA0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_field_type_in_message_field1630 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1632 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1634 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1637 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_message_field1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1665 = new BitSet(new long[]{0x0000000000EB0000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1668 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1670 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1672 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1675 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_message_field1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1703 = new BitSet(new long[]{0x0000000000EB0000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1706 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_dimension_in_message_field1708 = new BitSet(new long[]{0x0010020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1711 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1713 = new BitSet(new long[]{0x0014000000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1716 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_message_field1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_message_submsg1756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1759 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1762 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_message_submsg1764 = new BitSet(new long[]{0xFF82025FFEEB0450L,0x000000000000007FL});
    public static final BitSet FOLLOW_message_element_in_message_submsg1767 = new BitSet(new long[]{0xFF82025FFEEB0450L,0x000000000000007FL});
    public static final BitSet FOLLOW_49_in_message_submsg1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1781 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1784 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_message_uses1787 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1790 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1802 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1805 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_message_extends1808 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1811 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1822 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1825 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_namespace1827 = new BitSet(new long[]{0xFF82027FFEEF1450L,0x000000000000007FL});
    public static final BitSet FOLLOW_root_object_in_namespace1830 = new BitSet(new long[]{0xFF82027FFEEF1450L,0x000000000000007FL});
    public static final BitSet FOLLOW_49_in_namespace1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1843 = new BitSet(new long[]{0xFF80027FFEEF1452L,0x000000000000007FL});
    public static final BitSet FOLLOW_EXTERN_in_root_object1863 = new BitSet(new long[]{0x0000002000010400L});
    public static final BitSet FOLLOW_set_in_root_object1866 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_root_object1878 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_root_object1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_root_object1887 = new BitSet(new long[]{0xFF80025FFEEB0450L,0x000000000000007FL});
    public static final BitSet FOLLOW_typedef_in_root_object1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_root_object1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedef_in_root_object1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1925 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1928 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_taxonomy1930 = new BitSet(new long[]{0x0002020000008040L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1933 = new BitSet(new long[]{0x0002020000008040L});
    public static final BitSet FOLLOW_49_in_taxonomy1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1952 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1955 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_taxonomy_element1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedef1968 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_typedef1971 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_typedef1973 = new BitSet(new long[]{0xFF80021FFEEA0000L,0x000000000000007FL});
    public static final BitSet FOLLOW_field_type_in_typedef1976 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_typedef1978 = new BitSet(new long[]{0x0000000000000002L});

}