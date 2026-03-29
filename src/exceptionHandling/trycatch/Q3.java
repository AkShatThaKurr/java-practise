// Exception Propagation
package exceptionHandling.trycatch;

public class Q3 {

    static void m5(){
        System.out.println(10/0);
    }
    static void m4(){
        m5();
    }
    static void m3(){
        m4();
    }
    static void m2(){
        m3();
    }
    static void m1(){
        m2();
    }


    public static void main(String[] args) {
        m1();
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionHandling.trycatch.Q3.m5(Q3.java:6)
	at exceptionHandling.trycatch.Q3.m4(Q3.java:9)
	at exceptionHandling.trycatch.Q3.m3(Q3.java:12)
	at exceptionHandling.trycatch.Q3.m2(Q3.java:15)
	at exceptionHandling.trycatch.Q3.m1(Q3.java:18)
	at exceptionHandling.trycatch.Q3.main(Q3.java:23)
 */
