package exception.runtime.test;

import javax.crypto.NullCipher;

public class RuntimeExceptionTest2 {

	public static void main(String[] args) {
		//��ü �������� �ʰ� ���������� ������ �� �߻��ϴ� ����
		System.out.println("==============NullpointerException===========");
	    String str = "Encore";
	    String str1 = new String("Encore");
	    str1 = null; //��ü������ ���� �����Ͱ� ������ ����� �߻�..
	    try{System.out.println("���ڿ� ���̸� ��ȯ�մϴ�."+str1.length());
	    System.out.println("toString() ��Ʈ�������� �������̵� �Ǿ����ִ�."+str1.toString());
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
