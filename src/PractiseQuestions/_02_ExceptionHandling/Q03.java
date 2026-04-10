// Demonstrate multiple catch blocks.

package PractiseQuestions._02_ExceptionHandling;

public class Q03 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by zero");
        } catch (Exception e) {
            System.out.println("Some other exception.");
        }

    }
}
