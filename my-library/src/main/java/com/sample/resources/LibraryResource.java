package com.sample.resources;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Book;

@RestController
public class LibraryResource {
	
	@RequestMapping(value="/books")
	@ResponseBody
	public ResponseEntity<Object> getBooks() {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		Book book1= new Book(1,"SpringBook","KC DAS",200);
		Book book2= new Book(1,"Hibernate","Payal",200);
		Book book3= new Book(1,"ReactJS","Mehak",200);
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		return new ResponseEntity<>(bookList,HttpStatus.OK);
				
		
	}
	
}