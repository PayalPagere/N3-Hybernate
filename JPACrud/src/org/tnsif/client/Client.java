package org.tnsif.client;

import java.util.Scanner;

import org.tnsif.entites.Student;
import org.tnsif.sevice.StudentService;
import org.tnsif.sevice.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	
		Student s1=new Student();
		
		//add
		/*System.out.println("Enter the rollno and name:");
		s1.setRollno(s.nextInt());
		s1.setName(s.nextLine());
		service.add(s1);
		
		System.out.println("Student added successfully");*/
		
		//updation
		/*System.out.println("Enter the rollno for that u want to update a data");
		s1=service.get(s.nextInt());
		System.out.println("Enter the name that u want to update");
		
		s1.setName(s.next());
		service.update(s1);
		System.out.println("Updated Successfully");*/
		
		//retrive
		/*System.out.println("Enter the rollno for retrive");
		s1=service.get(s.nextInt());
		System.out.println("rollno: "+s1.getRollno());
		System.out.println("Name: "+s1.getName());
		System.out.println("Successfully done!");*/
		
		//delete
		System.out.println("Enter the rollno that want to delete");
		s1=service.get(s.nextInt());
		service.delete(s1);
		System.out.println("Deleted Successfully");
		
		
	}

}