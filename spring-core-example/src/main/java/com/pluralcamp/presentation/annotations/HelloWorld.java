package com.pluralcamp.presentation.annotations;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("helloWorldConst")
public class HelloWorld {

	private String hello;
	private UUID uuid;
	
	public HelloWorld() {}
	
	@Autowired
	public HelloWorld(@Value("Hello World from constructor") String hello) {
		this.setUuid(UUID.randomUUID());
		this.setHello(hello);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}	
	
}
