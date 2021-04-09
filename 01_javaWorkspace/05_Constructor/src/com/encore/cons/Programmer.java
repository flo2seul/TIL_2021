package com.encore.cons;

import com.encore.util.MyDate;

//개발자 정보를 담고 있는 클래스..
public class Programmer {
	
	//1. 필드 선언...
	public String name;  //API 라이브러리 클래스
	public MyDate birthday;// 사용자 지정 클래스
	public float salary;
	public int bonus;
	
	//2. 주입
	/*
	 * public void setInfo(String name, MyDate birthday, float salary, int bonus ) {
	 * 
	 * this.name = name; 
	 * this.birthday = birthday; 
	 * this.salary = salary; 
	 * this.bonus
	 * = bonus;}
	 */
	//추가...생성자
	public Programmer() {}//기본 생성자...필드 초기화 안한다.
	
	public Programmer(String name, MyDate birthday, float salary, int bonus) {//명시적 생성자...필드 초기화
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}

	//추가...개발자의 연봉(월급*12)을 리턴하는 기능을 정의
	public float getAnnualsalary() {
		return salary * 12 + bonus;
	
	}
	//3. 필드 값 받아오기
	
	  public String getInfo() { return
	  name+","+birthday.getDate()+","+salary+","+bonus; }
	 //기능 추가

	public String getName() {
		return name;
	}
	  
}
