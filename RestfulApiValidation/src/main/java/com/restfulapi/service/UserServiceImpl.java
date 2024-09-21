package com.restfulapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapi.entity.User;
import com.restfulapi.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findExitsUser(User user) {
		User userExit =userRepository.findByEmailOrMobile(user.getEmail(), user.getMobile());
		return userExit;
	}

	@Override
	public String createUser(User user) {
		User findExitsUser = this.findExitsUser(user);
		if(findExitsUser != null) {
			
			return "Exiting User Email Or Mobile";
		}else {
			
			userRepository.save(user);
			return "Register Successful";
		}
		
	}

	@Override
	public String createLogin(User user) {
		User userLogin = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(userLogin != null) {
			
			return "Login Successful";	
		}else
		{
			
			return "Failed email and password";
		}
	}
	
	
	

}
