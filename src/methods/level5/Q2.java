// factorial(int n) method banao jo factorial return kare.
package methods.level5;

import java.util.Scanner;

public class Q2 {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid input");
            return;
        }
        int result = obj.factorial(num);
        System.out.println("The factorial is: " + result);
    }
}
