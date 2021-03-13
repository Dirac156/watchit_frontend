// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watchit.springboot.service.UserService;
import com.watchit.springboot.web.dto.UserRegistrationDto;

@RestController
@RequestMapping("/registration")
// this class controls the flow of our data and updates the view to the user dependent on that
// it also allows us to map methods to http requests

public class UserRegistrationController {
	
	private UserService userService;

	// this is a method controller
	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//this method returns an empty user object stored in UserRegistration object
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	// this connects to the html form that our user sees when registering(handles the get request)
	@GetMapping
	public String showRegistrationForm() {
		return"registration.html";
	}
	
	// this method handles registration requests(handles the post requests)
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
		
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}

}
