// Write a program to use concept of classes for making banking system.
import java.util.Scanner;

class Account{
    String name;
    double balance;

    void deposit(double amount){
        balance = balance + amount;
        System.out.println(name + ", you have been credited " + amount + " and now your total balance is " + balance + ".");
    }
    void withdrawal(double amount){
        balance = balance - amount;
        System.out.println(name + ", you have been debited " + amount + " and now your total balance is " + balance + ".");
    }

}

public class Classes {
    public static void main(String[] args) {
        Account myAccount = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        myAccount.name = sc.nextLine();
        System.out.print("Enter your account balance: ");
        myAccount.balance = sc.nextDouble();
        System.out.println("Enter: (1) If you want to deposit money, (2) If you want to withdraw money.");
        int input = sc.nextInt();
        double amount=0;
        if(input==1){
            System.out.print("Enter amount how much you want to deposit: ");
            amount = sc.nextDouble();
            myAccount.deposit(amount);

        }
        else if(input==2){
            System.out.print("Enter amount how much you want to withdraw: ");
            amount = sc.nextDouble();
            if(amount>myAccount.balance){
                System.out.println("Insufficient funds");
            }
            else {
                myAccount.withdrawal(amount);

            }
        }
        else{
            System.out.println("Invalid input.");
        }
    }
}
