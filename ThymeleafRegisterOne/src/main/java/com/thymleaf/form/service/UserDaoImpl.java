package com.thymleaf.form.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.form.entity.User;
import com.thymleaf.form.repo.UserRepository;
@Service
public class UserDaoImpl implements UserDao{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findExitUser(User user) {
		
		User emailOrPhone = userRepository.findByEmailOrPhone(user.getEmail(), user.getPhone());
		
		return emailOrPhone;
	}

	@Transactional
	@Override
	public String doRegister(User user) {
		User exitUser = this.findExitUser(user);
		//User exitUser = userRepository.findByEmailOrPhone(user.getEmail(), user.getPhone());
		if(exitUser!=null) {
			return "Email or Phone already Exits";
		}else {
		User save = userRepository.save(user);
		System.out.println("printing dao register seccess"+save);
		return "Registration Successfully";
	}
	
 

}

	@Override
	@Transactional
	public String doLogin(User user) {
		
		User emailAndPassword = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
		System.out.println("userimpl data emailandpassword ::"+emailAndPassword);
		if(emailAndPassword!=null) {
			return "Login Successfully";
		}else
		{
			return "Ivalid email and password";
		}

	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userRepository.findAll();
		System.out.println("DAo list"+list);
		return list;
	}


}
