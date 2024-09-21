package com.thymleaf.form.service;

import java.util.List;

import com.thymleaf.form.entity.User;

public interface UserDao {

	
	public User findExitUser(User user);
	public String doRegister(User user);
	public String doLogin(User user);
	public List<User> getAllUser();
	
}
