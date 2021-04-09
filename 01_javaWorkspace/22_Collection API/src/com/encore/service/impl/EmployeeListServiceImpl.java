package com.encore.service.impl;

import java.util.ArrayList;


import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. �������̽��� ��� �޾Ƽ� ����
 * 2. �̱���
 */
public class EmployeeListServiceImpl implements EmployeeListService {
	
	private ArrayList<Employee> list;
	
	static private EmployeeListServiceImpl service = new EmployeeListServiceImpl();
	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}
	public static EmployeeListServiceImpl getInstance() {
		return  service;
	}
	//add
	@Override
	public void addEmployee(Employee e) {
		boolean find = false;//flag �� �ϳ� ����
		for(Employee emp : list) {
			if(emp.getEmpId().equals(e.getEmpId())) {
				find = true;
				System.out.println(e.getName()+"���� �̹� ȸ����ܿ� ���ԵǾ� �ֽ��ϴ�.");
				return;
			}
		}
		if(find==false) {
			list.add(e);
			System.out.println(e.getName()+"�� ȸ������ ���ԵǼ̽��ϴ�.");
		}
		
		
	}
	//delete
	@Override
	public void deleteEmployee(String empId) {
		boolean find = false;//flag �� �ϳ� ����
	    for(Employee emp : list) {
	    	if(emp.getEmpId().equals(empId)) {
	    		find = true;
	    		System.out.println(emp.getName()+"���� �����մϴ�.");
	    		list.remove(emp);
	    		break;
	    	}
	    }
		if(find==false)System.out.println("�����Ϸ��� ����� ���� ȸ���߿��� �������� �ʽ��ϴ�.");
		
	}
	//update
	@Override
	public void updateEmployee(Employee e) {
		boolean find = false;
		for(Employee emp : list) {
			if(e.getEmpId().equals(emp.getEmpId())) {
				
				emp.setName(e.getName());
				emp.setAddr(e.getAddr());
				emp.setSalary(e.getSalary());
				
				if(emp instanceof Manager) {
					((Manager) emp).changeDept(((Manager)e).getDept());
				}
				if(emp instanceof Engineer) {
					((Engineer)emp).changeBonus(((Engineer)e).getBonus());
					((Engineer) emp).changeTech(((Engineer)e).getTech());
				}
				
				
				
			}
		}
	
		
		
	}
	//find
	@Override
	public ArrayList<Employee> findEmployee(String a) {
		
		return null;
	}
	@Override
	public void findemployees() {
		
	}
	
	

}
