package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.parent.MyDate;
import com.encore.service.EmployeeService;

public class PolymorphismTest_sample {

	public static void main(String[] args) {
		//1. 부모 타입으로 자식생성
		
		/*
		 * Employee[] emps = { new Employee("James", new MyDate(1982, 3, 2), 23000.0),
		 * new Manager("Robert", new MyDate(1981, 4, 2), 33000.0, "IT"), new
		 * Engineer("Gosling", new MyDate(1978, 1, 2), 33000.0, "Java",200), new
		 * Secretary("Peter", new MyDate(1988, 1, 2), 34000.0, "Robert") };
		 */
		Employee e1 = new Employee("James", new MyDate(1982, 3, 2), 23000.0);
		Employee e2 = new Manager("Robert", new MyDate(1981, 4, 2), 33000.0, "IT");
		Employee e3 = new Engineer("Gosling", new MyDate(1978, 1, 2), 33000.0, "Java",200);
		Employee e4 = new Secretary("Peter", new MyDate(1988, 1, 2), 34000.0, "Robert"); 
	
		//2.부모 타입의 배열에 초기화
        Employee[] emps = {e1,e2,e3,e4};
        
        //3. 서비스 클래스 생성
        EmployeeService service = new EmployeeService();
        
        service.manageEmployee(e4);
        service.manageEmployee(e2);
        
        service.printAllEmployee(emps);

	}

}
