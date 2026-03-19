// reverseNumber(int n) method banao jo reverse return kare.
package methods.level5;

import java.util.Scanner;

public class Q4 {
    int reverseNumber(int n) {
        int temp = n, rev = 0;
        int sign = 1;
        if (temp < 0) {
            sign = -1;
        }
        temp = Math.abs(temp);
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return rev * sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 obj = new Q4();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.reverseNumber(num);
        System.out.println("The reverse number is: " + result);
    }
}
