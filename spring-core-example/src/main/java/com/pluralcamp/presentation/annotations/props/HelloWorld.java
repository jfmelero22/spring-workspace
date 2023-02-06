package com.pluralcamp.presentation.annotations.props;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "helloWorld")
@Scope("prototype")
public class HelloWorld {
	
	@Autowired
	@Value("Hello World desde property")
	private String hello;
		
	private UUID uuid;

	//Constructor sin parametros ->
	public HelloWorld() {
		this.uuid = UUID.randomUUID();
	}


	public HelloWorld(String hello) {		
		this();
		this.hello = hello;
	}
	
	
	//getters y setters
	
	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	//getter @return
	public String getHello() {
		return hello;
	}
	
 //setter param hello
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	
}

