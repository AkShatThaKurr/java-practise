// throw keywork: is used to throw error manually.

package exceptionHandling.trycatch;

public class Q6 {
    static void exception(){


        try{
            throw new ArithmeticException("Divide by zero");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        exception();
    }
}

/*
java.lang.ArithmeticException: Divide by zero
 */
