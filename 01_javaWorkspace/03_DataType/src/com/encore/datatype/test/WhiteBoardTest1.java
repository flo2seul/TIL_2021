package com.encore.datatype.test;

import com.encore.datatype.WhiteBoard;

/*
 * ���� Ŭ������ �ϴ� ��
 * 1) ��ü�� �����Ѵ�. == ��ü�� �������(�ı�)
 * 2) �ı��� ����
 *  �ʵ�---- �� �Ҵ�--- �������� �ϵ��ڵ��Ǹ� 
 */
public class WhiteBoardTest1 {

	public static void main(String[] args) {
		WhiteBoard wb = new WhiteBoard();

		
		wb.setField(100, 'a', 3.5, "encore", "gold", true);
	
		wb.printInfo();

	}

}
