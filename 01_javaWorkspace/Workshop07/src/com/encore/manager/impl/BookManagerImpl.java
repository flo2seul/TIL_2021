package com.encore.manager.impl;

import com.encore.manager.BookManager;
import com.encore.vo.Book;



public class BookManagerImpl implements BookManager {

	
	private int numberOfBooks;
	private int idx;

	static final BookManagerImpl manager = new BookManagerImpl();

	private BookManagerImpl() {
	}

	public static BookManagerImpl getInstance() {
		return manager;
	}

	// 1. 책의 총 갯수
	@Override
	public int getNumberOfBooks(Book[] books) {
		for (Book b : books)
			numberOfBooks++;
		return numberOfBooks;
	}

	// 2. 책 추가 하기
	@Override
	public void insertBook(Book b) {

	}

	// 3. 모든 책의 정보 출력
	@Override
	public Book[] getAllBook(Book[] books) {
		for (Book b : books)
			System.out.println(b);

		return null;
	}

	// 4. isbn으로 책 찾기
	@Override
	public Book[] searchBookByIsbn(Book[] books, String isbn) {
        
		Book[] returnBooks = new Book[numberOfBooks];
	
		for (int i = 0; i < numberOfBooks; i++) {
			if (books[i].getIsbn().equals(isbn))
				returnBooks[idx++] = books[i];
		}
		
		return returnBooks;
	}
	

	// 5. title로 책 찾기
	@Override
	public Book[] searchBookByTitle(String title) {

		return null;
	}

	// 6. publisher로 책 찾기
	@Override
	public Book[] searchBookByPublisher(String publisher) {

		return null;
	}

	// 7. price로 책 찾기
	@Override
	public Book[] searchBookByPrice(double price) {

		return null;
	}

	// 8. 모든 책 총 가격 불러오기
	@Override
	public double getSumPriceOfBooks(Book[] books) {
		for (Book b : books) {
			idx += b.getPrice();
		}
		return idx;
	}

	// 9. 모든 책의 평균 가격
	@Override
	public double getAveagePriceOfBooks() {

		return 0;
	}

}
