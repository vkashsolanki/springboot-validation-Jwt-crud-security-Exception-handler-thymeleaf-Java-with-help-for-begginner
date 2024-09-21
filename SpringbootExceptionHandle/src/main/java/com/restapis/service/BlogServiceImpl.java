package com.restapis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapis.exceptionhandler.BlogAlreadyExistException;
import com.restapis.exceptionhandler.BlogNotFindException;
import com.restapis.model.Blog;
import com.restapis.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{
	
	@Autowired
	private BlogRepository blogRepository;

	@Override
	public Blog saveBlog(Blog blog) throws BlogAlreadyExistException {
		if(blogRepository.existsById(blog.getId())) {
			throw new BlogAlreadyExistException();
		}
		Blog save = blogRepository.save(blog);
		return save;
	}

	

}
