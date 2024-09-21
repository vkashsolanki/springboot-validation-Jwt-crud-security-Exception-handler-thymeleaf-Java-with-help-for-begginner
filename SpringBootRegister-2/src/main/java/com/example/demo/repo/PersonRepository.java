package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	public Person findByEmailAndPassword(String email, String password);
	public Person findByEmail(String email);
	

}
