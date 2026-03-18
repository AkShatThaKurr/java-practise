package loops;// Write a program to find factorial of a number.
import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial.");
        int num = sc.nextInt();
        long fact=1;
        if(num<0){
            System.out.println("Invalid input");
            return;
        }
        else if(num==0 || num==1){
            System.out.println("Factorial is: " + 1);
            return;
            }
        else{
            for(int i=2; i<=num; i++){
                fact= fact * i;
            }
        }
        System.out.println("Factorial is: " + fact);
    }
}
