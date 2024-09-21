package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.PersonDao;
import com.example.demo.entities.Person;

@Controller
public class PersonController {
	
	@Autowired
	private PersonDao dao;
	
	
	@GetMapping( value = "/")
	public String show() {
		
		return "register";
	}
	
	@PostMapping(value = "/register" )
	public String register(@ModelAttribute Person person, Model model)
	{
		String email = dao.getRegisterEmail(person);
		if(email.equals("Already Used email ID")) {
			model.addAttribute("ema", email);
			return "register";
		}
		
		String regis = dao.regiter(person);
		if(regis.equals("Register successfull")) {
			model.addAttribute("regist", regis);
			return "login";
			
		}
		
		return "register";
	}
		
		
		
		
//		String regis = dao.regiter(person);
//		if(regis.equals("Register successfull"))
//		{
//			model.addAttribute("regist", regis);	
//			return "login";
//		}
//		return "register";

	
		
	@PostMapping(value = "/login")
	public String login(@ModelAttribute Person person, Model model)
	{
		String log = dao.login(person);
		
		if(log.equals("login sucessfull")) 
		{
		model.addAttribute("login", log);
		return "show";
	}
	
	   return "register";

   }
	@GetMapping(value = "/show")
	public String show(@ModelAttribute Person person, Model model)
	{
		List<Person> showdata = dao.showdata();
		
		model.addAttribute("list", showdata);
		
		return "show";
	}

}



