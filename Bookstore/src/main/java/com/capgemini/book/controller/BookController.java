package com.capgemini.book.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.book.entity.shoppingcart;
import com.capgemini.book.exception.BookException;
import com.capgemini.book.service.BookService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookController {

	@Autowired
	BookService BookService;
	
	//@CrossOrigin
	@PostMapping("/addThater")
	public ResponseEntity<String> addBook(@Valid @RequestBody Book book, BindingResult br)throws BookException{
		String err="";
		if(br.hasErrors()) {
			List<FieldError> errors= br.getFieldErrors();
			for(FieldError error:errors)
				err +=error.getDefaultMessage() +"<br/>";
			throw new BookException(err);
		}
		try {
			BookService.addBook(Book);
			return new ResponseEntity<String>("Theater added", HttpStatus.OK);
		}
		catch(DataIntegrityViolationException ex) {
			throw new BookException("ID already exists");
		}
	}
	
	//@CrossOrigin
	@DeleteMapping("/deleteTheater/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id)
	{
		BookService.deleteBook(id);
		return new ResponseEntity<String>("Book Deleted with "+id, HttpStatus.OK);
	}
	
	//@CrossOrigin
	@GetMapping("/viewAllBook")
	public ResponseEntity<List<Book>> viewAllBook(){
		List<Book> listOfBook=BookService.showAllshoppingcart();
		return new ResponseEntity<List<Book>>(listOfBook,HttpStatus.OK);
		
	}
	
	@GetMapping("/viewTheater/{id}")
	public ResponseEntity<Book> viewTheater(@PathVariable int id) throws BookException{
		Book book=bookService.showBook(id);
		if(book!=null)
			return new ResponseEntity<Book>(Book, HttpStatus.OK);
		else
			throw new BookException("ID doesn't exists");
	}
	

}


