package com.pluralcamp.presentation.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		//Property dependency injection
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);
		
		//Constructor DI
		Student studentConst = (Student) context.getBean("studentConst");
		System.out.println(studentConst);
		
		context.close();

	}

}
