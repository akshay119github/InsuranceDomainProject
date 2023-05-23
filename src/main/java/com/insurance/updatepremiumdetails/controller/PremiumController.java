package com.insurance.updatepremiumdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.updatepremiumdetails.model.PremiumDetails;
import com.insurance.updatepremiumdetails.repository.PremiumRepository;
import com.insurance.updatepremiumdetails.service.PremiumService;

@RestController
public class PremiumController {
	@Autowired
	private PremiumService premiumService;
	@Autowired
	private PremiumRepository premiumRepository;

	public ResponseEntity<PremiumDetails> getPremiumDetailsById(@PathVariable Integer id,
			@RequestBody PremiumDetails premiumDetails) {

		PremiumDetails pre = premiumService.getPremiumDetailsByIdF(id);
		pre.setPolicyId(premiumDetails.getPolicyId());
		pre.setPremiumId(premiumDetails.getPremiumId());
		pre.setPolicyHolderName(premiumDetails.getPolicyHolderName());
		pre.setInstallmentPremiumAmount(premiumDetails.getInstallmentPremiumAmount());
		pre.setPolicyCommencementDate(premiumDetails.getPolicyCommencementDate());

		PremiumDetails pre1 = premiumRepository.save(pre);
		return ResponseEntity.ok().body(pre1);
	}
}
