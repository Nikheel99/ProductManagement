package com.java.pManage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Discount {

	@Id
	@Column(name="ProductCategory")
	private String pCat;
	@Column(name="Discount")
	private float dis;
	@Column(name="GST")
	private float gst;
	@Column(name="DeliveryCharge")
	private int dc;
	public String getpCat() {
		return pCat;
	}
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	public float getDis() {
		return dis;
	}
	public void setDis(float dis) {
		this.dis = dis;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public int getDc() {
		return dc;
	}
	public void setDc(int dc) {
		this.dc = dc;
	}
	public Discount() {
		super();
	}
	public Discount(String pCat, float dis, float gst, int dc) {
		super();
		this.pCat = pCat;
		this.dis = dis;
		this.gst = gst;
		this.dc = dc;
	}
}
