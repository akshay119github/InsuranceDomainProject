package com.insurance.changepassword.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.changepassword.model.UserPassword;
import com.insurance.changepassword.repository.UserPasswordRepository;
import com.insurance.changepassword.service.UserPasswordService;

@Service
public class UserPasswordServiceImpl implements UserPasswordService {

	// Inject Repository
	@Autowired
	private UserPasswordRepository userPasswordRepository;

	@Override
	public UserPassword getUserPasswordById(Integer id) {
		UserPassword uPassword1 = userPasswordRepository.getPasswordById(id);
		return uPassword1;
	}

	@Override
	public UserPassword saveUserPassword(UserPassword userPassword) {
		UserPassword uPassword2 = userPasswordRepository.save(userPassword);
		return uPassword2;
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(UserPasswordServiceImpl.class);

}
