package com.restapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty(message = "Cant be empty!")
	private String name;
	@NotEmpty(message = "Email cannot be blank")
	//@Pattern(regexp = "/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$/",message = "Incorrect format of email")
	private String email;
	@NotEmpty(message = "Mobile cannot be blank")
	@Size(min = 10,max = 10,message = "Mobile must be of 10 digits")
	private String mobile;
	@NotEmpty(message = "Pass cannot be blank")
	private String password;
	

}
