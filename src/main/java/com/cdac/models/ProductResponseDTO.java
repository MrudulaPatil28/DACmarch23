package com.cdac.models;

import org.springframework.beans.BeanUtils;

import com.cdac.entities.Product;

public class ProductResponseDTO {
	

	private String brand;
	private int prodid;
	private String pname;
	private int pcatid;
	private String category;
	private int subcatid;
	private String subcategory;
	private int price;
	private int sellerId;
	private String sellerName;
	private String photo;
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPcatid(int pcatid) {
		this.pcatid = pcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public int getPcatid() {
		return pcatid;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSubcatid() {
		return subcatid;
	}

	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public static ProductResponseDTO fromEntity(Product entity) {
		ProductResponseDTO dto = new ProductResponseDTO();
		dto.setSellerId(entity.getSeller().getId());
		dto.setSellerName(entity.getSeller().getName());
		dto.setPcatid(entity.getPcat().getId());
		dto.setCategory(entity.getPcat().getName());
		dto.setSubcatid(entity.getSubcat().getId());
		dto.setSubcategory(entity.getSubcat().getName());
		
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
	}
}
