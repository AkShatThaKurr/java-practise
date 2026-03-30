// the finally block will be executed at all cost, even the catch has executed .

package exceptionHandling.finally_keyword;

public class Q1 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try");
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch");
        } finally {
            System.out.println("Inside finally");
        }
    }
}
