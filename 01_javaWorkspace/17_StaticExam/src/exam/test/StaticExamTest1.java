/*
 * === static한 키워드 성질 ===
 * 1. 객체생성과정 없이 메모리에 올라간다.
 * 2. 객체 생성 과정 훨씬 이전에...Class File Loader과정에서...이 때 메모리에 올라단다.
 *    JVM(STACK | HEAP(new 키워드로 생성된 객체만) |...Class Area(static한 성질들의 멤버)
 * 3. static한 성질의 필드는 생성된 객체들에서 서로 공유한다. !!!
 * 
 * 4. static은 static끼리 통한다.
 * 5. static 블락 안에서는 this 사용 못한다.
 * 6. static과 final은 성질상 종종 함께 사용된다.
 *    ex) 상수값 선언  static final int BASIC_SALARY = 1000;
 * 7. static initialization block   
 * 8. 싱글톤
 */
package exam.test;

class Member{
	//필드 레벨에 static 변수를 선언(local level로는 사용할 수 없다.)
	static String name =  "홍길동";
	static int age = 22;
	
	int count = 1;//선언
	
	//static block
	public static void getMember() {//static block
		System.out.println("우/유/빛/깔/"+ name);//static variable 
		//System.out.println("우/유/빛/깔"+ count);//객체를 생성해야 메모리에 올라간다. 단순히 변수 선언만으로는 불러서 못씀.
	}
	//non-static block
	public static void getMember2() {//static block
		System.out.println("우/유/빛/깔/"+ name);//static variable 
		//System.out.println("우/유/빛/깔"+ count);//객체를 생성해야 메모리에 올라간다. 단순히 변수 선언만으로는 불러서 못씀.
	}
}
public class StaticExamTest1 {

	public static void main(String[] args) {
		//static한 성질의 기능은 바로 접근해서 사용할 수 있다...Class 이름, static 메소드
	    Member.getMember();//레퍼런스 변수.getMember()
	    
	    Member m = new Member();
	    m.getMember();
	    m.getMember2();
	    
	    
	    //
	}

}
