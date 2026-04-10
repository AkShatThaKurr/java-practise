/* Q04. Demonstrate finally block.
try always executes,
catch executes only if exception occurs,
finally executes no matter what.
 */
package PractiseQuestions._02_ExceptionHandling;

public class Q04 {
    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Catch runs");
        } finally {
            System.out.println("Finally runs");
        }

        System.out.println();
        System.out.println();
        // try 2
        try {
            System.out.println("Try runs");
        }
        catch(Exception e){
            System.out.println("Catch runs");
        }
        finally {
            System.out.println("Finally runs");
        }
    }

}
