package com.insurance.deleteuser.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.deleteuser.repository.DeleteUserRepository;


public class DeleteUserServiceImpl implements com.insurance.deleteuser.service.DeleteUserService {
	@Autowired // injecting repository
	private DeleteUserRepository deleteUserRepository;

	@Override
	public void deleteUser(Integer id) {
		deleteUserRepository.deleteById(id);

	}

}
