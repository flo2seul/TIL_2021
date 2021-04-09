package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

/*
 * 실행 클래스가 하는 일
 * 1) 객체를 생성한다. == 객체의 구성요소(식구)
 * 2) 식구에 접근
 *  필드---- 값 할당--- 실제값이 하드코딩되면 
 */
public class WhiteBoardTest1 {

	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();

		
		wb.setField(100, 'a', 3.5, "encore", "gold", true);
	
		wb.printInfo();

	}

}
