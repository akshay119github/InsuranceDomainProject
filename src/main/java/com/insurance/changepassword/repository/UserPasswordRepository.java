package com.insurance.changepassword.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.changepassword.model.UserPassword;

@Repository
public interface UserPasswordRepository extends CrudRepository<UserPassword, Integer> {

	public UserPassword getPasswordById(Integer id);

}
