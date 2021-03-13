// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.service;

import com.watchit.springboot.domain.User;
import com.watchit.springboot.web.dto.UserRegistrationDto;

// this interface saves information acquired
public interface UserService {
	
	 User save(UserRegistrationDto registrationDto);

}
