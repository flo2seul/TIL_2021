package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ�������� ���������� ������ �� ������
 *   �ʵ�տ� ---> private �����Ѵ�.
 * 2. Ŭ������ �ʵ忡 ������ setter()�� getter() �Ѵ�
 *    �׸��� ��׵���  �ٸ� Ŭ���������� ������ �� �ֵ��� public
 *    public void setXxx(o)
 *    public void getXxx(x)
 *    
 *  3.
 *    setXxx(){
 *    //ù ���ο���(�ʵ� �ʱ�ȭ �Ǳ� ����!!!)�� Ÿ���� ���� ���� �� �ֵ��� ������ �����Ѵ�.
 *    
 *    setDay()
 *    ::
 *    1,3,5,7,8,10,12�� ---> 1 <= day <=31
 *    2�� ---> 1 <= day <=28
 *    4,5,9,11�� ---->1<= day <=30
 *    switch, if
 *    
 *    ::
 *    8�� 22���Դϴ�.
 *    2�� 0���Դϴ�.
 */
public class MyDate {
    //
	private int month;
    private int day;
    
	
	public void setMonth(int month) {
		if(month >=1 && month <= 12) {
		
			this.month = month;
		
	}
		else {
			System.out.println("�ش��ϴ� ���� ã�� �� �����ϴ�.");
			return;
	}
	}
	public void setDay(int day) {
		//���� ���� day�� �޶�����...
		switch (month) {
		
		case 2:
		     if(day>=1 && day<=28) {
		    	 this.day = day;
		     }else {
		    	 System.out.println("�ش��ϴ� ���� ã�� �� �����ϴ�.");
		         return; 
		     }
		     break;
		case 4: case 6: case 9: case 11:
			 if(day>=1 && day<=30) {
				 this.day = day;
			 }else {
				 System.out.println("�ش��ϴ� ���� ã�� �� �����ϴ�.");
			 }
			break;
		default:
			 if(day>=1 && day<=31) {
				 this.day = day;
			 }
			 else {
				 System.out.println("�ش��ϴ� ���� ã�� �� �����ϴ�.");
			 }
			break;
		}
		/*
		 * if(month == 2) { day <= 29; } if (month == 4) { day <=30; } if (month == 5) {
		 * day <=30; }if (month == 7) { day <=30; }if (month == 9) { day <=30; } else {
		 * day <= 31; }
		 */
		this.day = day;
		
		
		
	}
	
public int getMonth() {
	
		
		return month;
	}

	public int getDay() {
		
	
		return day;
	}
	

    
}
