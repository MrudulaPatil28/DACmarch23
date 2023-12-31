package com.cdac.controllers;

import java.util.ArrayList;
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

import com.cdac.entities.Consignee;
import com.cdac.entities.OrderDetails;
import com.cdac.entities.Seller;
import com.cdac.models.OrderDetailsDTO;
import com.cdac.models.OrderResponseDTO;

import com.cdac.models.Response;
import com.cdac.services.ConsigneeService;
import com.cdac.services.OrderdetailService;

@CrossOrigin
@RestController
@RequestMapping("/api/orderdetails")
public class OrderdetailsController {

	@Autowired OrderdetailService orderDetailsService;
	@Autowired ConsigneeService consigneeService;
	
    @GetMapping("/seller/{sellerId}")
	public ResponseEntity<?> findAllOrdersOfSeller(@PathVariable("sellerId") int sellerId) {
		List<OrderDetailsDTO> details= new ArrayList<OrderDetailsDTO>();
		if(sellerId != 0) {
			Seller seller = new Seller();
	        seller.setId(sellerId);
	        
			for(OrderDetails od :	orderDetailsService.findByOrderBySeller(seller)) {
				//System.out.println(od);
				details.add(OrderDetailsDTO.fromEntity(od));
				for(OrderDetailsDTO detail : details)
				System.out.println(detail.getConsinee());
			}
		}
		return  Response.success(details);
	}
    
    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrderDetails(@RequestBody OrderDetails updatedOrder, @PathVariable int id) {
    	System.out.println(updatedOrder);
    	Consignee result= null;
    	if(id != 0) {
    		System.out.println("id "+id);
    		result = consigneeService.findById(id);
    		System.out.println(result);
    	}
    	if(updatedOrder != null && result != null ) {
    		System.out.println("in loop"+updatedOrder);
    		boolean status = orderDetailsService.updateorderdetails(updatedOrder,result);
    		System.out.println(status);
    		if(status == true) {
    			return Response.status(HttpStatus.OK);
    		}else {
    			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("order not found .");
    		}
    	
    	}
    	 return ResponseEntity.status(HttpStatus.CONFLICT).body("Internal server error");
    	
    	
    }
    
    @GetMapping("/consignee/{id}")
   	public ResponseEntity<?> findAllOrdersOfConsignee(@PathVariable("id") int id) {
   		List<OrderDetailsDTO> details= new ArrayList<OrderDetailsDTO>();
   		if(id != 0) {
   			Consignee con = new Consignee();
   	        con.setId(id);
   			for(OrderDetails od :	orderDetailsService.findByOrderByConsignee(con)) {
   				details.add(OrderDetailsDTO.fromEntity(od));
   			}
   		}
   		return  Response.success(details);
   	}
    
    
	
}
