package com.restapis.exceptionhandler;

public class BlogNotFindException extends RuntimeException{

	private String message;

	public BlogNotFindException(String message) {
		super(message);
		this.message = message;
	}
	
	public BlogNotFindException() {}
	
	
	
}
