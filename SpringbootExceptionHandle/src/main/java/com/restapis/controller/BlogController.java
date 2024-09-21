package com.restapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapis.model.Blog;
import com.restapis.service.BlogService;

@ControllerAdvice
@RequestMapping("/blog")
public class BlogController {
	@Autowired
	private BlogService blogService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog){
		
		Blog saveBlog = blogService.saveBlog(blog);
		
		return new ResponseEntity<>(saveBlog, HttpStatus.CREATED);
		
	}
	
	

}
