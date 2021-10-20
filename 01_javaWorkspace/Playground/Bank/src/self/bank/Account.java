package self.bank;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money){

        System.out.println(money+"원을 입금하셨습니다.");
        balance += money;
        System.out.println("현재 잔액은" +balance +"입니다.");

    }
    public void withdraw(int money){
        System.out.println(money+"원을 인출합니다.");
        if(balance < money){
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 잔액은" +balance +"입니다.");
        }else{
            balance -= money;
            System.out.println("현재 잔액은" +balance +"입니다.");
        }


    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
