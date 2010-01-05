// $ANTLR 3.1.1 org/fudgemsg/proto/antlr/Proto.g 2010-01-04 10:46:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "DEFAULT", "DIM_FIXED", "DIM_VARIANT", "ENUM", "FIELD", "IMPORT", "MESSAGE", "NAMESPACE", "OPTIONAL", "ORDINAL", "REPEATED", "REQUIRED", "ROOT", "T_BOOL", "T_BYTE", "T_DOUBLE", "T_FLOAT", "T_INDICATOR", "T_INT", "T_LONG", "T_SHORT", "T_STRING", "TAXONOMY", "USES", "COMMENT", "DOC_COMMENT", "IDENTIFIER", "INTEGER", "FLOAT", "ML_COMMENT", "STRING", "WHITESPACE", "'='", "'['", "']'", "';'", "','", "'boolean'", "'int8'", "'int16'", "'int32'", "'uint32'", "'sint32'", "'fixed32'", "'sfixed32'", "'integer'", "'int64'", "'uint64'", "'sint64'", "'fixed64'", "'sfixed64'", "'float32'", "'float64'", "'.'", "'{'", "'}'"
    };
    public static final int T_STRING=26;
    public static final int T_BOOL=18;
    public static final int T_DOUBLE=20;
    public static final int FLOAT=33;
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
    public static final int T__44=44;
    public static final int T_BYTE=19;
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
    public static final int NAMESPACE=12;
    public static final int OPTIONAL=13;
    public static final int DIM_VARIANT=7;
    public static final int ENUM=8;
    public static final int USES=28;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int FIELD=9;
    public static final int T_SHORT=25;
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

            DEFAULT1=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_constraint_default543); 
            DEFAULT1_tree = (ProtoTree)adaptor.create(DEFAULT1);
            root_0 = (ProtoTree)adaptor.becomeRoot(DEFAULT1_tree, root_0);

            char_literal2=(Token)match(input,37,FOLLOW_37_in_constraint_default546); 
            pushFollow(FOLLOW_literal_in_constraint_default549);
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
                    char_literal4=(Token)match(input,38,FOLLOW_38_in_dimension559);  
                    stream_38.add(char_literal4);

                    INTEGER5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_dimension561);  
                    stream_INTEGER.add(INTEGER5);

                    char_literal6=(Token)match(input,39,FOLLOW_39_in_dimension563);  
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
                    char_literal7=(Token)match(input,38,FOLLOW_38_in_dimension576);  
                    stream_38.add(char_literal7);

                    char_literal8=(Token)match(input,39,FOLLOW_39_in_dimension578);  
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

            IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_element594); 
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
                    pushFollow(FOLLOW_enum_value_in_enum_element597);
                    enum_value10=enum_value();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_value10.getTree());

                    }
                    break;

            }

            char_literal11=(Token)match(input,40,FOLLOW_40_in_enum_element600); 

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

            char_literal12=(Token)match(input,37,FOLLOW_37_in_enum_value610); 
            INTEGER13=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_enum_value613); 
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

            pushFollow(FOLLOW_constraint_default_in_field_constraint622);
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

            char_literal15=(Token)match(input,38,FOLLOW_38_in_field_constraints631); 
            pushFollow(FOLLOW_field_constraint_in_field_constraints634);
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
            	    char_literal17=(Token)match(input,41,FOLLOW_41_in_field_constraints637); 
            	    pushFollow(FOLLOW_field_constraint_in_field_constraints640);
            	    field_constraint18=field_constraint();

            	    state._fsp--;

            	    adaptor.addChild(root_0, field_constraint18.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal19=(Token)match(input,39,FOLLOW_39_in_field_constraints644); 

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
            char_literal20=(Token)match(input,37,FOLLOW_37_in_field_ordinal654);  
            stream_37.add(char_literal20);

            INTEGER21=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_field_ordinal656);  
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
    // org/fudgemsg/proto/antlr/Proto.g:129:1: field_modifier : ( OPTIONAL | REQUIRED | REPEATED );
    public final ProtoParser.field_modifier_return field_modifier() throws RecognitionException {
        ProtoParser.field_modifier_return retval = new ProtoParser.field_modifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set22=null;

        ProtoTree set22_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:130:2: ( OPTIONAL | REQUIRED | REPEATED )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set22=(Token)input.LT(1);
            if ( input.LA(1)==OPTIONAL||(input.LA(1)>=REPEATED && input.LA(1)<=REQUIRED) ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set22));
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
    // org/fudgemsg/proto/antlr/Proto.g:135:1: field_arraytype : field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) ;
    public final ProtoParser.field_arraytype_return field_arraytype() throws RecognitionException {
        ProtoParser.field_arraytype_return retval = new ProtoParser.field_arraytype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype23 = null;

        ProtoParser.dimension_return dimension24 = null;


        RewriteRuleSubtreeStream stream_field_basetype=new RewriteRuleSubtreeStream(adaptor,"rule field_basetype");
        RewriteRuleSubtreeStream stream_dimension=new RewriteRuleSubtreeStream(adaptor,"rule dimension");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:135:17: ( field_basetype ( dimension )+ -> ^( ARRAY field_basetype ( dimension )+ ) )
            // org/fudgemsg/proto/antlr/Proto.g:135:19: field_basetype ( dimension )+
            {
            pushFollow(FOLLOW_field_basetype_in_field_arraytype694);
            field_basetype23=field_basetype();

            state._fsp--;

            stream_field_basetype.add(field_basetype23.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:135:34: ( dimension )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:135:34: dimension
            	    {
            	    pushFollow(FOLLOW_dimension_in_field_arraytype696);
            	    dimension24=dimension();

            	    state._fsp--;

            	    stream_dimension.add(dimension24.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // 135:45: -> ^( ARRAY field_basetype ( dimension )+ )
            {
                // org/fudgemsg/proto/antlr/Proto.g:135:48: ^( ARRAY field_basetype ( dimension )+ )
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
    // org/fudgemsg/proto/antlr/Proto.g:137:1: field_primtype : ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING );
    public final ProtoParser.field_primtype_return field_primtype() throws RecognitionException {
        ProtoParser.field_primtype_return retval = new ProtoParser.field_primtype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token T_BOOL25=null;
        Token string_literal26=null;
        Token T_BYTE27=null;
        Token string_literal28=null;
        Token T_SHORT29=null;
        Token string_literal30=null;
        Token T_INT31=null;
        Token string_literal32=null;
        Token string_literal33=null;
        Token string_literal34=null;
        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token T_LONG38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token T_FLOAT44=null;
        Token string_literal45=null;
        Token T_DOUBLE46=null;
        Token string_literal47=null;
        Token T_INDICATOR48=null;
        Token T_STRING49=null;

        ProtoTree T_BOOL25_tree=null;
        ProtoTree string_literal26_tree=null;
        ProtoTree T_BYTE27_tree=null;
        ProtoTree string_literal28_tree=null;
        ProtoTree T_SHORT29_tree=null;
        ProtoTree string_literal30_tree=null;
        ProtoTree T_INT31_tree=null;
        ProtoTree string_literal32_tree=null;
        ProtoTree string_literal33_tree=null;
        ProtoTree string_literal34_tree=null;
        ProtoTree string_literal35_tree=null;
        ProtoTree string_literal36_tree=null;
        ProtoTree string_literal37_tree=null;
        ProtoTree T_LONG38_tree=null;
        ProtoTree string_literal39_tree=null;
        ProtoTree string_literal40_tree=null;
        ProtoTree string_literal41_tree=null;
        ProtoTree string_literal42_tree=null;
        ProtoTree string_literal43_tree=null;
        ProtoTree T_FLOAT44_tree=null;
        ProtoTree string_literal45_tree=null;
        ProtoTree T_DOUBLE46_tree=null;
        ProtoTree string_literal47_tree=null;
        ProtoTree T_INDICATOR48_tree=null;
        ProtoTree T_STRING49_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // org/fudgemsg/proto/antlr/Proto.g:138:2: ( T_BOOL | 'boolean' -> ^( T_BOOL ) | T_BYTE | 'int8' -> ^( T_BYTE ) | T_SHORT | 'int16' -> ^( T_SHORT ) | T_INT | 'int32' -> ^( T_INT ) | 'uint32' -> ^( T_INT ) | 'sint32' -> ^( T_INT ) | 'fixed32' -> ^( T_INT ) | 'sfixed32' -> ^( T_INT ) | 'integer' -> ^( T_INT ) | T_LONG | 'int64' -> ^( T_LONG ) | 'uint64' -> ^( T_LONG ) | 'sint64' -> ^( T_LONG ) | 'fixed64' -> ^( T_LONG ) | 'sfixed64' -> ^( T_LONG ) | T_FLOAT | 'float32' -> ^( T_FLOAT ) | T_DOUBLE | 'float64' -> ^( T_DOUBLE ) | T_INDICATOR | T_STRING )
            int alt5=25;
            switch ( input.LA(1) ) {
            case T_BOOL:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case T_BYTE:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case T_SHORT:
                {
                alt5=5;
                }
                break;
            case 44:
                {
                alt5=6;
                }
                break;
            case T_INT:
                {
                alt5=7;
                }
                break;
            case 45:
                {
                alt5=8;
                }
                break;
            case 46:
                {
                alt5=9;
                }
                break;
            case 47:
                {
                alt5=10;
                }
                break;
            case 48:
                {
                alt5=11;
                }
                break;
            case 49:
                {
                alt5=12;
                }
                break;
            case 50:
                {
                alt5=13;
                }
                break;
            case T_LONG:
                {
                alt5=14;
                }
                break;
            case 51:
                {
                alt5=15;
                }
                break;
            case 52:
                {
                alt5=16;
                }
                break;
            case 53:
                {
                alt5=17;
                }
                break;
            case 54:
                {
                alt5=18;
                }
                break;
            case 55:
                {
                alt5=19;
                }
                break;
            case T_FLOAT:
                {
                alt5=20;
                }
                break;
            case 56:
                {
                alt5=21;
                }
                break;
            case T_DOUBLE:
                {
                alt5=22;
                }
                break;
            case 57:
                {
                alt5=23;
                }
                break;
            case T_INDICATOR:
                {
                alt5=24;
                }
                break;
            case T_STRING:
                {
                alt5=25;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:138:4: T_BOOL
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BOOL25=(Token)match(input,T_BOOL,FOLLOW_T_BOOL_in_field_primtype718); 
                    T_BOOL25_tree = (ProtoTree)adaptor.create(T_BOOL25);
                    adaptor.addChild(root_0, T_BOOL25_tree);


                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:139:4: 'boolean'
                    {
                    string_literal26=(Token)match(input,42,FOLLOW_42_in_field_primtype723);  
                    stream_42.add(string_literal26);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 139:14: -> ^( T_BOOL )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:139:17: ^( T_BOOL )
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
                    // org/fudgemsg/proto/antlr/Proto.g:140:4: T_BYTE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_BYTE27=(Token)match(input,T_BYTE,FOLLOW_T_BYTE_in_field_primtype734); 
                    T_BYTE27_tree = (ProtoTree)adaptor.create(T_BYTE27);
                    adaptor.addChild(root_0, T_BYTE27_tree);


                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:141:4: 'int8'
                    {
                    string_literal28=(Token)match(input,43,FOLLOW_43_in_field_primtype739);  
                    stream_43.add(string_literal28);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 141:11: -> ^( T_BYTE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:141:14: ^( T_BYTE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:142:4: T_SHORT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_SHORT29=(Token)match(input,T_SHORT,FOLLOW_T_SHORT_in_field_primtype750); 
                    T_SHORT29_tree = (ProtoTree)adaptor.create(T_SHORT29);
                    adaptor.addChild(root_0, T_SHORT29_tree);


                    }
                    break;
                case 6 :
                    // org/fudgemsg/proto/antlr/Proto.g:143:4: 'int16'
                    {
                    string_literal30=(Token)match(input,44,FOLLOW_44_in_field_primtype755);  
                    stream_44.add(string_literal30);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 143:12: -> ^( T_SHORT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:143:15: ^( T_SHORT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:144:4: T_INT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INT31=(Token)match(input,T_INT,FOLLOW_T_INT_in_field_primtype766); 
                    T_INT31_tree = (ProtoTree)adaptor.create(T_INT31);
                    adaptor.addChild(root_0, T_INT31_tree);


                    }
                    break;
                case 8 :
                    // org/fudgemsg/proto/antlr/Proto.g:145:4: 'int32'
                    {
                    string_literal32=(Token)match(input,45,FOLLOW_45_in_field_primtype771);  
                    stream_45.add(string_literal32);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 145:12: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:145:15: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:146:4: 'uint32'
                    {
                    string_literal33=(Token)match(input,46,FOLLOW_46_in_field_primtype782);  
                    stream_46.add(string_literal33);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 146:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:146:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:147:4: 'sint32'
                    {
                    string_literal34=(Token)match(input,47,FOLLOW_47_in_field_primtype793);  
                    stream_47.add(string_literal34);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 147:13: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:147:16: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:148:4: 'fixed32'
                    {
                    string_literal35=(Token)match(input,48,FOLLOW_48_in_field_primtype804);  
                    stream_48.add(string_literal35);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 148:14: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:148:17: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:149:4: 'sfixed32'
                    {
                    string_literal36=(Token)match(input,49,FOLLOW_49_in_field_primtype815);  
                    stream_49.add(string_literal36);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 149:15: -> ^( T_INT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:149:18: ^( T_INT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:150:4: 'integer'
                    {
                    string_literal37=(Token)match(input,50,FOLLOW_50_in_field_primtype826);  
                    stream_50.add(string_literal37);



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
                case 14 :
                    // org/fudgemsg/proto/antlr/Proto.g:151:4: T_LONG
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_LONG38=(Token)match(input,T_LONG,FOLLOW_T_LONG_in_field_primtype837); 
                    T_LONG38_tree = (ProtoTree)adaptor.create(T_LONG38);
                    adaptor.addChild(root_0, T_LONG38_tree);


                    }
                    break;
                case 15 :
                    // org/fudgemsg/proto/antlr/Proto.g:152:4: 'int64'
                    {
                    string_literal39=(Token)match(input,51,FOLLOW_51_in_field_primtype842);  
                    stream_51.add(string_literal39);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 152:12: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:152:15: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:153:4: 'uint64'
                    {
                    string_literal40=(Token)match(input,52,FOLLOW_52_in_field_primtype853);  
                    stream_52.add(string_literal40);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 153:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:153:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:154:4: 'sint64'
                    {
                    string_literal41=(Token)match(input,53,FOLLOW_53_in_field_primtype864);  
                    stream_53.add(string_literal41);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 154:13: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:154:16: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:155:4: 'fixed64'
                    {
                    string_literal42=(Token)match(input,54,FOLLOW_54_in_field_primtype875);  
                    stream_54.add(string_literal42);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 155:14: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:155:17: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:156:4: 'sfixed64'
                    {
                    string_literal43=(Token)match(input,55,FOLLOW_55_in_field_primtype886);  
                    stream_55.add(string_literal43);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 156:15: -> ^( T_LONG )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:156:18: ^( T_LONG )
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
                    // org/fudgemsg/proto/antlr/Proto.g:157:4: T_FLOAT
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_FLOAT44=(Token)match(input,T_FLOAT,FOLLOW_T_FLOAT_in_field_primtype897); 
                    T_FLOAT44_tree = (ProtoTree)adaptor.create(T_FLOAT44);
                    adaptor.addChild(root_0, T_FLOAT44_tree);


                    }
                    break;
                case 21 :
                    // org/fudgemsg/proto/antlr/Proto.g:158:4: 'float32'
                    {
                    string_literal45=(Token)match(input,56,FOLLOW_56_in_field_primtype902);  
                    stream_56.add(string_literal45);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 158:14: -> ^( T_FLOAT )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:158:17: ^( T_FLOAT )
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
                    // org/fudgemsg/proto/antlr/Proto.g:159:4: T_DOUBLE
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_DOUBLE46=(Token)match(input,T_DOUBLE,FOLLOW_T_DOUBLE_in_field_primtype913); 
                    T_DOUBLE46_tree = (ProtoTree)adaptor.create(T_DOUBLE46);
                    adaptor.addChild(root_0, T_DOUBLE46_tree);


                    }
                    break;
                case 23 :
                    // org/fudgemsg/proto/antlr/Proto.g:160:4: 'float64'
                    {
                    string_literal47=(Token)match(input,57,FOLLOW_57_in_field_primtype918);  
                    stream_57.add(string_literal47);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (ProtoTree)adaptor.nil();
                    // 160:14: -> ^( T_DOUBLE )
                    {
                        // org/fudgemsg/proto/antlr/Proto.g:160:17: ^( T_DOUBLE )
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
                    // org/fudgemsg/proto/antlr/Proto.g:161:4: T_INDICATOR
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_INDICATOR48=(Token)match(input,T_INDICATOR,FOLLOW_T_INDICATOR_in_field_primtype929); 
                    T_INDICATOR48_tree = (ProtoTree)adaptor.create(T_INDICATOR48);
                    adaptor.addChild(root_0, T_INDICATOR48_tree);


                    }
                    break;
                case 25 :
                    // org/fudgemsg/proto/antlr/Proto.g:162:4: T_STRING
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    T_STRING49=(Token)match(input,T_STRING,FOLLOW_T_STRING_in_field_primtype934); 
                    T_STRING49_tree = (ProtoTree)adaptor.create(T_STRING49);
                    adaptor.addChild(root_0, T_STRING49_tree);


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
    // org/fudgemsg/proto/antlr/Proto.g:165:1: field_basetype : ( field_primtype | fullidentifier );
    public final ProtoParser.field_basetype_return field_basetype() throws RecognitionException {
        ProtoParser.field_basetype_return retval = new ProtoParser.field_basetype_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_primtype_return field_primtype50 = null;

        ProtoParser.fullidentifier_return fullidentifier51 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:166:2: ( field_primtype | fullidentifier )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=T_BOOL && LA6_0<=T_STRING)||(LA6_0>=42 && LA6_0<=57)) ) {
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
                    // org/fudgemsg/proto/antlr/Proto.g:166:4: field_primtype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_primtype_in_field_basetype945);
                    field_primtype50=field_primtype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_primtype50.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:167:4: fullidentifier
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_fullidentifier_in_field_basetype950);
                    fullidentifier51=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier51.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:170:1: field_type : ( field_basetype | field_arraytype );
    public final ProtoParser.field_type_return field_type() throws RecognitionException {
        ProtoParser.field_type_return retval = new ProtoParser.field_type_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.field_basetype_return field_basetype52 = null;

        ProtoParser.field_arraytype_return field_arraytype53 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:171:2: ( field_basetype | field_arraytype )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:171:4: field_basetype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_basetype_in_field_type961);
                    field_basetype52=field_basetype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_basetype52.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:172:4: field_arraytype
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_field_arraytype_in_field_type966);
                    field_arraytype53=field_arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, field_arraytype53.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:175:1: fullidentifier : IDENTIFIER ( '.' IDENTIFIER )* ;
    public final ProtoParser.fullidentifier_return fullidentifier() throws RecognitionException {
        ProtoParser.fullidentifier_return retval = new ProtoParser.fullidentifier_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER54=null;
        Token char_literal55=null;
        Token IDENTIFIER56=null;

        ProtoTree IDENTIFIER54_tree=null;
        ProtoTree char_literal55_tree=null;
        ProtoTree IDENTIFIER56_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:175:16: ( IDENTIFIER ( '.' IDENTIFIER )* )
            // org/fudgemsg/proto/antlr/Proto.g:175:18: IDENTIFIER ( '.' IDENTIFIER )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            IDENTIFIER54=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier976); 
            IDENTIFIER54_tree = (ProtoTree)adaptor.create(IDENTIFIER54);
            root_0 = (ProtoTree)adaptor.becomeRoot(IDENTIFIER54_tree, root_0);

            // org/fudgemsg/proto/antlr/Proto.g:175:30: ( '.' IDENTIFIER )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==58) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:175:31: '.' IDENTIFIER
            	    {
            	    char_literal55=(Token)match(input,58,FOLLOW_58_in_fullidentifier980); 
            	    IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fullidentifier983); 
            	    IDENTIFIER56_tree = (ProtoTree)adaptor.create(IDENTIFIER56);
            	    adaptor.addChild(root_0, IDENTIFIER56_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // org/fudgemsg/proto/antlr/Proto.g:177:1: literal : ( IDENTIFIER | INTEGER | FLOAT | STRING );
    public final ProtoParser.literal_return literal() throws RecognitionException {
        ProtoParser.literal_return retval = new ProtoParser.literal_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token set57=null;

        ProtoTree set57_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:178:2: ( IDENTIFIER | INTEGER | FLOAT | STRING )
            // org/fudgemsg/proto/antlr/Proto.g:
            {
            root_0 = (ProtoTree)adaptor.nil();

            set57=(Token)input.LT(1);
            if ( (input.LA(1)>=IDENTIFIER && input.LA(1)<=FLOAT)||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, (ProtoTree)adaptor.create(set57));
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
    // org/fudgemsg/proto/antlr/Proto.g:184:1: message : MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' ;
    public final ProtoParser.message_return message() throws RecognitionException {
        ProtoParser.message_return retval = new ProtoParser.message_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE58=null;
        Token IDENTIFIER59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        ProtoParser.message_uses_return message_uses60 = null;

        ProtoParser.message_element_return message_element62 = null;


        ProtoTree MESSAGE58_tree=null;
        ProtoTree IDENTIFIER59_tree=null;
        ProtoTree char_literal61_tree=null;
        ProtoTree char_literal63_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:184:9: ( MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:184:11: MESSAGE IDENTIFIER ( message_uses )? '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE58=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message1020); 
            MESSAGE58_tree = (ProtoTree)adaptor.create(MESSAGE58);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE58_tree, root_0);

            IDENTIFIER59=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message1023); 
            IDENTIFIER59_tree = (ProtoTree)adaptor.create(IDENTIFIER59);
            adaptor.addChild(root_0, IDENTIFIER59_tree);

            // org/fudgemsg/proto/antlr/Proto.g:184:31: ( message_uses )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==USES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:184:31: message_uses
                    {
                    pushFollow(FOLLOW_message_uses_in_message1025);
                    message_uses60=message_uses();

                    state._fsp--;

                    adaptor.addChild(root_0, message_uses60.getTree());

                    }
                    break;

            }

            char_literal61=(Token)match(input,59,FOLLOW_59_in_message1028); 
            // org/fudgemsg/proto/antlr/Proto.g:184:50: ( message_element )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ENUM||LA10_0==MESSAGE||LA10_0==OPTIONAL||(LA10_0>=REPEATED && LA10_0<=REQUIRED)||(LA10_0>=T_BOOL && LA10_0<=T_STRING)||LA10_0==IDENTIFIER||(LA10_0>=42 && LA10_0<=57)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:184:50: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message1031);
            	    message_element62=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element62.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            char_literal63=(Token)match(input,60,FOLLOW_60_in_message1034); 

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
    // org/fudgemsg/proto/antlr/Proto.g:186:1: message_element : ( message_enum | message_field | message_submsg );
    public final ProtoParser.message_element_return message_element() throws RecognitionException {
        ProtoParser.message_element_return retval = new ProtoParser.message_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_enum_return message_enum64 = null;

        ProtoParser.message_field_return message_field65 = null;

        ProtoParser.message_submsg_return message_submsg66 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:187:2: ( message_enum | message_field | message_submsg )
            int alt11=3;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                alt11=1;
                }
                break;
            case OPTIONAL:
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
                {
                alt11=2;
                }
                break;
            case MESSAGE:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:187:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_message_element1045);
                    message_enum64=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum64.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:188:4: message_field
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_field_in_message_element1050);
                    message_field65=message_field();

                    state._fsp--;

                    adaptor.addChild(root_0, message_field65.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:189:4: message_submsg
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_submsg_in_message_element1055);
                    message_submsg66=message_submsg();

                    state._fsp--;

                    adaptor.addChild(root_0, message_submsg66.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:192:1: message_enum : ENUM IDENTIFIER '{' ( enum_element )* '}' ;
    public final ProtoParser.message_enum_return message_enum() throws RecognitionException {
        ProtoParser.message_enum_return retval = new ProtoParser.message_enum_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token ENUM67=null;
        Token IDENTIFIER68=null;
        Token char_literal69=null;
        Token char_literal71=null;
        ProtoParser.enum_element_return enum_element70 = null;


        ProtoTree ENUM67_tree=null;
        ProtoTree IDENTIFIER68_tree=null;
        ProtoTree char_literal69_tree=null;
        ProtoTree char_literal71_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:192:14: ( ENUM IDENTIFIER '{' ( enum_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:192:16: ENUM IDENTIFIER '{' ( enum_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            ENUM67=(Token)match(input,ENUM,FOLLOW_ENUM_in_message_enum1065); 
            ENUM67_tree = (ProtoTree)adaptor.create(ENUM67);
            root_0 = (ProtoTree)adaptor.becomeRoot(ENUM67_tree, root_0);

            IDENTIFIER68=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_enum1068); 
            IDENTIFIER68_tree = (ProtoTree)adaptor.create(IDENTIFIER68);
            adaptor.addChild(root_0, IDENTIFIER68_tree);

            char_literal69=(Token)match(input,59,FOLLOW_59_in_message_enum1070); 
            // org/fudgemsg/proto/antlr/Proto.g:192:38: ( enum_element )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENTIFIER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:192:38: enum_element
            	    {
            	    pushFollow(FOLLOW_enum_element_in_message_enum1073);
            	    enum_element70=enum_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, enum_element70.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            char_literal71=(Token)match(input,60,FOLLOW_60_in_message_enum1076); 

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
    // org/fudgemsg/proto/antlr/Proto.g:194:1: message_field : ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) ;
    public final ProtoParser.message_field_return message_field() throws RecognitionException {
        ProtoParser.message_field_return retval = new ProtoParser.message_field_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IDENTIFIER74=null;
        Token char_literal77=null;
        ProtoParser.field_modifier_return field_modifier72 = null;

        ProtoParser.field_type_return field_type73 = null;

        ProtoParser.field_ordinal_return field_ordinal75 = null;

        ProtoParser.field_constraints_return field_constraints76 = null;


        ProtoTree IDENTIFIER74_tree=null;
        ProtoTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
        RewriteRuleSubtreeStream stream_field_modifier=new RewriteRuleSubtreeStream(adaptor,"rule field_modifier");
        RewriteRuleSubtreeStream stream_field_constraints=new RewriteRuleSubtreeStream(adaptor,"rule field_constraints");
        RewriteRuleSubtreeStream stream_field_ordinal=new RewriteRuleSubtreeStream(adaptor,"rule field_ordinal");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:194:15: ( ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';' -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? ) )
            // org/fudgemsg/proto/antlr/Proto.g:194:17: ( field_modifier )* field_type IDENTIFIER ( field_ordinal )? ( field_constraints )? ';'
            {
            // org/fudgemsg/proto/antlr/Proto.g:194:17: ( field_modifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==OPTIONAL||(LA13_0>=REPEATED && LA13_0<=REQUIRED)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:194:17: field_modifier
            	    {
            	    pushFollow(FOLLOW_field_modifier_in_message_field1086);
            	    field_modifier72=field_modifier();

            	    state._fsp--;

            	    stream_field_modifier.add(field_modifier72.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_field_type_in_message_field1089);
            field_type73=field_type();

            state._fsp--;

            stream_field_type.add(field_type73.getTree());
            IDENTIFIER74=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_field1091);  
            stream_IDENTIFIER.add(IDENTIFIER74);

            // org/fudgemsg/proto/antlr/Proto.g:194:55: ( field_ordinal )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:194:55: field_ordinal
                    {
                    pushFollow(FOLLOW_field_ordinal_in_message_field1093);
                    field_ordinal75=field_ordinal();

                    state._fsp--;

                    stream_field_ordinal.add(field_ordinal75.getTree());

                    }
                    break;

            }

            // org/fudgemsg/proto/antlr/Proto.g:194:70: ( field_constraints )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:194:70: field_constraints
                    {
                    pushFollow(FOLLOW_field_constraints_in_message_field1096);
                    field_constraints76=field_constraints();

                    state._fsp--;

                    stream_field_constraints.add(field_constraints76.getTree());

                    }
                    break;

            }

            char_literal77=(Token)match(input,40,FOLLOW_40_in_message_field1099);  
            stream_40.add(char_literal77);



            // AST REWRITE
            // elements: field_type, field_modifier, IDENTIFIER, field_ordinal, field_constraints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (ProtoTree)adaptor.nil();
            // 194:93: -> ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
            {
                // org/fudgemsg/proto/antlr/Proto.g:194:96: ^( FIELD field_type IDENTIFIER ( field_modifier )* ( field_ordinal )? ( field_constraints )? )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_field_type.nextTree());
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // org/fudgemsg/proto/antlr/Proto.g:194:126: ( field_modifier )*
                while ( stream_field_modifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_modifier.nextTree());

                }
                stream_field_modifier.reset();
                // org/fudgemsg/proto/antlr/Proto.g:194:142: ( field_ordinal )?
                if ( stream_field_ordinal.hasNext() ) {
                    adaptor.addChild(root_1, stream_field_ordinal.nextTree());

                }
                stream_field_ordinal.reset();
                // org/fudgemsg/proto/antlr/Proto.g:194:157: ( field_constraints )?
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
    // org/fudgemsg/proto/antlr/Proto.g:196:1: message_submsg : MESSAGE IDENTIFIER '{' ( message_element )* '}' ;
    public final ProtoParser.message_submsg_return message_submsg() throws RecognitionException {
        ProtoParser.message_submsg_return retval = new ProtoParser.message_submsg_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token MESSAGE78=null;
        Token IDENTIFIER79=null;
        Token char_literal80=null;
        Token char_literal82=null;
        ProtoParser.message_element_return message_element81 = null;


        ProtoTree MESSAGE78_tree=null;
        ProtoTree IDENTIFIER79_tree=null;
        ProtoTree char_literal80_tree=null;
        ProtoTree char_literal82_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:196:16: ( MESSAGE IDENTIFIER '{' ( message_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:196:18: MESSAGE IDENTIFIER '{' ( message_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            MESSAGE78=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_submsg1127); 
            MESSAGE78_tree = (ProtoTree)adaptor.create(MESSAGE78);
            root_0 = (ProtoTree)adaptor.becomeRoot(MESSAGE78_tree, root_0);

            IDENTIFIER79=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_message_submsg1130); 
            IDENTIFIER79_tree = (ProtoTree)adaptor.create(IDENTIFIER79);
            adaptor.addChild(root_0, IDENTIFIER79_tree);

            char_literal80=(Token)match(input,59,FOLLOW_59_in_message_submsg1132); 
            // org/fudgemsg/proto/antlr/Proto.g:196:43: ( message_element )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ENUM||LA16_0==MESSAGE||LA16_0==OPTIONAL||(LA16_0>=REPEATED && LA16_0<=REQUIRED)||(LA16_0>=T_BOOL && LA16_0<=T_STRING)||LA16_0==IDENTIFIER||(LA16_0>=42 && LA16_0<=57)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:196:43: message_element
            	    {
            	    pushFollow(FOLLOW_message_element_in_message_submsg1135);
            	    message_element81=message_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, message_element81.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            char_literal82=(Token)match(input,60,FOLLOW_60_in_message_submsg1138); 

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
    // org/fudgemsg/proto/antlr/Proto.g:198:1: message_uses : USES fullidentifier ( ',' fullidentifier )* ;
    public final ProtoParser.message_uses_return message_uses() throws RecognitionException {
        ProtoParser.message_uses_return retval = new ProtoParser.message_uses_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token USES83=null;
        Token char_literal85=null;
        ProtoParser.fullidentifier_return fullidentifier84 = null;

        ProtoParser.fullidentifier_return fullidentifier86 = null;


        ProtoTree USES83_tree=null;
        ProtoTree char_literal85_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:198:14: ( USES fullidentifier ( ',' fullidentifier )* )
            // org/fudgemsg/proto/antlr/Proto.g:198:16: USES fullidentifier ( ',' fullidentifier )*
            {
            root_0 = (ProtoTree)adaptor.nil();

            USES83=(Token)match(input,USES,FOLLOW_USES_in_message_uses1148); 
            USES83_tree = (ProtoTree)adaptor.create(USES83);
            root_0 = (ProtoTree)adaptor.becomeRoot(USES83_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_message_uses1151);
            fullidentifier84=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier84.getTree());
            // org/fudgemsg/proto/antlr/Proto.g:198:37: ( ',' fullidentifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:198:38: ',' fullidentifier
            	    {
            	    char_literal85=(Token)match(input,41,FOLLOW_41_in_message_uses1154); 
            	    pushFollow(FOLLOW_fullidentifier_in_message_uses1157);
            	    fullidentifier86=fullidentifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fullidentifier86.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // org/fudgemsg/proto/antlr/Proto.g:200:1: namespace : NAMESPACE fullidentifier '{' ( root_object )* '}' ;
    public final ProtoParser.namespace_return namespace() throws RecognitionException {
        ProtoParser.namespace_return retval = new ProtoParser.namespace_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token NAMESPACE87=null;
        Token char_literal89=null;
        Token char_literal91=null;
        ProtoParser.fullidentifier_return fullidentifier88 = null;

        ProtoParser.root_object_return root_object90 = null;


        ProtoTree NAMESPACE87_tree=null;
        ProtoTree char_literal89_tree=null;
        ProtoTree char_literal91_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:200:11: ( NAMESPACE fullidentifier '{' ( root_object )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:200:13: NAMESPACE fullidentifier '{' ( root_object )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            NAMESPACE87=(Token)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace1168); 
            NAMESPACE87_tree = (ProtoTree)adaptor.create(NAMESPACE87);
            root_0 = (ProtoTree)adaptor.becomeRoot(NAMESPACE87_tree, root_0);

            pushFollow(FOLLOW_fullidentifier_in_namespace1171);
            fullidentifier88=fullidentifier();

            state._fsp--;

            adaptor.addChild(root_0, fullidentifier88.getTree());
            char_literal89=(Token)match(input,59,FOLLOW_59_in_namespace1173); 
            // org/fudgemsg/proto/antlr/Proto.g:200:44: ( root_object )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ENUM||(LA18_0>=MESSAGE && LA18_0<=NAMESPACE)||LA18_0==TAXONOMY) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:200:44: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_namespace1176);
            	    root_object90=root_object();

            	    state._fsp--;

            	    adaptor.addChild(root_0, root_object90.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            char_literal91=(Token)match(input,60,FOLLOW_60_in_namespace1179); 

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
    // org/fudgemsg/proto/antlr/Proto.g:202:1: root : ( root_object )* -> ^( ROOT ( root_object )* ) ;
    public final ProtoParser.root_return root() throws RecognitionException {
        ProtoParser.root_return retval = new ProtoParser.root_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.root_object_return root_object92 = null;


        RewriteRuleSubtreeStream stream_root_object=new RewriteRuleSubtreeStream(adaptor,"rule root_object");
        try {
            // org/fudgemsg/proto/antlr/Proto.g:202:6: ( ( root_object )* -> ^( ROOT ( root_object )* ) )
            // org/fudgemsg/proto/antlr/Proto.g:202:8: ( root_object )*
            {
            // org/fudgemsg/proto/antlr/Proto.g:202:8: ( root_object )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ENUM||(LA19_0>=MESSAGE && LA19_0<=NAMESPACE)||LA19_0==TAXONOMY) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:202:8: root_object
            	    {
            	    pushFollow(FOLLOW_root_object_in_root1189);
            	    root_object92=root_object();

            	    state._fsp--;

            	    stream_root_object.add(root_object92.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // 202:21: -> ^( ROOT ( root_object )* )
            {
                // org/fudgemsg/proto/antlr/Proto.g:202:24: ^( ROOT ( root_object )* )
                {
                ProtoTree root_1 = (ProtoTree)adaptor.nil();
                root_1 = (ProtoTree)adaptor.becomeRoot((ProtoTree)adaptor.create(ROOT, "ROOT"), root_1);

                // org/fudgemsg/proto/antlr/Proto.g:202:31: ( root_object )*
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
    // org/fudgemsg/proto/antlr/Proto.g:204:1: root_object : ( message | message_enum | namespace | taxonomy );
    public final ProtoParser.root_object_return root_object() throws RecognitionException {
        ProtoParser.root_object_return retval = new ProtoParser.root_object_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        ProtoParser.message_return message93 = null;

        ProtoParser.message_enum_return message_enum94 = null;

        ProtoParser.namespace_return namespace95 = null;

        ProtoParser.taxonomy_return taxonomy96 = null;



        try {
            // org/fudgemsg/proto/antlr/Proto.g:205:2: ( message | message_enum | namespace | taxonomy )
            int alt20=4;
            switch ( input.LA(1) ) {
            case MESSAGE:
                {
                alt20=1;
                }
                break;
            case ENUM:
                {
                alt20=2;
                }
                break;
            case NAMESPACE:
                {
                alt20=3;
                }
                break;
            case TAXONOMY:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:205:4: message
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_in_root_object1208);
                    message93=message();

                    state._fsp--;

                    adaptor.addChild(root_0, message93.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:206:4: message_enum
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_message_enum_in_root_object1213);
                    message_enum94=message_enum();

                    state._fsp--;

                    adaptor.addChild(root_0, message_enum94.getTree());

                    }
                    break;
                case 3 :
                    // org/fudgemsg/proto/antlr/Proto.g:207:4: namespace
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_namespace_in_root_object1218);
                    namespace95=namespace();

                    state._fsp--;

                    adaptor.addChild(root_0, namespace95.getTree());

                    }
                    break;
                case 4 :
                    // org/fudgemsg/proto/antlr/Proto.g:208:4: taxonomy
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_taxonomy_in_root_object1223);
                    taxonomy96=taxonomy();

                    state._fsp--;

                    adaptor.addChild(root_0, taxonomy96.getTree());

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
    // org/fudgemsg/proto/antlr/Proto.g:211:1: taxonomy : TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' ;
    public final ProtoParser.taxonomy_return taxonomy() throws RecognitionException {
        ProtoParser.taxonomy_return retval = new ProtoParser.taxonomy_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token TAXONOMY97=null;
        Token IDENTIFIER98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        ProtoParser.taxonomy_element_return taxonomy_element100 = null;


        ProtoTree TAXONOMY97_tree=null;
        ProtoTree IDENTIFIER98_tree=null;
        ProtoTree char_literal99_tree=null;
        ProtoTree char_literal101_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:211:10: ( TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}' )
            // org/fudgemsg/proto/antlr/Proto.g:211:12: TAXONOMY IDENTIFIER '{' ( taxonomy_element )* '}'
            {
            root_0 = (ProtoTree)adaptor.nil();

            TAXONOMY97=(Token)match(input,TAXONOMY,FOLLOW_TAXONOMY_in_taxonomy1233); 
            TAXONOMY97_tree = (ProtoTree)adaptor.create(TAXONOMY97);
            root_0 = (ProtoTree)adaptor.becomeRoot(TAXONOMY97_tree, root_0);

            IDENTIFIER98=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_taxonomy1236); 
            IDENTIFIER98_tree = (ProtoTree)adaptor.create(IDENTIFIER98);
            adaptor.addChild(root_0, IDENTIFIER98_tree);

            char_literal99=(Token)match(input,59,FOLLOW_59_in_taxonomy1238); 
            // org/fudgemsg/proto/antlr/Proto.g:211:38: ( taxonomy_element )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==IMPORT||LA21_0==IDENTIFIER) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // org/fudgemsg/proto/antlr/Proto.g:211:38: taxonomy_element
            	    {
            	    pushFollow(FOLLOW_taxonomy_element_in_taxonomy1241);
            	    taxonomy_element100=taxonomy_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, taxonomy_element100.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal101=(Token)match(input,60,FOLLOW_60_in_taxonomy1244); 

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
    // org/fudgemsg/proto/antlr/Proto.g:213:1: taxonomy_element : ( enum_element | IMPORT fullidentifier ';' );
    public final ProtoParser.taxonomy_element_return taxonomy_element() throws RecognitionException {
        ProtoParser.taxonomy_element_return retval = new ProtoParser.taxonomy_element_return();
        retval.start = input.LT(1);

        ProtoTree root_0 = null;

        Token IMPORT103=null;
        Token char_literal105=null;
        ProtoParser.enum_element_return enum_element102 = null;

        ProtoParser.fullidentifier_return fullidentifier104 = null;


        ProtoTree IMPORT103_tree=null;
        ProtoTree char_literal105_tree=null;

        try {
            // org/fudgemsg/proto/antlr/Proto.g:214:2: ( enum_element | IMPORT fullidentifier ';' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            else if ( (LA22_0==IMPORT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // org/fudgemsg/proto/antlr/Proto.g:214:4: enum_element
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    pushFollow(FOLLOW_enum_element_in_taxonomy_element1255);
                    enum_element102=enum_element();

                    state._fsp--;

                    adaptor.addChild(root_0, enum_element102.getTree());

                    }
                    break;
                case 2 :
                    // org/fudgemsg/proto/antlr/Proto.g:215:4: IMPORT fullidentifier ';'
                    {
                    root_0 = (ProtoTree)adaptor.nil();

                    IMPORT103=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_taxonomy_element1260); 
                    IMPORT103_tree = (ProtoTree)adaptor.create(IMPORT103);
                    root_0 = (ProtoTree)adaptor.becomeRoot(IMPORT103_tree, root_0);

                    pushFollow(FOLLOW_fullidentifier_in_taxonomy_element1263);
                    fullidentifier104=fullidentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, fullidentifier104.getTree());
                    char_literal105=(Token)match(input,40,FOLLOW_40_in_taxonomy_element1265); 

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\37\uffff";
    static final String DFA7_eofS =
        "\37\uffff";
    static final String DFA7_minS =
        "\1\22\32\37\2\uffff\2\37";
    static final String DFA7_maxS =
        "\1\71\31\46\1\72\2\uffff\1\37\1\72";
    static final String DFA7_acceptS =
        "\33\uffff\1\1\1\2\2\uffff";
    static final String DFA7_specialS =
        "\37\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\3\1\26\1\24\1\30\1\7\1\16\1\5\1\31\4\uffff\1\32\12\uffff"+
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
            "\1\33\6\uffff\1\34\23\uffff\1\35",
            "",
            "",
            "\1\36",
            "\1\33\6\uffff\1\34\23\uffff\1\35"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "170:1: field_type : ( field_basetype | field_arraytype );";
        }
    }
 

    public static final BitSet FOLLOW_DEFAULT_in_constraint_default543 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_constraint_default546 = new BitSet(new long[]{0x0000000B80000000L});
    public static final BitSet FOLLOW_literal_in_constraint_default549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_dimension559 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_dimension561 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_dimension563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_dimension576 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_dimension578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_element594 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_enum_value_in_enum_element597 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_enum_element600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_enum_value610 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_enum_value613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraint_default_in_field_constraint622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_field_constraints631 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints634 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_field_constraints637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_field_constraint_in_field_constraints640 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_field_constraints644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_field_ordinal654 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INTEGER_in_field_ordinal656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_field_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_arraytype694 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_dimension_in_field_arraytype696 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_T_BOOL_in_field_primtype718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_field_primtype723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_BYTE_in_field_primtype734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_field_primtype739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_SHORT_in_field_primtype750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_field_primtype755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INT_in_field_primtype766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_field_primtype771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_field_primtype782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_field_primtype793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_field_primtype804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_field_primtype815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_field_primtype826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_LONG_in_field_primtype837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_field_primtype842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_field_primtype853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_field_primtype864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_field_primtype875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_field_primtype886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_FLOAT_in_field_primtype897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_field_primtype902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_DOUBLE_in_field_primtype913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_field_primtype918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_INDICATOR_in_field_primtype929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_T_STRING_in_field_primtype934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_primtype_in_field_basetype945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullidentifier_in_field_basetype950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_basetype_in_field_type961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_arraytype_in_field_type966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier976 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_fullidentifier980 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fullidentifier983 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message1020 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message1023 = new BitSet(new long[]{0x0800000010000000L});
    public static final BitSet FOLLOW_message_uses_in_message1025 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_message1028 = new BitSet(new long[]{0x13FFFC0087FDA900L});
    public static final BitSet FOLLOW_message_element_in_message1031 = new BitSet(new long[]{0x13FFFC0087FDA900L});
    public static final BitSet FOLLOW_60_in_message1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_message_element1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_field_in_message_element1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_submsg_in_message_element1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_message_enum1065 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_enum1068 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_message_enum1070 = new BitSet(new long[]{0x1000000080000000L});
    public static final BitSet FOLLOW_enum_element_in_message_enum1073 = new BitSet(new long[]{0x1000000080000000L});
    public static final BitSet FOLLOW_60_in_message_enum1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_modifier_in_message_field1086 = new BitSet(new long[]{0x03FFFC0087FDA000L});
    public static final BitSet FOLLOW_field_type_in_message_field1089 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_field1091 = new BitSet(new long[]{0x0000016000000000L});
    public static final BitSet FOLLOW_field_ordinal_in_message_field1093 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_field_constraints_in_message_field1096 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_message_field1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_submsg1127 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_message_submsg1130 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_message_submsg1132 = new BitSet(new long[]{0x13FFFC0087FDA900L});
    public static final BitSet FOLLOW_message_element_in_message_submsg1135 = new BitSet(new long[]{0x13FFFC0087FDA900L});
    public static final BitSet FOLLOW_60_in_message_submsg1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USES_in_message_uses1148 = new BitSet(new long[]{0x03FFFC0087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1151 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_message_uses1154 = new BitSet(new long[]{0x03FFFC0087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_message_uses1157 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespace1168 = new BitSet(new long[]{0x03FFFC0087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_namespace1171 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_namespace1173 = new BitSet(new long[]{0x1000000008001900L});
    public static final BitSet FOLLOW_root_object_in_namespace1176 = new BitSet(new long[]{0x1000000008001900L});
    public static final BitSet FOLLOW_60_in_namespace1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_root_object_in_root1189 = new BitSet(new long[]{0x0000000008001902L});
    public static final BitSet FOLLOW_message_in_root_object1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_enum_in_root_object1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_in_root_object1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_taxonomy_in_root_object1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAXONOMY_in_taxonomy1233 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_taxonomy1236 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_taxonomy1238 = new BitSet(new long[]{0x1000000080000400L});
    public static final BitSet FOLLOW_taxonomy_element_in_taxonomy1241 = new BitSet(new long[]{0x1000000080000400L});
    public static final BitSet FOLLOW_60_in_taxonomy1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_element_in_taxonomy_element1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_taxonomy_element1260 = new BitSet(new long[]{0x03FFFC0087FC0000L});
    public static final BitSet FOLLOW_fullidentifier_in_taxonomy_element1263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_taxonomy_element1265 = new BitSet(new long[]{0x0000000000000002L});

}