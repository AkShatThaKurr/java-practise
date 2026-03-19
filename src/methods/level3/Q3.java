// checkPositiveNegativeZero(int n) method banao.
package methods.level3;

import java.util.Scanner;

public class Q3 {
    void checkPositiveNegativeZero(int n) {
        if (n < 0) {
            System.out.println(n + " is negative.");
        } else if (n == 0) {
            System.out.println(n + " is zero.");
        } else {
            System.out.println(n + " is positive.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        obj.checkPositiveNegativeZero(num);
    }
}
