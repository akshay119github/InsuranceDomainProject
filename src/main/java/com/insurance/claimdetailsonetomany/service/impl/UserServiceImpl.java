package com.insurance.claimdetailsonetomany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.claimdetailsonetomany.model.User;
import com.insurance.claimdetailsonetomany.repository.UserRepository;
import com.insurance.claimdetailsonetomany.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User users = userRepository.save(user);
		return users;
	}

}
