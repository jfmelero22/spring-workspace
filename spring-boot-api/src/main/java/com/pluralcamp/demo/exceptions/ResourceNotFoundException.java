package com.pluralcamp.demo.exceptions;

public class ResourceNotFoundException extends Exception {
	
	//Las escepciones tienen que ser serialiabes.
	//que se pueda guardar en el disco o enviar por la red.
	//pj e cuando quieren hacer un log de la excepcion
	//p ej cuando se quiere envuar una ecepcion al cliente.
	private static final long serialVersionUID = 1L;
	
	//se manda con el super la excepcion a su padre "Exception"
	public ResourceNotFoundException(String message) {
		super(message);
	}
	

}
