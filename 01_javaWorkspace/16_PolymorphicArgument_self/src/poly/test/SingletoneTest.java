package poly.test;

class EncoreCompany {
	private String companyName;
	
	//1. static private���� ��ü ����
	static private EncoreCompany encore = new EncoreCompany();
	
	//2. �ٸ� �������� ��ü ���� ����
	private EncoreCompany() {
		companyName = "Encore";
		System.out.println("Company Name ..."+companyName);
	}
	//3. �������� ��ÿ�� �ٸ� ������ ������ �� �� �ֵ��� ����� �ϳ� �������´�.
	public static EncoreCompany getCompany() {
		return encore;
	}
public class SingletoneTest {
	
}
	public static void main(String[] args) {
		
	  EncoreCompany encore1 = EncoreCompany.getCompany();
	  EncoreCompany encore2 = EncoreCompany.getCompany();
	  EncoreCompany encore3= EncoreCompany.getCompany();
	  
	  System.out.println(encore1);
	  System.out.println(encore2);
	  System.out.println(encore3);
	}

}