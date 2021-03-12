package com.watchit.springboot.service;

import com.watchit.springboot.domain.User;
import com.watchit.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	
	 User save(UserRegistrationDto registrationDto);

}
