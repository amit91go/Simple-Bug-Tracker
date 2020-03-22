package org.tracker.issue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tracker.issue.entities.User;
import org.tracker.issue.repositories.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User jsonUser) {
		
		User newUser = new User();
		newUser.setName(jsonUser.getName());
		newUser.setEmail(jsonUser.getEmail());
		newUser.setRole(jsonUser.getRole());
		return userRepository.save(newUser);
		
	}

	
}
