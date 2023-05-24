package com.insurance.fetch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.fetch.model.Fetch;
import com.insurance.fetch.service.FetchService;


@RestController
public class FetchController {

	@Autowired
	private FetchService fetchservice;
	
	@GetMapping("fetch/branch/{id}")
	public Fetch getFetchById(@PathVariable Integer id) {
		
		Fetch fetch1 = fetchservice.getFetchById(id);
		return fetch1;
		
	}
}
