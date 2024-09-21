package com.restapis.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String tittle;
	private String creator;
	@UpdateTimestamp
	private Date postTime;

}
