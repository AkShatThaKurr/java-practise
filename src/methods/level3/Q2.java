// isEligible(int age) method banao jo voting eligibility bataye.
package methods.level3;

import java.util.Scanner;

public class Q2 {
    void isEligible(int age) {
        if (age < 1 || age > 100) {
            System.out.println("Invalid input");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        obj.isEligible(age);
    }
}
