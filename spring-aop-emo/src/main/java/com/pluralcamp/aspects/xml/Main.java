package com.pluralcamp.aspects.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx =
				new ClassPathXmlApplicationContext(
						"spring-config.xml");
		
		Shopping purchase = (Purchase)ctx.getBean("purchase");
		System.out.println(purchase);
		try {
			purchase.buy(true);
		} catch (Exception e) {
			System.err.println("Error en la compra. Prueba de nuevo más tarde...");
		}
		ctx.close();
	}
}
