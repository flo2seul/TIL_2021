package com.encore.service;

import java.util.ArrayList;

import com.encore.vo.Employee;

//����� Template�� ��Ƴ��� �������̽�
public interface EmployeeListService {
	void addEmployee(Employee e);
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//Method Overloading
	ArrayList<Employee> findEmployee(String addr);
	void findemployees();

}