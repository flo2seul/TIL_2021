package com.encore.cons;

import com.encore.util.MyDate;

//������ ������ ��� �ִ� Ŭ����..
public class Programmer {
	
	//1. �ʵ� ����...
	public String name;  //API ���̺귯�� Ŭ����
	public MyDate birthday;// ����� ���� Ŭ����
	public float salary;
	public int bonus;
	
	//2. ����
	/*
	 * public void setInfo(String name, MyDate birthday, float salary, int bonus ) {
	 * 
	 * this.name = name; 
	 * this.birthday = birthday; 
	 * this.salary = salary; 
	 * this.bonus
	 * = bonus;}
	 */
	//�߰�...������
	public Programmer() {}//�⺻ ������...�ʵ� �ʱ�ȭ ���Ѵ�.
	
	public Programmer(String name, MyDate birthday, float salary, int bonus) {//������ ������...�ʵ� �ʱ�ȭ
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
		this.bonus = bonus;
	}

	//�߰�...�������� ����(����*12)�� �����ϴ� ����� ����
	public float getAnnualsalary() {
		return salary * 12 + bonus;
	
	}
	//3. �ʵ� �� �޾ƿ���
	
	  public String getInfo() { return
	  name+","+birthday.getDate()+","+salary+","+bonus; }
	 //��� �߰�

	public String getName() {
		return name;
	}
	  
}