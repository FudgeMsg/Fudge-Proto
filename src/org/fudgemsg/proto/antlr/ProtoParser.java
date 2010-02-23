// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-02-22 16:58:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "EXTERN", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "OPTIONAL", "ORDINAL", "READONLY", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_DATE", "T_DATETIME", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "T_TIME", "TAXONOMY", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
    public static final int T__68=68;
    public static final int T__66=66;
    public static final int BINDING=5;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=33;
    public static final int ML_STRING=42;
    public static final int T_BOOL=23;
    public static final int T_DOUBLE=25;
    public static final int EXTERN=11;
    public static final int FLOAT=40;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T_LONG=31;
    public static final int T__55=55;
    public static final int ML_COMMENT=41;
    public static final int T_INDICATOR=29;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=13;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=38;
    public static final int TAXONOMY=35;
    public static final int T__59=59;
    public static final int T_INT=30;
    public static final int MESSAGE=14;
    public static final int COMMENT=37;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=39;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=24;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=7;
    public static final int DEFAULT=6;
    public static final int ORDINAL=18;
    public static final int T_FLOAT=28;
    public static final int REPEATED=20;
    public static final int WHITESPACE=44;
    public static final int REQUIRED=21;
    public static final int READONLY=19;
    public static final int ROOT=22;
    public static final int T_DATETIME=27;
    public static final int NAMESPACE=16;
    public static final int OPTIONAL=17;
    public static final int DIM_VARIANT=8;
    public static final int ENUM=9;
    public static final int USES=36;
    public static final int T_DATE=26;
    public static final int FIELD=12;
    public static final int T_TIME=34;
    public static final int T_SHORT=32;
    public static final int EXTENDS=10;
    public static final int MUTABLE=15;
    public static final int STRING=43;

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
    // org/fudgemsg/proto/antlr/Proto.g:121:1: anyword : ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES );
    public final ProtoParser.anyword_return anyword() throws RecognitionException {
        ProtoParser.anyword_return retval = new ProtoParser.anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set1=null;

        ProtoTree set1_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:122:3: ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | OPTIONAL | READONLY | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | USES )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=BINDING && input.LA(1)<=DEFAULT)||(input.LA(1)>=ENUM && input.LA(1)<=EXTERN)||(input.LA(1)>=IMPORT && input.LA(1)<=OPTIONAL)||(input.LA(1)>=READONLY && input.LA(1)<=REQUIRED)||(input.LA(1)>=T_BOOL && input.LA(1)<=USES) ) {
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
    // org/fudgemsg/proto/antlr/Proto.g:151:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:151:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:151:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING2=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding842); 
            BINDING2_tree = (ProtoTree)adaptor.create(BINDING2);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING2_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding845);
            binding_anyword3=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword3.getTree());
            char_literal4=(Token)match(input,45,FOLLOW_45_in_binding847); 
            // org/fudgemsg/proto/antlr/Proto.g:151:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:151:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding850);
            	    binding_element5=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal6=(Token)match(input,46,FOLLOW_46_in_binding854); 

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
    // org/fudgemsg/proto/antlr/Proto.g:153:1: binding_anyword : ( fullidentifier | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING8=null;
        ProtoParser.fullidentifier_return fullidentifier7 = null;


        ProtoTree STRING8_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:154:2: ( fullidentifier | STRING )
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
                    // org/fudgemsg/proto/antlr/Proto.g:154:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword865);
                    fullidentifier7=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier7.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:155:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword870); 
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
    // org/fudgemsg/proto/antlr/Proto.g:158:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword9 = null;

        ProtoParser.binding_text_return binding_text10 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:158:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:158:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element880);
            binding_anyword9=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword9.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element882);
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
    // org/fudgemsg/proto/antlr/Proto.g:160:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:161:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:161:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text892); 
                    STRING11_tree = (ProtoTree)adaptor.create(STRING11);
                    adaptor.addChild(root_0, STRING11_tree);

                    char_literal12=(Token)match(input,47,FOLLOW_47_in_binding_text894); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:162:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING13=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text900); 
                    ML_STRING13_tree = (ProtoTree)adaptor.create(ML_STRING13);
                    adaptor.addChild(root_0, ML_STRING13_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:163:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text905);
                    fullidentifier14=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier14.getTree());
                    char_literal15=(Token)match(input,47,FOLLOW_47_in_binding_text907); 

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
    // org/fudgemsg/proto/antlr/Proto.g:166:1: constraint_default : DEFAULT '=' literal ;
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
            // org/fudgemsg/proto/antlr/Proto.g:166:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:166:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT16=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default918); 
            DEFAULT16_tree = (ProtoTree)adaptor.create(DEFAULT16);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT16_tree, root_0);

            char_literal17=(Token)match(input,48,FOLLOW_48_in_constraint_default921); 
            pushFollow(FOLLOW_literal_in_constraint_default924);
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
    // org/fudgemsg/proto/antlr/Proto.g:168:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:169:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==49) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==50) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:169:4: '[' INTEGER ']'
                    {
                    char_literal19=(Token)match(input,49,FOLLOW_49_in_dimension934);  
                    stream_49.add(char_literal19);

                    INTEGER20=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension936);  
                    stream_INTEGER.add(INTEGER20);

                    char_literal21=(Token)match(input,50,FOLLOW_50_in_dimension938);  
                    stream_50.add(char_literal21);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 169:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:169:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:170:4: '[' ']'
                    {
                    char_literal22=(Token)match(input,49,FOLLOW_49_in_dimension951);  
                    stream_49.add(char_literal22);

                    char_literal23=(Token)match(input,50,FOLLOW_50_in_dimension953);  
                    stream_50.add(char_literal23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 170:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:170:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:173:1: enum_element : ( binding | IDENTIFIER ( enum_value )? ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:174:3: ( binding | IDENTIFIER ( enum_value )? ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:174:5: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_enum_element971);
                    binding24=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding24.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:175:5: IDENTIFIER ( enum_value )? ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element977); 
                    IDENTIFIER25_tree = (ProtoTree)adaptor.create(IDENTIFIER25);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER25_tree, root_0);

                    // org/fudgemsg/proto/antlr/Proto.g:175:17: ( enum_value )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==48) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:175:17: enum_value
                            {
                            pushFollow(FOLLOW_enum_value_in_enum_element980);
                            enum_value26=enum_value();

                            state._fsp--;

                            adaptor.addChild(root_0, enum_value26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,47,FOLLOW_47_in_enum_element983); 

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
    // org/fudgemsg/proto/antlr/Proto.g:178:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal28=null;
        Token INTEGER29=null;

        ProtoTree char_literal28_tree=null;
        ProtoTree INTEGER29_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:178:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:178:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal28=(Token)match(input,48,FOLLOW_48_in_enum_value995); 
            INTEGER29=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value998); 
            INTEGER29_tree = (ProtoTree)adaptor.create(INTEGER29);
            adaptor.addChild(root_0, INTEGER29_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:180:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default30 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:180:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:180:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint1007);
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
    // org/fudgemsg/proto/antlr/Proto.g:182:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:182:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:182:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal31=(Token)match(input,49,FOLLOW_49_in_field_constraints1016); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints1019);
            field_constraint32=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint32.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:182:43: ( ',' field_constraint )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==51) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:182:44: ',' field_constraint
            	    {
            	    char_literal33=(Token)match(input,51,FOLLOW_51_in_field_constraints1022); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints1025);
            	    field_constraint34=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal35=(Token)match(input,50,FOLLOW_50_in_field_constraints1029); 

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
    // org/fudgemsg/proto/antlr/Proto.g:184:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal36=null;
        Token INTEGER37=null;

        ProtoTree char_literal36_tree=null;
        ProtoTree INTEGER37_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:184:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:184:17: '=' INTEGER
            {
            char_literal36=(Token)match(input,48,FOLLOW_48_in_field_ordinal1039);  
            stream_48.add(char_literal36);

            INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal1041);  
            stream_INTEGER.add(INTEGER37);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 184:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:184:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:187:1: field_modifier : ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set38=null;

        ProtoTree set38_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:188:2: ( MUTABLE | READONLY | REQUIRED | OPTIONAL | REPEATED )
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
    // org/fudgemsg/proto/antlr/Proto.g:195:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype39 = null;

        ProtoParser.dimension_return dimension40 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:195:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:195:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype1090);
            field_basetype39=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype39.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:195:34: ( dimension )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==49) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:195:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype1092);
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
            // elements: field_basetype, dimension
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 195:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:195:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:197:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME );
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
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:198:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME )
            int alt9=28;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt9=1;
                }
                break;
            case 52:
                {
                alt9=2;
                }
                break;
            case T_BYTE:
                {
                alt9=3;
                }
                break;
            case 53:
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
            case 54:
                {
                alt9=8;
                }
                break;
            case T_INT:
                {
                alt9=9;
                }
                break;
            case 55:
                {
                alt9=10;
                }
                break;
            case 56:
                {
                alt9=11;
                }
                break;
            case 57:
                {
                alt9=12;
                }
                break;
            case 58:
                {
                alt9=13;
                }
                break;
            case 59:
                {
                alt9=14;
                }
                break;
            case 60:
                {
                alt9=15;
                }
                break;
            case T_LONG:
                {
                alt9=16;
                }
                break;
            case 61:
                {
                alt9=17;
                }
                break;
            case 62:
                {
                alt9=18;
                }
                break;
            case 63:
                {
                alt9=19;
                }
                break;
            case 64:
                {
                alt9=20;
                }
                break;
            case 65:
                {
                alt9=21;
                }
                break;
            case T_FLOAT:
                {
                alt9=22;
                }
                break;
            case 66:
                {
                alt9=23;
                }
                break;
            case T_DOUBLE:
                {
                alt9=24;
                }
                break;
            case 67:
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
                    // org/fudgemsg/proto/antlr/Proto.g:198:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL41=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype1114); 
                    T_BOOL41_tree = (ProtoTree)adaptor.create(T_BOOL41);
                    adaptor.addChild(root_0, T_BOOL41_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:199:4: 'boolean'
                    {
                    string_literal42=(Token)match(input,52,FOLLOW_52_in_field_primtype1119);  
                    stream_52.add(string_literal42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 199:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:199:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE43=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype1130); 
                    T_BYTE43_tree = (ProtoTree)adaptor.create(T_BYTE43);
                    adaptor.addChild(root_0, T_BYTE43_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: 'int8'
                    {
                    string_literal44=(Token)match(input,53,FOLLOW_53_in_field_primtype1135);  
                    stream_53.add(string_literal44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 201:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:201:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: T_DATE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATE45=(Token)match(input,T_DATE,FOLLOW_T_DATE_in_field_primtype1146); 
                    T_DATE45_tree = (ProtoTree)adaptor.create(T_DATE45);
                    adaptor.addChild(root_0, T_DATE45_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:203:4: T_DATETIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATETIME46=(Token)match(input,T_DATETIME,FOLLOW_T_DATETIME_in_field_primtype1151); 
                    T_DATETIME46_tree = (ProtoTree)adaptor.create(T_DATETIME46);
                    adaptor.addChild(root_0, T_DATETIME46_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:204:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT47=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1156); 
                    T_SHORT47_tree = (ProtoTree)adaptor.create(T_SHORT47);
                    adaptor.addChild(root_0, T_SHORT47_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: 'int16'
                    {
                    string_literal48=(Token)match(input,54,FOLLOW_54_in_field_primtype1161);  
                    stream_54.add(string_literal48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 205:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:205:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT49=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1172); 
                    T_INT49_tree = (ProtoTree)adaptor.create(T_INT49);
                    adaptor.addChild(root_0, T_INT49_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: 'int32'
                    {
                    string_literal50=(Token)match(input,55,FOLLOW_55_in_field_primtype1177);  
                    stream_55.add(string_literal50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 207:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:207:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: 'uint32'
                    {
                    string_literal51=(Token)match(input,56,FOLLOW_56_in_field_primtype1188);  
                    stream_56.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 208:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:208:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: 'sint32'
                    {
                    string_literal52=(Token)match(input,57,FOLLOW_57_in_field_primtype1199);  
                    stream_57.add(string_literal52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 209:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:209:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: 'fixed32'
                    {
                    string_literal53=(Token)match(input,58,FOLLOW_58_in_field_primtype1210);  
                    stream_58.add(string_literal53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 210:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:210:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: 'sfixed32'
                    {
                    string_literal54=(Token)match(input,59,FOLLOW_59_in_field_primtype1221);  
                    stream_59.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 211:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:211:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: 'integer'
                    {
                    string_literal55=(Token)match(input,60,FOLLOW_60_in_field_primtype1232);  
                    stream_60.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

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
                case 16 :
                    // org/fudgemsg/proto/antlr/Proto.g:213:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG56=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1243); 
                    T_LONG56_tree = (ProtoTree)adaptor.create(T_LONG56);
                    adaptor.addChild(root_0, T_LONG56_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:214:4: 'int64'
                    {
                    string_literal57=(Token)match(input,61,FOLLOW_61_in_field_primtype1248);  
                    stream_61.add(string_literal57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 214:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:214:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: 'uint64'
                    {
                    string_literal58=(Token)match(input,62,FOLLOW_62_in_field_primtype1259);  
                    stream_62.add(string_literal58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 215:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:215:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:216:4: 'sint64'
                    {
                    string_literal59=(Token)match(input,63,FOLLOW_63_in_field_primtype1270);  
                    stream_63.add(string_literal59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 216:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:216:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:217:4: 'fixed64'
                    {
                    string_literal60=(Token)match(input,64,FOLLOW_64_in_field_primtype1281);  
                    stream_64.add(string_literal60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 217:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:217:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:218:4: 'sfixed64'
                    {
                    string_literal61=(Token)match(input,65,FOLLOW_65_in_field_primtype1292);  
                    stream_65.add(string_literal61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 218:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:218:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:219:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT62=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1303); 
                    T_FLOAT62_tree = (ProtoTree)adaptor.create(T_FLOAT62);
                    adaptor.addChild(root_0, T_FLOAT62_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:220:4: 'float32'
                    {
                    string_literal63=(Token)match(input,66,FOLLOW_66_in_field_primtype1308);  
                    stream_66.add(string_literal63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 220:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:220:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:221:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE64=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1319); 
                    T_DOUBLE64_tree = (ProtoTree)adaptor.create(T_DOUBLE64);
                    adaptor.addChild(root_0, T_DOUBLE64_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:222:4: 'float64'
                    {
                    string_literal65=(Token)match(input,67,FOLLOW_67_in_field_primtype1324);  
                    stream_67.add(string_literal65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 222:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:222:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:223:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR66=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1335); 
                    T_INDICATOR66_tree = (ProtoTree)adaptor.create(T_INDICATOR66);
                    adaptor.addChild(root_0, T_INDICATOR66_tree);


                    }
                    break;
                case 27 :
                    // org/fudgemsg/proto/antlr/Proto.g:224:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING67=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1340); 
                    T_STRING67_tree = (ProtoTree)adaptor.create(T_STRING67);
                    adaptor.addChild(root_0, T_STRING67_tree);


                    }
                    break;
                case 28 :
                    // org/fudgemsg/proto/antlr/Proto.g:225:4: T_TIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_TIME68=(Token)match(input,T_TIME,FOLLOW_T_TIME_in_field_primtype1345); 
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
    // org/fudgemsg/proto/antlr/Proto.g:228:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype69 = null;

        ProtoParser.fullidentifier_return fullidentifier70 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:229:2: ( field_primtype | fullidentifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=T_BOOL && LA10_0<=T_TIME)||(LA10_0>=52 && LA10_0<=67)) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:229:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1356);
                    field_primtype69=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype69.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:230:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1361);
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
    // org/fudgemsg/proto/antlr/Proto.g:233:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype71 = null;

        ProtoParser.field_arraytype_return field_arraytype72 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:234:2: ( field_basetype | field_arraytype )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:234:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1372);
                    field_basetype71=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype71.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:235:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1377);
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
    // org/fudgemsg/proto/antlr/Proto.g:238:1: fullidentifier : IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* ;
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
            // org/fudgemsg/proto/antlr/Proto.g:238:16: ( IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* )
            // org/fudgemsg/proto/antlr/Proto.g:238:18: IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1387); 
            IDENTIFIER73_tree = (ProtoTree)adaptor.create(IDENTIFIER73);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER73_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:238:30: ( '.' ( IDENTIFIER | anyword ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==68) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:238:31: '.' ( IDENTIFIER | anyword )
            	    {
            	    char_literal74=(Token)match(input,68,FOLLOW_68_in_fullidentifier1391); 
            	    // org/fudgemsg/proto/antlr/Proto.g:238:36: ( IDENTIFIER | anyword )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==IDENTIFIER) ) {
            	        alt12=1;
            	    }
            	    else if ( ((LA12_0>=BINDING && LA12_0<=DEFAULT)||(LA12_0>=ENUM && LA12_0<=EXTERN)||(LA12_0>=IMPORT && LA12_0<=OPTIONAL)||(LA12_0>=READONLY && LA12_0<=REQUIRED)||(LA12_0>=T_BOOL && LA12_0<=USES)) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:238:37: IDENTIFIER
            	            {
            	            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1395); 
            	            IDENTIFIER75_tree = (ProtoTree)adaptor.create(IDENTIFIER75);
            	            adaptor.addChild(root_0, IDENTIFIER75_tree);


            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:238:50: anyword
            	            {
            	            pushFollow(FOLLOW_anyword_in_fullidentifier1399);
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
    // org/fudgemsg/proto/antlr/Proto.g:240:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set77=null;

        ProtoTree set77_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:241:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
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
    // org/fudgemsg/proto/antlr/Proto.g:247:1: message : MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE78=null;
        Token IDENTIFIER79=null;
        Token char_literal82=null;
        Token char_literal84=null;
        ProtoParser.message_uses_return message_uses80 = null;

        ProtoParser.message_extends_return message_extends81 = null;

        ProtoParser.message_element_return message_element83 = null;


        ProtoTree MESSAGE78_tree=null;
        ProtoTree IDENTIFIER79_tree=null;
        ProtoTree char_literal82_tree=null;
        ProtoTree char_literal84_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:247:9: ( MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:247:11: MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE78=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1437); 
            MESSAGE78_tree = (ProtoTree)adaptor.create(MESSAGE78);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE78_tree, root_0);

            IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1440); 
            IDENTIFIER79_tree = (ProtoTree)adaptor.create(IDENTIFIER79);
            adaptor.addChild(root_0, IDENTIFIER79_tree);

            // org/fudgemsg/proto/antlr/Proto.g:247:31: ( message_uses )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==USES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:247:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1442);
                    message_uses80=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses80.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:247:45: ( message_extends )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EXTENDS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:247:45: message_extends
                    {
                    pushFollow(FOLLOW_message_extends_in_message1445);
                    message_extends81=message_extends();

                    state._fsp--;

                    adaptor.addChild(root_0, message_extends81.getTree());

                    }
                    break;

            }

            char_literal82=(Token)match(input,45,FOLLOW_45_in_message1448); 
            // org/fudgemsg/proto/antlr/Proto.g:247:67: ( message_element )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BINDING||LA16_0==ENUM||(LA16_0>=MESSAGE && LA16_0<=MUTABLE)||LA16_0==OPTIONAL||(LA16_0>=READONLY && LA16_0<=REQUIRED)||(LA16_0>=T_BOOL && LA16_0<=T_TIME)||LA16_0==IDENTIFIER||(LA16_0>=52 && LA16_0<=67)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:247:67: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1451);
            	    message_element83=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element83.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            char_literal84=(Token)match(input,46,FOLLOW_46_in_message1454); 

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
    // org/fudgemsg/proto/antlr/Proto.g:249:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum85 = null;

        ProtoParser.message_field_return message_field86 = null;

        ProtoParser.message_submsg_return message_submsg87 = null;

        ProtoParser.binding_return binding88 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:250:2: ( message_enum | message_field | message_submsg | binding )
            int alt17=4;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt17=1;
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
            case 52:
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
                {
                alt17=2;
                }
                break;
            case MESSAGE:
                {
                alt17=3;
                }
                break;
            case BINDING:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:250:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1465);
                    message_enum85=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum85.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:251:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1470);
                    message_field86=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field86.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:252:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1475);
                    message_submsg87=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg87.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:253:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1480);
                    binding88=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding88.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:256:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM89=null;
        Token IDENTIFIER90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        ProtoParser.enum_element_return enum_element92 = null;


        ProtoTree ENUM89_tree=null;
        ProtoTree IDENTIFIER90_tree=null;
        ProtoTree char_literal91_tree=null;
        ProtoTree char_literal93_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:256:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:256:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM89=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1490); 
            ENUM89_tree = (ProtoTree)adaptor.create(ENUM89);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM89_tree, root_0);

            IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1493); 
            IDENTIFIER90_tree = (ProtoTree)adaptor.create(IDENTIFIER90);
            adaptor.addChild(root_0, IDENTIFIER90_tree);

            char_literal91=(Token)match(input,45,FOLLOW_45_in_message_enum1495); 
            // org/fudgemsg/proto/antlr/Proto.g:256:38: ( enum_element )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==BINDING||LA18_0==IDENTIFIER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:256:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1498);
            	    enum_element92=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element92.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            char_literal93=(Token)match(input,46,FOLLOW_46_in_message_enum1501); 

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
    // org/fudgemsg/proto/antlr/Proto.g:258:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER96=null;
        Token char_literal99=null;
        Token MESSAGE101=null;
        Token IDENTIFIER102=null;
        Token char_literal105=null;
        Token MESSAGE107=null;
        Token IDENTIFIER109=null;
        Token char_literal112=null;
        ProtoParser.field_modifier_return field_modifier94 = null;

        ProtoParser.field_type_return field_type95 = null;

        ProtoParser.field_ordinal_return field_ordinal97 = null;

        ProtoParser.field_constraints_return field_constraints98 = null;

        ProtoParser.field_modifier_return field_modifier100 = null;

        ProtoParser.field_ordinal_return field_ordinal103 = null;

        ProtoParser.field_constraints_return field_constraints104 = null;

        ProtoParser.field_modifier_return field_modifier106 = null;

        ProtoParser.dimension_return dimension108 = null;

        ProtoParser.field_ordinal_return field_ordinal110 = null;

        ProtoParser.field_constraints_return field_constraints111 = null;


        ProtoTree IDENTIFIER96_tree=null;
        ProtoTree char_literal99_tree=null;
        ProtoTree MESSAGE101_tree=null;
        ProtoTree IDENTIFIER102_tree=null;
        ProtoTree char_literal105_tree=null;
        ProtoTree MESSAGE107_tree=null;
        ProtoTree IDENTIFIER109_tree=null;
        ProtoTree char_literal112_tree=null;
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:259:3: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:259:5: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:259:5: ( field_modifier )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==MUTABLE||LA19_0==OPTIONAL||(LA19_0>=READONLY && LA19_0<=REQUIRED)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:259:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1513);
                    	    field_modifier94=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    pushFollow(FOLLOW_field_type_in_message_field1516);
                    field_type95=field_type();

                    state._fsp--;

                    stream_field_type.add(field_type95.getTree());
                    IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1518);  
                    stream_IDENTIFIER.add(IDENTIFIER96);

                    // org/fudgemsg/proto/antlr/Proto.g:259:43: ( field_ordinal )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==48) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:259:43: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1520);
                            field_ordinal97=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal97.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:259:58: ( field_constraints )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==49) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:259:58: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1523);
                            field_constraints98=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints98.getTree());

                            }
                            break;

                    }

                    char_literal99=(Token)match(input,47,FOLLOW_47_in_message_field1526);  
                    stream_47.add(char_literal99);



                    // AST REWRITE
                    // elements: IDENTIFIER, field_type, field_constraints, field_modifier, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 259:81: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:259:84: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_field_type.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:259:114: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:259:130: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:259:145: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:260:5: ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:260:5: ( field_modifier )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==MUTABLE||LA22_0==OPTIONAL||(LA22_0>=READONLY && LA22_0<=REQUIRED)) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:260:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1551);
                    	    field_modifier100=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier100.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    MESSAGE101=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1554);  
                    stream_MESSAGE.add(MESSAGE101);

                    IDENTIFIER102=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1556);  
                    stream_IDENTIFIER.add(IDENTIFIER102);

                    // org/fudgemsg/proto/antlr/Proto.g:260:40: ( field_ordinal )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==48) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:260:40: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1558);
                            field_ordinal103=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal103.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:260:55: ( field_constraints )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==49) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:260:55: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1561);
                            field_constraints104=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints104.getTree());

                            }
                            break;

                    }

                    char_literal105=(Token)match(input,47,FOLLOW_47_in_message_field1564);  
                    stream_47.add(char_literal105);



                    // AST REWRITE
                    // elements: IDENTIFIER, MESSAGE, field_constraints, field_modifier, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 260:78: -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:260:81: ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:260:108: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:260:124: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:260:139: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:261:5: ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:261:5: ( field_modifier )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==MUTABLE||LA25_0==OPTIONAL||(LA25_0>=READONLY && LA25_0<=REQUIRED)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:261:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1589);
                    	    field_modifier106=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    MESSAGE107=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1592);  
                    stream_MESSAGE.add(MESSAGE107);

                    // org/fudgemsg/proto/antlr/Proto.g:261:29: ( dimension )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==49) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:261:29: dimension
                    	    {
                    	    pushFollow(FOLLOW_dimension_in_message_field1594);
                    	    dimension108=dimension();

                    	    state._fsp--;

                    	    stream_dimension.add(dimension108.getTree());

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

                    IDENTIFIER109=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1597);  
                    stream_IDENTIFIER.add(IDENTIFIER109);

                    // org/fudgemsg/proto/antlr/Proto.g:261:51: ( field_ordinal )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==48) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:261:51: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1599);
                            field_ordinal110=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal110.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:261:66: ( field_constraints )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==49) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:261:66: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1602);
                            field_constraints111=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints111.getTree());

                            }
                            break;

                    }

                    char_literal112=(Token)match(input,47,FOLLOW_47_in_message_field1605);  
                    stream_47.add(char_literal112);



                    // AST REWRITE
                    // elements: MESSAGE, field_constraints, dimension, field_modifier, IDENTIFIER, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 261:89: -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:261:92: ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:261:100: ^( ARRAY MESSAGE ( dimension )+ )
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
                        // org/fudgemsg/proto/antlr/Proto.g:261:139: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:261:155: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:261:170: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:264:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE113=null;
        Token IDENTIFIER114=null;
        Token char_literal115=null;
        Token char_literal117=null;
        ProtoParser.message_element_return message_element116 = null;


        ProtoTree MESSAGE113_tree=null;
        ProtoTree IDENTIFIER114_tree=null;
        ProtoTree char_literal115_tree=null;
        ProtoTree char_literal117_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:264:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:264:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE113=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1642); 
            MESSAGE113_tree = (ProtoTree)adaptor.create(MESSAGE113);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE113_tree, root_0);

            IDENTIFIER114=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1645); 
            IDENTIFIER114_tree = (ProtoTree)adaptor.create(IDENTIFIER114);
            adaptor.addChild(root_0, IDENTIFIER114_tree);

            char_literal115=(Token)match(input,45,FOLLOW_45_in_message_submsg1647); 
            // org/fudgemsg/proto/antlr/Proto.g:264:43: ( message_element )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==BINDING||LA30_0==ENUM||(LA30_0>=MESSAGE && LA30_0<=MUTABLE)||LA30_0==OPTIONAL||(LA30_0>=READONLY && LA30_0<=REQUIRED)||(LA30_0>=T_BOOL && LA30_0<=T_TIME)||LA30_0==IDENTIFIER||(LA30_0>=52 && LA30_0<=67)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:264:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1650);
            	    message_element116=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element116.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            char_literal117=(Token)match(input,46,FOLLOW_46_in_message_submsg1653); 

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
    // org/fudgemsg/proto/antlr/Proto.g:267:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES118=null;
        Token char_literal120=null;
        ProtoParser.fullidentifier_return fullidentifier119 = null;

        ProtoParser.fullidentifier_return fullidentifier121 = null;


        ProtoTree USES118_tree=null;
        ProtoTree char_literal120_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:267:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:267:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES118=(Token)match(input,USES,FOLLOW_USES_in_message_uses1664); 
            USES118_tree = (ProtoTree)adaptor.create(USES118);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES118_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1667);
            fullidentifier119=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier119.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:267:37: ( ',' fullidentifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==51) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:267:38: ',' fullidentifier
            	    {
            	    char_literal120=(Token)match(input,51,FOLLOW_51_in_message_uses1670); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1673);
            	    fullidentifier121=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier121.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // org/fudgemsg/proto/antlr/Proto.g:270:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_extends_return message_extends() throws RecognitionException {
        ProtoParser.message_extends_return retval = new ProtoParser.message_extends_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTENDS122=null;
        Token char_literal124=null;
        ProtoParser.fullidentifier_return fullidentifier123 = null;

        ProtoParser.fullidentifier_return fullidentifier125 = null;


        ProtoTree EXTENDS122_tree=null;
        ProtoTree char_literal124_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:270:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:270:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS122=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1685); 
            EXTENDS122_tree = (ProtoTree)adaptor.create(EXTENDS122);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS122_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1688);
            fullidentifier123=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier123.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:270:43: ( ',' fullidentifier )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==51) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:270:44: ',' fullidentifier
            	    {
            	    char_literal124=(Token)match(input,51,FOLLOW_51_in_message_extends1691); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1694);
            	    fullidentifier125=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier125.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // org/fudgemsg/proto/antlr/Proto.g:272:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE126=null;
        Token char_literal128=null;
        Token char_literal130=null;
        ProtoParser.fullidentifier_return fullidentifier127 = null;

        ProtoParser.root_object_return root_object129 = null;


        ProtoTree NAMESPACE126_tree=null;
        ProtoTree char_literal128_tree=null;
        ProtoTree char_literal130_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:272:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:272:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE126=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1705); 
            NAMESPACE126_tree = (ProtoTree)adaptor.create(NAMESPACE126);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE126_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1708);
            fullidentifier127=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier127.getTree());
            char_literal128=(Token)match(input,45,FOLLOW_45_in_namespace1710); 
            // org/fudgemsg/proto/antlr/Proto.g:272:44: ( root_object )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ENUM||LA33_0==EXTERN||LA33_0==MESSAGE||LA33_0==NAMESPACE||LA33_0==TAXONOMY) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:272:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1713);
            	    root_object129=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object129.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            char_literal130=(Token)match(input,46,FOLLOW_46_in_namespace1716); 

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
    // org/fudgemsg/proto/antlr/Proto.g:274:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object131 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:274:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:274:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:274:8: ( root_object )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ENUM||LA34_0==EXTERN||LA34_0==MESSAGE||LA34_0==NAMESPACE||LA34_0==TAXONOMY) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:274:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1726);
            	    root_object131=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object131.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);



            // AST REWRITE
            // elements: root_object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 274:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:274:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:274:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:276:1: root_object : ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTERN132=null;
        Token set133=null;
        Token char_literal135=null;
        ProtoParser.fullidentifier_return fullidentifier134 = null;

        ProtoParser.message_return message136 = null;

        ProtoParser.message_enum_return message_enum137 = null;

        ProtoParser.namespace_return namespace138 = null;

        ProtoParser.taxonomy_return taxonomy139 = null;


        ProtoTree EXTERN132_tree=null;
        ProtoTree set133_tree=null;
        ProtoTree char_literal135_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:277:3: ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy )
            int alt36=5;
            switch ( input.LA(1) ) {
            case EXTERN:
                {
                alt36=1;
                }
                break;
            case MESSAGE:
                {
                alt36=2;
                }
                break;
            case ENUM:
                {
                alt36=3;
                }
                break;
            case NAMESPACE:
                {
                alt36=4;
                }
                break;
            case TAXONOMY:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:277:5: EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )?
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN132=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1746); 
                    EXTERN132_tree = (ProtoTree)adaptor.create(EXTERN132);
                    root_0 = (ProtoTree)adaptor.becomeRoot(EXTERN132_tree, root_0);

                    set133=(Token)input.LT(1);
                    if ( input.LA(1)==ENUM||input.LA(1)==MESSAGE||input.LA(1)==TAXONOMY ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProtoTree)adaptor.create(set133));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_fullidentifier_in_root_object1761);
                    fullidentifier134=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier134.getTree());
                    // org/fudgemsg/proto/antlr/Proto.g:277:56: ( ';' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==47) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:277:56: ';'
                            {
                            char_literal135=(Token)match(input,47,FOLLOW_47_in_root_object1763); 
                            char_literal135_tree = (ProtoTree)adaptor.create(char_literal135);
                            adaptor.addChild(root_0, char_literal135_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:278:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1769);
                    message136=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message136.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:279:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1774);
                    message_enum137=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum137.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:280:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1779);
                    namespace138=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace138.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:281:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1784);
                    taxonomy139=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy139.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:284:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY140=null;
        Token IDENTIFIER141=null;
        Token char_literal142=null;
        Token char_literal144=null;
        ProtoParser.taxonomy_element_return taxonomy_element143 = null;


        ProtoTree TAXONOMY140_tree=null;
        ProtoTree IDENTIFIER141_tree=null;
        ProtoTree char_literal142_tree=null;
        ProtoTree char_literal144_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:284:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:284:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY140=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1794); 
            TAXONOMY140_tree = (ProtoTree)adaptor.create(TAXONOMY140);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY140_tree, root_0);

            IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1797); 
            IDENTIFIER141_tree = (ProtoTree)adaptor.create(IDENTIFIER141);
            adaptor.addChild(root_0, IDENTIFIER141_tree);

            char_literal142=(Token)match(input,45,FOLLOW_45_in_taxonomy1799); 
            // org/fudgemsg/proto/antlr/Proto.g:284:38: ( taxonomy_element )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==BINDING||LA37_0==IMPORT||LA37_0==IDENTIFIER) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:284:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1802);
            	    taxonomy_element143=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element143.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            char_literal144=(Token)match(input,46,FOLLOW_46_in_taxonomy1805); 

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
    // org/fudgemsg/proto/antlr/Proto.g:286:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT146=null;
        Token char_literal148=null;
        ProtoParser.enum_element_return enum_element145 = null;

        ProtoParser.fullidentifier_return fullidentifier147 = null;


        ProtoTree IMPORT146_tree=null;
        ProtoTree char_literal148_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:287:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==BINDING||LA38_0==IDENTIFIER) ) {
                alt38=1;
            }
            else if ( (LA38_0==IMPORT) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:287:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1816);
                    enum_element145=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element145.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:288:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT146=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1821); 
                    IMPORT146_tree = (ProtoTree)adaptor.create(IMPORT146);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT146_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1824);
                    fullidentifier147=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier147.getTree());
                    char_literal148=(Token)match(input,47,FOLLOW_47_in_taxonomy_element1826); 

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
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA11_eotS =
        "\43\uffff";
    static final String DFA11_eofS =
        "\43\uffff";
    static final String DFA11_minS =
        "\1\27\35\46\2\uffff\1\5\2\46";
    static final String DFA11_maxS =
        "\1\103\34\61\1\104\2\uffff\1\46\2\104";
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
            "\2\42\2\uffff\3\42\1\uffff\5\42\1\uffff\3\42\1\uffff\16\42\1"+
            "\uffff\1\41",
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
            return "233:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
    static final String DFA29_eotS =
        "\6\uffff";
    static final String DFA29_eofS =
        "\6\uffff";
    static final String DFA29_minS =
        "\1\17\1\16\1\uffff\1\46\2\uffff";
    static final String DFA29_maxS =
        "\2\103\1\uffff\1\61\2\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA29_specialS =
        "\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\3\uffff\1\2\15\uffff"+
            "\20\2",
            "\1\3\1\1\1\uffff\1\1\1\uffff\3\1\1\uffff\14\2\3\uffff\1\2\15"+
            "\uffff\20\2",
            "",
            "\1\4\12\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "258:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_anyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding842 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_binding_anyword_in_binding845 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_binding847 = new BitSet(new long[]{0x0000484000000000L});
    public static final BitSet FOLLOW_binding_element_in_binding850 = new BitSet(new long[]{0x0000484000000000L});
    public static final BitSet FOLLOW_46_in_binding854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element880 = new BitSet(new long[]{0x00000C4000000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text892 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_binding_text894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text905 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_binding_text907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default918 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_constraint_default921 = new BitSet(new long[]{0x000009C000000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_dimension934 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_dimension938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_dimension951 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_dimension953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_enum_element971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element977 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element980 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_enum_element983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_enum_value995 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_constraints1016 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1019 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_51_in_field_constraints1022 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints1025 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50_in_field_constraints1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_ordinal1039 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_field_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype1090 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype1092 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATE_in_field_primtype1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATETIME_in_field_primtype1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_field_primtype1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_field_primtype1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_field_primtype1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_field_primtype1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_field_primtype1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_TIME_in_field_primtype1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_fullidentifier1391 = new BitSet(new long[]{0x0000005FFFBBEE60L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_anyword_in_fullidentifier1399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1437 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1440 = new BitSet(new long[]{0x0000201000000400L});
    public static final BitSet FOLLOW_message_uses_in_message1442 = new BitSet(new long[]{0x0000200000000400L});
    public static final BitSet FOLLOW_message_extends_in_message1445 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_message1448 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_message_element_in_message1451 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_message1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1490 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1493 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_message_enum1495 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_enum_element_in_message_enum1498 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_message_enum1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1513 = new BitSet(new long[]{0xFFF00047FFBA8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_field_type_in_message_field1516 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1518 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1520 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1523 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_message_field1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1551 = new BitSet(new long[]{0x00000000003AC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1554 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1556 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1558 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1561 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_message_field1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1589 = new BitSet(new long[]{0x00000000003AC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1592 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_dimension_in_message_field1594 = new BitSet(new long[]{0x0002004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1597 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1599 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1602 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_message_field1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1642 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1645 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_message_submsg1647 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_message_element_in_message_submsg1650 = new BitSet(new long[]{0xFFF04047FFBAC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_message_submsg1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1664 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1667 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_message_uses1670 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1673 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1685 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1688 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_message_extends1691 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1694 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1705 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1708 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_namespace1710 = new BitSet(new long[]{0x0000400800014A00L});
    public static final BitSet FOLLOW_root_object_in_namespace1713 = new BitSet(new long[]{0x0000400800014A00L});
    public static final BitSet FOLLOW_46_in_namespace1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1726 = new BitSet(new long[]{0x0000000800014A02L});
    public static final BitSet FOLLOW_EXTERN_in_root_object1746 = new BitSet(new long[]{0x0000000800004200L});
    public static final BitSet FOLLOW_set_in_root_object1749 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_root_object1761 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_root_object1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_root_object1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1794 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1797 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_taxonomy1799 = new BitSet(new long[]{0xFFF04047FFBAE220L,0x000000000000000FL});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1802 = new BitSet(new long[]{0xFFF04047FFBAE220L,0x000000000000000FL});
    public static final BitSet FOLLOW_46_in_taxonomy1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1821 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1824 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_taxonomy_element1826 = new BitSet(new long[]{0x0000000000000002L});

}