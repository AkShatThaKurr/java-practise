// greatestOfThree(int a, int b, int c) method banao.
package methods.level3;

import java.util.Scanner;

public class Q4 {
    void greatestOfThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is greatest.");
        } else if (b>=a && b >= c) {
            System.out.println(b + " is greatest.");
        } else {
            System.out.println(c + " is greatest.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 obj = new Q4();
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        obj.greatestOfThree(num1, num2, num3);
    }
}
