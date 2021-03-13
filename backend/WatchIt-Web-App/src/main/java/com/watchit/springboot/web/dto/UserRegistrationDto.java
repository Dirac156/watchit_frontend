// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.web.dto;

// this class sends all of the registration information to our backend
public class UserRegistrationDto {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	
	// default constructor
	public UserRegistrationDto() {
		super();
	}

	// initialization constructor, with getters and setters below it
	public UserRegistrationDto(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
