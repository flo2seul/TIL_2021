package com.encore.banking.test;

import java.util.Scanner;
import com.encore.banking.Account;
import com.encore.banking.Customer;

public class BankingTest {

	public static void main(String[] args) {
		//1. Customer ��ü�� ����..�� �� �� ������ Scanner��ü�� ���켭 �Է�..�̸�,ssn��
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �ֹι�ȣ�� �Է��ϼ���>>>");
		
		
		String name = sc.next();
		int ssn = sc.nextInt();
		
		Customer cm = new Customer(name,ssn);
		//2. ���� ������ �����Ѵ�...�̶� Has a Relation�� ����ȴ�.
		cm.setAccount(new Account(10000.0));
		System.out.println(name+"���� ������ �����Ǿ����ϴ�.");
		//3. ���� ������ ������ ��ȯ...
		Account myAccount = cm.getAccount();
		//Account ac =new Account(0);
		
		//4. ������ ���...1���� �Ա�, 5õ�� �Ա�, 2õ�� �Ա�, 7õ�� ���
		 myAccount.deposit(10000.0);
		 myAccount.deposit(5000.0);
		 myAccount.deposit(2000.0);
		 myAccount.withdraw(7000.0);
        //5. �������� �ܾ��� �ַܼ� ����غ���...1���� + balance
		System.out.println(name+"���� �ܾ���"+myAccount.getBalance()+"�Դϴ�.");
	}

}
