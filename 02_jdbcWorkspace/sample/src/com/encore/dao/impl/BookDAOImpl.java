package com.encore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.dao.BookDAO;
import com.encore.exception.BookNotFoundException;
import com.encore.exception.DuplicateISBNException;
import com.encore.exception.InvalidInputException;
import com.encore.vo.Book;

public class BookDAOImpl implements BookDAO{
	
	private static BookDAOImpl dao = new BookDAOImpl();
	private BookDAOImpl() {
		
	}
	public static BookDAOImpl getInstance() {
		return dao;
	}
	//공통적인 로직..Connection getConnect()
	//공통적인 로직..closeAll()...오버로딩기법
	@Override
	public void registerBook(Book vo) throws SQLException,DuplicateISBNException {	
		
	}

	@Override
	public void deleteBook(String isbn) throws SQLException, BookNotFoundException{		
		
	}

	@Override
	public Book findByBook(String isbn, String title) throws SQLException {
	
		return null;
	}

	@Override
	public ArrayList<Book> findByWriter(String writer) throws SQLException {
		
		return null;
	}

	@Override
	public ArrayList<Book> findByPublisher(String publisher) throws SQLException {
		
		return null;
	}

	@Override
	public ArrayList<Book> findByPrice(int min, int max) throws SQLException ,InvalidInputException{
		
		return null;
	}

	@Override
	public void discountBook(int per, String publisher) throws SQLException {
		
		
	}

	@Override
	public void printAllInfo() throws SQLException {
		
		
	}
}
