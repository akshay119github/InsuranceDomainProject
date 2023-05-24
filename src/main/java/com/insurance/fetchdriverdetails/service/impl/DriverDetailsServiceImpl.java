package com.insurance.fetchdriverdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.fetchdriverdetails.model.DriverDetails;
import com.insurance.fetchdriverdetails.repository.DriverDetailsRepository;
import com.insurance.fetchdriverdetails.service.DriverDetailsService;

@Service
public class DriverDetailsServiceImpl implements DriverDetailsService {
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;

	@Override
	public DriverDetails getDriverDetailsById(Integer id) {
		return null;
	}

}
