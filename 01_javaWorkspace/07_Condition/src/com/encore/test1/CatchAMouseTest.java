package com.encore.test1;

import java.util.Scanner;

/*
 * 제어문을 사용한 알고리즘을 간단하게 다뤄보자.
 */
public class CatchAMouseTest {
	
	private static String alogoSolv(int cata, int catb, int mouse) {
		if(Math.abs(cata-mouse)>Math.abs(catb-mouse)) 
			return "CatB Catch!!";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result=algoSolv(cata,catb,mouse);
	}
}
