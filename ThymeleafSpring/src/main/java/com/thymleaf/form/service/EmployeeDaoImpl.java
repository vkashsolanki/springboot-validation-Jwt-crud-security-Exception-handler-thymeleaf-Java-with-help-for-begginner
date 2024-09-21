package com.thymleaf.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.form.model.Employee;
import com.thymleaf.form.repo.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void datasave(Employee employee) {
		Employee save = this.employeeRepository.save(employee);
				
	}

}
