package thread.step5.test;
/*
 * Ư���� ���� �����ϴ� ������ Ŭ����
 * MegaBox���� �¼��� �����ϴ� ���� �����Ѵ�.
 * reserve()...��� ����� ����...
 */
public class MegaboxUser implements Runnable{
	private boolean seat = false;//�¼����Ű� �������� true�� �ٲ۴�.
	
	public void run() {
		reserve();
	}//reser

}
