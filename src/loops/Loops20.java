package loops;// Write a program to find LCM of two numbers. (hint: LCM = (num1 * num2)/GCD)
import java.util.Scanner;

public class Loops20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        if(num1==0 && num2==0){
            System.out.println("GCD Undefined");
            return;
        }
        else if(num1==0){
            gcd = num2;
        }
        else if(num2==0){
            gcd = num1;
        }
        else {
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
            int min = Math.min(num1, num2);
            for (int i = min; i >= 1; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    gcd = i;
                    break;
                }
            }
        }
        long lcm = ((long)num1 * num2) / gcd;       // casting of num1
        System.out.println("LCM is: " + lcm);

    }
}
