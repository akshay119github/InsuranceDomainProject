package com.insurance.addbankdetails.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.addbankdetails.model.BankDetails;
import com.insurance.addbankdetails.repository.BankDetailsRepository;
import com.insurance.addbankdetails.service.BankDetailsService;
@Service
public class BankDetailsServiceImpl implements BankDetailsService{
    //injecting the object 
	@Autowired
	private BankDetailsRepository userRepository;//Injecting object into UserService 

	@Override
	public BankDetails saveDetails(BankDetails bankDetails) {
		return userRepository.save(bankDetails);
	}
	

}
