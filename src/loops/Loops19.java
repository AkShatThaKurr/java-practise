package loops;// Write a program to find GCD of two numbers.
import java.util.Scanner;

public class Loops19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1==0 && num2==0){
            System.out.println("GCD Undefined");
            return;
        }
        if(num1==0){
            System.out.println("GCD is " + num2);
            return;
        }
        if(num2==0){
            System.out.println("GCD is " + num1);
            return;
        }
        num1 = Math.abs(num1);      // converts (-ve to positive)
        num2 = Math.abs(num2);      // converts (-ve to positive)

        int min = Math.min(num1,num2);
        for(int i=min; i>=1; i--){
            if(num1%i==0 && num2%i==0){
                System.out.println("GCD is " + i);
                return;
            }
        }

    }

}
