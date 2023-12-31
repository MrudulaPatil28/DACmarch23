package com.cdac.services;

import java.util.List;

import com.cdac.entities.Consignee;


public interface ConsigneeService {
	boolean registerConsignee(Consignee cust);
	List<Consignee> allConsignee();
	Consignee findById(int id);
	Consignee validate(String userid,String pwd);
	boolean verifyUserId(String userid);
	void updateProfile(Consignee cust);
	
	List<Consignee> findByzipcode(int zipcode);
}
