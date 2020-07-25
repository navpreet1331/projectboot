package com.capgemini.bookstore.exception;

import java.util.List;

import com.capgemini.bookstore.entity.Addbooktocart;

public class AddbooktocartException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AddbooktocartException() {
		super();
	}
	
	public AddbooktocartException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public AddbooktocartException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AddbooktocartException(String message) {
		super(message);
	}
	
	public AddbooktocartException(Throwable cause) {
		super(cause);
	}
	
	public List<Addbooktocart> show(){
		return null;
	}

}
