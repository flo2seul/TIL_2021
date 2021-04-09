package exception.runtime.test;

import javax.crypto.NullCipher;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		//객체 생성하지 않고 참조변수로 접근할 때 발생하는 예외
		System.out.println("==============NullpointerException===========");
	    String str = "Encore";
	    String str1 = new String("Encore");
	    str1 = null; //객체생성을 하지 않은것과 동일한 결과가 발생..
	    try{System.out.println("문자열 길이를 반환합니다."+str1.length());
	    System.out.println("toString() 스트링에서는 오버라이딩 되어져있다."+str1.toString());
	    }catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("woww");
		}
	    catch (NullPointerException e) {
			System.out.println("oops...!");
		}finally {
			System.out.println("Always print....");
		}
	}

}
