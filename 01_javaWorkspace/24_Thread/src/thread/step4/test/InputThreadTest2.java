package thread.step4.test;

import javax.swing.JOptionPane;

/*
 * �۾������带 ���
 * 
 * �ζǹ�ȣ �Է��۾��� ���ÿ�
 * ī���� �۾��� ����ǵ��� 
 * 
 * ���
 * ::
 * �۾������带 �ϳ� �߰��Ѵ�.
 * CountingThread�� ��ȩ�� �ϳ� ����
 * --> �ζ� ��ȣ �Է°� Counting�۾��� ���������� ó���ǵ��� ������ �ϼ�...
 */
public class InputThreadTest2 {

	public static void main(String[] args) {
		// 1.������ �Է�...�۾�..GUI
		String input = JOptionPane.showInputDialog("���� �ζ� ��ȣ �������ڸ� ���ڸ� �Է��ϼ���...");
		System.out.println("�Է��� ���ڴ� "+input+"�Դϴ�.");
		
		//2. ������ ī���� �۾�
		for(int i=10;i>1;i--) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				}
			System.out.println(i);
		}

	}

}
