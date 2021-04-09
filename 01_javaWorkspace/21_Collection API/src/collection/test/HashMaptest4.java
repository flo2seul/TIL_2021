package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�� �ڽ�Ŭ����...HashMap
 * key-value�� ������ �����ؼ� �����͸� �����ϴ� Ư¡�� ������.
 * key�� �ߺ��� ������� �ʰ� value�� �ߺ� �����ϴ�.
 * ������ ����.
 */
public class HashMaptest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//1.Ű�� �޾ƿ´�.
		System.out.println("===========keyset");
		Set<String> set=map.keySet();
		System.out.println(set);
		
		Iterator<String> it=set.iterator();
		int total = 0;
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name);
			total += score;
		}
		System.out.println("��� ����� ������ ������ "+total+"�� �Դϴ�.");
		System.out.println("���"+total/map.size());
		
		System.out.println("entryset");
		
		System.out.println("values");
		Collections<Integer> col = map.values();
		Iterator<Integer> it2=col.iterator();
		int sum=0;
		while(it2.hasNext()) {
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("��� ����� ������ ������"+sum);
		System.out.println("���" +sum/map.size());
		
		System.out.println("�ְ� ������"+Collections.max(col));
		System.out.println("���� ������"+Collections.min(col));
		
		//2. Ű���� ���鼭
		//3. Ű �� �̰�
		//4. Ű ���� �ش��ϴ� ���� �̰�
		//5. ���������� 

	}

}
