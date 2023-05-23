package com.insurance.multiplenominee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.multiplenominee.model.Nominee;
import com.insurance.multiplenominee.model.Employee;
import com.insurance.multiplenominee.repository.NomineeRepository;
import com.insurance.multiplenominee.service.NomineeService;
import com.insurance.multiplenominee.service.EmployeeService;

@RestController
public class EmployeeNomineeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private NomineeService nomineeService;

	@Autowired
	private NomineeRepository nomineeRepository;

	// Design Rest API to save operation
	@PostMapping("/saveEmployeeNominee")
	public Employee saveEmployeeNominee(@RequestBody Employee employee) {
		Employee employee1 = employeeService.saveEmployee(employee);

		List<Nominee> list = employee.getNomineeList();

		for (Nominee nominee : list) {
			nominee.setEmployee_id(employee.getId());
			nomineeService.saveNominee(nominee);
		}
		return employee1;
	}

	// Design API to fetch multiple nominee
	@GetMapping("/getNominee/{employee_id}")
	public List<Nominee> getNomineeByEmployeeId(@PathVariable Integer employee_id) {
		List<Nominee> nominee = nomineeService.getNomineeByEmployeeId(employee_id);
		return nominee;
	}

	// Design API to update nominees
	@PutMapping("/updateNominee/{employee_id}")
	public List<Nominee> getNomineeByEmployeeId(@PathVariable Integer employee_id, @RequestBody Nominee nominee) {
		List<Nominee> nominee1 = nomineeService.getNomineeByEmployeeId(employee_id);

		for (Nominee nom : nominee1) {
			nom.setName(nominee.getName());
			nom.setEmail(nominee.getEmail());
			nomineeRepository.save(nom);

		}
		return nominee1;
	}
	
	// Design API to delete Nominee
		@DeleteMapping("/deleteNominee/{employee_id}")
		public void deleteById(@PathVariable Integer employee_id) {
			nomineeService.deleteById(employee_id);
		}
		
		// Create Object of Logger
		private static final Logger logger = LoggerFactory.getLogger(EmployeeNomineeController.class);
}
