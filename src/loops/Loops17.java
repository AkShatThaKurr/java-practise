package loops;// Write a program to check prime number.
import java.util.Scanner;

public class Loops17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println(num + " is not Prime.");
            return;
        }
        else if(num==2){
            System.out.println(num + " is Prime.");
            return;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println(num + " is not Prime.");
                return;
            }
        }
        System.out.println(num + " is Prime.");
    }
}
