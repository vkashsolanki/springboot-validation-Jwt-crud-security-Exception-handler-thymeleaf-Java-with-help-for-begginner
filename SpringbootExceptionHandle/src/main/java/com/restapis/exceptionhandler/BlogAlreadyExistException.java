package com.restapis.exceptionhandler;

public class BlogAlreadyExistException extends RuntimeException{
	
	private String message;
	
	public BlogAlreadyExistException(String message) {
		super(message);
		this.message = message;
		
	}
	
	public BlogAlreadyExistException() {}
	

}
