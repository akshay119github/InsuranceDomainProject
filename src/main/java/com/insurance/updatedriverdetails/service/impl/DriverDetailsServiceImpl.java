package com.insurance.updatedriverdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.updatedriverdetails.model.DriverDetails;
import com.insurance.updatedriverdetails.repository.DriverDetailsRepository;
import com.insurance.updatedriverdetails.service.DriverDetailsService;

@Service
public class DriverDetailsServiceImpl implements DriverDetailsService {
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;

	@Override
	public DriverDetails getDriverDetailsById(Integer id) {
		return null;
	}

}
