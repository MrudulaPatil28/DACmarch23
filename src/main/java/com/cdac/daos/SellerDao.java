package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Seller;

@Repository
public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Seller findByUserid(String userid);

}