package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.model.Book;

@Service
public class LibraryServiceImp implements LibraryService{

	@Override
	public List<Book> getBooks() {


		ArrayList<Book> bookList = new ArrayList<Book>();
		Book book1= new Book(1,"SpringBook","KC DAS",200);
		Book book2= new Book(1,"Hibernate","Payal",200);
		Book book3= new Book(1,"ReactJS","Mehak",200);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		return bookList;
	}
	
	

}
