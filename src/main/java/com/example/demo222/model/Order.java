package com.example.demo222.model;

import java.util.Date;

public class Order {
		private Integer oID;
		private Integer gdID;
		private Integer oNum;
		private Date oTime;
		public int getoID() {
			return oID;
		}
		public void setoID(int oID) {
			this.oID = oID;
		}
		public int getGdID() {
			return gdID;
		}
		public void setGdID(int gdID) {
			this.gdID = gdID;
		}
		public int getoNum() {
			return oNum;
		}
		public void setoNum(int oNum) {
			this.oNum = oNum;
		}
		public Date getoTime() {
			return oTime;
		}
		public void setoTime(Date oTime) {
			this.oTime = oTime;
		}
		@Override
		public String toString() {
			return "Order [oID=" + oID + ", gdID=" + gdID + ", oNum=" + oNum + ", oTime=" + oTime + "]";
		}
}
