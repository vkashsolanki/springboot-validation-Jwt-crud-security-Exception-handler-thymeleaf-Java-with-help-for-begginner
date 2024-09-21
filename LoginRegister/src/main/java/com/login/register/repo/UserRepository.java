package com.login.register.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.register.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
