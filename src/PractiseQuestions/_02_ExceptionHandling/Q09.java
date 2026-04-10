// Login system (invalid password exception) .

package PractiseQuestions._02_ExceptionHandling;

import java.util.Scanner;

public class Q09 {

    // Custom Exception
    static class InvalidPasswordException extends Exception {
        InvalidPasswordException(String msg) {
            super(msg);
        }
    }

    static void passwordDetail(String id, String pass) throws InvalidPasswordException {

        String username = "Abc";
        String password = "123";

        if (username.equals(id) && password.equals(pass)) {
            System.out.println("Proceeding to Home page...");
        } else {
            throw new InvalidPasswordException("Invalid Username/Password entered!!!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String id = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            passwordDetail(id, pass);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}