package org.tnsif.service;

import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImp;
import org.tnsif.entity.Book;

public class BookServiceImp implements BookService{
	
	private BookDao dao;
	
	public BookServiceImp()
	{
		dao=new BookDaoImp();
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBooksAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.getBooks(author);
	}

	@Override
	public List<Book> getPrice(Float low, Float high) {
		// TODO Auto-generated method stub
		return dao.getPriceRange(low, high);
	}

	@Override
	public Book getBookByIds(Integer id) {
		// TODO Auto-generated method stub
		return dao.getBookById(id);
	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		return dao.getBookCount();
	}
	
	
}

