// Program to add two numbers.
import java.util.Scanner;

public class Arithmetic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two no. to find their sum");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b) + ".");
    }
}
