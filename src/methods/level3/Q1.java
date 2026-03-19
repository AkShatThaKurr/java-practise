// checkEvenOdd(int n) method banao jo number even ya odd bataye.
package methods.level3;
import java.util.Scanner;

public class Q1 {
    void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println(n + " is even.");
        }
        else{
            System.out.println(n + " is odd.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        obj.checkEvenOdd(num);
    }
}
