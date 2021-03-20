package com.encore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.vo.Book;

public interface BookDAO {
	Connection getConnect() throws SQLException;
	void closeAll(PreparedStatement ps, Connection conn) throws SQLException;
	void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException;
	void registerBook(Book vo) throws SQLException;
	void deleteBook(String isbn) throws SQLException;
	Book findByBook(String isbn,String title) throws SQLException;
	ArrayList<Book> findByWriter(String writer) throws SQLException;
	ArrayList<Book> findByPublisher(String publisher) throws SQLException;
	
	///가격에 대한 검색..
	ArrayList<Book> findByPrice(int min, int max) throws SQLException;
	void discountBook(int per, String publisher) throws SQLException;
	void printAllInfo() throws SQLException;


}
