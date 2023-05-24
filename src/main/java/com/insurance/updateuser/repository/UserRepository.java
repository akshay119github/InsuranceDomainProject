package com.insurance.updateuser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updateuser.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	public User getUserById(Integer id);

}
