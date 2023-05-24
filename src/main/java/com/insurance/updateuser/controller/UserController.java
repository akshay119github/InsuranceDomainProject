package com.insurance.updateuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updateuser.model.User;
import com.insurance.updateuser.repository.UserRepository;
import com.insurance.updateuser.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user/update/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id, @RequestBody User user){
	
	User user1 =	userService.getUserById(id);
	user1.setPolicyId(user.getPolicyId());
	user1.setFirstName(user.getFirstName());
	user1.setLastName(user.getLastName());
	user1.setMobileNumber(user.getMobileNumber());
	user1.setDOB(user.getDOB());
	user1.setEmailAddress(user.getEmailAddress());
	
	User user2 = userRepository.save(user1);
	
	return ResponseEntity.ok().body(user2);
		
	}

}
