package com.encore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.encore.vo.CustomerInfo;

public interface BrokerDAOTemplate {
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	void addCustomInfo(CustomerInfo vo) throws SQLException;
	void deleteCustomInfo(String ssn) throws SQLException;

}
