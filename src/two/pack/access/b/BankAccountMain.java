package two.pack.access.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(2000);
        int balance = bankAccount.getBalance();
        System.out.println("balance = " + balance);
    }
}
