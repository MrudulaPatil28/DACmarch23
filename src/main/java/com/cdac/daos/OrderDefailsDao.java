package com.cdac.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Consignee;
import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Seller;

@Repository
public interface OrderDefailsDao extends JpaRepository<OrderDetails, Integer> {
	List<OrderDetails> findByOrder(Order order);
	
	 @Query("SELECT od FROM OrderDetails od WHERE od.seller = :seller")
	 List<OrderDetails> findBySeller(@Param("seller") Seller seller);
	 
	 @Query("SELECT od FROM OrderDetails od WHERE od.consinee = :consinee")
	 List<OrderDetails> findByConsignee(@Param("consinee") Consignee consinee);
	//List<OrderDetails> findByOrderByConsignee(Consignee consignee);//
	
}
