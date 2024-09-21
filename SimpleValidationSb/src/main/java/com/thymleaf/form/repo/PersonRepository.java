package com.thymleaf.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thymleaf.form.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
