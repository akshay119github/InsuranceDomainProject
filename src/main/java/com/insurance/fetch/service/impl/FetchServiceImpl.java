package com.insurance.fetch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.fetch.model.Fetch;
import com.insurance.fetch.repository.FetchRepository;
import com.insurance.fetch.service.FetchService;

@Service
public class FetchServiceImpl implements FetchService{

	@Autowired
	private FetchRepository fetchRepository;
	
	@Override
	public Fetch getFetchById(Integer id) {
		// TODO Auto-generated method stub
		Fetch fetch = fetchRepository.findFetchById(id);
		return fetch;
	}

}
