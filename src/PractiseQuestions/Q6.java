/*
Question: Implement Multilevel Inheritance

Q6. Write a Java program to demonstrate multilevel inheritance using a real-life example of Animal, Dog, and Puppy.

Create a class Animal with a method eat().
Create a class Dog that extends Animal and adds a method bark().
Create a class Puppy that extends Dog and adds a method weep().
In the main method, create an object of Puppy and call all three methods: eat(), bark(), and weep().
 */

package PractiseQuestions;

public class Q6 {
    static class Animal {
        void eat() {
            System.out.println("Animal is eating food.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking.");
        }
    }

    static class Puppy extends Dog {
        void cry() {
            System.out.println("Puppy is crying.");
        }
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.cry();
    }
}
