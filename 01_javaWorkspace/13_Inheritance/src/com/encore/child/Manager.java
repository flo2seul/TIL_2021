package com.encore.child;
/*
 * �θ� Ŭ���� Employee�κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ� Ŭ����...
 */
import com.encore.parent.Employee;
import com.encore.parent.MyDate;
import com.encore.child.Engineer;

public class Manager extends Employee {
	
	//�ڽĸ��� ��� �߰�
	private String dept;
	public String depts;
	
	/*
	 * �ڽĻ�����...��ü �����˰���
	 * �ڽ� ������ {ù ���ο��� ������ �θ�⺻ ������ ȣ���� �Ͼ��.}
	 */
	//������� �θ� ���� �������
	public Manager(String name, MyDate birthday, double salary, String dept) {//�ڽ��� �����Ƿ� �� ��,
		//�θ� �⺻ ������ ȣ��...super();
		super(name, birthday, salary);
		this.dept = dept;
	}
	
	/*�޼ҵ� �������̵�
	 * 
	 * ��� ���迡���� �Ͼ��.
	 * 1.�θ� ���� ����� �����޴´�...=ȣ���Ѵ�.
	 * 2.�װ� �ڽſ� �°� ��ģ��.
	 * 
	 * Overriding�� Rule
	 * 0. ��Ӱ����� �� Ŭ���� ���̿��� �Ͼ��.
	 * 1. �޼ҵ� ����δ� ��� ��ġ
	 * 2. �����δ� �ݵ�� �޶�� �Ѵ�.
	 * -->�ϴ� ���� �޶��������� ���ο� �޼ҵ尡 ���������.
	 *    �޼ҵ� ������
	 * 
	 */
	
public String getDetails() {
	
	return super.getDetails()+dept;
}
}
