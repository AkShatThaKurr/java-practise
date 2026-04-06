// Q2. Use constructor to initialize object values.

package PractiseQuestions._01_OOPs;

import java.util.Scanner;
import java.util.ArrayList;

public class Q2 {
    public static class Car {
        String brand;
        String model;
        String color;
        long price;

        public Car(String brand, String model, String color, long price) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.price = price;
        }

        void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("Price: " + price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> al = new ArrayList<>();
        System.out.print("Enter number of Cars: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("----------Enter Details of Car" + (i + 1) + "----------");
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter Model: ");
            String model = sc.nextLine();
            System.out.print("Enter Color:");
            String color = sc.nextLine();
            System.out.print("Enter Price:");
            long price = sc.nextLong();
            sc.nextLine();
            al.add(new Car(brand, model, color, price));
        }
        System.out.println("----------All Cars Details----------");
        for (Car c : al) {
            c.display();
        }

    }
}
