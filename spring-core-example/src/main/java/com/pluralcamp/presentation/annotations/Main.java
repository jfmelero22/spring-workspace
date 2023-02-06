package com.pluralcamp.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext();
		
		AnnotationConfigApplicationContext annotationContext =
				(AnnotationConfigApplicationContext)context;
		
		annotationContext.scan("com.pluralcamp.presentation.annotations");
		annotationContext.refresh();
		
		//Constructor DI con anotaciones
		
		HelloWorld helloWorld = 
				(HelloWorld)annotationContext.getBean("helloWorldConst");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());
		
		HelloWorld helloWorld2 = 
				(HelloWorld)annotationContext.getBean("helloWorldConst");
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getHello());
				
				
	}

}
