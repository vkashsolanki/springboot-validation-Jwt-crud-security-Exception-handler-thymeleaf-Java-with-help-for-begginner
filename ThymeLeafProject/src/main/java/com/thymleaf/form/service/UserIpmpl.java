package com.thymleaf.form.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.form.model.User;
import com.thymleaf.form.repo.UserRepository;

@Service
public class UserIpmpl implements UserDao{
	
	@Autowired
	UserRepository repo;

	
	
	@Override
	public void saveData(User user) {
		this.repo.save(user);
		
	}







	

}
