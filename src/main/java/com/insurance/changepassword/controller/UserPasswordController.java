package com.insurance.changepassword.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.changepassword.model.UserPassword;
import com.insurance.changepassword.repository.UserPasswordRepository;
import com.insurance.changepassword.service.UserPasswordService;

@RestController
public class UserPasswordController {

	// Inject Service here
	@Autowired
	private UserPasswordService userPasswordService;

	// Inject Repository here
	@Autowired
	private UserPasswordRepository userPasswordRepository;

	// Design Rest API to Save Password
	@PostMapping("/saveUserPassword")
	public UserPassword savePassword(@RequestBody UserPassword userPassword) {
		UserPassword uPass = userPasswordService.saveUserPassword(userPassword);
		return uPass;
	}

	// Design Rest API to update Password
	@PutMapping("/changeUserPassword/{id}")
	public UserPassword getUserPassword(@PathVariable Integer id, @RequestBody UserPassword userPassword) {

		UserPassword user = userPasswordService.getUserPasswordById(id);

		//user.setPassword(userPassword.getPassword());
		user.setUpdatedPassword(userPassword.getUpdatedPassword());

		UserPassword user1 = userPasswordRepository.save(user);

		return user1;

	}
	
	// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(UserPasswordController.class);

}
