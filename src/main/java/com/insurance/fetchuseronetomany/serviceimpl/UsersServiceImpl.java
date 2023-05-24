package com.insurance.fetchuseronetomany.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.fetchuseronetomany.model.User;
import com.insurance.fetchuseronetomany.repository.UserRepository;
import com.insurance.fetchuseronetomany.service.UserService;

@Service
public class UsersServiceImpl implements UserService {

	// injecting repository here
	@Autowired
	public UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1=userRepository.save(user);
		return user1;
	}

	
	
	}

	

	

