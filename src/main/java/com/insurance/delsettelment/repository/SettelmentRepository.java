package com.insurance.delsettelment.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.delsettelment.model.Settelment;

@Repository
public interface SettelmentRepository extends CrudRepository<Settelment, Serializable>{

}
