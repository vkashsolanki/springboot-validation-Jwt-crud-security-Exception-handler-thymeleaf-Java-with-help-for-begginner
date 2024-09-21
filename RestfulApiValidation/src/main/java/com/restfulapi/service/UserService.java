package com.restfulapi.service;

import com.restfulapi.entity.User;

public interface UserService {
	
	public User findExitsUser(User user);
	public String createUser(User user);
	public String createLogin(User user);

}
