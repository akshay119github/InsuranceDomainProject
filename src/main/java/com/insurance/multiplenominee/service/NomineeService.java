package com.insurance.multiplenominee.service;

import java.util.List;

import com.insurance.multiplenominee.model.Nominee;

public interface NomineeService {

	public Nominee saveNominee(Nominee nominee);
	
	public List<Nominee> getNomineeByEmployeeId(Integer employee_id);
	
	public void deleteById(Integer employee_id);

}
