package com.encore.banking;
//���忡 ���� ������ ������ �ִ� Ŭ����
/*
 * 1. �ʵ� ����
 * 2. ���� ������ ��� ���: 1)SETTER 2)������
 * 3. �ʵ� ���� �޾ƿ´�.
 */
public class Account {
	
	//1. �ʵ� ����...
	public double balance;
	//2. ���� �ʵ忡 ��� ������ ���� ����
	
	public Account(double balance) { // �ļ��� ����
		this.balance = balance;
	}
	
	public void setBalance(double balance) { // setter
		this.balance = balance;
	}
	//3. �ʵ尪 �޾ƿ��� 
	
	  public double getBalance() { 
		  return balance; 
	    
	  }
	  
	  //�Ա�
		/*
		 * amount �ݾ��� 1õ�� �̻��϶��� �Ա��ϰ� 
		 * �׷��� ������ �޼���...
		 */
		  public void deposit(double amount) { //5,000
		  //balance = amount + balance;
			  
			  if (amount >= 1000) {
				  balance = amount + balance;
				  System.out.println(amount+"���� �Ա��մϴ�.");
			  }
			  else  {
				  System.out.println("�Աݾ��� 1õ�� �̻��̾�� �մϴ�.");
			  
			  }
			  
			  
			  
		//���
			  /*
			   * ��� ���
			   * amount...�ܾ��� 1����...2����
			   * ���� �ޱ�
			   */
		  } public void withdraw(double amount) {
			  
			 if(amount <= balance) {
				 balance -= amount;
			 }else {
				 System.out.println("��ݾ��� �ܾ��� �ʰ��մϴ�.");
			 }
		  
		  }
	  
		 
}

