package com.encore.cons.test;

import com.encore.util.MyDate;
import com.encore.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//step1
		/*
		 * Programmer pro = new Programmer();
		 * Programmer pro1 = new Programmer();
		 * 
		 * 
		 * MyDate md = new MyDate(); 
		 * md.setDate(1980,1,1);
		 * 
		 * pro.setInfo("James",md,300000.0f, 100000);//필드에 값을 주입
		 * pro1.setInfo("Peter",md,400000.0f,0);//필드에 값을 주입
		 * 
		 * pro = pro1;
		 * 
		 * 
		 * System.out.println(pro.getInfo());//주입된 값을 받아옴
		 * System.out.println(pro1.getInfo());//주입된 값을 받아옴
		 */
		
		//step2
		/*
		 * 1. pro1, pro2 객체를 생성...
		 * 2. 생성자를 이용해서 필드에 직접 값을 할당한다.
		 * 
		 * 3. 필드 정보를 콘솔창으로 출력..
		 * 
		 * 4. peter의 연봉은 450000.0달러 입니다. 출력이 되도록 로직을 완성하세요.
		 * 
		 * 
		 */
		 //MyDate md = new MyDate(1980, 1, 1);
		 Programmer pro1 = new Programmer("James", new MyDate(1980, 1, 1),300000.0f, 100000);
		 Programmer pro2 = new Programmer("Peter", new MyDate(1980, 1, 1),450000.0f, 100000);
		 
		 System.out.println(pro1.getInfo());//주입된 값을 받아옴
		 System.out.println(pro2.getInfo());//주입된 값을 받아옴
		 
		 System.out.println(pro2.getName()+"님의 연봉은"+pro2.getAnnualsalary()+"달러입니다!!");
	}

}
