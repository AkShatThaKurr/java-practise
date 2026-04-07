/*
Question: Create Payment interface with UPI and Card implementation

Q. Write a Java program to demonstrate the use of interface and its implementation using a real-life example of payment methods.

Requirements:

Create an interface Payment with a method pay(double amount).
Create two classes UPIPayment and CardPayment that implement the Payment interface.
UPIPayment should simulate paying via UPI.
CardPayment should simulate paying via Card.
In the main method, create objects of both classes and call the pay() method.

Expected Output Example:

Paid 500.0 via UPI
Paid 1500.0 via Card
 */
package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q9 {
    interface Payment {
        void pay(double amount);
    }

    static class UPIPayment implements Payment {
        // double amount;
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via UPI.");
        }
    }

    static class CardPayment implements Payment {
        // double amount;
        public void pay(double amount) {
            System.out.println("Paid " + amount + " via Card.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount1;
        double amount2;

        System.out.print("Enter amount to be debited by UPI: ");
        amount1 = sc.nextDouble();

        System.out.print("Enter amount to be debited by Card: ");
        amount2 = sc.nextDouble();

        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        upi.pay(amount1);
        card.pay(amount2);


    }
}
