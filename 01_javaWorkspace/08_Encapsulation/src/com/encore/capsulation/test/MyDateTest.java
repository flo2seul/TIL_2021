package com.encore.capsulation.test;

import com.encore.capsulation.MyDate;
import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		
		System.out.println("날짜를 입력해주세요.>>>");
		  MyDate md = new MyDate(); 
		  System.out.println(md);
		  //1.scanner 지정해서 불러오기
		  
		  //md.month =13;
		   //md.day = 33;
		  Scanner sc = new Scanner(System.in); 
		  int month = sc.nextInt();
		  int day = sc.nextInt();
		  
		  
		  md.setMonth(month);
		  md.setDay(day);
		  
		  System.out.println("오늘은"+md.getMonth()+"월"+md.getDay()+"일 입니다.");
		 
	}
}
