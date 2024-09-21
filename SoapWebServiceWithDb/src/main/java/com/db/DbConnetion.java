package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class DbConnetion {
	
	 static Connection connection= null;
	 
	 
	 private DbConnetion() {} 
	
	
	public static Connection getConnection() {
		
			try {
				
				
				if(connection != null) {
					Class.forName("com.mysql.cj.jdbc.Driver");
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soapwebservicelive", "root","root");
					
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		
		return connection;
		
		
	}
	
	

}
