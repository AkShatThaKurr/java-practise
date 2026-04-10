// Demonstrate throw keyword.

package PractiseQuestions._02_ExceptionHandling;

public class Q05 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException(("Error"));
        } catch (ArithmeticException e) {
            System.out.println("Error handled");
        }
        System.out.println("After catch");
        System.out.println();
        int age = 13;
        if (age < 18) {
            throw new ArithmeticException(("Not allowed"));
        }
        // this line will not execute
        System.out.println("after throw next line does not executes.");
    }
}

//Output:
// Error handled
//After catch
//
//Exception in thread "main" java.lang.ArithmeticException: Not allowed
//	at PractiseQuestions._02_ExceptionHandling.Q05.main(Q05.java:18)
