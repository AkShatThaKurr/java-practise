package ifelse;// Simple calculator using if else.
import java.util.Scanner;

public class IfElse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int op;
        System.out.println("Enter any two numbers.");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Choose: 1 for Additino, 2 for Subtraction, 3 for Division and 4 for Multiplication.");
        op = sc.nextInt();
        if(op==1){
            System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1+num2));
        }
        else if(op==2){
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1-num2));
        }
        else if(op==3){
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1/num2));
        }
        else if(op==4){
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        }
        else{
            System.out.println("Invalid input");
        }
    }

}
