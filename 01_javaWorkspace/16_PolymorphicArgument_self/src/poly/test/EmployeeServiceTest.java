package poly.test;


import poly.service.EmployeeService;
import poly.vo.Employee;
import poly.vo.Engineer;
import poly.vo.Manager;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		//1. �θ� Ÿ������ �ڽĻ���
		
		/*
		 * Employee[] emps = { new Employee("James", new MyDate(1982, 3, 2), 23000.0),
		 * new Manager("Robert", new MyDate(1981, 4, 2), 33000.0, "IT"), new
		 * Engineer("Gosling", new MyDate(1978, 1, 2), 33000.0, "Java",200), new
		 * Secretary("Peter", new MyDate(1988, 1, 2), 34000.0, "Robert") };
		 */
		Employee e1 = new Employee("a","James","LA", 23000);
		Employee e2 = new Manager("b","Robert","NY", 33000, "IT");
		Employee e3 = new Engineer("c","Seula","Seoul", 33000, "Java",200);
		
	
		//2.�θ� Ÿ���� �迭�� �ʱ�ȭ
        Employee[] emps = {e1,e2,e3};
        
        //3. ���� Ŭ���� ����
        //EmployeeService service = new EmployeeService();
        
        EmployeeService.getInstance().getEmployee(e3);
        EmployeeService.getInstance().getEmployee(e2);
        System.out.println("================================");
       
        EmployeeService.getInstance().getAllEmployee(emps);

	}

}
