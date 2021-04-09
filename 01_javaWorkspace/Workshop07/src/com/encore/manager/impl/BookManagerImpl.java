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

	// 1. å�� �� ����
	@Override
	public int getNumberOfBooks(Book[] books) {
		for (Book b : books)
			numberOfBooks++;
		return numberOfBooks;
	}

	// 2. å �߰� �ϱ�
	@Override
	public void insertBook(Book b) {

	}

	// 3. ��� å�� ���� ���
	@Override
	public Book[] getAllBook(Book[] books) {
		for (Book b : books)
			System.out.println(b);

		return null;
	}

	// 4. isbn���� å ã��
	@Override
	public Book[] searchBookByIsbn(Book[] books, String isbn) {
        
		Book[] returnBooks = new Book[numberOfBooks];
	
		for (int i = 0; i < numberOfBooks; i++) {
			if (books[i].getIsbn().equals(isbn))
				returnBooks[idx++] = books[i];
		}
		
		return returnBooks;
	}
	

	// 5. title�� å ã��
	@Override
	public Book[] searchBookByTitle(String title) {

		return null;
	}

	// 6. publisher�� å ã��
	@Override
	public Book[] searchBookByPublisher(String publisher) {

		return null;
	}

	// 7. price�� å ã��
	@Override
	public Book[] searchBookByPrice(double price) {

		return null;
	}

	// 8. ��� å �� ���� �ҷ�����
	@Override
	public double getSumPriceOfBooks(Book[] books) {
		for (Book b : books) {
			idx += b.getPrice();
		}
		return idx;
	}

	// 9. ��� å�� ��� ����
	@Override
	public double getAveagePriceOfBooks() {

		return 0;
	}

}
