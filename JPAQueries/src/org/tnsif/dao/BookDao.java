package org.tnsif.dao;

import java.util.List;

import org.tnsif.entity.Book;

public interface BookDao {

	//abstract Methods
	List<Book>getAllBooks();
	List<Book>getBooks(String author);
	List<Book>getPriceRange(Float low,Float high);
	Book getBookById(Integer id);
	Long getBookCount();
	
	
}
