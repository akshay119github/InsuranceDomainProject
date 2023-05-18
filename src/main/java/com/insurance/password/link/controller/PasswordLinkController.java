package com.insurance.password.link.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.password.link.model.PasswordLink;
import com.insurance.password.link.service.PasswordLinkService;


@RestController
public class PasswordLinkController {

	// Inject Service here
	@Autowired
	private PasswordLinkService passwordLinkService;

	// Design API
	@PostMapping("/savePasswordLink")
	public PasswordLink savePasswordLink(@RequestBody PasswordLink passwordLink) {
		PasswordLink passwordLink2 = passwordLinkService.saveLink(passwordLink);
		return passwordLink2;
	}

}
