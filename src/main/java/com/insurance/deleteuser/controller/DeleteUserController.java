package com.insurance.deleteuser.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.deleteuser.service.DeleteUserService;



@RestController
public class DeleteUserController {

	// inject user service here
	@Autowired
	private DeleteUserService deleteUserService;

	@DeleteMapping("/deleteUser/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) throws Exception {
		deleteUserService.deleteUser(id);
	}

}
