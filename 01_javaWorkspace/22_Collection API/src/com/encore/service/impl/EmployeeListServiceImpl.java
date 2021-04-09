package com.encore.service.impl;

import java.util.ArrayList;


import com.encore.service.EmployeeListService;
import com.encore.vo.Employee;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

/*
 * 1. 인터페이스를 상속 받아서 정의
 * 2. 싱글톤
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
		boolean find = false;//flag 값 하나 선언
		for(Employee emp : list) {
			if(emp.getEmpId().equals(e.getEmpId())) {
				find = true;
				System.out.println(e.getName()+"님은 이미 회원명단에 가입되어 있습니다.");
				return;
			}
		}
		if(find==false) {
			list.add(e);
			System.out.println(e.getName()+"님 회원으로 가입되셨습니다.");
		}
		
		
	}
	//delete
	@Override
	public void deleteEmployee(String empId) {
		boolean find = false;//flag 값 하나 선언
	    for(Employee emp : list) {
	    	if(emp.getEmpId().equals(empId)) {
	    		find = true;
	    		System.out.println(emp.getName()+"님을 삭제합니다.");
	    		list.remove(emp);
	    		break;
	    	}
	    }
		if(find==false)System.out.println("삭제하려는 대상이 현재 회원중에는 존재하지 않습니다.");
		
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
