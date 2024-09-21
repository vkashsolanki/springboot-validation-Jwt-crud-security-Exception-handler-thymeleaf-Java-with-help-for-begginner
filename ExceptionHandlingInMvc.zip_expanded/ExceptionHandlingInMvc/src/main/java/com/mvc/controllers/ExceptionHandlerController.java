package com.mvc.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionHandlerController {

 
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = ArithmeticException.class)
	public String exceptionHandler(Model model)
	{
		model.addAttribute("err", "Arithmeic Issue occured...");
		return "errorPage";
	}
	

	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandler1(Model model)
	{
		model.addAttribute("err", "Nullpointer Issue occured...");
		return "errorPage";
	}
	
	

	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler2(Model model)
	{
		model.addAttribute("err", " Issue occured...");
		return "errorPage";
	}
	
	

	
}
