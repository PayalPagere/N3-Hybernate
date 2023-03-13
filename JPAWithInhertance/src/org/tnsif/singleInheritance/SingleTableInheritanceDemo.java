package org.tnsif.singleInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
	   //1st Employee
		Employee e1=new Employee();
		e1.setId(121);
		e1.setName("Payal Pagere");
		e1.setSalary(25000.50f);
		em.persist(e1);
		
		//2nd emp
		Employee e2=new Employee();
		e2.setId(122);
		e2.setName("Sharad Pawar");
		e2.setSalary(45000.50f);
		em.persist(e2);
		
		//first Manager
		Manager m=new Manager();
		m.setId(125);
		m.setName("Saurav Khairnar");
		m.setSalary(42000.45f);
		m.setDeptId(45);
		m.setDeptName("EXTC");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

	
	
	
}
