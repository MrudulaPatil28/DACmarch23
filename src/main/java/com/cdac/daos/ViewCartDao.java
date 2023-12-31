package com.cdac.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Customer;
import com.cdac.entities.Viewcart;
@Repository
public interface ViewCartDao  extends JpaRepository<Viewcart, Integer> {
	@Query("SELECT od FROM Viewcart od WHERE od.customer = :customer")
	List<Viewcart> findbyCustomer(@Param("customer")Customer customer);
}
