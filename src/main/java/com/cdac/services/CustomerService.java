package com.cdac.services;

import java.util.List;

import com.cdac.entities.Customer;

public interface CustomerService {
	boolean registerCustomer(Customer cust);
	List<Customer> allCustomers();
	Customer findById(int id);
	Customer validate(String userid,String pwd);
	boolean verifyUserId(String userid);
	void updateProfile(Customer cust);
}
