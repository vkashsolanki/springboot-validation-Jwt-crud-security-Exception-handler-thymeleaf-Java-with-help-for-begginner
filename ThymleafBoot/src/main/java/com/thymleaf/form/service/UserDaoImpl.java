package com.thymleaf.form.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.form.model.User;
import com.thymleaf.form.repo.UserRepository;

@Service
public class UserDaoImpl implements UserDao {
	@Autowired
	UserRepository repository;
	
	
	@Override
	public User findExitsUser(User user) {
		User user1 = repository.findByEmailOrPhone(user.getEmail(), user.getPhone());
		System.out.println("Printing From DaoImpl "+user1);
		return user1;
	}
	
	

	@Override
	@Transactional
	public String saveUser(User user) {
		User exitsUser = this.findExitsUser(user);
		
		if(exitsUser!=null) {
			return "Email Or Phone already Exits";
		}
		else
		{
			return "Registration Successfully";
		}
		
	}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	@Transactional
//	public String saveUser(User user) {
//
//		User users = repository.findByEmailOrPhone(user.getEmail(), user.getPhone());
//		if (users!= null) {
//
//			return "Email or phone already Exit";
//
//		} else {
//			repository.save(user);
//			return "Registeration Successfully";
//		}
//
//	}

}
