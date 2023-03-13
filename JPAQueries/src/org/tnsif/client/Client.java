package org.tnsif.client;

import org.tnsif.service.BookService;
import org.tnsif.service.BookServiceImp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service=new BookServiceImp();
		
		//to return total number of books;
		System.out.println("Total number of Books:"+service.getCount());
		
		//to return specific book id
		System.out.println("All Books:"+service.getBookByIds(3));
		
		//price Range
		System.out.println("Price range Between 300 to 700:"+service.getPrice(300.0f, 700.0f));
		
		//author name
		System.out.println("Books by author name:"+service.getBooksAuthor("Yashwanth"));
		
		//get all methods
		System.out.println("All the books"+service.getAll());
		
	}
	
}
