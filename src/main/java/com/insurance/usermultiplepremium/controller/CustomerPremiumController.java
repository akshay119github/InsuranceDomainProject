package com.insurance.usermultiplepremium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.usermultiplepremium.model.Customer;
import com.insurance.usermultiplepremium.model.PolicyPremium;
import com.insurance.usermultiplepremium.service.CustomerService;
import com.insurance.usermultiplepremium.service.PolicyPremiumService;

@RestController
public class CustomerPremiumController {

	// Inject Service
	@Autowired
	private CustomerService customerService;

	@Autowired
	private PolicyPremiumService policyPremiumService;

	// Design API to save customer with multiple premium
	@PostMapping("/saveCustomerPolicy")
	public Customer saveCustomer(@RequestBody Customer customer) {
		Customer customer1 = customerService.saveCustomer(customer);

		List<PolicyPremium> policyPremium = customer.getPolicypremiumList();

		for (PolicyPremium polPremium : policyPremium) {
			polPremium.setCustomer_id(customer.getId());
			policyPremiumService.savePolicyPremium(polPremium);
		}
		return customer1;
	}

	// Design API to get customer with multiple premium
	@GetMapping("/getUserWithMultiplePremium/{customer_id}")
	public List<PolicyPremium> getPolicyPremiumByCustomerId(@PathVariable Integer customer_id) {
		List<PolicyPremium> list = policyPremiumService.getPolicyPremiumByCustomerId(customer_id);
		return list;
	}

}
