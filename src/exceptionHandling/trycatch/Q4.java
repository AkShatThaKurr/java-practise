package exceptionHandling.trycatch;

public class Q4 {
    public static void main(String[] args) {

        try {
            int a = 10 / 0; // Exception yaha aayega

        } catch (Exception e) {

            System.out.println("Using println(e):");
            System.out.println(e);   // toString()

            System.out.println("\nUsing getMessage():");
            System.out.println(e.getMessage());

            System.out.println("\nUsing printStackTrace():");
            e.printStackTrace();
        }
    }
}

/*
Using println(e):
java.lang.ArithmeticException: / by zero

Using getMessage():
/ by zero

Using printStackTrace():
java.lang.ArithmeticException: / by zero
   at exceptionHandling.trycatch.Q4.main(Q4.java:7)
 */