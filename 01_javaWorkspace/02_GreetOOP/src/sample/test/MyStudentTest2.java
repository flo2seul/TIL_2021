package sample.test;

import sample.MyStudent;

public class MyStudentTest2 {

	public static void main(String[] args) {
		MyStudent ms1 = new MyStudent();//1
		MyStudent ms2 = new MyStudent();
		MyStudent ms3 = new MyStudent();
		
		//2 �������� �ϵ� �ڵ��Ǹ� ���α׷��� �� �� ����
		ms1.name = "������";
		ms1.age = 30;
		ms1.address = "���ʵ�";
		ms1.printInfo();
		
		ms2.name = "������";
		ms2.age = 35;
		ms2.address = "���̵�";
		ms2.printInfo();
		
		ms3.name = "�����";
		ms3.age = 38;
		ms3.address = "��赿";
		ms3.printInfo();
		
		
	}

}
