// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// serves thymeleaf templates

@Controller
public class MainController {
	
	// this method returns the log in page
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// this handles the main page request
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
