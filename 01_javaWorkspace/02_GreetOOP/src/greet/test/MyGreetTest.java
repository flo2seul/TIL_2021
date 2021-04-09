package greet.test;
import greet.MyGreet;

/*
 * MyGreet 클래스의 메소드를 동작시키는 실행 클래스...Test 클래스
 * 1. 클래스 객체를 생성==식구(구성요소)들이 메모리에 올라간다.
 * 2. 접근
 *      1)필드 ---  값 할당
 *      2)메소드 --- 호출(Calling)
 */
public class MyGreetTest {

	public static void main(String[] args) {
		/*객체를 생성
		 * 
		 * 메모리에 mg라는 이름으로 객체가 올라간다
		 * 클래스의 식구들이 올라간다.
		 * 
		 * 메모리를 올리는 이유는 메모리 올라간 애들만 접근해서 사용할 수 있게 하기 위함
		 */
		MyGreet mg = new MyGreet(); //Calling
		mg.sayHello("윤슬아");
		

	}

}
