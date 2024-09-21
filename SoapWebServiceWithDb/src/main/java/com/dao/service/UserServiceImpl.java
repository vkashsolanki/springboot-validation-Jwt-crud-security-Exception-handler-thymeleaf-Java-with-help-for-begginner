package com.dao.service;

import java.sql.SQLException;

import com.dao.UserDao;
import com.dto.User;

public class UserServiceImpl implements UserService {

	@Override
	public String addUser(User user1) {

		UserDao userDao = new UserDao();
		String userRegiter = userDao.userRegiter(user1);
		return userRegiter;

	}

}
