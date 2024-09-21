package com.thymleaf.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.form.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByEmailOrPhone(String email, String phone);
	public User findByEmailAndPassword(String email, String password);
	
	

}
