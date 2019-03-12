package com.sample.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Book;
import com.sample.service.LibraryService;

@RestController
public class LibraryResource {
	
	private static final Logger logger = LoggerFactory.getLogger(LibraryResource.class);
	
	@Autowired
	LibraryService libraryService;

	
	@RequestMapping(value="/books")
	@ResponseBody
	public ResponseEntity<Object> getBooks() {
		logger.info("Inside LibraryResource.getBooks()");
		
		List<Book> bookList = libraryService.getBooks();
		
		return new ResponseEntity<>(bookList,HttpStatus.OK);
				
		
	}
	
}