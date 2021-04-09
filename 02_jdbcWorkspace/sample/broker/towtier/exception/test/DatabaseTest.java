package broker.towtier.exception.test;

import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;

public class DatabaseTest {

	public static void main(String[] args)throws Exception {
		
		Database db = new Database("127.0.0.1");
		//db.addCustomer(new CustomerRec(null, null, null));
		//db.deleteCustomer(null);
		//db.updateCustomer(new CustomerRec("000-000", "하바리", "약수동"));
		
	    //Vector<SharesRec> v = db.getPortfolio("777-777");
		//for(SharesRec sr : v)System.out.println(v);
	}

}
