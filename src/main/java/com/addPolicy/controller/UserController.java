package com.addPolicy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.addPolicy.model.User;
import com.addPolicy.service.UserService;

@RestController
public class UserController {

	// Inject Service here
	@Autowired
	private UserService userService;

	// Design Restful API to add user details into database
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user2 = userService.saveUserDetails(user);
		return user2;
	}

}
