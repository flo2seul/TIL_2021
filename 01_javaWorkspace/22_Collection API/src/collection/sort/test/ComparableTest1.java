package collection.sort.test;
/*
 * Arrays.sort([]) sort()�� comparable�� ���ؼ� ���ĵ� ���̴�.
 * Arrays.sort(arraylist)�� �ȵ��ư���.
 * �̹� ���������� Comparable�� ����ؼ� ArrayList�ȿ� ����ִ� ��ü���� Ư���� ���� ���ؼ� �����غ��ڴ�.
 * 
 * 1. Comparable�� ���� ��ӹ޾Ƽ� �����ϴ� ���...compareTo�� �����ϰ��� �ʵ�(���̼�, �̸���)����
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
