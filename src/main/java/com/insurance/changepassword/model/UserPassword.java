package com.insurance.changepassword.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userpassword")
public class UserPassword {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String password;
	private String updatedPassword;

	// Generate Getter Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUpdatedPassword() {
		return updatedPassword;
	}

	public void setUpdatedPassword(String updatedPassword) {
		this.updatedPassword = updatedPassword;
	}

}
