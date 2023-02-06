package com.pluralcamp.presentation.config;

public class HelloWorld {
	
	private String hello;
	
	public HelloWorld() {
		
	}
	
	public HelloWorld(String hello) {
		this.setHello(hello);
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}	
}
