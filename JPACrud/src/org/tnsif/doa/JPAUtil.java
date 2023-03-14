package org.tnsif.doa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	//static block
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	//static method 
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
		
	}

}