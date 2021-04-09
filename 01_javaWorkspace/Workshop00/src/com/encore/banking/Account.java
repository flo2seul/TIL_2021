package com.encore.banking;
//통장에 관한 정보를 가지고 있는 클래스
/*
 * 1. 필드 선언
 * 2. 값을 주입할 통로 고민: 1)SETTER 2)생성자
 * 3. 필드 값을 받아온다.
 */
public class Account {
	
	//1. 필드 선언...
	public double balance;
	//2. 값을 필드에 어떻게 주입할 지를 결정
	
	public Account(double balance) { // 셍성자 주입
		this.balance = balance;
	}
	
	public void setBalance(double balance) { // setter
		this.balance = balance;
	}
	//3. 필드값 받아오기 
	
	  public double getBalance() { 
		  return balance; 
	    
	  }
	  
	  //입금
		/*
		 * amount 금액이 1천원 이상일때만 입금하고 
		 * 그렇지 않으면 메세지...
		 */
		  public void deposit(double amount) { //5,000
		  //balance = amount + balance;
			  
			  if (amount >= 1000) {
				  balance = amount + balance;
				  System.out.println(amount+"원을 입금합니다.");
			  }
			  else  {
				  System.out.println("입금액은 1천원 이상이어야 합니다.");
			  
			  }
			  
			  
			  
		//출금
			  /*
			   * 제어문 사용
			   * amount...잔액이 1만원...2만원
			   * 조건 달기
			   */
		  } public void withdraw(double amount) {
			  
			 if(amount <= balance) {
				 balance -= amount;
			 }else {
				 System.out.println("출금액이 잔액을 초과합니다.");
			 }
		  
		  }
	  
		 
}

