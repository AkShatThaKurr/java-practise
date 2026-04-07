// Q4. Demonstrate method overriding(Finding Area of shapes) .
package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q04 {
    abstract public static class Shape {
        abstract double area();
    }

    public static class Rect extends Shape {
        double l, b;

        public Rect(double l, double b) {
            this.l = l;
            this.b = b;
        }

        @Override
        double area() {
            return (l * b);
        }
    }

    public static class Circle extends Shape {
        double r;

        public Circle(double r) {
            this.r = r;
        }

        @Override
        double area() {
            return (Math.PI * r * r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, b, r;
        System.out.println("Enter length and breadth");
        l = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter radius:");
        r = sc.nextDouble();
        sc.close();
        Shape obj1 = new Rect(l, b);
        Shape obj2 = new Circle(r);
        System.out.println("Area of Rectangle is " + obj1.area() + ", and Area of Circle is " + obj2.area() + ".");
    }
}
