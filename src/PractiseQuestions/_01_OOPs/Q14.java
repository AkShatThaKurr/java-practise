/*
Question: Demonstrate Encapsulation using Getter and Setter Methods

Write a Java program to demonstrate encapsulation.

Requirements:

1. Create a class named Student with:
   - private fields:
       name (String)
       age (int)

2. Provide public getter and setter methods:
   - setName(String name)
   - getName()
   - setAge(int age)
   - getAge()

3. Apply validation:
   - Age should be greater than 0
   - If invalid age is entered, print "Invalid age"

4. In the main method:

   - Create an object of Student
   - Set values using setter methods
   - Retrieve and display values using getter methods

Expected Concepts:

- Encapsulation
- Data hiding (private variables)
- Getter and Setter methods
- Basic validation logic
*/

package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q14 {
    public static class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age");
            }
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        System.out.println();
        if (s.getAge() > 0) {
            System.out.print("Name--> " + s.getName() + "    Age---> " + s.getAge());
        }

    }
}
