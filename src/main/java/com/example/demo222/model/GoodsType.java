package com.example.demo222.model;

public class GoodsType {
	private Integer tID;
	private String tName;
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	@Override
	public String toString() {
		return "GoodsType [tID=" + tID + ", tName=" + tName + "]";
	}
}
