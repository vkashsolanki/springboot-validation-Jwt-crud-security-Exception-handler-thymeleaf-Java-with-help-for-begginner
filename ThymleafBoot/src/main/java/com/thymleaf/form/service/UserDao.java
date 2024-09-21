package com.thymleaf.form.service;

import com.thymleaf.form.model.User;

public interface UserDao {
	
	public User findExitsUser(User user);
	
	public String saveUser(User user);

}
