package com.restfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmailOrMobile(String email, String mobile);
	public User findByEmailAndPassword(String email, String password);

}
