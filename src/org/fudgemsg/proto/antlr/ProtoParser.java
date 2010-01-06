// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-06 16:08:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "FIELD", "IMPORT", "MESSAGE", "MUTABLE", "NAMESPACE", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "TAXONOMY", "USES", "COMMENT", "DOC_COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "STRING", "WHITESPACE", "'='", "'['", "']'", "';'", "','", "'optional'", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'", "'{'", "'}'"
    };
    public static final int T_STRING=26;
    public static final int T_BOOL=18;
    public static final int T_DOUBLE=20;
    public static final int FLOAT=33;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T_LONG=24;
    public static final int T__55=55;
    public static final int ML_COMMENT=34;
    public static final int T_INDICATOR=22;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int IMPORT=10;
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
    public static final int DEFAULT=5;
    public static final int ORDINAL=14;
    public static final int T_FLOAT=21;
    public static final int REPEATED=15;
    public static final int WHITESPACE=36;
    public static final int REQUIRED=16;
    public static final int ROOT=17;
    public static final int NAMESPACE=13;
    public static final int DIM_VARIANT=7;
    public static final int ENUM=8;
    public static final int USES=28;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int FIELD=9;
    public static final int T_SHORT=25;
    public static final int MUTABLE=12;
    public static final int STRING=35;

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


    public static class constraint_default_return extends ParserRuleReturnScope {
        ProtoTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constraint_default"
    // org/fudgemsg/proto/antlr/Proto.g:112:1: constraint_default : DEFAULT '=' literal ;
    public final ProtoParser.constraint_default_return constraint_default() throws RecognitionException {
        ProtoParser.constraint_default_return retval = new ProtoParser.constraint_default_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token DEFAULT1=null;
        Token char_literal2=null;
        ProtoParser.literal_return literal3 = null;


        ProtoTree DEFAULT1_tree=null;
        ProtoTree char_literal2_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:112:20: ( DEFAULT '=' literal )
            // org/fudgemsg/proto/antlr/Proto.g:112:22: DEFAULT '=' literal
            {
            root_0 = (ProtoTree)adaptor.nil();

            DEFAULT1=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default544); 
            DEFAULT1_tree = (ProtoTree)adaptor.create(DEFAULT1);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT1_tree, root_0);

            char_literal2=(Token)match(input,37,FOLLOW_37_in_constraint_default547); 
            pushFollow(FOLLOW_literal_in_constraint_default550);
            literal3=literal();

            state._fsp--;

            adaptor.addChild(root_0, literal3.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:114:1: dimension : ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) );
    public final ProtoParser.dimension_return dimension() throws RecognitionException {
        ProtoParser.dimension_return retval = new ProtoParser.dimension_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal4=null;
        Token INTEGER5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        Token char_literal8=null;

        ProtoTree char_literal4_tree=null;
        ProtoTree INTEGER5_tree=null;
        ProtoTree char_literal6_tree=null;
        ProtoTree char_literal7_tree=null;
        ProtoTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:115:2: ( '[' INTEGER ']' -> ^( DIM_FIXED INTEGER ) | '[' ']' -> ^( DIM_VARIANT ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==38) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==INTEGER) ) {
                    alt1=1;
                }
                else if ( (LA1_1==39) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:115:4: '[' INTEGER ']'
                    {
                    char_literal4=(Token)match(input,38,FOLLOW_38_in_dimension560);  
                    stream_38.add(char_literal4);

                    INTEGER5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension562);  
                    stream_INTEGER.add(INTEGER5);

                    char_literal6=(Token)match(input,39,FOLLOW_39_in_dimension564);  
                    stream_39.add(char_literal6);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 115:20: -> ^( DIM_FIXED INTEGER )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:115:23: ^( DIM_FIXED INTEGER )
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
                    // org/fudgemsg/proto/antlr/Proto.g:116:4: '[' ']'
                    {
                    char_literal7=(Token)match(input,38,FOLLOW_38_in_dimension577);  
                    stream_38.add(char_literal7);

                    char_literal8=(Token)match(input,39,FOLLOW_39_in_dimension579);  
                    stream_39.add(char_literal8);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 116:12: -> ^( DIM_VARIANT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:116:15: ^( DIM_VARIANT )
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
    // org/fudgemsg/proto/antlr/Proto.g:119:1: enum_element : IDENTIFIER ( enum_value )? ';' ;
    public final ProtoParser.enum_element_return enum_element() throws RecognitionException {
        ProtoParser.enum_element_return retval = new ProtoParser.enum_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER9=null;
        Token char_literal11=null;
        ProtoParser.enum_value_return enum_value10 = null;


        ProtoTree IDENTIFIER9_tree=null;
        ProtoTree char_literal11_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:119:14: ( IDENTIFIER ( enum_value )? ';' )
            // org/fudgemsg/proto/antlr/Proto.g:119:16: IDENTIFIER ( enum_value )? ';'
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element595); 
            IDENTIFIER9_tree = (ProtoTree)adaptor.create(IDENTIFIER9);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER9_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:119:28: ( enum_value )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==37) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:119:28: enum_value
                    {
                    pushFollow(FOLLOW_enum_value_in_enum_element598);
                    enum_value10=enum_value();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_value10.getTree());

                    }
                    break;

            }

            char_literal11=(Token)match(input,40,FOLLOW_40_in_enum_element601); 

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
    // org/fudgemsg/proto/antlr/Proto.g:121:1: enum_value : '=' INTEGER ;
    public final ProtoParser.enum_value_return enum_value() throws RecognitionException {
        ProtoParser.enum_value_return retval = new ProtoParser.enum_value_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal12=null;
        Token INTEGER13=null;

        ProtoTree char_literal12_tree=null;
        ProtoTree INTEGER13_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:121:12: ( '=' INTEGER )
            // org/fudgemsg/proto/antlr/Proto.g:121:14: '=' INTEGER
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal12=(Token)match(input,37,FOLLOW_37_in_enum_value611); 
            INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value614); 
            INTEGER13_tree = (ProtoTree)adaptor.create(INTEGER13);
            adaptor.addChild(root_0, INTEGER13_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:123:1: field_constraint : constraint_default ;
    public final ProtoParser.field_constraint_return field_constraint() throws RecognitionException {
        ProtoParser.field_constraint_return retval = new ProtoParser.field_constraint_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.constraint_default_return constraint_default14 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:123:18: ( constraint_default )
            // org/fudgemsg/proto/antlr/Proto.g:123:20: constraint_default
            {
            root_0 = (ProtoTree)adaptor.nil();

            pushFollow(FOLLOW_constraint_default_in_field_constraint623);
            constraint_default14=constraint_default();

            state._fsp--;

            adaptor.addChild(root_0, constraint_default14.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:125:1: field_constraints : '[' field_constraint ( ',' field_constraint )* ']' ;
    public final ProtoParser.field_constraints_return field_constraints() throws RecognitionException {
        ProtoParser.field_constraints_return retval = new ProtoParser.field_constraints_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        Token char_literal19=null;
        ProtoParser.field_constraint_return field_constraint16 = null;

        ProtoParser.field_constraint_return field_constraint18 = null;


        ProtoTree char_literal15_tree=null;
        ProtoTree char_literal17_tree=null;
        ProtoTree char_literal19_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:125:19: ( '[' field_constraint ( ',' field_constraint )* ']' )
            // org/fudgemsg/proto/antlr/Proto.g:125:21: '[' field_constraint ( ',' field_constraint )* ']'
            {
            root_0 = (ProtoTree)adaptor.nil();

            char_literal15=(Token)match(input,38,FOLLOW_38_in_field_constraints632); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints635);
            field_constraint16=field_constraint();

            state._fsp--;

            adaptor.addChild(root_0, field_constraint16.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:125:43: ( ',' field_constraint )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:125:44: ',' field_constraint
            	    {
            	    char_literal17=(Token)match(input,41,FOLLOW_41_in_field_constraints638); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints641);
            	    field_constraint18=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint18.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal19=(Token)match(input,39,FOLLOW_39_in_field_constraints645); 

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
    // org/fudgemsg/proto/antlr/Proto.g:127:1: field_ordinal : '=' INTEGER -> ^( ORDINAL INTEGER ) ;
    public final ProtoParser.field_ordinal_return field_ordinal() throws RecognitionException {
        ProtoParser.field_ordinal_return retval = new ProtoParser.field_ordinal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token char_literal20=null;
        Token INTEGER21=null;

        ProtoTree char_literal20_tree=null;
        ProtoTree INTEGER21_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:127:15: ( '=' INTEGER -> ^( ORDINAL INTEGER ) )
            // org/fudgemsg/proto/antlr/Proto.g:127:17: '=' INTEGER
            {
            char_literal20=(Token)match(input,37,FOLLOW_37_in_field_ordinal655);  
            stream_37.add(char_literal20);

            INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal657);  
            stream_INTEGER.add(INTEGER21);



            // AST REWRITE
            // elements: INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 127:29: -> ^( ORDINAL INTEGER )
            {
                // org/fudgemsg/proto/antlr/Proto.g:127:32: ^( ORDINAL INTEGER )
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
    // org/fudgemsg/proto/antlr/Proto.g:130:1: field_modifier : ( MUTABLE | REQUIRED | 'optional' | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MUTABLE22=null;
        Token REQUIRED23=null;
        Token string_literal24=null;
        Token REPEATED25=null;

        ProtoTree MUTABLE22_tree=null;
        ProtoTree REQUIRED23_tree=null;
        ProtoTree string_literal24_tree=null;
        ProtoTree REPEATED25_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:131:2: ( MUTABLE | REQUIRED | 'optional' | REPEATED )
            int alt4=4;
            switch ( input.LA(1) ) {
            case MUTABLE:
                {
                alt4=1;
                }
                break;
            case REQUIRED:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case REPEATED:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:131:4: MUTABLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    MUTABLE22=(Token)match(input,MUTABLE,FOLLOW_MUTABLE_in_field_modifier676); 
                    MUTABLE22_tree = (ProtoTree)adaptor.create(MUTABLE22);
                    adaptor.addChild(root_0, MUTABLE22_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:132:4: REQUIRED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REQUIRED23=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_modifier681); 
                    REQUIRED23_tree = (ProtoTree)adaptor.create(REQUIRED23);
                    adaptor.addChild(root_0, REQUIRED23_tree);


                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:133:4: 'optional'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    string_literal24=(Token)match(input,42,FOLLOW_42_in_field_modifier686); 

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:134:4: REPEATED
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    REPEATED25=(Token)match(input,REPEATED,FOLLOW_REPEATED_in_field_modifier692); 
                    REPEATED25_tree = (ProtoTree)adaptor.create(REPEATED25);
                    adaptor.addChild(root_0, REPEATED25_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:137:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype26 = null;

        ProtoParser.dimension_return dimension27 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:137:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:137:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype702);
            field_basetype26=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype26.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:137:34: ( dimension )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==38) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:137:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype704);
            	    dimension27=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension27.getTree());

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



            // AST REWRITE
            // elements: dimension, field_basetype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 137:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:137:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:139:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL28=null;
        Token string_literal29=null;
        Token T_BYTE30=null;
        Token string_literal31=null;
        Token T_SHORT32=null;
        Token string_literal33=null;
        Token T_INT34=null;
        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token string_literal38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        Token T_LONG41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token string_literal44=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token T_FLOAT47=null;
        Token string_literal48=null;
        Token T_DOUBLE49=null;
        Token string_literal50=null;
        Token T_INDICATOR51=null;
        Token T_STRING52=null;

        ProtoTree T_BOOL28_tree=null;
        ProtoTree string_literal29_tree=null;
        ProtoTree T_BYTE30_tree=null;
        ProtoTree string_literal31_tree=null;
        ProtoTree T_SHORT32_tree=null;
        ProtoTree string_literal33_tree=null;
        ProtoTree T_INT34_tree=null;
        ProtoTree string_literal35_tree=null;
        ProtoTree string_literal36_tree=null;
        ProtoTree string_literal37_tree=null;
        ProtoTree string_literal38_tree=null;
        ProtoTree string_literal39_tree=null;
        ProtoTree string_literal40_tree=null;
        ProtoTree T_LONG41_tree=null;
        ProtoTree string_literal42_tree=null;
        ProtoTree string_literal43_tree=null;
        ProtoTree string_literal44_tree=null;
        ProtoTree string_literal45_tree=null;
        ProtoTree string_literal46_tree=null;
        ProtoTree T_FLOAT47_tree=null;
        ProtoTree string_literal48_tree=null;
        ProtoTree T_DOUBLE49_tree=null;
        ProtoTree string_literal50_tree=null;
        ProtoTree T_INDICATOR51_tree=null;
        ProtoTree T_STRING52_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:140:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING )
            int alt6=25;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt6=1;
                }
                break;
            case 43:
                {
                alt6=2;
                }
                break;
            case T_BYTE:
                {
                alt6=3;
                }
                break;
            case 44:
                {
                alt6=4;
                }
                break;
            case T_SHORT:
                {
                alt6=5;
                }
                break;
            case 45:
                {
                alt6=6;
                }
                break;
            case T_INT:
                {
                alt6=7;
                }
                break;
            case 46:
                {
                alt6=8;
                }
                break;
            case 47:
                {
                alt6=9;
                }
                break;
            case 48:
                {
                alt6=10;
                }
                break;
            case 49:
                {
                alt6=11;
                }
                break;
            case 50:
                {
                alt6=12;
                }
                break;
            case 51:
                {
                alt6=13;
                }
                break;
            case T_LONG:
                {
                alt6=14;
                }
                break;
            case 52:
                {
                alt6=15;
                }
                break;
            case 53:
                {
                alt6=16;
                }
                break;
            case 54:
                {
                alt6=17;
                }
                break;
            case 55:
                {
                alt6=18;
                }
                break;
            case 56:
                {
                alt6=19;
                }
                break;
            case T_FLOAT:
                {
                alt6=20;
                }
                break;
            case 57:
                {
                alt6=21;
                }
                break;
            case T_DOUBLE:
                {
                alt6=22;
                }
                break;
            case 58:
                {
                alt6=23;
                }
                break;
            case T_INDICATOR:
                {
                alt6=24;
                }
                break;
            case T_STRING:
                {
                alt6=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:140:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL28=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype726); 
                    T_BOOL28_tree = (ProtoTree)adaptor.create(T_BOOL28);
                    adaptor.addChild(root_0, T_BOOL28_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:141:4: 'boolean'
                    {
                    string_literal29=(Token)match(input,43,FOLLOW_43_in_field_primtype731);  
                    stream_43.add(string_literal29);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 141:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:141:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:142:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE30=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype742); 
                    T_BYTE30_tree = (ProtoTree)adaptor.create(T_BYTE30);
                    adaptor.addChild(root_0, T_BYTE30_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:143:4: 'int8'
                    {
                    string_literal31=(Token)match(input,44,FOLLOW_44_in_field_primtype747);  
                    stream_44.add(string_literal31);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 143:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:143:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:144:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT32=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype758); 
                    T_SHORT32_tree = (ProtoTree)adaptor.create(T_SHORT32);
                    adaptor.addChild(root_0, T_SHORT32_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:145:4: 'int16'
                    {
                    string_literal33=(Token)match(input,45,FOLLOW_45_in_field_primtype763);  
                    stream_45.add(string_literal33);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 145:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:145:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:146:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT34=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype774); 
                    T_INT34_tree = (ProtoTree)adaptor.create(T_INT34);
                    adaptor.addChild(root_0, T_INT34_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:147:4: 'int32'
                    {
                    string_literal35=(Token)match(input,46,FOLLOW_46_in_field_primtype779);  
                    stream_46.add(string_literal35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 147:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:147:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:148:4: 'uint32'
                    {
                    string_literal36=(Token)match(input,47,FOLLOW_47_in_field_primtype790);  
                    stream_47.add(string_literal36);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 148:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:148:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:149:4: 'sint32'
                    {
                    string_literal37=(Token)match(input,48,FOLLOW_48_in_field_primtype801);  
                    stream_48.add(string_literal37);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 149:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:149:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:150:4: 'fixed32'
                    {
                    string_literal38=(Token)match(input,49,FOLLOW_49_in_field_primtype812);  
                    stream_49.add(string_literal38);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 150:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:150:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:151:4: 'sfixed32'
                    {
                    string_literal39=(Token)match(input,50,FOLLOW_50_in_field_primtype823);  
                    stream_50.add(string_literal39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 151:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:151:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:152:4: 'integer'
                    {
                    string_literal40=(Token)match(input,51,FOLLOW_51_in_field_primtype834);  
                    stream_51.add(string_literal40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 152:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:152:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:153:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG41=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype845); 
                    T_LONG41_tree = (ProtoTree)adaptor.create(T_LONG41);
                    adaptor.addChild(root_0, T_LONG41_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:154:4: 'int64'
                    {
                    string_literal42=(Token)match(input,52,FOLLOW_52_in_field_primtype850);  
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
                    // 154:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:154:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:155:4: 'uint64'
                    {
                    string_literal43=(Token)match(input,53,FOLLOW_53_in_field_primtype861);  
                    stream_53.add(string_literal43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 155:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:155:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:156:4: 'sint64'
                    {
                    string_literal44=(Token)match(input,54,FOLLOW_54_in_field_primtype872);  
                    stream_54.add(string_literal44);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 156:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:156:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:157:4: 'fixed64'
                    {
                    string_literal45=(Token)match(input,55,FOLLOW_55_in_field_primtype883);  
                    stream_55.add(string_literal45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 157:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:157:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:158:4: 'sfixed64'
                    {
                    string_literal46=(Token)match(input,56,FOLLOW_56_in_field_primtype894);  
                    stream_56.add(string_literal46);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 158:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:158:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:159:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT47=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype905); 
                    T_FLOAT47_tree = (ProtoTree)adaptor.create(T_FLOAT47);
                    adaptor.addChild(root_0, T_FLOAT47_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:160:4: 'float32'
                    {
                    string_literal48=(Token)match(input,57,FOLLOW_57_in_field_primtype910);  
                    stream_57.add(string_literal48);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 160:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:160:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:161:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE49=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype921); 
                    T_DOUBLE49_tree = (ProtoTree)adaptor.create(T_DOUBLE49);
                    adaptor.addChild(root_0, T_DOUBLE49_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:162:4: 'float64'
                    {
                    string_literal50=(Token)match(input,58,FOLLOW_58_in_field_primtype926);  
                    stream_58.add(string_literal50);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 162:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:162:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:163:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR51=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype937); 
                    T_INDICATOR51_tree = (ProtoTree)adaptor.create(T_INDICATOR51);
                    adaptor.addChild(root_0, T_INDICATOR51_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:164:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING52=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype942); 
                    T_STRING52_tree = (ProtoTree)adaptor.create(T_STRING52);
                    adaptor.addChild(root_0, T_STRING52_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:167:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype53 = null;

        ProtoParser.fullidentifier_return fullidentifier54 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:168:2: ( field_primtype | fullidentifier )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=T_BOOL && LA7_0<=T_STRING)||(LA7_0>=43 && LA7_0<=58)) ) {
                alt7=1;
            }
            else if ( (LA7_0==IDENTIFIER) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:168:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype953);
                    field_primtype53=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype53.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:169:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype958);
                    fullidentifier54=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier54.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:172:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype55 = null;

        ProtoParser.field_arraytype_return field_arraytype56 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:173:2: ( field_basetype | field_arraytype )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:173:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type969);
                    field_basetype55=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype55.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:174:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type974);
                    field_arraytype56=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype56.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:177:1: fullidentifier : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER57=null;
        Token char_literal58=null;
        Token IDENTIFIER59=null;

        ProtoTree IDENTIFIER57_tree=null;
        ProtoTree char_literal58_tree=null;
        ProtoTree IDENTIFIER59_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:177:16: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // org/fudgemsg/proto/antlr/Proto.g:177:18: IDENTIFIER ( '.' IDENTIFIER )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier984); 
            IDENTIFIER57_tree = (ProtoTree)adaptor.create(IDENTIFIER57);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER57_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:177:30: ( '.' IDENTIFIER )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==59) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:177:31: '.' IDENTIFIER
            	    {
            	    char_literal58=(Token)match(input,59,FOLLOW_59_in_fullidentifier988); 
            	    IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier991); 
            	    IDENTIFIER59_tree = (ProtoTree)adaptor.create(IDENTIFIER59);
            	    adaptor.addChild(root_0, IDENTIFIER59_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // org/fudgemsg/proto/antlr/Proto.g:179:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set60=null;

        ProtoTree set60_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:180:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set60=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set60));
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
    // org/fudgemsg/proto/antlr/Proto.g:186:1: message : MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE61=null;
        Token IDENTIFIER62=null;
        Token char_literal64=null;
        Token char_literal66=null;
        ProtoParser.message_uses_return message_uses63 = null;

        ProtoParser.message_element_return message_element65 = null;


        ProtoTree MESSAGE61_tree=null;
        ProtoTree IDENTIFIER62_tree=null;
        ProtoTree char_literal64_tree=null;
        ProtoTree char_literal66_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:186:9: ( MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:186:11: MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE61=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1028); 
            MESSAGE61_tree = (ProtoTree)adaptor.create(MESSAGE61);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE61_tree, root_0);

            IDENTIFIER62=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1031); 
            IDENTIFIER62_tree = (ProtoTree)adaptor.create(IDENTIFIER62);
            adaptor.addChild(root_0, IDENTIFIER62_tree);

            // org/fudgemsg/proto/antlr/Proto.g:186:31: ( message_uses )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==USES) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:186:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1033);
                    message_uses63=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses63.getTree());

                    }
                    break;

            }

            char_literal64=(Token)match(input,60,FOLLOW_60_in_message1036); 
            // org/fudgemsg/proto/antlr/Proto.g:186:50: ( message_element )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ENUM||(LA11_0>=MESSAGE && LA11_0<=MUTABLE)||(LA11_0>=REPEATED && LA11_0<=REQUIRED)||(LA11_0>=T_BOOL && LA11_0<=T_STRING)||LA11_0==IDENTIFIER||(LA11_0>=42 && LA11_0<=58)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:186:50: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1039);
            	    message_element65=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element65.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal66=(Token)match(input,61,FOLLOW_61_in_message1042); 

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
    // org/fudgemsg/proto/antlr/Proto.g:188:1: message_element : ( message_enum | message_field | message_submsg );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum67 = null;

        ProtoParser.message_field_return message_field68 = null;

        ProtoParser.message_submsg_return message_submsg69 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:189:2: ( message_enum | message_field | message_submsg )
            int alt12=3;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt12=1;
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
            case 42:
            case 43:
            case 44:
            case 45:
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
                {
                alt12=2;
                }
                break;
            case MESSAGE:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:189:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1053);
                    message_enum67=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum67.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:190:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1058);
                    message_field68=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field68.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:191:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1063);
                    message_submsg69=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg69.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:194:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM70=null;
        Token IDENTIFIER71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        ProtoParser.enum_element_return enum_element73 = null;


        ProtoTree ENUM70_tree=null;
        ProtoTree IDENTIFIER71_tree=null;
        ProtoTree char_literal72_tree=null;
        ProtoTree char_literal74_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:194:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:194:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM70=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1073); 
            ENUM70_tree = (ProtoTree)adaptor.create(ENUM70);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM70_tree, root_0);

            IDENTIFIER71=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1076); 
            IDENTIFIER71_tree = (ProtoTree)adaptor.create(IDENTIFIER71);
            adaptor.addChild(root_0, IDENTIFIER71_tree);

            char_literal72=(Token)match(input,60,FOLLOW_60_in_message_enum1078); 
            // org/fudgemsg/proto/antlr/Proto.g:194:38: ( enum_element )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==IDENTIFIER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:194:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1081);
            	    enum_element73=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element73.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            char_literal74=(Token)match(input,61,FOLLOW_61_in_message_enum1084); 

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
    // org/fudgemsg/proto/antlr/Proto.g:196:1: message_field : ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) ;
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER77=null;
        Token char_literal80=null;
        ProtoParser.field_modifier_return field_modifier75 = null;

        ProtoParser.field_type_return field_type76 = null;

        ProtoParser.field_ordinal_return field_ordinal78 = null;

        ProtoParser.field_constraints_return field_constraints79 = null;


        ProtoTree IDENTIFIER77_tree=null;
        ProtoTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:196:15: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            // org/fudgemsg/proto/antlr/Proto.g:196:17: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
            {
            // org/fudgemsg/proto/antlr/Proto.g:196:17: ( field_modifier )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==MUTABLE||(LA14_0>=REPEATED && LA14_0<=REQUIRED)||LA14_0==42) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:196:17: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_message_field1094);
            	    field_modifier75=field_modifier();

            	    state._fsp--;

            	    stream_field_modifier.add(field_modifier75.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            pushFollow(FOLLOW_field_type_in_message_field1097);
            field_type76=field_type();

            state._fsp--;

            stream_field_type.add(field_type76.getTree());
            IDENTIFIER77=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1099);  
            stream_IDENTIFIER.add(IDENTIFIER77);

            // org/fudgemsg/proto/antlr/Proto.g:196:55: ( field_ordinal )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:196:55: field_ordinal
                    {
                    pushFollow(FOLLOW_field_ordinal_in_message_field1101);
                    field_ordinal78=field_ordinal();

                    state._fsp--;

                    stream_field_ordinal.add(field_ordinal78.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:196:70: ( field_constraints )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:196:70: field_constraints
                    {
                    pushFollow(FOLLOW_field_constraints_in_message_field1104);
                    field_constraints79=field_constraints();

                    state._fsp--;

                    stream_field_constraints.add(field_constraints79.getTree());

                    }
                    break;

            }

            char_literal80=(Token)match(input,40,FOLLOW_40_in_message_field1107);  
            stream_40.add(char_literal80);



            // AST REWRITE
            // elements: IDENTIFIER, field_ordinal, field_modifier, field_constraints, field_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 196:93: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
            {
                // org/fudgemsg/proto/antlr/Proto.g:196:96: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_field_type.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // org/fudgemsg/proto/antlr/Proto.g:196:126: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();
                // org/fudgemsg/proto/antlr/Proto.g:196:142: ( field_ordinal )?
                if ( stream_field_ordinal.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                }
                stream_field_ordinal.reset();
                // org/fudgemsg/proto/antlr/Proto.g:196:157: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:198:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE81=null;
        Token IDENTIFIER82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        ProtoParser.message_element_return message_element84 = null;


        ProtoTree MESSAGE81_tree=null;
        ProtoTree IDENTIFIER82_tree=null;
        ProtoTree char_literal83_tree=null;
        ProtoTree char_literal85_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:198:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:198:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE81=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1135); 
            MESSAGE81_tree = (ProtoTree)adaptor.create(MESSAGE81);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE81_tree, root_0);

            IDENTIFIER82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1138); 
            IDENTIFIER82_tree = (ProtoTree)adaptor.create(IDENTIFIER82);
            adaptor.addChild(root_0, IDENTIFIER82_tree);

            char_literal83=(Token)match(input,60,FOLLOW_60_in_message_submsg1140); 
            // org/fudgemsg/proto/antlr/Proto.g:198:43: ( message_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ENUM||(LA17_0>=MESSAGE && LA17_0<=MUTABLE)||(LA17_0>=REPEATED && LA17_0<=REQUIRED)||(LA17_0>=T_BOOL && LA17_0<=T_STRING)||LA17_0==IDENTIFIER||(LA17_0>=42 && LA17_0<=58)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:198:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1143);
            	    message_element84=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element84.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal85=(Token)match(input,61,FOLLOW_61_in_message_submsg1146); 

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
    // org/fudgemsg/proto/antlr/Proto.g:201:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES86=null;
        Token char_literal88=null;
        ProtoParser.fullidentifier_return fullidentifier87 = null;

        ProtoParser.fullidentifier_return fullidentifier89 = null;


        ProtoTree USES86_tree=null;
        ProtoTree char_literal88_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:201:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:201:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES86=(Token)match(input,USES,FOLLOW_USES_in_message_uses1157); 
            USES86_tree = (ProtoTree)adaptor.create(USES86);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES86_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1160);
            fullidentifier87=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier87.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:201:37: ( ',' fullidentifier )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:201:38: ',' fullidentifier
            	    {
            	    char_literal88=(Token)match(input,41,FOLLOW_41_in_message_uses1163); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1166);
            	    fullidentifier89=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier89.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // org/fudgemsg/proto/antlr/Proto.g:203:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        ProtoParser.fullidentifier_return fullidentifier91 = null;

        ProtoParser.root_object_return root_object93 = null;


        ProtoTree NAMESPACE90_tree=null;
        ProtoTree char_literal92_tree=null;
        ProtoTree char_literal94_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:203:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:203:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE90=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1177); 
            NAMESPACE90_tree = (ProtoTree)adaptor.create(NAMESPACE90);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE90_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1180);
            fullidentifier91=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier91.getTree());
            char_literal92=(Token)match(input,60,FOLLOW_60_in_namespace1182); 
            // org/fudgemsg/proto/antlr/Proto.g:203:44: ( root_object )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ENUM||LA19_0==MESSAGE||LA19_0==NAMESPACE||LA19_0==TAXONOMY) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:203:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1185);
            	    root_object93=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object93.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            char_literal94=(Token)match(input,61,FOLLOW_61_in_namespace1188); 

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
    // org/fudgemsg/proto/antlr/Proto.g:205:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object95 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:205:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:205:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:205:8: ( root_object )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ENUM||LA20_0==MESSAGE||LA20_0==NAMESPACE||LA20_0==TAXONOMY) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:205:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1198);
            	    root_object95=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object95.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // 205:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:205:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:205:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:207:1: root_object : ( message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_return message96 = null;

        ProtoParser.message_enum_return message_enum97 = null;

        ProtoParser.namespace_return namespace98 = null;

        ProtoParser.taxonomy_return taxonomy99 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:208:2: ( message | message_enum | namespace | taxonomy )
            int alt21=4;
            switch ( input.LA(1) ) {
            case MESSAGE:
                {
                alt21=1;
                }
                break;
            case ENUM:
                {
                alt21=2;
                }
                break;
            case NAMESPACE:
                {
                alt21=3;
                }
                break;
            case TAXONOMY:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1217);
                    message96=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message96.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:209:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1222);
                    message_enum97=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum97.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:210:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1227);
                    namespace98=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace98.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:211:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1232);
                    taxonomy99=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy99.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:214:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY100=null;
        Token IDENTIFIER101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        ProtoParser.taxonomy_element_return taxonomy_element103 = null;


        ProtoTree TAXONOMY100_tree=null;
        ProtoTree IDENTIFIER101_tree=null;
        ProtoTree char_literal102_tree=null;
        ProtoTree char_literal104_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:214:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:214:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY100=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1242); 
            TAXONOMY100_tree = (ProtoTree)adaptor.create(TAXONOMY100);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY100_tree, root_0);

            IDENTIFIER101=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1245); 
            IDENTIFIER101_tree = (ProtoTree)adaptor.create(IDENTIFIER101);
            adaptor.addChild(root_0, IDENTIFIER101_tree);

            char_literal102=(Token)match(input,60,FOLLOW_60_in_taxonomy1247); 
            // org/fudgemsg/proto/antlr/Proto.g:214:38: ( taxonomy_element )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IMPORT||LA22_0==IDENTIFIER) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:214:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1250);
            	    taxonomy_element103=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element103.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            char_literal104=(Token)match(input,61,FOLLOW_61_in_taxonomy1253); 

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
    // org/fudgemsg/proto/antlr/Proto.g:216:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT106=null;
        Token char_literal108=null;
        ProtoParser.enum_element_return enum_element105 = null;

        ProtoParser.fullidentifier_return fullidentifier107 = null;


        ProtoTree IMPORT106_tree=null;
        ProtoTree char_literal108_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:217:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER) ) {
                alt23=1;
            }
            else if ( (LA23_0==IMPORT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:217:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1264);
                    enum_element105=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element105.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:218:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT106=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1269); 
                    IMPORT106_tree = (ProtoTree)adaptor.create(IMPORT106);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT106_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1272);
                    fullidentifier107=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier107.getTree());
                    char_literal108=(Token)match(input,40,FOLLOW_40_in_taxonomy_element1274); 

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\37\uffff";
    static final String DFA8_eofS =
        "\37\uffff";
    static final String DFA8_minS =
        "\1\22\32\37\2\uffff\2\37";
    static final String DFA8_maxS =
        "\1\72\31\46\1\73\2\uffff\1\37\1\73";
    static final String DFA8_acceptS =
        "\33\uffff\1\1\1\2\2\uffff";
    static final String DFA8_specialS =
        "\37\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\3\1\26\1\24\1\30\1\7\1\16\1\5\1\31\4\uffff\1\32\13\uffff"+
            "\1\2\1\4\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1"+
            "\22\1\23\1\25\1\27",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34",
            "\1\33\6\uffff\1\34\24\uffff\1\35",
            "",
            "",
            "\1\36",
            "\1\33\6\uffff\1\34\24\uffff\1\35"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "172:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
 

    public static final BitSet FOLLOW_DEFAULT_in_constraint_default544 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_constraint_default547 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_dimension560 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension562 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_dimension564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_dimension577 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_dimension579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element595 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element598 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_enum_element601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_enum_value611 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_field_constraints632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints635 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_field_constraints638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints641 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_field_constraints645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_field_ordinal655 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MUTABLE_in_field_modifier676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_field_modifier681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_field_modifier686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEATED_in_field_modifier692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype702 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype704 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_field_primtype731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_field_primtype747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_field_primtype763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_field_primtype779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_primtype790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_primtype801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_primtype812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_primtype823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_primtype834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_field_primtype926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier984 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_fullidentifier988 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier991 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1028 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1031 = new BitSet(new long[]{0x1000000010000000L});
    public static final BitSet FOLLOW_message_uses_in_message1033 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_message1036 = new BitSet(new long[]{0x27FFFC0087FD9900L});
    public static final BitSet FOLLOW_message_element_in_message1039 = new BitSet(new long[]{0x27FFFC0087FD9900L});
    public static final BitSet FOLLOW_61_in_message1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1073 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1076 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_message_enum1078 = new BitSet(new long[]{0x2000000080000000L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1081 = new BitSet(new long[]{0x2000000080000000L});
    public static final BitSet FOLLOW_61_in_message_enum1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1094 = new BitSet(new long[]{0x07FFFC0087FD9000L});
    public static final BitSet FOLLOW_field_type_in_message_field1097 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1099 = new BitSet(new long[]{0x0000016000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1101 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1104 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_message_field1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1135 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1138 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_message_submsg1140 = new BitSet(new long[]{0x27FFFC0087FD9900L});
    public static final BitSet FOLLOW_message_element_in_message_submsg1143 = new BitSet(new long[]{0x27FFFC0087FD9900L});
    public static final BitSet FOLLOW_61_in_message_submsg1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1157 = new BitSet(new long[]{0x07FFF80087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1160 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_message_uses1163 = new BitSet(new long[]{0x07FFF80087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1166 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1177 = new BitSet(new long[]{0x07FFF80087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1180 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_namespace1182 = new BitSet(new long[]{0x2000000008002900L});
    public static final BitSet FOLLOW_root_object_in_namespace1185 = new BitSet(new long[]{0x2000000008002900L});
    public static final BitSet FOLLOW_61_in_namespace1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1198 = new BitSet(new long[]{0x0000000008002902L});
    public static final BitSet FOLLOW_message_in_root_object1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1242 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1245 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_taxonomy1247 = new BitSet(new long[]{0x2000000080000400L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1250 = new BitSet(new long[]{0x2000000080000400L});
    public static final BitSet FOLLOW_61_in_taxonomy1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1269 = new BitSet(new long[]{0x07FFF80087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1272 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_taxonomy_element1274 = new BitSet(new long[]{0x0000000000000002L});

}