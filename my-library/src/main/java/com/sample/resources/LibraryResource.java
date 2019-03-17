package com.sample.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Book;
import com.sample.service.LibraryService;

@RestController
public class LibraryResource {

	private static final Logger logger = LoggerFactory.getLogger(LibraryResource.class);

	@Autowired
	LibraryService libraryService;

	@RequestMapping(value = "/books")
	@ResponseBody
	public ResponseEntity<Object> getBooks() {
		logger.info("Inside LibraryResource.getBooks()");

		List<Book> bookList = libraryService.getBooks();

		return new ResponseEntity<>(bookList, HttpStatus.OK);

	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Object> createBook(@RequestBody Book book) {
		 libraryService.createBook(book);

		return new ResponseEntity<>("This Book is created successfully", HttpStatus.CREATED);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
	      String remove =libraryService.deleteById(id);
	      return new ResponseEntity<>(remove, HttpStatus.OK);
	   }
}