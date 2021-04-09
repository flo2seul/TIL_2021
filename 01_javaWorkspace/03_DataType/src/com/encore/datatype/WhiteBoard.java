package com.encore.datatype;
/*
 * 1. �ʵ�
 *    int ������, char �÷�, float ����, String ����ȸ��, String ����
 *     ��ũ��ġ ���θ� �� �� �ִ� �ʵ带 �߰�
 * 2.�޼ҵ�
 *   2�� ����
 *   -�ʵ尪�� Test Ŭ�������� �޾Ƽ� �ʵ忡 �Է��ϴ� ���
 *   - �ʵ忡 �Էµ�, ����� ���� �ܼ�â���� ����ϴ� ���
 *   1.
 *   ����(Variable�� ���Ǵ� ��ġ�� ���� Field�� Local Variable�� ���еȴ�.)
 *   �ʵ� --> Ŭ���� ���� �ٷ� ��,�޼ҵ� ��� �ٱ�
 *   Local V(����) --> �޼ҵ� ��
 *   
 *   2. ���ú����� �̸��� �ʵ�� �����ϰ� ���������� �ۼ��Ѵ�.
 *      �̸��� ������ ���� �ʵ� �տ� this�� ���̸� �ȴ�.
 */
public class WhiteBoard {
	public int size;
	public char color;
	public double price;//float (32), double (64)
	public String company;
	public String material;
	public boolean scratch;
	
	public void setField(int size, char color, double price, String company, String material,boolean scratch){
		// �ʵ�� ���ú����� �̸��� ���� ��, �����ϱ� ���ؼ� �ʵ�տ� this. ���̱�
		// this�� �ش� Ŭ���� �ڱ� �ڽ�..������.. �ϴ� �ؼ�
		
		this.size = size;
		this.color = color;
		this.price =price;
		this.company = company;
		this.material= material;
		this.scratch = scratch;
		
	}
	public void printInfo() {
		System.out.println(size+"\t"+color+"\t"+price+"\t"+company+"\t"+material+"\t"+scratch);
		
	}

}
