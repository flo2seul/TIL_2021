package com.encore.capsulation.test;

import com.encore.capsulation.MyDate;
import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		
		System.out.println("��¥�� �Է����ּ���.>>>");
		  MyDate md = new MyDate(); 
		  System.out.println(md);
		  //1.scanner �����ؼ� �ҷ�����
		  
		  //md.month =13;
		   //md.day = 33;
		  Scanner sc = new Scanner(System.in); 
		  int month = sc.nextInt();
		  int day = sc.nextInt();
		  
		  
		  md.setMonth(month);
		  md.setDay(day);
		  
		  System.out.println("������"+md.getMonth()+"��"+md.getDay()+"�� �Դϴ�.");
		 
	}
}
