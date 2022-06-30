package com.hexware.talha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexware.talha.model.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Long> {

}
