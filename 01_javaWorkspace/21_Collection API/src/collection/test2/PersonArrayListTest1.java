package collection.test2;
/*
 * List안에 여러명의 사람을 추가하는 로직을 작성
 * 추가하는 사람의 정보를 핸들링하는 반법도 로직으로 작성
 */
public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("강호동","서초동", 45));
		list.add(new Person("강호동","서초동", 45));
		list.add(new Person("강호동","서초동", 45));
		list.add(new Person("강호동","서초동", 45));
		list.add(new Person("강호동","서초동", 45));
		
		System.out.println(list);
		
		//1. 리스트에 들어있는 사람이 몇명인 지 출력
		System.out.println(list.size());
		
		//2. 리스트에 저장된 사람의 평균 연령을 입력
		
		
	}

}
