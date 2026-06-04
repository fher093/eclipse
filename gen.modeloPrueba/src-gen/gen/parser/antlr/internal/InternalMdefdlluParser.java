package gen.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gen.services.MdefdlluGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMdefdlluParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RaizFDLLU'", "'{'", "'contiene'", "'('", "','", "')'", "'contien'", "'}'", "'-'"
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
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMdefdlluParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMdefdlluParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMdefdlluParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMdefdllu.g"; }



     	private MdefdlluGrammarAccess grammarAccess;

        public InternalMdefdlluParser(TokenStream input, MdefdlluGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RaizFDLLU";
       	}

       	@Override
       	protected MdefdlluGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRaizFDLLU"
    // InternalMdefdllu.g:64:1: entryRuleRaizFDLLU returns [EObject current=null] : iv_ruleRaizFDLLU= ruleRaizFDLLU EOF ;
    public final EObject entryRuleRaizFDLLU() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaizFDLLU = null;


        try {
            // InternalMdefdllu.g:64:50: (iv_ruleRaizFDLLU= ruleRaizFDLLU EOF )
            // InternalMdefdllu.g:65:2: iv_ruleRaizFDLLU= ruleRaizFDLLU EOF
            {
             newCompositeNode(grammarAccess.getRaizFDLLURule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRaizFDLLU=ruleRaizFDLLU();

            state._fsp--;

             current =iv_ruleRaizFDLLU; 
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
    // $ANTLR end "entryRuleRaizFDLLU"


    // $ANTLR start "ruleRaizFDLLU"
    // InternalMdefdllu.g:71:1: ruleRaizFDLLU returns [EObject current=null] : ( () otherlv_1= 'RaizFDLLU' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleRaizFDLLU() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMdefdllu.g:77:2: ( ( () otherlv_1= 'RaizFDLLU' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // InternalMdefdllu.g:78:2: ( () otherlv_1= 'RaizFDLLU' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // InternalMdefdllu.g:78:2: ( () otherlv_1= 'RaizFDLLU' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // InternalMdefdllu.g:79:3: () otherlv_1= 'RaizFDLLU' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // InternalMdefdllu.g:79:3: ()
            // InternalMdefdllu.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRaizFDLLUAccess().getRaizFDLLUAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRaizFDLLUAccess().getRaizFDLLUKeyword_1());
            		
            // InternalMdefdllu.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMdefdllu.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMdefdllu.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMdefdllu.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRaizFDLLUAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRaizFDLLURule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"gen.Mdefdllu.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRaizFDLLUAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMdefdllu.g:113:3: (otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMdefdllu.g:114:4: otherlv_4= 'contiene' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getRaizFDLLUAccess().getContieneKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getRaizFDLLUAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMdefdllu.g:122:4: ( ( ruleEString ) )
                    // InternalMdefdllu.g:123:5: ( ruleEString )
                    {
                    // InternalMdefdllu.g:123:5: ( ruleEString )
                    // InternalMdefdllu.g:124:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRaizFDLLURule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRaizFDLLUAccess().getContieneArregloIntCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMdefdllu.g:138:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMdefdllu.g:139:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRaizFDLLUAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMdefdllu.g:143:5: ( ( ruleEString ) )
                    	    // InternalMdefdllu.g:144:6: ( ruleEString )
                    	    {
                    	    // InternalMdefdllu.g:144:6: ( ruleEString )
                    	    // InternalMdefdllu.g:145:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRaizFDLLURule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRaizFDLLUAccess().getContieneArregloIntCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRaizFDLLUAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMdefdllu.g:165:3: (otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMdefdllu.g:166:4: otherlv_10= 'contien' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getRaizFDLLUAccess().getContienKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRaizFDLLUAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMdefdllu.g:174:4: ( ( ruleEString ) )
                    // InternalMdefdllu.g:175:5: ( ruleEString )
                    {
                    // InternalMdefdllu.g:175:5: ( ruleEString )
                    // InternalMdefdllu.g:176:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRaizFDLLURule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRaizFDLLUAccess().getContienArregloStringCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMdefdllu.g:190:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMdefdllu.g:191:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getRaizFDLLUAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMdefdllu.g:195:5: ( ( ruleEString ) )
                    	    // InternalMdefdllu.g:196:6: ( ruleEString )
                    	    {
                    	    // InternalMdefdllu.g:196:6: ( ruleEString )
                    	    // InternalMdefdllu.g:197:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRaizFDLLURule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRaizFDLLUAccess().getContienArregloStringCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_15, grammarAccess.getRaizFDLLUAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getRaizFDLLUAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRaizFDLLU"


    // $ANTLR start "entryRuleEString"
    // InternalMdefdllu.g:225:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMdefdllu.g:225:47: (iv_ruleEString= ruleEString EOF )
            // InternalMdefdllu.g:226:2: iv_ruleEString= ruleEString EOF
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
    // InternalMdefdllu.g:232:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMdefdllu.g:238:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMdefdllu.g:239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMdefdllu.g:239:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMdefdllu.g:240:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMdefdllu.g:248:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalMdefdllu.g:259:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMdefdllu.g:259:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMdefdllu.g:260:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMdefdllu.g:266:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMdefdllu.g:272:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMdefdllu.g:273:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMdefdllu.g:273:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMdefdllu.g:274:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMdefdllu.g:274:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMdefdllu.g:275:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_10); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});

}