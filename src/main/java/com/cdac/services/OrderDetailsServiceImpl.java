package com.cdac.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.daos.OrderDefailsDao;
import com.cdac.entities.Consignee;
import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Seller;

@Service
public class OrderDetailsServiceImpl implements OrderdetailService {

	@Autowired OrderDefailsDao dao;
	@Override
	public void saveOrderDetails(OrderDetails od) {
		// TODO Auto-generated method stub
		dao.save(od);
	}

	@Override
	public OrderDetails findById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public List<OrderDetails> findByOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.findByOrder(order);
	}

	@Override
	public List<OrderDetails> findallorders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> findByOrderBySeller(Seller seller) {
		// TODO Auto-generated method stub
		
		return dao.findBySeller(seller);
		//return null;
	}


	@Override
	public List<OrderDetails> findByOrderByConsignee(Consignee consignee) {
		// TODO Auto-generated method stub
		 List<OrderDetails> list=dao.findByConsignee(consignee);
		 for(OrderDetails og :list) {
			 System.out.println(og);
		 }
		return list;
	}


	@Override
	public boolean updateorderdetails(OrderDetails od,Consignee co) {
		// TODO Auto-generated method stub
		
		if(od != null) {
			OrderDetails neworder = dao.getById(od.getId());
			neworder.setConsinee(co);
			
			dao.save(neworder);
			System.out.println(neworder);
			return true;
		}
		return false;
	}
}
