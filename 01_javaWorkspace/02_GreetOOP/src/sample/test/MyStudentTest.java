package sample.test;

import sample.MyStudent;
/*
 * MyStudentTest.java�� ������
 * �л����� �þ������
 * ������ �ʵ忡 �ش��ϴ� ���� �Ҵ��ؾߵ�
 * 
 * �ذ�å
 * 1) �ʵ忡 ���� ���� ������ �ȵȴ�.
 * 20 ���� �ʵ忡 �ԷµǴ� ����� ���Ӱ� �ϳ� �����Ѵ�.
 * 
 */
public class MyStudentTest {

	public static void main(String[] args) {
		MyStudent m1 = new MyStudent();
		MyStudent m2 = new MyStudent();
		
		
		m1.setField("AAA",27,"Texas");
		m2.setField("BBB", 29, "LA");
		
		m1.printInfo();
		m2.printInfo();
		
	}

}
