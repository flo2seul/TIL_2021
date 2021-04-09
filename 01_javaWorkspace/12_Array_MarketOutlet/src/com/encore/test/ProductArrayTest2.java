package com.encore.test;

import com.encore.vo.Product;
//��ɵ��� �߰��غ��ڽ��ϴ�.
public class ProductArrayTest2 {

	public static void main(String[] args) {
	
	    Product [] pro = {
	    		new Product("���Ӹ���Ǫ", 23000, 2,"LG"),
	    		new Product("��ټ�����", 2000, 7,"HP"),
	    		new Product("�Ŷ��", 1200, 10,"SAMSUNG"),
	    		new Product("ĹŸ��", 340000, 1,"LG")
	    };
	//1.��ǰ���� ����Ŀ�� ����մϴ�.
	    System.out.println("=====��ǰ���� ����Ŀ�� ����մϴ�..=====");
	    for(Product p: pro)
	    	System.out.println(p.getDetail());
	    
	  //2.Ư�� ���� �̻��� ��ǰ�� ���
	    System.out.println("=====10���� �̻��ϴ� ��ǰ���� ����մϴ�..=====");
	    for(Product p: pro) {
	    	if(p.getPrice()>=100000)
	    
	    	System.out.println(p.getDetail());
	    }
	    //3. ������ ���ǵ��� �Ѱ���
	    System.out.println("=====�� ���԰����� ����մϴ�.=====");
	    int total = 0;
	    for(Product p: pro) total=p.getPrice() * p.getQuantity();
	    System.out.println("Total Price "+total+"��");
	    
	}

}
