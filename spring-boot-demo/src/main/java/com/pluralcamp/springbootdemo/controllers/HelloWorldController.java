package com.pluralcamp.springbootdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Se determina que es un controlador Rest
@RestController
//Se mapea la clase Helloworldcontoller a localhost:8080/HelloWorld
@RequestMapping("HelloWorld")
public class HelloWorldController {
	// Se mapea con metodo GET en la url localhost:8080/HelloWorld/hello
	//El @RequestParam sirve para bindear el parametro ?name=valor. 
	//Se le añade el default value cuando no se llaman a todos los
	//parametros dentro del metodo, por ejemplo en el siguiente ejemplo saldría sin añadir params:
	// Hello World !!
	@GetMapping("/hello")
	public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name,@RequestParam(value = "surname", defaultValue = "!!") String surname) {
		return "Hello " + name + " " + surname;
	}
	//Hay que tener en cuenta que lo que retorna lo formatea en html, de ahí que se puedan añadir
	//las etiquetas html (en este caso negrita <b></b>).
	@GetMapping("/morning")
	public String goodMorning() {
		return "<b>Guten morgen</b>";
	}

}
