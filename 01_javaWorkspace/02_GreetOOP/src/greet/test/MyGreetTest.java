package greet.test;
import greet.MyGreet;

/*
 * MyGreet Ŭ������ �޼ҵ带 ���۽�Ű�� ���� Ŭ����...Test Ŭ����
 * 1. Ŭ���� ��ü�� ����==�ı�(�������)���� �޸𸮿� �ö󰣴�.
 * 2. ����
 *      1)�ʵ� ---  �� �Ҵ�
 *      2)�޼ҵ� --- ȣ��(Calling)
 */
public class MyGreetTest {

	public static void main(String[] args) {
		/*��ü�� ����
		 * 
		 * �޸𸮿� mg��� �̸����� ��ü�� �ö󰣴�
		 * Ŭ������ �ı����� �ö󰣴�.
		 * 
		 * �޸𸮸� �ø��� ������ �޸� �ö� �ֵ鸸 �����ؼ� ����� �� �ְ� �ϱ� ����
		 */
		MyGreet mg = new MyGreet(); //Calling
		mg.sayHello("������");
		

	}

}
