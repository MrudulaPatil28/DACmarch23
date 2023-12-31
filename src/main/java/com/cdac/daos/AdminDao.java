package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String> {

}
