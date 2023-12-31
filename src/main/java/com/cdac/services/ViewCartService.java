package com.cdac.services;

import java.util.List;

import com.cdac.entities.Customer;
import com.cdac.entities.Viewcart;

public interface ViewCartService {
	boolean saveviewcart(Viewcart viewcart);
	List<Viewcart> findbyCustomer(int cid);
	boolean deletecartitem(int id);

}
