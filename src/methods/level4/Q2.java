// cube(int n) method banao jo cube return kare.
package methods.level4;

import java.util.Scanner;

public class Q2 {
    int cube(int n) {
        return (n * n * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int result = obj.cube(num);
        System.out.println("The cube of " + num + " is: " + result);
    }

}
