// min(int a, int b) method banao jo smaller number return kare.
package methods.level4;

import java.util.Scanner;

public class Q4 {
    int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 obj = new Q4();
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = obj.min(num1, num2);
        System.out.println("The minimum number is: " + result);
    }
}
