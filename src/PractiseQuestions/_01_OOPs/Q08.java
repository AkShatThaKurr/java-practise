/*  FIRST CHECK IN CHATGPT THAN PUSH IT
📄 Question: Employee → Manager (Method Overriding)

Q8. Write a Java program to demonstrate inheritance and method overriding using a real-life example of Employee and Manager.

Create a class Employee with the following:
Data members: name, salary
A method display() to show employee details
Create a class Manager that extends Employee:
Add an additional data member bonus
Override the display() method to show:
Name
Salary
Bonus
Total salary (salary + bonus)
 */

package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q08 {
    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }

    static class Manager extends Employee {
        double bonus;

        public Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        void display() {
            double totalSalary = salary + bonus;
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Salary : " + totalSalary);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        Manager obj2 = new Manager(name, salary, bonus);


        obj2.display();
        sc.close();
    }
}
