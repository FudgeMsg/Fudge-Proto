// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-07 17:21:18

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "TAXONOMY", "USES", "COMMENT", "DOC_COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'optional'", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
    public static final int BINDING=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=27;
    public static final int ML_STRING=36;
    public static final int T_BOOL=19;
    public static final int T_DOUBLE=21;
    public static final int FLOAT=34;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T_LONG=25;
    public static final int T__55=55;
    public static final int ML_COMMENT=35;
    public static final int T_INDICATOR=23;
    public static final int T__56=56;
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
    public static final int T__49=49;
    public static final int DIM_FIXED=7;
    public static final int DEFAULT=6;
    public static final int ORDINAL=15;
    public static final int T_FLOAT=22;
    public static final int REPEATED=16;
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


    public static class binding_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "binding"
    // org/fudgemsg/proto/antlr/Proto.g:115:1: binding : BINDING binding_anyword '{' ( binding_element )* '}' ;
    public final ProtoParser.binding_return binding() throws RecognitionException {
        ProtoParser.binding_return retval = new ProtoParser.binding_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token BINDING1=null;
        Token char_literal3=null;
        Token char_literal5=null;
        ProtoParser.binding_anyword_return binding_anyword2 = null;

        ProtoParser.binding_element_return binding_element4 = null;


        ProtoTree BINDING1_tree=null;
        ProtoTree char_literal3_tree=null;
        ProtoTree char_literal5_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:115:9: ( BINDING binding_anyword '{' ( binding_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:115:11: BINDING binding_anyword '{' ( binding_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            BINDING1=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding625); 
            BINDING1_tree = (ProtoTree)adaptor.create(BINDING1);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING1_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding628);
            binding_anyword2=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword2.getTree());
            char_literal3=(Token)match(input,39,FOLLOW_39_in_binding630); 
            // org/fudgemsg/proto/antlr/Proto.g:115:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=BINDING && LA1_0<=DEFAULT)||LA1_0==ENUM||(LA1_0>=IMPORT && LA1_0<=NAMESPACE)||(LA1_0>=REPEATED && LA1_0<=REQUIRED)||(LA1_0>=T_BOOL && LA1_0<=USES)||LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:115:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding633);
            	    binding_element4=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal5=(Token)match(input,40,FOLLOW_40_in_binding637); 

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
    // org/fudgemsg/proto/antlr/Proto.g:117:1: binding_anyword : ( fullidentifier | BINDING | DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token BINDING7=null;
        Token DEFAULT8=null;
        Token ENUM9=null;
        Token IMPORT10=null;
        Token MESSAGE11=null;
        Token MUTABLE12=null;
        Token NAMESPACE13=null;
        Token REPEATED14=null;
        Token REQUIRED15=null;
        Token T_BOOL16=null;
        Token T_BYTE17=null;
        Token T_DOUBLE18=null;
        Token T_FLOAT19=null;
        Token T_INDICATOR20=null;
        Token T_INT21=null;
        Token T_LONG22=null;
        Token T_SHORT23=null;
        Token T_STRING24=null;
        Token TAXONOMY25=null;
        Token USES26=null;
        Token STRING27=null;
        ProtoParser.fullidentifier_return fullidentifier6 = null;


        ProtoTree BINDING7_tree=null;
        ProtoTree DEFAULT8_tree=null;
        ProtoTree ENUM9_tree=null;
        ProtoTree IMPORT10_tree=null;
        ProtoTree MESSAGE11_tree=null;
        ProtoTree MUTABLE12_tree=null;
        ProtoTree NAMESPACE13_tree=null;
        ProtoTree REPEATED14_tree=null;
        ProtoTree REQUIRED15_tree=null;
        ProtoTree T_BOOL16_tree=null;
        ProtoTree T_BYTE17_tree=null;
        ProtoTree T_DOUBLE18_tree=null;
        ProtoTree T_FLOAT19_tree=null;
        ProtoTree T_INDICATOR20_tree=null;
        ProtoTree T_INT21_tree=null;
        ProtoTree T_LONG22_tree=null;
        ProtoTree T_SHORT23_tree=null;
        ProtoTree T_STRING24_tree=null;
        ProtoTree TAXONOMY25_tree=null;
        ProtoTree USES26_tree=null;
        ProtoTree STRING27_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:118:2: ( fullidentifier | BINDING | DEFAULT | ENUM | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | STRING )
            int alt2=22;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt2=1;
                }
                break;
            case BINDING:
                {
                alt2=2;
                }
                break;
            case DEFAULT:
                {
                alt2=3;
                }
                break;
            case ENUM:
                {
                alt2=4;
                }
                break;
            case IMPORT:
                {
                alt2=5;
                }
                break;
            case MESSAGE:
                {
                alt2=6;
                }
                break;
            case MUTABLE:
                {
                alt2=7;
                }
                break;
            case NAMESPACE:
                {
                alt2=8;
                }
                break;
            case REPEATED:
                {
                alt2=9;
                }
                break;
            case REQUIRED:
                {
                alt2=10;
                }
                break;
            case T_BOOL:
                {
                alt2=11;
                }
                break;
            case T_BYTE:
                {
                alt2=12;
                }
                break;
            case T_DOUBLE:
                {
                alt2=13;
                }
                break;
            case T_FLOAT:
                {
                alt2=14;
                }
                break;
            case T_INDICATOR:
                {
                alt2=15;
                }
                break;
            case T_INT:
                {
                alt2=16;
                }
                break;
            case T_LONG:
                {
                alt2=17;
                }
                break;
            case T_SHORT:
                {
                alt2=18;
                }
                break;
            case T_STRING:
                {
                alt2=19;
                }
                break;
            case TAXONOMY:
                {
                alt2=20;
                }
                break;
            case USES:
                {
                alt2=21;
                }
                break;
            case STRING:
                {
                alt2=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:118:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword648);
                    fullidentifier6=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier6.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:119:4: BINDING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    BINDING7=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding_anyword653); 
                    BINDING7_tree = (ProtoTree)adaptor.create(BINDING7);
                    adaptor.addChild(root_0, BINDING7_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:120:4: DEFAULT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    DEFAULT8=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_binding_anyword658); 
                    DEFAULT8_tree = (ProtoTree)adaptor.create(DEFAULT8);
                    adaptor.addChild(root_0, DEFAULT8_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:121:4: ENUM
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ENUM9=(Token)match(input,ENUM,FOLLOW_ENUM_in_binding_anyword663); 
                    ENUM9_tree = (ProtoTree)adaptor.create(ENUM9);
                    adaptor.addChild(root_0, ENUM9_tree);


                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:122:4: IMPORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT10=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_binding_anyword668); 
                    IMPORT10_tree = (ProtoTree)adaptor.create(IMPORT10);
                    adaptor.addChild(root_0, IMPORT10_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:123:4: MESSAGE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MESSAGE11=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_binding_anyword673); 
                    MESSAGE11_tree = (ProtoTree)adaptor.create(MESSAGE11);
                    adaptor.addChild(root_0, MESSAGE11_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:124:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE12=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_binding_anyword678); 
                    MUTABLE12_tree = (ProtoTree)adaptor.create(MUTABLE12);
                    adaptor.addChild(root_0, MUTABLE12_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:125:4: NAMESPACE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    NAMESPACE13=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_binding_anyword683); 
                    NAMESPACE13_tree = (ProtoTree)adaptor.create(NAMESPACE13);
                    adaptor.addChild(root_0, NAMESPACE13_tree);


                    }
                    break;
                case 9 :
                    // org/fudgemsg/proto/antlr/Proto.g:126:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED14=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_binding_anyword688); 
                    REPEATED14_tree = (ProtoTree)adaptor.create(REPEATED14);
                    adaptor.addChild(root_0, REPEATED14_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:127:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED15=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_binding_anyword693); 
                    REQUIRED15_tree = (ProtoTree)adaptor.create(REQUIRED15);
                    adaptor.addChild(root_0, REQUIRED15_tree);


                    }
                    break;
                case 11 :
                    // org/fudgemsg/proto/antlr/Proto.g:128:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL16=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_binding_anyword698); 
                    T_BOOL16_tree = (ProtoTree)adaptor.create(T_BOOL16);
                    adaptor.addChild(root_0, T_BOOL16_tree);


                    }
                    break;
                case 12 :
                    // org/fudgemsg/proto/antlr/Proto.g:129:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE17=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_binding_anyword703); 
                    T_BYTE17_tree = (ProtoTree)adaptor.create(T_BYTE17);
                    adaptor.addChild(root_0, T_BYTE17_tree);


                    }
                    break;
                case 13 :
                    // org/fudgemsg/proto/antlr/Proto.g:130:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE18=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_binding_anyword708); 
                    T_DOUBLE18_tree = (ProtoTree)adaptor.create(T_DOUBLE18);
                    adaptor.addChild(root_0, T_DOUBLE18_tree);


                    }
                    break;
                case 14 :
                    // org/fudgemsg/proto/antlr/Proto.g:131:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT19=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_binding_anyword713); 
                    T_FLOAT19_tree = (ProtoTree)adaptor.create(T_FLOAT19);
                    adaptor.addChild(root_0, T_FLOAT19_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:132:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR20=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_binding_anyword718); 
                    T_INDICATOR20_tree = (ProtoTree)adaptor.create(T_INDICATOR20);
                    adaptor.addChild(root_0, T_INDICATOR20_tree);


                    }
                    break;
                case 16 :
                    // org/fudgemsg/proto/antlr/Proto.g:133:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT21=(Token)match(input,T_INT,FOLLOW_T_INT_in_binding_anyword723); 
                    T_INT21_tree = (ProtoTree)adaptor.create(T_INT21);
                    adaptor.addChild(root_0, T_INT21_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:134:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG22=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_binding_anyword728); 
                    T_LONG22_tree = (ProtoTree)adaptor.create(T_LONG22);
                    adaptor.addChild(root_0, T_LONG22_tree);


                    }
                    break;
                case 18 :
                    // org/fudgemsg/proto/antlr/Proto.g:135:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT23=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_binding_anyword733); 
                    T_SHORT23_tree = (ProtoTree)adaptor.create(T_SHORT23);
                    adaptor.addChild(root_0, T_SHORT23_tree);


                    }
                    break;
                case 19 :
                    // org/fudgemsg/proto/antlr/Proto.g:136:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING24=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_binding_anyword738); 
                    T_STRING24_tree = (ProtoTree)adaptor.create(T_STRING24);
                    adaptor.addChild(root_0, T_STRING24_tree);


                    }
                    break;
                case 20 :
                    // org/fudgemsg/proto/antlr/Proto.g:137:4: TAXONOMY
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    TAXONOMY25=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_binding_anyword743); 
                    TAXONOMY25_tree = (ProtoTree)adaptor.create(TAXONOMY25);
                    adaptor.addChild(root_0, TAXONOMY25_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:138:4: USES
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    USES26=(Token)match(input,USES,FOLLOW_USES_in_binding_anyword748); 
                    USES26_tree = (ProtoTree)adaptor.create(USES26);
                    adaptor.addChild(root_0, USES26_tree);


                    }
                    break;
                case 22 :
                    // org/fudgemsg/proto/antlr/Proto.g:139:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING27=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword753); 
                    STRING27_tree = (ProtoTree)adaptor.create(STRING27);
                    adaptor.addChild(root_0, STRING27_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:142:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword28 = null;

        ProtoParser.binding_text_return binding_text29 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:142:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:142:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element763);
            binding_anyword28=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword28.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element765);
            binding_text29=binding_text();

            state._fsp--;

            adaptor.addChild(root_0, binding_text29.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:144:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
    public final ProtoParser.binding_text_return binding_text() throws RecognitionException {
        ProtoParser.binding_text_return retval = new ProtoParser.binding_text_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING30=null;
        Token char_literal31=null;
        Token ML_STRING32=null;
        Token char_literal34=null;
        ProtoParser.fullidentifier_return fullidentifier33 = null;


        ProtoTree STRING30_tree=null;
        ProtoTree char_literal31_tree=null;
        ProtoTree ML_STRING32_tree=null;
        ProtoTree char_literal34_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:145:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:145:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING30=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text775); 
                    STRING30_tree = (ProtoTree)adaptor.create(STRING30);
                    adaptor.addChild(root_0, STRING30_tree);

                    char_literal31=(Token)match(input,41,FOLLOW_41_in_binding_text777); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:146:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING32=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text783); 
                    ML_STRING32_tree = (ProtoTree)adaptor.create(ML_STRING32);
                    adaptor.addChild(root_0, ML_STRING32_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:147:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text788);
                    fullidentifier33=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier33.getTree());
                    char_literal34=(Token)match(input,41,FOLLOW_41_in_binding_text790); 

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
    // org/fudgemsg/proto/antlr/Proto.g:150:1: constraint_default : DEFAULT '=' literal ;
    public final ProtoParser.constraint_default_return constraint_default() throws RecognitionException {
        ProtoParser.constraint_default_return retval = new ProtoParser.constraint_default_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token DEFAULT35=null;
        Token char_literal36=null;
        ProtoParser.literal_return literal37 = null;


        ProtoTree DEFAULT35_tree=null;
        ProtoTree char_literal36_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:150:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:150:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT35=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default801); 
            DEFAULT35_tree = (ProtoTree)adaptor.create(DEFAULT35);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT35_tree, root_0);

            char_literal36=(Token)match(input,42,FOLLOW_42_in_constraint_default804); 
            pushFollow(FOLLOW_literal_in_constraint_default807);
            literal37=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal37.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:152:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
    public final ProtoParser.dimension_return dimension() throws RecognitionException {
        ProtoParser.dimension_return retval = new ProtoParser.dimension_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal38=null;
        Token INTEGER39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal42=null;

        ProtoTree char_literal38_tree=null;
        ProtoTree INTEGER39_tree=null;
        ProtoTree char_literal40_tree=null;
        ProtoTree char_literal41_tree=null;
        ProtoTree char_literal42_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:153:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==43) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==INTEGER) ) {
                    alt4=1;
                }
                else if ( (LA4_1==44) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:153:4: '[' INTEGER ']'
                    {
                    char_literal38=(Token)match(input,43,FOLLOW_43_in_dimension817);  
                    stream_43.add(char_literal38);

                    INTEGER39=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension819);  
                    stream_INTEGER.add(INTEGER39);

                    char_literal40=(Token)match(input,44,FOLLOW_44_in_dimension821);  
                    stream_44.add(char_literal40);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 153:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:153:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:154:4: '[' ']'
                    {
                    char_literal41=(Token)match(input,43,FOLLOW_43_in_dimension834);  
                    stream_43.add(char_literal41);

                    char_literal42=(Token)match(input,44,FOLLOW_44_in_dimension836);  
                    stream_44.add(char_literal42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 154:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:154:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:157:1: enum_element : IDENTIFIER ( enum_value )? ';' ;
    public final ProtoParser.enum_element_return enum_element() throws RecognitionException {
        ProtoParser.enum_element_return retval = new ProtoParser.enum_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER43=null;
        Token char_literal45=null;
        ProtoParser.enum_value_return enum_value44 = null;


        ProtoTree IDENTIFIER43_tree=null;
        ProtoTree char_literal45_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:157:14: ( IDENTIFIER ( enum_value )? ';' )
            // org/fudgemsg/proto/antlr/Proto.g:157:16: IDENTIFIER ( enum_value )? ';'
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER43=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element852); 
            IDENTIFIER43_tree = (ProtoTree)adaptor.create(IDENTIFIER43);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER43_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:157:28: ( enum_value )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:157:28: enum_value
                    {
                    pushFollow(FOLLOW_enum_value_in_enum_element855);
                    enum_value44=enum_value();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_value44.getTree());

                    }
                    break;

            }

            char_literal45=(Token)match(input,41,FOLLOW_41_in_enum_element858); 

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
    // org/fudgemsg/proto/antlr/Proto.g:159:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal46=null;
        Token INTEGER47=null;

        ProtoTree char_literal46_tree=null;
        ProtoTree INTEGER47_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:159:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:159:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal46=(Token)match(input,42,FOLLOW_42_in_enum_value868); 
            INTEGER47=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value871); 
            INTEGER47_tree = (ProtoTree)adaptor.create(INTEGER47);
            adaptor.addChild(root_0, INTEGER47_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:161:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default48 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:161:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:161:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint880);
            constraint_default48=constraint_default();

            state._fsp--;

            adaptor.addChild(root_0, constraint_default48.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:163:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
    public final ProtoParser.field_constraints_return field_constraints() throws RecognitionException {
        ProtoParser.field_constraints_return retval = new ProtoParser.field_constraints_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        Token char_literal53=null;
        ProtoParser.field_constraint_return field_constraint50 = null;

        ProtoParser.field_constraint_return field_constraint52 = null;


        ProtoTree char_literal49_tree=null;
        ProtoTree char_literal51_tree=null;
        ProtoTree char_literal53_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:163:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:163:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal49=(Token)match(input,43,FOLLOW_43_in_field_constraints889); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints892);
            field_constraint50=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint50.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:163:43: ( ',' field_constraint )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:163:44: ',' field_constraint
            	    {
            	    char_literal51=(Token)match(input,45,FOLLOW_45_in_field_constraints895); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints898);
            	    field_constraint52=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint52.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal53=(Token)match(input,44,FOLLOW_44_in_field_constraints902); 

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
    // org/fudgemsg/proto/antlr/Proto.g:165:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal54=null;
        Token INTEGER55=null;

        ProtoTree char_literal54_tree=null;
        ProtoTree INTEGER55_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:165:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:165:17: '=' INTEGER
            {
            char_literal54=(Token)match(input,42,FOLLOW_42_in_field_ordinal912);  
            stream_42.add(char_literal54);

            INTEGER55=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal914);  
            stream_INTEGER.add(INTEGER55);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 165:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:165:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:168:1: field_modifier : ( MUTABLE | REQUIRED | 'optional' | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MUTABLE56=null;
        Token REQUIRED57=null;
        Token string_literal58=null;
        Token REPEATED59=null;

        ProtoTree MUTABLE56_tree=null;
        ProtoTree REQUIRED57_tree=null;
        ProtoTree string_literal58_tree=null;
        ProtoTree REPEATED59_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:169:2: ( MUTABLE | REQUIRED | 'optional' | REPEATED )
            int alt7=4;
            switch ( input.LA(1) ) {
            case MUTABLE:
                {
                alt7=1;
                }
                break;
            case REQUIRED:
                {
                alt7=2;
                }
                break;
            case 46:
                {
                alt7=3;
                }
                break;
            case REPEATED:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:169:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE56=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_field_modifier933); 
                    MUTABLE56_tree = (ProtoTree)adaptor.create(MUTABLE56);
                    adaptor.addChild(root_0, MUTABLE56_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:170:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED57=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_modifier938); 
                    REQUIRED57_tree = (ProtoTree)adaptor.create(REQUIRED57);
                    adaptor.addChild(root_0, REQUIRED57_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:171:4: 'optional'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    string_literal58=(Token)match(input,46,FOLLOW_46_in_field_modifier943); 

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:172:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED59=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_field_modifier949); 
                    REPEATED59_tree = (ProtoTree)adaptor.create(REPEATED59);
                    adaptor.addChild(root_0, REPEATED59_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:175:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype60 = null;

        ProtoParser.dimension_return dimension61 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:175:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:175:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype959);
            field_basetype60=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype60.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:175:34: ( dimension )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:175:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype961);
            	    dimension61=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension61.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 175:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:175:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:177:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL62=null;
        Token string_literal63=null;
        Token T_BYTE64=null;
        Token string_literal65=null;
        Token T_SHORT66=null;
        Token string_literal67=null;
        Token T_INT68=null;
        Token string_literal69=null;
        Token string_literal70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;
        Token string_literal74=null;
        Token T_LONG75=null;
        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token T_FLOAT81=null;
        Token string_literal82=null;
        Token T_DOUBLE83=null;
        Token string_literal84=null;
        Token T_INDICATOR85=null;
        Token T_STRING86=null;

        ProtoTree T_BOOL62_tree=null;
        ProtoTree string_literal63_tree=null;
        ProtoTree T_BYTE64_tree=null;
        ProtoTree string_literal65_tree=null;
        ProtoTree T_SHORT66_tree=null;
        ProtoTree string_literal67_tree=null;
        ProtoTree T_INT68_tree=null;
        ProtoTree string_literal69_tree=null;
        ProtoTree string_literal70_tree=null;
        ProtoTree string_literal71_tree=null;
        ProtoTree string_literal72_tree=null;
        ProtoTree string_literal73_tree=null;
        ProtoTree string_literal74_tree=null;
        ProtoTree T_LONG75_tree=null;
        ProtoTree string_literal76_tree=null;
        ProtoTree string_literal77_tree=null;
        ProtoTree string_literal78_tree=null;
        ProtoTree string_literal79_tree=null;
        ProtoTree string_literal80_tree=null;
        ProtoTree T_FLOAT81_tree=null;
        ProtoTree string_literal82_tree=null;
        ProtoTree T_DOUBLE83_tree=null;
        ProtoTree string_literal84_tree=null;
        ProtoTree T_INDICATOR85_tree=null;
        ProtoTree T_STRING86_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:178:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING )
            int alt9=25;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt9=1;
                }
                break;
            case 47:
                {
                alt9=2;
                }
                break;
            case T_BYTE:
                {
                alt9=3;
                }
                break;
            case 48:
                {
                alt9=4;
                }
                break;
            case T_SHORT:
                {
                alt9=5;
                }
                break;
            case 49:
                {
                alt9=6;
                }
                break;
            case T_INT:
                {
                alt9=7;
                }
                break;
            case 50:
                {
                alt9=8;
                }
                break;
            case 51:
                {
                alt9=9;
                }
                break;
            case 52:
                {
                alt9=10;
                }
                break;
            case 53:
                {
                alt9=11;
                }
                break;
            case 54:
                {
                alt9=12;
                }
                break;
            case 55:
                {
                alt9=13;
                }
                break;
            case T_LONG:
                {
                alt9=14;
                }
                break;
            case 56:
                {
                alt9=15;
                }
                break;
            case 57:
                {
                alt9=16;
                }
                break;
            case 58:
                {
                alt9=17;
                }
                break;
            case 59:
                {
                alt9=18;
                }
                break;
            case 60:
                {
                alt9=19;
                }
                break;
            case T_FLOAT:
                {
                alt9=20;
                }
                break;
            case 61:
                {
                alt9=21;
                }
                break;
            case T_DOUBLE:
                {
                alt9=22;
                }
                break;
            case 62:
                {
                alt9=23;
                }
                break;
            case T_INDICATOR:
                {
                alt9=24;
                }
                break;
            case T_STRING:
                {
                alt9=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:178:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL62=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype983); 
                    T_BOOL62_tree = (ProtoTree)adaptor.create(T_BOOL62);
                    adaptor.addChild(root_0, T_BOOL62_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:179:4: 'boolean'
                    {
                    string_literal63=(Token)match(input,47,FOLLOW_47_in_field_primtype988);  
                    stream_47.add(string_literal63);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 179:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:179:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:180:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE64=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype999); 
                    T_BYTE64_tree = (ProtoTree)adaptor.create(T_BYTE64);
                    adaptor.addChild(root_0, T_BYTE64_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:181:4: 'int8'
                    {
                    string_literal65=(Token)match(input,48,FOLLOW_48_in_field_primtype1004);  
                    stream_48.add(string_literal65);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 181:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:181:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:182:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT66=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype1015); 
                    T_SHORT66_tree = (ProtoTree)adaptor.create(T_SHORT66);
                    adaptor.addChild(root_0, T_SHORT66_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:183:4: 'int16'
                    {
                    string_literal67=(Token)match(input,49,FOLLOW_49_in_field_primtype1020);  
                    stream_49.add(string_literal67);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 183:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:183:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:184:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT68=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1031); 
                    T_INT68_tree = (ProtoTree)adaptor.create(T_INT68);
                    adaptor.addChild(root_0, T_INT68_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:185:4: 'int32'
                    {
                    string_literal69=(Token)match(input,50,FOLLOW_50_in_field_primtype1036);  
                    stream_50.add(string_literal69);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 185:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:185:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:186:4: 'uint32'
                    {
                    string_literal70=(Token)match(input,51,FOLLOW_51_in_field_primtype1047);  
                    stream_51.add(string_literal70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 186:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:186:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:187:4: 'sint32'
                    {
                    string_literal71=(Token)match(input,52,FOLLOW_52_in_field_primtype1058);  
                    stream_52.add(string_literal71);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 187:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:187:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:188:4: 'fixed32'
                    {
                    string_literal72=(Token)match(input,53,FOLLOW_53_in_field_primtype1069);  
                    stream_53.add(string_literal72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 188:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:188:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:189:4: 'sfixed32'
                    {
                    string_literal73=(Token)match(input,54,FOLLOW_54_in_field_primtype1080);  
                    stream_54.add(string_literal73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 189:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:189:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:190:4: 'integer'
                    {
                    string_literal74=(Token)match(input,55,FOLLOW_55_in_field_primtype1091);  
                    stream_55.add(string_literal74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 190:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:190:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:191:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG75=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1102); 
                    T_LONG75_tree = (ProtoTree)adaptor.create(T_LONG75);
                    adaptor.addChild(root_0, T_LONG75_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:192:4: 'int64'
                    {
                    string_literal76=(Token)match(input,56,FOLLOW_56_in_field_primtype1107);  
                    stream_56.add(string_literal76);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 192:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:192:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:193:4: 'uint64'
                    {
                    string_literal77=(Token)match(input,57,FOLLOW_57_in_field_primtype1118);  
                    stream_57.add(string_literal77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 193:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:193:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:194:4: 'sint64'
                    {
                    string_literal78=(Token)match(input,58,FOLLOW_58_in_field_primtype1129);  
                    stream_58.add(string_literal78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 194:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:194:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:195:4: 'fixed64'
                    {
                    string_literal79=(Token)match(input,59,FOLLOW_59_in_field_primtype1140);  
                    stream_59.add(string_literal79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 195:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:195:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:196:4: 'sfixed64'
                    {
                    string_literal80=(Token)match(input,60,FOLLOW_60_in_field_primtype1151);  
                    stream_60.add(string_literal80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 196:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:196:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:197:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT81=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1162); 
                    T_FLOAT81_tree = (ProtoTree)adaptor.create(T_FLOAT81);
                    adaptor.addChild(root_0, T_FLOAT81_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:198:4: 'float32'
                    {
                    string_literal82=(Token)match(input,61,FOLLOW_61_in_field_primtype1167);  
                    stream_61.add(string_literal82);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 198:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:198:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:199:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE83=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1178); 
                    T_DOUBLE83_tree = (ProtoTree)adaptor.create(T_DOUBLE83);
                    adaptor.addChild(root_0, T_DOUBLE83_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: 'float64'
                    {
                    string_literal84=(Token)match(input,62,FOLLOW_62_in_field_primtype1183);  
                    stream_62.add(string_literal84);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 200:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:200:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR85=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1194); 
                    T_INDICATOR85_tree = (ProtoTree)adaptor.create(T_INDICATOR85);
                    adaptor.addChild(root_0, T_INDICATOR85_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING86=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1199); 
                    T_STRING86_tree = (ProtoTree)adaptor.create(T_STRING86);
                    adaptor.addChild(root_0, T_STRING86_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:205:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype87 = null;

        ProtoParser.fullidentifier_return fullidentifier88 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:206:2: ( field_primtype | fullidentifier )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=T_BOOL && LA10_0<=T_STRING)||(LA10_0>=47 && LA10_0<=62)) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1210);
                    field_primtype87=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype87.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1215);
                    fullidentifier88=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier88.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:210:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype89 = null;

        ProtoParser.field_arraytype_return field_arraytype90 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:211:2: ( field_basetype | field_arraytype )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1226);
                    field_basetype89=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype89.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1231);
                    field_arraytype90=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype90.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:215:1: fullidentifier : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER91=null;
        Token char_literal92=null;
        Token IDENTIFIER93=null;

        ProtoTree IDENTIFIER91_tree=null;
        ProtoTree char_literal92_tree=null;
        ProtoTree IDENTIFIER93_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:215:16: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // org/fudgemsg/proto/antlr/Proto.g:215:18: IDENTIFIER ( '.' IDENTIFIER )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER91=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1241); 
            IDENTIFIER91_tree = (ProtoTree)adaptor.create(IDENTIFIER91);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER91_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:215:30: ( '.' IDENTIFIER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==63) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:215:31: '.' IDENTIFIER
            	    {
            	    char_literal92=(Token)match(input,63,FOLLOW_63_in_fullidentifier1245); 
            	    IDENTIFIER93=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1248); 
            	    IDENTIFIER93_tree = (ProtoTree)adaptor.create(IDENTIFIER93);
            	    adaptor.addChild(root_0, IDENTIFIER93_tree);


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // org/fudgemsg/proto/antlr/Proto.g:217:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set94=null;

        ProtoTree set94_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:218:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set94=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set94));
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
    // org/fudgemsg/proto/antlr/Proto.g:224:1: message : MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE95=null;
        Token IDENTIFIER96=null;
        Token char_literal98=null;
        Token char_literal100=null;
        ProtoParser.message_uses_return message_uses97 = null;

        ProtoParser.message_element_return message_element99 = null;


        ProtoTree MESSAGE95_tree=null;
        ProtoTree IDENTIFIER96_tree=null;
        ProtoTree char_literal98_tree=null;
        ProtoTree char_literal100_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:224:9: ( MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:224:11: MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE95=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1285); 
            MESSAGE95_tree = (ProtoTree)adaptor.create(MESSAGE95);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE95_tree, root_0);

            IDENTIFIER96=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1288); 
            IDENTIFIER96_tree = (ProtoTree)adaptor.create(IDENTIFIER96);
            adaptor.addChild(root_0, IDENTIFIER96_tree);

            // org/fudgemsg/proto/antlr/Proto.g:224:31: ( message_uses )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==USES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:224:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1290);
                    message_uses97=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses97.getTree());

                    }
                    break;

            }

            char_literal98=(Token)match(input,39,FOLLOW_39_in_message1293); 
            // org/fudgemsg/proto/antlr/Proto.g:224:50: ( message_element )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==BINDING||LA14_0==ENUM||(LA14_0>=MESSAGE && LA14_0<=MUTABLE)||(LA14_0>=REPEATED && LA14_0<=REQUIRED)||(LA14_0>=T_BOOL && LA14_0<=T_STRING)||LA14_0==IDENTIFIER||(LA14_0>=46 && LA14_0<=62)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:224:50: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1296);
            	    message_element99=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element99.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            char_literal100=(Token)match(input,40,FOLLOW_40_in_message1299); 

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
    // org/fudgemsg/proto/antlr/Proto.g:226:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum101 = null;

        ProtoParser.message_field_return message_field102 = null;

        ProtoParser.message_submsg_return message_submsg103 = null;

        ProtoParser.binding_return binding104 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:227:2: ( message_enum | message_field | message_submsg | binding )
            int alt15=4;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt15=1;
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
            case 46:
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
                {
                alt15=2;
                }
                break;
            case MESSAGE:
                {
                alt15=3;
                }
                break;
            case BINDING:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:227:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1310);
                    message_enum101=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum101.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:228:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1315);
                    message_field102=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field102.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:229:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1320);
                    message_submsg103=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg103.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:230:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1325);
                    binding104=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding104.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:233:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM105=null;
        Token IDENTIFIER106=null;
        Token char_literal107=null;
        Token char_literal109=null;
        ProtoParser.enum_element_return enum_element108 = null;


        ProtoTree ENUM105_tree=null;
        ProtoTree IDENTIFIER106_tree=null;
        ProtoTree char_literal107_tree=null;
        ProtoTree char_literal109_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:233:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:233:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM105=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1335); 
            ENUM105_tree = (ProtoTree)adaptor.create(ENUM105);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM105_tree, root_0);

            IDENTIFIER106=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1338); 
            IDENTIFIER106_tree = (ProtoTree)adaptor.create(IDENTIFIER106);
            adaptor.addChild(root_0, IDENTIFIER106_tree);

            char_literal107=(Token)match(input,39,FOLLOW_39_in_message_enum1340); 
            // org/fudgemsg/proto/antlr/Proto.g:233:38: ( enum_element )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==IDENTIFIER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:233:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1343);
            	    enum_element108=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element108.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            char_literal109=(Token)match(input,40,FOLLOW_40_in_message_enum1346); 

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
    // org/fudgemsg/proto/antlr/Proto.g:235:1: message_field : ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) ;
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER112=null;
        Token char_literal115=null;
        ProtoParser.field_modifier_return field_modifier110 = null;

        ProtoParser.field_type_return field_type111 = null;

        ProtoParser.field_ordinal_return field_ordinal113 = null;

        ProtoParser.field_constraints_return field_constraints114 = null;


        ProtoTree IDENTIFIER112_tree=null;
        ProtoTree char_literal115_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:235:15: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            // org/fudgemsg/proto/antlr/Proto.g:235:17: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
            {
            // org/fudgemsg/proto/antlr/Proto.g:235:17: ( field_modifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MUTABLE||(LA17_0>=REPEATED && LA17_0<=REQUIRED)||LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:235:17: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_message_field1356);
            	    field_modifier110=field_modifier();

            	    state._fsp--;

            	    stream_field_modifier.add(field_modifier110.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            pushFollow(FOLLOW_field_type_in_message_field1359);
            field_type111=field_type();

            state._fsp--;

            stream_field_type.add(field_type111.getTree());
            IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1361);  
            stream_IDENTIFIER.add(IDENTIFIER112);

            // org/fudgemsg/proto/antlr/Proto.g:235:55: ( field_ordinal )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:235:55: field_ordinal
                    {
                    pushFollow(FOLLOW_field_ordinal_in_message_field1363);
                    field_ordinal113=field_ordinal();

                    state._fsp--;

                    stream_field_ordinal.add(field_ordinal113.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:235:70: ( field_constraints )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:235:70: field_constraints
                    {
                    pushFollow(FOLLOW_field_constraints_in_message_field1366);
                    field_constraints114=field_constraints();

                    state._fsp--;

                    stream_field_constraints.add(field_constraints114.getTree());

                    }
                    break;

            }

            char_literal115=(Token)match(input,41,FOLLOW_41_in_message_field1369);  
            stream_41.add(char_literal115);



            // AST REWRITE
            // elements: field_constraints, field_ordinal, field_modifier, IDENTIFIER, field_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 235:93: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
            {
                // org/fudgemsg/proto/antlr/Proto.g:235:96: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_field_type.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // org/fudgemsg/proto/antlr/Proto.g:235:126: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();
                // org/fudgemsg/proto/antlr/Proto.g:235:142: ( field_ordinal )?
                if ( stream_field_ordinal.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                }
                stream_field_ordinal.reset();
                // org/fudgemsg/proto/antlr/Proto.g:235:157: ( field_constraints )?
                if ( stream_field_constraints.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_constraints.nextTree());

                }
                stream_field_constraints.reset();

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
    // $ANTLR end "message_field"

    public static class message_submsg_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_submsg"
    // org/fudgemsg/proto/antlr/Proto.g:237:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
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
            // org/fudgemsg/proto/antlr/Proto.g:237:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:237:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE116=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1397); 
            MESSAGE116_tree = (ProtoTree)adaptor.create(MESSAGE116);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE116_tree, root_0);

            IDENTIFIER117=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1400); 
            IDENTIFIER117_tree = (ProtoTree)adaptor.create(IDENTIFIER117);
            adaptor.addChild(root_0, IDENTIFIER117_tree);

            char_literal118=(Token)match(input,39,FOLLOW_39_in_message_submsg1402); 
            // org/fudgemsg/proto/antlr/Proto.g:237:43: ( message_element )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==BINDING||LA20_0==ENUM||(LA20_0>=MESSAGE && LA20_0<=MUTABLE)||(LA20_0>=REPEATED && LA20_0<=REQUIRED)||(LA20_0>=T_BOOL && LA20_0<=T_STRING)||LA20_0==IDENTIFIER||(LA20_0>=46 && LA20_0<=62)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:237:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1405);
            	    message_element119=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element119.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            char_literal120=(Token)match(input,40,FOLLOW_40_in_message_submsg1408); 

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
    // org/fudgemsg/proto/antlr/Proto.g:240:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
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
            // org/fudgemsg/proto/antlr/Proto.g:240:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:240:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES121=(Token)match(input,USES,FOLLOW_USES_in_message_uses1419); 
            USES121_tree = (ProtoTree)adaptor.create(USES121);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES121_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1422);
            fullidentifier122=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier122.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:240:37: ( ',' fullidentifier )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:240:38: ',' fullidentifier
            	    {
            	    char_literal123=(Token)match(input,45,FOLLOW_45_in_message_uses1425); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1428);
            	    fullidentifier124=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier124.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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

    public static class namespace_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "namespace"
    // org/fudgemsg/proto/antlr/Proto.g:242:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE125=null;
        Token char_literal127=null;
        Token char_literal129=null;
        ProtoParser.fullidentifier_return fullidentifier126 = null;

        ProtoParser.root_object_return root_object128 = null;


        ProtoTree NAMESPACE125_tree=null;
        ProtoTree char_literal127_tree=null;
        ProtoTree char_literal129_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:242:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:242:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE125=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1439); 
            NAMESPACE125_tree = (ProtoTree)adaptor.create(NAMESPACE125);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE125_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1442);
            fullidentifier126=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier126.getTree());
            char_literal127=(Token)match(input,39,FOLLOW_39_in_namespace1444); 
            // org/fudgemsg/proto/antlr/Proto.g:242:44: ( root_object )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ENUM||LA22_0==MESSAGE||LA22_0==NAMESPACE||LA22_0==TAXONOMY) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:242:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1447);
            	    root_object128=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object128.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            char_literal129=(Token)match(input,40,FOLLOW_40_in_namespace1450); 

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
    // org/fudgemsg/proto/antlr/Proto.g:244:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object130 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:244:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:244:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:244:8: ( root_object )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ENUM||LA23_0==MESSAGE||LA23_0==NAMESPACE||LA23_0==TAXONOMY) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:244:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1460);
            	    root_object130=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object130.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // 244:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:244:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:244:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:246:1: root_object : ( message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_return message131 = null;

        ProtoParser.message_enum_return message_enum132 = null;

        ProtoParser.namespace_return namespace133 = null;

        ProtoParser.taxonomy_return taxonomy134 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:247:2: ( message | message_enum | namespace | taxonomy )
            int alt24=4;
            switch ( input.LA(1) ) {
            case MESSAGE:
                {
                alt24=1;
                }
                break;
            case ENUM:
                {
                alt24=2;
                }
                break;
            case NAMESPACE:
                {
                alt24=3;
                }
                break;
            case TAXONOMY:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:247:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1479);
                    message131=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message131.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:248:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1484);
                    message_enum132=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum132.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:249:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1489);
                    namespace133=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace133.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:250:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1494);
                    taxonomy134=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy134.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:253:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY135=null;
        Token IDENTIFIER136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        ProtoParser.taxonomy_element_return taxonomy_element138 = null;


        ProtoTree TAXONOMY135_tree=null;
        ProtoTree IDENTIFIER136_tree=null;
        ProtoTree char_literal137_tree=null;
        ProtoTree char_literal139_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:253:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:253:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY135=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1504); 
            TAXONOMY135_tree = (ProtoTree)adaptor.create(TAXONOMY135);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY135_tree, root_0);

            IDENTIFIER136=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1507); 
            IDENTIFIER136_tree = (ProtoTree)adaptor.create(IDENTIFIER136);
            adaptor.addChild(root_0, IDENTIFIER136_tree);

            char_literal137=(Token)match(input,39,FOLLOW_39_in_taxonomy1509); 
            // org/fudgemsg/proto/antlr/Proto.g:253:38: ( taxonomy_element )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IMPORT||LA25_0==IDENTIFIER) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:253:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1512);
            	    taxonomy_element138=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element138.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            char_literal139=(Token)match(input,40,FOLLOW_40_in_taxonomy1515); 

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
    // org/fudgemsg/proto/antlr/Proto.g:255:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT141=null;
        Token char_literal143=null;
        ProtoParser.enum_element_return enum_element140 = null;

        ProtoParser.fullidentifier_return fullidentifier142 = null;


        ProtoTree IMPORT141_tree=null;
        ProtoTree char_literal143_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:256:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IDENTIFIER) ) {
                alt26=1;
            }
            else if ( (LA26_0==IMPORT) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:256:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1526);
                    enum_element140=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element140.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:257:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT141=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1531); 
                    IMPORT141_tree = (ProtoTree)adaptor.create(IMPORT141);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT141_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1534);
                    fullidentifier142=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier142.getTree());
                    char_literal143=(Token)match(input,41,FOLLOW_41_in_taxonomy_element1536); 

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
    static final String DFA11_eotS =
        "\37\uffff";
    static final String DFA11_eofS =
        "\37\uffff";
    static final String DFA11_minS =
        "\1\23\32\40\2\uffff\2\40";
    static final String DFA11_maxS =
        "\1\76\31\53\1\77\2\uffff\1\40\1\77";
    static final String DFA11_acceptS =
        "\33\uffff\1\1\1\2\2\uffff";
    static final String DFA11_specialS =
        "\37\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\3\1\26\1\24\1\30\1\7\1\16\1\5\1\31\4\uffff\1\32\16\uffff"+
            "\1\2\1\4\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1"+
            "\22\1\23\1\25\1\27",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34",
            "\1\33\12\uffff\1\34\23\uffff\1\35",
            "",
            "",
            "\1\36",
            "\1\33\12\uffff\1\34\23\uffff\1\35"
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
            return "210:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
 

    public static final BitSet FOLLOW_BINDING_in_binding625 = new BitSet(new long[]{0x000000213FFB7A60L});
    public static final BitSet FOLLOW_binding_anyword_in_binding628 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_binding630 = new BitSet(new long[]{0x000001213FFB7A60L});
    public static final BitSet FOLLOW_binding_element_in_binding633 = new BitSet(new long[]{0x000001213FFB7A60L});
    public static final BitSet FOLLOW_40_in_binding637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding_anyword653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_binding_anyword658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_binding_anyword663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_binding_anyword668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_binding_anyword673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_binding_anyword678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_binding_anyword683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_binding_anyword688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_binding_anyword693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_binding_anyword698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_binding_anyword703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_binding_anyword708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_binding_anyword713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_binding_anyword718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_binding_anyword723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_binding_anyword728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_binding_anyword733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_binding_anyword738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_binding_anyword743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_binding_anyword748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element763 = new BitSet(new long[]{0x0000003100000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text775 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_binding_text777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text788 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_binding_text790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default801 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_constraint_default804 = new BitSet(new long[]{0x0000002700000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_dimension817 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension819 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_dimension821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_dimension834 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_dimension836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element852 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element855 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_enum_element858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_enum_value868 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_field_constraints889 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints892 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45_in_field_constraints895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints898 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_field_constraints902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_field_ordinal912 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_field_modifier933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_field_modifier938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_field_modifier943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_field_modifier949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype959 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype961 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_primtype988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_primtype1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_primtype1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_primtype1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_primtype1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1241 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_fullidentifier1245 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1248 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1285 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1288 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_message_uses_in_message1290 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message1293 = new BitSet(new long[]{0x7FFFC1010FFB3220L});
    public static final BitSet FOLLOW_message_element_in_message1296 = new BitSet(new long[]{0x7FFFC1010FFB3220L});
    public static final BitSet FOLLOW_40_in_message1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1335 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1338 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message_enum1340 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1343 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_40_in_message_enum1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1356 = new BitSet(new long[]{0x7FFFC0010FFB2000L});
    public static final BitSet FOLLOW_field_type_in_message_field1359 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1361 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1363 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1366 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_message_field1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1397 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1400 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message_submsg1402 = new BitSet(new long[]{0x7FFFC1010FFB3220L});
    public static final BitSet FOLLOW_message_element_in_message_submsg1405 = new BitSet(new long[]{0x7FFFC1010FFB3220L});
    public static final BitSet FOLLOW_40_in_message_submsg1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1419 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1422 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_message_uses1425 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1428 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1439 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1442 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_namespace1444 = new BitSet(new long[]{0x0000010010005200L});
    public static final BitSet FOLLOW_root_object_in_namespace1447 = new BitSet(new long[]{0x0000010010005200L});
    public static final BitSet FOLLOW_40_in_namespace1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1460 = new BitSet(new long[]{0x0000000010005202L});
    public static final BitSet FOLLOW_message_in_root_object1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1504 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1507 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_taxonomy1509 = new BitSet(new long[]{0x0000010100000800L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1512 = new BitSet(new long[]{0x0000010100000800L});
    public static final BitSet FOLLOW_40_in_taxonomy1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1531 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1534 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_taxonomy_element1536 = new BitSet(new long[]{0x0000000000000002L});

}