package com.project_k.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project_k.entity.Registration;
import com.project_k.service.RegistrationService;

@Controller
public class SiteController {
	
	@Autowired
	private RegistrationService registrationService;
	
	//http://localhost:8080/view
	
	@RequestMapping("/view")
	public String viewRegistrationPage() {
		return "create_lead";
	}

	
	//http://localhost:8080/save
	@RequestMapping("/saveReg")
	public String saveRegistration(Registration registration) {
		
		registrationService.saveRegistration(registration);
		
		return "create_lead";
	}
}
