package com.pluralcamp.aspects.xml;

public class ItemsValidator {
	//Before-->Antes
	public void checkAmount() {
		System.out.println("Comprobando que la cantidad de"
				+ " producto sea correcta...");
	}
	
	//After --> Despues
	public void pack() {
		System.out.println("Se empaquetan los productos...");
	}
	
	//Cuando se lanza la excepción
	public void fileComplain() {
		System.out.println("Queja presentada por productos "
				+ "defectuosos");
	}	
	
}
