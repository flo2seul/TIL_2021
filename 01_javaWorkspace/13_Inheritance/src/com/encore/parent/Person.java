package com.encore.parent;

public class Person extends Object{

	private String name;
	private int age;
	private String address;
	
	public Person(String name,int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+age+","+address;
	}
}
