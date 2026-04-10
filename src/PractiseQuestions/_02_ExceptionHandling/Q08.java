// ATM system (throw InsufficientBalanceException).

package PractiseQuestions._02_ExceptionHandling;

public class Q08 {
    static public class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 5005;
        try {
            if (withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("Updated balance: " + balance);
            } else {
                throw new InsufficientBalanceException("InsufficientBalance in account");
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
