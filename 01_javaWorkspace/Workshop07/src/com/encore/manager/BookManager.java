package com.encore.manager;

import com.encore.vo.Book;

public interface BookManager {
	int getNumberOfBooks(Book[] books);
	void insertBook(Book b);
	Book[] getAllBook(Book[] books);
	Book[] searchBookByIsbn(Book[] books, String isbn);
	Book[] searchBookByTitle(String title);
	Book[] searchBookByPublisher(String publisher);
	Book[] searchBookByPrice(double price);
	double getSumPriceOfBooks(Book[] books);
	double getAveagePriceOfBooks();

}
