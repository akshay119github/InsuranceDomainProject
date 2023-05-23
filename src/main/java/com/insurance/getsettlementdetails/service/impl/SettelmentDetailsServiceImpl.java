package com.insurance.getsettlementdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.getsettlementdetails.model.SettelmentDetails;
import com.insurance.getsettlementdetails.repository.SettelmentDetailsRepository;
import com.insurance.getsettlementdetails.service.SettelmentDetailsService;

@Service
public class SettelmentDetailsServiceImpl implements SettelmentDetailsService {
	@Autowired
	private SettelmentDetailsRepository settelmentDetailsRepository;

	@Override
	public SettelmentDetails getSettelmentDetailsById(Integer id) {
		SettelmentDetails settle = settelmentDetailsRepository.findById(id);
		return settle;
	}

}
