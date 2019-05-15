package Componentes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class jpaDAO {

	static	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction transaccion = em.getTransaction();
	
	public static void agregar(Object objeto) throws Exception {		
		transaccion.begin();
		em.persist(objeto);
		transaccion.commit();
	}
	
	public static Persona encontrarPorId(int unId) {
		
		transaccion.begin();
		Persona auxiliar= em.find(Persona.class,unId);
		transaccion.commit();
		return auxiliar;
	}

	public static void eliminar(Persona unaPersona) {
		transaccion.begin();
		em.remove(em.contains(unaPersona) ? unaPersona : em.merge(unaPersona));
		transaccion.commit();
		System.out.println("se borro");
	}

	
//	public static void agregar(List<Object> objetos) throws Exception {
//		
//		for (int i = 0; i < objetos.size(); i++) {
//			agregar(objetos.get(i));
//		}
//		
//	}
//	
//	public static void borrar(Object objeto) throws Exception {
//		
//		transaccion.begin();
//		em.remove(objeto);
//		transaccion.commit();
//		
//		
//	}
//	
//	public static void actualizar(Object objeto) throws Exception {
//		
//		transaccion.begin();
//		em.merge(objeto);
//		transaccion.commit();
//		
//	}
}
