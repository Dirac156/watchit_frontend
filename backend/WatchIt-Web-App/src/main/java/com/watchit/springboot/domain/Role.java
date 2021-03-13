// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.watchit.springboot.web.dto.UserRegistrationDto;

@Entity
@Table(name = "role")

// this class handles the roles for our users(admin, user)
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	// default constructor
	public Role() {
		super();
	}

	
	// a constructor with getters and setters below it
	public Role(String name) {
		super();
		this.name = name;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
