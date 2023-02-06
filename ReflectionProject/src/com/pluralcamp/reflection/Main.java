package com.pluralcamp.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) 
			throws ClassNotFoundException,InstantiationException,IllegalAccessException,IllegalArgumentException,InvocationTargetException,NoSuchMethodException,SecurityException{
		
		//Instrospeccion de clase
		Class<?> helloWorldClass =
				Class.forName("com.pluralcamp.reflection.HelloWorld");
		System.out.println(helloWorldClass);
		
		// Array de constructores
		Constructor[] constructors = helloWorldClass.getConstructors();
		System.out.printf("La clase %s tiene %d constructores %n", 
				helloWorldClass, constructors.length);
		
		// Se añade el metodo newIstance
		Object helloWorld = constructors[0].newInstance();
		System.out.println(helloWorld);
		
		Class[] noparams = {};
		Method method =
				helloWorldClass.getDeclaredMethod("sayHello", noparams);
		method.invoke(helloWorld, null);
		
		Method method2 =
				helloWorldClass.getDeclaredMethod("sayHello", String.class);
		method2.invoke(helloWorld, new String("Java"));		
	}

}
