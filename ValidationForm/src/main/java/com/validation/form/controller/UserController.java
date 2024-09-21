package com.validation.form.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.form.model.User;

@Controller
public class UserController {
	
	
	
	@GetMapping("/userdetail")
	public String getUser(ModelMap map) {
		map.addAttribute("user", new User());
		return "form";		
	}
	
	@PostMapping("/userdetail")
	public String PostUser(ModelMap map, @Valid User user, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors()) {
			return "user";	
		}
		map.addAttribute("user", user);
		System.out.println(user.getName() + " "+user.getEmail());
		return "welcome";
	}

}
