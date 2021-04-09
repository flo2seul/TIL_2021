package com.encore.service.test;

//import java.util.Scanner;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("개발자의 정보를 입력하세요>>>");
		 * 
		 * String name = sc.next(); String company = sc.next(); String tech = sc.next();
		 */
		//1. Programmer 객체를 생성
		Programmer pro = new Programmer("Jane",new MyDate(1988,01,27),"apple","dataengineer");
		pro.buyNoteboook(new NoteBook(173,"apple",3000));
		
		//2. Programmer가 NoteBook을 가짐
		
		//3. 개발자 정보와 노트북 정보를 출력
		System.out.println(name+"님의 노트북 정보는"+pro.getNotebook());
		//4. 더 필요한 기능이 있다면 각자 알아서 추가해서 로직을 완성
	}

}
