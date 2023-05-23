package com.insurance.userpremium.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.insurance.userpremium.model.User;
import com.insurance.userpremium.repository.UsersRepository;
import com.insurance.userpremium.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	// injecting repository here
	@Autowired
	private UsersRepository userRepository;

	

	@Override
	public com.insurance.userpremium.model.User saveUser(com.insurance.userpremium.model.User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}
