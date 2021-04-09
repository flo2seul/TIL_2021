package collection.sort.test;
/*
 * Arrays.sort([]) sort()는 comparable에 의해서 정렬된 것이다.
 * Arrays.sort(arraylist)는 안돌아간다.
 * 이번 예제에서는 Comparable을 사용해서 ArrayList안에 들어있는 객체들을 특정한 값에 의해서 정렬해보겠다.
 * 
 * 1. Comparable을 직접 상속받아서 구현하는 방법...compareTo를 정렬하고픈 필드(나이순, 이름순)구현
 */
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
public class ComparableTest1 {

	public static void main(String[] args) {
		
	}

}
