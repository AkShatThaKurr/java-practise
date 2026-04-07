/*
Question: Implement Single Inheritance

Q5. Write a Java program to demonstrate single inheritance using a real-life example of Animal and Dog.

Create a class Animal with a method eat().
Create a class Dog that extends Animal and adds a method bark().
In the main method, create an object of Dog and call both eat() and bark() methods.
 */

package PractiseQuestions._01_OOPs;

public class Q05 {
    static class Animal

    {
        void eat () {
        System.out.println("Animal is eating food.");
    }
    }

    static class Dog extends

    Animal {
        void bark () {
            System.out.println("Dog is Barking.");
        }
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();


    }
}
