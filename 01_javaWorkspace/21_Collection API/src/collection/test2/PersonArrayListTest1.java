package collection.test2;
/*
 * List�ȿ� �������� ����� �߰��ϴ� ������ �ۼ�
 * �߰��ϴ� ����� ������ �ڵ鸵�ϴ� �ݹ��� �������� �ۼ�
 */
public class PersonArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("��ȣ��","���ʵ�", 45));
		list.add(new Person("��ȣ��","���ʵ�", 45));
		list.add(new Person("��ȣ��","���ʵ�", 45));
		list.add(new Person("��ȣ��","���ʵ�", 45));
		list.add(new Person("��ȣ��","���ʵ�", 45));
		
		System.out.println(list);
		
		//1. ����Ʈ�� ����ִ� ����� ����� �� ���
		System.out.println(list.size());
		
		//2. ����Ʈ�� ����� ����� ��� ������ �Է�
		
		
	}

}
