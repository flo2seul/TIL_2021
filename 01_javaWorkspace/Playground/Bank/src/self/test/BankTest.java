package self.test;

import java.util.Scanner;
import self.bank.Account;
import self.bank.Address;
import self.bank.BankService;
import self.bank.Customer;

public class BankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BankService bank = BankService.getInstance();
        while(true) {
            System.out.println("1.고객 등록    2.계좌생성    3.은행업무    4.고객전체명단    5.특정고객정보    6.나가기");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    addCustomer();
                    break;

                case 2:
                    createAccount();
                    break;

                case 3:
                    banking();
                    break;
                case 4:
                    BankService.getInstance().showAll();
                    break;
                case 5:
                    showCustomer();
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못 누르셨습니다.");
                    break;
            }
        }


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
    public static void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("초기에 입금할 금액을 작성해주세요.");
        int balance = scanner.nextInt();

        Account account = new Account(balance);
        account.deposit(balance);
        System.out.println("계좌가 생성되었습니다.");


    }
    public static void showCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("조회할 고객의 주민번호를 입력하세요.");
        int ssn = scanner.nextInt();
        if(BankService.getInstance().getCustomer(ssn).getName() != ""){
            System.out.println(BankService.getInstance().getCustomer(ssn).toString());

        }else{
            System.out.println("해당 고객이 존재하지 않습니다.");

        }


    }
    public static void banking(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("고객명을 입력하세요.");

        System.out.println("1. 입금  2. 출금 3. 이전으로");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("입금할 금액을 입력하세요.");
                int money = scanner.nextInt();

                break;
            case 2:
                break;
            case 3:
                break;

        }

    } public static void deposit(){

    } public static void withdraw(){

    } public static void showBalance(){

    }
}
