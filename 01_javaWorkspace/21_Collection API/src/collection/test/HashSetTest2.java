package collection.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Set의 자식 클래스...HashSet
 * 1. 중복 혀용 안함
 * 2. 순서를 가지지 않는다.
 */
public class HashSetTest2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("장도연");
		set.add("박나래");
		set.add("강유미");
		set.add("안영미");
		set.add("송은이");
		set.add("장도연");//중복
		
		System.out.println(set.size());//5
		//Collection API는 자체적으로 toString()이 오버라이딩 되어져 있다...데이터 출력된다.
		System.out.println(set.toString());
		boolean flag=set.contains("홍현화");
		System.out.println("홍현화가 포함 돼있나요?"+flag);
		System.out.println("set Collection에 데이터가 비어져 있나요?"+ set.isEmpty());
		
		//박나래를 삭제
		set.remove("박나래");
		//모든 set데이터 출력
		System.out.println(set);
		//모든 데이터를 삭제
		set.clear();
		//모든 set데이터를 출력
		System.out.println(set);
		System.out.println("set Collection에 데이터가 비어져 있나요?"+set);
	}

}
