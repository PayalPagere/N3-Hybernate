package org.tnsif.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//entity
//below annotation ensures that given class is entity
@Entity
@Table(name="student")
public class Student {
	
	//private data members
	//below annotation ensures that rollno is primary key
	@Id
	private int rollno;
	private String name;
	
	//getters and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}