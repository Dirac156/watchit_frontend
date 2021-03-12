package com.watchit.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.watchit.springboot.service.UserService;
import com.watchit.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
		
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}

}
