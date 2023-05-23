package com.insurance.multiplenominee.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.multiplenominee.model.Employee;
import com.insurance.multiplenominee.repository.EmployeeRepository;
import com.insurance.multiplenominee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		Employee employee1 = employeeRepository.save(employee);
		return employee1;
	}

	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
}
