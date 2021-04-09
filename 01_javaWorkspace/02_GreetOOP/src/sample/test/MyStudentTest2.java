package sample.test;

import sample.MyStudent;

public class MyStudentTest2 {

	public static void main(String[] args) {
		MyStudent ms1 = new MyStudent();//1
		MyStudent ms2 = new MyStudent();
		MyStudent ms3 = new MyStudent();
		
		//2 실제값이 하드 코딩되면 프로그램이 될 수 없음
		ms1.name = "나예지";
		ms1.age = 30;
		ms1.address = "서초동";
		ms1.printInfo();
		
		ms2.name = "나슬아";
		ms2.age = 35;
		ms2.address = "우이동";
		ms2.printInfo();
		
		ms3.name = "나희수";
		ms3.age = 38;
		ms3.address = "방배동";
		ms3.printInfo();
		
		
	}

}
