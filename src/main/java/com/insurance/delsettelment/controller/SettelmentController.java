package com.insurance.delsettelment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.delsettelment.service.SettelmentService;

@RestController
public class SettelmentController {

	@Autowired
	private SettelmentService settelementService;
	
	@DeleteMapping("/settelement/delete/{Id}")
	public void deleteById(@PathVariable("id") Integer id) {
		settelementService.deleteSettelmentById(id);
	}
}
