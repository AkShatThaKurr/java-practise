package arithmetic;// Program to Subtract two numbers.
import java.util.Scanner;

public class Arithmetic02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a,b;
            System.out.println("Enter two no. to find their difference");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("The difference of " + a + " and " + b + " is " + (a-b) + ".");
        }
    }

