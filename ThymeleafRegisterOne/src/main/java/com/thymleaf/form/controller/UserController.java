package com.thymleaf.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thymleaf.form.entity.User;
import com.thymleaf.form.repo.UserRepository;
import com.thymleaf.form.service.UserDao;

@Controller
public class UserController {

	@Autowired
	private UserDao dao;

	@GetMapping(value = "/")
	public String home() {

		return "home";

	}

	// you can make sure for view register page through the home page then you will
	// have to show single ui on page
	@GetMapping("/registerui")
	public String register() {
		return "signup";
	}

	// @RequestMapping(value = "/register" , method = RequestMethod.GET)
	@PostMapping(value = "/register")
	public String signupPage(@ModelAttribute User user, Model model) {

		String register = dao.doRegister(user);
		if (register.equals("Registration Successfully")) {

			model.addAttribute("register", register);
			return "login";
		} else {
			model.addAttribute("register", register);
			return "signup";
		}

	}
	
	
	@GetMapping("/loginui")
	public String loginPage() {
		
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String doLogin(@ModelAttribute User user, Model model) {
		
		String login = dao.doLogin(user);
		System.out.println("Usercontroller login data emailandpassord"+login);
		if(login.equals("Login Successfully")) {
			
			model.addAttribute("login", login);
			return "home";
		}else
		{
			model.addAttribute("login", login);
			return "login";	
		}

	}
	
	@GetMapping(value = "/show")
	public String show(@ModelAttribute User user, Model model) {
		List<User> list = dao.getAllUser();
		System.out.println("list of user for controller"+list);
		model.addAttribute("lists", list);
		return "show";
	}
	
	

}
