// Create custom exception (InvalidAgeException).

package PractiseQuestions._02_ExceptionHandling;

import java.util.Scanner;

public class Q07 {
    // Most imp line: for creating your custom exception
    static class InvalidAgeException extends Exception {
        InvalidAgeException(String msg) {
            super(msg);
        }
    }

    public static void main(String[] args) {
        int age = 14;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age");
            } else {
                System.out.println("You are " + age + " years old.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
