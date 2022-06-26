package qtx.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import qtx.entidades.Persona;

public class TestConsultaXid {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("miBaseDeDatos");
		EntityManager em = fabrica.createEntityManager();
		
		Persona personaI = em.find(Persona.class, 4);
		System.out.println(personaI);
		
		em.createQuery("SELECT p FROM Persona p")
		   .getResultList()
		   .forEach( p -> System.out.println(p) );
		
		em.close();
	}

}
