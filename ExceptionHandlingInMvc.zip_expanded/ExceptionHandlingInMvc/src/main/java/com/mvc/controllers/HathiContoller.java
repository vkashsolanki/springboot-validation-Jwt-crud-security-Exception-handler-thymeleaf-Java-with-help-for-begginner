package com.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HathiContoller {

	@GetMapping(value = "/hathi")
	public String showPage(Model model)
	{
	int x=10/0;	
	model.addAttribute("title", "Homepage");	
	return "registerPage";	
	}
	
}
