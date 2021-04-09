package fly.test;

import fly.child.AirPlane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;


public class FlyerTest1 {

	public static void main(String[] args) {
		//1.polymorphism ������� �ڽİ�ü�� 3�� ����
		//�������̽��� ��ü ������ ����� �ƴϰ� ��ü�� �����ϱ� ���� Ÿ�����μ��� �����Ѵ�!!!!!!!!!!!!
		//Flyer flyer = new Flyer(); -->��ü ���� �ȵȴ�.
		
		Flyer bird = new Bird();
		Flyer superman = new SuperMan();
		Flyer airplane = new AirPlane();
		
		
		//2. for, instanceof �̿��ؼ� ���� �ڽ�Ŭ������ ����� ���� �� ȣ��...
		
		Flyer[] flyers = {bird,superman,airplane};
		
		for(Flyer f : flyers) {
			
			if(f instanceof Bird) System.out.println(((Bird)f).layEggs());
			if(f instanceof SuperMan)System.out.println(((SuperMan)f).stop_Bullet());
			f.fly();
			f.land();
			f.take_off();
				
		}		
	}

}
