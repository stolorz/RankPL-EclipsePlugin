/*
 * generated by Xtext 2.11.0
 */
grammar InternalRankPL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package pl.stolorz.dsl.rankpl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package pl.stolorz.dsl.rankpl.ide.contentassist.antlr.internal;

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
import pl.stolorz.dsl.rankpl.services.RankPLGrammarAccess;

}
@parser::members {
	private RankPLGrammarAccess grammarAccess;

	public void setGrammarAccess(RankPLGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)*
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinition
entryRuleDefinition
:
{ before(grammarAccess.getDefinitionRule()); }
	 ruleDefinition
{ after(grammarAccess.getDefinitionRule()); } 
	 EOF 
;

// Rule Definition
ruleDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionAccess().getGroup()); }
		(rule__Definition__Group__0)
		{ after(grammarAccess.getDefinitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaredParameter
entryRuleDeclaredParameter
:
{ before(grammarAccess.getDeclaredParameterRule()); }
	 ruleDeclaredParameter
{ after(grammarAccess.getDeclaredParameterRule()); } 
	 EOF 
;

// Rule DeclaredParameter
ruleDeclaredParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); }
		(rule__DeclaredParameter__NameAssignment)
		{ after(grammarAccess.getDeclaredParameterAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractDefinition
entryRuleAbstractDefinition
:
{ before(grammarAccess.getAbstractDefinitionRule()); }
	 ruleAbstractDefinition
{ after(grammarAccess.getAbstractDefinitionRule()); } 
	 EOF 
;

// Rule AbstractDefinition
ruleAbstractDefinition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractDefinitionAccess().getAlternatives()); }
		(rule__AbstractDefinition__Alternatives)
		{ after(grammarAccess.getAbstractDefinitionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); }
		ruleAddition
		{ after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAddition
entryRuleAddition
:
{ before(grammarAccess.getAdditionRule()); }
	 ruleAddition
{ after(grammarAccess.getAdditionRule()); } 
	 EOF 
;

// Rule Addition
ruleAddition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdditionAccess().getGroup()); }
		(rule__Addition__Group__0)
		{ after(grammarAccess.getAdditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplication
entryRuleMultiplication
:
{ before(grammarAccess.getMultiplicationRule()); }
	 ruleMultiplication
{ after(grammarAccess.getMultiplicationRule()); } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup()); }
		(rule__Multiplication__Group__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression
:
{ before(grammarAccess.getPrimaryExpressionRule()); }
	 rulePrimaryExpression
{ after(grammarAccess.getPrimaryExpressionRule()); } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
		(rule__PrimaryExpression__Alternatives)
		{ after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractDefinition__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractDefinitionAccess().getDefinitionParserRuleCall_0()); }
		ruleDefinition
		{ after(grammarAccess.getAbstractDefinitionAccess().getDefinitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractDefinitionAccess().getDeclaredParameterParserRuleCall_1()); }
		ruleDeclaredParameter
		{ after(grammarAccess.getAbstractDefinitionAccess().getDeclaredParameterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); }
		(rule__Addition__Group_1_0_0__0)
		{ after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); }
		(rule__Addition__Group_1_0_1__0)
		{ after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); }
		(rule__Multiplication__Group_1_0_0__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); }
		(rule__Multiplication__Group_1_0_1__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); }
		(rule__PrimaryExpression__Group_0__0)
		{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); }
		(rule__PrimaryExpression__Group_1__0)
		{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); }
		(rule__PrimaryExpression__Group_2__0)
		{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__0__Impl
	rule__Definition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); }
	(rule__Definition__NameAssignment_0)
	{ after(grammarAccess.getDefinitionAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__1__Impl
	rule__Definition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getColonEqualsSignKeyword_1()); }
	':='
	{ after(grammarAccess.getDefinitionAccess().getColonEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__2__Impl
	rule__Definition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getExprAssignment_2()); }
	(rule__Definition__ExprAssignment_2)
	{ after(grammarAccess.getDefinitionAccess().getExprAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Definition__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3()); }
	';'
	{ after(grammarAccess.getDefinitionAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__0__Impl
	rule__Addition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); }
	ruleMultiplication
	{ after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getGroup_1()); }
	(rule__Addition__Group_1__0)*
	{ after(grammarAccess.getAdditionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1__0__Impl
	rule__Addition__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); }
	(rule__Addition__Alternatives_1_0)
	{ after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); }
	(rule__Addition__RightAssignment_1_1)
	{ after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0_0__0__Impl
	rule__Addition__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); }
	'+'
	{ after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0_1__0__Impl
	rule__Addition__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); }
	'-'
	{ after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__0__Impl
	rule__Multiplication__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); }
	rulePrimaryExpression
	{ after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getGroup_1()); }
	(rule__Multiplication__Group_1__0)*
	{ after(grammarAccess.getMultiplicationAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1__0__Impl
	rule__Multiplication__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); }
	(rule__Multiplication__Alternatives_1_0)
	{ after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); }
	(rule__Multiplication__RightAssignment_1_1)
	{ after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0_0__0__Impl
	rule__Multiplication__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); }
	'*'
	{ after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0_1__0__Impl
	rule__Multiplication__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); }
	'/'
	{ after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_0__0__Impl
	rule__PrimaryExpression__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_0__1__Impl
	rule__PrimaryExpression__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); }
	ruleExpression
	{ after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_1__0__Impl
	rule__PrimaryExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); }
	()
	{ after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); }
	(rule__PrimaryExpression__ValueAssignment_1_1)
	{ after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2__0__Impl
	rule__PrimaryExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); }
	()
	{ after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2__1__Impl
	rule__PrimaryExpression__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); }
	(rule__PrimaryExpression__FuncAssignment_2_1)
	{ after(grammarAccess.getPrimaryExpressionAccess().getFuncAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); }
	(rule__PrimaryExpression__Group_2_2__0)?
	{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2__0__Impl
	rule__PrimaryExpression__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); }
	'('
	{ after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2__1__Impl
	rule__PrimaryExpression__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); }
	(rule__PrimaryExpression__ArgsAssignment_2_2_1)
	{ after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2__2__Impl
	rule__PrimaryExpression__Group_2_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); }
	(rule__PrimaryExpression__Group_2_2_2__0)*
	{ after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); }
	')'
	{ after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimaryExpression__Group_2_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2_2__0__Impl
	rule__PrimaryExpression__Group_2_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); }
	','
	{ after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimaryExpression__Group_2_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__Group_2_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); }
	(rule__PrimaryExpression__ArgsAssignment_2_2_2_1)
	{ after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAbstractDefinitionParserRuleCall_0()); }
		ruleAbstractDefinition
		{ after(grammarAccess.getModelAccess().getGreetingsAbstractDefinitionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Definition__ExprAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaredParameter__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); }
		ruleMultiplication
		{ after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); }
		rulePrimaryExpression
		{ after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); }
		RULE_NUMBER
		{ after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__FuncAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getPrimaryExpressionAccess().getFuncAbstractDefinitionCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__ArgsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimaryExpression__ArgsAssignment_2_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPrimaryExpressionAccess().getArgsExpressionParserRuleCall_2_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

RULE_INT : 'this one has been deactivated';

RULE_HASH_COMMENT : ('#' ('\r'? '\n')?|'#' ~(('#'|'\n'|'\r'))+ ('\r'? '\n')?|'#' '#' '#' ~(('\n'|'\r'))* ('\r'? '\n')?);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
