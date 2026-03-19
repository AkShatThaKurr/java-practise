// square(int n) method banao jo square return kare.
package methods.level4;
import java.util.Scanner;

public class Q1 {
    int square(int n){
        return (n * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int result = obj.square(num);
        System.out.println("The square of " + num + " is: " + result);
    }
}
