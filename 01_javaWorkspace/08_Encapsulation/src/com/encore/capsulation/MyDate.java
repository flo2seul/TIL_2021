package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. 다른 클래스에서 직접적으로 접근할 수 없도록
 *   필드앞에 ---> private 지정한다.
 * 2. 클래스의 필드에 접근은 setter()와 getter() 한다
 *    그리고 얘네들이  다른 클래스에서도 접근할 수 있도록 public
 *    public void setXxx(o)
 *    public void getXxx(x)
 *    
 *  3.
 *    setXxx(){
 *    //첫 라인에서(필드 초기화 되기 직전!!!)에 타당한 값만 받을 수 있도록 로직을 제언한다.
 *    
 *    setDay()
 *    ::
 *    1,3,5,7,8,10,12월 ---> 1 <= day <=31
 *    2월 ---> 1 <= day <=28
 *    4,5,9,11월 ---->1<= day <=30
 *    switch, if
 *    
 *    ::
 *    8월 22일입니다.
 *    2월 0일입니다.
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
			System.out.println("해당하는 달을 찾을 수 없습니다.");
			return;
	}
	}
	public void setDay(int day) {
		//월애 따라서 day가 달라진다...
		switch (month) {
		
		case 2:
		     if(day>=1 && day<=28) {
		    	 this.day = day;
		     }else {
		    	 System.out.println("해당하는 일을 찾을 수 없습니다.");
		         return; 
		     }
		     break;
		case 4: case 6: case 9: case 11:
			 if(day>=1 && day<=30) {
				 this.day = day;
			 }else {
				 System.out.println("해당하는 일을 찾을 수 없습니다.");
			 }
			break;
		default:
			 if(day>=1 && day<=31) {
				 this.day = day;
			 }
			 else {
				 System.out.println("해당하는 일을 찾을 수 없습니다.");
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
