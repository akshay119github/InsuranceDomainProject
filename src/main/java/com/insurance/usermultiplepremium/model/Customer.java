/*
 * @Author - Akshay Tarate
 */
package com.insurance.usermultiplepremium.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	// One Customer with multiple premium details
	@OneToMany(mappedBy = "customer_id")
	private List<PolicyPremium> policypremiumList;

	// Generate Getter Setter Method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PolicyPremium> getPolicypremiumList() {
		return policypremiumList;
	}

	public void setPolicypremiumList(List<PolicyPremium> policypremiumList) {
		this.policypremiumList = policypremiumList;
	}

}
