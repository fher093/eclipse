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
import gen.services.TestBGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestBParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Principal'", "'{'", "'materia'", "','", "'}'", "'docente'", "'|'", "'('", "')'", "'dicta'", "'APE'", "'ACD'", "'AA'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTestBParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestBParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestBParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTestB.g"; }



     	private TestBGrammarAccess grammarAccess;

        public InternalTestBParser(TokenStream input, TestBGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Principal";
       	}

       	@Override
       	protected TestBGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrincipal"
    // InternalTestB.g:65:1: entryRulePrincipal returns [EObject current=null] : iv_rulePrincipal= rulePrincipal EOF ;
    public final EObject entryRulePrincipal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrincipal = null;


        try {
            // InternalTestB.g:65:50: (iv_rulePrincipal= rulePrincipal EOF )
            // InternalTestB.g:66:2: iv_rulePrincipal= rulePrincipal EOF
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
    // InternalTestB.g:72:1: rulePrincipal returns [EObject current=null] : (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )? (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject rulePrincipal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_materia_5_0 = null;

        EObject lv_materia_7_0 = null;

        EObject lv_docente_11_0 = null;

        EObject lv_docente_13_0 = null;



        	enterRule();

        try {
            // InternalTestB.g:78:2: ( (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )? (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalTestB.g:79:2: (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )? (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalTestB.g:79:2: (otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )? (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalTestB.g:80:3: otherlv_0= 'Principal' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )? (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrincipalAccess().getPrincipalKeyword_0());
            		
            // InternalTestB.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTestB.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalTestB.g:85:4: (lv_name_1_0= ruleEString )
            // InternalTestB.g:86:5: lv_name_1_0= ruleEString
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
            						"gen.TestB.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTestB.g:107:3: (otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalTestB.g:108:4: otherlv_3= 'materia' otherlv_4= '{' ( (lv_materia_5_0= ruleMateria ) ) (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrincipalAccess().getMateriaKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalTestB.g:116:4: ( (lv_materia_5_0= ruleMateria ) )
                    // InternalTestB.g:117:5: (lv_materia_5_0= ruleMateria )
                    {
                    // InternalTestB.g:117:5: (lv_materia_5_0= ruleMateria )
                    // InternalTestB.g:118:6: lv_materia_5_0= ruleMateria
                    {

                    						newCompositeNode(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_materia_5_0=ruleMateria();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    						}
                    						add(
                    							current,
                    							"materia",
                    							lv_materia_5_0,
                    							"gen.TestB.Materia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTestB.g:135:4: (otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalTestB.g:136:5: otherlv_6= ',' ( (lv_materia_7_0= ruleMateria ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrincipalAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalTestB.g:140:5: ( (lv_materia_7_0= ruleMateria ) )
                    	    // InternalTestB.g:141:6: (lv_materia_7_0= ruleMateria )
                    	    {
                    	    // InternalTestB.g:141:6: (lv_materia_7_0= ruleMateria )
                    	    // InternalTestB.g:142:7: lv_materia_7_0= ruleMateria
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_materia_7_0=ruleMateria();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"materia",
                    	    								lv_materia_7_0,
                    	    								"gen.TestB.Materia");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalTestB.g:165:3: (otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTestB.g:166:4: otherlv_9= 'docente' otherlv_10= '{' ( (lv_docente_11_0= ruleDocente ) ) (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrincipalAccess().getDocenteKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalTestB.g:174:4: ( (lv_docente_11_0= ruleDocente ) )
                    // InternalTestB.g:175:5: (lv_docente_11_0= ruleDocente )
                    {
                    // InternalTestB.g:175:5: (lv_docente_11_0= ruleDocente )
                    // InternalTestB.g:176:6: lv_docente_11_0= ruleDocente
                    {

                    						newCompositeNode(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_docente_11_0=ruleDocente();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    						}
                    						add(
                    							current,
                    							"docente",
                    							lv_docente_11_0,
                    							"gen.TestB.Docente");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTestB.g:193:4: (otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalTestB.g:194:5: otherlv_12= ',' ( (lv_docente_13_0= ruleDocente ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPrincipalAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTestB.g:198:5: ( (lv_docente_13_0= ruleDocente ) )
                    	    // InternalTestB.g:199:6: (lv_docente_13_0= ruleDocente )
                    	    {
                    	    // InternalTestB.g:199:6: (lv_docente_13_0= ruleDocente )
                    	    // InternalTestB.g:200:7: lv_docente_13_0= ruleDocente
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_docente_13_0=ruleDocente();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"docente",
                    	    								lv_docente_13_0,
                    	    								"gen.TestB.Docente");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalTestB.g:231:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTestB.g:231:47: (iv_ruleEString= ruleEString EOF )
            // InternalTestB.g:232:2: iv_ruleEString= ruleEString EOF
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
    // InternalTestB.g:238:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTestB.g:244:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTestB.g:245:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTestB.g:245:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTestB.g:246:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTestB.g:254:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleMateria"
    // InternalTestB.g:265:1: entryRuleMateria returns [EObject current=null] : iv_ruleMateria= ruleMateria EOF ;
    public final EObject entryRuleMateria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMateria = null;


        try {
            // InternalTestB.g:265:48: (iv_ruleMateria= ruleMateria EOF )
            // InternalTestB.g:266:2: iv_ruleMateria= ruleMateria EOF
            {
             newCompositeNode(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMateria=ruleMateria();

            state._fsp--;

             current =iv_ruleMateria; 
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
    // $ANTLR end "entryRuleMateria"


    // $ANTLR start "ruleMateria"
    // InternalTestB.g:272:1: ruleMateria returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '|' ( ( ruleEString ) ) )? otherlv_3= '|' otherlv_4= '(' ( (lv_tarea_5_0= ruleTarea ) ) (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleMateria() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_tarea_5_0 = null;

        EObject lv_tarea_7_0 = null;



        	enterRule();

        try {
            // InternalTestB.g:278:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '|' ( ( ruleEString ) ) )? otherlv_3= '|' otherlv_4= '(' ( (lv_tarea_5_0= ruleTarea ) ) (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )* otherlv_8= ')' ) )
            // InternalTestB.g:279:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '|' ( ( ruleEString ) ) )? otherlv_3= '|' otherlv_4= '(' ( (lv_tarea_5_0= ruleTarea ) ) (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )* otherlv_8= ')' )
            {
            // InternalTestB.g:279:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '|' ( ( ruleEString ) ) )? otherlv_3= '|' otherlv_4= '(' ( (lv_tarea_5_0= ruleTarea ) ) (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )* otherlv_8= ')' )
            // InternalTestB.g:280:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= '|' ( ( ruleEString ) ) )? otherlv_3= '|' otherlv_4= '(' ( (lv_tarea_5_0= ruleTarea ) ) (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )* otherlv_8= ')'
            {
            // InternalTestB.g:280:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTestB.g:281:4: (lv_name_0_0= ruleEString )
            {
            // InternalTestB.g:281:4: (lv_name_0_0= ruleEString )
            // InternalTestB.g:282:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMateriaAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMateriaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"gen.TestB.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTestB.g:299:3: (otherlv_1= '|' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_STRING && LA6_1<=RULE_ID)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalTestB.g:300:4: otherlv_1= '|' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMateriaAccess().getVerticalLineKeyword_1_0());
                    			
                    // InternalTestB.g:304:4: ( ( ruleEString ) )
                    // InternalTestB.g:305:5: ( ruleEString )
                    {
                    // InternalTestB.g:305:5: ( ruleEString )
                    // InternalTestB.g:306:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMateriaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMateriaAccess().getDictadaDocenteCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMateriaAccess().getVerticalLineKeyword_2());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMateriaAccess().getLeftParenthesisKeyword_3());
            		
            // InternalTestB.g:329:3: ( (lv_tarea_5_0= ruleTarea ) )
            // InternalTestB.g:330:4: (lv_tarea_5_0= ruleTarea )
            {
            // InternalTestB.g:330:4: (lv_tarea_5_0= ruleTarea )
            // InternalTestB.g:331:5: lv_tarea_5_0= ruleTarea
            {

            					newCompositeNode(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_tarea_5_0=ruleTarea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMateriaRule());
            					}
            					add(
            						current,
            						"tarea",
            						lv_tarea_5_0,
            						"gen.TestB.Tarea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTestB.g:348:3: (otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTestB.g:349:4: otherlv_6= ',' ( (lv_tarea_7_0= ruleTarea ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getMateriaAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalTestB.g:353:4: ( (lv_tarea_7_0= ruleTarea ) )
            	    // InternalTestB.g:354:5: (lv_tarea_7_0= ruleTarea )
            	    {
            	    // InternalTestB.g:354:5: (lv_tarea_7_0= ruleTarea )
            	    // InternalTestB.g:355:6: lv_tarea_7_0= ruleTarea
            	    {

            	    						newCompositeNode(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_tarea_7_0=ruleTarea();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMateriaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tarea",
            	    							lv_tarea_7_0,
            	    							"gen.TestB.Tarea");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMateriaAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleMateria"


    // $ANTLR start "entryRuleDocente"
    // InternalTestB.g:381:1: entryRuleDocente returns [EObject current=null] : iv_ruleDocente= ruleDocente EOF ;
    public final EObject entryRuleDocente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocente = null;


        try {
            // InternalTestB.g:381:48: (iv_ruleDocente= ruleDocente EOF )
            // InternalTestB.g:382:2: iv_ruleDocente= ruleDocente EOF
            {
             newCompositeNode(grammarAccess.getDocenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocente=ruleDocente();

            state._fsp--;

             current =iv_ruleDocente; 
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
    // $ANTLR end "entryRuleDocente"


    // $ANTLR start "ruleDocente"
    // InternalTestB.g:388:1: ruleDocente returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'dicta' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleDocente() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalTestB.g:394:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'dicta' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // InternalTestB.g:395:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'dicta' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // InternalTestB.g:395:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'dicta' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // InternalTestB.g:396:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'dicta' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            // InternalTestB.g:396:3: ( (lv_name_0_0= ruleEString ) )
            // InternalTestB.g:397:4: (lv_name_0_0= ruleEString )
            {
            // InternalTestB.g:397:4: (lv_name_0_0= ruleEString )
            // InternalTestB.g:398:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDocenteAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocenteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"gen.TestB.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDocenteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDocenteAccess().getDictaKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDocenteAccess().getLeftParenthesisKeyword_3());
            		
            // InternalTestB.g:427:3: ( ( ruleEString ) )
            // InternalTestB.g:428:4: ( ruleEString )
            {
            // InternalTestB.g:428:4: ( ruleEString )
            // InternalTestB.g:429:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocenteRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTestB.g:443:3: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTestB.g:444:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getDocenteAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalTestB.g:448:4: ( ( ruleEString ) )
            	    // InternalTestB.g:449:5: ( ruleEString )
            	    {
            	    // InternalTestB.g:449:5: ( ruleEString )
            	    // InternalTestB.g:450:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDocenteRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getDocenteAccess().getRightParenthesisKeyword_6());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDocenteAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDocente"


    // $ANTLR start "entryRuleTarea"
    // InternalTestB.g:477:1: entryRuleTarea returns [EObject current=null] : iv_ruleTarea= ruleTarea EOF ;
    public final EObject entryRuleTarea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarea = null;


        try {
            // InternalTestB.g:477:46: (iv_ruleTarea= ruleTarea EOF )
            // InternalTestB.g:478:2: iv_ruleTarea= ruleTarea EOF
            {
             newCompositeNode(grammarAccess.getTareaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarea=ruleTarea();

            state._fsp--;

             current =iv_ruleTarea; 
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
    // $ANTLR end "entryRuleTarea"


    // $ANTLR start "ruleTarea"
    // InternalTestB.g:484:1: ruleTarea returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )? ) ;
    public final EObject ruleTarea() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_tipoC_3_0 = null;



        	enterRule();

        try {
            // InternalTestB.g:490:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )? ) )
            // InternalTestB.g:491:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )? )
            {
            // InternalTestB.g:491:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )? )
            // InternalTestB.g:492:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )?
            {
            // InternalTestB.g:492:3: ()
            // InternalTestB.g:493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTareaAccess().getTareaAction_0(),
            					current);
            			

            }

            // InternalTestB.g:499:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTestB.g:500:4: (lv_name_1_0= ruleEString )
            {
            // InternalTestB.g:500:4: (lv_name_1_0= ruleEString )
            // InternalTestB.g:501:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTareaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTareaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"gen.TestB.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTestB.g:518:3: (otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTestB.g:519:4: otherlv_2= '|' ( (lv_tipoC_3_0= ruleTipoCalificacion ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getTareaAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalTestB.g:523:4: ( (lv_tipoC_3_0= ruleTipoCalificacion ) )
                    // InternalTestB.g:524:5: (lv_tipoC_3_0= ruleTipoCalificacion )
                    {
                    // InternalTestB.g:524:5: (lv_tipoC_3_0= ruleTipoCalificacion )
                    // InternalTestB.g:525:6: lv_tipoC_3_0= ruleTipoCalificacion
                    {

                    						newCompositeNode(grammarAccess.getTareaAccess().getTipoCTipoCalificacionEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tipoC_3_0=ruleTipoCalificacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTareaRule());
                    						}
                    						set(
                    							current,
                    							"tipoC",
                    							lv_tipoC_3_0,
                    							"gen.TestB.TipoCalificacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleTarea"


    // $ANTLR start "ruleTipoCalificacion"
    // InternalTestB.g:547:1: ruleTipoCalificacion returns [Enumerator current=null] : ( (enumLiteral_0= 'APE' ) | (enumLiteral_1= 'ACD' ) | (enumLiteral_2= 'AA' ) ) ;
    public final Enumerator ruleTipoCalificacion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalTestB.g:553:2: ( ( (enumLiteral_0= 'APE' ) | (enumLiteral_1= 'ACD' ) | (enumLiteral_2= 'AA' ) ) )
            // InternalTestB.g:554:2: ( (enumLiteral_0= 'APE' ) | (enumLiteral_1= 'ACD' ) | (enumLiteral_2= 'AA' ) )
            {
            // InternalTestB.g:554:2: ( (enumLiteral_0= 'APE' ) | (enumLiteral_1= 'ACD' ) | (enumLiteral_2= 'AA' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTestB.g:555:3: (enumLiteral_0= 'APE' )
                    {
                    // InternalTestB.g:555:3: (enumLiteral_0= 'APE' )
                    // InternalTestB.g:556:4: enumLiteral_0= 'APE'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTipoCalificacionAccess().getAPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoCalificacionAccess().getAPEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTestB.g:563:3: (enumLiteral_1= 'ACD' )
                    {
                    // InternalTestB.g:563:3: (enumLiteral_1= 'ACD' )
                    // InternalTestB.g:564:4: enumLiteral_1= 'ACD'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTipoCalificacionAccess().getACDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoCalificacionAccess().getACDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTestB.g:571:3: (enumLiteral_2= 'AA' )
                    {
                    // InternalTestB.g:571:3: (enumLiteral_2= 'AA' )
                    // InternalTestB.g:572:4: enumLiteral_2= 'AA'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTipoCalificacionAccess().getAAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoCalificacionAccess().getAAEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTipoCalificacion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});

}