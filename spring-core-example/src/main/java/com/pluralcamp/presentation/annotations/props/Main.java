package com.pluralcamp.presentation.annotations.props;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext();

		AnnotationConfigApplicationContext annotationContext = 
				(AnnotationConfigApplicationContext) context;

		annotationContext.scan("com.pluralcamp.presentation.annotations.props");
		annotationContext.refresh();

		// Constructor Dependency Injection con anotaciones
		HelloWorld helloWorld = 
				(HelloWorld) annotationContext.getBean("helloWorld");
		System.out.println(helloWorld.getUuid());
		System.out.println(helloWorld.getHello());

		// Crearemos una instancia y comprobaremos la Uuid
		HelloWorld helloWorld2 = 
				(HelloWorld) annotationContext.getBean("helloWorld");
		System.out.println(helloWorld2.getUuid());
		System.out.println(helloWorld2.getHello());

		context.close();

	}

}
