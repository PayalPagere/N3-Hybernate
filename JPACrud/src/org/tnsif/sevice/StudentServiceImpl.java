package org.tnsif.sevice;

import org.tnsif.doa.StudentDao;
import org.tnsif.doa.StudentDaoImpl;
import org.tnsif.entites.Student;

public class StudentServiceImpl implements StudentService{

	
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}

	@Override
	public void add(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void update(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void delete(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student get(int rollno) {
		
		Student student=dao.getStudent(rollno);
		return student;
		
		
	}

}