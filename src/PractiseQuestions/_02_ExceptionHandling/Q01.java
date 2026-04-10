// Q1. Handle divide by zero using try-catch.

package PractiseQuestions._02_ExceptionHandling;

public class Q01 {
    public static void main(String[] args) {
        int num = 10;
        try {
            System.out.println(num / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
