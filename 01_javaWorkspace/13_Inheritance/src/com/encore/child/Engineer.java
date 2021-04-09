package com.encore.child;

import com.encore.parent.Employee;
import com.encore.parent.MyDate;

public class Engineer extends Employee {
	
	//�ڽĸ��� ��� �߰�
	private String tech;

	
	public Engineer(String name, MyDate birthday, double salary, String tech) {
		super(name, birthday, salary);
		this.tech = tech;
	}

	public String getDetails() {
		
		return super.getDetails()+tech;
	}
	
	
	

}
