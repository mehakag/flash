package com.sample.service;

import java.util.List;

import com.sample.model.Book;

public interface LibraryService {

	public List<Book> getBooks();

	public void createBook(Book book);

	public String deleteById(String id); 
		
	
}
