package com.encore.service.test;

//import java.util.Scanner;

import com.encore.service.NoteBook;
import com.encore.service.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("�������� ������ �Է��ϼ���>>>");
		 * 
		 * String name = sc.next(); String company = sc.next(); String tech = sc.next();
		 */
		//1. Programmer ��ü�� ����
		Programmer pro = new Programmer("Jane",new MyDate(1988,01,27),"apple","dataengineer");
		pro.buyNoteboook(new NoteBook(173,"apple",3000));
		
		//2. Programmer�� NoteBook�� ����
		
		//3. ������ ������ ��Ʈ�� ������ ���
		System.out.println(name+"���� ��Ʈ�� ������"+pro.getNotebook());
		//4. �� �ʿ��� ����� �ִٸ� ���� �˾Ƽ� �߰��ؼ� ������ �ϼ�
	}

}
