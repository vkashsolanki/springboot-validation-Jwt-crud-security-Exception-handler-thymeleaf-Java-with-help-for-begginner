package com.thymleaf.form.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String phone, String password) {
		super();
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	
	
	
	
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password="
				+ password + "]";
	}

	
	
	

}
