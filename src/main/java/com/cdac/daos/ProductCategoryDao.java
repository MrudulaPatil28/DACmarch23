package com.cdac.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.entities.Category;


@Repository
public interface ProductCategoryDao extends JpaRepository<Category, Integer> {

}
