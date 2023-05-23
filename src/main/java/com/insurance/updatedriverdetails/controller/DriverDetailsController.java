package com.insurance.updatedriverdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updatedriverdetails.model.DriverDetails;
import com.insurance.updatedriverdetails.service.DriverDetailsService;

@RestController
public class DriverDetailsController {
	@Autowired
	private DriverDetailsService driverDetailsService;

	public ResponseEntity<DriverDetails> getDriverDetailsById(@PathVariable("id") Integer id) {
		DriverDetails driverDet = driverDetailsService.getDriverDetailsById(id);
		return ResponseEntity.ok().body(driverDet);

	}
}
