package com.project_k.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project_k.entity.Registration;
import com.project_k.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepo;
	
	
	
	public void saveRegistration(Registration registration) {
		registrationRepo.save(registration);
	}
}
