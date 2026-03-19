// table(int n) method banao jo kisi number ka table print kare .
package methods.level2;
import java.util.Scanner;

public class Q4 {
    void table(int n){
        System.out.println("The table of " + n + " is:");
        for(int i=1; i<=10; i++){
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q4 obj = new Q4();
        System.out.print("Enter a number of which table you want to print: ");
        int num = sc.nextInt();
        obj.table(num);
    }
}
