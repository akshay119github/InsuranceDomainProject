package com.insurance.transection.service;

import java.util.List;

import com.insurance.transection.model.Transection;

public interface TransectionService {

	public List<Transection> getListById(Integer id);
}
