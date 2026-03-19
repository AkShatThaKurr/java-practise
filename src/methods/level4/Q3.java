// max(int a, int b) method banao jo greater number return kare.
package methods.level4;
import java.util.Scanner;

public class Q3 {
    int max(int a, int b){
        return (Math.max(a,b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = obj.max(num1, num2);
        System.out.println("The max value is: " + result);
    }
}
