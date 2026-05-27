package gen.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import gen.services.Ape_4BGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalApe_4BParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'STRING'", "'DOUBLE'", "'INTEGER'", "'BOOLEAN'", "'TIME'", "'DATE'", "'Principal'", "'{'", "'}'", "'Entidad'", "'redirige:'", "';'", "'-'"
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

    	public void setGrammarAccess(Ape_4BGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePrincipal"
    // InternalApe_4B.g:53:1: entryRulePrincipal : rulePrincipal EOF ;
    public final void entryRulePrincipal() throws RecognitionException {
        try {
            // InternalApe_4B.g:54:1: ( rulePrincipal EOF )
            // InternalApe_4B.g:55:1: rulePrincipal EOF
            {
             before(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            rulePrincipal();

            state._fsp--;

             after(grammarAccess.getPrincipalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalApe_4B.g:62:1: rulePrincipal : ( ( rule__Principal__Group__0 ) ) ;
    public final void rulePrincipal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:66:2: ( ( ( rule__Principal__Group__0 ) ) )
            // InternalApe_4B.g:67:2: ( ( rule__Principal__Group__0 ) )
            {
            // InternalApe_4B.g:67:2: ( ( rule__Principal__Group__0 ) )
            // InternalApe_4B.g:68:3: ( rule__Principal__Group__0 )
            {
             before(grammarAccess.getPrincipalAccess().getGroup()); 
            // InternalApe_4B.g:69:3: ( rule__Principal__Group__0 )
            // InternalApe_4B.g:69:4: rule__Principal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleEString"
    // InternalApe_4B.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalApe_4B.g:79:1: ( ruleEString EOF )
            // InternalApe_4B.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalApe_4B.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalApe_4B.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalApe_4B.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalApe_4B.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalApe_4B.g:94:3: ( rule__EString__Alternatives )
            // InternalApe_4B.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalApe_4B.g:103:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalApe_4B.g:104:1: ( ruleEntidad EOF )
            // InternalApe_4B.g:105:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalApe_4B.g:112:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:116:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalApe_4B.g:117:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalApe_4B.g:117:2: ( ( rule__Entidad__Group__0 ) )
            // InternalApe_4B.g:118:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalApe_4B.g:119:3: ( rule__Entidad__Group__0 )
            // InternalApe_4B.g:119:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleAtributo"
    // InternalApe_4B.g:128:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalApe_4B.g:129:1: ( ruleAtributo EOF )
            // InternalApe_4B.g:130:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalApe_4B.g:137:1: ruleAtributo : ( ( rule__Atributo__Group__0 ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:141:2: ( ( ( rule__Atributo__Group__0 ) ) )
            // InternalApe_4B.g:142:2: ( ( rule__Atributo__Group__0 ) )
            {
            // InternalApe_4B.g:142:2: ( ( rule__Atributo__Group__0 ) )
            // InternalApe_4B.g:143:3: ( rule__Atributo__Group__0 )
            {
             before(grammarAccess.getAtributoAccess().getGroup()); 
            // InternalApe_4B.g:144:3: ( rule__Atributo__Group__0 )
            // InternalApe_4B.g:144:4: rule__Atributo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleEInt"
    // InternalApe_4B.g:153:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalApe_4B.g:154:1: ( ruleEInt EOF )
            // InternalApe_4B.g:155:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalApe_4B.g:162:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:166:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalApe_4B.g:167:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalApe_4B.g:167:2: ( ( rule__EInt__Group__0 ) )
            // InternalApe_4B.g:168:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalApe_4B.g:169:3: ( rule__EInt__Group__0 )
            // InternalApe_4B.g:169:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalApe_4B.g:178:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalApe_4B.g:179:1: ( ruleEBoolean EOF )
            // InternalApe_4B.g:180:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalApe_4B.g:187:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:191:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalApe_4B.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalApe_4B.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalApe_4B.g:193:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalApe_4B.g:194:3: ( rule__EBoolean__Alternatives )
            // InternalApe_4B.g:194:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleTipoDato"
    // InternalApe_4B.g:203:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:207:1: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalApe_4B.g:208:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalApe_4B.g:208:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalApe_4B.g:209:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalApe_4B.g:210:3: ( rule__TipoDato__Alternatives )
            // InternalApe_4B.g:210:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalApe_4B.g:218:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:222:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalApe_4B.g:223:2: ( RULE_STRING )
                    {
                    // InternalApe_4B.g:223:2: ( RULE_STRING )
                    // InternalApe_4B.g:224:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:229:2: ( RULE_ID )
                    {
                    // InternalApe_4B.g:229:2: ( RULE_ID )
                    // InternalApe_4B.g:230:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalApe_4B.g:239:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:243:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalApe_4B.g:244:2: ( 'true' )
                    {
                    // InternalApe_4B.g:244:2: ( 'true' )
                    // InternalApe_4B.g:245:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:250:2: ( 'false' )
                    {
                    // InternalApe_4B.g:250:2: ( 'false' )
                    // InternalApe_4B.g:251:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalApe_4B.g:260:1: rule__TipoDato__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'INTEGER' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'TIME' ) ) | ( ( 'DATE' ) ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:264:1: ( ( ( 'STRING' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'INTEGER' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'TIME' ) ) | ( ( 'DATE' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalApe_4B.g:265:2: ( ( 'STRING' ) )
                    {
                    // InternalApe_4B.g:265:2: ( ( 'STRING' ) )
                    // InternalApe_4B.g:266:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalApe_4B.g:267:3: ( 'STRING' )
                    // InternalApe_4B.g:267:4: 'STRING'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalApe_4B.g:271:2: ( ( 'DOUBLE' ) )
                    {
                    // InternalApe_4B.g:271:2: ( ( 'DOUBLE' ) )
                    // InternalApe_4B.g:272:3: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalApe_4B.g:273:3: ( 'DOUBLE' )
                    // InternalApe_4B.g:273:4: 'DOUBLE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalApe_4B.g:277:2: ( ( 'INTEGER' ) )
                    {
                    // InternalApe_4B.g:277:2: ( ( 'INTEGER' ) )
                    // InternalApe_4B.g:278:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getINTEGEREnumLiteralDeclaration_2()); 
                    // InternalApe_4B.g:279:3: ( 'INTEGER' )
                    // InternalApe_4B.g:279:4: 'INTEGER'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getINTEGEREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalApe_4B.g:283:2: ( ( 'BOOLEAN' ) )
                    {
                    // InternalApe_4B.g:283:2: ( ( 'BOOLEAN' ) )
                    // InternalApe_4B.g:284:3: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getBOOLEANEnumLiteralDeclaration_3()); 
                    // InternalApe_4B.g:285:3: ( 'BOOLEAN' )
                    // InternalApe_4B.g:285:4: 'BOOLEAN'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getBOOLEANEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalApe_4B.g:289:2: ( ( 'TIME' ) )
                    {
                    // InternalApe_4B.g:289:2: ( ( 'TIME' ) )
                    // InternalApe_4B.g:290:3: ( 'TIME' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getTIMEEnumLiteralDeclaration_4()); 
                    // InternalApe_4B.g:291:3: ( 'TIME' )
                    // InternalApe_4B.g:291:4: 'TIME'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getTIMEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalApe_4B.g:295:2: ( ( 'DATE' ) )
                    {
                    // InternalApe_4B.g:295:2: ( ( 'DATE' ) )
                    // InternalApe_4B.g:296:3: ( 'DATE' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getDATEEnumLiteralDeclaration_5()); 
                    // InternalApe_4B.g:297:3: ( 'DATE' )
                    // InternalApe_4B.g:297:4: 'DATE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getDATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Principal__Group__0"
    // InternalApe_4B.g:305:1: rule__Principal__Group__0 : rule__Principal__Group__0__Impl rule__Principal__Group__1 ;
    public final void rule__Principal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:309:1: ( rule__Principal__Group__0__Impl rule__Principal__Group__1 )
            // InternalApe_4B.g:310:2: rule__Principal__Group__0__Impl rule__Principal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__0"


    // $ANTLR start "rule__Principal__Group__0__Impl"
    // InternalApe_4B.g:317:1: rule__Principal__Group__0__Impl : ( 'Principal' ) ;
    public final void rule__Principal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:321:1: ( ( 'Principal' ) )
            // InternalApe_4B.g:322:1: ( 'Principal' )
            {
            // InternalApe_4B.g:322:1: ( 'Principal' )
            // InternalApe_4B.g:323:2: 'Principal'
            {
             before(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__0__Impl"


    // $ANTLR start "rule__Principal__Group__1"
    // InternalApe_4B.g:332:1: rule__Principal__Group__1 : rule__Principal__Group__1__Impl rule__Principal__Group__2 ;
    public final void rule__Principal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:336:1: ( rule__Principal__Group__1__Impl rule__Principal__Group__2 )
            // InternalApe_4B.g:337:2: rule__Principal__Group__1__Impl rule__Principal__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Principal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__1"


    // $ANTLR start "rule__Principal__Group__1__Impl"
    // InternalApe_4B.g:344:1: rule__Principal__Group__1__Impl : ( ( rule__Principal__NameAssignment_1 ) ) ;
    public final void rule__Principal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:348:1: ( ( ( rule__Principal__NameAssignment_1 ) ) )
            // InternalApe_4B.g:349:1: ( ( rule__Principal__NameAssignment_1 ) )
            {
            // InternalApe_4B.g:349:1: ( ( rule__Principal__NameAssignment_1 ) )
            // InternalApe_4B.g:350:2: ( rule__Principal__NameAssignment_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 
            // InternalApe_4B.g:351:2: ( rule__Principal__NameAssignment_1 )
            // InternalApe_4B.g:351:3: rule__Principal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__1__Impl"


    // $ANTLR start "rule__Principal__Group__2"
    // InternalApe_4B.g:359:1: rule__Principal__Group__2 : rule__Principal__Group__2__Impl rule__Principal__Group__3 ;
    public final void rule__Principal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:363:1: ( rule__Principal__Group__2__Impl rule__Principal__Group__3 )
            // InternalApe_4B.g:364:2: rule__Principal__Group__2__Impl rule__Principal__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Principal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__2"


    // $ANTLR start "rule__Principal__Group__2__Impl"
    // InternalApe_4B.g:371:1: rule__Principal__Group__2__Impl : ( '{' ) ;
    public final void rule__Principal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:375:1: ( ( '{' ) )
            // InternalApe_4B.g:376:1: ( '{' )
            {
            // InternalApe_4B.g:376:1: ( '{' )
            // InternalApe_4B.g:377:2: '{'
            {
             before(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__2__Impl"


    // $ANTLR start "rule__Principal__Group__3"
    // InternalApe_4B.g:386:1: rule__Principal__Group__3 : rule__Principal__Group__3__Impl rule__Principal__Group__4 ;
    public final void rule__Principal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:390:1: ( rule__Principal__Group__3__Impl rule__Principal__Group__4 )
            // InternalApe_4B.g:391:2: rule__Principal__Group__3__Impl rule__Principal__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__3"


    // $ANTLR start "rule__Principal__Group__3__Impl"
    // InternalApe_4B.g:398:1: rule__Principal__Group__3__Impl : ( ( rule__Principal__PoseeAssignment_3 ) ) ;
    public final void rule__Principal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:402:1: ( ( ( rule__Principal__PoseeAssignment_3 ) ) )
            // InternalApe_4B.g:403:1: ( ( rule__Principal__PoseeAssignment_3 ) )
            {
            // InternalApe_4B.g:403:1: ( ( rule__Principal__PoseeAssignment_3 ) )
            // InternalApe_4B.g:404:2: ( rule__Principal__PoseeAssignment_3 )
            {
             before(grammarAccess.getPrincipalAccess().getPoseeAssignment_3()); 
            // InternalApe_4B.g:405:2: ( rule__Principal__PoseeAssignment_3 )
            // InternalApe_4B.g:405:3: rule__Principal__PoseeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Principal__PoseeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getPoseeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__3__Impl"


    // $ANTLR start "rule__Principal__Group__4"
    // InternalApe_4B.g:413:1: rule__Principal__Group__4 : rule__Principal__Group__4__Impl rule__Principal__Group__5 ;
    public final void rule__Principal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:417:1: ( rule__Principal__Group__4__Impl rule__Principal__Group__5 )
            // InternalApe_4B.g:418:2: rule__Principal__Group__4__Impl rule__Principal__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__4"


    // $ANTLR start "rule__Principal__Group__4__Impl"
    // InternalApe_4B.g:425:1: rule__Principal__Group__4__Impl : ( ( rule__Principal__PoseeAssignment_4 )* ) ;
    public final void rule__Principal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:429:1: ( ( ( rule__Principal__PoseeAssignment_4 )* ) )
            // InternalApe_4B.g:430:1: ( ( rule__Principal__PoseeAssignment_4 )* )
            {
            // InternalApe_4B.g:430:1: ( ( rule__Principal__PoseeAssignment_4 )* )
            // InternalApe_4B.g:431:2: ( rule__Principal__PoseeAssignment_4 )*
            {
             before(grammarAccess.getPrincipalAccess().getPoseeAssignment_4()); 
            // InternalApe_4B.g:432:2: ( rule__Principal__PoseeAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalApe_4B.g:432:3: rule__Principal__PoseeAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Principal__PoseeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPrincipalAccess().getPoseeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__4__Impl"


    // $ANTLR start "rule__Principal__Group__5"
    // InternalApe_4B.g:440:1: rule__Principal__Group__5 : rule__Principal__Group__5__Impl ;
    public final void rule__Principal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:444:1: ( rule__Principal__Group__5__Impl )
            // InternalApe_4B.g:445:2: rule__Principal__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__5"


    // $ANTLR start "rule__Principal__Group__5__Impl"
    // InternalApe_4B.g:451:1: rule__Principal__Group__5__Impl : ( '}' ) ;
    public final void rule__Principal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:455:1: ( ( '}' ) )
            // InternalApe_4B.g:456:1: ( '}' )
            {
            // InternalApe_4B.g:456:1: ( '}' )
            // InternalApe_4B.g:457:2: '}'
            {
             before(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalApe_4B.g:467:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:471:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalApe_4B.g:472:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalApe_4B.g:479:1: rule__Entidad__Group__0__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:483:1: ( ( 'Entidad' ) )
            // InternalApe_4B.g:484:1: ( 'Entidad' )
            {
            // InternalApe_4B.g:484:1: ( 'Entidad' )
            // InternalApe_4B.g:485:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalApe_4B.g:494:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:498:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalApe_4B.g:499:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalApe_4B.g:506:1: rule__Entidad__Group__1__Impl : ( ( rule__Entidad__NameAssignment_1 ) ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:510:1: ( ( ( rule__Entidad__NameAssignment_1 ) ) )
            // InternalApe_4B.g:511:1: ( ( rule__Entidad__NameAssignment_1 ) )
            {
            // InternalApe_4B.g:511:1: ( ( rule__Entidad__NameAssignment_1 ) )
            // InternalApe_4B.g:512:2: ( rule__Entidad__NameAssignment_1 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_1()); 
            // InternalApe_4B.g:513:2: ( rule__Entidad__NameAssignment_1 )
            // InternalApe_4B.g:513:3: rule__Entidad__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalApe_4B.g:521:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:525:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalApe_4B.g:526:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalApe_4B.g:533:1: rule__Entidad__Group__2__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:537:1: ( ( '{' ) )
            // InternalApe_4B.g:538:1: ( '{' )
            {
            // InternalApe_4B.g:538:1: ( '{' )
            // InternalApe_4B.g:539:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalApe_4B.g:548:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:552:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalApe_4B.g:553:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalApe_4B.g:560:1: rule__Entidad__Group__3__Impl : ( ( rule__Entidad__ContieneAssignment_3 ) ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:564:1: ( ( ( rule__Entidad__ContieneAssignment_3 ) ) )
            // InternalApe_4B.g:565:1: ( ( rule__Entidad__ContieneAssignment_3 ) )
            {
            // InternalApe_4B.g:565:1: ( ( rule__Entidad__ContieneAssignment_3 ) )
            // InternalApe_4B.g:566:2: ( rule__Entidad__ContieneAssignment_3 )
            {
             before(grammarAccess.getEntidadAccess().getContieneAssignment_3()); 
            // InternalApe_4B.g:567:2: ( rule__Entidad__ContieneAssignment_3 )
            // InternalApe_4B.g:567:3: rule__Entidad__ContieneAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__ContieneAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getContieneAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalApe_4B.g:575:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:579:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalApe_4B.g:580:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalApe_4B.g:587:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__ContieneAssignment_4 )* ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:591:1: ( ( ( rule__Entidad__ContieneAssignment_4 )* ) )
            // InternalApe_4B.g:592:1: ( ( rule__Entidad__ContieneAssignment_4 )* )
            {
            // InternalApe_4B.g:592:1: ( ( rule__Entidad__ContieneAssignment_4 )* )
            // InternalApe_4B.g:593:2: ( rule__Entidad__ContieneAssignment_4 )*
            {
             before(grammarAccess.getEntidadAccess().getContieneAssignment_4()); 
            // InternalApe_4B.g:594:2: ( rule__Entidad__ContieneAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalApe_4B.g:594:3: rule__Entidad__ContieneAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entidad__ContieneAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getContieneAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalApe_4B.g:602:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl rule__Entidad__Group__6 ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:606:1: ( rule__Entidad__Group__5__Impl rule__Entidad__Group__6 )
            // InternalApe_4B.g:607:2: rule__Entidad__Group__5__Impl rule__Entidad__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalApe_4B.g:614:1: rule__Entidad__Group__5__Impl : ( ( rule__Entidad__Group_5__0 )? ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:618:1: ( ( ( rule__Entidad__Group_5__0 )? ) )
            // InternalApe_4B.g:619:1: ( ( rule__Entidad__Group_5__0 )? )
            {
            // InternalApe_4B.g:619:1: ( ( rule__Entidad__Group_5__0 )? )
            // InternalApe_4B.g:620:2: ( rule__Entidad__Group_5__0 )?
            {
             before(grammarAccess.getEntidadAccess().getGroup_5()); 
            // InternalApe_4B.g:621:2: ( rule__Entidad__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalApe_4B.g:621:3: rule__Entidad__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entidad__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntidadAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group__6"
    // InternalApe_4B.g:629:1: rule__Entidad__Group__6 : rule__Entidad__Group__6__Impl ;
    public final void rule__Entidad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:633:1: ( rule__Entidad__Group__6__Impl )
            // InternalApe_4B.g:634:2: rule__Entidad__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__6"


    // $ANTLR start "rule__Entidad__Group__6__Impl"
    // InternalApe_4B.g:640:1: rule__Entidad__Group__6__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:644:1: ( ( '}' ) )
            // InternalApe_4B.g:645:1: ( '}' )
            {
            // InternalApe_4B.g:645:1: ( '}' )
            // InternalApe_4B.g:646:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__6__Impl"


    // $ANTLR start "rule__Entidad__Group_5__0"
    // InternalApe_4B.g:656:1: rule__Entidad__Group_5__0 : rule__Entidad__Group_5__0__Impl rule__Entidad__Group_5__1 ;
    public final void rule__Entidad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:660:1: ( rule__Entidad__Group_5__0__Impl rule__Entidad__Group_5__1 )
            // InternalApe_4B.g:661:2: rule__Entidad__Group_5__0__Impl rule__Entidad__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__0"


    // $ANTLR start "rule__Entidad__Group_5__0__Impl"
    // InternalApe_4B.g:668:1: rule__Entidad__Group_5__0__Impl : ( 'redirige:' ) ;
    public final void rule__Entidad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:672:1: ( ( 'redirige:' ) )
            // InternalApe_4B.g:673:1: ( 'redirige:' )
            {
            // InternalApe_4B.g:673:1: ( 'redirige:' )
            // InternalApe_4B.g:674:2: 'redirige:'
            {
             before(grammarAccess.getEntidadAccess().getRedirigeKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRedirigeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__0__Impl"


    // $ANTLR start "rule__Entidad__Group_5__1"
    // InternalApe_4B.g:683:1: rule__Entidad__Group_5__1 : rule__Entidad__Group_5__1__Impl rule__Entidad__Group_5__2 ;
    public final void rule__Entidad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:687:1: ( rule__Entidad__Group_5__1__Impl rule__Entidad__Group_5__2 )
            // InternalApe_4B.g:688:2: rule__Entidad__Group_5__1__Impl rule__Entidad__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Entidad__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__1"


    // $ANTLR start "rule__Entidad__Group_5__1__Impl"
    // InternalApe_4B.g:695:1: rule__Entidad__Group_5__1__Impl : ( ( rule__Entidad__RedirigeAssignment_5_1 ) ) ;
    public final void rule__Entidad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:699:1: ( ( ( rule__Entidad__RedirigeAssignment_5_1 ) ) )
            // InternalApe_4B.g:700:1: ( ( rule__Entidad__RedirigeAssignment_5_1 ) )
            {
            // InternalApe_4B.g:700:1: ( ( rule__Entidad__RedirigeAssignment_5_1 ) )
            // InternalApe_4B.g:701:2: ( rule__Entidad__RedirigeAssignment_5_1 )
            {
             before(grammarAccess.getEntidadAccess().getRedirigeAssignment_5_1()); 
            // InternalApe_4B.g:702:2: ( rule__Entidad__RedirigeAssignment_5_1 )
            // InternalApe_4B.g:702:3: rule__Entidad__RedirigeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__RedirigeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getRedirigeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__1__Impl"


    // $ANTLR start "rule__Entidad__Group_5__2"
    // InternalApe_4B.g:710:1: rule__Entidad__Group_5__2 : rule__Entidad__Group_5__2__Impl ;
    public final void rule__Entidad__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:714:1: ( rule__Entidad__Group_5__2__Impl )
            // InternalApe_4B.g:715:2: rule__Entidad__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__2"


    // $ANTLR start "rule__Entidad__Group_5__2__Impl"
    // InternalApe_4B.g:721:1: rule__Entidad__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Entidad__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:725:1: ( ( ';' ) )
            // InternalApe_4B.g:726:1: ( ';' )
            {
            // InternalApe_4B.g:726:1: ( ';' )
            // InternalApe_4B.g:727:2: ';'
            {
             before(grammarAccess.getEntidadAccess().getSemicolonKeyword_5_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getSemicolonKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_5__2__Impl"


    // $ANTLR start "rule__Atributo__Group__0"
    // InternalApe_4B.g:737:1: rule__Atributo__Group__0 : rule__Atributo__Group__0__Impl rule__Atributo__Group__1 ;
    public final void rule__Atributo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:741:1: ( rule__Atributo__Group__0__Impl rule__Atributo__Group__1 )
            // InternalApe_4B.g:742:2: rule__Atributo__Group__0__Impl rule__Atributo__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Atributo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0"


    // $ANTLR start "rule__Atributo__Group__0__Impl"
    // InternalApe_4B.g:749:1: rule__Atributo__Group__0__Impl : ( ( rule__Atributo__NameAssignment_0 ) ) ;
    public final void rule__Atributo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:753:1: ( ( ( rule__Atributo__NameAssignment_0 ) ) )
            // InternalApe_4B.g:754:1: ( ( rule__Atributo__NameAssignment_0 ) )
            {
            // InternalApe_4B.g:754:1: ( ( rule__Atributo__NameAssignment_0 ) )
            // InternalApe_4B.g:755:2: ( rule__Atributo__NameAssignment_0 )
            {
             before(grammarAccess.getAtributoAccess().getNameAssignment_0()); 
            // InternalApe_4B.g:756:2: ( rule__Atributo__NameAssignment_0 )
            // InternalApe_4B.g:756:3: rule__Atributo__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__0__Impl"


    // $ANTLR start "rule__Atributo__Group__1"
    // InternalApe_4B.g:764:1: rule__Atributo__Group__1 : rule__Atributo__Group__1__Impl rule__Atributo__Group__2 ;
    public final void rule__Atributo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:768:1: ( rule__Atributo__Group__1__Impl rule__Atributo__Group__2 )
            // InternalApe_4B.g:769:2: rule__Atributo__Group__1__Impl rule__Atributo__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Atributo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1"


    // $ANTLR start "rule__Atributo__Group__1__Impl"
    // InternalApe_4B.g:776:1: rule__Atributo__Group__1__Impl : ( ( rule__Atributo__TipoDatoAssignment_1 ) ) ;
    public final void rule__Atributo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:780:1: ( ( ( rule__Atributo__TipoDatoAssignment_1 ) ) )
            // InternalApe_4B.g:781:1: ( ( rule__Atributo__TipoDatoAssignment_1 ) )
            {
            // InternalApe_4B.g:781:1: ( ( rule__Atributo__TipoDatoAssignment_1 ) )
            // InternalApe_4B.g:782:2: ( rule__Atributo__TipoDatoAssignment_1 )
            {
             before(grammarAccess.getAtributoAccess().getTipoDatoAssignment_1()); 
            // InternalApe_4B.g:783:2: ( rule__Atributo__TipoDatoAssignment_1 )
            // InternalApe_4B.g:783:3: rule__Atributo__TipoDatoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__TipoDatoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getTipoDatoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__1__Impl"


    // $ANTLR start "rule__Atributo__Group__2"
    // InternalApe_4B.g:791:1: rule__Atributo__Group__2 : rule__Atributo__Group__2__Impl rule__Atributo__Group__3 ;
    public final void rule__Atributo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:795:1: ( rule__Atributo__Group__2__Impl rule__Atributo__Group__3 )
            // InternalApe_4B.g:796:2: rule__Atributo__Group__2__Impl rule__Atributo__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Atributo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atributo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2"


    // $ANTLR start "rule__Atributo__Group__2__Impl"
    // InternalApe_4B.g:803:1: rule__Atributo__Group__2__Impl : ( ( rule__Atributo__LongitudAssignment_2 )? ) ;
    public final void rule__Atributo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:807:1: ( ( ( rule__Atributo__LongitudAssignment_2 )? ) )
            // InternalApe_4B.g:808:1: ( ( rule__Atributo__LongitudAssignment_2 )? )
            {
            // InternalApe_4B.g:808:1: ( ( rule__Atributo__LongitudAssignment_2 )? )
            // InternalApe_4B.g:809:2: ( rule__Atributo__LongitudAssignment_2 )?
            {
             before(grammarAccess.getAtributoAccess().getLongitudAssignment_2()); 
            // InternalApe_4B.g:810:2: ( rule__Atributo__LongitudAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalApe_4B.g:810:3: rule__Atributo__LongitudAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo__LongitudAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getLongitudAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__2__Impl"


    // $ANTLR start "rule__Atributo__Group__3"
    // InternalApe_4B.g:818:1: rule__Atributo__Group__3 : rule__Atributo__Group__3__Impl ;
    public final void rule__Atributo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:822:1: ( rule__Atributo__Group__3__Impl )
            // InternalApe_4B.g:823:2: rule__Atributo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3"


    // $ANTLR start "rule__Atributo__Group__3__Impl"
    // InternalApe_4B.g:829:1: rule__Atributo__Group__3__Impl : ( ( rule__Atributo__RequeridoAssignment_3 )? ) ;
    public final void rule__Atributo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:833:1: ( ( ( rule__Atributo__RequeridoAssignment_3 )? ) )
            // InternalApe_4B.g:834:1: ( ( rule__Atributo__RequeridoAssignment_3 )? )
            {
            // InternalApe_4B.g:834:1: ( ( rule__Atributo__RequeridoAssignment_3 )? )
            // InternalApe_4B.g:835:2: ( rule__Atributo__RequeridoAssignment_3 )?
            {
             before(grammarAccess.getAtributoAccess().getRequeridoAssignment_3()); 
            // InternalApe_4B.g:836:2: ( rule__Atributo__RequeridoAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalApe_4B.g:836:3: rule__Atributo__RequeridoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atributo__RequeridoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtributoAccess().getRequeridoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalApe_4B.g:845:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:849:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalApe_4B.g:850:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalApe_4B.g:857:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:861:1: ( ( ( '-' )? ) )
            // InternalApe_4B.g:862:1: ( ( '-' )? )
            {
            // InternalApe_4B.g:862:1: ( ( '-' )? )
            // InternalApe_4B.g:863:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalApe_4B.g:864:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalApe_4B.g:864:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalApe_4B.g:872:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:876:1: ( rule__EInt__Group__1__Impl )
            // InternalApe_4B.g:877:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalApe_4B.g:883:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:887:1: ( ( RULE_INT ) )
            // InternalApe_4B.g:888:1: ( RULE_INT )
            {
            // InternalApe_4B.g:888:1: ( RULE_INT )
            // InternalApe_4B.g:889:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Principal__NameAssignment_1"
    // InternalApe_4B.g:899:1: rule__Principal__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Principal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:903:1: ( ( ruleEString ) )
            // InternalApe_4B.g:904:2: ( ruleEString )
            {
            // InternalApe_4B.g:904:2: ( ruleEString )
            // InternalApe_4B.g:905:3: ruleEString
            {
             before(grammarAccess.getPrincipalAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__NameAssignment_1"


    // $ANTLR start "rule__Principal__PoseeAssignment_3"
    // InternalApe_4B.g:914:1: rule__Principal__PoseeAssignment_3 : ( ruleEntidad ) ;
    public final void rule__Principal__PoseeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:918:1: ( ( ruleEntidad ) )
            // InternalApe_4B.g:919:2: ( ruleEntidad )
            {
            // InternalApe_4B.g:919:2: ( ruleEntidad )
            // InternalApe_4B.g:920:3: ruleEntidad
            {
             before(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__PoseeAssignment_3"


    // $ANTLR start "rule__Principal__PoseeAssignment_4"
    // InternalApe_4B.g:929:1: rule__Principal__PoseeAssignment_4 : ( ruleEntidad ) ;
    public final void rule__Principal__PoseeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:933:1: ( ( ruleEntidad ) )
            // InternalApe_4B.g:934:2: ( ruleEntidad )
            {
            // InternalApe_4B.g:934:2: ( ruleEntidad )
            // InternalApe_4B.g:935:3: ruleEntidad
            {
             before(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getPoseeEntidadParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__PoseeAssignment_4"


    // $ANTLR start "rule__Entidad__NameAssignment_1"
    // InternalApe_4B.g:944:1: rule__Entidad__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:948:1: ( ( ruleEString ) )
            // InternalApe_4B.g:949:2: ( ruleEString )
            {
            // InternalApe_4B.g:949:2: ( ruleEString )
            // InternalApe_4B.g:950:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_1"


    // $ANTLR start "rule__Entidad__ContieneAssignment_3"
    // InternalApe_4B.g:959:1: rule__Entidad__ContieneAssignment_3 : ( ruleAtributo ) ;
    public final void rule__Entidad__ContieneAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:963:1: ( ( ruleAtributo ) )
            // InternalApe_4B.g:964:2: ( ruleAtributo )
            {
            // InternalApe_4B.g:964:2: ( ruleAtributo )
            // InternalApe_4B.g:965:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__ContieneAssignment_3"


    // $ANTLR start "rule__Entidad__ContieneAssignment_4"
    // InternalApe_4B.g:974:1: rule__Entidad__ContieneAssignment_4 : ( ruleAtributo ) ;
    public final void rule__Entidad__ContieneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:978:1: ( ( ruleAtributo ) )
            // InternalApe_4B.g:979:2: ( ruleAtributo )
            {
            // InternalApe_4B.g:979:2: ( ruleAtributo )
            // InternalApe_4B.g:980:3: ruleAtributo
            {
             before(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getContieneAtributoParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__ContieneAssignment_4"


    // $ANTLR start "rule__Entidad__RedirigeAssignment_5_1"
    // InternalApe_4B.g:989:1: rule__Entidad__RedirigeAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Entidad__RedirigeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:993:1: ( ( ( ruleEString ) ) )
            // InternalApe_4B.g:994:2: ( ( ruleEString ) )
            {
            // InternalApe_4B.g:994:2: ( ( ruleEString ) )
            // InternalApe_4B.g:995:3: ( ruleEString )
            {
             before(grammarAccess.getEntidadAccess().getRedirigeEntidadCrossReference_5_1_0()); 
            // InternalApe_4B.g:996:3: ( ruleEString )
            // InternalApe_4B.g:997:4: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getRedirigeEntidadEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getRedirigeEntidadEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getEntidadAccess().getRedirigeEntidadCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__RedirigeAssignment_5_1"


    // $ANTLR start "rule__Atributo__NameAssignment_0"
    // InternalApe_4B.g:1008:1: rule__Atributo__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Atributo__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:1012:1: ( ( ruleEString ) )
            // InternalApe_4B.g:1013:2: ( ruleEString )
            {
            // InternalApe_4B.g:1013:2: ( ruleEString )
            // InternalApe_4B.g:1014:3: ruleEString
            {
             before(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__NameAssignment_0"


    // $ANTLR start "rule__Atributo__TipoDatoAssignment_1"
    // InternalApe_4B.g:1023:1: rule__Atributo__TipoDatoAssignment_1 : ( ruleTipoDato ) ;
    public final void rule__Atributo__TipoDatoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:1027:1: ( ( ruleTipoDato ) )
            // InternalApe_4B.g:1028:2: ( ruleTipoDato )
            {
            // InternalApe_4B.g:1028:2: ( ruleTipoDato )
            // InternalApe_4B.g:1029:3: ruleTipoDato
            {
             before(grammarAccess.getAtributoAccess().getTipoDatoTipoDatoEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getTipoDatoTipoDatoEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__TipoDatoAssignment_1"


    // $ANTLR start "rule__Atributo__LongitudAssignment_2"
    // InternalApe_4B.g:1038:1: rule__Atributo__LongitudAssignment_2 : ( ruleEInt ) ;
    public final void rule__Atributo__LongitudAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:1042:1: ( ( ruleEInt ) )
            // InternalApe_4B.g:1043:2: ( ruleEInt )
            {
            // InternalApe_4B.g:1043:2: ( ruleEInt )
            // InternalApe_4B.g:1044:3: ruleEInt
            {
             before(grammarAccess.getAtributoAccess().getLongitudEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getLongitudEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__LongitudAssignment_2"


    // $ANTLR start "rule__Atributo__RequeridoAssignment_3"
    // InternalApe_4B.g:1053:1: rule__Atributo__RequeridoAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__Atributo__RequeridoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalApe_4B.g:1057:1: ( ( ruleEBoolean ) )
            // InternalApe_4B.g:1058:2: ( ruleEBoolean )
            {
            // InternalApe_4B.g:1058:2: ( ruleEBoolean )
            // InternalApe_4B.g:1059:3: ruleEBoolean
            {
             before(grammarAccess.getAtributoAccess().getRequeridoEBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAtributoAccess().getRequeridoEBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__RequeridoAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002001840L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000040L});

}