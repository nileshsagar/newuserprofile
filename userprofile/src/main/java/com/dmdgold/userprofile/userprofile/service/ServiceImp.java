package com.dmdgold.userprofile.userprofile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dmdgold.userprofile.userprofile.entity.UserProfile;

@org.springframework.stereotype.Service
public class ServiceImp {

	
	
	@Autowired
	Service service;

	
	public UserProfile save(UserProfile profile) {
		if (profile != null) {
			return service.save(profile);
		}
		return null;
	}
	
	

	public Optional<UserProfile> findById(Integer id) {
		if (service.existsById(id)) {
			return service.findById(id);
		}
		return null;
	}
	
	

	public UserProfile deleteById(int id) {

		if (service.existsById(id)) {

		    service.deleteById(id);

		}
		return null;
		

	}
	
	

	public UserProfile update(UserProfile profile, int id) {

		if (service.existsById(id)) {
			profile.setUserId(id);
			return service.save(profile);

		}
		return null;

	}
	
	

	public List<UserProfile> findAll() {

		return service.findAll();
	}

}
