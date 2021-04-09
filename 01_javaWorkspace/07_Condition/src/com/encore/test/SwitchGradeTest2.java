package com.encore.test;

import java.util.Scanner;

public class SwitchGradeTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
    	System.out.println("당신의 시험성적을 입력하세요>>>");
    	
    	int score = sc.nextInt();
    	
		 switch(score){
	       
		   case 90:
		   case 95:
		     System.out.println("A grade...");
		        	
		        break;
		   case 80:
		   case 85:
			   System.out.println("B grade...");
		   default: //else
		               System.out.println("Try");
		        	}//switch
		              System.out.println("switch문을 빠져나옵니다.");
}//main
	}//class


