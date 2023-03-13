package org.tnsif.doa;

import javax.persistence.EntityManager;

import org.tnsif.entites.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager em;
	
	public StudentDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	//creation/insertion/add
	@Override
	public void addStudent(Student student) {
		em.persist(student);
		
	}

	//retrieve/find/search
	@Override
	public Student getStudent(int rollno) {
		Student student=em.find(Student.class,rollno);
		return student;
	}

	//updation
	@Override
	public void updateStudent(Student student) {
		em.merge(student);
		
	}

	//deletion
	@Override
	public void removeStudent(Student student) {
		em.remove(student);
		
	}

	//starting the transaction
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	//stopping the transaction
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();		
	}

}