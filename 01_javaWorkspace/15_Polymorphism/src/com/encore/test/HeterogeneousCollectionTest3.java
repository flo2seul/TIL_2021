package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.parent.MyDate;


public class HeterogeneousCollectionTest3 {
	public static void main(String[] args) {

		
		Employee[] emps = { new Employee("James", new MyDate(1982, 3, 2), 23000.0),
				new Manager("Robert", new MyDate(1981, 4, 2), 33000.0, "IT"),
				new Engineer("Gosling", new MyDate(1978, 1, 2), 33000.0, "Java",200),
				new Secretary("Peter", new MyDate(1988, 1, 2), 34000.0, "Robert") 
		};
		
		/*
		 * for���� instanceof�� ����ؼ� 
		 * Robert �μ��� IT ---> Marketing
		 * Goslig tech Java-> Python
		 * Peter bossOfName Robert-> Gosling ���� �����ϼ���.
		 */
		
		for(Employee e :emps) {
			if(e instanceof Manager) 
				((Manager)e).changeDept("Marketing");
				
			
			if(e instanceof Engineer) 
				((Engineer)e).changeTech("Python");
			
			if(e instanceof Secretary) 
				((Secretary)e).changebossOfName("Gosling");
			
		    System.out.println(e.getDetails());
		}
		
	}
}

/*
 * Polymorphism
 * 
 * 1.Hetero..Collection
 * 2.Virtual Method Invocation
 * 3.Object Casting
 * 4.�θ� Ÿ������ �����ϰ� ������ ������...���� ���������� ������ ��üŸ���� �˾Ƴ��� ���� Ű����
 *    if(e instanceof �ڽ�Ŭ������)

 * 
 * 
 */

