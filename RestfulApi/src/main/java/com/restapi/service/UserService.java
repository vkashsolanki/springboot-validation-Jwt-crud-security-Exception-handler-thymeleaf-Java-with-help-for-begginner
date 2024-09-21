package com.restapi.service;

import com.restapi.entity.User;

public interface UserService {
	
	public User findByExitUser(User user);
	public String createUser(User user);
	public String createLogin(User user);
	

}
