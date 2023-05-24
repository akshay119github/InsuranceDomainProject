/*
 * @Author - Akshay Tarate
 */
package com.insurance.updatetransection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transection")
public class Transection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String transection_id;
	private String amount;
	private String policy_id;
	private String transection_status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransection_id() {
		return transection_id;
	}

	public void setTransection_id(String transection_id) {
		this.transection_id = transection_id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getTransection_status() {
		return transection_status;
	}

	public void setTransection_status(String transection_status) {
		this.transection_status = transection_status;
	}

}
