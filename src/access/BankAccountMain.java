package access;

public class BankAccountMain {
    public static void main(String[] args) {
         BankAccount account = new BankAccount();
         account.deposit(10000 );
         account.withdraw(1000);
        System.out.println("남은 잔액 : " + account.getBalance());
    }
}
