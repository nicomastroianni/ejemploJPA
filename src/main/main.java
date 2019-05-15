package main;

import Componentes.Persona;
import Componentes.jpaDAO;

public class main {

	public static void main(String[] args) throws Exception {
		// https://www.arquitecturajava.com/jpa-entitymanager-metodos/
		// https://www.arquitecturajava.com/ejemplo-de-jpa/
		try {
		//-------------PERSIST------------------
//		Persona persona1 = new Persona(12347,"elsaBroso");
//			jpaDAO.agregar(persona1); //FUNCIONA
		
		//-------------FIND---------------------
//		Persona auxiliar9 = jpaDAO.encontrarPorId(12347); //FUNCIONA
//		System.out.println(auxiliar9.getNombre());
		
		//-------------REMOVE--------------------
//		Persona auxiliar2= new Persona(12347,"elsaBroso"); // FUNCIONA
//		jpaDAO.eliminar(auxiliar2);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}

}
