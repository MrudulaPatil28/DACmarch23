package com.cdac.services;

import java.util.List;

import com.cdac.entities.Consignee;
import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Seller;

public interface OrderdetailService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Order order);
	List<OrderDetails> findallorders();//
	List<OrderDetails> findByOrderBySeller(Seller sellerid);//
	List<OrderDetails> findByOrderByConsignee(Consignee consignee);//
	boolean updateorderdetails(OrderDetails od,Consignee co);
}
