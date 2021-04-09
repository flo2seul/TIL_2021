package collection.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map의 자식클래스...HashMap
 * key-value를 쌍으로 연결해서 데이터를 저장하는 특징을 가진다.
 * key는 중복을 허용하지 않고 value는 중복 가능하다.
 * 순서는 없다.
 */
public class HashMaptest4 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//1.키만 받아온다.
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
		System.out.println("모든 사람의 성적의 총합은 "+total+"점 입니다.");
		System.out.println("평균"+total/map.size());
		
		System.out.println("entryset");
		
		System.out.println("values");
		Collections<Integer> col = map.values();
		Iterator<Integer> it2=col.iterator();
		int sum=0;
		while(it2.hasNext()) {
			int jumsu = it2.next();
			sum += jumsu;
		}
		System.out.println("모든 사람의 성적의 총합은"+sum);
		System.out.println("평균" +sum/map.size());
		
		System.out.println("최고 성적은"+Collections.max(col));
		System.out.println("최저 성적은"+Collections.min(col));
		
		//2. 키들을 돌면서
		//3. 키 값 뽑고
		//4. 키 값에 해당하는 점수 뽑고
		//5. 최종적으로 

	}

}
