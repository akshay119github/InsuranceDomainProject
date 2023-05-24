package com.insurance.fetch.repository;

import org.springframework.data.repository.CrudRepository;

import com.insurance.fetch.model.Fetch;

public interface FetchRepository extends CrudRepository<Fetch, Integer>{
	public Fetch findFetchById(Integer id);

}
