package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Person;
import com.example.demo.repo.PersonRepository;
@Service
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private PersonRepository repo;

	@Override
	public String regiter(Person person) {
		Person person2 = repo.save(person);
		if(person2!=null)
		{
			return "Register successfull";
		}else
		{
			return "Failed";
		}
	}

	@Override
	public String login(Person person) {
		 Person person2 = repo.findByEmailAndPassword(person.getEmail(), person.getPassword());
		 if(person2!=null) {
			 return "login sucessfull";
		 }else {
			 return "failed";
		 }
	}

	@Override
	public List<Person> showdata() {
		List<Person> find = repo.findAll();
		
		return find;
	}




	
	

}
