package com.cdac.models;

import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cdac.entities.Category;
import com.cdac.entities.Product;
import com.cdac.entities.Subcategory;

public class ProductDTO {
	
	private int prodid;
	private String pname;
	private Category pcat;
	private Subcategory subcat;
	private int price;
	private int sellerId;
	private String brand;
	private String status;
	private MultipartFile pic;
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Category getPcat() {
		return pcat;
	}

	public void setPcat(Category pcat) {
		this.pcat = pcat;
	}

	public Subcategory getSubcat() {
		return subcat;
	}

	public void setSubcat(Subcategory subcat) {
		this.subcat = subcat;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public MultipartFile getPic() {
		return pic;
	}

	public void setPic(MultipartFile pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "ProductDTO [prodid=" + prodid + ", pname=" + pname + ", pcat=" + pcat + ", subcat=" + subcat
				+ ", price=" + price + ", sellerId=" + sellerId + ", stock_status"+status+"]";
	}
	
	public static Product toEntity(ProductDTO dto) {
		Product entity=new Product();
		BeanUtils.copyProperties(dto, entity, "pic");		
		return entity;
	}
}
