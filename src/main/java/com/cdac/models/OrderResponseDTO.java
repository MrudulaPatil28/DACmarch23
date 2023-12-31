package com.cdac.models;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Product;

public class OrderResponseDTO {

	private Order order;
	private List<OrderDetailsDTO> details;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderDetailsDTO> getDetails() {
		return details;
	}
	public void setDetails(List<OrderDetailsDTO> details) {
		this.details = details;
	}
	
	
}
