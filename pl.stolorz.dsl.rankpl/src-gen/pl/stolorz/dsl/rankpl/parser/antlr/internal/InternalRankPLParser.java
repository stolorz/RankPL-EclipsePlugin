package pl.stolorz.dsl.rankpl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pl.stolorz.dsl.rankpl.services.RankPLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRankPLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_INT", "RULE_HASH_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_HASH_COMMENT=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRankPLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRankPLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRankPLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRankPL.g"; }



     	private RankPLGrammarAccess grammarAccess;

        public InternalRankPLParser(TokenStream input, RankPLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RankPLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRankPL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRankPL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRankPL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRankPL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleAbstractDefinition ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:77:2: ( ( (lv_greetings_0_0= ruleAbstractDefinition ) )* )
            // InternalRankPL.g:78:2: ( (lv_greetings_0_0= ruleAbstractDefinition ) )*
            {
            // InternalRankPL.g:78:2: ( (lv_greetings_0_0= ruleAbstractDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRankPL.g:79:3: (lv_greetings_0_0= ruleAbstractDefinition )
            	    {
            	    // InternalRankPL.g:79:3: (lv_greetings_0_0= ruleAbstractDefinition )
            	    // InternalRankPL.g:80:4: lv_greetings_0_0= ruleAbstractDefinition
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsAbstractDefinitionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleAbstractDefinition();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"pl.stolorz.dsl.rankpl.RankPL.AbstractDefinition");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDefinition"
    // InternalRankPL.g:100:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalRankPL.g:100:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalRankPL.g:101:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalRankPL.g:107:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalRankPL.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalRankPL.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalRankPL.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalRankPL.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRankPL.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRankPL.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalRankPL.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getColonEqualsSignKeyword_1());
            		
            // InternalRankPL.g:137:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalRankPL.g:138:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalRankPL.g:138:4: (lv_expr_2_0= ruleExpression )
            // InternalRankPL.g:139:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"pl.stolorz.dsl.rankpl.RankPL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // InternalRankPL.g:164:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // InternalRankPL.g:164:58: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // InternalRankPL.g:165:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
             newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;

             current =iv_ruleDeclaredParameter; 
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
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // InternalRankPL.g:171:1: ruleDeclaredParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRankPL.g:177:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRankPL.g:178:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRankPL.g:178:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRankPL.g:179:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRankPL.g:179:3: (lv_name_0_0= RULE_ID )
            // InternalRankPL.g:180:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "entryRuleAbstractDefinition"
    // InternalRankPL.g:199:1: entryRuleAbstractDefinition returns [EObject current=null] : iv_ruleAbstractDefinition= ruleAbstractDefinition EOF ;
    public final EObject entryRuleAbstractDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinition = null;


        try {
            // InternalRankPL.g:199:59: (iv_ruleAbstractDefinition= ruleAbstractDefinition EOF )
            // InternalRankPL.g:200:2: iv_ruleAbstractDefinition= ruleAbstractDefinition EOF
            {
             newCompositeNode(grammarAccess.getAbstractDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDefinition=ruleAbstractDefinition();

            state._fsp--;

             current =iv_ruleAbstractDefinition; 
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
    // $ANTLR end "entryRuleAbstractDefinition"


    // $ANTLR start "ruleAbstractDefinition"
    // InternalRankPL.g:206:1: ruleAbstractDefinition returns [EObject current=null] : (this_Definition_0= ruleDefinition | this_DeclaredParameter_1= ruleDeclaredParameter ) ;
    public final EObject ruleAbstractDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Definition_0 = null;

        EObject this_DeclaredParameter_1 = null;



        	enterRule();

        try {
            // InternalRankPL.g:212:2: ( (this_Definition_0= ruleDefinition | this_DeclaredParameter_1= ruleDeclaredParameter ) )
            // InternalRankPL.g:213:2: (this_Definition_0= ruleDefinition | this_DeclaredParameter_1= ruleDeclaredParameter )
            {
            // InternalRankPL.g:213:2: (this_Definition_0= ruleDefinition | this_DeclaredParameter_1= ruleDeclaredParameter )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_ID) ) {
                    alt2=2;
                }
                else if ( (LA2_1==13) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRankPL.g:214:3: this_Definition_0= ruleDefinition
                    {

                    			newCompositeNode(grammarAccess.getAbstractDefinitionAccess().getDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Definition_0=ruleDefinition();

                    state._fsp--;


                    			current = this_Definition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRankPL.g:223:3: this_DeclaredParameter_1= ruleDeclaredParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractDefinitionAccess().getDeclaredParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredParameter_1=ruleDeclaredParameter();

                    state._fsp--;


                    			current = this_DeclaredParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAbstractDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalRankPL.g:235:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRankPL.g:235:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRankPL.g:236:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRankPL.g:242:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:248:2: (this_Addition_0= ruleAddition )
            // InternalRankPL.g:249:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalRankPL.g:260:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalRankPL.g:260:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalRankPL.g:261:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalRankPL.g:267:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:273:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalRankPL.g:274:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalRankPL.g:274:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalRankPL.g:275:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRankPL.g:283:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRankPL.g:284:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalRankPL.g:284:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==16) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalRankPL.g:285:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalRankPL.g:285:5: ( () otherlv_2= '+' )
            	            // InternalRankPL.g:286:6: () otherlv_2= '+'
            	            {
            	            // InternalRankPL.g:286:6: ()
            	            // InternalRankPL.g:287:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRankPL.g:299:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalRankPL.g:299:5: ( () otherlv_4= '-' )
            	            // InternalRankPL.g:300:6: () otherlv_4= '-'
            	            {
            	            // InternalRankPL.g:300:6: ()
            	            // InternalRankPL.g:301:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalRankPL.g:313:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalRankPL.g:314:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalRankPL.g:314:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalRankPL.g:315:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"pl.stolorz.dsl.rankpl.RankPL.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalRankPL.g:337:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalRankPL.g:337:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalRankPL.g:338:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalRankPL.g:344:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:350:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalRankPL.g:351:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalRankPL.g:351:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalRankPL.g:352:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRankPL.g:360:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRankPL.g:361:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalRankPL.g:361:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==17) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==18) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalRankPL.g:362:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalRankPL.g:362:5: ( () otherlv_2= '*' )
            	            // InternalRankPL.g:363:6: () otherlv_2= '*'
            	            {
            	            // InternalRankPL.g:363:6: ()
            	            // InternalRankPL.g:364:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRankPL.g:376:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalRankPL.g:376:5: ( () otherlv_4= '/' )
            	            // InternalRankPL.g:377:6: () otherlv_4= '/'
            	            {
            	            // InternalRankPL.g:377:6: ()
            	            // InternalRankPL.g:378:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalRankPL.g:390:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalRankPL.g:391:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalRankPL.g:391:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalRankPL.g:392:6: lv_right_5_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"pl.stolorz.dsl.rankpl.RankPL.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalRankPL.g:414:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalRankPL.g:414:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalRankPL.g:415:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalRankPL.g:421:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_Expression_1 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;



        	enterRule();

        try {
            // InternalRankPL.g:427:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ) ) )
            // InternalRankPL.g:428:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ) )
            {
            // InternalRankPL.g:428:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= RULE_NUMBER ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRankPL.g:429:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalRankPL.g:429:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalRankPL.g:430:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRankPL.g:448:3: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    {
                    // InternalRankPL.g:448:3: ( () ( (lv_value_4_0= RULE_NUMBER ) ) )
                    // InternalRankPL.g:449:4: () ( (lv_value_4_0= RULE_NUMBER ) )
                    {
                    // InternalRankPL.g:449:4: ()
                    // InternalRankPL.g:450:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalRankPL.g:456:4: ( (lv_value_4_0= RULE_NUMBER ) )
                    // InternalRankPL.g:457:5: (lv_value_4_0= RULE_NUMBER )
                    {
                    // InternalRankPL.g:457:5: (lv_value_4_0= RULE_NUMBER )
                    // InternalRankPL.g:458:6: lv_value_4_0= RULE_NUMBER
                    {
                    lv_value_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"pl.stolorz.dsl.rankpl.RankPL.NUMBER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRankPL.g:476:3: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )
                    {
                    // InternalRankPL.g:476:3: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )? )
                    // InternalRankPL.g:477:4: () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    {
                    // InternalRankPL.g:477:4: ()
                    // InternalRankPL.g:478:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0(),
                    						current);
                    				

                    }

                    // InternalRankPL.g:484:4: ( (otherlv_6= RULE_ID ) )
                    // InternalRankPL.g:485:5: (otherlv_6= RULE_ID )
                    {
                    // InternalRankPL.g:485:5: (otherlv_6= RULE_ID )
                    // InternalRankPL.g:486:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalRankPL.g:497:4: (otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==19) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRankPL.g:498:5: otherlv_7= '(' ( (lv_args_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )* otherlv_11= ')'
                            {
                            otherlv_7=(Token)match(input,19,FOLLOW_5); 

                            					newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0());
                            				
                            // InternalRankPL.g:502:5: ( (lv_args_8_0= ruleExpression ) )
                            // InternalRankPL.g:503:6: (lv_args_8_0= ruleExpression )
                            {
                            // InternalRankPL.g:503:6: (lv_args_8_0= ruleExpression )
                            // InternalRankPL.g:504:7: lv_args_8_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0());
                            						
                            pushFollow(FOLLOW_11);
                            lv_args_8_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            							}
                            							add(
                            								current,
                            								"args",
                            								lv_args_8_0,
                            								"pl.stolorz.dsl.rankpl.RankPL.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRankPL.g:521:5: (otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==21) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalRankPL.g:522:6: otherlv_9= ',' ( (lv_args_10_0= ruleExpression ) )
                            	    {
                            	    otherlv_9=(Token)match(input,21,FOLLOW_5); 

                            	    						newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0());
                            	    					
                            	    // InternalRankPL.g:526:6: ( (lv_args_10_0= ruleExpression ) )
                            	    // InternalRankPL.g:527:7: (lv_args_10_0= ruleExpression )
                            	    {
                            	    // InternalRankPL.g:527:7: (lv_args_10_0= ruleExpression )
                            	    // InternalRankPL.g:528:8: lv_args_10_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_11);
                            	    lv_args_10_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"args",
                            	    									lv_args_10_0,
                            	    									"pl.stolorz.dsl.rankpl.RankPL.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,20,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "rulePrimaryExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});

}