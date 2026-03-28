package OOPsPractise.Q04;

public class Main {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount(50000);
        obj1.deposit(5000);
        obj1.withdraw(3000);
        System.out.println("Balance1: " + obj1.displayBalance());

        System.out.println();

        BankAccount obj2 = new BankAccount(100000);
        obj2.deposit(10000);
        obj2.withdraw(7000);
        System.out.println("Balance2: " + obj2.displayBalance());

    }
}
