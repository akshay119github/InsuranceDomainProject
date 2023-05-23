package com.insurance.multiplenominee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.multiplenominee.model.Nominee;

@Repository
public interface NomineeRepository extends CrudRepository<Nominee, Integer> {

	@Query(value = "select * from nominee where employee_id=?1", nativeQuery = true)
	public List<Nominee> getByEmployeeId(Integer employee_id);
}
