package com.insurance.updateuser.service.impl;

import org.springframework.stereotype.Service;

import com.insurance.updateuser.model.User;
import com.insurance.updateuser.repository.UserRepository;
import com.insurance.updateuser.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = userRepository.getUserById(id);
		return user;
	}

}
