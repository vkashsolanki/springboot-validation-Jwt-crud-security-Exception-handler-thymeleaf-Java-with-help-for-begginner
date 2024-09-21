package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.entity.User;
import com.restapi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public User findByExitUser(User user) {
		User userExit = userRepository.findByEmailOrMobile(user.getEmail(), user.getMobile());
		
		return userExit;
		

	}

	
	
	@Override
	public String createUser(User user) {

			User byExitUser = this.findByExitUser(user);
			if
			(byExitUser != null) {
				
				return "Email Or Mobile Already Exit User";
			}
			else
			{
				User save = userRepository.save(user);
				return "Sucessful register";
				
			}
	
	      
	
}



	@Override
	public String createLogin(User user) {
		User findByEmailAndPassword = this.userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		if(findByEmailAndPassword !=  null ) {
			
			return "Login Successfull";
			
		}else
		{
			return "Login Failed";	
		}
		
		
	}
	
	
}



