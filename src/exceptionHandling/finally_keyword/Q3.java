// System.exit(0); is the only case when the finally will not run as the system is forced to exit.

package exceptionHandling.finally_keyword;

public class Q3 {
    static void m1() {
        try {
            System.out.println("In try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }
    }

    public static void main(String[] args) {
        m1();
    }
}
