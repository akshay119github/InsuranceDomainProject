package com.insurance.fetch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
public class Fetch {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String BankName;
	private String BankAccountNumber;
	private String RoutingNumber;
	private String ChequeNumber;
	private String AdditionalInformation;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankAccountNumber() {
		return BankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		BankAccountNumber = bankAccountNumber;
	}
	public String getRoutingNumber() {
		return RoutingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		RoutingNumber = routingNumber;
	}
	public String getChequeNumber() {
		return ChequeNumber;
	}
	public void setChequeNumber(String chequeNumber) {
		ChequeNumber = chequeNumber;
	}
	public String getAdditionalInformation() {
		return AdditionalInformation;
	}
	public void setAdditionalInformation(String additionalInformation) {
		AdditionalInformation = additionalInformation;
	}
	
	
}
