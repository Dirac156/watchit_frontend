// Author : Fiona Mukuhi Ng'ang'a

package com.watchit.springboot.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.jboss.jandex.ClassExtendsTypeTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.watchit.springboot.domain.Role;
import com.watchit.springboot.domain.User;
import com.watchit.springboot.repository.UserRepository;
import com.watchit.springboot.web.dto.UserRegistrationDto;

@Service
// this class is used to transfer data between server and the client using the UserService interface

public class UserServiceImplements implements UserService {

	private UserRepository userRepository;
	
	// we inject the encoder class here to encrypt passwords
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

// this is a constructor
	public UserServiceImplements(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override

	// this method helps us save data back into our system and generate encoded password formats
	public User save(UserRegistrationDto registrationDto) {

		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), registrationDto.getEmail(),
				passwordEncoder.encode(registrationDto.getPassword()), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);

	}

	@Override
	// locates the user based on the user name
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				mapRolesToAuthorities(user.getRoles()));
	}
	//method maps roles to authorities
	private Collection<? extends GrantedAuthority > mapRolesToAuthorities (Collection<Role> roles){
		
		
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		
		
		
		
	}
	
	
	
}
