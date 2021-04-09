package com.encore.banking.test;

import java.util.Scanner;
import com.encore.banking.Account;
import com.encore.banking.Customer;

public class BankingTest {

	public static void main(String[] args) {
		//1. Customer 객체를 생성..이 때 고객 정보는 Scanner객체를 통헤서 입력..이름,ssn만
		Scanner sc = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력하세요>>>");
		
		
		String name = sc.next();
		int ssn = sc.nextInt();
		
		Customer cm = new Customer(name,ssn);
		//2. 고객이 통장을 개설한다...이때 Has a Relation이 연결된다.
		cm.setAccount(new Account(10000.0));
		System.out.println(name+"님의 통장이 개설되었습니다.");
		//3. 고객이 개설한 통장을 반환...
		Account myAccount = cm.getAccount();
		//Account ac =new Account(0);
		
		//4. 통장을 사용...1만원 입금, 5천원 입금, 2천원 입금, 7천원 출금
		 myAccount.deposit(10000.0);
		 myAccount.deposit(5000.0);
		 myAccount.deposit(2000.0);
		 myAccount.withdraw(7000.0);
        //5. 최종적인 잔액을 콘솔로 출력해본다...1만원 + balance
		System.out.println(name+"님의 잔액은"+myAccount.getBalance()+"입니다.");
	}

}
