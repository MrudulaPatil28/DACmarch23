package com.cdac.models;

import java.util.List;

import com.cdac.entities.Address;
import com.cdac.entities.Payment;
import com.cdac.entities.Viewcart;

public class PlaceOrderDTO {

	private Address address;
	private List<Viewcart> cart;
	private Payment payment;
	private int customerid;
	private String dstatus;
	
	public String getDstatus() {
		return dstatus;
	}
	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public List<Viewcart> getCart() {
		return cart;
	}
	public void setCart(List<Viewcart> cart) {
		this.cart = cart;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
}
