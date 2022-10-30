package com.java.pManage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@Column(name="ProductId")
	private int pId;
	@Column(name="ProductName")
	private String pName;
	@Column(name="ProductType")
	private String pType;
	@Column(name="ProductCategory")
	private String pCat;
	@Column(name="ProductPrice")
	private double pPrice;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpCat() {
		return pCat;
	}
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public Product() {
		super();
	}
	public Product(int pId, String pName, String pType, String pCat, double pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pType = pType;
		this.pCat = pCat;
		this.pPrice = pPrice;
	}
	
}
