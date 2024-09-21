package com.restapis.service;

import com.restapis.exceptionhandler.BlogAlreadyExistException;
import com.restapis.exceptionhandler.BlogNotFindException;
import com.restapis.model.Blog;

public interface BlogService {
	
	
	public Blog saveBlog(Blog blog) throws BlogAlreadyExistException;
	//public Blog getById(long id) throws BlogNotFindException;
	
	

}
