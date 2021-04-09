package com.encore.vo;

public class Novel extends Book {
	private int month;
	private int day;
	
	public Novel(String isbn, String title, String author, String publisher, double price, String desc,int month,int day) {
		super(isbn, title, author, publisher, price, desc);
		this.month = month;
		this.day = day;
		
		
		
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return super.toString() + month+"¿ù " + day+"ÀÏ";
	}
	
	

}
