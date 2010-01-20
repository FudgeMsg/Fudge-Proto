// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-15 17:34:06

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "EXTERN", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "TAXONOMY", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'optional'", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
    public static final int BINDING=5;
    public static final int T__64=64;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=29;
    public static final int ML_STRING=37;
    public static final int T_BOOL=21;
    public static final int T_DOUBLE=23;
    public static final int EXTERN=11;
    public static final int FLOAT=35;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T_LONG=27;
    public static final int T__55=55;
    public static final int ML_COMMENT=36;
    public static final int T_INDICATOR=25;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=13;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=33;
    public static final int TAXONOMY=30;
    public static final int T__59=59;
    public static final int T_INT=26;
    public static final int MESSAGE=14;
    public static final int COMMENT=32;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=34;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=22;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=7;
    public static final int DEFAULT=6;
    public static final int ORDINAL=17;
    public static final int T_FLOAT=24;
    public static final int REPEATED=18;
    public static final int WHITESPACE=39;
    public static final int REQUIRED=19;
    public static final int ROOT=20;
    public static final int NAMESPACE=16;
    public static final int DIM_VARIANT=8;
    public static final int ENUM=9;
    public static final int USES=31;
    public static final int FIELD=12;
    public static final int T_SHORT=28;
    public static final int EXTENDS=10;
    public static final int MUTABLE=15;
    public static final int STRING=38;

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
    // org/fudgemsg/proto/antlr/Proto.g:116:1: anyword : ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES );
    public final ProtoParser.anyword_return anyword() throws RecognitionException {
        ProtoParser.anyword_return retval = new ProtoParser.anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set1=null;

        ProtoTree set1_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:117:3: ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=BINDING && input.LA(1)<=DEFAULT)||(input.LA(1)>=ENUM && input.LA(1)<=EXTERN)||(input.LA(1)>=IMPORT && input.LA(1)<=NAMESPACE)||(input.LA(1)>=REPEATED && input.LA(1)<=REQUIRED)||(input.LA(1)>=T_BOOL && input.LA(1)<=USES) ) {
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
    // org/fudgemsg/proto/antlr/Proto.g:141:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:141:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:141:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING2=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding752); 
            BINDING2_tree = (ProtoTree)adaptor.create(BINDING2);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING2_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding755);
            binding_anyword3=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword3.getTree());
            char_literal4=(Token)match(input,40,FOLLOW_40_in_binding757); 
            // org/fudgemsg/proto/antlr/Proto.g:141:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:141:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding760);
            	    binding_element5=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal6=(Token)match(input,41,FOLLOW_41_in_binding764); 

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
    // org/fudgemsg/proto/antlr/Proto.g:143:1: binding_anyword : ( fullidentifier | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING8=null;
        ProtoParser.fullidentifier_return fullidentifier7 = null;


        ProtoTree STRING8_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:144:2: ( fullidentifier | STRING )
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
                    // org/fudgemsg/proto/antlr/Proto.g:144:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword775);
                    fullidentifier7=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier7.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:145:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword780); 
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
    // org/fudgemsg/proto/antlr/Proto.g:148:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword9 = null;

        ProtoParser.binding_text_return binding_text10 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:148:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:148:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element790);
            binding_anyword9=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword9.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element792);
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
    // org/fudgemsg/proto/antlr/Proto.g:150:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:151:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:151:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text802); 
                    STRING11_tree = (ProtoTree)adaptor.create(STRING11);
                    adaptor.addChild(root_0, STRING11_tree);

                    char_literal12=(Token)match(input,42,FOLLOW_42_in_binding_text804); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:152:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING13=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text810); 
                    ML_STRING13_tree = (ProtoTree)adaptor.create(ML_STRING13);
                    adaptor.addChild(root_0, ML_STRING13_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:153:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text815);
                    fullidentifier14=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier14.getTree());
                    char_literal15=(Token)match(input,42,FOLLOW_42_in_binding_text817); 

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
    // org/fudgemsg/proto/antlr/Proto.g:156:1: constraint_default : DEFAULT '=' literal ;
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
            // org/fudgemsg/proto/antlr/Proto.g:156:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:156:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT16=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default828); 
            DEFAULT16_tree = (ProtoTree)adaptor.create(DEFAULT16);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT16_tree, root_0);

            char_literal17=(Token)match(input,43,FOLLOW_43_in_constraint_default831); 
            pushFollow(FOLLOW_literal_in_constraint_default834);
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
    // org/fudgemsg/proto/antlr/Proto.g:158:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:159:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==45) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:159:4: '[' INTEGER ']'
                    {
                    char_literal19=(Token)match(input,44,FOLLOW_44_in_dimension844);  
                    stream_44.add(char_literal19);

                    INTEGER20=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension846);  
                    stream_INTEGER.add(INTEGER20);

                    char_literal21=(Token)match(input,45,FOLLOW_45_in_dimension848);  
                    stream_45.add(char_literal21);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 159:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:159:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:160:4: '[' ']'
                    {
                    char_literal22=(Token)match(input,44,FOLLOW_44_in_dimension861);  
                    stream_44.add(char_literal22);

                    char_literal23=(Token)match(input,45,FOLLOW_45_in_dimension863);  
                    stream_45.add(char_literal23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 160:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:160:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:163:1: enum_element : ( binding | IDENTIFIER ( enum_value )? ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:164:3: ( binding | IDENTIFIER ( enum_value )? ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:164:5: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_enum_element881);
                    binding24=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding24.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:165:5: IDENTIFIER ( enum_value )? ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element887); 
                    IDENTIFIER25_tree = (ProtoTree)adaptor.create(IDENTIFIER25);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER25_tree, root_0);

                    // org/fudgemsg/proto/antlr/Proto.g:165:17: ( enum_value )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==43) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:165:17: enum_value
                            {
                            pushFollow(FOLLOW_enum_value_in_enum_element890);
                            enum_value26=enum_value();

                            state._fsp--;

                            adaptor.addChild(root_0, enum_value26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,42,FOLLOW_42_in_enum_element893); 

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
    // org/fudgemsg/proto/antlr/Proto.g:168:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal28=null;
        Token INTEGER29=null;

        ProtoTree char_literal28_tree=null;
        ProtoTree INTEGER29_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:168:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:168:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal28=(Token)match(input,43,FOLLOW_43_in_enum_value905); 
            INTEGER29=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value908); 
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
    // org/fudgemsg/proto/antlr/Proto.g:170:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default30 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:170:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:170:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint917);
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
    // org/fudgemsg/proto/antlr/Proto.g:172:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:172:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:172:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal31=(Token)match(input,44,FOLLOW_44_in_field_constraints926); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints929);
            field_constraint32=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint32.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:172:43: ( ',' field_constraint )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==46) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:172:44: ',' field_constraint
            	    {
            	    char_literal33=(Token)match(input,46,FOLLOW_46_in_field_constraints932); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints935);
            	    field_constraint34=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal35=(Token)match(input,45,FOLLOW_45_in_field_constraints939); 

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
    // org/fudgemsg/proto/antlr/Proto.g:174:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal36=null;
        Token INTEGER37=null;

        ProtoTree char_literal36_tree=null;
        ProtoTree INTEGER37_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:174:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:174:17: '=' INTEGER
            {
            char_literal36=(Token)match(input,43,FOLLOW_43_in_field_ordinal949);  
            stream_43.add(char_literal36);

            INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal951);  
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
            // 174:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:174:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:177:1: field_modifier : ( MUTABLE | REQUIRED | 'optional' | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MUTABLE38=null;
        Token REQUIRED39=null;
        Token string_literal40=null;
        Token REPEATED41=null;

        ProtoTree MUTABLE38_tree=null;
        ProtoTree REQUIRED39_tree=null;
        ProtoTree string_literal40_tree=null;
        ProtoTree REPEATED41_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:178:2: ( MUTABLE | REQUIRED | 'optional' | REPEATED )
            int alt8=4;
            switch ( input.LA(1) ) {
            case MUTABLE:
                {
                alt8=1;
                }
                break;
            case REQUIRED:
                {
                alt8=2;
                }
                break;
            case 47:
                {
                alt8=3;
                }
                break;
            case REPEATED:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:178:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE38=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_field_modifier970); 
                    MUTABLE38_tree = (ProtoTree)adaptor.create(MUTABLE38);
                    adaptor.addChild(root_0, MUTABLE38_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:179:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED39=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_modifier975); 
                    REQUIRED39_tree = (ProtoTree)adaptor.create(REQUIRED39);
                    adaptor.addChild(root_0, REQUIRED39_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:180:4: 'optional'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    string_literal40=(Token)match(input,47,FOLLOW_47_in_field_modifier980); 

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:181:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED41=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_field_modifier986); 
                    REPEATED41_tree = (ProtoTree)adaptor.create(REPEATED41);
                    adaptor.addChild(root_0, REPEATED41_tree);


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
    // $ANTLR end "field_modifier"

    public static class field_arraytype_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "field_arraytype"
    // org/fudgemsg/proto/antlr/Proto.g:184:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype42 = null;

        ProtoParser.dimension_return dimension43 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:184:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:184:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype996);
            field_basetype42=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype42.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:184:34: ( dimension )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==44) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:184:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype998);
            	    dimension43=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension43.getTree());

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



            // AST REWRITE
            // elements: field_basetype, dimension
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 184:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:184:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:186:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL44=null;
        Token string_literal45=null;
        Token T_BYTE46=null;
        Token string_literal47=null;
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

        ProtoTree T_BOOL44_tree=null;
        ProtoTree string_literal45_tree=null;
        ProtoTree T_BYTE46_tree=null;
        ProtoTree string_literal47_tree=null;
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:187:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING )
            int alt10=25;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt10=1;
                }
                break;
            case 48:
                {
                alt10=2;
                }
                break;
            case T_BYTE:
                {
                alt10=3;
                }
                break;
            case 49:
                {
                alt10=4;
                }
                break;
            case T_SHORT:
                {
                alt10=5;
                }
                break;
            case 50:
                {
                alt10=6;
                }
                break;
            case T_INT:
                {
                alt10=7;
                }
                break;
            case 51:
                {
                alt10=8;
                }
                break;
            case 52:
                {
                alt10=9;
                }
                break;
            case 53:
                {
                alt10=10;
                }
                break;
            case 54:
                {
                alt10=11;
                }
                break;
            case 55:
                {
                alt10=12;
                }
                break;
            case 56:
                {
                alt10=13;
                }
                break;
            case T_LONG:
                {
                alt10=14;
                }
                break;
            case 57:
                {
                alt10=15;
                }
                break;
            case 58:
                {
                alt10=16;
                }
                break;
            case 59:
                {
                alt10=17;
                }
                break;
            case 60:
                {
                alt10=18;
                }
                break;
            case 61:
                {
                alt10=19;
                }
                break;
            case T_FLOAT:
                {
                alt10=20;
                }
                break;
            case 62:
                {
                alt10=21;
                }
                break;
            case T_DOUBLE:
                {
                alt10=22;
                }
                break;
            case 63:
                {
                alt10=23;
                }
                break;
            case T_INDICATOR:
                {
                alt10=24;
                }
                break;
            case T_STRING:
                {
                alt10=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:187:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL44=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype1020); 
                    T_BOOL44_tree = (ProtoTree)adaptor.create(T_BOOL44);
                    adaptor.addChild(root_0, T_BOOL44_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:188:4: 'boolean'
                    {
                    string_literal45=(Token)match(input,48,FOLLOW_48_in_field_primtype1025);  
                    stream_48.add(string_literal45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 188:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:188:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:189:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE46=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype1036); 
                    T_BYTE46_tree = (ProtoTree)adaptor.create(T_BYTE46);
                    adaptor.addChild(root_0, T_BYTE46_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:190:4: 'int8'
                    {
                    string_literal47=(Token)match(input,49,FOLLOW_49_in_field_primtype1041);  
                    stream_49.add(string_literal47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 190:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:190:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:191:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT48=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1052); 
                    T_SHORT48_tree = (ProtoTree)adaptor.create(T_SHORT48);
                    adaptor.addChild(root_0, T_SHORT48_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:192:4: 'int16'
                    {
                    string_literal49=(Token)match(input,50,FOLLOW_50_in_field_primtype1057);  
                    stream_50.add(string_literal49);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 192:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:192:15: ^( T_SHORT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_SHORT, "T_SHORT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:193:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT50=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1068); 
                    T_INT50_tree = (ProtoTree)adaptor.create(T_INT50);
                    adaptor.addChild(root_0, T_INT50_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:194:4: 'int32'
                    {
                    string_literal51=(Token)match(input,51,FOLLOW_51_in_field_primtype1073);  
                    stream_51.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 194:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:194:15: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // org/fudgemsg/proto/antlr/Proto.g:195:4: 'uint32'
                    {
                    string_literal52=(Token)match(input,52,FOLLOW_52_in_field_primtype1084);  
                    stream_52.add(string_literal52);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 195:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:195:16: ^( T_INT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_INT, "T_INT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:196:4: 'sint32'
                    {
                    string_literal53=(Token)match(input,53,FOLLOW_53_in_field_primtype1095);  
                    stream_53.add(string_literal53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 196:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:196:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:197:4: 'fixed32'
                    {
                    string_literal54=(Token)match(input,54,FOLLOW_54_in_field_primtype1106);  
                    stream_54.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 197:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:197:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:198:4: 'sfixed32'
                    {
                    string_literal55=(Token)match(input,55,FOLLOW_55_in_field_primtype1117);  
                    stream_55.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 198:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:198:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:199:4: 'integer'
                    {
                    string_literal56=(Token)match(input,56,FOLLOW_56_in_field_primtype1128);  
                    stream_56.add(string_literal56);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 199:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:199:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG57=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1139); 
                    T_LONG57_tree = (ProtoTree)adaptor.create(T_LONG57);
                    adaptor.addChild(root_0, T_LONG57_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: 'int64'
                    {
                    string_literal58=(Token)match(input,57,FOLLOW_57_in_field_primtype1144);  
                    stream_57.add(string_literal58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 201:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:201:15: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 16 :
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: 'uint64'
                    {
                    string_literal59=(Token)match(input,58,FOLLOW_58_in_field_primtype1155);  
                    stream_58.add(string_literal59);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 202:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:202:16: ^( T_LONG )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_LONG, "T_LONG"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:203:4: 'sint64'
                    {
                    string_literal60=(Token)match(input,59,FOLLOW_59_in_field_primtype1166);  
                    stream_59.add(string_literal60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 203:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:203:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:204:4: 'fixed64'
                    {
                    string_literal61=(Token)match(input,60,FOLLOW_60_in_field_primtype1177);  
                    stream_60.add(string_literal61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 204:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:204:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: 'sfixed64'
                    {
                    string_literal62=(Token)match(input,61,FOLLOW_61_in_field_primtype1188);  
                    stream_61.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 205:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:205:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT63=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1199); 
                    T_FLOAT63_tree = (ProtoTree)adaptor.create(T_FLOAT63);
                    adaptor.addChild(root_0, T_FLOAT63_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: 'float32'
                    {
                    string_literal64=(Token)match(input,62,FOLLOW_62_in_field_primtype1204);  
                    stream_62.add(string_literal64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 207:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:207:17: ^( T_FLOAT )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_FLOAT, "T_FLOAT"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 22 :
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE65=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1215); 
                    T_DOUBLE65_tree = (ProtoTree)adaptor.create(T_DOUBLE65);
                    adaptor.addChild(root_0, T_DOUBLE65_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: 'float64'
                    {
                    string_literal66=(Token)match(input,63,FOLLOW_63_in_field_primtype1220);  
                    stream_63.add(string_literal66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 209:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:209:17: ^( T_DOUBLE )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(T_DOUBLE, "T_DOUBLE"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 24 :
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR67=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1231); 
                    T_INDICATOR67_tree = (ProtoTree)adaptor.create(T_INDICATOR67);
                    adaptor.addChild(root_0, T_INDICATOR67_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING68=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1236); 
                    T_STRING68_tree = (ProtoTree)adaptor.create(T_STRING68);
                    adaptor.addChild(root_0, T_STRING68_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:214:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype69 = null;

        ProtoParser.fullidentifier_return fullidentifier70 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:215:2: ( field_primtype | fullidentifier )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=T_BOOL && LA11_0<=T_STRING)||(LA11_0>=48 && LA11_0<=63)) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1247);
                    field_primtype69=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype69.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:216:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1252);
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
    // org/fudgemsg/proto/antlr/Proto.g:219:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype71 = null;

        ProtoParser.field_arraytype_return field_arraytype72 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:220:2: ( field_basetype | field_arraytype )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:220:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1263);
                    field_basetype71=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype71.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:221:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1268);
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
    // org/fudgemsg/proto/antlr/Proto.g:224:1: fullidentifier : IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* ;
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
            // org/fudgemsg/proto/antlr/Proto.g:224:16: ( IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* )
            // org/fudgemsg/proto/antlr/Proto.g:224:18: IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER73=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1278); 
            IDENTIFIER73_tree = (ProtoTree)adaptor.create(IDENTIFIER73);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER73_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:224:30: ( '.' ( IDENTIFIER | anyword ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==64) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:224:31: '.' ( IDENTIFIER | anyword )
            	    {
            	    char_literal74=(Token)match(input,64,FOLLOW_64_in_fullidentifier1282); 
            	    // org/fudgemsg/proto/antlr/Proto.g:224:36: ( IDENTIFIER | anyword )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==IDENTIFIER) ) {
            	        alt13=1;
            	    }
            	    else if ( ((LA13_0>=BINDING && LA13_0<=DEFAULT)||(LA13_0>=ENUM && LA13_0<=EXTERN)||(LA13_0>=IMPORT && LA13_0<=NAMESPACE)||(LA13_0>=REPEATED && LA13_0<=REQUIRED)||(LA13_0>=T_BOOL && LA13_0<=USES)) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:224:37: IDENTIFIER
            	            {
            	            IDENTIFIER75=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1286); 
            	            IDENTIFIER75_tree = (ProtoTree)adaptor.create(IDENTIFIER75);
            	            adaptor.addChild(root_0, IDENTIFIER75_tree);


            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:224:50: anyword
            	            {
            	            pushFollow(FOLLOW_anyword_in_fullidentifier1290);
            	            anyword76=anyword();

            	            state._fsp--;

            	            adaptor.addChild(root_0, anyword76.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // org/fudgemsg/proto/antlr/Proto.g:226:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set77=null;

        ProtoTree set77_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:227:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
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
    // org/fudgemsg/proto/antlr/Proto.g:233:1: message : MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:233:9: ( MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:233:11: MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE78=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1328); 
            MESSAGE78_tree = (ProtoTree)adaptor.create(MESSAGE78);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE78_tree, root_0);

            IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1331); 
            IDENTIFIER79_tree = (ProtoTree)adaptor.create(IDENTIFIER79);
            adaptor.addChild(root_0, IDENTIFIER79_tree);

            // org/fudgemsg/proto/antlr/Proto.g:233:31: ( message_uses )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==USES) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:233:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1333);
                    message_uses80=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses80.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:233:45: ( message_extends )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EXTENDS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:233:45: message_extends
                    {
                    pushFollow(FOLLOW_message_extends_in_message1336);
                    message_extends81=message_extends();

                    state._fsp--;

                    adaptor.addChild(root_0, message_extends81.getTree());

                    }
                    break;

            }

            char_literal82=(Token)match(input,40,FOLLOW_40_in_message1339); 
            // org/fudgemsg/proto/antlr/Proto.g:233:67: ( message_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==BINDING||LA17_0==ENUM||(LA17_0>=MESSAGE && LA17_0<=MUTABLE)||(LA17_0>=REPEATED && LA17_0<=REQUIRED)||(LA17_0>=T_BOOL && LA17_0<=T_STRING)||LA17_0==IDENTIFIER||(LA17_0>=47 && LA17_0<=63)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:233:67: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1342);
            	    message_element83=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element83.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal84=(Token)match(input,41,FOLLOW_41_in_message1345); 

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
    // org/fudgemsg/proto/antlr/Proto.g:235:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum85 = null;

        ProtoParser.message_field_return message_field86 = null;

        ProtoParser.message_submsg_return message_submsg87 = null;

        ProtoParser.binding_return binding88 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:236:2: ( message_enum | message_field | message_submsg | binding )
            int alt18=4;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt18=1;
                }
                break;
            case MUTABLE:
            case REPEATED:
            case REQUIRED:
            case T_BOOL:
            case T_BYTE:
            case T_DOUBLE:
            case T_FLOAT:
            case T_INDICATOR:
            case T_INT:
            case T_LONG:
            case T_SHORT:
            case T_STRING:
            case IDENTIFIER:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
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
                {
                alt18=2;
                }
                break;
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
                    // org/fudgemsg/proto/antlr/Proto.g:236:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1356);
                    message_enum85=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum85.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:237:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1361);
                    message_field86=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field86.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:238:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1366);
                    message_submsg87=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg87.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:239:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1371);
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
    // org/fudgemsg/proto/antlr/Proto.g:242:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:242:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:242:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM89=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1381); 
            ENUM89_tree = (ProtoTree)adaptor.create(ENUM89);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM89_tree, root_0);

            IDENTIFIER90=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1384); 
            IDENTIFIER90_tree = (ProtoTree)adaptor.create(IDENTIFIER90);
            adaptor.addChild(root_0, IDENTIFIER90_tree);

            char_literal91=(Token)match(input,40,FOLLOW_40_in_message_enum1386); 
            // org/fudgemsg/proto/antlr/Proto.g:242:38: ( enum_element )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BINDING||LA19_0==IDENTIFIER) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:242:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1389);
            	    enum_element92=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element92.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            char_literal93=(Token)match(input,41,FOLLOW_41_in_message_enum1392); 

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
    // org/fudgemsg/proto/antlr/Proto.g:244:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );
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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:245:3: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:245:5: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:245:5: ( field_modifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==MUTABLE||(LA20_0>=REPEATED && LA20_0<=REQUIRED)||LA20_0==47) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:245:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1404);
                    	    field_modifier94=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_field_type_in_message_field1407);
                    field_type95=field_type();

                    state._fsp--;

                    stream_field_type.add(field_type95.getTree());
                    IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1409);  
                    stream_IDENTIFIER.add(IDENTIFIER96);

                    // org/fudgemsg/proto/antlr/Proto.g:245:43: ( field_ordinal )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==43) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:245:43: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1411);
                            field_ordinal97=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal97.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:245:58: ( field_constraints )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==44) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:245:58: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1414);
                            field_constraints98=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints98.getTree());

                            }
                            break;

                    }

                    char_literal99=(Token)match(input,42,FOLLOW_42_in_message_field1417);  
                    stream_42.add(char_literal99);



                    // AST REWRITE
                    // elements: field_type, IDENTIFIER, field_constraints, field_modifier, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 245:81: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:245:84: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_field_type.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:245:114: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:245:130: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:245:145: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:246:5: ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:246:5: ( field_modifier )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==MUTABLE||(LA23_0>=REPEATED && LA23_0<=REQUIRED)||LA23_0==47) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:246:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1442);
                    	    field_modifier100=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier100.getTree());

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

                    MESSAGE101=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1445);  
                    stream_MESSAGE.add(MESSAGE101);

                    IDENTIFIER102=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1447);  
                    stream_IDENTIFIER.add(IDENTIFIER102);

                    // org/fudgemsg/proto/antlr/Proto.g:246:40: ( field_ordinal )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==43) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:246:40: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1449);
                            field_ordinal103=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal103.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:246:55: ( field_constraints )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==44) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:246:55: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1452);
                            field_constraints104=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints104.getTree());

                            }
                            break;

                    }

                    char_literal105=(Token)match(input,42,FOLLOW_42_in_message_field1455);  
                    stream_42.add(char_literal105);



                    // AST REWRITE
                    // elements: MESSAGE, field_ordinal, field_modifier, field_constraints, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 246:78: -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:246:81: ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:246:108: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:246:124: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:246:139: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:247:5: ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:247:5: ( field_modifier )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==MUTABLE||(LA26_0>=REPEATED && LA26_0<=REQUIRED)||LA26_0==47) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:247:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1480);
                    	    field_modifier106=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier106.getTree());

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

                    MESSAGE107=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1483);  
                    stream_MESSAGE.add(MESSAGE107);

                    // org/fudgemsg/proto/antlr/Proto.g:247:29: ( dimension )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==44) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:247:29: dimension
                    	    {
                    	    pushFollow(FOLLOW_dimension_in_message_field1485);
                    	    dimension108=dimension();

                    	    state._fsp--;

                    	    stream_dimension.add(dimension108.getTree());

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

                    IDENTIFIER109=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1488);  
                    stream_IDENTIFIER.add(IDENTIFIER109);

                    // org/fudgemsg/proto/antlr/Proto.g:247:51: ( field_ordinal )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==43) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:247:51: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1490);
                            field_ordinal110=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal110.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:247:66: ( field_constraints )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==44) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:247:66: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1493);
                            field_constraints111=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints111.getTree());

                            }
                            break;

                    }

                    char_literal112=(Token)match(input,42,FOLLOW_42_in_message_field1496);  
                    stream_42.add(char_literal112);



                    // AST REWRITE
                    // elements: IDENTIFIER, MESSAGE, dimension, field_constraints, field_modifier, field_ordinal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 247:89: -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:247:92: ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:247:100: ^( ARRAY MESSAGE ( dimension )+ )
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
                        // org/fudgemsg/proto/antlr/Proto.g:247:139: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:247:155: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:247:170: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:250:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:250:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:250:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE113=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1533); 
            MESSAGE113_tree = (ProtoTree)adaptor.create(MESSAGE113);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE113_tree, root_0);

            IDENTIFIER114=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1536); 
            IDENTIFIER114_tree = (ProtoTree)adaptor.create(IDENTIFIER114);
            adaptor.addChild(root_0, IDENTIFIER114_tree);

            char_literal115=(Token)match(input,40,FOLLOW_40_in_message_submsg1538); 
            // org/fudgemsg/proto/antlr/Proto.g:250:43: ( message_element )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==BINDING||LA31_0==ENUM||(LA31_0>=MESSAGE && LA31_0<=MUTABLE)||(LA31_0>=REPEATED && LA31_0<=REQUIRED)||(LA31_0>=T_BOOL && LA31_0<=T_STRING)||LA31_0==IDENTIFIER||(LA31_0>=47 && LA31_0<=63)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:250:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1541);
            	    message_element116=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element116.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            char_literal117=(Token)match(input,41,FOLLOW_41_in_message_submsg1544); 

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
    // org/fudgemsg/proto/antlr/Proto.g:253:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
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
            // org/fudgemsg/proto/antlr/Proto.g:253:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:253:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES118=(Token)match(input,USES,FOLLOW_USES_in_message_uses1555); 
            USES118_tree = (ProtoTree)adaptor.create(USES118);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES118_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1558);
            fullidentifier119=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier119.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:253:37: ( ',' fullidentifier )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:253:38: ',' fullidentifier
            	    {
            	    char_literal120=(Token)match(input,46,FOLLOW_46_in_message_uses1561); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1564);
            	    fullidentifier121=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier121.getTree());

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
    // $ANTLR end "message_uses"

    public static class message_extends_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_extends"
    // org/fudgemsg/proto/antlr/Proto.g:256:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
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
            // org/fudgemsg/proto/antlr/Proto.g:256:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:256:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS122=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1576); 
            EXTENDS122_tree = (ProtoTree)adaptor.create(EXTENDS122);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS122_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1579);
            fullidentifier123=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier123.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:256:43: ( ',' fullidentifier )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:256:44: ',' fullidentifier
            	    {
            	    char_literal124=(Token)match(input,46,FOLLOW_46_in_message_extends1582); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1585);
            	    fullidentifier125=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier125.getTree());

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
    // $ANTLR end "message_extends"

    public static class namespace_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // org/fudgemsg/proto/antlr/Proto.g:258:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:258:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:258:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE126=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1596); 
            NAMESPACE126_tree = (ProtoTree)adaptor.create(NAMESPACE126);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE126_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1599);
            fullidentifier127=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier127.getTree());
            char_literal128=(Token)match(input,40,FOLLOW_40_in_namespace1601); 
            // org/fudgemsg/proto/antlr/Proto.g:258:44: ( root_object )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ENUM||LA34_0==EXTERN||LA34_0==MESSAGE||LA34_0==NAMESPACE||LA34_0==TAXONOMY) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:258:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1604);
            	    root_object129=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object129.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            char_literal130=(Token)match(input,41,FOLLOW_41_in_namespace1607); 

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
    // org/fudgemsg/proto/antlr/Proto.g:260:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object131 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:260:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:260:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:260:8: ( root_object )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ENUM||LA35_0==EXTERN||LA35_0==MESSAGE||LA35_0==NAMESPACE||LA35_0==TAXONOMY) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:260:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1617);
            	    root_object131=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object131.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
            // 260:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:260:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:260:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:262:1: root_object : ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy );
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
            // org/fudgemsg/proto/antlr/Proto.g:263:3: ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy )
            int alt37=5;
            switch ( input.LA(1) ) {
            case EXTERN:
                {
                alt37=1;
                }
                break;
            case MESSAGE:
                {
                alt37=2;
                }
                break;
            case ENUM:
                {
                alt37=3;
                }
                break;
            case NAMESPACE:
                {
                alt37=4;
                }
                break;
            case TAXONOMY:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:263:5: EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )?
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN132=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1637); 
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

                    pushFollow(FOLLOW_fullidentifier_in_root_object1652);
                    fullidentifier134=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier134.getTree());
                    // org/fudgemsg/proto/antlr/Proto.g:263:56: ( ';' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==42) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:263:56: ';'
                            {
                            char_literal135=(Token)match(input,42,FOLLOW_42_in_root_object1654); 
                            char_literal135_tree = (ProtoTree)adaptor.create(char_literal135);
                            adaptor.addChild(root_0, char_literal135_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:264:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1660);
                    message136=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message136.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:265:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1665);
                    message_enum137=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum137.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:266:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1670);
                    namespace138=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace138.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:267:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1675);
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
    // org/fudgemsg/proto/antlr/Proto.g:270:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:270:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:270:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY140=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1685); 
            TAXONOMY140_tree = (ProtoTree)adaptor.create(TAXONOMY140);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY140_tree, root_0);

            IDENTIFIER141=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1688); 
            IDENTIFIER141_tree = (ProtoTree)adaptor.create(IDENTIFIER141);
            adaptor.addChild(root_0, IDENTIFIER141_tree);

            char_literal142=(Token)match(input,40,FOLLOW_40_in_taxonomy1690); 
            // org/fudgemsg/proto/antlr/Proto.g:270:38: ( taxonomy_element )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==BINDING||LA38_0==IMPORT||LA38_0==IDENTIFIER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:270:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1693);
            	    taxonomy_element143=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element143.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            char_literal144=(Token)match(input,41,FOLLOW_41_in_taxonomy1696); 

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
    // org/fudgemsg/proto/antlr/Proto.g:272:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:273:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==BINDING||LA39_0==IDENTIFIER) ) {
                alt39=1;
            }
            else if ( (LA39_0==IMPORT) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:273:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1707);
                    enum_element145=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element145.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:274:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT146=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1712); 
                    IMPORT146_tree = (ProtoTree)adaptor.create(IMPORT146);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT146_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1715);
                    fullidentifier147=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier147.getTree());
                    char_literal148=(Token)match(input,42,FOLLOW_42_in_taxonomy_element1717); 

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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA12_eotS =
        "\40\uffff";
    static final String DFA12_eofS =
        "\40\uffff";
    static final String DFA12_minS =
        "\1\25\32\41\2\uffff\1\5\2\41";
    static final String DFA12_maxS =
        "\1\77\31\54\1\100\2\uffff\1\41\2\100";
    static final String DFA12_acceptS =
        "\33\uffff\1\2\1\1\3\uffff";
    static final String DFA12_specialS =
        "\40\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\3\1\26\1\24\1\30\1\7\1\16\1\5\1\31\3\uffff\1\32\16\uffff"+
            "\1\2\1\4\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1"+
            "\22\1\23\1\25\1\27",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33",
            "\1\34\12\uffff\1\33\23\uffff\1\35",
            "",
            "",
            "\2\37\2\uffff\3\37\1\uffff\4\37\1\uffff\2\37\1\uffff\13\37\1"+
            "\uffff\1\36",
            "\1\34\12\uffff\1\33\23\uffff\1\35",
            "\1\34\12\uffff\1\33\23\uffff\1\35"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "219:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
    static final String DFA30_eotS =
        "\11\uffff";
    static final String DFA30_eofS =
        "\11\uffff";
    static final String DFA30_minS =
        "\1\17\4\16\1\uffff\1\41\2\uffff";
    static final String DFA30_maxS =
        "\5\77\1\uffff\1\54\2\uffff";
    static final String DFA30_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA30_specialS =
        "\11\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\2\uffff\1\4\1\2\1\uffff\11\5\3\uffff\1\5\15\uffff\1\3\20"+
            "\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\11\5\3\uffff\1\5\15\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\11\5\3\uffff\1\5\15\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\11\5\3\uffff\1\5\15\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\11\5\3\uffff\1\5\15\uffff\1"+
            "\3\20\5",
            "",
            "\1\7\12\uffff\1\10",
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
            return "244:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_anyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding752 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_binding_anyword_in_binding755 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_binding757 = new BitSet(new long[]{0x0000024200000000L});
    public static final BitSet FOLLOW_binding_element_in_binding760 = new BitSet(new long[]{0x0000024200000000L});
    public static final BitSet FOLLOW_41_in_binding764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element790 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text802 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_binding_text804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text815 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_binding_text817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default828 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_constraint_default831 = new BitSet(new long[]{0x0000004E00000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_dimension844 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension846 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_dimension848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_dimension861 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_dimension863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_enum_element881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element887 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element890 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_enum_element893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_enum_value905 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_field_constraints926 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints929 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_46_in_field_constraints932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints935 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_45_in_field_constraints939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_field_ordinal949 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_field_modifier970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_field_modifier975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_modifier980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_field_modifier986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype996 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype998 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_primtype1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_primtype1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_primtype1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_primtype1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_field_primtype1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_fullidentifier1282 = new BitSet(new long[]{0x00000002FFEDEE60L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_anyword_in_fullidentifier1290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1328 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1331 = new BitSet(new long[]{0x0000010080000400L});
    public static final BitSet FOLLOW_message_uses_in_message1333 = new BitSet(new long[]{0x0000010000000400L});
    public static final BitSet FOLLOW_message_extends_in_message1336 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_message1339 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_message_element_in_message1342 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_41_in_message1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1381 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1384 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_message_enum1386 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1389 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_41_in_message_enum1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1404 = new BitSet(new long[]{0xFFFF80023FEC8000L});
    public static final BitSet FOLLOW_field_type_in_message_field1407 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1409 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1411 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1414 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_message_field1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1442 = new BitSet(new long[]{0x00008000000CC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1445 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1447 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1449 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1452 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_message_field1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1480 = new BitSet(new long[]{0x00008000000CC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1483 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_dimension_in_message_field1485 = new BitSet(new long[]{0x0000100200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1488 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1490 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1493 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_message_field1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1533 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1536 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_message_submsg1538 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_message_element_in_message_submsg1541 = new BitSet(new long[]{0xFFFF82023FECC220L});
    public static final BitSet FOLLOW_41_in_message_submsg1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1555 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1558 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_message_uses1561 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1564 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1576 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1579 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_message_extends1582 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1585 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1596 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1599 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_namespace1601 = new BitSet(new long[]{0x0000020040014A00L});
    public static final BitSet FOLLOW_root_object_in_namespace1604 = new BitSet(new long[]{0x0000020040014A00L});
    public static final BitSet FOLLOW_41_in_namespace1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1617 = new BitSet(new long[]{0x0000000040014A02L});
    public static final BitSet FOLLOW_EXTERN_in_root_object1637 = new BitSet(new long[]{0x0000000040004200L});
    public static final BitSet FOLLOW_set_in_root_object1640 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_root_object1652 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_root_object1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_root_object1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1685 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1688 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_taxonomy1690 = new BitSet(new long[]{0xFFFF82023FECE220L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1693 = new BitSet(new long[]{0xFFFF82023FECE220L});
    public static final BitSet FOLLOW_41_in_taxonomy1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1715 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_taxonomy_element1717 = new BitSet(new long[]{0x0000000000000002L});

}