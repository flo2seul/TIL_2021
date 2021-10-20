package self.test;

import java.util.Scanner;
import self.bank.Account;
import self.bank.Address;
import self.bank.BankService;
import self.bank.Customer;

public class BankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    public static void addCustomer(){
        System.out.println("고객님의 이름과 주민번호 그리고 주소를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("주민번호");
        int ssn = scanner.nextInt();
        System.out.println("zipcode");
        int zipCode = scanner.nextInt();
        System.out.println("지역(국가,도시)");
        String region = scanner.next();
        String city = scanner.next();

        Customer customer = new Customer(name, ssn, new Address(zipCode,region,city));

        BankService.getInstance().addCustomer(customer);

        System.out.println(name+"님 등록이 완료되었습니다.");



    }
}
