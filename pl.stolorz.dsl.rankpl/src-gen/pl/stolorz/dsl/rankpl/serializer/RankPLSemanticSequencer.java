/*
 * generated by Xtext 2.11.0
 */
package pl.stolorz.dsl.rankpl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import pl.stolorz.dsl.rankpl.rankPL.DeclaredParameter;
import pl.stolorz.dsl.rankpl.rankPL.Definition;
import pl.stolorz.dsl.rankpl.rankPL.Div;
import pl.stolorz.dsl.rankpl.rankPL.FunctionCall;
import pl.stolorz.dsl.rankpl.rankPL.Minus;
import pl.stolorz.dsl.rankpl.rankPL.Model;
import pl.stolorz.dsl.rankpl.rankPL.Multi;
import pl.stolorz.dsl.rankpl.rankPL.NumberLiteral;
import pl.stolorz.dsl.rankpl.rankPL.Plus;
import pl.stolorz.dsl.rankpl.rankPL.RankPLPackage;
import pl.stolorz.dsl.rankpl.services.RankPLGrammarAccess;

@SuppressWarnings("all")
public class RankPLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RankPLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RankPLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RankPLPackage.DECLARED_PARAMETER:
				sequence_DeclaredParameter(context, (DeclaredParameter) semanticObject); 
				return; 
			case RankPLPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case RankPLPackage.DIV:
				sequence_Multiplication(context, (Div) semanticObject); 
				return; 
			case RankPLPackage.FUNCTION_CALL:
				sequence_PrimaryExpression(context, (FunctionCall) semanticObject); 
				return; 
			case RankPLPackage.MINUS:
				sequence_Addition(context, (Minus) semanticObject); 
				return; 
			case RankPLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RankPLPackage.MULTI:
				sequence_Multiplication(context, (Multi) semanticObject); 
				return; 
			case RankPLPackage.NUMBER_LITERAL:
				sequence_PrimaryExpression(context, (NumberLiteral) semanticObject); 
				return; 
			case RankPLPackage.PLUS:
				sequence_Addition(context, (Plus) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns Minus
	 *     Addition returns Minus
	 *     Addition.Plus_1_0_0_0 returns Minus
	 *     Addition.Minus_1_0_1_0 returns Minus
	 *     Multiplication returns Minus
	 *     Multiplication.Multi_1_0_0_0 returns Minus
	 *     Multiplication.Div_1_0_1_0 returns Minus
	 *     PrimaryExpression returns Minus
	 *
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Plus
	 *     Addition returns Plus
	 *     Addition.Plus_1_0_0_0 returns Plus
	 *     Addition.Minus_1_0_1_0 returns Plus
	 *     Multiplication returns Plus
	 *     Multiplication.Multi_1_0_0_0 returns Plus
	 *     Multiplication.Div_1_0_1_0 returns Plus
	 *     PrimaryExpression returns Plus
	 *
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeclaredParameter returns DeclaredParameter
	 *     AbstractDefinition returns DeclaredParameter
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DeclaredParameter(ISerializationContext context, DeclaredParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.ABSTRACT_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.ABSTRACT_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeclaredParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *     AbstractDefinition returns Definition
	 *
	 * Constraint:
	 *     (name=ID expr=Expression)
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.ABSTRACT_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.ABSTRACT_DEFINITION__NAME));
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.DEFINITION__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.DEFINITION__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefinitionAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     greetings+=AbstractDefinition+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Div
	 *     Addition returns Div
	 *     Addition.Plus_1_0_0_0 returns Div
	 *     Addition.Minus_1_0_1_0 returns Div
	 *     Multiplication returns Div
	 *     Multiplication.Multi_1_0_0_0 returns Div
	 *     Multiplication.Div_1_0_1_0 returns Div
	 *     PrimaryExpression returns Div
	 *
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Multi
	 *     Addition returns Multi
	 *     Addition.Plus_1_0_0_0 returns Multi
	 *     Addition.Minus_1_0_1_0 returns Multi
	 *     Multiplication returns Multi
	 *     Multiplication.Multi_1_0_0_0 returns Multi
	 *     Multiplication.Div_1_0_1_0 returns Multi
	 *     PrimaryExpression returns Multi
	 *
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=PrimaryExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, Multi semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.MULTI__LEFT));
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.MULTI__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FunctionCall
	 *     Addition returns FunctionCall
	 *     Addition.Plus_1_0_0_0 returns FunctionCall
	 *     Addition.Minus_1_0_1_0 returns FunctionCall
	 *     Multiplication returns FunctionCall
	 *     Multiplication.Multi_1_0_0_0 returns FunctionCall
	 *     Multiplication.Div_1_0_1_0 returns FunctionCall
	 *     PrimaryExpression returns FunctionCall
	 *
	 * Constraint:
	 *     (func=[AbstractDefinition|ID] (args+=Expression args+=Expression*)?)
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NumberLiteral
	 *     Addition returns NumberLiteral
	 *     Addition.Plus_1_0_0_0 returns NumberLiteral
	 *     Addition.Minus_1_0_1_0 returns NumberLiteral
	 *     Multiplication returns NumberLiteral
	 *     Multiplication.Multi_1_0_0_0 returns NumberLiteral
	 *     Multiplication.Div_1_0_1_0 returns NumberLiteral
	 *     PrimaryExpression returns NumberLiteral
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_PrimaryExpression(ISerializationContext context, NumberLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RankPLPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RankPLPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}