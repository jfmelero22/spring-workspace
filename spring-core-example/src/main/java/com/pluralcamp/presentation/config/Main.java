package com.pluralcamp.presentation.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld =
				(HelloWorld)context.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		
		context.close();
		
	}

}
