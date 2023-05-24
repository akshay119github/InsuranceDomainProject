package com.insurance.delsettelment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.delsettelment.repository.SettelmentRepository;
import com.insurance.delsettelment.service.SettelmentService;

@Service
public class SettelmentServiceImpl implements SettelmentService{

	@Autowired
	private SettelmentRepository settelmentRepository;
	
	@Override
	public void deleteSettelmentById(Integer id) {
		// TODO Auto-generated method stub
		settelmentRepository.deleteById(id);
		
	}

}
