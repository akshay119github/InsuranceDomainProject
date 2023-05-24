package com.insurance.userpremium.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "premium")
public class Premium {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String premiumId;
	private String policyId;
	private String policy_holder_name;
	private String installment_premium_amount;
	private String policy_commencement_date;
	private int userId;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicy_holder_name() {
		return policy_holder_name;
	}
	public void setPolicy_holder_name(String policy_holder_name) {
		this.policy_holder_name = policy_holder_name;
	}
	public String getInstallment_premium_amount() {
		return installment_premium_amount;
	}
	public void setInstallment_premium_amount(String installment_premium_amount) {
		this.installment_premium_amount = installment_premium_amount;
	}
	public String getPolicy_commencement_date() {
		return policy_commencement_date;
	}
	public void setPolicy_commencement_date(String policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
