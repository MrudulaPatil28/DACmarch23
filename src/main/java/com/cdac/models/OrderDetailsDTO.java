package com.cdac.models;

import org.springframework.beans.BeanUtils;

import com.cdac.entities.Consignee;
import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Product;
import com.cdac.entities.Seller;

public class OrderDetailsDTO {
	
	private int id;
	private Product product;
	private int qty;
	private Order order;
	private Seller seller;
	private Consignee consinee; 
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	
	public Consignee getConsinee() {
		return consinee;
	}
	public void setConsinee(Consignee consinee) {
		this.consinee = consinee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public static OrderDetailsDTO fromEntity(OrderDetails entity) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		BeanUtils.copyProperties(entity, dto);		
		return dto;
	}
}
