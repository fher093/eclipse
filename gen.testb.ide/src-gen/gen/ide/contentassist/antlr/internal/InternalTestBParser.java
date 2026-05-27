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
import gen.services.TestBGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestBParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'APE'", "'ACD'", "'AA'", "'Principal'", "'{'", "'}'", "'materia'", "','", "'docente'", "'|'", "'('", "')'", "'dicta'"
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

    	public void setGrammarAccess(TestBGrammarAccess grammarAccess) {
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
    // InternalTestB.g:53:1: entryRulePrincipal : rulePrincipal EOF ;
    public final void entryRulePrincipal() throws RecognitionException {
        try {
            // InternalTestB.g:54:1: ( rulePrincipal EOF )
            // InternalTestB.g:55:1: rulePrincipal EOF
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
    // InternalTestB.g:62:1: rulePrincipal : ( ( rule__Principal__Group__0 ) ) ;
    public final void rulePrincipal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:66:2: ( ( ( rule__Principal__Group__0 ) ) )
            // InternalTestB.g:67:2: ( ( rule__Principal__Group__0 ) )
            {
            // InternalTestB.g:67:2: ( ( rule__Principal__Group__0 ) )
            // InternalTestB.g:68:3: ( rule__Principal__Group__0 )
            {
             before(grammarAccess.getPrincipalAccess().getGroup()); 
            // InternalTestB.g:69:3: ( rule__Principal__Group__0 )
            // InternalTestB.g:69:4: rule__Principal__Group__0
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
    // InternalTestB.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTestB.g:79:1: ( ruleEString EOF )
            // InternalTestB.g:80:1: ruleEString EOF
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
    // InternalTestB.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTestB.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTestB.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalTestB.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTestB.g:94:3: ( rule__EString__Alternatives )
            // InternalTestB.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleMateria"
    // InternalTestB.g:103:1: entryRuleMateria : ruleMateria EOF ;
    public final void entryRuleMateria() throws RecognitionException {
        try {
            // InternalTestB.g:104:1: ( ruleMateria EOF )
            // InternalTestB.g:105:1: ruleMateria EOF
            {
             before(grammarAccess.getMateriaRule()); 
            pushFollow(FOLLOW_1);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getMateriaRule()); 
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
    // $ANTLR end "entryRuleMateria"


    // $ANTLR start "ruleMateria"
    // InternalTestB.g:112:1: ruleMateria : ( ( rule__Materia__Group__0 ) ) ;
    public final void ruleMateria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:116:2: ( ( ( rule__Materia__Group__0 ) ) )
            // InternalTestB.g:117:2: ( ( rule__Materia__Group__0 ) )
            {
            // InternalTestB.g:117:2: ( ( rule__Materia__Group__0 ) )
            // InternalTestB.g:118:3: ( rule__Materia__Group__0 )
            {
             before(grammarAccess.getMateriaAccess().getGroup()); 
            // InternalTestB.g:119:3: ( rule__Materia__Group__0 )
            // InternalTestB.g:119:4: rule__Materia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Materia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getGroup()); 

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
    // $ANTLR end "ruleMateria"


    // $ANTLR start "entryRuleDocente"
    // InternalTestB.g:128:1: entryRuleDocente : ruleDocente EOF ;
    public final void entryRuleDocente() throws RecognitionException {
        try {
            // InternalTestB.g:129:1: ( ruleDocente EOF )
            // InternalTestB.g:130:1: ruleDocente EOF
            {
             before(grammarAccess.getDocenteRule()); 
            pushFollow(FOLLOW_1);
            ruleDocente();

            state._fsp--;

             after(grammarAccess.getDocenteRule()); 
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
    // $ANTLR end "entryRuleDocente"


    // $ANTLR start "ruleDocente"
    // InternalTestB.g:137:1: ruleDocente : ( ( rule__Docente__Group__0 ) ) ;
    public final void ruleDocente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:141:2: ( ( ( rule__Docente__Group__0 ) ) )
            // InternalTestB.g:142:2: ( ( rule__Docente__Group__0 ) )
            {
            // InternalTestB.g:142:2: ( ( rule__Docente__Group__0 ) )
            // InternalTestB.g:143:3: ( rule__Docente__Group__0 )
            {
             before(grammarAccess.getDocenteAccess().getGroup()); 
            // InternalTestB.g:144:3: ( rule__Docente__Group__0 )
            // InternalTestB.g:144:4: rule__Docente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Docente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocenteAccess().getGroup()); 

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
    // $ANTLR end "ruleDocente"


    // $ANTLR start "entryRuleTarea"
    // InternalTestB.g:153:1: entryRuleTarea : ruleTarea EOF ;
    public final void entryRuleTarea() throws RecognitionException {
        try {
            // InternalTestB.g:154:1: ( ruleTarea EOF )
            // InternalTestB.g:155:1: ruleTarea EOF
            {
             before(grammarAccess.getTareaRule()); 
            pushFollow(FOLLOW_1);
            ruleTarea();

            state._fsp--;

             after(grammarAccess.getTareaRule()); 
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
    // $ANTLR end "entryRuleTarea"


    // $ANTLR start "ruleTarea"
    // InternalTestB.g:162:1: ruleTarea : ( ( rule__Tarea__Group__0 ) ) ;
    public final void ruleTarea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:166:2: ( ( ( rule__Tarea__Group__0 ) ) )
            // InternalTestB.g:167:2: ( ( rule__Tarea__Group__0 ) )
            {
            // InternalTestB.g:167:2: ( ( rule__Tarea__Group__0 ) )
            // InternalTestB.g:168:3: ( rule__Tarea__Group__0 )
            {
             before(grammarAccess.getTareaAccess().getGroup()); 
            // InternalTestB.g:169:3: ( rule__Tarea__Group__0 )
            // InternalTestB.g:169:4: rule__Tarea__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tarea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTareaAccess().getGroup()); 

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
    // $ANTLR end "ruleTarea"


    // $ANTLR start "ruleTipoCalificacion"
    // InternalTestB.g:178:1: ruleTipoCalificacion : ( ( rule__TipoCalificacion__Alternatives ) ) ;
    public final void ruleTipoCalificacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:182:1: ( ( ( rule__TipoCalificacion__Alternatives ) ) )
            // InternalTestB.g:183:2: ( ( rule__TipoCalificacion__Alternatives ) )
            {
            // InternalTestB.g:183:2: ( ( rule__TipoCalificacion__Alternatives ) )
            // InternalTestB.g:184:3: ( rule__TipoCalificacion__Alternatives )
            {
             before(grammarAccess.getTipoCalificacionAccess().getAlternatives()); 
            // InternalTestB.g:185:3: ( rule__TipoCalificacion__Alternatives )
            // InternalTestB.g:185:4: rule__TipoCalificacion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoCalificacion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoCalificacionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipoCalificacion"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTestB.g:193:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:197:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalTestB.g:198:2: ( RULE_STRING )
                    {
                    // InternalTestB.g:198:2: ( RULE_STRING )
                    // InternalTestB.g:199:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestB.g:204:2: ( RULE_ID )
                    {
                    // InternalTestB.g:204:2: ( RULE_ID )
                    // InternalTestB.g:205:3: RULE_ID
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


    // $ANTLR start "rule__TipoCalificacion__Alternatives"
    // InternalTestB.g:214:1: rule__TipoCalificacion__Alternatives : ( ( ( 'APE' ) ) | ( ( 'ACD' ) ) | ( ( 'AA' ) ) );
    public final void rule__TipoCalificacion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:218:1: ( ( ( 'APE' ) ) | ( ( 'ACD' ) ) | ( ( 'AA' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTestB.g:219:2: ( ( 'APE' ) )
                    {
                    // InternalTestB.g:219:2: ( ( 'APE' ) )
                    // InternalTestB.g:220:3: ( 'APE' )
                    {
                     before(grammarAccess.getTipoCalificacionAccess().getAPEEnumLiteralDeclaration_0()); 
                    // InternalTestB.g:221:3: ( 'APE' )
                    // InternalTestB.g:221:4: 'APE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoCalificacionAccess().getAPEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestB.g:225:2: ( ( 'ACD' ) )
                    {
                    // InternalTestB.g:225:2: ( ( 'ACD' ) )
                    // InternalTestB.g:226:3: ( 'ACD' )
                    {
                     before(grammarAccess.getTipoCalificacionAccess().getACDEnumLiteralDeclaration_1()); 
                    // InternalTestB.g:227:3: ( 'ACD' )
                    // InternalTestB.g:227:4: 'ACD'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoCalificacionAccess().getACDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestB.g:231:2: ( ( 'AA' ) )
                    {
                    // InternalTestB.g:231:2: ( ( 'AA' ) )
                    // InternalTestB.g:232:3: ( 'AA' )
                    {
                     before(grammarAccess.getTipoCalificacionAccess().getAAEnumLiteralDeclaration_2()); 
                    // InternalTestB.g:233:3: ( 'AA' )
                    // InternalTestB.g:233:4: 'AA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoCalificacionAccess().getAAEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TipoCalificacion__Alternatives"


    // $ANTLR start "rule__Principal__Group__0"
    // InternalTestB.g:241:1: rule__Principal__Group__0 : rule__Principal__Group__0__Impl rule__Principal__Group__1 ;
    public final void rule__Principal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:245:1: ( rule__Principal__Group__0__Impl rule__Principal__Group__1 )
            // InternalTestB.g:246:2: rule__Principal__Group__0__Impl rule__Principal__Group__1
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
    // InternalTestB.g:253:1: rule__Principal__Group__0__Impl : ( 'Principal' ) ;
    public final void rule__Principal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:257:1: ( ( 'Principal' ) )
            // InternalTestB.g:258:1: ( 'Principal' )
            {
            // InternalTestB.g:258:1: ( 'Principal' )
            // InternalTestB.g:259:2: 'Principal'
            {
             before(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalTestB.g:268:1: rule__Principal__Group__1 : rule__Principal__Group__1__Impl rule__Principal__Group__2 ;
    public final void rule__Principal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:272:1: ( rule__Principal__Group__1__Impl rule__Principal__Group__2 )
            // InternalTestB.g:273:2: rule__Principal__Group__1__Impl rule__Principal__Group__2
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
    // InternalTestB.g:280:1: rule__Principal__Group__1__Impl : ( ( rule__Principal__NameAssignment_1 ) ) ;
    public final void rule__Principal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:284:1: ( ( ( rule__Principal__NameAssignment_1 ) ) )
            // InternalTestB.g:285:1: ( ( rule__Principal__NameAssignment_1 ) )
            {
            // InternalTestB.g:285:1: ( ( rule__Principal__NameAssignment_1 ) )
            // InternalTestB.g:286:2: ( rule__Principal__NameAssignment_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 
            // InternalTestB.g:287:2: ( rule__Principal__NameAssignment_1 )
            // InternalTestB.g:287:3: rule__Principal__NameAssignment_1
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
    // InternalTestB.g:295:1: rule__Principal__Group__2 : rule__Principal__Group__2__Impl rule__Principal__Group__3 ;
    public final void rule__Principal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:299:1: ( rule__Principal__Group__2__Impl rule__Principal__Group__3 )
            // InternalTestB.g:300:2: rule__Principal__Group__2__Impl rule__Principal__Group__3
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
    // InternalTestB.g:307:1: rule__Principal__Group__2__Impl : ( '{' ) ;
    public final void rule__Principal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:311:1: ( ( '{' ) )
            // InternalTestB.g:312:1: ( '{' )
            {
            // InternalTestB.g:312:1: ( '{' )
            // InternalTestB.g:313:2: '{'
            {
             before(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTestB.g:322:1: rule__Principal__Group__3 : rule__Principal__Group__3__Impl rule__Principal__Group__4 ;
    public final void rule__Principal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:326:1: ( rule__Principal__Group__3__Impl rule__Principal__Group__4 )
            // InternalTestB.g:327:2: rule__Principal__Group__3__Impl rule__Principal__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalTestB.g:334:1: rule__Principal__Group__3__Impl : ( ( rule__Principal__Group_3__0 )? ) ;
    public final void rule__Principal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:338:1: ( ( ( rule__Principal__Group_3__0 )? ) )
            // InternalTestB.g:339:1: ( ( rule__Principal__Group_3__0 )? )
            {
            // InternalTestB.g:339:1: ( ( rule__Principal__Group_3__0 )? )
            // InternalTestB.g:340:2: ( rule__Principal__Group_3__0 )?
            {
             before(grammarAccess.getPrincipalAccess().getGroup_3()); 
            // InternalTestB.g:341:2: ( rule__Principal__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTestB.g:341:3: rule__Principal__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getGroup_3()); 

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
    // InternalTestB.g:349:1: rule__Principal__Group__4 : rule__Principal__Group__4__Impl rule__Principal__Group__5 ;
    public final void rule__Principal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:353:1: ( rule__Principal__Group__4__Impl rule__Principal__Group__5 )
            // InternalTestB.g:354:2: rule__Principal__Group__4__Impl rule__Principal__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalTestB.g:361:1: rule__Principal__Group__4__Impl : ( ( rule__Principal__Group_4__0 )? ) ;
    public final void rule__Principal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:365:1: ( ( ( rule__Principal__Group_4__0 )? ) )
            // InternalTestB.g:366:1: ( ( rule__Principal__Group_4__0 )? )
            {
            // InternalTestB.g:366:1: ( ( rule__Principal__Group_4__0 )? )
            // InternalTestB.g:367:2: ( rule__Principal__Group_4__0 )?
            {
             before(grammarAccess.getPrincipalAccess().getGroup_4()); 
            // InternalTestB.g:368:2: ( rule__Principal__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTestB.g:368:3: rule__Principal__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getGroup_4()); 

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
    // InternalTestB.g:376:1: rule__Principal__Group__5 : rule__Principal__Group__5__Impl ;
    public final void rule__Principal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:380:1: ( rule__Principal__Group__5__Impl )
            // InternalTestB.g:381:2: rule__Principal__Group__5__Impl
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
    // InternalTestB.g:387:1: rule__Principal__Group__5__Impl : ( '}' ) ;
    public final void rule__Principal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:391:1: ( ( '}' ) )
            // InternalTestB.g:392:1: ( '}' )
            {
            // InternalTestB.g:392:1: ( '}' )
            // InternalTestB.g:393:2: '}'
            {
             before(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__Principal__Group_3__0"
    // InternalTestB.g:403:1: rule__Principal__Group_3__0 : rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1 ;
    public final void rule__Principal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:407:1: ( rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1 )
            // InternalTestB.g:408:2: rule__Principal__Group_3__0__Impl rule__Principal__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Principal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__1();

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
    // $ANTLR end "rule__Principal__Group_3__0"


    // $ANTLR start "rule__Principal__Group_3__0__Impl"
    // InternalTestB.g:415:1: rule__Principal__Group_3__0__Impl : ( 'materia' ) ;
    public final void rule__Principal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:419:1: ( ( 'materia' ) )
            // InternalTestB.g:420:1: ( 'materia' )
            {
            // InternalTestB.g:420:1: ( 'materia' )
            // InternalTestB.g:421:2: 'materia'
            {
             before(grammarAccess.getPrincipalAccess().getMateriaKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getMateriaKeyword_3_0()); 

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
    // $ANTLR end "rule__Principal__Group_3__0__Impl"


    // $ANTLR start "rule__Principal__Group_3__1"
    // InternalTestB.g:430:1: rule__Principal__Group_3__1 : rule__Principal__Group_3__1__Impl rule__Principal__Group_3__2 ;
    public final void rule__Principal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:434:1: ( rule__Principal__Group_3__1__Impl rule__Principal__Group_3__2 )
            // InternalTestB.g:435:2: rule__Principal__Group_3__1__Impl rule__Principal__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__2();

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
    // $ANTLR end "rule__Principal__Group_3__1"


    // $ANTLR start "rule__Principal__Group_3__1__Impl"
    // InternalTestB.g:442:1: rule__Principal__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Principal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:446:1: ( ( '{' ) )
            // InternalTestB.g:447:1: ( '{' )
            {
            // InternalTestB.g:447:1: ( '{' )
            // InternalTestB.g:448:2: '{'
            {
             before(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Principal__Group_3__1__Impl"


    // $ANTLR start "rule__Principal__Group_3__2"
    // InternalTestB.g:457:1: rule__Principal__Group_3__2 : rule__Principal__Group_3__2__Impl rule__Principal__Group_3__3 ;
    public final void rule__Principal__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:461:1: ( rule__Principal__Group_3__2__Impl rule__Principal__Group_3__3 )
            // InternalTestB.g:462:2: rule__Principal__Group_3__2__Impl rule__Principal__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__3();

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
    // $ANTLR end "rule__Principal__Group_3__2"


    // $ANTLR start "rule__Principal__Group_3__2__Impl"
    // InternalTestB.g:469:1: rule__Principal__Group_3__2__Impl : ( ( rule__Principal__MateriaAssignment_3_2 ) ) ;
    public final void rule__Principal__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:473:1: ( ( ( rule__Principal__MateriaAssignment_3_2 ) ) )
            // InternalTestB.g:474:1: ( ( rule__Principal__MateriaAssignment_3_2 ) )
            {
            // InternalTestB.g:474:1: ( ( rule__Principal__MateriaAssignment_3_2 ) )
            // InternalTestB.g:475:2: ( rule__Principal__MateriaAssignment_3_2 )
            {
             before(grammarAccess.getPrincipalAccess().getMateriaAssignment_3_2()); 
            // InternalTestB.g:476:2: ( rule__Principal__MateriaAssignment_3_2 )
            // InternalTestB.g:476:3: rule__Principal__MateriaAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Principal__MateriaAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getMateriaAssignment_3_2()); 

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
    // $ANTLR end "rule__Principal__Group_3__2__Impl"


    // $ANTLR start "rule__Principal__Group_3__3"
    // InternalTestB.g:484:1: rule__Principal__Group_3__3 : rule__Principal__Group_3__3__Impl rule__Principal__Group_3__4 ;
    public final void rule__Principal__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:488:1: ( rule__Principal__Group_3__3__Impl rule__Principal__Group_3__4 )
            // InternalTestB.g:489:2: rule__Principal__Group_3__3__Impl rule__Principal__Group_3__4
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__4();

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
    // $ANTLR end "rule__Principal__Group_3__3"


    // $ANTLR start "rule__Principal__Group_3__3__Impl"
    // InternalTestB.g:496:1: rule__Principal__Group_3__3__Impl : ( ( rule__Principal__Group_3_3__0 )* ) ;
    public final void rule__Principal__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:500:1: ( ( ( rule__Principal__Group_3_3__0 )* ) )
            // InternalTestB.g:501:1: ( ( rule__Principal__Group_3_3__0 )* )
            {
            // InternalTestB.g:501:1: ( ( rule__Principal__Group_3_3__0 )* )
            // InternalTestB.g:502:2: ( rule__Principal__Group_3_3__0 )*
            {
             before(grammarAccess.getPrincipalAccess().getGroup_3_3()); 
            // InternalTestB.g:503:2: ( rule__Principal__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTestB.g:503:3: rule__Principal__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Principal__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPrincipalAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Principal__Group_3__3__Impl"


    // $ANTLR start "rule__Principal__Group_3__4"
    // InternalTestB.g:511:1: rule__Principal__Group_3__4 : rule__Principal__Group_3__4__Impl ;
    public final void rule__Principal__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:515:1: ( rule__Principal__Group_3__4__Impl )
            // InternalTestB.g:516:2: rule__Principal__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_3__4__Impl();

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
    // $ANTLR end "rule__Principal__Group_3__4"


    // $ANTLR start "rule__Principal__Group_3__4__Impl"
    // InternalTestB.g:522:1: rule__Principal__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Principal__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:526:1: ( ( '}' ) )
            // InternalTestB.g:527:1: ( '}' )
            {
            // InternalTestB.g:527:1: ( '}' )
            // InternalTestB.g:528:2: '}'
            {
             before(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Principal__Group_3__4__Impl"


    // $ANTLR start "rule__Principal__Group_3_3__0"
    // InternalTestB.g:538:1: rule__Principal__Group_3_3__0 : rule__Principal__Group_3_3__0__Impl rule__Principal__Group_3_3__1 ;
    public final void rule__Principal__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:542:1: ( rule__Principal__Group_3_3__0__Impl rule__Principal__Group_3_3__1 )
            // InternalTestB.g:543:2: rule__Principal__Group_3_3__0__Impl rule__Principal__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_3_3__1();

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
    // $ANTLR end "rule__Principal__Group_3_3__0"


    // $ANTLR start "rule__Principal__Group_3_3__0__Impl"
    // InternalTestB.g:550:1: rule__Principal__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Principal__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:554:1: ( ( ',' ) )
            // InternalTestB.g:555:1: ( ',' )
            {
            // InternalTestB.g:555:1: ( ',' )
            // InternalTestB.g:556:2: ','
            {
             before(grammarAccess.getPrincipalAccess().getCommaKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Principal__Group_3_3__0__Impl"


    // $ANTLR start "rule__Principal__Group_3_3__1"
    // InternalTestB.g:565:1: rule__Principal__Group_3_3__1 : rule__Principal__Group_3_3__1__Impl ;
    public final void rule__Principal__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:569:1: ( rule__Principal__Group_3_3__1__Impl )
            // InternalTestB.g:570:2: rule__Principal__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Principal__Group_3_3__1"


    // $ANTLR start "rule__Principal__Group_3_3__1__Impl"
    // InternalTestB.g:576:1: rule__Principal__Group_3_3__1__Impl : ( ( rule__Principal__MateriaAssignment_3_3_1 ) ) ;
    public final void rule__Principal__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:580:1: ( ( ( rule__Principal__MateriaAssignment_3_3_1 ) ) )
            // InternalTestB.g:581:1: ( ( rule__Principal__MateriaAssignment_3_3_1 ) )
            {
            // InternalTestB.g:581:1: ( ( rule__Principal__MateriaAssignment_3_3_1 ) )
            // InternalTestB.g:582:2: ( rule__Principal__MateriaAssignment_3_3_1 )
            {
             before(grammarAccess.getPrincipalAccess().getMateriaAssignment_3_3_1()); 
            // InternalTestB.g:583:2: ( rule__Principal__MateriaAssignment_3_3_1 )
            // InternalTestB.g:583:3: rule__Principal__MateriaAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__MateriaAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getMateriaAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Principal__Group_3_3__1__Impl"


    // $ANTLR start "rule__Principal__Group_4__0"
    // InternalTestB.g:592:1: rule__Principal__Group_4__0 : rule__Principal__Group_4__0__Impl rule__Principal__Group_4__1 ;
    public final void rule__Principal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:596:1: ( rule__Principal__Group_4__0__Impl rule__Principal__Group_4__1 )
            // InternalTestB.g:597:2: rule__Principal__Group_4__0__Impl rule__Principal__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Principal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_4__1();

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
    // $ANTLR end "rule__Principal__Group_4__0"


    // $ANTLR start "rule__Principal__Group_4__0__Impl"
    // InternalTestB.g:604:1: rule__Principal__Group_4__0__Impl : ( 'docente' ) ;
    public final void rule__Principal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:608:1: ( ( 'docente' ) )
            // InternalTestB.g:609:1: ( 'docente' )
            {
            // InternalTestB.g:609:1: ( 'docente' )
            // InternalTestB.g:610:2: 'docente'
            {
             before(grammarAccess.getPrincipalAccess().getDocenteKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getDocenteKeyword_4_0()); 

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
    // $ANTLR end "rule__Principal__Group_4__0__Impl"


    // $ANTLR start "rule__Principal__Group_4__1"
    // InternalTestB.g:619:1: rule__Principal__Group_4__1 : rule__Principal__Group_4__1__Impl rule__Principal__Group_4__2 ;
    public final void rule__Principal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:623:1: ( rule__Principal__Group_4__1__Impl rule__Principal__Group_4__2 )
            // InternalTestB.g:624:2: rule__Principal__Group_4__1__Impl rule__Principal__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_4__2();

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
    // $ANTLR end "rule__Principal__Group_4__1"


    // $ANTLR start "rule__Principal__Group_4__1__Impl"
    // InternalTestB.g:631:1: rule__Principal__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Principal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:635:1: ( ( '{' ) )
            // InternalTestB.g:636:1: ( '{' )
            {
            // InternalTestB.g:636:1: ( '{' )
            // InternalTestB.g:637:2: '{'
            {
             before(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Principal__Group_4__1__Impl"


    // $ANTLR start "rule__Principal__Group_4__2"
    // InternalTestB.g:646:1: rule__Principal__Group_4__2 : rule__Principal__Group_4__2__Impl rule__Principal__Group_4__3 ;
    public final void rule__Principal__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:650:1: ( rule__Principal__Group_4__2__Impl rule__Principal__Group_4__3 )
            // InternalTestB.g:651:2: rule__Principal__Group_4__2__Impl rule__Principal__Group_4__3
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_4__3();

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
    // $ANTLR end "rule__Principal__Group_4__2"


    // $ANTLR start "rule__Principal__Group_4__2__Impl"
    // InternalTestB.g:658:1: rule__Principal__Group_4__2__Impl : ( ( rule__Principal__DocenteAssignment_4_2 ) ) ;
    public final void rule__Principal__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:662:1: ( ( ( rule__Principal__DocenteAssignment_4_2 ) ) )
            // InternalTestB.g:663:1: ( ( rule__Principal__DocenteAssignment_4_2 ) )
            {
            // InternalTestB.g:663:1: ( ( rule__Principal__DocenteAssignment_4_2 ) )
            // InternalTestB.g:664:2: ( rule__Principal__DocenteAssignment_4_2 )
            {
             before(grammarAccess.getPrincipalAccess().getDocenteAssignment_4_2()); 
            // InternalTestB.g:665:2: ( rule__Principal__DocenteAssignment_4_2 )
            // InternalTestB.g:665:3: rule__Principal__DocenteAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Principal__DocenteAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getDocenteAssignment_4_2()); 

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
    // $ANTLR end "rule__Principal__Group_4__2__Impl"


    // $ANTLR start "rule__Principal__Group_4__3"
    // InternalTestB.g:673:1: rule__Principal__Group_4__3 : rule__Principal__Group_4__3__Impl rule__Principal__Group_4__4 ;
    public final void rule__Principal__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:677:1: ( rule__Principal__Group_4__3__Impl rule__Principal__Group_4__4 )
            // InternalTestB.g:678:2: rule__Principal__Group_4__3__Impl rule__Principal__Group_4__4
            {
            pushFollow(FOLLOW_6);
            rule__Principal__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_4__4();

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
    // $ANTLR end "rule__Principal__Group_4__3"


    // $ANTLR start "rule__Principal__Group_4__3__Impl"
    // InternalTestB.g:685:1: rule__Principal__Group_4__3__Impl : ( ( rule__Principal__Group_4_3__0 )* ) ;
    public final void rule__Principal__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:689:1: ( ( ( rule__Principal__Group_4_3__0 )* ) )
            // InternalTestB.g:690:1: ( ( rule__Principal__Group_4_3__0 )* )
            {
            // InternalTestB.g:690:1: ( ( rule__Principal__Group_4_3__0 )* )
            // InternalTestB.g:691:2: ( rule__Principal__Group_4_3__0 )*
            {
             before(grammarAccess.getPrincipalAccess().getGroup_4_3()); 
            // InternalTestB.g:692:2: ( rule__Principal__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTestB.g:692:3: rule__Principal__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Principal__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPrincipalAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Principal__Group_4__3__Impl"


    // $ANTLR start "rule__Principal__Group_4__4"
    // InternalTestB.g:700:1: rule__Principal__Group_4__4 : rule__Principal__Group_4__4__Impl ;
    public final void rule__Principal__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:704:1: ( rule__Principal__Group_4__4__Impl )
            // InternalTestB.g:705:2: rule__Principal__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_4__4__Impl();

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
    // $ANTLR end "rule__Principal__Group_4__4"


    // $ANTLR start "rule__Principal__Group_4__4__Impl"
    // InternalTestB.g:711:1: rule__Principal__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Principal__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:715:1: ( ( '}' ) )
            // InternalTestB.g:716:1: ( '}' )
            {
            // InternalTestB.g:716:1: ( '}' )
            // InternalTestB.g:717:2: '}'
            {
             before(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Principal__Group_4__4__Impl"


    // $ANTLR start "rule__Principal__Group_4_3__0"
    // InternalTestB.g:727:1: rule__Principal__Group_4_3__0 : rule__Principal__Group_4_3__0__Impl rule__Principal__Group_4_3__1 ;
    public final void rule__Principal__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:731:1: ( rule__Principal__Group_4_3__0__Impl rule__Principal__Group_4_3__1 )
            // InternalTestB.g:732:2: rule__Principal__Group_4_3__0__Impl rule__Principal__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_4_3__1();

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
    // $ANTLR end "rule__Principal__Group_4_3__0"


    // $ANTLR start "rule__Principal__Group_4_3__0__Impl"
    // InternalTestB.g:739:1: rule__Principal__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Principal__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:743:1: ( ( ',' ) )
            // InternalTestB.g:744:1: ( ',' )
            {
            // InternalTestB.g:744:1: ( ',' )
            // InternalTestB.g:745:2: ','
            {
             before(grammarAccess.getPrincipalAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Principal__Group_4_3__0__Impl"


    // $ANTLR start "rule__Principal__Group_4_3__1"
    // InternalTestB.g:754:1: rule__Principal__Group_4_3__1 : rule__Principal__Group_4_3__1__Impl ;
    public final void rule__Principal__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:758:1: ( rule__Principal__Group_4_3__1__Impl )
            // InternalTestB.g:759:2: rule__Principal__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Principal__Group_4_3__1"


    // $ANTLR start "rule__Principal__Group_4_3__1__Impl"
    // InternalTestB.g:765:1: rule__Principal__Group_4_3__1__Impl : ( ( rule__Principal__DocenteAssignment_4_3_1 ) ) ;
    public final void rule__Principal__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:769:1: ( ( ( rule__Principal__DocenteAssignment_4_3_1 ) ) )
            // InternalTestB.g:770:1: ( ( rule__Principal__DocenteAssignment_4_3_1 ) )
            {
            // InternalTestB.g:770:1: ( ( rule__Principal__DocenteAssignment_4_3_1 ) )
            // InternalTestB.g:771:2: ( rule__Principal__DocenteAssignment_4_3_1 )
            {
             before(grammarAccess.getPrincipalAccess().getDocenteAssignment_4_3_1()); 
            // InternalTestB.g:772:2: ( rule__Principal__DocenteAssignment_4_3_1 )
            // InternalTestB.g:772:3: rule__Principal__DocenteAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__DocenteAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getDocenteAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Principal__Group_4_3__1__Impl"


    // $ANTLR start "rule__Materia__Group__0"
    // InternalTestB.g:781:1: rule__Materia__Group__0 : rule__Materia__Group__0__Impl rule__Materia__Group__1 ;
    public final void rule__Materia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:785:1: ( rule__Materia__Group__0__Impl rule__Materia__Group__1 )
            // InternalTestB.g:786:2: rule__Materia__Group__0__Impl rule__Materia__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Materia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__1();

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
    // $ANTLR end "rule__Materia__Group__0"


    // $ANTLR start "rule__Materia__Group__0__Impl"
    // InternalTestB.g:793:1: rule__Materia__Group__0__Impl : ( ( rule__Materia__NameAssignment_0 ) ) ;
    public final void rule__Materia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:797:1: ( ( ( rule__Materia__NameAssignment_0 ) ) )
            // InternalTestB.g:798:1: ( ( rule__Materia__NameAssignment_0 ) )
            {
            // InternalTestB.g:798:1: ( ( rule__Materia__NameAssignment_0 ) )
            // InternalTestB.g:799:2: ( rule__Materia__NameAssignment_0 )
            {
             before(grammarAccess.getMateriaAccess().getNameAssignment_0()); 
            // InternalTestB.g:800:2: ( rule__Materia__NameAssignment_0 )
            // InternalTestB.g:800:3: rule__Materia__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Materia__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Materia__Group__0__Impl"


    // $ANTLR start "rule__Materia__Group__1"
    // InternalTestB.g:808:1: rule__Materia__Group__1 : rule__Materia__Group__1__Impl rule__Materia__Group__2 ;
    public final void rule__Materia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:812:1: ( rule__Materia__Group__1__Impl rule__Materia__Group__2 )
            // InternalTestB.g:813:2: rule__Materia__Group__1__Impl rule__Materia__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Materia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__2();

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
    // $ANTLR end "rule__Materia__Group__1"


    // $ANTLR start "rule__Materia__Group__1__Impl"
    // InternalTestB.g:820:1: rule__Materia__Group__1__Impl : ( ( rule__Materia__Group_1__0 )? ) ;
    public final void rule__Materia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:824:1: ( ( ( rule__Materia__Group_1__0 )? ) )
            // InternalTestB.g:825:1: ( ( rule__Materia__Group_1__0 )? )
            {
            // InternalTestB.g:825:1: ( ( rule__Materia__Group_1__0 )? )
            // InternalTestB.g:826:2: ( rule__Materia__Group_1__0 )?
            {
             before(grammarAccess.getMateriaAccess().getGroup_1()); 
            // InternalTestB.g:827:2: ( rule__Materia__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=RULE_STRING && LA7_1<=RULE_ID)) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalTestB.g:827:3: rule__Materia__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Materia__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMateriaAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Materia__Group__1__Impl"


    // $ANTLR start "rule__Materia__Group__2"
    // InternalTestB.g:835:1: rule__Materia__Group__2 : rule__Materia__Group__2__Impl rule__Materia__Group__3 ;
    public final void rule__Materia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:839:1: ( rule__Materia__Group__2__Impl rule__Materia__Group__3 )
            // InternalTestB.g:840:2: rule__Materia__Group__2__Impl rule__Materia__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Materia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__3();

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
    // $ANTLR end "rule__Materia__Group__2"


    // $ANTLR start "rule__Materia__Group__2__Impl"
    // InternalTestB.g:847:1: rule__Materia__Group__2__Impl : ( '|' ) ;
    public final void rule__Materia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:851:1: ( ( '|' ) )
            // InternalTestB.g:852:1: ( '|' )
            {
            // InternalTestB.g:852:1: ( '|' )
            // InternalTestB.g:853:2: '|'
            {
             before(grammarAccess.getMateriaAccess().getVerticalLineKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMateriaAccess().getVerticalLineKeyword_2()); 

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
    // $ANTLR end "rule__Materia__Group__2__Impl"


    // $ANTLR start "rule__Materia__Group__3"
    // InternalTestB.g:862:1: rule__Materia__Group__3 : rule__Materia__Group__3__Impl rule__Materia__Group__4 ;
    public final void rule__Materia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:866:1: ( rule__Materia__Group__3__Impl rule__Materia__Group__4 )
            // InternalTestB.g:867:2: rule__Materia__Group__3__Impl rule__Materia__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Materia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__4();

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
    // $ANTLR end "rule__Materia__Group__3"


    // $ANTLR start "rule__Materia__Group__3__Impl"
    // InternalTestB.g:874:1: rule__Materia__Group__3__Impl : ( '(' ) ;
    public final void rule__Materia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:878:1: ( ( '(' ) )
            // InternalTestB.g:879:1: ( '(' )
            {
            // InternalTestB.g:879:1: ( '(' )
            // InternalTestB.g:880:2: '('
            {
             before(grammarAccess.getMateriaAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMateriaAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Materia__Group__3__Impl"


    // $ANTLR start "rule__Materia__Group__4"
    // InternalTestB.g:889:1: rule__Materia__Group__4 : rule__Materia__Group__4__Impl rule__Materia__Group__5 ;
    public final void rule__Materia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:893:1: ( rule__Materia__Group__4__Impl rule__Materia__Group__5 )
            // InternalTestB.g:894:2: rule__Materia__Group__4__Impl rule__Materia__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Materia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__5();

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
    // $ANTLR end "rule__Materia__Group__4"


    // $ANTLR start "rule__Materia__Group__4__Impl"
    // InternalTestB.g:901:1: rule__Materia__Group__4__Impl : ( ( rule__Materia__TareaAssignment_4 ) ) ;
    public final void rule__Materia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:905:1: ( ( ( rule__Materia__TareaAssignment_4 ) ) )
            // InternalTestB.g:906:1: ( ( rule__Materia__TareaAssignment_4 ) )
            {
            // InternalTestB.g:906:1: ( ( rule__Materia__TareaAssignment_4 ) )
            // InternalTestB.g:907:2: ( rule__Materia__TareaAssignment_4 )
            {
             before(grammarAccess.getMateriaAccess().getTareaAssignment_4()); 
            // InternalTestB.g:908:2: ( rule__Materia__TareaAssignment_4 )
            // InternalTestB.g:908:3: rule__Materia__TareaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Materia__TareaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getTareaAssignment_4()); 

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
    // $ANTLR end "rule__Materia__Group__4__Impl"


    // $ANTLR start "rule__Materia__Group__5"
    // InternalTestB.g:916:1: rule__Materia__Group__5 : rule__Materia__Group__5__Impl rule__Materia__Group__6 ;
    public final void rule__Materia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:920:1: ( rule__Materia__Group__5__Impl rule__Materia__Group__6 )
            // InternalTestB.g:921:2: rule__Materia__Group__5__Impl rule__Materia__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Materia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group__6();

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
    // $ANTLR end "rule__Materia__Group__5"


    // $ANTLR start "rule__Materia__Group__5__Impl"
    // InternalTestB.g:928:1: rule__Materia__Group__5__Impl : ( ( rule__Materia__Group_5__0 )* ) ;
    public final void rule__Materia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:932:1: ( ( ( rule__Materia__Group_5__0 )* ) )
            // InternalTestB.g:933:1: ( ( rule__Materia__Group_5__0 )* )
            {
            // InternalTestB.g:933:1: ( ( rule__Materia__Group_5__0 )* )
            // InternalTestB.g:934:2: ( rule__Materia__Group_5__0 )*
            {
             before(grammarAccess.getMateriaAccess().getGroup_5()); 
            // InternalTestB.g:935:2: ( rule__Materia__Group_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTestB.g:935:3: rule__Materia__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Materia__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMateriaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Materia__Group__5__Impl"


    // $ANTLR start "rule__Materia__Group__6"
    // InternalTestB.g:943:1: rule__Materia__Group__6 : rule__Materia__Group__6__Impl ;
    public final void rule__Materia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:947:1: ( rule__Materia__Group__6__Impl )
            // InternalTestB.g:948:2: rule__Materia__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Materia__Group__6__Impl();

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
    // $ANTLR end "rule__Materia__Group__6"


    // $ANTLR start "rule__Materia__Group__6__Impl"
    // InternalTestB.g:954:1: rule__Materia__Group__6__Impl : ( ')' ) ;
    public final void rule__Materia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:958:1: ( ( ')' ) )
            // InternalTestB.g:959:1: ( ')' )
            {
            // InternalTestB.g:959:1: ( ')' )
            // InternalTestB.g:960:2: ')'
            {
             before(grammarAccess.getMateriaAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMateriaAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Materia__Group__6__Impl"


    // $ANTLR start "rule__Materia__Group_1__0"
    // InternalTestB.g:970:1: rule__Materia__Group_1__0 : rule__Materia__Group_1__0__Impl rule__Materia__Group_1__1 ;
    public final void rule__Materia__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:974:1: ( rule__Materia__Group_1__0__Impl rule__Materia__Group_1__1 )
            // InternalTestB.g:975:2: rule__Materia__Group_1__0__Impl rule__Materia__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Materia__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group_1__1();

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
    // $ANTLR end "rule__Materia__Group_1__0"


    // $ANTLR start "rule__Materia__Group_1__0__Impl"
    // InternalTestB.g:982:1: rule__Materia__Group_1__0__Impl : ( '|' ) ;
    public final void rule__Materia__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:986:1: ( ( '|' ) )
            // InternalTestB.g:987:1: ( '|' )
            {
            // InternalTestB.g:987:1: ( '|' )
            // InternalTestB.g:988:2: '|'
            {
             before(grammarAccess.getMateriaAccess().getVerticalLineKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMateriaAccess().getVerticalLineKeyword_1_0()); 

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
    // $ANTLR end "rule__Materia__Group_1__0__Impl"


    // $ANTLR start "rule__Materia__Group_1__1"
    // InternalTestB.g:997:1: rule__Materia__Group_1__1 : rule__Materia__Group_1__1__Impl ;
    public final void rule__Materia__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1001:1: ( rule__Materia__Group_1__1__Impl )
            // InternalTestB.g:1002:2: rule__Materia__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Materia__Group_1__1__Impl();

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
    // $ANTLR end "rule__Materia__Group_1__1"


    // $ANTLR start "rule__Materia__Group_1__1__Impl"
    // InternalTestB.g:1008:1: rule__Materia__Group_1__1__Impl : ( ( rule__Materia__DictadaAssignment_1_1 ) ) ;
    public final void rule__Materia__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1012:1: ( ( ( rule__Materia__DictadaAssignment_1_1 ) ) )
            // InternalTestB.g:1013:1: ( ( rule__Materia__DictadaAssignment_1_1 ) )
            {
            // InternalTestB.g:1013:1: ( ( rule__Materia__DictadaAssignment_1_1 ) )
            // InternalTestB.g:1014:2: ( rule__Materia__DictadaAssignment_1_1 )
            {
             before(grammarAccess.getMateriaAccess().getDictadaAssignment_1_1()); 
            // InternalTestB.g:1015:2: ( rule__Materia__DictadaAssignment_1_1 )
            // InternalTestB.g:1015:3: rule__Materia__DictadaAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Materia__DictadaAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getDictadaAssignment_1_1()); 

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
    // $ANTLR end "rule__Materia__Group_1__1__Impl"


    // $ANTLR start "rule__Materia__Group_5__0"
    // InternalTestB.g:1024:1: rule__Materia__Group_5__0 : rule__Materia__Group_5__0__Impl rule__Materia__Group_5__1 ;
    public final void rule__Materia__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1028:1: ( rule__Materia__Group_5__0__Impl rule__Materia__Group_5__1 )
            // InternalTestB.g:1029:2: rule__Materia__Group_5__0__Impl rule__Materia__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Materia__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Materia__Group_5__1();

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
    // $ANTLR end "rule__Materia__Group_5__0"


    // $ANTLR start "rule__Materia__Group_5__0__Impl"
    // InternalTestB.g:1036:1: rule__Materia__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Materia__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1040:1: ( ( ',' ) )
            // InternalTestB.g:1041:1: ( ',' )
            {
            // InternalTestB.g:1041:1: ( ',' )
            // InternalTestB.g:1042:2: ','
            {
             before(grammarAccess.getMateriaAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMateriaAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Materia__Group_5__0__Impl"


    // $ANTLR start "rule__Materia__Group_5__1"
    // InternalTestB.g:1051:1: rule__Materia__Group_5__1 : rule__Materia__Group_5__1__Impl ;
    public final void rule__Materia__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1055:1: ( rule__Materia__Group_5__1__Impl )
            // InternalTestB.g:1056:2: rule__Materia__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Materia__Group_5__1__Impl();

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
    // $ANTLR end "rule__Materia__Group_5__1"


    // $ANTLR start "rule__Materia__Group_5__1__Impl"
    // InternalTestB.g:1062:1: rule__Materia__Group_5__1__Impl : ( ( rule__Materia__TareaAssignment_5_1 ) ) ;
    public final void rule__Materia__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1066:1: ( ( ( rule__Materia__TareaAssignment_5_1 ) ) )
            // InternalTestB.g:1067:1: ( ( rule__Materia__TareaAssignment_5_1 ) )
            {
            // InternalTestB.g:1067:1: ( ( rule__Materia__TareaAssignment_5_1 ) )
            // InternalTestB.g:1068:2: ( rule__Materia__TareaAssignment_5_1 )
            {
             before(grammarAccess.getMateriaAccess().getTareaAssignment_5_1()); 
            // InternalTestB.g:1069:2: ( rule__Materia__TareaAssignment_5_1 )
            // InternalTestB.g:1069:3: rule__Materia__TareaAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Materia__TareaAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMateriaAccess().getTareaAssignment_5_1()); 

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
    // $ANTLR end "rule__Materia__Group_5__1__Impl"


    // $ANTLR start "rule__Docente__Group__0"
    // InternalTestB.g:1078:1: rule__Docente__Group__0 : rule__Docente__Group__0__Impl rule__Docente__Group__1 ;
    public final void rule__Docente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1082:1: ( rule__Docente__Group__0__Impl rule__Docente__Group__1 )
            // InternalTestB.g:1083:2: rule__Docente__Group__0__Impl rule__Docente__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Docente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__1();

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
    // $ANTLR end "rule__Docente__Group__0"


    // $ANTLR start "rule__Docente__Group__0__Impl"
    // InternalTestB.g:1090:1: rule__Docente__Group__0__Impl : ( ( rule__Docente__NameAssignment_0 ) ) ;
    public final void rule__Docente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1094:1: ( ( ( rule__Docente__NameAssignment_0 ) ) )
            // InternalTestB.g:1095:1: ( ( rule__Docente__NameAssignment_0 ) )
            {
            // InternalTestB.g:1095:1: ( ( rule__Docente__NameAssignment_0 ) )
            // InternalTestB.g:1096:2: ( rule__Docente__NameAssignment_0 )
            {
             before(grammarAccess.getDocenteAccess().getNameAssignment_0()); 
            // InternalTestB.g:1097:2: ( rule__Docente__NameAssignment_0 )
            // InternalTestB.g:1097:3: rule__Docente__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Docente__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocenteAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Docente__Group__0__Impl"


    // $ANTLR start "rule__Docente__Group__1"
    // InternalTestB.g:1105:1: rule__Docente__Group__1 : rule__Docente__Group__1__Impl rule__Docente__Group__2 ;
    public final void rule__Docente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1109:1: ( rule__Docente__Group__1__Impl rule__Docente__Group__2 )
            // InternalTestB.g:1110:2: rule__Docente__Group__1__Impl rule__Docente__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Docente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__2();

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
    // $ANTLR end "rule__Docente__Group__1"


    // $ANTLR start "rule__Docente__Group__1__Impl"
    // InternalTestB.g:1117:1: rule__Docente__Group__1__Impl : ( '{' ) ;
    public final void rule__Docente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1121:1: ( ( '{' ) )
            // InternalTestB.g:1122:1: ( '{' )
            {
            // InternalTestB.g:1122:1: ( '{' )
            // InternalTestB.g:1123:2: '{'
            {
             before(grammarAccess.getDocenteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Docente__Group__1__Impl"


    // $ANTLR start "rule__Docente__Group__2"
    // InternalTestB.g:1132:1: rule__Docente__Group__2 : rule__Docente__Group__2__Impl rule__Docente__Group__3 ;
    public final void rule__Docente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1136:1: ( rule__Docente__Group__2__Impl rule__Docente__Group__3 )
            // InternalTestB.g:1137:2: rule__Docente__Group__2__Impl rule__Docente__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Docente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__3();

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
    // $ANTLR end "rule__Docente__Group__2"


    // $ANTLR start "rule__Docente__Group__2__Impl"
    // InternalTestB.g:1144:1: rule__Docente__Group__2__Impl : ( 'dicta' ) ;
    public final void rule__Docente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1148:1: ( ( 'dicta' ) )
            // InternalTestB.g:1149:1: ( 'dicta' )
            {
            // InternalTestB.g:1149:1: ( 'dicta' )
            // InternalTestB.g:1150:2: 'dicta'
            {
             before(grammarAccess.getDocenteAccess().getDictaKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getDictaKeyword_2()); 

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
    // $ANTLR end "rule__Docente__Group__2__Impl"


    // $ANTLR start "rule__Docente__Group__3"
    // InternalTestB.g:1159:1: rule__Docente__Group__3 : rule__Docente__Group__3__Impl rule__Docente__Group__4 ;
    public final void rule__Docente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1163:1: ( rule__Docente__Group__3__Impl rule__Docente__Group__4 )
            // InternalTestB.g:1164:2: rule__Docente__Group__3__Impl rule__Docente__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Docente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__4();

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
    // $ANTLR end "rule__Docente__Group__3"


    // $ANTLR start "rule__Docente__Group__3__Impl"
    // InternalTestB.g:1171:1: rule__Docente__Group__3__Impl : ( '(' ) ;
    public final void rule__Docente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1175:1: ( ( '(' ) )
            // InternalTestB.g:1176:1: ( '(' )
            {
            // InternalTestB.g:1176:1: ( '(' )
            // InternalTestB.g:1177:2: '('
            {
             before(grammarAccess.getDocenteAccess().getLeftParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Docente__Group__3__Impl"


    // $ANTLR start "rule__Docente__Group__4"
    // InternalTestB.g:1186:1: rule__Docente__Group__4 : rule__Docente__Group__4__Impl rule__Docente__Group__5 ;
    public final void rule__Docente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1190:1: ( rule__Docente__Group__4__Impl rule__Docente__Group__5 )
            // InternalTestB.g:1191:2: rule__Docente__Group__4__Impl rule__Docente__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Docente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__5();

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
    // $ANTLR end "rule__Docente__Group__4"


    // $ANTLR start "rule__Docente__Group__4__Impl"
    // InternalTestB.g:1198:1: rule__Docente__Group__4__Impl : ( ( rule__Docente__DictaAssignment_4 ) ) ;
    public final void rule__Docente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1202:1: ( ( ( rule__Docente__DictaAssignment_4 ) ) )
            // InternalTestB.g:1203:1: ( ( rule__Docente__DictaAssignment_4 ) )
            {
            // InternalTestB.g:1203:1: ( ( rule__Docente__DictaAssignment_4 ) )
            // InternalTestB.g:1204:2: ( rule__Docente__DictaAssignment_4 )
            {
             before(grammarAccess.getDocenteAccess().getDictaAssignment_4()); 
            // InternalTestB.g:1205:2: ( rule__Docente__DictaAssignment_4 )
            // InternalTestB.g:1205:3: rule__Docente__DictaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Docente__DictaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDocenteAccess().getDictaAssignment_4()); 

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
    // $ANTLR end "rule__Docente__Group__4__Impl"


    // $ANTLR start "rule__Docente__Group__5"
    // InternalTestB.g:1213:1: rule__Docente__Group__5 : rule__Docente__Group__5__Impl rule__Docente__Group__6 ;
    public final void rule__Docente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1217:1: ( rule__Docente__Group__5__Impl rule__Docente__Group__6 )
            // InternalTestB.g:1218:2: rule__Docente__Group__5__Impl rule__Docente__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Docente__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__6();

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
    // $ANTLR end "rule__Docente__Group__5"


    // $ANTLR start "rule__Docente__Group__5__Impl"
    // InternalTestB.g:1225:1: rule__Docente__Group__5__Impl : ( ( rule__Docente__Group_5__0 )* ) ;
    public final void rule__Docente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1229:1: ( ( ( rule__Docente__Group_5__0 )* ) )
            // InternalTestB.g:1230:1: ( ( rule__Docente__Group_5__0 )* )
            {
            // InternalTestB.g:1230:1: ( ( rule__Docente__Group_5__0 )* )
            // InternalTestB.g:1231:2: ( rule__Docente__Group_5__0 )*
            {
             before(grammarAccess.getDocenteAccess().getGroup_5()); 
            // InternalTestB.g:1232:2: ( rule__Docente__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTestB.g:1232:3: rule__Docente__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Docente__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDocenteAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Docente__Group__5__Impl"


    // $ANTLR start "rule__Docente__Group__6"
    // InternalTestB.g:1240:1: rule__Docente__Group__6 : rule__Docente__Group__6__Impl rule__Docente__Group__7 ;
    public final void rule__Docente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1244:1: ( rule__Docente__Group__6__Impl rule__Docente__Group__7 )
            // InternalTestB.g:1245:2: rule__Docente__Group__6__Impl rule__Docente__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Docente__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group__7();

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
    // $ANTLR end "rule__Docente__Group__6"


    // $ANTLR start "rule__Docente__Group__6__Impl"
    // InternalTestB.g:1252:1: rule__Docente__Group__6__Impl : ( ')' ) ;
    public final void rule__Docente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1256:1: ( ( ')' ) )
            // InternalTestB.g:1257:1: ( ')' )
            {
            // InternalTestB.g:1257:1: ( ')' )
            // InternalTestB.g:1258:2: ')'
            {
             before(grammarAccess.getDocenteAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Docente__Group__6__Impl"


    // $ANTLR start "rule__Docente__Group__7"
    // InternalTestB.g:1267:1: rule__Docente__Group__7 : rule__Docente__Group__7__Impl ;
    public final void rule__Docente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1271:1: ( rule__Docente__Group__7__Impl )
            // InternalTestB.g:1272:2: rule__Docente__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Docente__Group__7__Impl();

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
    // $ANTLR end "rule__Docente__Group__7"


    // $ANTLR start "rule__Docente__Group__7__Impl"
    // InternalTestB.g:1278:1: rule__Docente__Group__7__Impl : ( '}' ) ;
    public final void rule__Docente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1282:1: ( ( '}' ) )
            // InternalTestB.g:1283:1: ( '}' )
            {
            // InternalTestB.g:1283:1: ( '}' )
            // InternalTestB.g:1284:2: '}'
            {
             before(grammarAccess.getDocenteAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Docente__Group__7__Impl"


    // $ANTLR start "rule__Docente__Group_5__0"
    // InternalTestB.g:1294:1: rule__Docente__Group_5__0 : rule__Docente__Group_5__0__Impl rule__Docente__Group_5__1 ;
    public final void rule__Docente__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1298:1: ( rule__Docente__Group_5__0__Impl rule__Docente__Group_5__1 )
            // InternalTestB.g:1299:2: rule__Docente__Group_5__0__Impl rule__Docente__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Docente__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Docente__Group_5__1();

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
    // $ANTLR end "rule__Docente__Group_5__0"


    // $ANTLR start "rule__Docente__Group_5__0__Impl"
    // InternalTestB.g:1306:1: rule__Docente__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Docente__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1310:1: ( ( ',' ) )
            // InternalTestB.g:1311:1: ( ',' )
            {
            // InternalTestB.g:1311:1: ( ',' )
            // InternalTestB.g:1312:2: ','
            {
             before(grammarAccess.getDocenteAccess().getCommaKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDocenteAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Docente__Group_5__0__Impl"


    // $ANTLR start "rule__Docente__Group_5__1"
    // InternalTestB.g:1321:1: rule__Docente__Group_5__1 : rule__Docente__Group_5__1__Impl ;
    public final void rule__Docente__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1325:1: ( rule__Docente__Group_5__1__Impl )
            // InternalTestB.g:1326:2: rule__Docente__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Docente__Group_5__1__Impl();

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
    // $ANTLR end "rule__Docente__Group_5__1"


    // $ANTLR start "rule__Docente__Group_5__1__Impl"
    // InternalTestB.g:1332:1: rule__Docente__Group_5__1__Impl : ( ( rule__Docente__DictaAssignment_5_1 ) ) ;
    public final void rule__Docente__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1336:1: ( ( ( rule__Docente__DictaAssignment_5_1 ) ) )
            // InternalTestB.g:1337:1: ( ( rule__Docente__DictaAssignment_5_1 ) )
            {
            // InternalTestB.g:1337:1: ( ( rule__Docente__DictaAssignment_5_1 ) )
            // InternalTestB.g:1338:2: ( rule__Docente__DictaAssignment_5_1 )
            {
             before(grammarAccess.getDocenteAccess().getDictaAssignment_5_1()); 
            // InternalTestB.g:1339:2: ( rule__Docente__DictaAssignment_5_1 )
            // InternalTestB.g:1339:3: rule__Docente__DictaAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Docente__DictaAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDocenteAccess().getDictaAssignment_5_1()); 

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
    // $ANTLR end "rule__Docente__Group_5__1__Impl"


    // $ANTLR start "rule__Tarea__Group__0"
    // InternalTestB.g:1348:1: rule__Tarea__Group__0 : rule__Tarea__Group__0__Impl rule__Tarea__Group__1 ;
    public final void rule__Tarea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1352:1: ( rule__Tarea__Group__0__Impl rule__Tarea__Group__1 )
            // InternalTestB.g:1353:2: rule__Tarea__Group__0__Impl rule__Tarea__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tarea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tarea__Group__1();

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
    // $ANTLR end "rule__Tarea__Group__0"


    // $ANTLR start "rule__Tarea__Group__0__Impl"
    // InternalTestB.g:1360:1: rule__Tarea__Group__0__Impl : ( () ) ;
    public final void rule__Tarea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1364:1: ( ( () ) )
            // InternalTestB.g:1365:1: ( () )
            {
            // InternalTestB.g:1365:1: ( () )
            // InternalTestB.g:1366:2: ()
            {
             before(grammarAccess.getTareaAccess().getTareaAction_0()); 
            // InternalTestB.g:1367:2: ()
            // InternalTestB.g:1367:3: 
            {
            }

             after(grammarAccess.getTareaAccess().getTareaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tarea__Group__0__Impl"


    // $ANTLR start "rule__Tarea__Group__1"
    // InternalTestB.g:1375:1: rule__Tarea__Group__1 : rule__Tarea__Group__1__Impl rule__Tarea__Group__2 ;
    public final void rule__Tarea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1379:1: ( rule__Tarea__Group__1__Impl rule__Tarea__Group__2 )
            // InternalTestB.g:1380:2: rule__Tarea__Group__1__Impl rule__Tarea__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Tarea__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tarea__Group__2();

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
    // $ANTLR end "rule__Tarea__Group__1"


    // $ANTLR start "rule__Tarea__Group__1__Impl"
    // InternalTestB.g:1387:1: rule__Tarea__Group__1__Impl : ( ( rule__Tarea__NameAssignment_1 ) ) ;
    public final void rule__Tarea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1391:1: ( ( ( rule__Tarea__NameAssignment_1 ) ) )
            // InternalTestB.g:1392:1: ( ( rule__Tarea__NameAssignment_1 ) )
            {
            // InternalTestB.g:1392:1: ( ( rule__Tarea__NameAssignment_1 ) )
            // InternalTestB.g:1393:2: ( rule__Tarea__NameAssignment_1 )
            {
             before(grammarAccess.getTareaAccess().getNameAssignment_1()); 
            // InternalTestB.g:1394:2: ( rule__Tarea__NameAssignment_1 )
            // InternalTestB.g:1394:3: rule__Tarea__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tarea__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTareaAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Tarea__Group__1__Impl"


    // $ANTLR start "rule__Tarea__Group__2"
    // InternalTestB.g:1402:1: rule__Tarea__Group__2 : rule__Tarea__Group__2__Impl ;
    public final void rule__Tarea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1406:1: ( rule__Tarea__Group__2__Impl )
            // InternalTestB.g:1407:2: rule__Tarea__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tarea__Group__2__Impl();

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
    // $ANTLR end "rule__Tarea__Group__2"


    // $ANTLR start "rule__Tarea__Group__2__Impl"
    // InternalTestB.g:1413:1: rule__Tarea__Group__2__Impl : ( ( rule__Tarea__Group_2__0 )? ) ;
    public final void rule__Tarea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1417:1: ( ( ( rule__Tarea__Group_2__0 )? ) )
            // InternalTestB.g:1418:1: ( ( rule__Tarea__Group_2__0 )? )
            {
            // InternalTestB.g:1418:1: ( ( rule__Tarea__Group_2__0 )? )
            // InternalTestB.g:1419:2: ( rule__Tarea__Group_2__0 )?
            {
             before(grammarAccess.getTareaAccess().getGroup_2()); 
            // InternalTestB.g:1420:2: ( rule__Tarea__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTestB.g:1420:3: rule__Tarea__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tarea__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTareaAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Tarea__Group__2__Impl"


    // $ANTLR start "rule__Tarea__Group_2__0"
    // InternalTestB.g:1429:1: rule__Tarea__Group_2__0 : rule__Tarea__Group_2__0__Impl rule__Tarea__Group_2__1 ;
    public final void rule__Tarea__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1433:1: ( rule__Tarea__Group_2__0__Impl rule__Tarea__Group_2__1 )
            // InternalTestB.g:1434:2: rule__Tarea__Group_2__0__Impl rule__Tarea__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Tarea__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tarea__Group_2__1();

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
    // $ANTLR end "rule__Tarea__Group_2__0"


    // $ANTLR start "rule__Tarea__Group_2__0__Impl"
    // InternalTestB.g:1441:1: rule__Tarea__Group_2__0__Impl : ( '|' ) ;
    public final void rule__Tarea__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1445:1: ( ( '|' ) )
            // InternalTestB.g:1446:1: ( '|' )
            {
            // InternalTestB.g:1446:1: ( '|' )
            // InternalTestB.g:1447:2: '|'
            {
             before(grammarAccess.getTareaAccess().getVerticalLineKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTareaAccess().getVerticalLineKeyword_2_0()); 

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
    // $ANTLR end "rule__Tarea__Group_2__0__Impl"


    // $ANTLR start "rule__Tarea__Group_2__1"
    // InternalTestB.g:1456:1: rule__Tarea__Group_2__1 : rule__Tarea__Group_2__1__Impl ;
    public final void rule__Tarea__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1460:1: ( rule__Tarea__Group_2__1__Impl )
            // InternalTestB.g:1461:2: rule__Tarea__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tarea__Group_2__1__Impl();

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
    // $ANTLR end "rule__Tarea__Group_2__1"


    // $ANTLR start "rule__Tarea__Group_2__1__Impl"
    // InternalTestB.g:1467:1: rule__Tarea__Group_2__1__Impl : ( ( rule__Tarea__TipoCAssignment_2_1 ) ) ;
    public final void rule__Tarea__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1471:1: ( ( ( rule__Tarea__TipoCAssignment_2_1 ) ) )
            // InternalTestB.g:1472:1: ( ( rule__Tarea__TipoCAssignment_2_1 ) )
            {
            // InternalTestB.g:1472:1: ( ( rule__Tarea__TipoCAssignment_2_1 ) )
            // InternalTestB.g:1473:2: ( rule__Tarea__TipoCAssignment_2_1 )
            {
             before(grammarAccess.getTareaAccess().getTipoCAssignment_2_1()); 
            // InternalTestB.g:1474:2: ( rule__Tarea__TipoCAssignment_2_1 )
            // InternalTestB.g:1474:3: rule__Tarea__TipoCAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Tarea__TipoCAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTareaAccess().getTipoCAssignment_2_1()); 

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
    // $ANTLR end "rule__Tarea__Group_2__1__Impl"


    // $ANTLR start "rule__Principal__NameAssignment_1"
    // InternalTestB.g:1483:1: rule__Principal__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Principal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1487:1: ( ( ruleEString ) )
            // InternalTestB.g:1488:2: ( ruleEString )
            {
            // InternalTestB.g:1488:2: ( ruleEString )
            // InternalTestB.g:1489:3: ruleEString
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


    // $ANTLR start "rule__Principal__MateriaAssignment_3_2"
    // InternalTestB.g:1498:1: rule__Principal__MateriaAssignment_3_2 : ( ruleMateria ) ;
    public final void rule__Principal__MateriaAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1502:1: ( ( ruleMateria ) )
            // InternalTestB.g:1503:2: ( ruleMateria )
            {
            // InternalTestB.g:1503:2: ( ruleMateria )
            // InternalTestB.g:1504:3: ruleMateria
            {
             before(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Principal__MateriaAssignment_3_2"


    // $ANTLR start "rule__Principal__MateriaAssignment_3_3_1"
    // InternalTestB.g:1513:1: rule__Principal__MateriaAssignment_3_3_1 : ( ruleMateria ) ;
    public final void rule__Principal__MateriaAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1517:1: ( ( ruleMateria ) )
            // InternalTestB.g:1518:2: ( ruleMateria )
            {
            // InternalTestB.g:1518:2: ( ruleMateria )
            // InternalTestB.g:1519:3: ruleMateria
            {
             before(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMateria();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getMateriaMateriaParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Principal__MateriaAssignment_3_3_1"


    // $ANTLR start "rule__Principal__DocenteAssignment_4_2"
    // InternalTestB.g:1528:1: rule__Principal__DocenteAssignment_4_2 : ( ruleDocente ) ;
    public final void rule__Principal__DocenteAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1532:1: ( ( ruleDocente ) )
            // InternalTestB.g:1533:2: ( ruleDocente )
            {
            // InternalTestB.g:1533:2: ( ruleDocente )
            // InternalTestB.g:1534:3: ruleDocente
            {
             before(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDocente();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Principal__DocenteAssignment_4_2"


    // $ANTLR start "rule__Principal__DocenteAssignment_4_3_1"
    // InternalTestB.g:1543:1: rule__Principal__DocenteAssignment_4_3_1 : ( ruleDocente ) ;
    public final void rule__Principal__DocenteAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1547:1: ( ( ruleDocente ) )
            // InternalTestB.g:1548:2: ( ruleDocente )
            {
            // InternalTestB.g:1548:2: ( ruleDocente )
            // InternalTestB.g:1549:3: ruleDocente
            {
             before(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocente();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getDocenteDocenteParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Principal__DocenteAssignment_4_3_1"


    // $ANTLR start "rule__Materia__NameAssignment_0"
    // InternalTestB.g:1558:1: rule__Materia__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Materia__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1562:1: ( ( ruleEString ) )
            // InternalTestB.g:1563:2: ( ruleEString )
            {
            // InternalTestB.g:1563:2: ( ruleEString )
            // InternalTestB.g:1564:3: ruleEString
            {
             before(grammarAccess.getMateriaAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMateriaAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Materia__NameAssignment_0"


    // $ANTLR start "rule__Materia__DictadaAssignment_1_1"
    // InternalTestB.g:1573:1: rule__Materia__DictadaAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Materia__DictadaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1577:1: ( ( ( ruleEString ) ) )
            // InternalTestB.g:1578:2: ( ( ruleEString ) )
            {
            // InternalTestB.g:1578:2: ( ( ruleEString ) )
            // InternalTestB.g:1579:3: ( ruleEString )
            {
             before(grammarAccess.getMateriaAccess().getDictadaDocenteCrossReference_1_1_0()); 
            // InternalTestB.g:1580:3: ( ruleEString )
            // InternalTestB.g:1581:4: ruleEString
            {
             before(grammarAccess.getMateriaAccess().getDictadaDocenteEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMateriaAccess().getDictadaDocenteEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMateriaAccess().getDictadaDocenteCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Materia__DictadaAssignment_1_1"


    // $ANTLR start "rule__Materia__TareaAssignment_4"
    // InternalTestB.g:1592:1: rule__Materia__TareaAssignment_4 : ( ruleTarea ) ;
    public final void rule__Materia__TareaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1596:1: ( ( ruleTarea ) )
            // InternalTestB.g:1597:2: ( ruleTarea )
            {
            // InternalTestB.g:1597:2: ( ruleTarea )
            // InternalTestB.g:1598:3: ruleTarea
            {
             before(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTarea();

            state._fsp--;

             after(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Materia__TareaAssignment_4"


    // $ANTLR start "rule__Materia__TareaAssignment_5_1"
    // InternalTestB.g:1607:1: rule__Materia__TareaAssignment_5_1 : ( ruleTarea ) ;
    public final void rule__Materia__TareaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1611:1: ( ( ruleTarea ) )
            // InternalTestB.g:1612:2: ( ruleTarea )
            {
            // InternalTestB.g:1612:2: ( ruleTarea )
            // InternalTestB.g:1613:3: ruleTarea
            {
             before(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarea();

            state._fsp--;

             after(grammarAccess.getMateriaAccess().getTareaTareaParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Materia__TareaAssignment_5_1"


    // $ANTLR start "rule__Docente__NameAssignment_0"
    // InternalTestB.g:1622:1: rule__Docente__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Docente__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1626:1: ( ( ruleEString ) )
            // InternalTestB.g:1627:2: ( ruleEString )
            {
            // InternalTestB.g:1627:2: ( ruleEString )
            // InternalTestB.g:1628:3: ruleEString
            {
             before(grammarAccess.getDocenteAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDocenteAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Docente__NameAssignment_0"


    // $ANTLR start "rule__Docente__DictaAssignment_4"
    // InternalTestB.g:1637:1: rule__Docente__DictaAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Docente__DictaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1641:1: ( ( ( ruleEString ) ) )
            // InternalTestB.g:1642:2: ( ( ruleEString ) )
            {
            // InternalTestB.g:1642:2: ( ( ruleEString ) )
            // InternalTestB.g:1643:3: ( ruleEString )
            {
             before(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_4_0()); 
            // InternalTestB.g:1644:3: ( ruleEString )
            // InternalTestB.g:1645:4: ruleEString
            {
             before(grammarAccess.getDocenteAccess().getDictaMateriaEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDocenteAccess().getDictaMateriaEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_4_0()); 

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
    // $ANTLR end "rule__Docente__DictaAssignment_4"


    // $ANTLR start "rule__Docente__DictaAssignment_5_1"
    // InternalTestB.g:1656:1: rule__Docente__DictaAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Docente__DictaAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1660:1: ( ( ( ruleEString ) ) )
            // InternalTestB.g:1661:2: ( ( ruleEString ) )
            {
            // InternalTestB.g:1661:2: ( ( ruleEString ) )
            // InternalTestB.g:1662:3: ( ruleEString )
            {
             before(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_5_1_0()); 
            // InternalTestB.g:1663:3: ( ruleEString )
            // InternalTestB.g:1664:4: ruleEString
            {
             before(grammarAccess.getDocenteAccess().getDictaMateriaEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDocenteAccess().getDictaMateriaEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getDocenteAccess().getDictaMateriaCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Docente__DictaAssignment_5_1"


    // $ANTLR start "rule__Tarea__NameAssignment_1"
    // InternalTestB.g:1675:1: rule__Tarea__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Tarea__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1679:1: ( ( ruleEString ) )
            // InternalTestB.g:1680:2: ( ruleEString )
            {
            // InternalTestB.g:1680:2: ( ruleEString )
            // InternalTestB.g:1681:3: ruleEString
            {
             before(grammarAccess.getTareaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTareaAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tarea__NameAssignment_1"


    // $ANTLR start "rule__Tarea__TipoCAssignment_2_1"
    // InternalTestB.g:1690:1: rule__Tarea__TipoCAssignment_2_1 : ( ruleTipoCalificacion ) ;
    public final void rule__Tarea__TipoCAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestB.g:1694:1: ( ( ruleTipoCalificacion ) )
            // InternalTestB.g:1695:2: ( ruleTipoCalificacion )
            {
            // InternalTestB.g:1695:2: ( ruleTipoCalificacion )
            // InternalTestB.g:1696:3: ruleTipoCalificacion
            {
             before(grammarAccess.getTareaAccess().getTipoCTipoCalificacionEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoCalificacion();

            state._fsp--;

             after(grammarAccess.getTareaAccess().getTipoCTipoCalificacionEnumRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Tarea__TipoCAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});

}