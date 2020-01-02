package com.example.demo222.model;

import java.util.Date;

public class Goods {
	private Integer gdID;
	private String gdName;
	private String gdPrice;
	private String gdQuantity;
	private Integer gdSaleQty;
	private String gdInfo;
	private Date gdAddTime;
	private String gdImage;
	private Integer tID;
	
	public Integer gettID() {
		return tID;
	}
	public void settID(Integer tID) {
		this.tID = tID;
	}
	public Integer getGdID() {
		return gdID;
	}
	public void setGdID(Integer gdID) {
		this.gdID = gdID;
	}
	public Integer getGdSaleQty() {
		return gdSaleQty;
	}
	public void setGdSaleQty(Integer gdSaleQty) {
		this.gdSaleQty = gdSaleQty;
	}
	public String getGdName() {
		return gdName;
	}
	public void setGdName(String gdName) {
		this.gdName = gdName;
	}
	public String getGdPrice() {
		return gdPrice;
	}
	public void setGdPrice(String gdPrice) {
		this.gdPrice = gdPrice;
	}
	public String getGdQuantity() {
		return gdQuantity;
	}
	public void setGdQuantity(String gdQuantity) {
		this.gdQuantity = gdQuantity;
	}
	
	public String getGdInfo() {
		return gdInfo;
	}
	public void setGdInfo(String gdInfo) {
		this.gdInfo = gdInfo;
	}
	public Date getGdAddTime() {
		return gdAddTime;
	}
	public void setGdAddTime(Date gdAddTime) {
		this.gdAddTime = gdAddTime;
	}
	public String getGdImage() {
		return gdImage;
	}
	public void setGdImage(String gdImage) {
		this.gdImage = gdImage;
	}
	@Override
	public String toString() {
		return "Goods [gdID=" + gdID + ", gdName=" + gdName + ", gdPrice=" + gdPrice + ", gdQuantity=" + gdQuantity
				+ ", gdSaleQty=" + gdSaleQty + ", gdInfo=" + gdInfo + ", gdAddTime=" + gdAddTime + ", gdImage="
				+ gdImage + ", tID=" + tID + "]";
	}
	
	
	
	
}
