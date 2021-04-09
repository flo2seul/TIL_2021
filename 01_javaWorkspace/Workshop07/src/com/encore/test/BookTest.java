package com.encore.test;


import com.encore.manager.impl.BookManagerImpl;
import com.encore.vo.Book;
import com.encore.vo.Magazine;
import com.encore.vo.Novel;


public class BookTest {

	public static void main(String[] args) {
		
		
		Book b1 = new Magazine("a", "Forbes", "Forbes korea", "Forbes", 10000, "Management", 2021, 02);
		Book b2 = new Magazine("b", "�Ű� ���ڳ��", "�Ű� ���ڳ�� ������", "���ϰ���", 5000, "Economy", 2021, 03);
		Book b3 = new Novel("c", "�ΰ��ǰ�", "������ ���繫", "������", 9000, "Drama", 9, 11);
		Book b4 = new Novel("d", "���Ǳ��� ������", "������", "������", 17000, "Fantasy", 1, 26);
	
	Book[] books = {b1,b2,b3,b4};
	
	//1.
	System.out.println("1. �� å�� ������: "+BookManagerImpl.getInstance().getNumberOfBooks(books)+"��");
	//2.
	//3.
	System.out.println("3. ���� �����ϰ� �ִ� ��� å�� ���� �Դϴ�.");
	BookManagerImpl.getInstance().getAllBook(books);
	//4.
	System.out.println("4. ã���ô� å�� isbn�� �Է����ּ���: a ");
	System.out.println("�Է��Ͻ� isbn�� �ش��ϴ� å��"+ BookManagerImpl.getInstance().searchBookByIsbn(books, "a")+"�Դϴ�.");
	//5.
	//6.
	//7.
	//8.
	System.out.println("8. �� å�� ������: "+BookManagerImpl.getInstance().getSumPriceOfBooks(books)+"��");
    //9.
	}

}
