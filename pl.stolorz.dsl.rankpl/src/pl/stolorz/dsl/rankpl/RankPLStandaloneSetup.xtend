/*
 * generated by Xtext 2.11.0
 */
package pl.stolorz.dsl.rankpl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RankPLStandaloneSetup extends RankPLStandaloneSetupGenerated {

	def static void doSetup() {
		new RankPLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
