package com.encore.test;

import com.encore.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		//1.Product Type�� �迭�� 3�� ����
		//2. Product�� 3�� ����
		//1,2�� �ѹ��� �Ͻñ� �ٶ��ϴ�.
	    Product [] pro = {
	    		new Product("���Ӹ���Ǫ", 23000, 2,"LG"),
	    		new Product("��ټ�����", 2000, 7,"HP"),
	    		new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
	    		new Product("ĹŸ��", 340000, 1,"LG")
	    };
		
		//3. for���� �̿��ؼ� Product ������ ���
		/*
		 * for(int i=0 ; i<p.length; i++ ) 
		 * System.out.println(p[i].getDetail());
		 */
	    for(Product p: pro)
	    	System.out.println(p.getDetail());
	}

}
