package greet;

//
/* 
 * MyGreet클래스는
 * 인삿말을 콘솔창으로 출력하는 기능을 가진 클래스
 *  
 */
public class MyGreet {
	public String message = "안녕하세요^^"; //변수(필드;값이 저장되는 공간) 선언
	
	public void sayHello(String name) { // Method 정의 선언부 + 구현부 , method worker
		System.out.println(message+"," +name);
	}
}
