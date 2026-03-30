package exceptionHandling.trycatch;

public class Q5 {
    static void m5() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println();
            System.out.println();
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println();
            e.printStackTrace();

        }
    }

    static void m4() {
        m5();

    }

    static void m3() {
        m4();
    }

    static void m2() {
        m3();
    }

    static void m1() {
        m2();
    }

    public static void main(String[] args) {
        m1();
    }
}

/* Output:
this is because of sout(e)
java.lang.ArithmeticException: / by zero

this is beccause of sout(e.getMessage())
/ by zero

this is because of e.printStackTrace
java.lang.ArithmeticException: / by zero
	at exceptionHandling.trycatch.Q5.m5(Q5.java:6)
	at exceptionHandling.trycatch.Q5.m4(Q5.java:20)
	at exceptionHandling.trycatch.Q5.m3(Q5.java:25)
	at exceptionHandling.trycatch.Q5.m2(Q5.java:29)
	at exceptionHandling.trycatch.Q5.m1(Q5.java:33)
	at exceptionHandling.trycatch.Q5.main(Q5.java:37)

 */
