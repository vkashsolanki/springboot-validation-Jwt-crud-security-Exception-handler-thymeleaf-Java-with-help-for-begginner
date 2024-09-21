package com.restsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

	@GetMapping("/hi")
	public String home() {
		
		return "hellopw";
	}
	
	
	
			
	
	

}
