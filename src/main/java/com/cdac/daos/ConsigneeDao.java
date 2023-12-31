package com.cdac.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Consignee;


@Repository
public interface ConsigneeDao extends JpaRepository<Consignee, Integer> {
	@Query("SELECT d FROM Consignee d WHERE d.id = :id")
	Consignee findById(@Param("id") int id);
	
	Consignee findByUserid(String userid);
	@Query("SELECT c FROM Consignee c WHERE c.zipcode = :zipcode")
	List<Consignee> findByZipCode(@Param("zipcode")int zipcode);
}
