package org.tnsif.Unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee emp1=new Employee();
		emp1.setEmpname("Shital Moule");
		
		//second employee
		Employee emp2=new Employee();
		emp2.setEmpname("Vaibhav Karkute");
		
		//first address
		Address a1=new Address();
		a1.setPincode(440018);
		a1.setArea("Ganeshpeth");
		a1.setCity("Nagpur");
		a1.setState("Maharashtra");
		
		//second address
		Address a2=new Address();
		a2.setPincode(411014);
		a2.setArea("Airoli");
		a2.setCity("Mumbai");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();
	}

}