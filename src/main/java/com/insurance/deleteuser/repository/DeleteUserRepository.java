package com.insurance.deleteuser.repository;

import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.deleteuser.model.DeleteUser;
@Repository

public interface DeleteUserRepository extends CrudRepository<DeleteUser, Serializable> {

	public DeleteUser deleteById(Integer Id);
}
