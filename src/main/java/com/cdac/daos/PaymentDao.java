package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}