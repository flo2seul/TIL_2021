package sample;
/*
 * �ʵ忡 ���� �Է��ϴ� ����� �߰�...
 * 
 * simple  | detail (0)
 * setInfo()
 * inputField()
 */
public class MyStudent {
	// �ʵ� ����
	public String name;
	public int age;
	public String address;
	
	public void setField(String n, int a, String add) {
		name = n;
		age = a;
		address = add;
	}
	public void printInfo() { //1
		System.out.println(name+", "+age+", "+address);
	}

}
