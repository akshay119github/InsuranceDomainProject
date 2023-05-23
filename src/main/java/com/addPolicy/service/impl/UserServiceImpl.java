package com.addPolicy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addPolicy.model.User;
import com.addPolicy.repository.UserRepository;
import com.addPolicy.service.UserService;

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

}
