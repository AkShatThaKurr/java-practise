//

package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q3 {

    double area(double r) {
        return (Math.PI * r * r);
    }

    double area(double l, double b) {
        return (l * b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.println("----------Program for Finding Area of different Shapes----------");
        System.out.println("Enter: 1) for Circle, 2) for Rectangle");
        int shape = sc.nextInt();

        // Circle:
        if (shape == 1) {
            System.out.print("Enter the radius of Circle: ");
            double r = sc.nextDouble();
            System.out.println("Area of Circle is: " + obj.area(r));
        }

        // Rectangle:
        else if (shape == 2) {
            System.out.println("Enter Length and Breadth of Rectangle: ");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Area of Rectangle is: " + obj.area(l, b));
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
