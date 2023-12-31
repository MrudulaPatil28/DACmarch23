package com.cdac.models;

import org.springframework.beans.BeanUtils;

import com.cdac.entities.Consignee;
import com.cdac.entities.Seller;

public class ConsigneeResponseDTO {
	private int id;
	private String name;
	private String city;
	private int zipcode;
	private String phone;
	private String gender;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public static ConsigneeResponseDTO fromEntity(Consignee entity) {
		ConsigneeResponseDTO dto = new ConsigneeResponseDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setGender(entity.getGender());
		dto.setCity(entity.getCity());
		dto.setZipcode(entity.getZipcode());
		dto.setPhone(entity.getPhone());
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}

}
