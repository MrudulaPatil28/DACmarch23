package com.cdac.entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodid;
	private String pname;
	private String brand;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category pcat;
	
	@ManyToOne
	@JoinColumn(name = "subcategory_id")
	private Subcategory subcat;
	
	private int price;
	private String photo;
	private String status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "created_timestamp", updatable = false)
	private Date createdTimestamp=new Date();
	
	@ManyToOne
	@JoinColumn(name="sellerId")
	private Seller seller;
	
	
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


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
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


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}



	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}


	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}


	public Seller getSeller() {
		return seller;
	}


	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", pname=" + pname + ", pcat=" + pcat + ", subcat=" + subcat + ", price="
				+ price + ", photo=" + photo + ", createdTimestamp=" + createdTimestamp + ", stock_status"+status+"]";
	}
	
	
	
}
