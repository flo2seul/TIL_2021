package com.encore.cons;
/*
 * 1. ������
 * ��ü�� ������ ������ ����(ȣ��)�Ǵ� ��
 * 
 * 2. �⺻ ������
 * ::
 * ���ڰ����� 
 * {}�ȿ��� �ƹ��� ���۵� ���� �ʴ� ������.
 */
public class Shirt {
	//�ʵ� ����
	public String brandName;
	public double price;
	public boolean longSleeved;
	
	public Shirt() {}
	public Shirt(String brandName, double price, boolean longSleeved) {
	//�ʵ� �ʱ�ȭ
	       this.brandName = brandName;
	       this.price = price;
	       this.longSleeved = longSleeved;
	}
	public String getDetails(){
		return brandName+","+price+","+longSleeved;
		
	
	}
}