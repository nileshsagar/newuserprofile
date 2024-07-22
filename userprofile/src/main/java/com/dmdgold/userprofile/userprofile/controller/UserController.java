package com.dmdgold.userprofile.userprofile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dmdgold.userprofile.userprofile.entity.UserProfile;
import com.dmdgold.userprofile.userprofile.service.ServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	ServiceImp imp;

	@PostMapping
	public ResponseEntity<UserProfile> saveUserProfile(@RequestBody UserProfile profile) {

		UserProfile profile2 = imp.save(profile);
		return ResponseEntity.status(HttpStatus.CREATED).body(profile2);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<UserProfile>> findById(@PathVariable int id) {
		Optional<UserProfile> optional = imp.findById(id);
		return ResponseEntity.ok(optional);

	}

	@PatchMapping
	public UserProfile update(@RequestBody UserProfile profile, @RequestParam int id) {

		UserProfile profile2 = imp.update(profile, id);
		return ResponseEntity.ok(profile2).getBody();

	}

	@GetMapping
	public List<UserProfile> getList() {

		List<UserProfile> list = imp.findAll();

		return ResponseEntity.ok(list).getBody();
	}
	
	@DeleteMapping
	public UserProfile delete(@RequestParam int id) {
		
	  UserProfile profile	=imp.deleteById(id);
		return ResponseEntity.ok(profile).getBody();
	}

}
