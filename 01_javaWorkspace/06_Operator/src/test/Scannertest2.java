package test;

import java.util.Scanner;

/*
 * scanner Ŭ������
 * ���� ��(������ �ð� �ƴ�) �ܼ�â���κ��� ���� �Է¹޵��� ���ִ� ����� ������ �ִ� Ŭ����
 */
public class Scannertest2 {

	public static void main(String[] args) {
		
		System.out.println("Ű����� ���� 2���� �̸��� �Է��ϼ���>>>");
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();//������ �������� �����͸� ��ȯ�Ѵ�.
		int j =sc.nextInt();
		sc.nextLine();
		String name = sc.next();
				
	    System.out.println("���ڰ� i:" +i+",j:"+j);
	    System.out.println(name);
	}

}
