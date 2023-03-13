package org.tnsif.joinedInheritance;

import java.io.Serializable;

import javax.persistence.Id;

public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private Integer rollno;
	private String name;
	private Float percentage;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPercentage() {
		return percentage;
	}
	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}
	
	

}