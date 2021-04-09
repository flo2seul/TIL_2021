package com.encore.array.test;

import com.encore.array.Account;
import com.encore.array.Customer;

public class AccountArrayTest2 {

	public static void main(String[] args) {
        //Account Type�� �迭 ����,����,�ʱ�ȭ	
		Account[] acc = {
				 new Account(1000.0, "��������"),
				 new Account(30000.0, "��������"),
				 new Account(40000.0, "�츮����")
		};
		
		//1. Customer ��ü�� ����
		
		Customer c = new Customer("James",12345);
		
		//2. james��� ���� ���� 3���� Hasing �ϵ��� �Ѵ�.
	    c.setAccounts(acc);
		
		//3. James�� ������ ������� �޾ƿ´�.
		Account[] returnAcc=c.getAccounts();
	
		//3. ���ӽ��� ����� �߿��� �������� ���忡�� 5õ������ �Ա��Ѵ�.
		for(Account a : returnAcc) {
			if(a.getBankName().equals("��������"))
				a.deposit(50000.0);
		}
		System.out.println("=========������ �ܰ� Ȯ���մϴ�.=========");
		//5. �� ������� �ܰ� Ȯ���Ѵ�.
		
		//�ʿ��� ����� �ִٸ� �� �߰��ϱ�
	   for(Account account : returnAcc) System.out.println(account.getDetail());

	}

}
