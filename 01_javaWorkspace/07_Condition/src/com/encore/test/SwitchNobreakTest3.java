package com.encore.test;

public class SwitchNobreakTest3 {

	public static void main(String[] args) {//���� �޼ҵ�
		/*
		 * 1. ��ü ����...�ı��� �Ÿ𸮿� �ø���.
		 *
		 * 2. �׸��� �ı��� ȣ���Ѵ�. / �޼ҵ� ȣ��...
		 * ��������� �޸𸮿� �� �ö󰡸� ����� �� ����.
		 * ����Ϸ��� �޸𸮿� �÷����Ѵ�. == ��ü ����
		 * 
		 * ��ü�� �������� �ʰ� �ٷ� ����� �� �ִ� �͵��� �ִ�.
		 * 
		 * �̹� �޸𸮿� �ö��ִ�. static�� ������ �͵��� �̸� �ö� �ִ�.
		 */
		int time = (int)(Math.random()*4)+8;
         System.out.println("����ð� : "+time+"�ð�");
         
         switch(time) {
         case 8: 
        	 System.out.println("����� �غ��մϴ�.");
         case 9:
        	 System.out.println("ȸ�� ����, ���� ȸ�Ǹ� �մϴ�.");
         case 10:
        	 System.out.println("���� ������ ���ϴ�.");
         case 11:
        	 System.out.println("�ܱ� �����ϴ�.");
         }
	}
}
