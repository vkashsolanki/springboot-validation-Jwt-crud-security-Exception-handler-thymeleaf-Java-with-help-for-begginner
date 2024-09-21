package com.thymleaf.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.form.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
