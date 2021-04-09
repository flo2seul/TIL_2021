package com.encore.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.dao.EmployeeDAO;
import com.encore.dao.impl.EmpoyeeDAOImpl;
import com.encore.vo.Employee;


import config.ServerInfo;

public class EmployeeDAOTest {
	public  EmployeeDAOTest() throws ClassNotFoundException {
		Class.forName(ServerInfo.DRIVER);
		System.out.println("Driver Loading....");
	}

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		EmployeeDAOTest jdbc = new EmployeeDAOTest();
		
		EmpoyeeDAOImpl emp = EmpoyeeDAOImpl.getEmp();
		//emp.insertEmp(new Employee(1,"윤슬아",10000.0,"강북구"));
		//emp.insertEmp(new Employee(2,"이윤지",10000.0,"부산"));
        //emp.removeEmp(2);
		//emp.updateEmp(new Employee(1,"윤슬아",15000.0,"몬트리올"));
		ArrayList<Employee> returnList = emp.selectAll();
		for (Employee e : returnList)
			System.out.println(e);
	}

}
