package thread.step5.test;
/*
 * 특정한 일을 전담하는 쓰레드 클래스
 * MegaBox에서 좌석을 예매하는 일을 전담한다.
 * reserve()...라는 기능을 구현...
 */
public class MegaboxUser implements Runnable{
	private boolean seat = false;//좌석예매가 끝났으면 true로 바꾼다.
	
	public void run() {
		reserve();
	}//reser

}
