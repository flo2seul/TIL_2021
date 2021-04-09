package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

//기능의 Template를 모아놓은 인터페이스
public interface EmployeeListService {
	void addEmployee(Employee e);
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//Method Overloading
	ArrayList<Employee> findEmployee(String addr);
	void findemployees();

}
