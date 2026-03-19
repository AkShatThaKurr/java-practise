// multiply(int a, int b) method banao jo multiplication print kare.
package methods.level2;
import java.util.Scanner;

public class Q2 {
    void multiply(int a, int b){
        int product = a * b;
        System.out.println("The product is: " + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        System.out.println("Enter number to multiply: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.multiply(a,b);
    }
}
