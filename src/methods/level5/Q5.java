// isPalindrome(int n) method banao jo palindrome check kare.
package methods.level5;

import java.util.Scanner;

public class Q5 {
    boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        if (n < 0) {
            return false;
        }

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        return (rev == n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5 obj = new Q5();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = obj.isPalindrome(num);
        if (result) {
            System.out.println("Yes, number is Palindrome.");
        } else {
            System.out.println("No, number is not Palindrome.");
        }
    }
}
