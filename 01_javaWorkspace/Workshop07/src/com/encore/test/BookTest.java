package com.encore.test;


import com.encore.manager.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import com.encore.vo.Novel;


public class BookTest {

	public static void main(String[] args) {
		
		
		Book b1 = new Magazine("a", "Forbes", "Forbes korea", "Forbes", 10000, "Management", 2021, 02);
		Book b2 = new Magazine("b", "매경 이코노미", "매경 이코노미 편집부", "매일경제", 5000, "Economy", 2021, 03);
		Book b3 = new Novel("c", "인간실격", "다자이 오사무", "민음사", 9000, "Drama", 9, 11);
		Book b4 = new Novel("d", "보건교사 안은영", "정세랑", "민음사", 17000, "Fantasy", 1, 26);
	
	Book[] books = {b1,b2,b3,b4};
	
	//1.
	System.out.println("1. 총 책의 갯수는: "+BookManagerImpl.getInstance().getNumberOfBooks(books)+"권");
	//2.
	//3.
	System.out.println("3. 현재 보유하고 있는 모든 책의 정보 입니다.");
	BookManagerImpl.getInstance().getAllBook(books);
	//4.
	System.out.println("4. 찾으시는 책의 isbn을 입력해주세요: a ");
	System.out.println("입력하신 isbn에 해당하는 책은"+ BookManagerImpl.getInstance().searchBookByIsbn(books, "a")+"입니다.");
	//5.
	//6.
	//7.
	//8.
	System.out.println("8. 총 책의 가격은: "+BookManagerImpl.getInstance().getSumPriceOfBooks(books)+"원");
    //9.
	}

}
