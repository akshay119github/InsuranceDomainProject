package com.insurance.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
