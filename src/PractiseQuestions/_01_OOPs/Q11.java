/*
Create abstract class Vehicle (Car, Bike).
Question: Vehicle Management System

Design an abstract class Vehicle and subclasses Car and Bike. Each vehicle should have a brand, a method to start,
 a method to show its fuel type, and a method to display when it was last serviced. Write a program that lets the
  user choose a vehicle type and brand, then displays its details.
 */
package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q11 {
    abstract public static class Vehicle {
        // variable
        String brand;
        String fType;
        String date;

        // methods
        abstract void start();

        abstract void fuelType();

        abstract void displayServiceDate();
    }

    public static class Car extends Vehicle {
        // constructor
        public Car(String brand, String fType, String date) {
            this.brand = brand;
            this.fType = fType;
            this.date = date;
        }

        // methods
        @Override
        void start() {
            System.out.println("Brand: " + brand);
            System.out.println("The Car has been started.");
        }

        @Override
        void fuelType() {
            System.out.println("The fuel type is " + fType + ".");
        }

        @Override
        void displayServiceDate() {
            System.out.println("Service date is " + date + ".");
        }
    }

    public static class Bike extends Vehicle {
        // constructor
        public Bike(String brand, String fType, String date) {
            this.brand = brand;
            this.fType = fType;
            this.date = date;
        }

        // methods
        @Override
        void start() {
            System.out.println("Brand: " + brand);
            System.out.println("The Bike has been started.");
        }

        @Override
        void fuelType() {
            System.out.println("The fuel type is " + fType + ".");
        }

        @Override
        void displayServiceDate() {
            System.out.println("Service date is " + date + ".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: 1-> Car  2-> Bike");
        int choose = sc.nextInt();
        sc.nextLine();
        if (choose == 1) {
            System.out.print("Enter model: ");
            String brand = sc.nextLine();
            System.out.print("Enter fuel type: ");
            String fType = sc.nextLine();
            System.out.print("Enter last service date: ");
            String date = sc.nextLine();
            Vehicle car = new Car(brand, fType, date);
            System.out.println("----------Car Details----------");
            car.start();
            car.fuelType();
            car.displayServiceDate();
        }
        else if (choose == 2) {
            System.out.print("Enter model: ");
            String brand = sc.nextLine();
            System.out.print("Enter fuel type: ");
            String fType = sc.nextLine();
            System.out.print("Enter last service date: ");
            String date = sc.nextLine();
            Vehicle bike = new Bike(brand, fType, date);
            System.out.println("----------Bike Details----------");
            bike.start();
            bike.fuelType();
            bike.displayServiceDate();
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
