package com.insurance.userpremium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.userpremium.model.Premium;
import com.insurance.userpremium.model.User;
import com.insurance.userpremium.service.PremiumService;
import com.insurance.userpremium.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserPremiumController {

	// injecting service here
	@Autowired
	private UserService userService;
	@Autowired
	private PremiumService premiumService;

	@PostMapping("/save")
	ResponseEntity<User> saveUserPremium(@RequestBody User user) {
		User use= userService.saveUser(user);
		List<Premium> premium = user.getPremiumList();
		for (Premium prem1 : premium) {
			prem1.setUserId(user.getId());
			premiumService.savePremium(prem1);
		}
		return ResponseEntity.ok().body(use);
	}

}
