package com.thymleaf.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thymleaf.form.model.User;
import com.thymleaf.form.service.UserDao;

@Controller
public class HomeController {

	@Autowired
	private UserDao dao;

	@GetMapping("/")
	public String home() {
		return "home";
	}

  @RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST })
    //@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String signup(@ModelAttribute User user, Model model) {
		String saveUser = dao.saveUser(user);
		if(saveUser.equals("Registration Successfully")) {

			model.addAttribute("saveUser1", saveUser);
			return "signup";
		} else {
			model.addAttribute("saveUser1", saveUser);
			return "login";

		}
	

	}
	


	@GetMapping("/login")
	public String loginpage() {
		return "login";
	}


}
