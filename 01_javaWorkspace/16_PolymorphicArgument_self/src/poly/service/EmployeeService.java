package poly.service;


import poly.vo.Employee;
import poly.vo.Engineer;

/*
 * 상속관계에 있는 다양한 subclass들을 핸들링하는 기능만으로 이루어진 서비스 클래스.
 */
public class EmployeeService {
	static private EmployeeService service = new EmployeeService();
	private EmployeeService() {}
	public static EmployeeService getInstance() {
		return service;
	}
/*
 * Singletone Pattern
 * 하나의 클래스로부터 하나의 객체만 생성하도록 하는 패턴
 * 1.클래스 안에서 일단 객체 하나는 생성
 *   private static 객체를 생성한다.
 * 2.다른 곳에서(다른 클래스)는 객체 생성을 하지 못하도록 막아둔다.
 *   private 생성자(){}
 *  3. 만들어놓은 메소드를 언제나 가져다 쓸 수 있도록 public한 메소드를 만든다.
 */
	//0.개별 직원들의 정보 출력
	public void getEmployee(Employee e) {
		System.out.println(e);
		
	}
	//1. 모든 Employee [] 안에 들어있는 객체 정보들을 출력
	public void getAllEmployee(Employee[] emps) {
		
		for(Employee e : emps)
			System.out.println(e.toString());
	}
	//2. 테스트 클래스에서 넘겨받은 empId의 값과 일치하는 객체를 리턴하는 기능
	public Employee findByEmpId(Employee[] ea,String empId) {
		Employee emp = null;
		
		for(int i=0; i<ea.length;i++) {
			if(ea[i].getEmpId().equals(empId))
				emp=ea[i];
			
		}
		return emp;
    	
	}
	//3. 테스트 클래스에서 넘겨받은 addr값과 일치하는 Employee 타입의 객체를 리턴받음
	//같은 주소를 가진 사람의 count를 함께 알아낸다.
    public Employee[] findByAdress(Employee[] ea,String addr) {
		Employee[] emp = new Employee[ea.length];
		for(int i=0; i<emp.length;i++) {
			if(ea[i].getAddr().equals(addr)) {
				emp[i] = ea[i];
			}
		}
    	return emp;
    	
	}
    //4. 특정한 Employee의 연봉을 리턴하는 기능...Engineer일 때는 보너스 까지 생각
    public int getAnnualSalary(Employee e) {
    	
		int annualSalary = 0;
		
		annualSalary = e.getSalary()*12;
		
		if(e instanceof Engineer) {
			Engineer eg = (Engineer)e;
			annualSalary =eg.getSalary()*12+eg.getBonus();
		}
		return annualSalary;
    }
    //5. 연간 총 인건비의 총액을 리턴하는 기능
    public int getTotalCost(Employee[] ea) {
		int totalCost = 0;
		for(int i=0; i<ea.length;i++) {
			totalCost += getAnnualSalary(ea[i]);
		}
    	return totalCost;
    }

}
