package com.insurance.updatetransection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.updatetransection.model.Transection;

@Repository
public interface TransectionRepository extends  CrudRepository<Transection, Integer> {
	
	public Transection findTransectionById(Integer id);

}
