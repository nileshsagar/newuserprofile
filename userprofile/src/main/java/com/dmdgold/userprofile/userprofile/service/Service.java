package com.dmdgold.userprofile.userprofile.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmdgold.userprofile.userprofile.entity.UserProfile;

@Repository
public interface Service extends JpaRepository<UserProfile, Integer> {

	
	
}
