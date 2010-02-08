// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-02-05 13:51:52

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "EXTERN", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_DATE", "T_DATETIME", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "T_TIME", "TAXONOMY", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "TIME", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'optional'", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
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
    public static final int T_DOUBLE=23;
    public static final int EXTERN=11;
    public static final int FLOAT=38;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int T_BYTE=22;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=7;
    public static final int DEFAULT=6;
    public static final int ORDINAL=17;
    public static final int T_FLOAT=26;
    public static final int REPEATED=18;
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
    public static final int T_SHORT=30;
    public static final int EXTENDS=10;
    public static final int MUTABLE=15;
    public static final int STRING=41;

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
    // org/fudgemsg/proto/antlr/Proto.g:119:1: anyword : ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | TIME | USES );
    public final ProtoParser.anyword_return anyword() throws RecognitionException {
        ProtoParser.anyword_return retval = new ProtoParser.anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set1=null;

        ProtoTree set1_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:120:3: ( BINDING | DEFAULT | ENUM | EXTENDS | EXTERN | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DATE | T_DATETIME | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | T_TIME | TAXONOMY | TIME | USES )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set1=(Token)input.LT(1);
            if ( (input.LA(1)>=BINDING && input.LA(1)<=DEFAULT)||(input.LA(1)>=ENUM && input.LA(1)<=EXTERN)||(input.LA(1)>=IMPORT && input.LA(1)<=NAMESPACE)||(input.LA(1)>=REPEATED && input.LA(1)<=REQUIRED)||(input.LA(1)>=T_BOOL && input.LA(1)<=USES)||input.LA(1)==TIME ) {
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
    // org/fudgemsg/proto/antlr/Proto.g:148:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:148:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:148:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING2=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding811); 
            BINDING2_tree = (ProtoTree)adaptor.create(BINDING2);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING2_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding814);
            binding_anyword3=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword3.getTree());
            char_literal4=(Token)match(input,44,FOLLOW_44_in_binding816); 
            // org/fudgemsg/proto/antlr/Proto.g:148:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:148:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding819);
            	    binding_element5=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal6=(Token)match(input,45,FOLLOW_45_in_binding823); 

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
    // org/fudgemsg/proto/antlr/Proto.g:150:1: binding_anyword : ( fullidentifier | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING8=null;
        ProtoParser.fullidentifier_return fullidentifier7 = null;


        ProtoTree STRING8_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:151:2: ( fullidentifier | STRING )
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
                    // org/fudgemsg/proto/antlr/Proto.g:151:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword834);
                    fullidentifier7=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier7.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:152:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING8=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword839); 
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
    // org/fudgemsg/proto/antlr/Proto.g:155:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword9 = null;

        ProtoParser.binding_text_return binding_text10 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:155:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:155:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element849);
            binding_anyword9=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword9.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element851);
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
    // org/fudgemsg/proto/antlr/Proto.g:157:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:158:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:158:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text861); 
                    STRING11_tree = (ProtoTree)adaptor.create(STRING11);
                    adaptor.addChild(root_0, STRING11_tree);

                    char_literal12=(Token)match(input,46,FOLLOW_46_in_binding_text863); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:159:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING13=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text869); 
                    ML_STRING13_tree = (ProtoTree)adaptor.create(ML_STRING13);
                    adaptor.addChild(root_0, ML_STRING13_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:160:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text874);
                    fullidentifier14=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier14.getTree());
                    char_literal15=(Token)match(input,46,FOLLOW_46_in_binding_text876); 

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
    // org/fudgemsg/proto/antlr/Proto.g:163:1: constraint_default : DEFAULT '=' literal ;
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
            // org/fudgemsg/proto/antlr/Proto.g:163:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:163:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT16=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default887); 
            DEFAULT16_tree = (ProtoTree)adaptor.create(DEFAULT16);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT16_tree, root_0);

            char_literal17=(Token)match(input,47,FOLLOW_47_in_constraint_default890); 
            pushFollow(FOLLOW_literal_in_constraint_default893);
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
    // org/fudgemsg/proto/antlr/Proto.g:165:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:166:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==49) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:166:4: '[' INTEGER ']'
                    {
                    char_literal19=(Token)match(input,48,FOLLOW_48_in_dimension903);  
                    stream_48.add(char_literal19);

                    INTEGER20=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension905);  
                    stream_INTEGER.add(INTEGER20);

                    char_literal21=(Token)match(input,49,FOLLOW_49_in_dimension907);  
                    stream_49.add(char_literal21);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 166:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:166:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:167:4: '[' ']'
                    {
                    char_literal22=(Token)match(input,48,FOLLOW_48_in_dimension920);  
                    stream_48.add(char_literal22);

                    char_literal23=(Token)match(input,49,FOLLOW_49_in_dimension922);  
                    stream_49.add(char_literal23);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 167:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:167:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:170:1: enum_element : ( binding | IDENTIFIER ( enum_value )? ';' );
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
            // org/fudgemsg/proto/antlr/Proto.g:171:3: ( binding | IDENTIFIER ( enum_value )? ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:171:5: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_enum_element940);
                    binding24=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding24.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:172:5: IDENTIFIER ( enum_value )? ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element946); 
                    IDENTIFIER25_tree = (ProtoTree)adaptor.create(IDENTIFIER25);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER25_tree, root_0);

                    // org/fudgemsg/proto/antlr/Proto.g:172:17: ( enum_value )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==47) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:172:17: enum_value
                            {
                            pushFollow(FOLLOW_enum_value_in_enum_element949);
                            enum_value26=enum_value();

                            state._fsp--;

                            adaptor.addChild(root_0, enum_value26.getTree());

                            }
                            break;

                    }

                    char_literal27=(Token)match(input,46,FOLLOW_46_in_enum_element952); 

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
    // org/fudgemsg/proto/antlr/Proto.g:175:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal28=null;
        Token INTEGER29=null;

        ProtoTree char_literal28_tree=null;
        ProtoTree INTEGER29_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:175:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:175:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal28=(Token)match(input,47,FOLLOW_47_in_enum_value964); 
            INTEGER29=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value967); 
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
    // org/fudgemsg/proto/antlr/Proto.g:177:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default30 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:177:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:177:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint976);
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
    // org/fudgemsg/proto/antlr/Proto.g:179:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:179:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:179:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal31=(Token)match(input,48,FOLLOW_48_in_field_constraints985); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints988);
            field_constraint32=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint32.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:179:43: ( ',' field_constraint )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==50) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:179:44: ',' field_constraint
            	    {
            	    char_literal33=(Token)match(input,50,FOLLOW_50_in_field_constraints991); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints994);
            	    field_constraint34=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint34.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal35=(Token)match(input,49,FOLLOW_49_in_field_constraints998); 

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
    // org/fudgemsg/proto/antlr/Proto.g:181:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal36=null;
        Token INTEGER37=null;

        ProtoTree char_literal36_tree=null;
        ProtoTree INTEGER37_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:181:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:181:17: '=' INTEGER
            {
            char_literal36=(Token)match(input,47,FOLLOW_47_in_field_ordinal1008);  
            stream_47.add(char_literal36);

            INTEGER37=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal1010);  
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
            // 181:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:181:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:184:1: field_modifier : ( MUTABLE | REQUIRED | 'optional' | REPEATED );
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
            // org/fudgemsg/proto/antlr/Proto.g:185:2: ( MUTABLE | REQUIRED | 'optional' | REPEATED )
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
            case 51:
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
                    // org/fudgemsg/proto/antlr/Proto.g:185:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE38=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_field_modifier1029); 
                    MUTABLE38_tree = (ProtoTree)adaptor.create(MUTABLE38);
                    adaptor.addChild(root_0, MUTABLE38_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:186:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED39=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_modifier1034); 
                    REQUIRED39_tree = (ProtoTree)adaptor.create(REQUIRED39);
                    adaptor.addChild(root_0, REQUIRED39_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:187:4: 'optional'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    string_literal40=(Token)match(input,51,FOLLOW_51_in_field_modifier1039); 

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:188:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED41=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_field_modifier1045); 
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
    // org/fudgemsg/proto/antlr/Proto.g:191:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype42 = null;

        ProtoParser.dimension_return dimension43 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:191:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:191:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype1055);
            field_basetype42=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype42.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:191:34: ( dimension )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:191:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype1057);
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
            // 191:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:191:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:193:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL44=null;
        Token string_literal45=null;
        Token T_BYTE46=null;
        Token string_literal47=null;
        Token T_DATE48=null;
        Token T_DATETIME49=null;
        Token T_SHORT50=null;
        Token string_literal51=null;
        Token T_INT52=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token string_literal57=null;
        Token string_literal58=null;
        Token T_LONG59=null;
        Token string_literal60=null;
        Token string_literal61=null;
        Token string_literal62=null;
        Token string_literal63=null;
        Token string_literal64=null;
        Token T_FLOAT65=null;
        Token string_literal66=null;
        Token T_DOUBLE67=null;
        Token string_literal68=null;
        Token T_INDICATOR69=null;
        Token T_STRING70=null;
        Token T_TIME71=null;

        ProtoTree T_BOOL44_tree=null;
        ProtoTree string_literal45_tree=null;
        ProtoTree T_BYTE46_tree=null;
        ProtoTree string_literal47_tree=null;
        ProtoTree T_DATE48_tree=null;
        ProtoTree T_DATETIME49_tree=null;
        ProtoTree T_SHORT50_tree=null;
        ProtoTree string_literal51_tree=null;
        ProtoTree T_INT52_tree=null;
        ProtoTree string_literal53_tree=null;
        ProtoTree string_literal54_tree=null;
        ProtoTree string_literal55_tree=null;
        ProtoTree string_literal56_tree=null;
        ProtoTree string_literal57_tree=null;
        ProtoTree string_literal58_tree=null;
        ProtoTree T_LONG59_tree=null;
        ProtoTree string_literal60_tree=null;
        ProtoTree string_literal61_tree=null;
        ProtoTree string_literal62_tree=null;
        ProtoTree string_literal63_tree=null;
        ProtoTree string_literal64_tree=null;
        ProtoTree T_FLOAT65_tree=null;
        ProtoTree string_literal66_tree=null;
        ProtoTree T_DOUBLE67_tree=null;
        ProtoTree string_literal68_tree=null;
        ProtoTree T_INDICATOR69_tree=null;
        ProtoTree T_STRING70_tree=null;
        ProtoTree T_TIME71_tree=null;
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
            // org/fudgemsg/proto/antlr/Proto.g:194:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_DATE | T_DATETIME | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING | T_TIME )
            int alt10=28;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt10=1;
                }
                break;
            case 52:
                {
                alt10=2;
                }
                break;
            case T_BYTE:
                {
                alt10=3;
                }
                break;
            case 53:
                {
                alt10=4;
                }
                break;
            case T_DATE:
                {
                alt10=5;
                }
                break;
            case T_DATETIME:
                {
                alt10=6;
                }
                break;
            case T_SHORT:
                {
                alt10=7;
                }
                break;
            case 54:
                {
                alt10=8;
                }
                break;
            case T_INT:
                {
                alt10=9;
                }
                break;
            case 55:
                {
                alt10=10;
                }
                break;
            case 56:
                {
                alt10=11;
                }
                break;
            case 57:
                {
                alt10=12;
                }
                break;
            case 58:
                {
                alt10=13;
                }
                break;
            case 59:
                {
                alt10=14;
                }
                break;
            case 60:
                {
                alt10=15;
                }
                break;
            case T_LONG:
                {
                alt10=16;
                }
                break;
            case 61:
                {
                alt10=17;
                }
                break;
            case 62:
                {
                alt10=18;
                }
                break;
            case 63:
                {
                alt10=19;
                }
                break;
            case 64:
                {
                alt10=20;
                }
                break;
            case 65:
                {
                alt10=21;
                }
                break;
            case T_FLOAT:
                {
                alt10=22;
                }
                break;
            case 66:
                {
                alt10=23;
                }
                break;
            case T_DOUBLE:
                {
                alt10=24;
                }
                break;
            case 67:
                {
                alt10=25;
                }
                break;
            case T_INDICATOR:
                {
                alt10=26;
                }
                break;
            case T_STRING:
                {
                alt10=27;
                }
                break;
            case T_TIME:
                {
                alt10=28;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:194:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL44=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype1079); 
                    T_BOOL44_tree = (ProtoTree)adaptor.create(T_BOOL44);
                    adaptor.addChild(root_0, T_BOOL44_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:195:4: 'boolean'
                    {
                    string_literal45=(Token)match(input,52,FOLLOW_52_in_field_primtype1084);  
                    stream_52.add(string_literal45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 195:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:195:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:196:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE46=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype1095); 
                    T_BYTE46_tree = (ProtoTree)adaptor.create(T_BYTE46);
                    adaptor.addChild(root_0, T_BYTE46_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:197:4: 'int8'
                    {
                    string_literal47=(Token)match(input,53,FOLLOW_53_in_field_primtype1100);  
                    stream_53.add(string_literal47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 197:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:197:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:198:4: T_DATE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATE48=(Token)match(input,T_DATE,FOLLOW_T_DATE_in_field_primtype1111); 
                    T_DATE48_tree = (ProtoTree)adaptor.create(T_DATE48);
                    adaptor.addChild(root_0, T_DATE48_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:199:4: T_DATETIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DATETIME49=(Token)match(input,T_DATETIME,FOLLOW_T_DATETIME_in_field_primtype1116); 
                    T_DATETIME49_tree = (ProtoTree)adaptor.create(T_DATETIME49);
                    adaptor.addChild(root_0, T_DATETIME49_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT50=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1121); 
                    T_SHORT50_tree = (ProtoTree)adaptor.create(T_SHORT50);
                    adaptor.addChild(root_0, T_SHORT50_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: 'int16'
                    {
                    string_literal51=(Token)match(input,54,FOLLOW_54_in_field_primtype1126);  
                    stream_54.add(string_literal51);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 201:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:201:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT52=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1137); 
                    T_INT52_tree = (ProtoTree)adaptor.create(T_INT52);
                    adaptor.addChild(root_0, T_INT52_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:203:4: 'int32'
                    {
                    string_literal53=(Token)match(input,55,FOLLOW_55_in_field_primtype1142);  
                    stream_55.add(string_literal53);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 203:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:203:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:204:4: 'uint32'
                    {
                    string_literal54=(Token)match(input,56,FOLLOW_56_in_field_primtype1153);  
                    stream_56.add(string_literal54);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 204:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:204:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: 'sint32'
                    {
                    string_literal55=(Token)match(input,57,FOLLOW_57_in_field_primtype1164);  
                    stream_57.add(string_literal55);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 205:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:205:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: 'fixed32'
                    {
                    string_literal56=(Token)match(input,58,FOLLOW_58_in_field_primtype1175);  
                    stream_58.add(string_literal56);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 206:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:206:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: 'sfixed32'
                    {
                    string_literal57=(Token)match(input,59,FOLLOW_59_in_field_primtype1186);  
                    stream_59.add(string_literal57);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 207:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:207:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: 'integer'
                    {
                    string_literal58=(Token)match(input,60,FOLLOW_60_in_field_primtype1197);  
                    stream_60.add(string_literal58);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 208:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:208:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG59=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1208); 
                    T_LONG59_tree = (ProtoTree)adaptor.create(T_LONG59);
                    adaptor.addChild(root_0, T_LONG59_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: 'int64'
                    {
                    string_literal60=(Token)match(input,61,FOLLOW_61_in_field_primtype1213);  
                    stream_61.add(string_literal60);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 210:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:210:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: 'uint64'
                    {
                    string_literal61=(Token)match(input,62,FOLLOW_62_in_field_primtype1224);  
                    stream_62.add(string_literal61);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 211:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:211:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: 'sint64'
                    {
                    string_literal62=(Token)match(input,63,FOLLOW_63_in_field_primtype1235);  
                    stream_63.add(string_literal62);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 212:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:212:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:213:4: 'fixed64'
                    {
                    string_literal63=(Token)match(input,64,FOLLOW_64_in_field_primtype1246);  
                    stream_64.add(string_literal63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 213:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:213:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:214:4: 'sfixed64'
                    {
                    string_literal64=(Token)match(input,65,FOLLOW_65_in_field_primtype1257);  
                    stream_65.add(string_literal64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 214:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:214:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT65=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1268); 
                    T_FLOAT65_tree = (ProtoTree)adaptor.create(T_FLOAT65);
                    adaptor.addChild(root_0, T_FLOAT65_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:216:4: 'float32'
                    {
                    string_literal66=(Token)match(input,66,FOLLOW_66_in_field_primtype1273);  
                    stream_66.add(string_literal66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 216:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:216:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:217:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE67=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1284); 
                    T_DOUBLE67_tree = (ProtoTree)adaptor.create(T_DOUBLE67);
                    adaptor.addChild(root_0, T_DOUBLE67_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:218:4: 'float64'
                    {
                    string_literal68=(Token)match(input,67,FOLLOW_67_in_field_primtype1289);  
                    stream_67.add(string_literal68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 218:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:218:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:219:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR69=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1300); 
                    T_INDICATOR69_tree = (ProtoTree)adaptor.create(T_INDICATOR69);
                    adaptor.addChild(root_0, T_INDICATOR69_tree);


                    }
                    break;
                case 27 :
                    // org/fudgemsg/proto/antlr/Proto.g:220:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING70=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1305); 
                    T_STRING70_tree = (ProtoTree)adaptor.create(T_STRING70);
                    adaptor.addChild(root_0, T_STRING70_tree);


                    }
                    break;
                case 28 :
                    // org/fudgemsg/proto/antlr/Proto.g:221:4: T_TIME
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_TIME71=(Token)match(input,T_TIME,FOLLOW_T_TIME_in_field_primtype1310); 
                    T_TIME71_tree = (ProtoTree)adaptor.create(T_TIME71);
                    adaptor.addChild(root_0, T_TIME71_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:224:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype72 = null;

        ProtoParser.fullidentifier_return fullidentifier73 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:225:2: ( field_primtype | fullidentifier )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=T_BOOL && LA11_0<=T_TIME)||(LA11_0>=52 && LA11_0<=67)) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:225:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1321);
                    field_primtype72=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype72.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:226:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1326);
                    fullidentifier73=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier73.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:229:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype74 = null;

        ProtoParser.field_arraytype_return field_arraytype75 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:230:2: ( field_basetype | field_arraytype )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:230:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1337);
                    field_basetype74=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype74.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:231:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1342);
                    field_arraytype75=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype75.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:234:1: fullidentifier : IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER76=null;
        Token char_literal77=null;
        Token IDENTIFIER78=null;
        ProtoParser.anyword_return anyword79 = null;


        ProtoTree IDENTIFIER76_tree=null;
        ProtoTree char_literal77_tree=null;
        ProtoTree IDENTIFIER78_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:234:16: ( IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )* )
            // org/fudgemsg/proto/antlr/Proto.g:234:18: IDENTIFIER ( '.' ( IDENTIFIER | anyword ) )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1352); 
            IDENTIFIER76_tree = (ProtoTree)adaptor.create(IDENTIFIER76);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER76_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:234:30: ( '.' ( IDENTIFIER | anyword ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==68) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:234:31: '.' ( IDENTIFIER | anyword )
            	    {
            	    char_literal77=(Token)match(input,68,FOLLOW_68_in_fullidentifier1356); 
            	    // org/fudgemsg/proto/antlr/Proto.g:234:36: ( IDENTIFIER | anyword )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==IDENTIFIER) ) {
            	        alt13=1;
            	    }
            	    else if ( ((LA13_0>=BINDING && LA13_0<=DEFAULT)||(LA13_0>=ENUM && LA13_0<=EXTERN)||(LA13_0>=IMPORT && LA13_0<=NAMESPACE)||(LA13_0>=REPEATED && LA13_0<=REQUIRED)||(LA13_0>=T_BOOL && LA13_0<=USES)||LA13_0==TIME) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // org/fudgemsg/proto/antlr/Proto.g:234:37: IDENTIFIER
            	            {
            	            IDENTIFIER78=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1360); 
            	            IDENTIFIER78_tree = (ProtoTree)adaptor.create(IDENTIFIER78);
            	            adaptor.addChild(root_0, IDENTIFIER78_tree);


            	            }
            	            break;
            	        case 2 :
            	            // org/fudgemsg/proto/antlr/Proto.g:234:50: anyword
            	            {
            	            pushFollow(FOLLOW_anyword_in_fullidentifier1364);
            	            anyword79=anyword();

            	            state._fsp--;

            	            adaptor.addChild(root_0, anyword79.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:236:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set80=null;

        ProtoTree set80_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:237:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set80=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set80));
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
    // org/fudgemsg/proto/antlr/Proto.g:243:1: message : MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE81=null;
        Token IDENTIFIER82=null;
        Token char_literal85=null;
        Token char_literal87=null;
        ProtoParser.message_uses_return message_uses83 = null;

        ProtoParser.message_extends_return message_extends84 = null;

        ProtoParser.message_element_return message_element86 = null;


        ProtoTree MESSAGE81_tree=null;
        ProtoTree IDENTIFIER82_tree=null;
        ProtoTree char_literal85_tree=null;
        ProtoTree char_literal87_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:243:9: ( MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:243:11: MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE81=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1402); 
            MESSAGE81_tree = (ProtoTree)adaptor.create(MESSAGE81);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE81_tree, root_0);

            IDENTIFIER82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1405); 
            IDENTIFIER82_tree = (ProtoTree)adaptor.create(IDENTIFIER82);
            adaptor.addChild(root_0, IDENTIFIER82_tree);

            // org/fudgemsg/proto/antlr/Proto.g:243:31: ( message_uses )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==USES) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:243:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1407);
                    message_uses83=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses83.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:243:45: ( message_extends )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EXTENDS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:243:45: message_extends
                    {
                    pushFollow(FOLLOW_message_extends_in_message1410);
                    message_extends84=message_extends();

                    state._fsp--;

                    adaptor.addChild(root_0, message_extends84.getTree());

                    }
                    break;

            }

            char_literal85=(Token)match(input,44,FOLLOW_44_in_message1413); 
            // org/fudgemsg/proto/antlr/Proto.g:243:67: ( message_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==BINDING||LA17_0==ENUM||(LA17_0>=MESSAGE && LA17_0<=MUTABLE)||(LA17_0>=REPEATED && LA17_0<=REQUIRED)||(LA17_0>=T_BOOL && LA17_0<=T_TIME)||LA17_0==IDENTIFIER||(LA17_0>=51 && LA17_0<=67)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:243:67: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1416);
            	    message_element86=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element86.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal87=(Token)match(input,45,FOLLOW_45_in_message1419); 

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
    // org/fudgemsg/proto/antlr/Proto.g:245:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum88 = null;

        ProtoParser.message_field_return message_field89 = null;

        ProtoParser.message_submsg_return message_submsg90 = null;

        ProtoParser.binding_return binding91 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:246:2: ( message_enum | message_field | message_submsg | binding )
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
            case 64:
            case 65:
            case 66:
            case 67:
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
                    // org/fudgemsg/proto/antlr/Proto.g:246:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1430);
                    message_enum88=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum88.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:247:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1435);
                    message_field89=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field89.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:248:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1440);
                    message_submsg90=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg90.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1445);
                    binding91=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding91.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:252:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM92=null;
        Token IDENTIFIER93=null;
        Token char_literal94=null;
        Token char_literal96=null;
        ProtoParser.enum_element_return enum_element95 = null;


        ProtoTree ENUM92_tree=null;
        ProtoTree IDENTIFIER93_tree=null;
        ProtoTree char_literal94_tree=null;
        ProtoTree char_literal96_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:252:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:252:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM92=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1455); 
            ENUM92_tree = (ProtoTree)adaptor.create(ENUM92);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM92_tree, root_0);

            IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1458); 
            IDENTIFIER93_tree = (ProtoTree)adaptor.create(IDENTIFIER93);
            adaptor.addChild(root_0, IDENTIFIER93_tree);

            char_literal94=(Token)match(input,44,FOLLOW_44_in_message_enum1460); 
            // org/fudgemsg/proto/antlr/Proto.g:252:38: ( enum_element )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BINDING||LA19_0==IDENTIFIER) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:252:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1463);
            	    enum_element95=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element95.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            char_literal96=(Token)match(input,45,FOLLOW_45_in_message_enum1466); 

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
    // org/fudgemsg/proto/antlr/Proto.g:254:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER99=null;
        Token char_literal102=null;
        Token MESSAGE104=null;
        Token IDENTIFIER105=null;
        Token char_literal108=null;
        Token MESSAGE110=null;
        Token IDENTIFIER112=null;
        Token char_literal115=null;
        ProtoParser.field_modifier_return field_modifier97 = null;

        ProtoParser.field_type_return field_type98 = null;

        ProtoParser.field_ordinal_return field_ordinal100 = null;

        ProtoParser.field_constraints_return field_constraints101 = null;

        ProtoParser.field_modifier_return field_modifier103 = null;

        ProtoParser.field_ordinal_return field_ordinal106 = null;

        ProtoParser.field_constraints_return field_constraints107 = null;

        ProtoParser.field_modifier_return field_modifier109 = null;

        ProtoParser.dimension_return dimension111 = null;

        ProtoParser.field_ordinal_return field_ordinal113 = null;

        ProtoParser.field_constraints_return field_constraints114 = null;


        ProtoTree IDENTIFIER99_tree=null;
        ProtoTree char_literal102_tree=null;
        ProtoTree MESSAGE104_tree=null;
        ProtoTree IDENTIFIER105_tree=null;
        ProtoTree char_literal108_tree=null;
        ProtoTree MESSAGE110_tree=null;
        ProtoTree IDENTIFIER112_tree=null;
        ProtoTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:255:3: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:255:5: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:255:5: ( field_modifier )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==MUTABLE||(LA20_0>=REPEATED && LA20_0<=REQUIRED)||LA20_0==51) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:255:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1478);
                    	    field_modifier97=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier97.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    pushFollow(FOLLOW_field_type_in_message_field1481);
                    field_type98=field_type();

                    state._fsp--;

                    stream_field_type.add(field_type98.getTree());
                    IDENTIFIER99=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1483);  
                    stream_IDENTIFIER.add(IDENTIFIER99);

                    // org/fudgemsg/proto/antlr/Proto.g:255:43: ( field_ordinal )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==47) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:255:43: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1485);
                            field_ordinal100=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal100.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:255:58: ( field_constraints )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==48) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:255:58: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1488);
                            field_constraints101=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints101.getTree());

                            }
                            break;

                    }

                    char_literal102=(Token)match(input,46,FOLLOW_46_in_message_field1491);  
                    stream_46.add(char_literal102);



                    // AST REWRITE
                    // elements: field_ordinal, field_modifier, IDENTIFIER, field_constraints, field_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 255:81: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:255:84: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_field_type.nextTree());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:255:114: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:255:130: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:255:145: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:256:5: ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:256:5: ( field_modifier )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==MUTABLE||(LA23_0>=REPEATED && LA23_0<=REQUIRED)||LA23_0==51) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:256:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1516);
                    	    field_modifier103=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier103.getTree());

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

                    MESSAGE104=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1519);  
                    stream_MESSAGE.add(MESSAGE104);

                    IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1521);  
                    stream_IDENTIFIER.add(IDENTIFIER105);

                    // org/fudgemsg/proto/antlr/Proto.g:256:40: ( field_ordinal )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==47) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:256:40: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1523);
                            field_ordinal106=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal106.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:256:55: ( field_constraints )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==48) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:256:55: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1526);
                            field_constraints107=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints107.getTree());

                            }
                            break;

                    }

                    char_literal108=(Token)match(input,46,FOLLOW_46_in_message_field1529);  
                    stream_46.add(char_literal108);



                    // AST REWRITE
                    // elements: MESSAGE, field_constraints, IDENTIFIER, field_ordinal, field_modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 256:78: -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:256:81: ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        adaptor.addChild(root_1, stream_MESSAGE.nextNode());
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // org/fudgemsg/proto/antlr/Proto.g:256:108: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:256:124: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:256:139: ( field_constraints )?
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
                    // org/fudgemsg/proto/antlr/Proto.g:257:5: ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
                    {
                    // org/fudgemsg/proto/antlr/Proto.g:257:5: ( field_modifier )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==MUTABLE||(LA26_0>=REPEATED && LA26_0<=REQUIRED)||LA26_0==51) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:257:5: field_modifier
                    	    {
                    	    pushFollow(FOLLOW_field_modifier_in_message_field1554);
                    	    field_modifier109=field_modifier();

                    	    state._fsp--;

                    	    stream_field_modifier.add(field_modifier109.getTree());

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

                    MESSAGE110=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_field1557);  
                    stream_MESSAGE.add(MESSAGE110);

                    // org/fudgemsg/proto/antlr/Proto.g:257:29: ( dimension )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==48) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // org/fudgemsg/proto/antlr/Proto.g:257:29: dimension
                    	    {
                    	    pushFollow(FOLLOW_dimension_in_message_field1559);
                    	    dimension111=dimension();

                    	    state._fsp--;

                    	    stream_dimension.add(dimension111.getTree());

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

                    IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1562);  
                    stream_IDENTIFIER.add(IDENTIFIER112);

                    // org/fudgemsg/proto/antlr/Proto.g:257:51: ( field_ordinal )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==47) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:257:51: field_ordinal
                            {
                            pushFollow(FOLLOW_field_ordinal_in_message_field1564);
                            field_ordinal113=field_ordinal();

                            state._fsp--;

                            stream_field_ordinal.add(field_ordinal113.getTree());

                            }
                            break;

                    }

                    // org/fudgemsg/proto/antlr/Proto.g:257:66: ( field_constraints )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==48) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:257:66: field_constraints
                            {
                            pushFollow(FOLLOW_field_constraints_in_message_field1567);
                            field_constraints114=field_constraints();

                            state._fsp--;

                            stream_field_constraints.add(field_constraints114.getTree());

                            }
                            break;

                    }

                    char_literal115=(Token)match(input,46,FOLLOW_46_in_message_field1570);  
                    stream_46.add(char_literal115);



                    // AST REWRITE
                    // elements: field_ordinal, MESSAGE, field_constraints, dimension, field_modifier, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 257:89: -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:257:92: ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                        {
                        ProtoTree root_1 = (ProtoTree)adaptor.nil();
                        root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                        // org/fudgemsg/proto/antlr/Proto.g:257:100: ^( ARRAY MESSAGE ( dimension )+ )
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
                        // org/fudgemsg/proto/antlr/Proto.g:257:139: ( field_modifier )*
                        while ( stream_field_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_modifier.nextTree());

                        }
                        stream_field_modifier.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:257:155: ( field_ordinal )?
                        if ( stream_field_ordinal.hasNext() ) {
                            adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                        }
                        stream_field_ordinal.reset();
                        // org/fudgemsg/proto/antlr/Proto.g:257:170: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:260:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE116=null;
        Token IDENTIFIER117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        ProtoParser.message_element_return message_element119 = null;


        ProtoTree MESSAGE116_tree=null;
        ProtoTree IDENTIFIER117_tree=null;
        ProtoTree char_literal118_tree=null;
        ProtoTree char_literal120_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:260:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:260:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE116=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1607); 
            MESSAGE116_tree = (ProtoTree)adaptor.create(MESSAGE116);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE116_tree, root_0);

            IDENTIFIER117=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1610); 
            IDENTIFIER117_tree = (ProtoTree)adaptor.create(IDENTIFIER117);
            adaptor.addChild(root_0, IDENTIFIER117_tree);

            char_literal118=(Token)match(input,44,FOLLOW_44_in_message_submsg1612); 
            // org/fudgemsg/proto/antlr/Proto.g:260:43: ( message_element )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==BINDING||LA31_0==ENUM||(LA31_0>=MESSAGE && LA31_0<=MUTABLE)||(LA31_0>=REPEATED && LA31_0<=REQUIRED)||(LA31_0>=T_BOOL && LA31_0<=T_TIME)||LA31_0==IDENTIFIER||(LA31_0>=51 && LA31_0<=67)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:260:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1615);
            	    message_element119=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element119.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            char_literal120=(Token)match(input,45,FOLLOW_45_in_message_submsg1618); 

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
    // org/fudgemsg/proto/antlr/Proto.g:263:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES121=null;
        Token char_literal123=null;
        ProtoParser.fullidentifier_return fullidentifier122 = null;

        ProtoParser.fullidentifier_return fullidentifier124 = null;


        ProtoTree USES121_tree=null;
        ProtoTree char_literal123_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:263:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:263:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES121=(Token)match(input,USES,FOLLOW_USES_in_message_uses1629); 
            USES121_tree = (ProtoTree)adaptor.create(USES121);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES121_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1632);
            fullidentifier122=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier122.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:263:37: ( ',' fullidentifier )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==50) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:263:38: ',' fullidentifier
            	    {
            	    char_literal123=(Token)match(input,50,FOLLOW_50_in_message_uses1635); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1638);
            	    fullidentifier124=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier124.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:266:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_extends_return message_extends() throws RecognitionException {
        ProtoParser.message_extends_return retval = new ProtoParser.message_extends_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTENDS125=null;
        Token char_literal127=null;
        ProtoParser.fullidentifier_return fullidentifier126 = null;

        ProtoParser.fullidentifier_return fullidentifier128 = null;


        ProtoTree EXTENDS125_tree=null;
        ProtoTree char_literal127_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:266:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:266:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS125=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1650); 
            EXTENDS125_tree = (ProtoTree)adaptor.create(EXTENDS125);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS125_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1653);
            fullidentifier126=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier126.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:266:43: ( ',' fullidentifier )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:266:44: ',' fullidentifier
            	    {
            	    char_literal127=(Token)match(input,50,FOLLOW_50_in_message_extends1656); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1659);
            	    fullidentifier128=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier128.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:268:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE129=null;
        Token char_literal131=null;
        Token char_literal133=null;
        ProtoParser.fullidentifier_return fullidentifier130 = null;

        ProtoParser.root_object_return root_object132 = null;


        ProtoTree NAMESPACE129_tree=null;
        ProtoTree char_literal131_tree=null;
        ProtoTree char_literal133_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:268:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:268:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE129=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1670); 
            NAMESPACE129_tree = (ProtoTree)adaptor.create(NAMESPACE129);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE129_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1673);
            fullidentifier130=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier130.getTree());
            char_literal131=(Token)match(input,44,FOLLOW_44_in_namespace1675); 
            // org/fudgemsg/proto/antlr/Proto.g:268:44: ( root_object )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ENUM||LA34_0==EXTERN||LA34_0==MESSAGE||LA34_0==NAMESPACE||LA34_0==TAXONOMY) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:268:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1678);
            	    root_object132=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object132.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            char_literal133=(Token)match(input,45,FOLLOW_45_in_namespace1681); 

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
    // org/fudgemsg/proto/antlr/Proto.g:270:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object134 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:270:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:270:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:270:8: ( root_object )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ENUM||LA35_0==EXTERN||LA35_0==MESSAGE||LA35_0==NAMESPACE||LA35_0==TAXONOMY) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:270:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1691);
            	    root_object134=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object134.getTree());

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
            // 270:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:270:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:270:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:272:1: root_object : ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTERN135=null;
        Token set136=null;
        Token char_literal138=null;
        ProtoParser.fullidentifier_return fullidentifier137 = null;

        ProtoParser.message_return message139 = null;

        ProtoParser.message_enum_return message_enum140 = null;

        ProtoParser.namespace_return namespace141 = null;

        ProtoParser.taxonomy_return taxonomy142 = null;


        ProtoTree EXTERN135_tree=null;
        ProtoTree set136_tree=null;
        ProtoTree char_literal138_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:273:3: ( EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )? | message | message_enum | namespace | taxonomy )
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
                    // org/fudgemsg/proto/antlr/Proto.g:273:5: EXTERN ( MESSAGE | TAXONOMY | ENUM ) fullidentifier ( ';' )?
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTERN135=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_root_object1711); 
                    EXTERN135_tree = (ProtoTree)adaptor.create(EXTERN135);
                    root_0 = (ProtoTree)adaptor.becomeRoot(EXTERN135_tree, root_0);

                    set136=(Token)input.LT(1);
                    if ( input.LA(1)==ENUM||input.LA(1)==MESSAGE||input.LA(1)==TAXONOMY ) {
                        input.consume();
                        adaptor.addChild(root_0, (ProtoTree)adaptor.create(set136));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_fullidentifier_in_root_object1726);
                    fullidentifier137=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier137.getTree());
                    // org/fudgemsg/proto/antlr/Proto.g:273:56: ( ';' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==46) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // org/fudgemsg/proto/antlr/Proto.g:273:56: ';'
                            {
                            char_literal138=(Token)match(input,46,FOLLOW_46_in_root_object1728); 
                            char_literal138_tree = (ProtoTree)adaptor.create(char_literal138);
                            adaptor.addChild(root_0, char_literal138_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:274:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1734);
                    message139=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message139.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:275:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1739);
                    message_enum140=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum140.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:276:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1744);
                    namespace141=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace141.getTree());

                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:277:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1749);
                    taxonomy142=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy142.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:280:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY143=null;
        Token IDENTIFIER144=null;
        Token char_literal145=null;
        Token char_literal147=null;
        ProtoParser.taxonomy_element_return taxonomy_element146 = null;


        ProtoTree TAXONOMY143_tree=null;
        ProtoTree IDENTIFIER144_tree=null;
        ProtoTree char_literal145_tree=null;
        ProtoTree char_literal147_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:280:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:280:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY143=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1759); 
            TAXONOMY143_tree = (ProtoTree)adaptor.create(TAXONOMY143);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY143_tree, root_0);

            IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1762); 
            IDENTIFIER144_tree = (ProtoTree)adaptor.create(IDENTIFIER144);
            adaptor.addChild(root_0, IDENTIFIER144_tree);

            char_literal145=(Token)match(input,44,FOLLOW_44_in_taxonomy1764); 
            // org/fudgemsg/proto/antlr/Proto.g:280:38: ( taxonomy_element )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==BINDING||LA38_0==IMPORT||LA38_0==IDENTIFIER) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:280:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1767);
            	    taxonomy_element146=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element146.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            char_literal147=(Token)match(input,45,FOLLOW_45_in_taxonomy1770); 

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
    // org/fudgemsg/proto/antlr/Proto.g:282:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT149=null;
        Token char_literal151=null;
        ProtoParser.enum_element_return enum_element148 = null;

        ProtoParser.fullidentifier_return fullidentifier150 = null;


        ProtoTree IMPORT149_tree=null;
        ProtoTree char_literal151_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:283:2: ( enum_element | IMPORT fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:283:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1781);
                    enum_element148=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element148.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:284:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT149=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1786); 
                    IMPORT149_tree = (ProtoTree)adaptor.create(IMPORT149);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT149_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1789);
                    fullidentifier150=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier150.getTree());
                    char_literal151=(Token)match(input,46,FOLLOW_46_in_taxonomy_element1791); 

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
        "\43\uffff";
    static final String DFA12_eofS =
        "\43\uffff";
    static final String DFA12_minS =
        "\1\25\35\44\2\uffff\1\5\2\44";
    static final String DFA12_maxS =
        "\1\103\34\60\1\104\2\uffff\1\53\2\104";
    static final String DFA12_acceptS =
        "\36\uffff\1\2\1\1\3\uffff";
    static final String DFA12_specialS =
        "\43\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\3\1\30\1\5\1\6\1\26\1\32\1\11\1\20\1\7\1\33\1\34\3\uffff"+
            "\1\35\17\uffff\1\2\1\4\1\10\1\12\1\13\1\14\1\15\1\16\1\17\1"+
            "\21\1\22\1\23\1\24\1\25\1\27\1\31",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36",
            "\1\37\13\uffff\1\36\23\uffff\1\40",
            "",
            "",
            "\2\42\2\uffff\3\42\1\uffff\4\42\1\uffff\2\42\1\uffff\16\42\1"+
            "\uffff\1\41\6\uffff\1\42",
            "\1\37\13\uffff\1\36\23\uffff\1\40",
            "\1\37\13\uffff\1\36\23\uffff\1\40"
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
            return "229:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
    static final String DFA30_eotS =
        "\11\uffff";
    static final String DFA30_eofS =
        "\11\uffff";
    static final String DFA30_minS =
        "\1\17\4\16\1\uffff\1\44\2\uffff";
    static final String DFA30_maxS =
        "\5\103\1\uffff\1\60\2\uffff";
    static final String DFA30_acceptS =
        "\5\uffff\1\1\1\uffff\1\2\1\3";
    static final String DFA30_specialS =
        "\11\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\2\uffff\1\4\1\2\1\uffff\14\5\3\uffff\1\5\16\uffff\1\3\20"+
            "\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\14\5\3\uffff\1\5\16\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\14\5\3\uffff\1\5\16\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\14\5\3\uffff\1\5\16\uffff\1"+
            "\3\20\5",
            "\1\6\1\1\2\uffff\1\4\1\2\1\uffff\14\5\3\uffff\1\5\16\uffff\1"+
            "\3\20\5",
            "",
            "\1\7\13\uffff\1\10",
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
            return "254:1: message_field : ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD MESSAGE IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) | ( field_modifier )+ MESSAGE ( dimension )+ IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD ^( ARRAY MESSAGE ( dimension )+ ) IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_set_in_anyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding811 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_binding_anyword_in_binding814 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_binding816 = new BitSet(new long[]{0x0000221000000000L});
    public static final BitSet FOLLOW_binding_element_in_binding819 = new BitSet(new long[]{0x0000221000000000L});
    public static final BitSet FOLLOW_45_in_binding823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element849 = new BitSet(new long[]{0x0000031000000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text861 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_binding_text863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text874 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_binding_text876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default887 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_constraint_default890 = new BitSet(new long[]{0x0000027000000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_dimension903 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension905 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_dimension907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_dimension920 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_dimension922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_enum_element940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element946 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element949 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_enum_element952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_enum_value964 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_constraints985 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints988 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_field_constraints991 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints994 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_field_constraints998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_ordinal1008 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_field_modifier1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_field_modifier1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_modifier1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_field_modifier1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype1055 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype1057 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATE_in_field_primtype1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DATETIME_in_field_primtype1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_field_primtype1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_field_primtype1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_field_primtype1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_field_primtype1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_field_primtype1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_TIME_in_field_primtype1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_fullidentifier1356 = new BitSet(new long[]{0x00000817FFEDEE60L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1360 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_anyword_in_fullidentifier1364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1402 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1405 = new BitSet(new long[]{0x0000100400000400L});
    public static final BitSet FOLLOW_message_uses_in_message1407 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_message_extends_in_message1410 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_message1413 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_message_element_in_message1416 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_45_in_message1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1455 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1458 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_message_enum1460 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_enum_element_in_message_enum1463 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_45_in_message_enum1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1478 = new BitSet(new long[]{0xFFF80011FFEC8000L,0x000000000000000FL});
    public static final BitSet FOLLOW_field_type_in_message_field1481 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1483 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1485 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1488 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message_field1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1516 = new BitSet(new long[]{0x00080000000CC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1519 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1521 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1523 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1526 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message_field1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1554 = new BitSet(new long[]{0x00080000000CC000L});
    public static final BitSet FOLLOW_MESSAGE_in_message_field1557 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_dimension_in_message_field1559 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1562 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1564 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1567 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_message_field1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1607 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1610 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_message_submsg1612 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_message_element_in_message_submsg1615 = new BitSet(new long[]{0xFFF82011FFECC220L,0x000000000000000FL});
    public static final BitSet FOLLOW_45_in_message_submsg1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1629 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1632 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_message_uses1635 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1638 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1650 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1653 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_message_extends1656 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1659 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1670 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1673 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_namespace1675 = new BitSet(new long[]{0x0000200200014A00L});
    public static final BitSet FOLLOW_root_object_in_namespace1678 = new BitSet(new long[]{0x0000200200014A00L});
    public static final BitSet FOLLOW_45_in_namespace1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1691 = new BitSet(new long[]{0x0000000200014A02L});
    public static final BitSet FOLLOW_EXTERN_in_root_object1711 = new BitSet(new long[]{0x0000000200004200L});
    public static final BitSet FOLLOW_set_in_root_object1714 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_root_object1726 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_root_object1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_root_object1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1759 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1762 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_taxonomy1764 = new BitSet(new long[]{0xFFF82011FFECE220L,0x000000000000000FL});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1767 = new BitSet(new long[]{0xFFF82011FFECE220L,0x000000000000000FL});
    public static final BitSet FOLLOW_45_in_taxonomy1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1786 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1789 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_taxonomy_element1791 = new BitSet(new long[]{0x0000000000000002L});

}