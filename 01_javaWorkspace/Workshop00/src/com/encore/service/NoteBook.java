package com.encore.service;

public class NoteBook {

	//1. �ʵ� ����
	public int serialNum;
	public String brand;
	public int price;
	
	//2. �ʵ� �� ����
	public NoteBook(int serialNum, String brand, int price) {
		super();
		this.serialNum = serialNum;
		this.brand = brand;
		this.price = price;
	}
	
	//3. �ʵ尪 �޾ƿ���
	public String getNoteBookInfo() {
		return serialNum+","+brand+","+price;
	}
}
