package com.hexware.talha.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexware.talha.model.Claim;
import com.hexware.talha.repository.ClaimRepository;

@Service
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	private ClaimRepository claimrepo;

	private String rootAPI = "/api/v1/";
	
	@Override
	public Claim create(Claim claim) {
		
		Claim newClaim = claimrepo.save(claim);
		newClaim.setUrl(rootAPI+"claim/"+newClaim.getId());
		return claimrepo.save(claim);
	}

	@Override
	public List<Claim> findAll() {
		return claimrepo.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public List<Claim> filterClaim(String keywords) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Claim> sortingClaim() {
		// TODO Auto-generated method stub
		return null;
	}

}
