package poly.vo;
/*
 * �θ� Ŭ���� Employee�κ��� ������ �����ް�
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ� Ŭ����...
 */

public class Manager extends Employee {
	
	//�ڽĸ��� ��� �߰�
	private String dept;

	
	/*
	 * �ڽĻ�����...��ü �����˰���
	 * �ڽ� ������ {ù ���ο��� ������ �θ�⺻ ������ ȣ���� �Ͼ��.}
	 */
	//������� �θ� ���� �������

	public Manager(String empId, String name, String addr, int salary,String dept) {
		super(empId, name, addr, salary);
		this.dept = dept;
		// TODO Auto-generated constructor stub
	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Manager [dept=" + dept+ "]";
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
	

}
