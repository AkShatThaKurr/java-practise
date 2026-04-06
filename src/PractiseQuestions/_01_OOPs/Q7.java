/*
Question: Implement Hierarchical Inheritance

Q7. Write a Java program to demonstrate hierarchical inheritance using a real-life example of Animal.

Create a class Animal with a method eat().
Create two classes Dog and Cat that extend Animal.
Add method bark() in Dog and meow() in Cat.
In the main method, create objects of both Dog and Cat and call their respective methods.
 */

package PractiseQuestions._01_OOPs;

public class Q7 {
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

    static class Cat extends Animal {
        void meow() {
            System.out.println("Cat is meowing.");
        }
    }

    public static void main(String[] args) {

        Dog obj1 = new Dog();
        obj1.eat();
        obj1.bark();

        System.out.println();

        Cat obj2 = new Cat();
        obj2.eat();
        obj2.meow();
    }
}
