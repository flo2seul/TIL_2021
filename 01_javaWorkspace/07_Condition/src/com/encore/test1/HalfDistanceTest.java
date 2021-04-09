package com.encore.test1;

import java.util.Scanner;

/*
 * kim's
 * 1-2-3-4
 * 
 * lim's
 * 1-2-3-4-5-6-7-8
 * 
 */
public class HalfDistanceTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kims = sc.nextInt();//
		int lims = sc.nextInt();//
		
		int result=halfDistance(kims, lims);
		System.out.println(result);
	}
		

	}

}
