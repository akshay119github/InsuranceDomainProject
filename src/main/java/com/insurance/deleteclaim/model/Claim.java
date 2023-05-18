package com.insurance.deleteclaim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim")
public class Claim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String claim_id;
	private String policy_id;
	private String claim_status;
	private String claim_amount;

	// Generate Getter Setter Method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getClaim_status() {
		return claim_status;
	}

	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}

	public String getClaim_amount() {
		return claim_amount;
	}

	public void setClaim_amount(String claim_amount) {
		this.claim_amount = claim_amount;
	}

}
