package com.encore.algo.test;

import java.util.Scanner;

public class ArrayPersonTypeTest {

	public static void main(String[] args) {

	 
	    Scanner sc = new Scanner(System.in);

		System.out.print("��� ���� �Է� �ϼ���:");
		int p = sc.nextInt();
		
		int[] type = new int[p];
		
		for (int i = 0; i < type.length; i++) {
			type[i] = sc.nextInt();
		}
		
		int[] count  = new int[p];
		
		
		
			for(int i=0; i<count.length; i++) {
			count[type[i]]++;
			}
			
			// thepeople[i]�� ����� ���ڰ� index�� ��ȣ�� �ȴ�. thepeople���� �Էµ� �ߺ� ���ڰ� Ȯ�ε� ������ index[i]�� �⺻ ���� 0���� 1�� ����!
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
		
	
        System.out.println("���� ���� ���� ������:" + max );

	
	}
}

