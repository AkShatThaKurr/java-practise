// Login System (username + password check)
import java.util.Scanner;

public class IfElse15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, correctUser = "Akshat";
        int pass, correctPass = 12345;
        System.out.print("Enter Username: ");
        username = sc.nextLine();
        System.out.print("Verify Password: ");
        pass = sc.nextInt();
        if(correctUser.equals(username) && correctPass==pass){
            System.out.println("Welcome to the System!!!");
        }
        else{
            System.out.println("Username or Password incorrect");
        }
    }
}
