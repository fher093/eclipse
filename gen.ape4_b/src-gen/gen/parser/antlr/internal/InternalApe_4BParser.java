package gen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gen.services.Ape_4BGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApe_4BParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Principal'", "'{'", "'}'", "'Entidad'", "'redirige:'", "';'", "'-'", "'true'", "'false'", "'STRING'", "'DOUBLE'", "'INTEGER'", "'BOOLEAN'", "'TIME'", "'DATE'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalApe_4BParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalApe_4BParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalApe_4BParser.tokenNames; }
    public String getGrammarFileName() { return "InternalApe_4B.g"; }



     	private Ape_4BGrammarAccess grammarAccess;

        public InternalApe_4BParser(TokenStream input, Ape_4BGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Principal";
       	}

       	@Override
       	protected Ape_4BGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrincipal"
    // InternalApe_4B.g:65:1: entryRulePrincipal returns [EObject current=null] : iv_rulePrincipal= rulePrincipal EOF ;
    public final EObject entryRulePrincipal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrincipal = null;


        try {
            // InternalApe_4B.g:65:50: (iv_rulePrincipal= rulePrincipal EOF )
            // InternalApe_4B.g:66:2: iv_rulePrincipal= rulePrincipal EOF
            {
             newCompositeNode(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrincipal=rulePrincipal();

            state._fsp--;

             current =iv_rulePrincipal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalApe_4B.g:72:1: rulePrincipal returns [EObject current=null] : (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_posee_3_0= ruleEntidad ) ) ( (lv_posee_4_0= ruleEntidad ) )* otherlv_5= '}' ) ;
    public final EObject rulePrincipal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_posee_3_0 = null;

        EObject lv_posee_4_0 = null;



        	enterRule();

        try {
            // InternalApe_4B.g:78:2: ( (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_posee_3_0= ruleEntidad ) ) ( (lv_posee_4_0= ruleEntidad ) )* otherlv_5= '}' ) )
            // InternalApe_4B.g:79:2: (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_posee_3_0= ruleEntidad ) ) ( (lv_posee_4_0= ruleEntidad ) )* otherlv_5= '}' )
            {
            // InternalApe_4B.g:79:2: (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_posee_3_0= ruleEntidad ) ) ( (lv_posee_4_0= ruleEntidad ) )* otherlv_5= '}' )
            // InternalApe_4B.g:80:3: otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_posee_3_0= ruleEntidad ) ) ( (lv_posee_4_0= ruleEntidad ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrincipalAccess().getPrincipalKeyword_0());
            		
            // InternalApe_4B.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalApe_4B.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalApe_4B.g:85:4: (lv_name_1_0= ruleEString )
            // InternalApe_4B.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrincipalAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrincipalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"gen.Ape_4B.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalApe_4B.g:107:3: ( (lv_posee_3_0= ruleEntidad ) )
            // InternalApe_4B.g:108:4: (lv_posee_3_0= ruleEntidad )
            {
            // InternalApe_4B.g:108:4: (lv_posee_3_0= ruleEntidad )
            // InternalApe_4B.g:109:5: lv_posee_3_0= ruleEntidad
            {

            					newCompositeNode(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_posee_3_0=ruleEntidad();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrincipalRule());
            					}
            					add(
            						current,
            						"posee",
            						lv_posee_3_0,
            						"gen.Ape_4B.Entidad");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApe_4B.g:126:3: ( (lv_posee_4_0= ruleEntidad ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalApe_4B.g:127:4: (lv_posee_4_0= ruleEntidad )
            	    {
            	    // InternalApe_4B.g:127:4: (lv_posee_4_0= ruleEntidad )
            	    // InternalApe_4B.g:128:5: lv_posee_4_0= ruleEntidad
            	    {

            	    					newCompositeNode(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_posee_4_0=ruleEntidad();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrincipalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"posee",
            	    						lv_posee_4_0,
            	    						"gen.Ape_4B.Entidad");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleEString"
    // InternalApe_4B.g:153:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalApe_4B.g:153:47: (iv_ruleEString= ruleEString EOF )
            // InternalApe_4B.g:154:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalApe_4B.g:160:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalApe_4B.g:166:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalApe_4B.g:167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalApe_4B.g:167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalApe_4B.g:168:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:176:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalApe_4B.g:187:1: entryRuleEntidad returns [EObject current=null] : iv_ruleEntidad= ruleEntidad EOF ;
    public final EObject entryRuleEntidad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidad = null;


        try {
            // InternalApe_4B.g:187:48: (iv_ruleEntidad= ruleEntidad EOF )
            // InternalApe_4B.g:188:2: iv_ruleEntidad= ruleEntidad EOF
            {
             newCompositeNode(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidad=ruleEntidad();

            state._fsp--;

             current =iv_ruleEntidad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalApe_4B.g:194:1: ruleEntidad returns [EObject current=null] : (otherlv_0= 'Entidad' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_contiene_3_0= ruleAtributo ) ) ( (lv_contiene_4_0= ruleAtributo ) )* (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )? otherlv_8= '}' ) ;
    public final EObject ruleEntidad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_contiene_3_0 = null;

        EObject lv_contiene_4_0 = null;



        	enterRule();

        try {
            // InternalApe_4B.g:200:2: ( (otherlv_0= 'Entidad' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_contiene_3_0= ruleAtributo ) ) ( (lv_contiene_4_0= ruleAtributo ) )* (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )? otherlv_8= '}' ) )
            // InternalApe_4B.g:201:2: (otherlv_0= 'Entidad' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_contiene_3_0= ruleAtributo ) ) ( (lv_contiene_4_0= ruleAtributo ) )* (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )? otherlv_8= '}' )
            {
            // InternalApe_4B.g:201:2: (otherlv_0= 'Entidad' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_contiene_3_0= ruleAtributo ) ) ( (lv_contiene_4_0= ruleAtributo ) )* (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )? otherlv_8= '}' )
            // InternalApe_4B.g:202:3: otherlv_0= 'Entidad' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_contiene_3_0= ruleAtributo ) ) ( (lv_contiene_4_0= ruleAtributo ) )* (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadAccess().getEntidadKeyword_0());
            		
            // InternalApe_4B.g:206:3: ( (lv_name_1_0= ruleEString ) )
            // InternalApe_4B.g:207:4: (lv_name_1_0= ruleEString )
            {
            // InternalApe_4B.g:207:4: (lv_name_1_0= ruleEString )
            // InternalApe_4B.g:208:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"gen.Ape_4B.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalApe_4B.g:229:3: ( (lv_contiene_3_0= ruleAtributo ) )
            // InternalApe_4B.g:230:4: (lv_contiene_3_0= ruleAtributo )
            {
            // InternalApe_4B.g:230:4: (lv_contiene_3_0= ruleAtributo )
            // InternalApe_4B.g:231:5: lv_contiene_3_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_contiene_3_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadRule());
            					}
            					add(
            						current,
            						"contiene",
            						lv_contiene_3_0,
            						"gen.Ape_4B.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApe_4B.g:248:3: ( (lv_contiene_4_0= ruleAtributo ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalApe_4B.g:249:4: (lv_contiene_4_0= ruleAtributo )
            	    {
            	    // InternalApe_4B.g:249:4: (lv_contiene_4_0= ruleAtributo )
            	    // InternalApe_4B.g:250:5: lv_contiene_4_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_contiene_4_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"contiene",
            	    						lv_contiene_4_0,
            	    						"gen.Ape_4B.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalApe_4B.g:267:3: (otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalApe_4B.g:268:4: otherlv_5= 'redirige:' ( ( ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntidadAccess().getRedirigeKeyword_5_0());
                    			
                    // InternalApe_4B.g:272:4: ( ( ruleEString ) )
                    // InternalApe_4B.g:273:5: ( ruleEString )
                    {
                    // InternalApe_4B.g:273:5: ( ruleEString )
                    // InternalApe_4B.g:274:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntidadRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEntidadAccess().getRedirigeEntidadCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntidadAccess().getSemicolonKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalApe_4B.g:301:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalApe_4B.g:301:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalApe_4B.g:302:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalApe_4B.g:308:1: ruleAtributo returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_tipoDato_1_0= ruleTipoDato ) ) ( (lv_longitud_2_0= ruleEInt ) )? ( (lv_requerido_3_0= ruleEBoolean ) )? ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_tipoDato_1_0 = null;

        AntlrDatatypeRuleToken lv_longitud_2_0 = null;

        AntlrDatatypeRuleToken lv_requerido_3_0 = null;



        	enterRule();

        try {
            // InternalApe_4B.g:314:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_tipoDato_1_0= ruleTipoDato ) ) ( (lv_longitud_2_0= ruleEInt ) )? ( (lv_requerido_3_0= ruleEBoolean ) )? ) )
            // InternalApe_4B.g:315:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_tipoDato_1_0= ruleTipoDato ) ) ( (lv_longitud_2_0= ruleEInt ) )? ( (lv_requerido_3_0= ruleEBoolean ) )? )
            {
            // InternalApe_4B.g:315:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_tipoDato_1_0= ruleTipoDato ) ) ( (lv_longitud_2_0= ruleEInt ) )? ( (lv_requerido_3_0= ruleEBoolean ) )? )
            // InternalApe_4B.g:316:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_tipoDato_1_0= ruleTipoDato ) ) ( (lv_longitud_2_0= ruleEInt ) )? ( (lv_requerido_3_0= ruleEBoolean ) )?
            {
            // InternalApe_4B.g:316:3: ( (lv_name_0_0= ruleEString ) )
            // InternalApe_4B.g:317:4: (lv_name_0_0= ruleEString )
            {
            // InternalApe_4B.g:317:4: (lv_name_0_0= ruleEString )
            // InternalApe_4B.g:318:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"gen.Ape_4B.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApe_4B.g:335:3: ( (lv_tipoDato_1_0= ruleTipoDato ) )
            // InternalApe_4B.g:336:4: (lv_tipoDato_1_0= ruleTipoDato )
            {
            // InternalApe_4B.g:336:4: (lv_tipoDato_1_0= ruleTipoDato )
            // InternalApe_4B.g:337:5: lv_tipoDato_1_0= ruleTipoDato
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTipoDatoTipoDatoEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_tipoDato_1_0=ruleTipoDato();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tipoDato",
            						lv_tipoDato_1_0,
            						"gen.Ape_4B.TipoDato");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalApe_4B.g:354:3: ( (lv_longitud_2_0= ruleEInt ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalApe_4B.g:355:4: (lv_longitud_2_0= ruleEInt )
                    {
                    // InternalApe_4B.g:355:4: (lv_longitud_2_0= ruleEInt )
                    // InternalApe_4B.g:356:5: lv_longitud_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getLongitudEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_longitud_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"longitud",
                    						lv_longitud_2_0,
                    						"gen.Ape_4B.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalApe_4B.g:373:3: ( (lv_requerido_3_0= ruleEBoolean ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalApe_4B.g:374:4: (lv_requerido_3_0= ruleEBoolean )
                    {
                    // InternalApe_4B.g:374:4: (lv_requerido_3_0= ruleEBoolean )
                    // InternalApe_4B.g:375:5: lv_requerido_3_0= ruleEBoolean
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getRequeridoEBooleanParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_requerido_3_0=ruleEBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"requerido",
                    						lv_requerido_3_0 != null,
                    						"gen.Ape_4B.EBoolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleEInt"
    // InternalApe_4B.g:396:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalApe_4B.g:396:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalApe_4B.g:397:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalApe_4B.g:403:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalApe_4B.g:409:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalApe_4B.g:410:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalApe_4B.g:410:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalApe_4B.g:411:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalApe_4B.g:411:3: (kw= '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalApe_4B.g:412:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalApe_4B.g:429:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalApe_4B.g:429:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalApe_4B.g:430:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalApe_4B.g:436:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalApe_4B.g:442:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalApe_4B.g:443:2: (kw= 'true' | kw= 'false' )
            {
            // InternalApe_4B.g:443:2: (kw= 'true' | kw= 'false' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalApe_4B.g:444:3: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:450:3: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleTipoDato"
    // InternalApe_4B.g:459:1: ruleTipoDato returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'TIME' ) | (enumLiteral_5= 'DATE' ) ) ;
    public final Enumerator ruleTipoDato() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalApe_4B.g:465:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'TIME' ) | (enumLiteral_5= 'DATE' ) ) )
            // InternalApe_4B.g:466:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'TIME' ) | (enumLiteral_5= 'DATE' ) )
            {
            // InternalApe_4B.g:466:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'DOUBLE' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'BOOLEAN' ) | (enumLiteral_4= 'TIME' ) | (enumLiteral_5= 'DATE' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalApe_4B.g:467:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalApe_4B.g:467:3: (enumLiteral_0= 'STRING' )
                    // InternalApe_4B.g:468:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoDatoAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:475:3: (enumLiteral_1= 'DOUBLE' )
                    {
                    // InternalApe_4B.g:475:3: (enumLiteral_1= 'DOUBLE' )
                    // InternalApe_4B.g:476:4: enumLiteral_1= 'DOUBLE'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoDatoAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalApe_4B.g:483:3: (enumLiteral_2= 'INTEGER' )
                    {
                    // InternalApe_4B.g:483:3: (enumLiteral_2= 'INTEGER' )
                    // InternalApe_4B.g:484:4: enumLiteral_2= 'INTEGER'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoDatoAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalApe_4B.g:491:3: (enumLiteral_3= 'BOOLEAN' )
                    {
                    // InternalApe_4B.g:491:3: (enumLiteral_3= 'BOOLEAN' )
                    // InternalApe_4B.g:492:4: enumLiteral_3= 'BOOLEAN'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoDatoAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalApe_4B.g:499:3: (enumLiteral_4= 'TIME' )
                    {
                    // InternalApe_4B.g:499:3: (enumLiteral_4= 'TIME' )
                    // InternalApe_4B.g:500:4: enumLiteral_4= 'TIME'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getTIMEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTipoDatoAccess().getTIMEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalApe_4B.g:507:3: (enumLiteral_5= 'DATE' )
                    {
                    // InternalApe_4B.g:507:3: (enumLiteral_5= 'DATE' )
                    // InternalApe_4B.g:508:4: enumLiteral_5= 'DATE'
                    {
                    enumLiteral_5=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTipoDatoAccess().getDATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoDato"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}