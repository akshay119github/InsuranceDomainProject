package com.insurance.updatetransection.service;

import com.insurance.updatetransection.model.Transection;

public interface TransectionService {

	public Transection saveTransection(Transection transection);

	public Transection getTransection(Integer id);

}
