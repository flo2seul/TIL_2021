package com.encore.test;

import com.encore.vo.Product;
//기능들을 추가해보겠습니다.
public class ProductArrayTest2 {

	public static void main(String[] args) {
	
	    Product [] pro = {
	    		new Product("댕기머리샴푸", 23000, 2,"LG"),
	    		new Product("삼다수생수", 2000, 7,"HP"),
	    		new Product("컵라면", 1200, 10,"SAMSUNG"),
	    		new Product("캣타워", 340000, 1,"LG")
	    };
	//1.상품들의 메이커를 출력합니다.
	    System.out.println("=====상품들의 메이커를 출력합니다..=====");
	    for(Product p: pro)
	    	System.out.println(p.getDetail());
	    
	  //2.특정 가격 이상의 제품만 출력
	    System.out.println("=====10만원 이상하는 제품들을 출력합니다..=====");
	    for(Product p: pro) {
	    	if(p.getPrice()>=100000)
	    
	    	System.out.println(p.getDetail());
	    }
	    //3. 구매한 물건들의 총가격
	    System.out.println("=====총 구입가격을 출력합니다.=====");
	    int total = 0;
	    for(Product p: pro) total=p.getPrice() * p.getQuantity();
	    System.out.println("Total Price "+total+"원");
	    
	}

}
