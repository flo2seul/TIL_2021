package poly.service;


import poly.vo.Employee;
import poly.vo.Engineer;

/*
 * ��Ӱ��迡 �ִ� �پ��� subclass���� �ڵ鸵�ϴ� ��ɸ����� �̷���� ���� Ŭ����.
 */
public class EmployeeService {
	static private EmployeeService service = new EmployeeService();
	private EmployeeService() {}
	public static EmployeeService getInstance() {
		return service;
	}
/*
 * Singletone Pattern
 * �ϳ��� Ŭ�����κ��� �ϳ��� ��ü�� �����ϵ��� �ϴ� ����
 * 1.Ŭ���� �ȿ��� �ϴ� ��ü �ϳ��� ����
 *   private static ��ü�� �����Ѵ�.
 * 2.�ٸ� ������(�ٸ� Ŭ����)�� ��ü ������ ���� ���ϵ��� ���Ƶд�.
 *   private ������(){}
 *  3. �������� �޼ҵ带 ������ ������ �� �� �ֵ��� public�� �޼ҵ带 �����.
 */
	//0.���� �������� ���� ���
	public void getEmployee(Employee e) {
		System.out.println(e);
		
	}
	//1. ��� Employee [] �ȿ� ����ִ� ��ü �������� ���
	public void getAllEmployee(Employee[] emps) {
		
		for(Employee e : emps)
			System.out.println(e.toString());
	}
	//2. �׽�Ʈ Ŭ�������� �Ѱܹ��� empId�� ���� ��ġ�ϴ� ��ü�� �����ϴ� ���
	public Employee findByEmpId(Employee[] ea,String empId) {
		Employee emp = null;
		
		for(int i=0; i<ea.length;i++) {
			if(ea[i].getEmpId().equals(empId))
				emp=ea[i];
			
		}
		return emp;
    	
	}
	//3. �׽�Ʈ Ŭ�������� �Ѱܹ��� addr���� ��ġ�ϴ� Employee Ÿ���� ��ü�� ���Ϲ���
	//���� �ּҸ� ���� ����� count�� �Բ� �˾Ƴ���.
    public Employee[] findByAdress(Employee[] ea,String addr) {
		Employee[] emp = new Employee[ea.length];
		for(int i=0; i<emp.length;i++) {
			if(ea[i].getAddr().equals(addr)) {
				emp[i] = ea[i];
			}
		}
    	return emp;
    	
	}
    //4. Ư���� Employee�� ������ �����ϴ� ���...Engineer�� ���� ���ʽ� ���� ����
    public int getAnnualSalary(Employee e) {
    	
		int annualSalary = 0;
		
		annualSalary = e.getSalary()*12;
		
		if(e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary =eg.getSalary()*12+eg.getBonus();
		}
		return annualSalary;
    }
    //5. ���� �� �ΰǺ��� �Ѿ��� �����ϴ� ���
    public int getTotalCost(Employee[] ea) {
		int totalCost = 0;
		for(int i=0; i<ea.length;i++) {
			totalCost += getAnnualSalary(ea[i]);
		}
    	return totalCost;
    }

}
