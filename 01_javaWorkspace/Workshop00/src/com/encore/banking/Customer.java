package com.encore.banking;
//고객에 관한 정보를 가지고 있는 클래스
//은행 업무를 보는 고객...Account를 Hasing 해야한다.
import com.encore.banking.Account;

public class Customer {
	//1. 필드 선언
    public String name;
	public int ssn;
	
	public Account account;
	 

	
	//2. 값을 필드에 어떻게 주입할 지를 결정
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//3. 고객이 개설한 통장을 받아서 사용하는 기능.. (필드값 받아오기)
		public Account getAccount() {
		return account;
	}

	
	public String getCustInfo() {
		return name+":"+ssn;
	}

}
