package exceptionHandling.throw_keyword;


public class Q1 {
    static void exception() {


        try {
            throw new ArithmeticException("Divide by zero");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        exception();
    }
}

