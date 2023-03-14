package org.tnsif.doa;

import org.tnsif.entites.Student;

public interface StudentDao {
	
	//abstract method
	void addStudent(Student student);//creation
	Student getStudent(int rollno);//Retrieve
	void updateStudent(Student student);//update
	void removeStudent(Student student);//delete
	
	void beginTransaction();
	void commitTransaction();

}