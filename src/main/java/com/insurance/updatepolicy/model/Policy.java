package com.insurance.updatepolicy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
//this is pojo class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_id;
	private String policy_number;
	private String policy_effective_date;
	private String policy_expiry_date;
	private String payment_option;
	private Double total_amount;
	private String status;
	private String created_date;
	private String additional_info;
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getPolicy_number() {
		return policy_number;
	}
	public void setPolicy_number(String policy_number) {
		this.policy_number = policy_number;
	}
	public String getPolicy_effective_date() {
		return policy_effective_date;
	}
	public void setPolicy_effective_date(String policy_effective_date) {
		this.policy_effective_date = policy_effective_date;
	}
	public String getPolicy_expiry_date() {
		return policy_expiry_date;
	}
	public void setPolicy_expiry_date(String policy_expiry_date) {
		this.policy_expiry_date = policy_expiry_date;
	}
	public String getPayment_option() {
		return payment_option;
	}
	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}
	public Double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(Double total_amount) {
		this.total_amount = total_amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
	}
	
	
	
}
