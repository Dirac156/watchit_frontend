// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.service;

import java.util.Arrays;


import org.springframework.stereotype.Service;

import com.watchit.springboot.domain.Role;
import com.watchit.springboot.domain.User;
import com.watchit.springboot.repository.UserRepository;
import com.watchit.springboot.web.dto.UserRegistrationDto;

@Service
// this class is used to transfer data between server and the client using the UserService interface

public class UserServiceImplements implements UserService{
	
	
	private UserRepository userRepository ;
	
	
// this is a constructor
	public UserServiceImplements(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	
	// this method helps us save data back into our system
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
		
		
	}

}
