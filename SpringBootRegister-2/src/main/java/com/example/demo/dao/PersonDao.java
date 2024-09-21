package com.example.demo.dao;

import java.util.List;

import com.example.demo.entities.Person;

public interface PersonDao {
	public String regiter(Person person);
	public String login(Person person);
	public List<Person> showdata();
	public String  getRegisterEmail(Person person);
 
}
