package sample.test;

import sample.MyStudent;
/*
 * MyStudentTest.java의 문제접
 * 학생수가 늘어날때마다
 * 일일이 필드에 해당하는 값을 할당해야됨
 * 
 * 해결책
 * 1) 필드에 값을 직접 넣으면 안된다.
 * 20 값이 필드에 입력되는 기능을 새롭게 하나 정의한다.
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
