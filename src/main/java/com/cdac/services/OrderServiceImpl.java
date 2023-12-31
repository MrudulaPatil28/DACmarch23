package com.cdac.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.OrderDao;
import com.cdac.entities.Customer;
import com.cdac.entities.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired OrderDao dao;
	
	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Order> getCustomerOrders(Customer customer) {
		// TODO Auto-generated method stub
		return dao.findByCustomer(customer);
	}

	@Override
	public Order findById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public Order findByStatus(String dstatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		if(order !=null) {
			dao.save(order);
		}
		
	}

	@Override
	public boolean updatestatus(int id, String status) {
		Order od = dao.getById(id);
		System.out.println(od);
		if(od != null) {
		od.setDstatus(status);
		dao.save(od);
		return true;
		}
		return false;
	}

	
}
