package com.insurance.updatetransection.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.updatetransection.model.Transection;
import com.insurance.updatetransection.repository.TransectionRepository;
import com.insurance.updatetransection.service.TransectionService;

@Service
public class TransectionServiceImpl implements TransectionService {

	@Autowired
	private TransectionRepository transectionRepository;
	
	@Override
	public Transection saveTransection(Transection transection) {
		return transectionRepository.save(transection);
	}

	@Override
	public Transection getTransection(Integer id) {
		return transectionRepository.findTransectionById(id);
	}
	
	// Create Object of Logger
			private static final Logger logger = LoggerFactory.getLogger(TransectionServiceImpl.class);

}
