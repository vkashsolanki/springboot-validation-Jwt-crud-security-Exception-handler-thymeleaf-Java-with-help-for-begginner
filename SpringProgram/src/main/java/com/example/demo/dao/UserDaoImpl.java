package com.example.demo.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserDaoImpl implements UserDao{
	@Autowired
	private UserRepository repository;

	@Override
	@Transactional
	public String register(User user) {
		
		User iuser = repository.save(user);	
		if(iuser!=null)
		{
			return "Registeration success !.";
		}else {
			return "Failed Plz Try Again";
			
		}
		

	}



}
