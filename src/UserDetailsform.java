import java.util.Scanner;

public class UserDetailsform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please fill the below details:");
        String fname, email, qual;
        long phno;
        int age;
        float exp;
        double salary;
        boolean relocate;

        System.out.print("Full Name:");
        fname = sc.nextLine();

        System.out.print("Email address:");
        email = sc.nextLine();

        System.out.print("Phone number:");
        phno = sc.nextLong();

        System.out.print("Age:");
        age = sc.nextInt();

        System.out.print("Expected Salary:");
        salary = sc.nextDouble();

        System.out.print("Years of experience:");
        exp = sc.nextFloat();

        sc.nextLine();      // clears buffer

        System.out.print("Highest Qualification:");
        qual = sc.nextLine();

        System.out.print("Are you willing to relocate? Say true or false:");
        relocate = sc.nextBoolean();

        System.out.println("\n-------Details-------");
        System.out.println(fname);
        System.out.println(email);
        System.out.println(phno);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(exp);
        System.out.println(qual);
        System.out.println(relocate);
    }
}
