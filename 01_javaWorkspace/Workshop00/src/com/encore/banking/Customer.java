package com.encore.banking;
//���� ���� ������ ������ �ִ� Ŭ����
//���� ������ ���� ��...Account�� Hasing �ؾ��Ѵ�.
import com.encore.banking.Account;

public class Customer {
	//1. �ʵ� ����
    public String name;
	public int ssn;
	
	public Account account;
	 

	
	//2. ���� �ʵ忡 ��� ������ ���� ����
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	//3. ���� ������ ������ �޾Ƽ� ����ϴ� ���.. (�ʵ尪 �޾ƿ���)
		public Account getAccount() {
		return account;
	}

	
	public String getCustInfo() {
		return name+":"+ssn;
	}

}
