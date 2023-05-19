package com.insurance.premium.service;

import java.util.List;

import com.insurance.premium.model.Premium;

public interface PremiumService {
	
	public Premium savePremium(Premium premium);
	
	public Premium getPremiumById(Integer id);

}
