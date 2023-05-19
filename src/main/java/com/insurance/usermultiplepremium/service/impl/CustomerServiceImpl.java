package com.insurance.usermultiplepremium.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.usermultiplepremium.model.Customer;
import com.insurance.usermultiplepremium.repository.CustomerRepository;
import com.insurance.usermultiplepremium.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	// Inject Repository
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		Customer customer1 = customerRepository.save(customer);
		return customer1;
	}

}
