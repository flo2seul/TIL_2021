package boker.twotier.test;

import broker.twotier.dao.Database;
import broker.twotier.vo.CustomerRec;

public class DatabaseTest {

	public static void main(String[] args) throws Exception{
		
		Database db = new Database("127.0.0.1");
		db.addCustomer(new CustomerRec("111-222","Avery","seoul"));
		
	}

}
