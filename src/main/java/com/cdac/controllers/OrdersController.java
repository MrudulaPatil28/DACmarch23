package com.cdac.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entities.Address;
import com.cdac.entities.Customer;
import com.cdac.entities.Order;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Payment;
import com.cdac.entities.Product;
import com.cdac.entities.Viewcart;
import com.cdac.models.CartDTO;
import com.cdac.models.OrderDetailsDTO;
import com.cdac.models.OrderResponseDTO;
import com.cdac.models.PlaceOrderDTO;
import com.cdac.models.Response;
import com.cdac.services.AddressService;
import com.cdac.services.CustomerService;
import com.cdac.services.OrderService;
import com.cdac.services.OrderdetailService;
import com.cdac.services.PaymentService;
import com.cdac.services.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/api/orders")
public class OrdersController {

	@Autowired OrderService orderService;
	@Autowired CustomerService customerService;
	@Autowired AddressService addressService;
	@Autowired PaymentService paymentService;
	@Autowired OrderdetailService orderDetailsService;
	@Autowired ProductService productService;	
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody PlaceOrderDTO dto) {	
		Address address=addressService.saveAddress(dto.getAddress());
		dto.getPayment().setPaymentdate(new Date());
		Payment payment=paymentService.savePayment(dto.getPayment());
		Order order=new Order();
		order.setOrderDate(new Date());
		order.setAddress(address);
		order.setPayment(payment);
		order.setDstatus(dto.getDstatus());
		Customer customer=customerService.findById(dto.getCustomerid());
		order.setCustomer(customer);
		Order orders=orderService.saveOrder(order);
		
		for(Viewcart cart : dto.getCart()) {
			OrderDetails od=new OrderDetails();
			od.setOrder(orders);
			od.setQty(cart.getQty());
			Product product=productService.findProductById(cart.getProduct().getProdid());
			od.setProduct(product);
			od.setSeller(product.getSeller());
			orderDetailsService.saveOrderDetails(od);
		}
		
		System.out.println(dto.getAddress());
		System.out.println(dto.getCustomerid());
		System.out.println(dto.getPayment());
		System.out.println(dto.getCart().get(0));
		return Response.status(HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> findAllOrders(Optional<Integer> custid) {
		List<Order> result=null;
		if(custid.isPresent()) {
			Customer customer=customerService.findById(custid.get());
			 result= orderService.getCustomerOrders(customer);
		}else {
			result = orderService.getAllOrders();
		}
		return Response.success(result);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findOrderById(@PathVariable("id") int id) {
		Order order = orderService.findById(id);
		List<OrderDetails> details=orderDetailsService.findByOrder(order);
		List<OrderDetailsDTO> detailsdto=new ArrayList<OrderDetailsDTO>();
		details.forEach(od -> {
			OrderDetailsDTO dto=OrderDetailsDTO.fromEntity(od);
			detailsdto.add(dto);
		});
		OrderResponseDTO result=new OrderResponseDTO();
		result.setOrder(order);
		result.setDetails(detailsdto);
		return Response.success(result);
	}
	@PostMapping("/{id}/{status}")
	public ResponseEntity<?> updateOrderstatus(@PathVariable("id") int id, @PathVariable("status") String status) {
	    System.out.println(id);
	    System.out.println(status);
	    
	    if (id != 0 && status != null) {
	        boolean result = orderService.updatestatus(id, status);
	        
	        if (result) {
	            return ResponseEntity.status(HttpStatus.OK).build();
	        }
	    }
	    
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found.");
	}
	
	/*
	@PutMapping("{odid}")
	public ResponseEntity<?> updateOrderDetails(@RequestBody OrderDetails orderdetail,@PathVariable("odid") int id) {
		orderDetailsService.updateorderdetails(orderdetail);
		return Response.status(HttpStatus.OK);
	}
	*/
	
}
