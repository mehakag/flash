package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.model.Book;

@Service
public class LibraryServiceImp implements LibraryService {

	private static final Logger logger = LoggerFactory.getLogger(LibraryServiceImp.class);

	@Override
	public List<Book> getBooks() {

		List<Book> bookList = new ArrayList<Book>();
		Book book1 = new Book(1, "SpringBook", "KC DAS", 200);
		Book book2 = new Book(2, "Hibernate", "Payal", 200);
		Book book3 = new Book(3, "ReactJS", "Mehak", 200);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		return bookList;
	}

	@Override
	public void createBook(Book book) {
		// TODO Auto-generated method stub
		logger.info("This Book is created successfully ");

	}

	@Override
	public int deleteById(int id) {
		return id;
	}

	@Override
	public int remove(int price) {
		return price;
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook(int price, Book book) {
		// TODO Auto-generated method stub
		logger.info("This Book is updated successfully ");
	}

}
