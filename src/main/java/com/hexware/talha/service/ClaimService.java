package com.hexware.talha.service;

import java.util.List;

import com.hexware.talha.model.Claim;



public interface ClaimService {
	
	Claim create(Claim claim);
	
	 List<Claim> findAll();
	 
	 List<Claim> filterClaim(String keywords);
	 List<Claim> sortingClaim();

}
