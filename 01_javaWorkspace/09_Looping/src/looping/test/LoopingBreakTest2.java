package looping.test;
/*
 * for���� �̿��ؼ� 1~100������ ������ ���ϴ� ������ �ۼ�
 * ������ �ϳ� �� �߰��Ѵ�.
 * -���� 500�� �Ѿ�� �ݺ��� �ߴ��ϰ�,
 * �׶��� ���հ� i���� ���
 */
public class LoopingBreakTest2 {

	public static void main(String[] args) {
	
		int sum = 0;//local v...�⺻���� ���� ������ �ݵ�� �ʱ�ȭ �ϰ� ���
	   for(int i=1;i<=100;i++) {
		   sum += i;//sum = i + sum}
		   if(sum>500) break;
	   }
		   System.out.println(sum);
	   
	}//main

}
