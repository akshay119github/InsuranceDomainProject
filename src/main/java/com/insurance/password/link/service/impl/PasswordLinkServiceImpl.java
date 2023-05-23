package com.insurance.password.link.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.password.link.model.PasswordLink;
import com.insurance.password.link.repository.PasswordLinkRepository;
import com.insurance.password.link.service.PasswordLinkService;

@Service
public class PasswordLinkServiceImpl implements PasswordLinkService {

	// Inject Repository
	@Autowired
	private PasswordLinkRepository passwordLinkRepository;

	@Override
	public PasswordLink saveLink(PasswordLink passwordLink) {
		PasswordLink passwordLink1 = passwordLinkRepository.save(passwordLink);
		return passwordLink1;
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(PasswordLinkServiceImpl.class);

}
