package test;

import java.util.Scanner;

/*
 * scanner 클래스는
 * 실핼 시(컴파일 시가 아님) 콘솔창으로부터 값을 입력받도록 해주는 기능을 가지고 있는 클래스
 */
public class Scannertest2 {

	public static void main(String[] args) {
		
		System.out.println("키보드로 숫자 2개와 이름을 입력하세요>>>");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();//공백을 기준으로 데이터를 반환한다.
		int j =sc.nextInt();
		sc.nextLine();
		String name = sc.next();
				
	    System.out.println("숫자값 i:" +i+",j:"+j);
	    System.out.println(name);
	}

}
