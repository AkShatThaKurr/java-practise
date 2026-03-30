//  having throws and throw in same function
package exceptionHandling.throws_;

import java.io.FileNotFoundException;

public class Q2 {
    static void m1() throws FileNotFoundException {
        throw new FileNotFoundException("File missing");
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* Output:
java.io.FileNotFoundException: File missing
	at exceptionHandling.throws_.Q2.m1(Q2.java:10)
	at exceptionHandling.throws_.Q2.main(Q2.java:15)
 */
