package org.tnsif.joinedInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedInheritanceDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first student
		Student e3=new Student();
		e3.setRollno(1001);
		e3.setName("Mansi");
		e3.setPercentage(85.90f);
		em.persist(e3);
		
		//second student
		Student e4=new Student();
		e4.setRollno(1002);
		e4.setName("Rohini");
		e4.setPercentage(81.90f);
		em.persist(e4);
		
		//first citizen
		Citizen m1=new Citizen();
		m1.setRollno(1500);
		m1.setName("Aakansha");
		m1.setPercentage(76.56f);
		m1.setCitizenType("India");
		m1.setPassportno(1657687);
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}
}
