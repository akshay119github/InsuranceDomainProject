package com.insurance.getduration.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.getduration.model.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, Serializable> {

	@Query(value = "select * from policyduration where duration=?1", nativeQuery = true)
	public List<Policy> findByDuration(Integer duration);

}
