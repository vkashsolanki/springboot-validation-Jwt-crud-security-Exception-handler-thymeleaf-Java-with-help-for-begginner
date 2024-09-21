package com.apna.dao;

import java.net.URL;

import org.apache.axis.client.Service;

import com.dto.User;
import com.dao.service.UserServiceImplSoapBindingStub;

public class UserDao {
	
	
	public String saveData(User user) {
		
		try {
			
			Service service = new Service();
			URL url = new URL("http://localhost:8080/SoapWebServiceWithDb/services/UserServiceImpl");
			UserServiceImplSoapBindingStub bindingStub = new UserServiceImplSoapBindingStub(url,service);
			String user2 = bindingStub.addUser(user);
			
			return user2;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
		
		
	}

}
