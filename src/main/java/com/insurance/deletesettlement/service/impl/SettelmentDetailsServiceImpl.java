package com.insurance.deletesettlement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.deletesettlement.repository.SettelmentDetailsRepository;
import com.insurance.deletesettlement.service.SettelmentDetailsService;

@Service
public class SettelmentDetailsServiceImpl implements SettelmentDetailsService {
	@Autowired
	private SettelmentDetailsRepository settelmentDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		settelmentDetailsRepository.deleteById(id);

	}

}
