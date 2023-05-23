package com.insurance.multiplenominee.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.multiplenominee.model.Nominee;
import com.insurance.multiplenominee.repository.NomineeRepository;
import com.insurance.multiplenominee.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	@Autowired
	private NomineeRepository nomineeRepository;

	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominee1 = nomineeRepository.save(nominee);
		return nominee1;
	} 

	@Override
	public List<Nominee> getNomineeByEmployeeId(Integer employee_id) {
		List<Nominee> nominee = nomineeRepository.getByEmployeeId(employee_id);
		return nominee;
	}

	@Override
	public void deleteById(Integer employee_id) {
		nomineeRepository.deleteById(employee_id);
		
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(NomineeServiceImpl.class);

}
