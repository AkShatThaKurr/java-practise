package loops;// Write a program to check Armstrong number.
import java.util.Scanner;

public class Loops16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(num + " is not an Armstrong number.");
            return;
        }
        else if(num==0){
            System.out.println(num + " is an Armstrong number.");
        }
        else {
            int temp = num, count = 0;
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
            temp = num;
            double sum = 0;           // why double? because Math.pow function return double value.
            for (int i = 1; i <= count; i++) {
                int digit = temp % 10;
                temp = temp / 10;
                sum = sum + (Math.pow(digit, count));
            }
            if (num == sum) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }

    }
}
