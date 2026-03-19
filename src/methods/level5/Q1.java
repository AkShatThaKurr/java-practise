// sumTillN(int n) method banao jo 1 se n tak ka sum return kare.
package methods.level5;

import java.util.Scanner;

public class Q1 {
    int sumTillN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.sumTillN(num);
        System.out.println("Sum till " + num + " is: " + result);

    }
}
