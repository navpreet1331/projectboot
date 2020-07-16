package com.capgemini.book.service;

import java.awt.print.Book;
import java.util.List;

import com.capgemini.book.entity.shoppingcart;

public interface BookService {
	public shoppingcart addShoppingcart(Book book);
	public Boolean deleteBook(Integer theaterId);
	
	public List<Book> showAllshoppingcart();
	public Book showshoppingcart(int id);

}