package com.cdac.services;

import java.util.List;

import com.cdac.entities.Seller;

public interface SellerService {
	boolean registerSeller(Seller seller);
	List<Seller> allSellers();
	Seller findById(int id);
	Seller validate(String userid,String pwd);
	void deleteSeller(int id);
	
}
