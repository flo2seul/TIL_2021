package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set�� �ڽ� Ŭ����...HashSet
 * 1. �ߺ� ���� ����
 * 2. ������ ������ �ʴ´�.
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("�嵵��");
		set.add("�ڳ���");
		set.add("������");
		set.add("�ȿ���");
		set.add("������");
		set.add("�嵵��");//�ߺ�
		
		System.out.println(set.size());//5
		//Collection API�� ��ü������ toString()�� �������̵� �Ǿ��� �ִ�...������ ��µȴ�.
		System.out.println(set.toString());
		boolean flag=set.contains("ȫ��ȭ");
		System.out.println("ȫ��ȭ�� ���� ���ֳ���?"+flag);
		System.out.println("set Collection�� �����Ͱ� ����� �ֳ���?"+ set.isEmpty());
		
		//�ڳ����� ����
		set.remove("�ڳ���");
		//��� set������ ���
		System.out.println(set);
		//��� �����͸� ����
		set.clear();
		//��� set�����͸� ���
		System.out.println(set);
		System.out.println("set Collection�� �����Ͱ� ����� �ֳ���?"+set);
	}

}
