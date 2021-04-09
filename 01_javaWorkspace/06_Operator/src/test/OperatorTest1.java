package test;

public class OperatorTest1 {

	public static void main(String[] args) {
		int i = 5;//반드시 초기화하고 사용해야한다. 얘는 기본값이 없어서 초기화 안하고 쓰면 바로 에러난다.
		int j = 3;// 로컬 변수
		
		Operator o1 = new Operator();//100
		Operator o2 = new Operator();//200

		// ==(same)
		
		o1 = o2;
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1==o2);
		
		// %...mod...나머지
		System.out.println("연산자 % ::" + i%j);
		System.out.println(i==j);
		System.out.println(i!=j);
		
		// ++(1씩 증가), --(1씩 감소)
		int k = 10;
		System.out.println(k++);//1이 나중에 증가
		System.out.println(k);
		
		int m = 10;
		System.out.println(++m);//1이 먼저 증가
		System.out.println(m);
		
		
		// 논리 연산자
		System.out.println(o1.test1() | o1.test2());//true
		System.out.println("#########################################");
		System.out.println(o1.test1() & o1.test2());//false
		
		
		// short Circuit 지름길 : 문제상황을 건너뛸 수 있음 
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
