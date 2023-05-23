package com.insurance.user.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.user.model.User;
import com.insurance.user.repository.UserRepository;
import com.insurance.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// Inject Repository here
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUserDetails(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}
	
	// Create Object of Logger
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

}
