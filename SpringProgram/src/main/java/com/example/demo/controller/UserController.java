package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;
	
	@GetMapping("/")
	public String home()
	{
		
		return "register";
		
	}
	
	
	
	
	
	
	

}
