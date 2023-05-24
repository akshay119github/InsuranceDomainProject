package com.insurance.transection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.transection.model.Transection;
import com.insurance.transection.service.TransectionService;

@RestController
public class TransectionController {

	// injecting service here
	@Autowired
	private TransectionService transectionService;
@GetMapping("/getId/{id}")
	public ResponseEntity<List<Transection>> getTransectionById(@PathVariable("id") Integer id) {
		List<Transection> trans = transectionService.getListById(id);
		return ResponseEntity.ok().body(trans);

	}
}
