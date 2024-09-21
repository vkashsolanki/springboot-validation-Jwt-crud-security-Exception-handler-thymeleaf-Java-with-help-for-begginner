package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DbConnetion;
import com.dto.User;

public class UserDao {
	
	public String userRegiter(User user){
		
		
		try {
			
			Connection connection = DbConnetion.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into user(name,email,mobile,password) value(?,?,?,?");
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getEmail());
			prepareStatement.setString(3, user.getMobile());
			prepareStatement.setString(4, user.getPassword());
			
			int update = prepareStatement.executeUpdate();
			connection.close();
			
			if (update > 0)
			{
				return "successful";
			}
			
			return "Failed ";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Failed";

		
		
	}

}
