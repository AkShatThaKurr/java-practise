// java.lang.ArithmeticException: / by zero

package exceptionHandling.trycatch;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Before Exception:");
        try{
            System.out.println(10/0);      // Exception
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("After Exception:");
    }
}
