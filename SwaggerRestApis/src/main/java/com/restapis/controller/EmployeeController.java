package com.restapis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapis.entity.Employee;
import com.restapis.services.EmployeeService;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping(value = "/saveemp")
	 public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		 Employee createEmployee = employeeService.createEmployee(employee);
		 
		 return new ResponseEntity<Employee>(createEmployee, HttpStatus.OK);
		 
		 
	 }

	
	
	
	
	
}
