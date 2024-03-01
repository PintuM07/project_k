package com.project_k.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project_k.entity.Registration;


public interface RegistrationRepository extends JpaRepository<Registration, Long> {
	

}
