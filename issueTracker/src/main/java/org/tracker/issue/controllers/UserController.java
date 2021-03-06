package org.tracker.issue.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.tracker.issue.entities.User;
import org.tracker.issue.repositories.UserRepository;
import org.tracker.issue.services.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@Valid @RequestBody User jsonUser) {		
		return userService.createUser(jsonUser);		
	}
	
	
	@GetMapping("/users")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUsers()
	{
		return userService.getUsers();	
	}
	
	

	
}
