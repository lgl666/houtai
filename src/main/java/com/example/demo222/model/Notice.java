package com.example.demo222.model;

public class Notice {
		private Integer tID;
		private String tTitle;
		private String tContent;
		public int gettID() {
			return tID;
		}
		public void settID(int tID) {
			this.tID = tID;
		}
		public String gettTitle() {
			return tTitle;
		}
		public void settTitle(String tTitle) {
			this.tTitle = tTitle;
		}
		public String gettContent() {
			return tContent;
		}
		public void settContent(String tContent) {
			this.tContent = tContent;
		}
		@Override
		public String toString() {
			return "Notice [tID=" + tID + ", tTitle=" + tTitle + ", tContent=" + tContent + "]";
		}
		
}
