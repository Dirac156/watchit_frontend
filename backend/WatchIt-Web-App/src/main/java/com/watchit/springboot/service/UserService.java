// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.watchit.springboot.domain.User;
import com.watchit.springboot.web.dto.UserRegistrationDto;



// this interface saves information acquired
public interface UserService extends UserDetailsService{
	
	 User save(UserRegistrationDto registrationDto);

}
