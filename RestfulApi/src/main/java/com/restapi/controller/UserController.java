package com.restapi.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.User;
import com.restapi.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl serviceImpl;

	@PostMapping("save")
	public String saveUser(@Valid @RequestBody User user, BindingResult result) {
		
         
            
            if(result.hasErrors()) {
            	System.out.println("REsult is what ......."+result);
            	return "Not Blank!..";
            	
            }
            else
            {
            	String createUser = serviceImpl.createUser(user);
            	return createUser;
            	
            }

	
	}
	@PostMapping("log")
	public String loginUser(@RequestBody User user) {
		
		String createLogin = serviceImpl.createLogin(user);
		
		return createLogin;
	}
	
	
}
