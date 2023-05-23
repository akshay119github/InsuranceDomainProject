package com.insurance.transection.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.transection.model.Transection;

@Repository
public interface TransectionRepository extends CrudRepository<Transection, Serializable> {

	@Query(value = "select*from transection where id=?1", nativeQuery = true)
	List<Transection> findById(Integer id);
}
