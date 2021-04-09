package com.encore.parent;
/*
 * 자식들의 공통적인 성질을 
 * 일반적인 성질로 가지고 있는 부모 클래스..
 */
public class Employee {
	//상수값 지정
	public static final double BASIC_SALARY =100.0;
	
    private String name;
	private MyDate birthday;
	private double salary;
	private String nickname;
	
	public Employee() {}
	public Employee(String name, MyDate birthday) {
		this(name,birthday,BASIC_SALARY);
	}
	
	public Employee(String name, MyDate birthday, double salary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}
	public String getDetails() {
		
		return name+","+birthday.getDate()+","+salary;
	}
	
	

	
	
}
