package com.insurance.updatetransection.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updatetransection.model.Transection;
import com.insurance.updatetransection.repository.TransectionRepository;
import com.insurance.updatetransection.service.TransectionService;

@RestController
public class TransectionController {
	
	@Autowired
	private TransectionService transectionService;

	@Autowired
	private TransectionRepository transectionRepository;
	
	@PostMapping("/saveTransection")
	public Transection saveTransection(@RequestBody Transection transection) {
		return transectionService.saveTransection(transection);		
	}
	
	@PutMapping("/updateTransection/{id}")
	public Transection getTransection(@PathVariable Integer id, @RequestBody Transection transection) {
		Transection trans1 = transectionService.getTransection(id);
		trans1.setTransection_id(transection.getTransection_id());
		trans1.setAmount(transection.getAmount());
		trans1.setPolicy_id(transection.getPolicy_id());
		trans1.setTransection_status(transection.getTransection_status());
		
		return transectionRepository.save(trans1);
	}
	
	// Create Object of Logger
			private static final Logger logger = LoggerFactory.getLogger(TransectionController.class);
}
