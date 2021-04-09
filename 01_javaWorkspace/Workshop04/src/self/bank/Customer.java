package self.bank;

public class Customer {
	//Ãß°¡..
	public static final String DEFAULT_NAME = "Encore";
	//public static final Address DEFAULT_ADDR = "¼­¿ï½Ã";
	private String name;
	private int ssn; //°í°´ÀÇ ÁÖ¹Î¹øÈ£	
	private Address address;
	
	private Account account;
	/*
	 * this Å°¿öµå
	 * ::
	 * 1.ÇÊµåÀÇ ÀÌ¸§°ú ·ÎÄÃ º¯¼öÀÇ ÀÌ¸§ÀÌ °°À» ¶§ ±¸ºĞÇÏ±â À§ÇØ¼­ ÇÊµå ¾Õ¿¡ ºÙÀÎ´Ù.
	 * 2.»ı¼ºÀÚ ¾ÕÀÇ this ---this(null, ssn, null);
	 *   °°Àº Å¬·¡½º¿¡¼­ ¶Ç´Ù¸¥ »ı¼ºÀÚ¸¦ È£­Œ
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
