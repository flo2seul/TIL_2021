package greet;

//
/* 
 * MyGreetŬ������
 * �λ��� �ܼ�â���� ����ϴ� ����� ���� Ŭ����
 *  
 */
public class MyGreet {
	public String message = "�ȳ��ϼ���^^"; //����(�ʵ�;���� ����Ǵ� ����) ����
	
	public void sayHello(String name) { // Method ���� ����� + ������ , method worker
		System.out.println(message+"," +name);
	}
}
