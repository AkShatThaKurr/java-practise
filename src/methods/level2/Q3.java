// printSumOfThree(int a, int b, int c) method banao jo 3 numbers ka sum print kare.
package methods.level2;
import java.util.Scanner;
public class Q3 {
    void printSumOfThree(int a, int b, int c){
        int sum = a + b + c ;
        System.out.println("The sum of three is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.println("Enter three numbers to find their sum: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        obj.printSumOfThree(a,b,c);
    }
}
