package com.encore.algo.test;

import java.util.Scanner;

public class ArrayPersonTypeTest {

	public static void main(String[] args) {

	 
	    Scanner sc = new Scanner(System.in);

		System.out.print("사람 수를 입력 하세요:");
		int p = sc.nextInt();
		
		int[] type = new int[p];
		
		for (int i = 0; i < type.length; i++) {
			type[i] = sc.nextInt();
		}
		
		int[] count  = new int[p];
		
		
		
			for(int i=0; i<count.length; i++) {
			count[type[i]]++;
			}
			
			// thepeople[i]에 저장된 숫자가 index의 번호가 된다. thepeople에서 입력된 중복 숫자가 확인될 때마다 index[i]의 기본 값인 0에서 1씩 증가!
		/*{
			
		
			switch(type[i]){
			case 1: count[0]++;
			case 2: count[1]++;
			case 3: count[2]++;
			case 4: count[3]++;
			default: count[4]++;
			
		}*/
		
		
		int max = 0;
		int index = 0;
		
		for(int i=0; i<p;i++ ) {
			if(index < count[i]) { 
				index = count[i];
				max = i;
		}
		}
		
	
        System.out.println("가장 많은 성격 유형은:" + max );

	
	}
}

