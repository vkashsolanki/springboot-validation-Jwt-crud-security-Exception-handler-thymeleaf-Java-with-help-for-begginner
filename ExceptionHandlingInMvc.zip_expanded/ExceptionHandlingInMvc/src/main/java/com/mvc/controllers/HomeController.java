package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController 
{
	
	@GetMapping(value = "/")
	public String showPage(Model model)
	{
	//int x=10/0;	
	//String s=null;
	//s.length();
	model.addAttribute("title", "Homepage");	
	return "registerPage";	
	}
	
	@GetMapping(value = "/users")
	public String showUser(Model model)
	{
	 String s=null;
	 s.length();
	model.addAttribute("title", "Homepage");	
	return "users";	
	}
	
	
//	
//	@ExceptionHandler(value = ArithmeticException.class)
//	public String exceptionHandler(Model model)
//	{
//		model.addAttribute("err", "Arithmeic Issue occured...");
//		return "errorPage";
//	}
//
//	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandler1(Model model)
//	{
//		model.addAttribute("err", "Nullpointer Issue occured...");
//		return "errorPage";
//	}
//	
//
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandler2(Model model)
//	{
//		model.addAttribute("err", " Issue occured...");
//		return "errorPage";
//	}
//	

	
	
	
}
