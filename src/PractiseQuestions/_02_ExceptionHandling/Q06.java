// Demonstrate throws keyword.
// throws keyword declares that the exception might occur .

package PractiseQuestions._02_ExceptionHandling;

public class Q06 {
    static void test(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException(("Not allowed"));
        }
    }

    public static void main(String[] args) {
        try {
            test(12);
        } catch (ArithmeticException e) {
            System.out.println("Handled in Main using try catch");
        }
    }
}
