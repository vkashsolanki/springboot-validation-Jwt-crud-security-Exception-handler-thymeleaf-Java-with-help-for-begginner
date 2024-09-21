package com.restfulapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.entity.User;
import com.restfulapi.service.UserService;
import com.restfulapi.service.UserServiceImpl;

@RestController
@RequestMapping("api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("newuser")
	public String CreateNewUser(@Valid @RequestBody User user, BindingResult result) {
		
		if(result.hasErrors()) {
			// to show validation message on console and postman
			return result.toString();
		}
		else
		{
			String createUser = userService.createUser(user);		
			return createUser;
		}
		
		
	}
	@PostMapping("login")
	public String createLogin(@RequestBody User user) {
		String createLogin = userService.createLogin(user);
		return createLogin;
		
		
	}
	

}
