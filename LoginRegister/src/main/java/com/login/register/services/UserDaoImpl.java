package com.login.register.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.register.entities.User;
import com.login.register.repo.UserRepository;

@Service
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private UserRepository repository;

	@Override
	public User userRegister(User user) {
		
		return null;
	}

}
