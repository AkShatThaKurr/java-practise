// “Design a class BankAccount that stores account holder name and balance. Initialize them using a constructor and display the account details.”
package methods.consturctors_this;

public class BankAccountQ3 {
    String name;
    double balance;

    BankAccountQ3(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void show() {
        System.out.println("Name: " + this.name);
        System.out.println("Balance: ₹" + this.balance);        // this ruppee symbol has come by pressing (ctrl + alt + 4)
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccountQ3 h1 = new BankAccountQ3("Akshat", 100000);
        BankAccountQ3 h2 = new BankAccountQ3("Abhinav", 250000);
        BankAccountQ3 h3 = new BankAccountQ3("Aditya", 90000);

        h1.show();
        h2.show();
        h3.show();

    }
}
