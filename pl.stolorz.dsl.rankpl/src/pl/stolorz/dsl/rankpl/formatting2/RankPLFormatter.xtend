/*
 * generated by Xtext 2.11.0
 */
package pl.stolorz.dsl.rankpl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pl.stolorz.dsl.rankpl.rankPL.AbstractDefinition
import pl.stolorz.dsl.rankpl.rankPL.Definition
import pl.stolorz.dsl.rankpl.rankPL.Model
import pl.stolorz.dsl.rankpl.services.RankPLGrammarAccess

class RankPLFormatter extends AbstractFormatter2 {
	
	@Inject extension RankPLGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (AbstractDefinition abstractDefinition : model.getGreetings()) {
			abstractDefinition.format;
		}
	}

	def dispatch void format(Definition definition, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		definition.regionFor.keyword(";").append[newLine];
		definition.regionFor.keyword(";").prepend[noSpace];
		definition.getExpr.format;
	}
	
	// TODO: implement for FunctionCall, Plus, Minus, Multi, Div
}
