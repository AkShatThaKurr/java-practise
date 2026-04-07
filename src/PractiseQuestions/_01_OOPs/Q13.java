/*
Question: Demonstrate Runtime Polymorphism using Parent Reference

Write a Java program to demonstrate runtime polymorphism.

Requirements:

1. Create a parent class named Vehicle with a method:
   - void start()

2. Create two subclasses:
   - Car
   - Bike

3. Override the start() method in both subclasses:
   - Car should print: "Car is starting"
   - Bike should print: "Bike is starting"

4. In the main method:

   - Create a reference of type Vehicle
   - Assign it to objects of Car and Bike one by one

   Example:
       Vehicle v;
       v = new Car();
       v.start();

       v = new Bike();
       v.start();

5. Show that the method call is resolved at runtime based on the object type.

Expected Concepts:

- Method overriding
- Inheritance
- Runtime polymorphism
- Dynamic method dispatch
*/


package PractiseQuestions._01_OOPs;

public class Q13 {
    abstract static class Vehicle {
        abstract void start();
    }

    static class Car extends Vehicle {
        void start() {
            System.out.println("Car is starting");
        }
    }

    static class Bike extends Vehicle {
        void start() {
            System.out.println("Bike is starting");
        }
    }

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.start();
        bike.start();
    }
}
