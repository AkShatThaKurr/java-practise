// Write a program to print first n tems of fibonacci series. (0,1,1,2,3,5,8,13,21,...)
import java.util.Scanner;

public class Java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms to be printed: ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        if(n==1){
            System.out.println(0);
            return;
        }
        int first=0, second=1;
        System.out.print(first + " ");
        for(int i=2; i<=n; i++){
            int temp = second;
            second = first + second;
            first = temp;
            System.out.print(first + " ");
        }
    }
}
