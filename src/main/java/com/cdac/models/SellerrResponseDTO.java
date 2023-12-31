package com.cdac.models;

import org.springframework.beans.BeanUtils;

import com.cdac.entities.Product;
import com.cdac.entities.Seller;

public class SellerrResponseDTO {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static SellerrResponseDTO fromEntity(Seller entity) {
		SellerrResponseDTO dto = new SellerrResponseDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

}
