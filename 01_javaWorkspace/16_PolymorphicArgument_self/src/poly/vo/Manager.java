package poly.vo;
/*
 * 부모 클래스 Employee로부터 모든것을 물려받고
 * 자기자신만의 멤버를 추가하는 자식 클래스...
 */

public class Manager extends Employee {
	
	//자식만의 멤버 추가
	private String dept;

	
	/*
	 * 자식생성자...객체 생성알고리즘
	 * 자식 생성자 {첫 라인에서 무조선 부모기본 생성자 호출이 일어난다.}
	 */
	//명시적인 부모를 직접 만들어줌

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
	
	
	/*메소드 오버라이딩
	 * 
	 * 상속 관계에서만 일어난다.
	 * 1.부모가 가진 기능을 물려받는다...=호출한다.
	 * 2.그걸 자신에 맞게 고친다.
	 * 
	 * Overriding의 Rule
	 * 0. 상속관계의 두 클래스 사이에서 일어난다.
	 * 1. 메소드 선언부는 모두 일치
	 * 2. 구현부는 반드시 달라야 한다.
	 * -->하는 일이 달라졌음으로 새로운 메소드가 만들어졌다.
	 *    메소드 재정의
	 * 
	 */
	

}
