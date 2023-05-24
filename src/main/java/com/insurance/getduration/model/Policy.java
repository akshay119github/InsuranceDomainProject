/*
 * @Author - Akshay Tarate
 */
package com.insurance.getduration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policyduration")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String premium_id;
	String policy_id;
	String policy_holder_name;
	String installment_premium_amount;
	Date policy_commencement_date;
	String policy_name;
	String plan_name;
	String user_name;
	String premium_amount;
	int duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremium_id() {
		return premium_id;
	}

	public void setPremium_id(String premium_id) {
		this.premium_id = premium_id;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
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

	public Date getPolicy_commencement_date() {
		return policy_commencement_date;
	}

	public void setPolicy_commencement_date(Date policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPremium_amount() {
		return premium_amount;
	}

	public void setPremium_amount(String premium_amount) {
		this.premium_amount = premium_amount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
