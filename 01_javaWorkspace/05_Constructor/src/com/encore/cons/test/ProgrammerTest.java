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
		 * pro.setInfo("James",md,300000.0f, 100000);//�ʵ忡 ���� ����
		 * pro1.setInfo("Peter",md,400000.0f,0);//�ʵ忡 ���� ����
		 * 
		 * pro = pro1;
		 * 
		 * 
		 * System.out.println(pro.getInfo());//���Ե� ���� �޾ƿ�
		 * System.out.println(pro1.getInfo());//���Ե� ���� �޾ƿ�
		 */
		
		//step2
		/*
		 * 1. pro1, pro2 ��ü�� ����...
		 * 2. �����ڸ� �̿��ؼ� �ʵ忡 ���� ���� �Ҵ��Ѵ�.
		 * 
		 * 3. �ʵ� ������ �ܼ�â���� ���..
		 * 
		 * 4. peter�� ������ 450000.0�޷� �Դϴ�. ����� �ǵ��� ������ �ϼ��ϼ���.
		 * 
		 * 
		 */
		 //MyDate md = new MyDate(1980, 1, 1);
		 Programmer pro1 = new Programmer("James", new MyDate(1980, 1, 1),300000.0f, 100000);
		 Programmer pro2 = new Programmer("Peter", new MyDate(1980, 1, 1),450000.0f, 100000);
		 
		 System.out.println(pro1.getInfo());//���Ե� ���� �޾ƿ�
		 System.out.println(pro2.getInfo());//���Ե� ���� �޾ƿ�
		 
		 System.out.println(pro2.getName()+"���� ������"+pro2.getAnnualsalary()+"�޷��Դϴ�!!");
	}

}
