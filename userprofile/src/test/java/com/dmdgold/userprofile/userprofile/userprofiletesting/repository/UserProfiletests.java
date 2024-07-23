package com.dmdgold.userprofile.userprofiletesting.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.dmdgold.userprofile.userprofile.service.Service;

@DataJpaTest
public class UserProfiletests {

	@Autowired
	Service service;
	
	public UserProfiletests(Service service) {
		
		this.service=service;	
		
	}
	
	
	
	
	
	
}
