// “Create a class BankAccount with a private variable balance. Use setter to update the balance and getter to print the balance. Create two objects and display
// their balances.”
package accessmodifiers.b_private;

class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}

public class Q2 {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        BankAccount obj2 = new BankAccount();

        obj1.setBalance(50000);
        double result1 = obj1.getBalance();
        System.out.println("Balance1: " + result1);
        System.out.println();

        obj2.setBalance(25000);
        double result2 = obj2.getBalance();
        System.out.println("Balance2: " + result2);

    }
}
