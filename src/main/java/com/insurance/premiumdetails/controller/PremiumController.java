package com.insurance.premiumdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.premiumdetails.model.PremiumDetails;
import com.insurance.premiumdetails.repository.PremiumRepository;
import com.insurance.premiumdetails.service.PremiumService;

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
		pre.setPolicyNumber(premiumDetails.getPolicyNumber());
		pre.setPolicyEffectiveDate(premiumDetails.getPolicyEffectiveDate());
		pre.setPolicyExpiryDate(premiumDetails.getPolicyExpiryDate());
		pre.setPayment_Option(premiumDetails.getPayment_Option());
		pre.setTotalAmount(premiumDetails.getTotalAmount());
		pre.setStatus(premiumDetails.getStatus());
		pre.setCreatedDate(premiumDetails.getCreatedDate());
		pre.setAdditionalInfo(premiumDetails.getAdditionalInfo());
		PremiumDetails pre1 = premiumRepository.save(pre);
		return ResponseEntity.ok().body(pre1);
	}
}
