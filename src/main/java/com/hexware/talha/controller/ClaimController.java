package com.hexware.talha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexware.talha.model.Claim;
import com.hexware.talha.service.ClaimService;

@RestController
@RequestMapping(value = "/api/v1/")
public class ClaimController {
	
	@Autowired
	ClaimService claims;
	
	@PostMapping("create")
	public ResponseEntity<Claim> create(@Validated @RequestBody Claim c) {
		return new ResponseEntity<>(claims.create(c),HttpStatus.OK);
	}
	
	@GetMapping("claim")
	public ResponseEntity<List<Claim>> findAll() {
		
		return new ResponseEntity<>(claims.findAll(),HttpStatus.OK);
		
	}
	
	

}
