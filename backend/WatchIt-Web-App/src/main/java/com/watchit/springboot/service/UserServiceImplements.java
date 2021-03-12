package com.watchit.springboot.service;

import java.util.Arrays;


import org.springframework.stereotype.Service;

import com.watchit.springboot.domain.Role;
import com.watchit.springboot.domain.User;
import com.watchit.springboot.repository.UserRepository;
import com.watchit.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImplements implements UserService{
	
	
	private UserRepository userRepository ;
	
	

	public UserServiceImplements(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(),registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
		
	}

}
