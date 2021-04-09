package poly.vo;

public class Engineer extends Employee {
	
	//�ڽĸ��� ��� �߰�
	private String tech;
	private int bonus;

	
	

	public Engineer(String empId, String name, String addr, int salary,String tech,int bonus) {
		super(empId, name, addr, salary);
		this.tech = tech;
		this.bonus =bonus;
	}

	
	
	public void changeTech(String tech) {
		this.tech = tech;
	}

	

	public int getBonus() {
		return bonus;
	}
	
	public String getTech() {
		return tech;
	}
	
	
	  public String toString() {
	  
	  return super.toString()+","+"Engineer [tech=" + tech + ", bonus=" + bonus + "]";
	   }
	

}
