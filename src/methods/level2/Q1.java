// add(int a, int b) method banao jo sum print kare.
package methods.level2;
import java.util.Scanner;

public class Q1 {
    void add(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.println("Enter value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a,b);
    }
}
