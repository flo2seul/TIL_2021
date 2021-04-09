package com.encore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.encore.dao.EmployeeDAO;
import com.encore.vo.Employee;


import config.ServerInfo;

public class EmpoyeeDAOImpl implements EmployeeDAO {
	
	static private EmpoyeeDAOImpl emp;
	private EmpoyeeDAOImpl() {
		
	}
	public static EmpoyeeDAOImpl getEmp() {
		if(emp == null) {
			emp = new EmpoyeeDAOImpl();
		}
		return emp;
		
	}

	@Override
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		System.out.println("디비 서버 연결..");
		return conn;
	
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
		
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if(rs!=null) rs.close();
		closeAll(ps, conn);
		
	}

	@Override
	public void insertEmp(Employee emp) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		conn = getConnect();
		String query = "insert into employee values(?,?,?,?)";

		ps = conn.prepareStatement(query);
		System.out.println("PreparedStatement 객체 생성...");

		ps.setInt(1, emp.getNum());
		ps.setString(2, emp.getName());
		ps.setDouble(3, emp.getSalary());
		ps.setString(4, emp.getAddress());

		System.out.println(ps.executeUpdate() + "명 추가되었습니다.");

		closeAll(ps, conn);
		
	}

	@Override
	public void removeEmp(int num) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		conn = getConnect();
		String querydel = "DELETE FROM employee WHERE num=?";

		ps = conn.prepareStatement(querydel);
		System.out.println("PreparedStatement 객체 생성...");

		ps.setInt(1, num);
		System.out.println(ps.executeUpdate() + "row delete....ok");

		closeAll(ps, conn);
		
	}

	@Override
	public void updateEmp(Employee emp) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		conn = getConnect();
		String query = "update employee set name=?, salary=? , address=?  where num=? ";

		ps = conn.prepareStatement(query);
		System.out.println("PreparedStatement 객체 생성...");

		ps.setString(1, emp.getName());
		ps.setDouble(2, emp.getSalary());
		ps.setString(3, emp.getAddress());
		ps.setInt(4, emp.getNum());

		System.out.println(ps.executeUpdate() + "명의 정보가 변경되었습니다.");

		closeAll(ps, conn);
		
	}

	@Override
	public ArrayList<Employee> selectAll() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Employee> list = new ArrayList<Employee>();

		conn = getConnect();
		String query = "select num, name, salary, address from employee";
		ps = conn.prepareStatement(query);
		System.out.println("PreparedStatement 객체 생성...");

		rs = ps.executeQuery();
		while (rs.next()) {
			list.add(new Employee(rs.getInt("num"), rs.getString("name"), rs.getDouble("salary") ,rs.getString("address")));
		}

		
 	closeAll(rs, ps, conn);
		return list;


	}


}
