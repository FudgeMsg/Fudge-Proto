// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-13 14:54:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BINDING", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "EXTENDS", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "TAXONOMY", "USES", "COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "ML_STRING", "STRING", "WHITESPACE", "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'optional'", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'"
    };
    public static final int BINDING=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T_STRING=28;
    public static final int ML_STRING=36;
    public static final int T_BOOL=20;
    public static final int T_DOUBLE=22;
    public static final int FLOAT=34;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T_LONG=26;
    public static final int T__55=55;
    public static final int ML_COMMENT=35;
    public static final int T_INDICATOR=24;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=12;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int IDENTIFIER=32;
    public static final int TAXONOMY=29;
    public static final int T__59=59;
    public static final int T_INT=25;
    public static final int MESSAGE=13;
    public static final int COMMENT=31;
    public static final int T__50=50;
    public static final int ARRAY=4;
    public static final int INTEGER=33;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T_BYTE=21;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int DIM_FIXED=7;
    public static final int DEFAULT=6;
    public static final int ORDINAL=16;
    public static final int T_FLOAT=23;
    public static final int REPEATED=17;
    public static final int WHITESPACE=38;
    public static final int REQUIRED=18;
    public static final int ROOT=19;
    public static final int NAMESPACE=15;
    public static final int DIM_VARIANT=8;
    public static final int ENUM=9;
    public static final int USES=30;
    public static final int T__39=39;
    public static final int FIELD=11;
    public static final int T_SHORT=27;
    public static final int EXTENDS=10;
    public static final int MUTABLE=14;
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

            BINDING1=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding595); 
            BINDING1_tree = (ProtoTree)adaptor.create(BINDING1);
            root_0 = (ProtoTree)adaptor.becomeRoot(BINDING1_tree, root_0);

            pushFollow(FOLLOW_binding_anyword_in_binding598);
            binding_anyword2=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword2.getTree());
            char_literal3=(Token)match(input,39,FOLLOW_39_in_binding600); 
            // org/fudgemsg/proto/antlr/Proto.g:115:41: ( binding_element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=BINDING && LA1_0<=DEFAULT)||(LA1_0>=ENUM && LA1_0<=EXTENDS)||(LA1_0>=IMPORT && LA1_0<=NAMESPACE)||(LA1_0>=REPEATED && LA1_0<=REQUIRED)||(LA1_0>=T_BOOL && LA1_0<=USES)||LA1_0==IDENTIFIER||LA1_0==STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:115:41: binding_element
            	    {
            	    pushFollow(FOLLOW_binding_element_in_binding603);
            	    binding_element4=binding_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, binding_element4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            char_literal5=(Token)match(input,40,FOLLOW_40_in_binding607); 

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
    // org/fudgemsg/proto/antlr/Proto.g:117:1: binding_anyword : ( fullidentifier | BINDING | DEFAULT | ENUM | EXTENDS | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | STRING );
    public final ProtoParser.binding_anyword_return binding_anyword() throws RecognitionException {
        ProtoParser.binding_anyword_return retval = new ProtoParser.binding_anyword_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token BINDING7=null;
        Token DEFAULT8=null;
        Token ENUM9=null;
        Token EXTENDS10=null;
        Token IMPORT11=null;
        Token MESSAGE12=null;
        Token MUTABLE13=null;
        Token NAMESPACE14=null;
        Token REPEATED15=null;
        Token REQUIRED16=null;
        Token T_BOOL17=null;
        Token T_BYTE18=null;
        Token T_DOUBLE19=null;
        Token T_FLOAT20=null;
        Token T_INDICATOR21=null;
        Token T_INT22=null;
        Token T_LONG23=null;
        Token T_SHORT24=null;
        Token T_STRING25=null;
        Token TAXONOMY26=null;
        Token USES27=null;
        Token STRING28=null;
        ProtoParser.fullidentifier_return fullidentifier6 = null;


        ProtoTree BINDING7_tree=null;
        ProtoTree DEFAULT8_tree=null;
        ProtoTree ENUM9_tree=null;
        ProtoTree EXTENDS10_tree=null;
        ProtoTree IMPORT11_tree=null;
        ProtoTree MESSAGE12_tree=null;
        ProtoTree MUTABLE13_tree=null;
        ProtoTree NAMESPACE14_tree=null;
        ProtoTree REPEATED15_tree=null;
        ProtoTree REQUIRED16_tree=null;
        ProtoTree T_BOOL17_tree=null;
        ProtoTree T_BYTE18_tree=null;
        ProtoTree T_DOUBLE19_tree=null;
        ProtoTree T_FLOAT20_tree=null;
        ProtoTree T_INDICATOR21_tree=null;
        ProtoTree T_INT22_tree=null;
        ProtoTree T_LONG23_tree=null;
        ProtoTree T_SHORT24_tree=null;
        ProtoTree T_STRING25_tree=null;
        ProtoTree TAXONOMY26_tree=null;
        ProtoTree USES27_tree=null;
        ProtoTree STRING28_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:118:2: ( fullidentifier | BINDING | DEFAULT | ENUM | EXTENDS | IMPORT | MESSAGE | MUTABLE | NAMESPACE | REPEATED | REQUIRED | T_BOOL | T_BYTE | T_DOUBLE | T_FLOAT | T_INDICATOR | T_INT | T_LONG | T_SHORT | T_STRING | TAXONOMY | USES | STRING )
            int alt2=23;
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
            case EXTENDS:
                {
                alt2=5;
                }
                break;
            case IMPORT:
                {
                alt2=6;
                }
                break;
            case MESSAGE:
                {
                alt2=7;
                }
                break;
            case MUTABLE:
                {
                alt2=8;
                }
                break;
            case NAMESPACE:
                {
                alt2=9;
                }
                break;
            case REPEATED:
                {
                alt2=10;
                }
                break;
            case REQUIRED:
                {
                alt2=11;
                }
                break;
            case T_BOOL:
                {
                alt2=12;
                }
                break;
            case T_BYTE:
                {
                alt2=13;
                }
                break;
            case T_DOUBLE:
                {
                alt2=14;
                }
                break;
            case T_FLOAT:
                {
                alt2=15;
                }
                break;
            case T_INDICATOR:
                {
                alt2=16;
                }
                break;
            case T_INT:
                {
                alt2=17;
                }
                break;
            case T_LONG:
                {
                alt2=18;
                }
                break;
            case T_SHORT:
                {
                alt2=19;
                }
                break;
            case T_STRING:
                {
                alt2=20;
                }
                break;
            case TAXONOMY:
                {
                alt2=21;
                }
                break;
            case USES:
                {
                alt2=22;
                }
                break;
            case STRING:
                {
                alt2=23;
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

                    pushFollow(FOLLOW_fullidentifier_in_binding_anyword618);
                    fullidentifier6=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier6.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:119:4: BINDING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    BINDING7=(Token)match(input,BINDING,FOLLOW_BINDING_in_binding_anyword623); 
                    BINDING7_tree = (ProtoTree)adaptor.create(BINDING7);
                    adaptor.addChild(root_0, BINDING7_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:120:4: DEFAULT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    DEFAULT8=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_binding_anyword628); 
                    DEFAULT8_tree = (ProtoTree)adaptor.create(DEFAULT8);
                    adaptor.addChild(root_0, DEFAULT8_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:121:4: ENUM
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ENUM9=(Token)match(input,ENUM,FOLLOW_ENUM_in_binding_anyword633); 
                    ENUM9_tree = (ProtoTree)adaptor.create(ENUM9);
                    adaptor.addChild(root_0, ENUM9_tree);


                    }
                    break;
                case 5 :
                    // org/fudgemsg/proto/antlr/Proto.g:122:4: EXTENDS
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    EXTENDS10=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_binding_anyword638); 
                    EXTENDS10_tree = (ProtoTree)adaptor.create(EXTENDS10);
                    adaptor.addChild(root_0, EXTENDS10_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:123:4: IMPORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_binding_anyword643); 
                    IMPORT11_tree = (ProtoTree)adaptor.create(IMPORT11);
                    adaptor.addChild(root_0, IMPORT11_tree);


                    }
                    break;
                case 7 :
                    // org/fudgemsg/proto/antlr/Proto.g:124:4: MESSAGE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MESSAGE12=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_binding_anyword648); 
                    MESSAGE12_tree = (ProtoTree)adaptor.create(MESSAGE12);
                    adaptor.addChild(root_0, MESSAGE12_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:125:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE13=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_binding_anyword653); 
                    MUTABLE13_tree = (ProtoTree)adaptor.create(MUTABLE13);
                    adaptor.addChild(root_0, MUTABLE13_tree);


                    }
                    break;
                case 9 :
                    // org/fudgemsg/proto/antlr/Proto.g:126:4: NAMESPACE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    NAMESPACE14=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_binding_anyword658); 
                    NAMESPACE14_tree = (ProtoTree)adaptor.create(NAMESPACE14);
                    adaptor.addChild(root_0, NAMESPACE14_tree);


                    }
                    break;
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:127:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED15=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_binding_anyword663); 
                    REPEATED15_tree = (ProtoTree)adaptor.create(REPEATED15);
                    adaptor.addChild(root_0, REPEATED15_tree);


                    }
                    break;
                case 11 :
                    // org/fudgemsg/proto/antlr/Proto.g:128:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED16=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_binding_anyword668); 
                    REQUIRED16_tree = (ProtoTree)adaptor.create(REQUIRED16);
                    adaptor.addChild(root_0, REQUIRED16_tree);


                    }
                    break;
                case 12 :
                    // org/fudgemsg/proto/antlr/Proto.g:129:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL17=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_binding_anyword673); 
                    T_BOOL17_tree = (ProtoTree)adaptor.create(T_BOOL17);
                    adaptor.addChild(root_0, T_BOOL17_tree);


                    }
                    break;
                case 13 :
                    // org/fudgemsg/proto/antlr/Proto.g:130:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE18=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_binding_anyword678); 
                    T_BYTE18_tree = (ProtoTree)adaptor.create(T_BYTE18);
                    adaptor.addChild(root_0, T_BYTE18_tree);


                    }
                    break;
                case 14 :
                    // org/fudgemsg/proto/antlr/Proto.g:131:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE19=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_binding_anyword683); 
                    T_DOUBLE19_tree = (ProtoTree)adaptor.create(T_DOUBLE19);
                    adaptor.addChild(root_0, T_DOUBLE19_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:132:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT20=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_binding_anyword688); 
                    T_FLOAT20_tree = (ProtoTree)adaptor.create(T_FLOAT20);
                    adaptor.addChild(root_0, T_FLOAT20_tree);


                    }
                    break;
                case 16 :
                    // org/fudgemsg/proto/antlr/Proto.g:133:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR21=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_binding_anyword693); 
                    T_INDICATOR21_tree = (ProtoTree)adaptor.create(T_INDICATOR21);
                    adaptor.addChild(root_0, T_INDICATOR21_tree);


                    }
                    break;
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:134:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT22=(Token)match(input,T_INT,FOLLOW_T_INT_in_binding_anyword698); 
                    T_INT22_tree = (ProtoTree)adaptor.create(T_INT22);
                    adaptor.addChild(root_0, T_INT22_tree);


                    }
                    break;
                case 18 :
                    // org/fudgemsg/proto/antlr/Proto.g:135:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG23=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_binding_anyword703); 
                    T_LONG23_tree = (ProtoTree)adaptor.create(T_LONG23);
                    adaptor.addChild(root_0, T_LONG23_tree);


                    }
                    break;
                case 19 :
                    // org/fudgemsg/proto/antlr/Proto.g:136:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT24=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_binding_anyword708); 
                    T_SHORT24_tree = (ProtoTree)adaptor.create(T_SHORT24);
                    adaptor.addChild(root_0, T_SHORT24_tree);


                    }
                    break;
                case 20 :
                    // org/fudgemsg/proto/antlr/Proto.g:137:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING25=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_binding_anyword713); 
                    T_STRING25_tree = (ProtoTree)adaptor.create(T_STRING25);
                    adaptor.addChild(root_0, T_STRING25_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:138:4: TAXONOMY
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    TAXONOMY26=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_binding_anyword718); 
                    TAXONOMY26_tree = (ProtoTree)adaptor.create(TAXONOMY26);
                    adaptor.addChild(root_0, TAXONOMY26_tree);


                    }
                    break;
                case 22 :
                    // org/fudgemsg/proto/antlr/Proto.g:139:4: USES
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    USES27=(Token)match(input,USES,FOLLOW_USES_in_binding_anyword723); 
                    USES27_tree = (ProtoTree)adaptor.create(USES27);
                    adaptor.addChild(root_0, USES27_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:140:4: STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING28=(Token)match(input,STRING,FOLLOW_STRING_in_binding_anyword728); 
                    STRING28_tree = (ProtoTree)adaptor.create(STRING28);
                    adaptor.addChild(root_0, STRING28_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:143:1: binding_element : binding_anyword binding_text ;
    public final ProtoParser.binding_element_return binding_element() throws RecognitionException {
        ProtoParser.binding_element_return retval = new ProtoParser.binding_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.binding_anyword_return binding_anyword29 = null;

        ProtoParser.binding_text_return binding_text30 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:143:17: ( binding_anyword binding_text )
            // org/fudgemsg/proto/antlr/Proto.g:143:19: binding_anyword binding_text
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_binding_anyword_in_binding_element738);
            binding_anyword29=binding_anyword();

            state._fsp--;

            adaptor.addChild(root_0, binding_anyword29.getTree());
            pushFollow(FOLLOW_binding_text_in_binding_element740);
            binding_text30=binding_text();

            state._fsp--;

            adaptor.addChild(root_0, binding_text30.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:145:1: binding_text : ( STRING ';' | ML_STRING | fullidentifier ';' );
    public final ProtoParser.binding_text_return binding_text() throws RecognitionException {
        ProtoParser.binding_text_return retval = new ProtoParser.binding_text_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token STRING31=null;
        Token char_literal32=null;
        Token ML_STRING33=null;
        Token char_literal35=null;
        ProtoParser.fullidentifier_return fullidentifier34 = null;


        ProtoTree STRING31_tree=null;
        ProtoTree char_literal32_tree=null;
        ProtoTree ML_STRING33_tree=null;
        ProtoTree char_literal35_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:146:2: ( STRING ';' | ML_STRING | fullidentifier ';' )
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
                    // org/fudgemsg/proto/antlr/Proto.g:146:4: STRING ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_binding_text750); 
                    STRING31_tree = (ProtoTree)adaptor.create(STRING31);
                    adaptor.addChild(root_0, STRING31_tree);

                    char_literal32=(Token)match(input,41,FOLLOW_41_in_binding_text752); 

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:147:4: ML_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    ML_STRING33=(Token)match(input,ML_STRING,FOLLOW_ML_STRING_in_binding_text758); 
                    ML_STRING33_tree = (ProtoTree)adaptor.create(ML_STRING33);
                    adaptor.addChild(root_0, ML_STRING33_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:148:4: fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_binding_text763);
                    fullidentifier34=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier34.getTree());
                    char_literal35=(Token)match(input,41,FOLLOW_41_in_binding_text765); 

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
    // org/fudgemsg/proto/antlr/Proto.g:151:1: constraint_default : DEFAULT '=' literal ;
    public final ProtoParser.constraint_default_return constraint_default() throws RecognitionException {
        ProtoParser.constraint_default_return retval = new ProtoParser.constraint_default_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token DEFAULT36=null;
        Token char_literal37=null;
        ProtoParser.literal_return literal38 = null;


        ProtoTree DEFAULT36_tree=null;
        ProtoTree char_literal37_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:151:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:151:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT36=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default776); 
            DEFAULT36_tree = (ProtoTree)adaptor.create(DEFAULT36);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT36_tree, root_0);

            char_literal37=(Token)match(input,42,FOLLOW_42_in_constraint_default779); 
            pushFollow(FOLLOW_literal_in_constraint_default782);
            literal38=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal38.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:153:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
    public final ProtoParser.dimension_return dimension() throws RecognitionException {
        ProtoParser.dimension_return retval = new ProtoParser.dimension_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal39=null;
        Token INTEGER40=null;
        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;

        ProtoTree char_literal39_tree=null;
        ProtoTree INTEGER40_tree=null;
        ProtoTree char_literal41_tree=null;
        ProtoTree char_literal42_tree=null;
        ProtoTree char_literal43_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:154:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
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
                    // org/fudgemsg/proto/antlr/Proto.g:154:4: '[' INTEGER ']'
                    {
                    char_literal39=(Token)match(input,43,FOLLOW_43_in_dimension792);  
                    stream_43.add(char_literal39);

                    INTEGER40=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension794);  
                    stream_INTEGER.add(INTEGER40);

                    char_literal41=(Token)match(input,44,FOLLOW_44_in_dimension796);  
                    stream_44.add(char_literal41);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 154:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:154:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:155:4: '[' ']'
                    {
                    char_literal42=(Token)match(input,43,FOLLOW_43_in_dimension809);  
                    stream_43.add(char_literal42);

                    char_literal43=(Token)match(input,44,FOLLOW_44_in_dimension811);  
                    stream_44.add(char_literal43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 155:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:155:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:158:1: enum_element : IDENTIFIER ( enum_value )? ';' ;
    public final ProtoParser.enum_element_return enum_element() throws RecognitionException {
        ProtoParser.enum_element_return retval = new ProtoParser.enum_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER44=null;
        Token char_literal46=null;
        ProtoParser.enum_value_return enum_value45 = null;


        ProtoTree IDENTIFIER44_tree=null;
        ProtoTree char_literal46_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:158:14: ( IDENTIFIER ( enum_value )? ';' )
            // org/fudgemsg/proto/antlr/Proto.g:158:16: IDENTIFIER ( enum_value )? ';'
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER44=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element827); 
            IDENTIFIER44_tree = (ProtoTree)adaptor.create(IDENTIFIER44);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER44_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:158:28: ( enum_value )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:158:28: enum_value
                    {
                    pushFollow(FOLLOW_enum_value_in_enum_element830);
                    enum_value45=enum_value();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_value45.getTree());

                    }
                    break;

            }

            char_literal46=(Token)match(input,41,FOLLOW_41_in_enum_element833); 

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
    // org/fudgemsg/proto/antlr/Proto.g:160:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal47=null;
        Token INTEGER48=null;

        ProtoTree char_literal47_tree=null;
        ProtoTree INTEGER48_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:160:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:160:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal47=(Token)match(input,42,FOLLOW_42_in_enum_value843); 
            INTEGER48=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value846); 
            INTEGER48_tree = (ProtoTree)adaptor.create(INTEGER48);
            adaptor.addChild(root_0, INTEGER48_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:162:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default49 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:162:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:162:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint855);
            constraint_default49=constraint_default();

            state._fsp--;

            adaptor.addChild(root_0, constraint_default49.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:164:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
    public final ProtoParser.field_constraints_return field_constraints() throws RecognitionException {
        ProtoParser.field_constraints_return retval = new ProtoParser.field_constraints_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal50=null;
        Token char_literal52=null;
        Token char_literal54=null;
        ProtoParser.field_constraint_return field_constraint51 = null;

        ProtoParser.field_constraint_return field_constraint53 = null;


        ProtoTree char_literal50_tree=null;
        ProtoTree char_literal52_tree=null;
        ProtoTree char_literal54_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:164:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:164:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal50=(Token)match(input,43,FOLLOW_43_in_field_constraints864); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints867);
            field_constraint51=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint51.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:164:43: ( ',' field_constraint )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:164:44: ',' field_constraint
            	    {
            	    char_literal52=(Token)match(input,45,FOLLOW_45_in_field_constraints870); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints873);
            	    field_constraint53=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint53.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal54=(Token)match(input,44,FOLLOW_44_in_field_constraints877); 

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
    // org/fudgemsg/proto/antlr/Proto.g:166:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal55=null;
        Token INTEGER56=null;

        ProtoTree char_literal55_tree=null;
        ProtoTree INTEGER56_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:166:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:166:17: '=' INTEGER
            {
            char_literal55=(Token)match(input,42,FOLLOW_42_in_field_ordinal887);  
            stream_42.add(char_literal55);

            INTEGER56=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal889);  
            stream_INTEGER.add(INTEGER56);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 166:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:166:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:169:1: field_modifier : ( MUTABLE | REQUIRED | 'optional' | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MUTABLE57=null;
        Token REQUIRED58=null;
        Token string_literal59=null;
        Token REPEATED60=null;

        ProtoTree MUTABLE57_tree=null;
        ProtoTree REQUIRED58_tree=null;
        ProtoTree string_literal59_tree=null;
        ProtoTree REPEATED60_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:170:2: ( MUTABLE | REQUIRED | 'optional' | REPEATED )
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
                    // org/fudgemsg/proto/antlr/Proto.g:170:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE57=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_field_modifier908); 
                    MUTABLE57_tree = (ProtoTree)adaptor.create(MUTABLE57);
                    adaptor.addChild(root_0, MUTABLE57_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:171:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED58=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_modifier913); 
                    REQUIRED58_tree = (ProtoTree)adaptor.create(REQUIRED58);
                    adaptor.addChild(root_0, REQUIRED58_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:172:4: 'optional'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    string_literal59=(Token)match(input,46,FOLLOW_46_in_field_modifier918); 

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:173:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED60=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_field_modifier924); 
                    REPEATED60_tree = (ProtoTree)adaptor.create(REPEATED60);
                    adaptor.addChild(root_0, REPEATED60_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:176:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype61 = null;

        ProtoParser.dimension_return dimension62 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:176:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:176:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype934);
            field_basetype61=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype61.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:176:34: ( dimension )+
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
            	    // org/fudgemsg/proto/antlr/Proto.g:176:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype936);
            	    dimension62=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension62.getTree());

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
            // 176:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:176:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:178:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL63=null;
        Token string_literal64=null;
        Token T_BYTE65=null;
        Token string_literal66=null;
        Token T_SHORT67=null;
        Token string_literal68=null;
        Token T_INT69=null;
        Token string_literal70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;
        Token string_literal74=null;
        Token string_literal75=null;
        Token T_LONG76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal81=null;
        Token T_FLOAT82=null;
        Token string_literal83=null;
        Token T_DOUBLE84=null;
        Token string_literal85=null;
        Token T_INDICATOR86=null;
        Token T_STRING87=null;

        ProtoTree T_BOOL63_tree=null;
        ProtoTree string_literal64_tree=null;
        ProtoTree T_BYTE65_tree=null;
        ProtoTree string_literal66_tree=null;
        ProtoTree T_SHORT67_tree=null;
        ProtoTree string_literal68_tree=null;
        ProtoTree T_INT69_tree=null;
        ProtoTree string_literal70_tree=null;
        ProtoTree string_literal71_tree=null;
        ProtoTree string_literal72_tree=null;
        ProtoTree string_literal73_tree=null;
        ProtoTree string_literal74_tree=null;
        ProtoTree string_literal75_tree=null;
        ProtoTree T_LONG76_tree=null;
        ProtoTree string_literal77_tree=null;
        ProtoTree string_literal78_tree=null;
        ProtoTree string_literal79_tree=null;
        ProtoTree string_literal80_tree=null;
        ProtoTree string_literal81_tree=null;
        ProtoTree T_FLOAT82_tree=null;
        ProtoTree string_literal83_tree=null;
        ProtoTree T_DOUBLE84_tree=null;
        ProtoTree string_literal85_tree=null;
        ProtoTree T_INDICATOR86_tree=null;
        ProtoTree T_STRING87_tree=null;
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
            // org/fudgemsg/proto/antlr/Proto.g:179:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING )
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
                    // org/fudgemsg/proto/antlr/Proto.g:179:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL63=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype958); 
                    T_BOOL63_tree = (ProtoTree)adaptor.create(T_BOOL63);
                    adaptor.addChild(root_0, T_BOOL63_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:180:4: 'boolean'
                    {
                    string_literal64=(Token)match(input,47,FOLLOW_47_in_field_primtype963);  
                    stream_47.add(string_literal64);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 180:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:180:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:181:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE65=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype974); 
                    T_BYTE65_tree = (ProtoTree)adaptor.create(T_BYTE65);
                    adaptor.addChild(root_0, T_BYTE65_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:182:4: 'int8'
                    {
                    string_literal66=(Token)match(input,48,FOLLOW_48_in_field_primtype979);  
                    stream_48.add(string_literal66);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 182:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:182:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:183:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT67=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype990); 
                    T_SHORT67_tree = (ProtoTree)adaptor.create(T_SHORT67);
                    adaptor.addChild(root_0, T_SHORT67_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:184:4: 'int16'
                    {
                    string_literal68=(Token)match(input,49,FOLLOW_49_in_field_primtype995);  
                    stream_49.add(string_literal68);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 184:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:184:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:185:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT69=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype1006); 
                    T_INT69_tree = (ProtoTree)adaptor.create(T_INT69);
                    adaptor.addChild(root_0, T_INT69_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:186:4: 'int32'
                    {
                    string_literal70=(Token)match(input,50,FOLLOW_50_in_field_primtype1011);  
                    stream_50.add(string_literal70);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 186:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:186:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:187:4: 'uint32'
                    {
                    string_literal71=(Token)match(input,51,FOLLOW_51_in_field_primtype1022);  
                    stream_51.add(string_literal71);



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
                case 10 :
                    // org/fudgemsg/proto/antlr/Proto.g:188:4: 'sint32'
                    {
                    string_literal72=(Token)match(input,52,FOLLOW_52_in_field_primtype1033);  
                    stream_52.add(string_literal72);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 188:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:188:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:189:4: 'fixed32'
                    {
                    string_literal73=(Token)match(input,53,FOLLOW_53_in_field_primtype1044);  
                    stream_53.add(string_literal73);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 189:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:189:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:190:4: 'sfixed32'
                    {
                    string_literal74=(Token)match(input,54,FOLLOW_54_in_field_primtype1055);  
                    stream_54.add(string_literal74);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 190:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:190:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:191:4: 'integer'
                    {
                    string_literal75=(Token)match(input,55,FOLLOW_55_in_field_primtype1066);  
                    stream_55.add(string_literal75);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 191:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:191:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:192:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG76=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype1077); 
                    T_LONG76_tree = (ProtoTree)adaptor.create(T_LONG76);
                    adaptor.addChild(root_0, T_LONG76_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:193:4: 'int64'
                    {
                    string_literal77=(Token)match(input,56,FOLLOW_56_in_field_primtype1082);  
                    stream_56.add(string_literal77);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 193:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:193:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:194:4: 'uint64'
                    {
                    string_literal78=(Token)match(input,57,FOLLOW_57_in_field_primtype1093);  
                    stream_57.add(string_literal78);



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
                case 17 :
                    // org/fudgemsg/proto/antlr/Proto.g:195:4: 'sint64'
                    {
                    string_literal79=(Token)match(input,58,FOLLOW_58_in_field_primtype1104);  
                    stream_58.add(string_literal79);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 195:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:195:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:196:4: 'fixed64'
                    {
                    string_literal80=(Token)match(input,59,FOLLOW_59_in_field_primtype1115);  
                    stream_59.add(string_literal80);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 196:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:196:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:197:4: 'sfixed64'
                    {
                    string_literal81=(Token)match(input,60,FOLLOW_60_in_field_primtype1126);  
                    stream_60.add(string_literal81);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 197:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:197:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:198:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT82=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype1137); 
                    T_FLOAT82_tree = (ProtoTree)adaptor.create(T_FLOAT82);
                    adaptor.addChild(root_0, T_FLOAT82_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:199:4: 'float32'
                    {
                    string_literal83=(Token)match(input,61,FOLLOW_61_in_field_primtype1142);  
                    stream_61.add(string_literal83);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 199:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:199:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:200:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE84=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype1153); 
                    T_DOUBLE84_tree = (ProtoTree)adaptor.create(T_DOUBLE84);
                    adaptor.addChild(root_0, T_DOUBLE84_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:201:4: 'float64'
                    {
                    string_literal85=(Token)match(input,62,FOLLOW_62_in_field_primtype1158);  
                    stream_62.add(string_literal85);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 201:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:201:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:202:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR86=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype1169); 
                    T_INDICATOR86_tree = (ProtoTree)adaptor.create(T_INDICATOR86);
                    adaptor.addChild(root_0, T_INDICATOR86_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:203:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING87=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype1174); 
                    T_STRING87_tree = (ProtoTree)adaptor.create(T_STRING87);
                    adaptor.addChild(root_0, T_STRING87_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:206:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype88 = null;

        ProtoParser.fullidentifier_return fullidentifier89 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:207:2: ( field_primtype | fullidentifier )
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
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype1185);
                    field_primtype88=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype88.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype1190);
                    fullidentifier89=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier89.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:211:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype90 = null;

        ProtoParser.field_arraytype_return field_arraytype91 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:212:2: ( field_basetype | field_arraytype )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:212:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type1201);
                    field_basetype90=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype90.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:213:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type1206);
                    field_arraytype91=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype91.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:216:1: fullidentifier : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER92=null;
        Token char_literal93=null;
        Token IDENTIFIER94=null;

        ProtoTree IDENTIFIER92_tree=null;
        ProtoTree char_literal93_tree=null;
        ProtoTree IDENTIFIER94_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:216:16: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // org/fudgemsg/proto/antlr/Proto.g:216:18: IDENTIFIER ( '.' IDENTIFIER )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER92=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1216); 
            IDENTIFIER92_tree = (ProtoTree)adaptor.create(IDENTIFIER92);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER92_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:216:30: ( '.' IDENTIFIER )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==63) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:216:31: '.' IDENTIFIER
            	    {
            	    char_literal93=(Token)match(input,63,FOLLOW_63_in_fullidentifier1220); 
            	    IDENTIFIER94=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier1223); 
            	    IDENTIFIER94_tree = (ProtoTree)adaptor.create(IDENTIFIER94);
            	    adaptor.addChild(root_0, IDENTIFIER94_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:218:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set95=null;

        ProtoTree set95_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:219:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set95=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set95));
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
    // org/fudgemsg/proto/antlr/Proto.g:225:1: message : MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE96=null;
        Token IDENTIFIER97=null;
        Token char_literal100=null;
        Token char_literal102=null;
        ProtoParser.message_uses_return message_uses98 = null;

        ProtoParser.message_extends_return message_extends99 = null;

        ProtoParser.message_element_return message_element101 = null;


        ProtoTree MESSAGE96_tree=null;
        ProtoTree IDENTIFIER97_tree=null;
        ProtoTree char_literal100_tree=null;
        ProtoTree char_literal102_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:225:9: ( MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:225:11: MESSAGE IDENTIFIER ( message_uses )? ( message_extends )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE96=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1260); 
            MESSAGE96_tree = (ProtoTree)adaptor.create(MESSAGE96);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE96_tree, root_0);

            IDENTIFIER97=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1263); 
            IDENTIFIER97_tree = (ProtoTree)adaptor.create(IDENTIFIER97);
            adaptor.addChild(root_0, IDENTIFIER97_tree);

            // org/fudgemsg/proto/antlr/Proto.g:225:31: ( message_uses )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==USES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:225:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1265);
                    message_uses98=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses98.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:225:45: ( message_extends )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EXTENDS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:225:45: message_extends
                    {
                    pushFollow(FOLLOW_message_extends_in_message1268);
                    message_extends99=message_extends();

                    state._fsp--;

                    adaptor.addChild(root_0, message_extends99.getTree());

                    }
                    break;

            }

            char_literal100=(Token)match(input,39,FOLLOW_39_in_message1271); 
            // org/fudgemsg/proto/antlr/Proto.g:225:67: ( message_element )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BINDING||LA15_0==ENUM||(LA15_0>=MESSAGE && LA15_0<=MUTABLE)||(LA15_0>=REPEATED && LA15_0<=REQUIRED)||(LA15_0>=T_BOOL && LA15_0<=T_STRING)||LA15_0==IDENTIFIER||(LA15_0>=46 && LA15_0<=62)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:225:67: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1274);
            	    message_element101=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element101.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            char_literal102=(Token)match(input,40,FOLLOW_40_in_message1277); 

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
    // org/fudgemsg/proto/antlr/Proto.g:227:1: message_element : ( message_enum | message_field | message_submsg | binding );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum103 = null;

        ProtoParser.message_field_return message_field104 = null;

        ProtoParser.message_submsg_return message_submsg105 = null;

        ProtoParser.binding_return binding106 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:228:2: ( message_enum | message_field | message_submsg | binding )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt16=1;
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
                alt16=2;
                }
                break;
            case MESSAGE:
                {
                alt16=3;
                }
                break;
            case BINDING:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:228:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1288);
                    message_enum103=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum103.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:229:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1293);
                    message_field104=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field104.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:230:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1298);
                    message_submsg105=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg105.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:231:4: binding
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_binding_in_message_element1303);
                    binding106=binding();

                    state._fsp--;

                    adaptor.addChild(root_0, binding106.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:234:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM107=null;
        Token IDENTIFIER108=null;
        Token char_literal109=null;
        Token char_literal111=null;
        ProtoParser.enum_element_return enum_element110 = null;


        ProtoTree ENUM107_tree=null;
        ProtoTree IDENTIFIER108_tree=null;
        ProtoTree char_literal109_tree=null;
        ProtoTree char_literal111_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:234:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:234:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM107=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1313); 
            ENUM107_tree = (ProtoTree)adaptor.create(ENUM107);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM107_tree, root_0);

            IDENTIFIER108=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1316); 
            IDENTIFIER108_tree = (ProtoTree)adaptor.create(IDENTIFIER108);
            adaptor.addChild(root_0, IDENTIFIER108_tree);

            char_literal109=(Token)match(input,39,FOLLOW_39_in_message_enum1318); 
            // org/fudgemsg/proto/antlr/Proto.g:234:38: ( enum_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==IDENTIFIER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:234:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1321);
            	    enum_element110=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element110.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal111=(Token)match(input,40,FOLLOW_40_in_message_enum1324); 

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
    // org/fudgemsg/proto/antlr/Proto.g:236:1: message_field : ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) ;
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER114=null;
        Token char_literal117=null;
        ProtoParser.field_modifier_return field_modifier112 = null;

        ProtoParser.field_type_return field_type113 = null;

        ProtoParser.field_ordinal_return field_ordinal115 = null;

        ProtoParser.field_constraints_return field_constraints116 = null;


        ProtoTree IDENTIFIER114_tree=null;
        ProtoTree char_literal117_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:236:15: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            // org/fudgemsg/proto/antlr/Proto.g:236:17: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
            {
            // org/fudgemsg/proto/antlr/Proto.g:236:17: ( field_modifier )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MUTABLE||(LA18_0>=REPEATED && LA18_0<=REQUIRED)||LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:236:17: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_message_field1334);
            	    field_modifier112=field_modifier();

            	    state._fsp--;

            	    stream_field_modifier.add(field_modifier112.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            pushFollow(FOLLOW_field_type_in_message_field1337);
            field_type113=field_type();

            state._fsp--;

            stream_field_type.add(field_type113.getTree());
            IDENTIFIER114=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1339);  
            stream_IDENTIFIER.add(IDENTIFIER114);

            // org/fudgemsg/proto/antlr/Proto.g:236:55: ( field_ordinal )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:236:55: field_ordinal
                    {
                    pushFollow(FOLLOW_field_ordinal_in_message_field1341);
                    field_ordinal115=field_ordinal();

                    state._fsp--;

                    stream_field_ordinal.add(field_ordinal115.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:236:70: ( field_constraints )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:236:70: field_constraints
                    {
                    pushFollow(FOLLOW_field_constraints_in_message_field1344);
                    field_constraints116=field_constraints();

                    state._fsp--;

                    stream_field_constraints.add(field_constraints116.getTree());

                    }
                    break;

            }

            char_literal117=(Token)match(input,41,FOLLOW_41_in_message_field1347);  
            stream_41.add(char_literal117);



            // AST REWRITE
            // elements: IDENTIFIER, field_modifier, field_type, field_ordinal, field_constraints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 236:93: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
            {
                // org/fudgemsg/proto/antlr/Proto.g:236:96: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_field_type.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // org/fudgemsg/proto/antlr/Proto.g:236:126: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();
                // org/fudgemsg/proto/antlr/Proto.g:236:142: ( field_ordinal )?
                if ( stream_field_ordinal.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                }
                stream_field_ordinal.reset();
                // org/fudgemsg/proto/antlr/Proto.g:236:157: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:238:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE118=null;
        Token IDENTIFIER119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        ProtoParser.message_element_return message_element121 = null;


        ProtoTree MESSAGE118_tree=null;
        ProtoTree IDENTIFIER119_tree=null;
        ProtoTree char_literal120_tree=null;
        ProtoTree char_literal122_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:238:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:238:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE118=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1375); 
            MESSAGE118_tree = (ProtoTree)adaptor.create(MESSAGE118);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE118_tree, root_0);

            IDENTIFIER119=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1378); 
            IDENTIFIER119_tree = (ProtoTree)adaptor.create(IDENTIFIER119);
            adaptor.addChild(root_0, IDENTIFIER119_tree);

            char_literal120=(Token)match(input,39,FOLLOW_39_in_message_submsg1380); 
            // org/fudgemsg/proto/antlr/Proto.g:238:43: ( message_element )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==BINDING||LA21_0==ENUM||(LA21_0>=MESSAGE && LA21_0<=MUTABLE)||(LA21_0>=REPEATED && LA21_0<=REQUIRED)||(LA21_0>=T_BOOL && LA21_0<=T_STRING)||LA21_0==IDENTIFIER||(LA21_0>=46 && LA21_0<=62)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:238:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1383);
            	    message_element121=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element121.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal122=(Token)match(input,40,FOLLOW_40_in_message_submsg1386); 

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
    // org/fudgemsg/proto/antlr/Proto.g:241:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES123=null;
        Token char_literal125=null;
        ProtoParser.fullidentifier_return fullidentifier124 = null;

        ProtoParser.fullidentifier_return fullidentifier126 = null;


        ProtoTree USES123_tree=null;
        ProtoTree char_literal125_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:241:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:241:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES123=(Token)match(input,USES,FOLLOW_USES_in_message_uses1397); 
            USES123_tree = (ProtoTree)adaptor.create(USES123);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES123_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1400);
            fullidentifier124=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier124.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:241:37: ( ',' fullidentifier )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==45) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:241:38: ',' fullidentifier
            	    {
            	    char_literal125=(Token)match(input,45,FOLLOW_45_in_message_uses1403); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1406);
            	    fullidentifier126=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier126.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // org/fudgemsg/proto/antlr/Proto.g:244:1: message_extends : EXTENDS fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_extends_return message_extends() throws RecognitionException {
        ProtoParser.message_extends_return retval = new ProtoParser.message_extends_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token EXTENDS127=null;
        Token char_literal129=null;
        ProtoParser.fullidentifier_return fullidentifier128 = null;

        ProtoParser.fullidentifier_return fullidentifier130 = null;


        ProtoTree EXTENDS127_tree=null;
        ProtoTree char_literal129_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:244:17: ( EXTENDS fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:244:19: EXTENDS fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            EXTENDS127=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_message_extends1418); 
            EXTENDS127_tree = (ProtoTree)adaptor.create(EXTENDS127);
            root_0 = (ProtoTree)adaptor.becomeRoot(EXTENDS127_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_extends1421);
            fullidentifier128=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier128.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:244:43: ( ',' fullidentifier )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==45) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:244:44: ',' fullidentifier
            	    {
            	    char_literal129=(Token)match(input,45,FOLLOW_45_in_message_extends1424); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_extends1427);
            	    fullidentifier130=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier130.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // org/fudgemsg/proto/antlr/Proto.g:246:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE131=null;
        Token char_literal133=null;
        Token char_literal135=null;
        ProtoParser.fullidentifier_return fullidentifier132 = null;

        ProtoParser.root_object_return root_object134 = null;


        ProtoTree NAMESPACE131_tree=null;
        ProtoTree char_literal133_tree=null;
        ProtoTree char_literal135_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:246:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:246:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE131=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1438); 
            NAMESPACE131_tree = (ProtoTree)adaptor.create(NAMESPACE131);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE131_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1441);
            fullidentifier132=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier132.getTree());
            char_literal133=(Token)match(input,39,FOLLOW_39_in_namespace1443); 
            // org/fudgemsg/proto/antlr/Proto.g:246:44: ( root_object )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ENUM||LA24_0==MESSAGE||LA24_0==NAMESPACE||LA24_0==TAXONOMY) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:246:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1446);
            	    root_object134=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object134.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal135=(Token)match(input,40,FOLLOW_40_in_namespace1449); 

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
    // org/fudgemsg/proto/antlr/Proto.g:248:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object136 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:248:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:248:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:248:8: ( root_object )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ENUM||LA25_0==MESSAGE||LA25_0==NAMESPACE||LA25_0==TAXONOMY) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:248:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1459);
            	    root_object136=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object136.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
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
            // 248:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:248:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:248:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:250:1: root_object : ( message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_return message137 = null;

        ProtoParser.message_enum_return message_enum138 = null;

        ProtoParser.namespace_return namespace139 = null;

        ProtoParser.taxonomy_return taxonomy140 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:251:2: ( message | message_enum | namespace | taxonomy )
            int alt26=4;
            switch ( input.LA(1) ) {
            case MESSAGE:
                {
                alt26=1;
                }
                break;
            case ENUM:
                {
                alt26=2;
                }
                break;
            case NAMESPACE:
                {
                alt26=3;
                }
                break;
            case TAXONOMY:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:251:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1478);
                    message137=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message137.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:252:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1483);
                    message_enum138=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum138.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:253:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1488);
                    namespace139=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace139.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:254:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1493);
                    taxonomy140=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy140.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:257:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY141=null;
        Token IDENTIFIER142=null;
        Token char_literal143=null;
        Token char_literal145=null;
        ProtoParser.taxonomy_element_return taxonomy_element144 = null;


        ProtoTree TAXONOMY141_tree=null;
        ProtoTree IDENTIFIER142_tree=null;
        ProtoTree char_literal143_tree=null;
        ProtoTree char_literal145_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:257:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:257:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY141=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1503); 
            TAXONOMY141_tree = (ProtoTree)adaptor.create(TAXONOMY141);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY141_tree, root_0);

            IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1506); 
            IDENTIFIER142_tree = (ProtoTree)adaptor.create(IDENTIFIER142);
            adaptor.addChild(root_0, IDENTIFIER142_tree);

            char_literal143=(Token)match(input,39,FOLLOW_39_in_taxonomy1508); 
            // org/fudgemsg/proto/antlr/Proto.g:257:38: ( taxonomy_element )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IMPORT||LA27_0==IDENTIFIER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:257:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1511);
            	    taxonomy_element144=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element144.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            char_literal145=(Token)match(input,40,FOLLOW_40_in_taxonomy1514); 

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
    // org/fudgemsg/proto/antlr/Proto.g:259:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT147=null;
        Token char_literal149=null;
        ProtoParser.enum_element_return enum_element146 = null;

        ProtoParser.fullidentifier_return fullidentifier148 = null;


        ProtoTree IMPORT147_tree=null;
        ProtoTree char_literal149_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:260:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                alt28=1;
            }
            else if ( (LA28_0==IMPORT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:260:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1525);
                    enum_element146=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element146.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:261:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT147=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1530); 
                    IMPORT147_tree = (ProtoTree)adaptor.create(IMPORT147);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT147_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1533);
                    fullidentifier148=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier148.getTree());
                    char_literal149=(Token)match(input,41,FOLLOW_41_in_taxonomy_element1535); 

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
        "\1\24\32\40\2\uffff\2\40";
    static final String DFA11_maxS =
        "\1\76\31\53\1\77\2\uffff\1\40\1\77";
    static final String DFA11_acceptS =
        "\33\uffff\1\2\1\1\2\uffff";
    static final String DFA11_specialS =
        "\37\uffff}>";
    static final String[] DFA11_transitionS = {
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
            "\1\36",
            "\1\34\12\uffff\1\33\23\uffff\1\35"
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
            return "211:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
 

    public static final BitSet FOLLOW_BINDING_in_binding595 = new BitSet(new long[]{0x000000217FF6F660L});
    public static final BitSet FOLLOW_binding_anyword_in_binding598 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_binding600 = new BitSet(new long[]{0x000001217FF6F660L});
    public static final BitSet FOLLOW_binding_element_in_binding603 = new BitSet(new long[]{0x000001217FF6F660L});
    public static final BitSet FOLLOW_40_in_binding607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_anyword618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINDING_in_binding_anyword623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_binding_anyword628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_binding_anyword633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_binding_anyword638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_binding_anyword643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_binding_anyword648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_binding_anyword653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_binding_anyword658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_binding_anyword663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_binding_anyword668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_binding_anyword673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_binding_anyword678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_binding_anyword683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_binding_anyword688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_binding_anyword693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_binding_anyword698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_binding_anyword703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_binding_anyword708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_binding_anyword713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_binding_anyword718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_binding_anyword723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_anyword728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_anyword_in_binding_element738 = new BitSet(new long[]{0x0000003100000000L});
    public static final BitSet FOLLOW_binding_text_in_binding_element740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_binding_text750 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_binding_text752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ML_STRING_in_binding_text758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_binding_text763 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_binding_text765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_constraint_default776 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_constraint_default779 = new BitSet(new long[]{0x0000002700000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_dimension792 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension794 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_dimension796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_dimension809 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_dimension811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element827 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element830 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_enum_element833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_enum_value843 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_field_constraints864 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints867 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_45_in_field_constraints870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints873 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44_in_field_constraints877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_field_ordinal887 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_field_modifier908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_field_modifier913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_field_modifier918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_field_modifier924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype934 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype936 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_primtype963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_primtype979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_primtype995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_primtype1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_primtype1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_field_primtype1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_field_primtype1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_field_primtype1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_field_primtype1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1216 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_fullidentifier1220 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier1223 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1260 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1263 = new BitSet(new long[]{0x0000008040000400L});
    public static final BitSet FOLLOW_message_uses_in_message1265 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_message_extends_in_message1268 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message1271 = new BitSet(new long[]{0x7FFFC1011FF66220L});
    public static final BitSet FOLLOW_message_element_in_message1274 = new BitSet(new long[]{0x7FFFC1011FF66220L});
    public static final BitSet FOLLOW_40_in_message1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binding_in_message_element1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1313 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1316 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message_enum1318 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1321 = new BitSet(new long[]{0x0000010100000000L});
    public static final BitSet FOLLOW_40_in_message_enum1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1334 = new BitSet(new long[]{0x7FFFC0011FF64000L});
    public static final BitSet FOLLOW_field_type_in_message_field1337 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1339 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1341 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1344 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_message_field1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1375 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1378 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_message_submsg1380 = new BitSet(new long[]{0x7FFFC1011FF66220L});
    public static final BitSet FOLLOW_message_element_in_message_submsg1383 = new BitSet(new long[]{0x7FFFC1011FF66220L});
    public static final BitSet FOLLOW_40_in_message_submsg1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1397 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1400 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_message_uses1403 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1406 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_message_extends1418 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1421 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_message_extends1424 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_extends1427 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1438 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1441 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_namespace1443 = new BitSet(new long[]{0x000001002000A200L});
    public static final BitSet FOLLOW_root_object_in_namespace1446 = new BitSet(new long[]{0x000001002000A200L});
    public static final BitSet FOLLOW_40_in_namespace1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1459 = new BitSet(new long[]{0x000000002000A202L});
    public static final BitSet FOLLOW_message_in_root_object1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1503 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1506 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_taxonomy1508 = new BitSet(new long[]{0x0000010100001000L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1511 = new BitSet(new long[]{0x0000010100001000L});
    public static final BitSet FOLLOW_40_in_taxonomy1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1530 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1533 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_taxonomy_element1535 = new BitSet(new long[]{0x0000000000000002L});

}