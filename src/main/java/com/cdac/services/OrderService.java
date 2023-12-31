package com.cdac.services;

import java.sql.Date;
import java.util.List;

import com.cdac.entities.Customer;
import com.cdac.entities.Order;

public interface OrderService {

	Order saveOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getCustomerOrders(Customer customer);
	Order findById(int id);
	Order findByStatus(String dstatus);//
	boolean updatestatus(int id, String status);
	Order findByDate(Date date);//
	void updateOrder(Order order);
}
