package com.thymleaf.form.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymleaf.form.model.Person;
import com.thymleaf.form.repo.PersonRepository;
@Controller
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
//	@GetMapping(value = "/add")
//	public String showaddPerson() {
//		
//		return "add-person";
//	}

	@GetMapping("/add")
	public String addperson(@Valid  @ModelAttribute("person")Person person, BindingResult bindingResult, Model model) {
	if(bindingResult.hasErrors()) {
		model.addAttribute("person", person);
		return "add-person";
	}
		personRepository.save(person);
		return "redirect:/index";
	}
}
