package com.restfulapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;	
	@NotEmpty(message = "cant be blank")
	private String name;
	@NotEmpty(message = "cant be blank")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	@NotEmpty( message = "cant be blank")
	@Size(min = 10, max = 10)
	private String mobile;
	@NotEmpty(message = "cant be blank")
	@Size(min = 3)
	private String password;
	

}
