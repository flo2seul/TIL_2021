package test;

public class OperatorTest1 {

	public static void main(String[] args) {
		int i = 5;//�ݵ�� �ʱ�ȭ�ϰ� ����ؾ��Ѵ�. ��� �⺻���� ��� �ʱ�ȭ ���ϰ� ���� �ٷ� ��������.
		int j = 3;// ���� ����
		
		Operator o1 = new Operator();//100
		Operator o2 = new Operator();//200

		// ==(same)
		
		o1 = o2;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);
		
		// %...mod...������
		System.out.println("������ % ::" + i%j);
		System.out.println(i==j);
		System.out.println(i!=j);
		
		// ++(1�� ����), --(1�� ����)
		int k = 10;
		System.out.println(k++);//1�� ���߿� ����
		System.out.println(k);
		
		int m = 10;
		System.out.println(++m);//1�� ���� ����
		System.out.println(m);
		
		
		// �� ������
		System.out.println(o1.test1() | o1.test2());//true
		System.out.println("#########################################");
		System.out.println(o1.test1() & o1.test2());//false
		
		
		// short Circuit ������ : ������Ȳ�� �ǳʶ� �� ���� 
		System.out.println(o1.test1() || o1.test2());//true
		System.out.println("#########################################");
		System.out.println(o1.test1() && o1.test2());//false
	}//main
	

}//class

class Operator{
	public boolean test1() {
		System.out.println("test() Calling...");
		return true;
		
	}
	public boolean test2() {
		System.out.println("test2() Calling...");
		return false;
	}
	
}
