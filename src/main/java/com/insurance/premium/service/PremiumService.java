package com.insurance.premium.service;

import com.insurance.premium.model.Premium;

public interface PremiumService {
	
	public Premium savePremium(Premium premium);
	
	public Premium getPremiumById(Integer id);

}
