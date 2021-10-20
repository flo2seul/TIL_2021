package self.bank;

public class BankService {
    public static final int MAX_CUSTOMERS = 100;
    public Customer[] customers;
    public int numberOfCustomers;

    private static BankService bank = new BankService();

    private BankService() {
        customers = new Customer[MAX_CUSTOMERS];
        numberOfCustomers = 0;
    }

    public static BankService getInstance() {
        return bank;
    }

    public void addCustomer(Customer customer) {
        if (numberOfCustomers == MAX_CUSTOMERS) {
            System.out.println("더이상 고객을 등록할 수 없습니다.");
            return;
        }
        customers[numberOfCustomers++] = customer;
    }

    public Customer getCustomer(int ssn) {
        Customer customer = null;

        for (int i = 0; i < numberOfCustomers; i++) {
            if (customers[i].getSsn() == ssn) {
                customer = customers[i];
            }
        }
            return customer;

    }

    public void showAll() {
        if (numberOfCustomers == 0) {
            System.out.println("고객이 없습니다.");
            return;
        }
        for (int i = 0; i < numberOfCustomers; i++) {
            System.out.println(customers[i].getAccount());
        }
    }


}
