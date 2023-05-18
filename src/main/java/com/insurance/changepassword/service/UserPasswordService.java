package com.insurance.changepassword.service;

import com.insurance.changepassword.model.UserPassword;

public interface UserPasswordService {

	public UserPassword getUserPasswordById(Integer id);
	
	public UserPassword saveUserPassword(UserPassword userPassword);

}
