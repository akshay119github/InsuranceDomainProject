package com.insurance.updatepremiumdetails.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premiumDetails")
public class PremiumDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int PremiumId;
	private int PolicyId;
	private String PolicyHolderName;
	private Double InstallmentPremiumAmount;
	private Date PolicyCommencementDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPremiumId() {
		return PremiumId;
	}

	public void setPremiumId(int premiumId) {
		PremiumId = premiumId;
	}

	public int getPolicyId() {
		return PolicyId;
	}

	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}

	public String getPolicyHolderName() {
		return PolicyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		PolicyHolderName = policyHolderName;
	}

	public Double getInstallmentPremiumAmount() {
		return InstallmentPremiumAmount;
	}

	public void setInstallmentPremiumAmount(Double installmentPremiumAmount) {
		InstallmentPremiumAmount = installmentPremiumAmount;
	}

	public Date getPolicyCommencementDate() {
		return PolicyCommencementDate;
	}

	public void setPolicyCommencementDate(Date policyCommencementDate) {
		PolicyCommencementDate = policyCommencementDate;
	}

}
