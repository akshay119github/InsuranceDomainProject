package com.insurance.transection.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.transection.model.Transection;
import com.insurance.transection.repository.TransectionRepository;
import com.insurance.transection.service.TransectionService;

@Service
public class TransectionServiceImpl implements TransectionService{

	//injecting repository here 
	@Autowired
	private TransectionRepository transectionRepository;
	
	@Override
	public List<Transection> getListById(Integer id) {
		List<Transection> list=transectionRepository.findById(id);
		return list;
	}

	
}
