package self.bank;

public class Customer {
	//�߰�..
	public static final String DEFAULT_NAME = "Encore";
	//public static final Address DEFAULT_ADDR = "�����";
	private String name;
	private int ssn; //���� �ֹι�ȣ	
	private Address address;
	
	private Account account;
	/*
	 * this Ű����
	 * ::
	 * 1.�ʵ��� �̸��� ���� ������ �̸��� ���� �� �����ϱ� ���ؼ� �ʵ� �տ� ���δ�.
	 * 2.������ ���� this ---this(null, ssn, null);
	 *   ���� Ŭ�������� �Ǵٸ� �����ڸ� ȣ��
	 */

	public Customer(int ssn) {
	
		this(DEFAULT_NAME, ssn, null);
	}

	public Customer(String name, int ssn, Address address) {
		
		this(name, ssn, address, null);
	}

	public Customer(String name, int ssn, Address address, Account account) {
		
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String getInfo() {
		return name+","+address;
	}	
}
