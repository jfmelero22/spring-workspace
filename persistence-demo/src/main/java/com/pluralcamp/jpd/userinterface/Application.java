package com.pluralcamp.jpd.userinterface;

import java.util.List;

import com.pluralcamp.jpd.entities.Color;
import com.pluralcamp.jpd.entities.Employee;
import com.pluralcamp.jpd.persistence.api.ColorDAO;
import com.pluralcamp.jpd.persistence.api.EmployeeDAO;
import com.pluralcamp.jpd.persistence.exceptions.DAOException;
import com.pluralcamp.jpd.persistence.providers.hibernate.ColorDAOHibernateImpl;
import com.pluralcamp.jpd.persistence.providers.jdbc.EmployeeDAOJDBCImpl;

public class Application {
	
	public static void main(String[] args) {
		ColorDAO colorDAO = new ColorDAOHibernateImpl();
		EmployeeDAO employeeDAO = new EmployeeDAOJDBCImpl();
	    
	
	    
		System.out.println("----- Lista de todos los colores: ------");
		
		//EJERCICIO: OBTENER LISTA DE COLORES
		
	    //Para obtener la lista de los colores:
		try {
            var colors = colorDAO.getColors();
            if (colors != null && !colors.isEmpty()) {
            	for(Color color : colors)
            		System.out.println(color.toString());
            }
            
        } catch (DAOException ex) {
            System.err.printf("Error:: %s %n", ex.getMessage());
        }				
		
	
	}
}