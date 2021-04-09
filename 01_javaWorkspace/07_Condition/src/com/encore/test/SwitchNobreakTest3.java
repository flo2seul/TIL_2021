package com.encore.test;

public class SwitchNobreakTest3 {

	public static void main(String[] args) {//실행 메소드
		/*
		 * 1. 객체 생성...식구를 매모리에 올린다.
		 *
		 * 2. 그리고 식구를 호출한다. / 메소드 호출...
		 * 결과적으로 메모리에 안 올라가면 사용할 수 없다.
		 * 사용하려면 메모리에 올려야한다. == 객체 생성
		 * 
		 * 객체를 생성하지 않고 바로 사용할 수 있는 것들이 있다.
		 * 
		 * 이미 메모리에 올라가있다. static한 성질의 것들은 미리 올라가 있다.
		 */
		int time = (int)(Math.random()*4)+8;
         System.out.println("현재시간 : "+time+"시간");
         
         switch(time) {
         case 8: 
        	 System.out.println("출근을 준비합니다.");
         case 9:
        	 System.out.println("회사 도착, 오전 회의를 합니다.");
         case 10:
        	 System.out.println("오전 업무를 봅니다.");
         case 11:
        	 System.out.println("외근 나갑니다.");
         }
	}
}
