package com.encore.algo.test;

import java.util.Arrays;

public class ArrayTest {
	public static int[] list = { 34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
    
	public static void print() {
		for (int i = 0; i < list.length; i++) 
			System.out.print(list[i]+" ");
		System.out.println("\t");
		
		
	}

	public static void total() {
		
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			
		sum += list[i];
		}
		System.out.println("배열의 합 : "+ sum);

	}

	public static void average() {
		
		int sum = 0;
		int mean = 0;
		for (int i = 0; i < list.length; i++) 
			sum += list[i];
		mean = sum / list.length;	
		System.out.println("배열의 평균 : "+ mean);

	}

	public static void minimum() {

		int min = list[0]; 
		for (int i = 0; i < list.length; i++)
			if (min>list[i])
				min = list[i];
		System.out.println("배열의 최소값 : "+ min);		
	}

	public static void selectionSort() {
		
		Arrays.sort(list);
		
	}

	public static void main(String[] args) {
		print();
		total();
		average();
		minimum();
		System.out.println("===selection sort (Ascending Order)===");
		selectionSort();
		print();

	}

}
