/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
