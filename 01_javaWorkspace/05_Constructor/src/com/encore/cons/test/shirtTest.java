package com.encore.cons.test;

import com.encore.cons.Shirt;

public class shirtTest {

	public static void main(String[] args) {
		
		Shirt longT = new Shirt("����Ű",120.0, true);
		Shirt halfT = new Shirt("���̴ٽ�",125.0, true);
		
		System.out.println(longT.getDetails());
		System.out.println(halfT.getDetails());

	}

}
