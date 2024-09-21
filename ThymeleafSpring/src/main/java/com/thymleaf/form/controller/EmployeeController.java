package com.thymleaf.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thymleaf.form.model.Employee;
import com.thymleaf.form.service.EmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDao dao;
	
	
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@GetMapping(value = "/saveregister")
	public String registerSave(@ModelAttribute("employee") Employee employee, Model model) {
		
		Employee employee2 = new Employee();
		model.addAttribute("employee", employee2);
		
		dao.datasave(employee);
		return "registerpage";
		
	}
	
}
