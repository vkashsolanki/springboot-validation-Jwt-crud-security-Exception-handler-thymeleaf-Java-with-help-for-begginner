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
public class UserController {
	@Autowired
	private UserDao dao;

	@RequestMapping("/")
	public String homePage() {

		return "home";
	}
	@RequestMapping(value = "/saveregister", method = RequestMethod.GET)
	public String registerPage(@ModelAttribute("user") User user, Model model) {		
		//User user2 = new User();
		model.addAttribute("user", user);
		dao.saveData(user);

		return "register";

	}
}