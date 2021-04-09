package com.encore.service;

public class NoteBook {

	//1. 필드 선언
	public int serialNum;
	public String brand;
	public int price;
	
	//2. 필드 값 주입
	public NoteBook(int serialNum, String brand, int price) {
		super();
		this.serialNum = serialNum;
		this.brand = brand;
		this.price = price;
	}
	
	//3. 필드값 받아오기
	public String getNoteBookInfo() {
		return serialNum+","+brand+","+price;
	}
}
