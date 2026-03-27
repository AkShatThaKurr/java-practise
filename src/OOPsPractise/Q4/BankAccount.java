/*
Bank Account
Class BankAccount with private balance.
Add methods: deposit(), withdraw().
Withdraw should not allow negative balance.
Add a displayBalance() method
 */
package OOPsPractise.Q4;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount: " + amount + " credited to your account.");
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Amount: " + amount + " debited from your account.");
        }
        else{
            System.out.println("Insufficient balance!");
        }

    }

    double displayBalance(){
        return balance;
    }
}
