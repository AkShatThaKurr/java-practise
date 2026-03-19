// countDigits(int n) method banao jo digits count kare.
package methods.level5;

import java.util.Scanner;

public class Q3 {
    int countDigits(int n) {
        int temp = n, count = 0;
        if (temp < 0) {
            temp = -temp;
        } else if (temp == 0) {
            return 1;
        }
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.countDigits(num);
        System.out.println("Number of digits are: " + result);

    }
}

